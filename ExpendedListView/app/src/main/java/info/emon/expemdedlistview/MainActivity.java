package info.emon.expemdedlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private customAdapter customAdapter;
    private int lastExpendedPosition = -1;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChaild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareListData();
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListID);
        customAdapter = new customAdapter(this,listDataHeader,listDataChaild);
        expandableListView.setAdapter(customAdapter);

        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View view , int groupPosition, long id) {
                String groupName = listDataHeader.get(groupPosition);
                Toast.makeText(getApplicationContext(),"Group Naame : "+groupName,Toast.LENGTH_SHORT).show();


                return false;
            }
        });
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {


                String groupName = listDataHeader.get(groupPosition);
                Toast.makeText(getApplicationContext(),groupName+" Is Colleaps ",Toast.LENGTH_SHORT).show();


            }
        });
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                String chaildString = listDataChaild.get(listDataHeader.get(groupPosition)).get(childPosition);
                Toast.makeText(getApplicationContext(),chaildString,Toast.LENGTH_SHORT).show();

                return false;
            }
        });
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if(lastExpendedPosition != -1 &&  lastExpendedPosition != groupPosition)
                {
                    expandableListView.collapseGroup(lastExpendedPosition);
                }
                lastExpendedPosition = groupPosition;

            }
        });

    }
    public void prepareListData()
    {
        // use another technic so comment
        //String [] headerString = getResources().getStringArray(R.array.country_name_header);
        //String [] chaildString = getResources().getStringArray(R.array.country_name_chaild);

        listDataHeader = new ArrayList<>();
        listDataChaild = new HashMap<>();
        /* use another technic so comment*/
        /*for (int i=0;i<headerString.length;i++)
        {
            //adding header data
            listDataHeader.add(headerString[i]);
            //adding chaild list

            List<String> chaild = new ArrayList<>();
            chaild.add(chaildString[i]);

            //adding chaild data with header

            listDataChaild.put(listDataHeader.get(i),chaild);

        }*/
        //1st data header
        listDataHeader.add("1. C Language  ");
        List<String>cLanguage = new ArrayList<>();
        cLanguage.add("1.1 What is C Language ");
        cLanguage.add("1.2 History of C Language  ");
        cLanguage.add("1.3 Feature of  C Language ");
        cLanguage.add("1.4 Advantage of  C Language ");
        //added to menu
        listDataChaild.put(listDataHeader.get(0),cLanguage);
        //2nd data header
        listDataHeader.add("2. Java Language   ");
        List<String>java = new ArrayList<>();
        java.add("2.1 What is Java Language ");
        java.add("2.2 History of Java Language  ");
        java.add("2.3 Feature of  Java Language ");
        java.add("2.4 Advantage of  Java Language ");
        //added to menu
        listDataChaild.put(listDataHeader.get(1),java);







    }
}
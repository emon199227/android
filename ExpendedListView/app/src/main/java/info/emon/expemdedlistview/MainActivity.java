package info.emon.expemdedlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;
    private customAdapter customAdapter;

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

    }
    public void prepareListData()
    {
        String [] headerString = getResources().getStringArray(R.array.country_name_header);
        String [] chaildString = getResources().getStringArray(R.array.country_name_chaild);

        listDataHeader = new ArrayList<>();
        listDataChaild = new HashMap<>();
        for (int i=0;i<headerString.length;i++)
        {
            //adding header data
            listDataHeader.add(headerString[i]);
            //adding chaild list

            List<String> chaild = new ArrayList<>();
            chaild.add(chaildString[i]);

            //adding chaild data with header

            listDataChaild.put(listDataHeader.get(i),chaild);

        }
    }
}
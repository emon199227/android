package info.emon.myfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] name = {"Aminul","Joy","Shuvo","Emon","Abir","Jannat","Shovon","lima","Rana","Liza","Sohel","Sanita","Bristi","Sazzad","Munsur"};

        listView = (ListView) findViewById(R.id.listViewID);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fragment fragment;

        if(position==0)
        {
            //one way to call
            fragment = new AminulFragment();
            FragmentManager fragmentManager = getFragmentManager();
            //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.faragmentID,fragment);
            fragmentTransaction.commit();

        }
        else if(position==1)
        {
            //2nd way to call
            fragment = new JoyFragment();
            getFragmentManager().beginTransaction().replace(R.id.faragmentID,fragment).commit();
        }

    }
}
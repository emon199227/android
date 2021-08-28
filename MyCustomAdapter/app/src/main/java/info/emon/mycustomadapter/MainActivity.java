package info.emon.mycustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countryName;
    int [] flags ={R.drawable.australia,R.drawable.austraria,R.drawable.belgium,R.drawable.bangladesh,R.drawable.brazil,R.drawable.canada,R.drawable.china,R.drawable.denmark,R.drawable.france,R.drawable.germany,R.drawable.hong_kong,R.drawable.india,R.drawable.indonesia,R.drawable.italy,R.drawable.korea,R.drawable.netherlands,
            R.drawable.norway,R.drawable.portugal,R.drawable.singapore,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,R.drawable.taiwan,R.drawable.united_kingdom,R.drawable.united_states};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryName = getResources().getStringArray(R.array.country_name);
        listView = (ListView)findViewById(R.id.listViewId);
        customAdapter adapter = new customAdapter(this,countryName,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryName[position];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

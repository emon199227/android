package info.emon.myspinner_with_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private String[] country_names;
    private String[] population;

    int [] flags ={R.drawable.australia,R.drawable.austraria,R.drawable.belgium,R.drawable.bangladesh,R.drawable.brazil,R.drawable.canada,R.drawable.china,R.drawable.denmark,R.drawable.france,R.drawable.germany,R.drawable.hong_kong,R.drawable.india,R.drawable.indonesia,R.drawable.italy,R.drawable.korea,R.drawable.netherlands,
            R.drawable.norway,R.drawable.portugal,R.drawable.singapore,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,
            R.drawable.taiwan,R.drawable.united_kingdom,R.drawable.united_states};
    private boolean isFirstselection=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         spinner = (Spinner) findViewById(R.id.spinnerID);

        String[] countrNames = getResources().getStringArray(R.array.country_names);
        String[] population = getResources().getStringArray(R.array.population);

        CustomAdapter customadapter  = new CustomAdapter (this,flags, countrNames, population);
        spinner.setAdapter(customadapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(isFirstselection==true){
                    isFirstselection=false;
                }else
                {
                    Toast.makeText(getApplicationContext(),countrNames[i] + " is Selected ",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
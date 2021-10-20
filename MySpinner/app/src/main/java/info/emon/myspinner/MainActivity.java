package info.emon.myspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Spinner spinner;
    private Button button;
    private TextView textView;
    String [] countryNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinnerID);
        button = (Button) findViewById(R.id.buttonID);
        textView = (TextView) findViewById(R.id.textViewID);

        countryNames = getResources().getStringArray(R.array.country_name);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewSampleID,countryNames);
        spinner.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = spinner.getSelectedItem().toString();
                textView.setText(value);
            }
        });

    }
}
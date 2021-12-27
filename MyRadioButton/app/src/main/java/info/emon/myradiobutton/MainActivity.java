package info.emon.myradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button show;
    private RadioButton gender;
    private TextView resultTxtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroupId);
        show=(Button)findViewById(R.id.btnshowme);
        resultTxtview=(TextView)findViewById(R.id.textviewResult);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int selectedId=  radioGroup.getCheckedRadioButtonId();
              gender=(RadioButton)findViewById(selectedId);
              String value=gender.getText().toString();
              resultTxtview.setText("You Have Selected : "+value);
            }
        });
    }
}
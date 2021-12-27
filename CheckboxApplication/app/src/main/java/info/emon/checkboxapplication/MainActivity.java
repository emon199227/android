package info.emon.checkboxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milk,sugar,water;
    private Button show_btn;
    private TextView show_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milk=(CheckBox)findViewById(R.id.milk_chkbox);
        sugar=(CheckBox)findViewById(R.id.sugar_chek);
        water=(CheckBox)findViewById(R.id.water_chkr);
        show_btn=(Button)findViewById(R.id.btn_show_me);
        show_txt=(TextView)findViewById(R.id.result_txt_iew);
        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if(milk.isChecked()){
                    String value=milk.getText().toString();
                    stringBuilder.append(value+" is Order \n");
                }
                if(sugar.isChecked()){
                    String value=sugar.getText().toString();
                    stringBuilder.append(value+" is Order \n");
                }
                if(water.isChecked()){
                    String value=water.getText().toString();
                    stringBuilder.append(value+" is Order \n");
                }
                show_txt.setText(stringBuilder);

            }
        });
    }
}
package info.emon.edittextcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView result;
    private Button add_btn,sub_btn,mul_btn,dib_btn;
    private EditText num_text_1,num_text_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num_text_1=(EditText) findViewById(R.id.text1stinput);
        num_text_2=(EditText) findViewById(R.id.text2ndinput);
        result=(TextView)findViewById(R.id.resultid);
        add_btn=(Button)findViewById(R.id.add_calculate);
        sub_btn=(Button)findViewById(R.id.sub_calculate);
        mul_btn=(Button)findViewById(R.id.mul_calculate);
        dib_btn=(Button)findViewById(R.id.dib_calculate);

        add_btn.setOnClickListener(this);
        sub_btn.setOnClickListener(this);
        mul_btn.setOnClickListener(this);
        dib_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //Try catch use for when we are try to click button without input then apps intterupted but now this problem solve
        try {
            String number1=num_text_1.getText().toString();
            String number2=num_text_2.getText().toString();

            //convert

            double num1=Double.parseDouble(number1);
            double num2=Double.parseDouble(number2);


            if(view.getId()==R.id.add_calculate){
                double sum = num1+num2;
                result.setText(" Sum of Result  "+sum);

            }
            if(view.getId()==R.id.sub_calculate){
                double sub = num1-num2;
                result.setText(" Sub of Result  "+sub);

            }
            if(view.getId()==R.id.mul_calculate){
                double mul = num1*num2;
                result.setText(" Multipl of Result  "+mul);

            }
            if(view.getId()==R.id.dib_calculate){
                double dib = num1/num2;
                result.setText(" Division of Result  "+dib);

            }


        }catch(Exception e){
            Toast.makeText(MainActivity.this,"Please Enter Numbers : : ",Toast.LENGTH_SHORT).show();

            }
        }
    }

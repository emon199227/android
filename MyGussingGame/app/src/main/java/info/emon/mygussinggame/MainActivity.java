package info.emon.mygussinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edit_txt;
    private Button btn_chk;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_txt=(EditText)findViewById(R.id.textinputId);
        btn_chk=(Button)findViewById(R.id.btn_chk);
        result=(TextView)findViewById(R.id.show_text);
    btn_chk.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

            String gaussstring=edit_txt.getText().toString();
            if(gaussstring.isEmpty()){
                erroMessage();
            }
            else{
                int result_main=Integer.parseInt(gaussstring);
                //Genaration Rendom Number
                Random random = new Random();
                int random_number= random.nextInt(5)+1;
                if(result_main>5){
                    erroMessageuncondition();
                }
                else if(random_number==result_main){
                    result.setText("Congratulations ! ! ! You Have won");
                }
                else{
                    result.setText("Sorry ! You Have Lost . Random Number was "+random_number);
                }

            }





    }
    public void erroMessage(){
        edit_txt.setError("Please Enter a Valid Number 1 to 5");
        edit_txt.requestFocus();
        return;
    }

    public void erroMessageuncondition(){
        String getnumber=edit_txt.getText().toString();
        int mumbermain=Integer.parseInt(getnumber);
        edit_txt.setError("Please Enter a Number 1 to 5 but you press "+mumbermain);
        edit_txt.requestFocus();
        return;
    }

}
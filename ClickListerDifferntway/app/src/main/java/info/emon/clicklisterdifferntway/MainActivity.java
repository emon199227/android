package info.emon.clicklisterdifferntway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button loginbtn,logoutbtn;
    private TextView logintxt;
    int countlogin=0,countlogout=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn=(Button)findViewById(R.id.buttonlogin);
        logoutbtn=(Button)findViewById(R.id.buttonlogput);
        logintxt=(TextView)findViewById(R.id.androidlogintxt);

        loginbtn.setOnClickListener(this);
        logoutbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonlogin){
            countlogin++;
            logintxt.setText("Login Button is clicked "+countlogin);
        }
        else{
            countlogout++;

            logintxt.setText("Logout Button is clicked "+countlogout);
        }

    }
}

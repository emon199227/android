package info.emon.handlemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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

        Handler handler = new Handler();

        loginbtn.setOnClickListener(handler);
        logoutbtn.setOnClickListener(handler);


    }
class Handler implements View.OnClickListener{

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonlogin){
            countlogout++;
            logintxt.setText("Login Button is Clicked   "+countlogout+" Time");
        }
        else if(view.getId()==R.id.buttonlogput){
            countlogin++;
            logintxt.setText("Logout Button is Clicked   "+countlogin+" Time");
        }

    }
}

}

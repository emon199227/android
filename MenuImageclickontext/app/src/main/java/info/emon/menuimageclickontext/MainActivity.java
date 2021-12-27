package info.emon.menuimageclickontext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countlogin++;
                logintxt.setText("Login Button is Clicked "+countlogin+" Time");
            }
        });
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countlogout++;
                logintxt.setText("Logout Button is Clicked "+countlogout+" Time");
            }
        });
    }
}

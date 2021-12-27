package info.emon.normalclassimplementmenu;

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
        logoutbtn=(Button)findViewById(R.id.buttonlogout);
        logintxt=(TextView)findViewById(R.id.androidlogintxt);

    }
    public void showMessage(View view){
        if(view.getId()==R.id.buttonlogin){
            countlogin++;
            logintxt.setText(" ! ! Login Button is Clicked "+countlogin+" Time ");
        }
        else if(view.getId()==R.id.buttonlogout){
            countlogout++;
            logintxt.setText(" ! !LogOut Button is Clicked "+countlogout+" Time ");
        }

    }
}

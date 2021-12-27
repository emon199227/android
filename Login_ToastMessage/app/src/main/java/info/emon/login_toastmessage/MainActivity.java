package info.emon.login_toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

           // Toast.makeText(MainActivity.this,"Login Button is Clicked  "+countlogin+"  Time",Toast.LENGTH_LONG).show();
            //working Toast smart way so upper line is comment and smartway use code below
            Toast toast = Toast.makeText(MainActivity.this,"Login Button is Clicked  "+countlogin+"  Time",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,10,10);
            toast.show();
            //Androin Cosole show message which action are active
            Log.v ("tag","Login buttoon is clicked ");
        }
        else if(view.getId()==R.id.buttonlogout){
            countlogout++;

            //Toast.makeText(MainActivity.this,"LogOut Button is Clicked  "+countlogout+"  Time",Toast.LENGTH_LONG).show();
            //working Toast smart way so upper line is comment and smartway use code below
            Toast toast = Toast.makeText(MainActivity.this,"Logout Button is Clicked  "+countlogout+"  Time",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,10,10);
            toast.show();
            Log.v ("tag","Logout buttoon is clicked ");
        }

    }
}

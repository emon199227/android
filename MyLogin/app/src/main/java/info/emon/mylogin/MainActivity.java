package info.emon.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText username,password;
    private Button loginbtn;
    private TextView message;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.userNameID);
        password = (EditText) findViewById(R.id.passwordID);
        loginbtn = (Button) findViewById(R.id.BtnID);
        message = (TextView) findViewById(R.id.textViewID);
        message.setText("Number of attempts remaining : 3 time ");

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameData = username.getText().toString();
                String passwordData = password.getText().toString();

                if(usernameData.equals("admin") && passwordData.equals("1234"))
                {
                    //match user and pass then go to new activity
                    Intent intent = new Intent(MainActivity.this,Dashboard.class);
                    startActivity(intent);
                }
                else
                {
                    counter--;
                    message.setText("Number of attempts remaining :  "+counter+"  "+" time ");
                    if(counter==0)
                    {
                       loginbtn.setEnabled(false);
                    }

                }

            }
        });
    }
}
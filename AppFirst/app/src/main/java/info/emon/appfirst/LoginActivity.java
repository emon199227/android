package info.emon.appfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText edituser,editpassword;
    private Button btnlogin;
    private TextView linkRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edituser=(EditText) findViewById(R.id.username);
        editpassword=(EditText) findViewById(R.id.password);
        btnlogin=(Button) findViewById(R.id.btnlogin);
        linkRegister=(TextView) findViewById(R.id.linkRegister);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

        linkRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent (LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void login() {

    }
}

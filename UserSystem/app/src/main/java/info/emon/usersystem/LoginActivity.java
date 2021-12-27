package info.emon.usersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText phnlogin,passwordlogin;
    private Button btnlogin;
    private TextView back_main,back_signup,forgetpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        phnlogin=(EditText)findViewById(R.id.login_phone_number_input);
        passwordlogin=(EditText)findViewById(R.id.login_phone_password_input);
        btnlogin=(Button)findViewById(R.id.login_btn);
        back_main=(TextView)findViewById(R.id.main_panel_login);
        back_signup=(TextView)findViewById(R.id.signup_panel_link);
        forgetpass=(TextView)findViewById(R.id.forget_password_link_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
login();
            }
        });
        back_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        back_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegiActivity.class);
                startActivity(intent);
            }
        });
        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
    }
}

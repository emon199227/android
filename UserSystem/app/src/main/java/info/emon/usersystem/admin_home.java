package info.emon.usersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class admin_home extends AppCompatActivity {
    private EditText username,password;
    private Button login_admin;
    private TextView admin_back_main,forget_pass_admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        username=(EditText)findViewById(R.id.admin_user_name);
        password=(EditText)findViewById(R.id.admin_password);
        login_admin=(Button)findViewById(R.id.login_btn_admin);
        admin_back_main=(TextView)findViewById(R.id.admin_panel_back_main);
        forget_pass_admin=(TextView)findViewById(R.id.forgetpass_admin);
        login_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        admin_back_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(admin_home.this,MainActivity.class);
                startActivity(intent);
            }
        });
        forget_pass_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}

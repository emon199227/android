package info.emon.usersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegiActivity extends AppCompatActivity {
    private EditText uname_reg,phone,password;
    private Button btnregister;
    private TextView linklogin,linkmain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regi);
        uname_reg=(EditText)findViewById(R.id.register_username_input);
        phone=(EditText)findViewById(R.id.register_phone_number_input);
        password=(EditText)findViewById(R.id.register_phone_password_input);

        btnregister=(Button)findViewById(R.id.register_btn);
        linklogin=(TextView)findViewById(R.id.signin_panel_link_register);
        linkmain=(TextView)findViewById(R.id.main_panel_register) ;
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        linklogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegiActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        linkmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegiActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

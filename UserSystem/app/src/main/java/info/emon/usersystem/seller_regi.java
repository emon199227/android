package info.emon.usersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class seller_regi extends AppCompatActivity {
    private EditText name,phone,email,password;
    private Button sellersignup;
    private TextView back_main_reg,back_login_regi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_regi);
        name=(EditText)findViewById(R.id.seller_signup_name);
        phone=(EditText)findViewById(R.id.seller_signup_phn);
        email=(EditText)findViewById(R.id.seller_signup_email);
        password=(EditText)findViewById(R.id.seller_signup_password);
        sellersignup=(Button) findViewById(R.id.seller_signup_btn);
        back_main_reg=(TextView) findViewById(R.id.main_panel_sell_signup);
        back_login_regi=(TextView) findViewById(R.id.seller_panel_back_login);
        sellersignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        back_main_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(seller_regi.this,MainActivity.class);
                startActivity(intent);
            }
        });
        back_login_regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(seller_regi.this,seller_login.class);
                startActivity(intent);
            }
        });

    }
}

package info.emon.usersystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class seller_login extends AppCompatActivity {
    private EditText email,password;
    private Button sellerlogin;
    private TextView back_main_sell_login,back_seller_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_login);
        email=(EditText)findViewById(R.id.seller_login_email);
        password=(EditText)findViewById(R.id.seller_login_password);
        sellerlogin=(Button)findViewById(R.id.seller_login_btn);
        back_main_sell_login=(TextView)findViewById(R.id.main_panel_sell_login);
        back_seller_signup=(TextView)findViewById(R.id.seller_panel_signup);
        sellerlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        back_main_sell_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(seller_login.this,MainActivity.class);
                startActivity(intent);
            }
        });
        back_seller_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(seller_login.this,seller_regi.class);
                startActivity(intent);
            }
        });
    }
}

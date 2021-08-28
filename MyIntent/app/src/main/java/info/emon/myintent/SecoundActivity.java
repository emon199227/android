package info.emon.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecoundActivity extends AppCompatActivity {
    private Button btnId2ndShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        btnId2ndShow = (Button)findViewById(R.id.btnId2nd);
        btnId2ndShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecoundActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

package info.emon.appfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView faridul,emon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faridul=(TextView)findViewById(R.id.faridul);
        emon=(TextView)findViewById(R.id.emon);
        faridul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        emon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent (MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}

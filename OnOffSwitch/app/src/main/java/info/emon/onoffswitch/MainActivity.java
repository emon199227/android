package info.emon.onoffswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Switch on_off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        on_off=(Switch)findViewById(R.id.switchId);

        on_off.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if (isChecked){
                    Toast.makeText(MainActivity.this,"Switch ON ",Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this,"Switch OFF ",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}
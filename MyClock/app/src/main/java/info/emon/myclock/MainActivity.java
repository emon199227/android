package info.emon.myclock;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextClock textClock;
    private AnalogClock analogClock;
    private DigitalClock digitalClock;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analogClock = (AnalogClock) findViewById(R.id.analogClockId);
        textClock = (TextClock) findViewById(R.id.textClockId);
        digitalClock = (DigitalClock) findViewById(R.id.digitalClockId);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
        digitalClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.analogClockId){
            Toast.makeText(MainActivity.this,"এনালগ ঘড়ি তে ক্লিক হয়েছে ",Toast.LENGTH_SHORT).show();
        }
         if(v.getId()==R.id.textClockId){
            Toast.makeText(MainActivity.this,"টেক্সট  ঘড়ি তে ক্লিক হয়েছে ",Toast.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.digitalClockId){
            Toast.makeText(MainActivity.this,"ডিজিটাল  ঘড়ি তে ক্লিক হয়েছে ",Toast.LENGTH_SHORT).show();
        }

    }
}

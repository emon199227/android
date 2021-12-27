package info.emon.seekbar_volumbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SeekBar volum;
    private TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        volum=(SeekBar)findViewById(R.id.seekbar);
        resultTxt=(TextView)findViewById(R.id.resultTextView);

        resultTxt.setText("Volume : "+volum.getProgress()+" / "+volum.getMax());

        volum.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progrss, boolean b) {
                resultTxt.setText("Volume : "+progrss+" / "+volum.getMax());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this," onStartTrackingTouch ",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this," onStopTrackingTouch ",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
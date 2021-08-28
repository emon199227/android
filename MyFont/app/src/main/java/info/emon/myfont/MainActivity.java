package info.emon.myfont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textview1,textview2;
    private Typeface typeface1,typeface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = (TextView)findViewById(R.id.textViewId);
        textview2 = (TextView)findViewById(R.id.textView2Id);

        typeface1 = Typeface.createFromAsset(getAssets(),"fonts/KaushanScript_Regular.otf");
        textview1.setTypeface(typeface1);
        typeface2 = Typeface.createFromAsset(getAssets(),"fonts/KaushanScript_Regular.otf");
        textview2.setTypeface(typeface2);

    }
}

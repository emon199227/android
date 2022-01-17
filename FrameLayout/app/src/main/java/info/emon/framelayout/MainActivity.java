package info.emon.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView cartoon_first,cartoon_secound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartoon_first = (ImageView) findViewById(R.id.cartoon_firstID);
        cartoon_secound = (ImageView) findViewById(R.id.cartoon_secoundID);

        cartoon_first.setOnClickListener(this);
        cartoon_secound.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.cartoon_firstID)
        {
          cartoon_first.setVisibility(View.GONE);
          cartoon_secound.setVisibility(View.VISIBLE);
        }
        else if (v.getId()==R.id.cartoon_secoundID)
        {
            cartoon_secound.setVisibility(View.GONE);
            cartoon_first.setVisibility(View.VISIBLE);
        }


    }
}
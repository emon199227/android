package info.emon.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity implements View.OnClickListener  {
    private ImageView imageView;
    private TextView textView;
    private Button button;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView =(ImageView)findViewById(R.id.imageViewId);
        textView=(TextView)findViewById(R.id.textViewId);
        button=(Button)findViewById(R.id.buttonBackId);
        button.setOnClickListener((View.OnClickListener) this);


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
           String countryName=bundle.getString("name");
           showDetails(countryName);
        }

    }
    void showDetails(String countryName){
        if(countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.parlament_bd);
            textView.setText(R.string.Bangladesh_text);

        }
        if(countryName.equals("india")){
            imageView.setImageResource(R.drawable.tajmahal);
            textView.setText(R.string.India_text);

        }
        if(countryName.equals("pakistan")){
            imageView.setImageResource(R.drawable.parlament_pk);
            textView.setText(R.string.Pakistan_text);

        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonBackId){
            intent = new Intent(Profile.this, MainActivity.class);
            startActivity(intent);
        }

    }
}

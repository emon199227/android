package info.emon.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button BangladeshButton,IndiaButton,PakistanButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BangladeshButton = (Button)findViewById(R.id.bangladeshButtonId);
        IndiaButton = (Button)findViewById(R.id.indiaButtonId);
        PakistanButton = (Button)findViewById(R.id.pakistanButtonId);

        BangladeshButton.setOnClickListener(this);
        IndiaButton.setOnClickListener(this);
        PakistanButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bangladeshButtonId) {
            intent = new Intent(MainActivity.this, Profile.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }

          if(v.getId()==R.id.indiaButtonId) {
              intent = new Intent(MainActivity.this, Profile.class);
              intent.putExtra("name", "india");
              startActivity(intent);
          }

          if(v.getId()==R.id.pakistanButtonId){
          intent = new Intent(MainActivity.this,Profile.class);
          intent.putExtra("name","pakistan");
          startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setIcon(R.drawable.what);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("হ্যাঁ ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });
        alertDialogBuilder.setNegativeButton("না  ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();



    }
}


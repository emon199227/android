package info.emon.myalartdilogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button exitbutton;
    private AlertDialog.Builder alartdialogbuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exitbutton = (Button)findViewById(R.id.btnId);

        exitbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        alartdialogbuilder = new AlertDialog.Builder(MainActivity.this);

        //For Setting Title
        alartdialogbuilder.setTitle(R.string.title_txt);

        //For Setting Msg
        alartdialogbuilder.setMessage(R.string.msg_txt);

        //For Setting Icon
        alartdialogbuilder.setIcon(R.drawable.what_icon);
        //set auto cancaleable false
        alartdialogbuilder.setCancelable(false);

        alartdialogbuilder.setPositiveButton("হা ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //exit
                finish();

            }
        });

        alartdialogbuilder.setNegativeButton("না", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"আপনি না বাটনে ক্লিক করেছেন ",Toast.LENGTH_SHORT).show();

            }
        });
        alartdialogbuilder.setNeutralButton("বাতিল", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"আপনি বাতিল  বাটনে ক্লিক করেছেন ",Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog alertDialog = alartdialogbuilder.create();
        alertDialog.show();




    }
}

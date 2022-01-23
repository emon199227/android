package info.emon.embedwebsie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WebView website;
    private ImageView logoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        website=(WebView)findViewById(R.id.webviewID);
        logoid=(ImageView)findViewById(R.id.logo);



        logoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Mathbaria News : : Develop By Emon :: Contact : 01786575404",Toast.LENGTH_LONG).show();
            }
        });

        WebSettings webSettings=website.getSettings();
        webSettings.setJavaScriptEnabled(true);

    //adding back button on the tool bar

       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //end calling back button ,now write code on out of oncreate option""""""""""""""
        website.setWebViewClient(new WebViewClient());

        website.loadUrl("http://prothomalo.com");
    }

 /*   @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public void onBackPressed() {
        if(website.canGoBack()){
            website.goBack();
        }
        else {
            super.onBackPressed();

        }

    }
}
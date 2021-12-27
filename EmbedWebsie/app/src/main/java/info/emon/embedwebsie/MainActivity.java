package info.emon.embedwebsie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        website.setWebViewClient(new WebViewClient());

        website.loadUrl("http://mathbarianews.com");
    }

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
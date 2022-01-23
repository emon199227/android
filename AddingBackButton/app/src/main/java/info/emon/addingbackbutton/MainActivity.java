package info.emon.addingbackbutton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView website;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        website = (WebView) findViewById(R.id.webviewID);

        WebSettings webSettings = website.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //adding back button on the tool bar

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //end calling back button ,now write code on out of oncreate option""""""""""""""

        website.setWebViewClient(new WebViewClient());

        website.loadUrl("http://prothomalo.com");

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
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
package info.emon.myhtml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    String Mytext ="<h1>This Emon headin 1 </h1>\n"+
            "<h2>This Emon headin 2 </h2>\n"+
            "<h3>This Emon headin 3 </h3>\n"+
            "<p>This Emon Paragraph</p>\n"+
            "<p><u>This Emon Underline</u> </p>\n"+
            "<p><b>This Emon headin Bold text </b></p>\n"+
            "<p><b>This Emon headin iTalic text </b></p>\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webViewID);
        webView.loadDataWithBaseURL(null,Mytext,"text/html","utf-8",null);

    }
}
package info.emon.myhtml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    String Mytext ="<h1>This Emon headin 1 </H1>\n"+
            "<h1>This Emon headin 2 </H1>\n"+
            "<h1>This Emon headin 3 </H1>\n"+
            "<p1>This Emon Paragraph</p1>\n"+
            "<p><u>This Emon Underline</u> </p1>\n"+
            "<p><b>This Emon headin Bold text </p></p1>\n"+
            "<p><b>This Emon headin iTalic text </p></p1>\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webViewID);
        webView.loadDataWithBaseURL(null,Mytext,"text/html","utf-8",null);

    }
}
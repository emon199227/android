package info.emon.myhtml_2nd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
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
        textView =(TextView) findViewById(R.id.textViewID);
        textView.setText(Html.fromHtml(Mytext));
    }
}
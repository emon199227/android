package com.e.mydatepickerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private DatePicker selectdatePicker;
    private Button selectbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.Textview_ID);
        selectdatePicker=(DatePicker)findViewById(R.id.DatePicker_ID);
        selectbutton=(Button)findViewById(R.id.Button_view_ID);
        textView.setText(CurrentDate());
        selectbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              textView.setText(CurrentDate());
            }
        });
    }
    String CurrentDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current Date : ");
        stringBuilder.append(selectdatePicker.getDayOfMonth()+"/");
        stringBuilder.append((selectdatePicker.getMonth()+1)+"/");
        stringBuilder.append(selectdatePicker.getYear());
       return stringBuilder.toString();

    }
}

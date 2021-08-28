package info.emon.mydatepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button_raw;
    private TextView textView_raw;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_raw = (Button) findViewById(R.id.btn_ID);
        textView_raw = (TextView)findViewById(R.id.textViewID);

        button_raw.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DatePicker datePicker = new DatePicker(this);
        int currentDay = datePicker.getDayOfMonth();
        int currentMonth = (datePicker.getMonth()+1);
        int currentYear = datePicker.getYear();

        datePickerDialog = new DatePickerDialog(this,

                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        textView_raw.setText(dayOfMonth+" / "+(month+1)+" / "+year);

                    }
                },currentYear,currentMonth,currentDay);
        datePickerDialog.show();

    }
}

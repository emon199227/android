package info.emon.myfeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sendbutton, clearbutton;
    private EditText edtName, edtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        sendbutton = (Button) findViewById(R.id.sendBtnId);
        clearbutton = (Button) findViewById(R.id.clrBtnId);

        edtName = (EditText) findViewById(R.id.nameEdtTxtID);
        edtMessage = (EditText) findViewById(R.id.feedbackEdtTxtID);

        sendbutton.setOnClickListener(this);
        clearbutton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        try {
            String name = edtName.getText().toString();
            String message = edtMessage.getText().toString();

            if (view.getId() == R.id.sendBtnId) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"emon199227@gmail.com", "emonconstruction64@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback form App");
                intent.putExtra(Intent.EXTRA_TEXT, "Name : " + name + "\n FeedBack/Message  : " + message + "\n Thanks Apps Develop By Emon 0186575404");
                startActivity(Intent.createChooser(intent, "Feedback with"));


            } else if (view.getId() == R.id.clrBtnId) {
                edtName.setText("");
                edtMessage.setText("");

            }

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Exception : "+e,Toast.LENGTH_SHORT).show();


        }

    }
}
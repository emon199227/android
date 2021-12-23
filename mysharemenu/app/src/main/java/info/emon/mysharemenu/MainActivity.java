package info.emon.mysharemenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        if(item.getItemId()==R.id.shareID)
        {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "C Programming ";
            String body = "Thid help is very useful  to learn Programming \n mysharemenu.emon.info";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"Share With "));
        }
        return super.onOptionsItemSelected(item);
    }
}
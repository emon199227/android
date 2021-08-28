package info.emon.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button play,paush,stop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = (Button) findViewById(R.id.btn_play);
        paush =(Button) findViewById(R.id.btn_paush);
        stop = (Button) findViewById(R.id.btn_stop);

        play.setOnClickListener(this);
        paush.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.btn_play:
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music)
                break;
            case R.id.btn_paush:
                break;
            case R.id.btn_stop:
                break;

        }
    }
}

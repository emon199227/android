package info.emon.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton playButton,pauseButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton=(ImageButton) findViewById(R.id.playbuttonId);
        pauseButton=(ImageButton) findViewById(R.id.pausebuttonId);
        mediaPlayer = MediaPlayer.create(this,R.raw.itna);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.playbuttonId){
            if(mediaPlayer!=null){
                mediaPlayer.start();

                Toast.makeText(MainActivity.this,"Song played",Toast.LENGTH_SHORT).show();
            }

        }
        if (v.getId()==R.id.pausebuttonId){
            if(mediaPlayer!=null){
                mediaPlayer.pause();
                Toast.makeText(MainActivity.this,"Song paused",Toast.LENGTH_SHORT).show();
            }

        }

    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer!=null && mediaPlayer.isPlaying() ){
            mediaPlayer.stop();
            mediaPlayer.release();

        }

        super.onDestroy();
    }
}
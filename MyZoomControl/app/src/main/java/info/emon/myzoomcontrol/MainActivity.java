package info.emon.myzoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageViewID);
        zoomControls = (ZoomControls) findViewById(R.id.zoomControlID);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vew) {
                Toast.makeText(getApplicationContext(),"জুম ইন হচ্ছেঃঃ --ইমনের ছবি--",Toast.LENGTH_SHORT).show();
                float imagesize_X=imageView.getScaleX();
                float imagesize_Y=imageView.getScaleY();

                imageView.setScaleX((float)imagesize_X+1);
                imageView.setScaleY((float)imagesize_Y+1);

            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vew) {

                float imagesize_X=imageView.getScaleX();
                float imagesize_Y=imageView.getScaleY();

                if(imagesize_X>1 && imagesize_Y>1){
                    Toast.makeText(getApplicationContext(),"জুম আউট হচ্ছেঃঃ --ইমনের ছবি--",Toast.LENGTH_SHORT).show();
                    imageView.setScaleX((float)imagesize_X-1);
                    imageView.setScaleY((float)imagesize_Y-1);

                }
                else{
                    Toast.makeText(getApplicationContext(),"জুম আউট হচ্ছে নাঃ  --ইমনের ছবি মিনিমাম সাইজে আছে --",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}

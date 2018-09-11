package conocenicocolas.com.conocenicolas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class TraditionsActivity extends AppCompatActivity {
    private MediaPlayer mp1,mp2,mp3;
    private ImageButton btnA1;
    private ImageButton btnA2;
    private ImageButton btnA3;

    private void validacionAudios(){
        if(mp1.isPlaying()){mp1.pause();}
        if(mp2.isPlaying()){mp2.pause();}
        if(mp3.isPlaying()){mp3.pause();}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditions);

        btnA1 =  (ImageButton) findViewById(R.id.btnA1);
        btnA2 =  (ImageButton) findViewById(R.id.btnA2);
        btnA3 =  (ImageButton) findViewById(R.id.btnA3);

        mp1 = MediaPlayer.create(TraditionsActivity.this, R.raw.feb);
        mp2 = MediaPlayer.create(TraditionsActivity.this, R.raw.sep);
        mp3 = MediaPlayer.create(TraditionsActivity.this, R.raw.dic);

        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp1.isPlaying()){
                    mp1.pause();
                }else{
                    validacionAudios();
                    mp1.start();
                }
            }
        });
        btnA1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                validacionAudios();
                mp1 = null;
                mp1 = MediaPlayer.create(TraditionsActivity.this, R.raw.feb);
                mp1.start();
                return false;
            }
        });

        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp2.isPlaying()){
                    mp2.pause();
                }else{
                    validacionAudios();
                    mp2.start();
                }
            }
        });
        btnA2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                validacionAudios();
                mp2 = null;
                mp2 = MediaPlayer.create(TraditionsActivity.this, R.raw.sep);
                mp2.start();
                return false;
            }
        });

        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp3.isPlaying()){
                    mp3.pause();
                }else{
                    validacionAudios();
                    mp3.start();
                }
            }
        });
        btnA3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                validacionAudios();
                mp3 = null;
                mp3 = MediaPlayer.create(TraditionsActivity.this, R.raw.dic);
                mp3.start();
                return false;
            }
        });
    }
    @Override
    protected void onPause() {
        validacionAudios();
        super.onPause();
    }
}
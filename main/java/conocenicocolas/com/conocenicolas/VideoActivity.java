package conocenicocolas.com.conocenicolas;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    private View view;
    private String videoPath;
    private VideoView mVV;
    private MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView videoView = view.findViewById(R.id.videoView);
      //  String videoPath = "android.resource://" +getActivity().getPackageName() + "/" + R.raw.videonf;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        //MediaController mediaController = new MediaController(getContext());
//        videoView.setMediaController(mediaController);
//        mediaController.setAnchorView(videoView);
    }

    private void media(){
        Uri uri = Uri.parse(videoPath);
        mVV.setVideoURI(uri);
        mVV.setMediaController(mediaC);
        mediaC.setAnchorView(mVV);
        mVV.start();
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
       // getActivity().finish();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(VideoActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }

}

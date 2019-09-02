package com.example.mad_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class RickRoll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rick_roll);

        MediaController mediaController = new MediaController(this);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.rick_roll_video));
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}

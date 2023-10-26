package com.example.a5;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton grunt, raider;
    private MediaPlayer gruntSound, raiderSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grunt = findViewById(R.id.grunt);
        raider = findViewById(R.id.raider);

        gruntSound = MediaPlayer.create(this,R.raw.gruntready1);
        raiderSound = MediaPlayer.create(this,R.raw.wolfriderwarcry1);

        grunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlayButton(gruntSound, raiderSound);
            }
        });

        raider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlayButton(raiderSound, gruntSound);
            }
        });
    }

    private void soundPlayButton(MediaPlayer sound1, MediaPlayer sound2) {
        if(sound1.isPlaying()){
            sound1.pause();
            sound1.seekTo(0);
            sound1.setLooping(false);
            //    sound.pause();
        }

        if (sound2.isPlaying()){
            sound2.pause();
            sound2.seekTo(0);
            sound2.setLooping(false);
        }

        sound1.start();
        sound1.setLooping(true);
    //    sound.seekTo();
    }

}

// Added sounds


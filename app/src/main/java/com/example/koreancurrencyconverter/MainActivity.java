package com.example.koreancurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends Activity {

    public void clickFunction(View viw) {

        EditText editInputText= (EditText) findViewById(R.id.editInputText);

        Log.i("info", editInputText.getText().toString());

        int i = Integer.parseInt(editInputText.getText().toString());

        Toast.makeText(MainActivity.this, "£" + String.format("%.2f", i*0.00062), Toast.LENGTH_LONG).show();

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.shanemac);

        videoView.start();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

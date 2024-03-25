package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button);

        View.OnClickListener oclbutton1 = v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("key", "value");
            startActivity(intent);
        };
        button1.setOnClickListener(oclbutton1);
    }

}
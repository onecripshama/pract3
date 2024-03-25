package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.third_layout);


        Button button4 = (Button) findViewById(R.id.button4);

        View.OnClickListener oclbutton4 = v -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity.class);
            intent.putExtra("key", "value");
            startActivity(intent);
        };
        button4.setOnClickListener(oclbutton4);
    }
}
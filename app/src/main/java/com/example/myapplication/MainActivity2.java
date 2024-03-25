package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);


        Button button2 = (Button) findViewById(R.id.button2);

        View.OnClickListener oclbutton2 = v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            intent.putExtra("key", "value");
            startActivity(intent);
        };
        button2.setOnClickListener(oclbutton2);

        Button button3 = (Button) findViewById(R.id.button3);

        View.OnClickListener oclbutton3 = v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra("key", "value");
            startActivity(intent);
        };
        button3.setOnClickListener(oclbutton3);
    }
}
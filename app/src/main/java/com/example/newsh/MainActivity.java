package com.example.newsh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu = findViewById(R.id.button16);
        bu.setOnClickListener(this);
        bu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override

            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this,"From Saturday to Thursday: 9:00 AM - 10:00 PM\n" +
                        "Friday: 4:00 pm - 10:00 pm",Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    public void About(View view) {
        Intent i = new Intent(this, ACTIVITY_sec.class);
        startActivity(i);
    }

    public void Call(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+966920004123"));
        startActivity(i);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this,"Please long press",Toast.LENGTH_SHORT).show();
    }
}
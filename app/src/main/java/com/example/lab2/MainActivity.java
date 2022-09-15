package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertText();
            }
        });
    }
    public void convertText() {
        EditText editText = findViewById(R.id.input);
        String text = editText.getText().toString().toUpperCase(Locale.ROOT);
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(text);
    }
}
package com.example.viewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_count, btn_reset, btn_up, btn_down;
    TextView textView_number;
    EditText editText;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_count = findViewById(R.id.button_count);
        btn_reset = findViewById(R.id.button_reset);
        textView_number = findViewById(R.id.textView);
        btn_up = findViewById(R.id.button_up);
        btn_down = findViewById(R.id.button_down);
        editText = findViewById(R.id.editTextText);

        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = counter+1;
                textView_number.setText(String.valueOf(counter));
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                textView_number.setText(String.valueOf(counter));
                textView_number.setBackgroundColor(Color.BLACK);
                btn_count.setTextColor(Color.RED);
            }
        });

        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                textView_number.setText(text);
            }
        });
    }
}
package com.example.unit_converter_;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    TextView textView3;

    EditText editText;
    EditText editText2;

    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        editText = findViewById(R.id.editTextNumberSigned);
        editText2 = findViewById(R.id.editTextNumberSigned2);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fahrenheitToCelsius();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                celsiusToFahrenheit();
            }
        });
    }

    private void fahrenheitToCelsius() {
        String f = editText.getText().toString();

        double fahrenheit = Double.parseDouble(f);

        double celsius = (fahrenheit -32) *0.5556;

        editText2.setText(String.format("%.2f", celsius));
    }

    private void celsiusToFahrenheit() {
        String c = editText2.getText().toString();

        double celsius = Double.parseDouble(c);

        double fahrenheit = (celsius * 1.8 ) + 32;

        editText.setText(String.format("%.2f", fahrenheit));

    }


}
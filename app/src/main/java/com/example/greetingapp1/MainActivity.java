package com.example.greetingapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button button;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.textView);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextTextPersonName);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                String name=editText.getText().toString();
                Toast.makeText(MainActivity.this, "Hello " ,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
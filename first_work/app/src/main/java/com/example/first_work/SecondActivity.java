package com.example.first_work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        EditText inputNameText = findViewById(R.id.inputNameText);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = inputNameText.getText().toString();

                Intent result = new Intent();
                result.putExtra("name", name);
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }
}
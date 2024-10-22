package com.example.first_work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int SHOW_SECOND_ACTIVIY = 1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("greeting", "Приветствую тебя, ");
                startActivityForResult(i, SHOW_SECOND_ACTIVIY);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SHOW_SECOND_ACTIVIY && resultCode == RESULT_OK && data != null){
            String name = data.getStringExtra("name");
            TextView textGreeting = findViewById(R.id.textGreeting);
            textGreeting.setText("Приветствую вас, " + name + "!");
        }
    };

}
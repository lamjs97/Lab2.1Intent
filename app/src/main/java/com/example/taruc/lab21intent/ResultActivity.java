package com.example.taruc.lab21intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView textViewMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Identify the intent that trigger this activity
        Intent intent = getIntent();

        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        String message = intent.getStringExtra(MainActivity.MESSAGE);

        textViewMessage.setText(message);



    }

    public void closeActivity(View view){
        finish(); //to terminate an activity
    }

}

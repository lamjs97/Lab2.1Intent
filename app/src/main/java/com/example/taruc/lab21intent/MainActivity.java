package com.example.taruc.lab21intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "MainActivity"; //value must be unique
    private EditText editTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = (EditText)findViewById(R.id.editText);

    }

    public void setMessage(View v){
        //Intent is a message class to transfer
        //an activity to another activity or app
        Intent intent = new Intent(this,ResultActivity.class);

        String message;
        message = editTextMessage.getText().toString();

        //Passing data to an Intent
        //Format: putExtra(tag,Value)
        intent.putExtra(MESSAGE,message);
        startActivity(intent);



    }





}

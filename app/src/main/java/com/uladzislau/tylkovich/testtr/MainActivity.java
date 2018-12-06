package com.uladzislau.tylkovich.testtr;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.firstbutton);
        button.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        startActivity(new Intent(getApplicationContext(), SecondActivity.class));
        finish();

    }



}

package com.example.s525127.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainpage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        Button but1 = (Button) findViewById(R.id.create1);
        but1.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {
        Intent toy = new Intent(mainpage.this,strikedippage.class);
        startActivity(toy);
    }
}

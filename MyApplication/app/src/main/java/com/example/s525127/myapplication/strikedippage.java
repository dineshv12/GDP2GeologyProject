package com.example.s525127.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class strikedippage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strikedippage);

        final Button contact =(Button)findViewById(R.id.button7);
        contact.setOnClickListener(this);

        final Button msg =(Button)findViewById(R.id.button8);
        msg.setOnClickListener(this);

        final Button dip = (Button) findViewById(R.id.button9);
        dip.setOnClickListener(this);

        final Button azimuth = (Button) findViewById(R.id.button10);
        azimuth.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.button7:
                i  = new Intent(strikedippage.this, quadrant.class);
                startActivity(i);
                break;
            case R.id.button8:
                i = new Intent(strikedippage.this, azimuth.class);
                startActivity(i);
                break;
            case R.id.button9:
                i = new Intent(strikedippage.this,dipdipquadrant.class);
                startActivity(i);
                break;
            case R.id.button10:
                i = new Intent(strikedippage.this,dipdipazimuth.class);
                startActivity(i);
                break;
        }
    }
}

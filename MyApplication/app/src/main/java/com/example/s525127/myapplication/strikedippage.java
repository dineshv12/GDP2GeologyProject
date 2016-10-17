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
        Button but1 = (Button) findViewById(R.id.button7);
        but1.setOnClickListener(this);
    }

   public void onClick(View view){
       Intent toy = new Intent(strikedippage.this,quadrant.class);
       startActivity(toy);
   }
}

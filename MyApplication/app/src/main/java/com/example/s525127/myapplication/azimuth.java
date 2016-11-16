package com.example.s525127.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class azimuth extends AppCompatActivity implements View.OnClickListener {
EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azimuth);
        name = (EditText) findViewById(R.id.editText);
        Button but1 = (Button) findViewById(R.id.button);
        but1.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent toy = new Intent(azimuth.this,azimuthgraph.class);

        //Create a bundle object
        Bundle b = new Bundle();

        //Inserts a String value into the mapping of this Bundle
        b.putString("name", name.getText().toString());
        toy.putExtras(b);
        startActivity(toy);
    }
}

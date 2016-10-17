package com.example.s525127.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quadrant extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrant);

        Button but1 = (Button) findViewById(R.id.button11);
        but1.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent toy = new Intent(quadrant.this,quadrantgraph.class);
        startActivity(toy);
    }
}

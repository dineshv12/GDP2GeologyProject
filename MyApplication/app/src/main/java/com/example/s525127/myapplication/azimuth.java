package com.example.s525127.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        final String word = name.getText().toString();

        if (word.length() != 0 ) {

            if(word.length() == 8 || word.length() == 9 || word.length() ==10) {
                Toast.makeText(azimuth.this, "Validation Successful", Toast.LENGTH_LONG).show();
                b.putString("name", word);
                toy.putExtras(b);
                startActivity(toy);
            }
            else{

                name.requestFocus();
                name.setError("Enter the correct format");
                Toast.makeText(azimuth.this, "Enter the correct format", Toast.LENGTH_LONG).show();

            }

        }

        else{
            name.requestFocus();
            name.setError("FIELD CANNOT BE EMPTY");
            Toast.makeText(azimuth.this, "Field cannot be empty", Toast.LENGTH_LONG).show();
        }
    }
    }


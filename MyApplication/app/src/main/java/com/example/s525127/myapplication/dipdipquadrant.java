package com.example.s525127.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dipdipquadrant extends AppCompatActivity implements View.OnClickListener {
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipdipquadrant);
        name = (EditText) findViewById(R.id.editText3);
        Button but1 = (Button) findViewById(R.id.button12);
        but1.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent toy = new Intent(dipdipquadrant.this,dipdipquadrantgraph.class);

        //Create a bundle object
        Bundle b = new Bundle();

        //Inserts a String value into the mapping of this Bundle

        final String word = name.getText().toString();


        if (word.length() != 0 ) {

            if(word.length() == 8 || word.length() == 9 || word.length() ==7) {
                Toast.makeText(dipdipquadrant.this, "Validation Successful", Toast.LENGTH_LONG).show();
                b.putString("name", word);
                toy.putExtras(b);
                startActivity(toy);
            }
            else{
                name.requestFocus();
                name.setError("Enter the correct format");
                Toast.makeText(dipdipquadrant.this, "Enter the correct format", Toast.LENGTH_LONG).show();
            }
        }
        else{
            name.requestFocus();
            name.setError("FIELD CANNOT BE EMPTY");
            Toast.makeText(dipdipquadrant.this, "Field cannot be empty", Toast.LENGTH_LONG).show();
        }
    }
}

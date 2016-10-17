package com.example.s525127.myapplication;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public Button but1;
    public Button but2;

    public void init(){
        but1 = (Button) findViewById(R.id.but1);
        but1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent toy = new Intent(MainActivity.this,secondpage.class);
                startActivity(toy);
            }
        });
        but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent toy1 = new Intent(MainActivity.this,existingproject.class);
                startActivity(toy1);
            }
        });
    }
}

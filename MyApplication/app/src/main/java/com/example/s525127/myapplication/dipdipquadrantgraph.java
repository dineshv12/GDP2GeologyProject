package com.example.s525127.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class dipdipquadrantgraph extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dipdipquadrantgraph);

        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.textView9);
        name.setText(b.getCharSequence("name"));
        String str = name.getText().toString();
        str = str.substring(4,6);
        int angle2 = Integer.parseInt(str);

        GraphView graph2 = (GraphView)findViewById(R.id.dipdipquadrantgraph);
        // set manual X bounds
        graph2.getViewport().setXAxisBoundsManual(true);
        graph2.getViewport().setMinX(-50);

        graph2.getViewport().setMaxX(50);

        // set manual Y bounds
        graph2.getViewport().setYAxisBoundsManual(true);
        graph2.getViewport().setMinY(-50);
        graph2.getViewport().setMaxY(50);

        int x = (int) (Math.random()+25);

        // int angle = 250;
         LineGraphSeries<DataPoint> series1 = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(-x, -x*Math.tan(Math.toRadians(180-angle2))),
                new DataPoint(x,x*Math.tan(Math.toRadians(180-angle2))),

        });
        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<DataPoint>(new DataPoint[] {


                new DataPoint(-x,x/Math.tan(Math.toRadians(180-angle2))),
                new DataPoint(0,0),


        });

        series2.setColor(Color.GREEN);
        graph2.addSeries(series1);
        graph2.addSeries(series2);

    }

}

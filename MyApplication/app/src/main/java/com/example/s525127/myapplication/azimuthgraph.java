package com.example.s525127.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class azimuthgraph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azimuthgraph);

        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.textView7);
        name.setText(b.getCharSequence("name"));
        String str = name.getText().toString();
        str = str.substring(0,3);
        int angle2 = Integer.parseInt(str);

        GraphView graph1 = (GraphView)findViewById(R.id.azimuthgraph);
        // set manual X bounds
        graph1.getViewport().setXAxisBoundsManual(true);
        graph1.getViewport().setMinX(-50);

        graph1.getViewport().setMaxX(50);

        // set manual Y bounds
        graph1.getViewport().setYAxisBoundsManual(true);
        graph1.getViewport().setMinY(-50);
        graph1.getViewport().setMaxY(50);

        int x = (int) (Math.random()+25);

       // int angle = 250;


        LineGraphSeries<DataPoint> series1 = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(-x, -x*Math.tan(Math.toRadians(90-angle2))),
                new DataPoint(x,x*Math.tan(Math.toRadians(90-angle2))),


        });
        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<DataPoint>(new DataPoint[] {

                new DataPoint(0,0),
                new DataPoint(x,-x/Math.tan(Math.toRadians(90-angle2)))

        });



        series2.setColor(Color.GREEN);
        graph1.addSeries(series1);
        graph1.addSeries(series2);

    }

}

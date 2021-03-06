package com.example.s525127.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class quadrantgraph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrantgraph);

        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.textView5);
        name.setText(b.getCharSequence("name"));
        String str = name.getText().toString();
        str = str.substring(1,3);
        int angle2 = Integer.parseInt(str);
        GraphView graph = (GraphView)findViewById(R.id.graph);
        // set manual X bounds
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(-50);
        graph.getViewport().setMaxX(50);
        // set manual Y bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-50);
        graph.getViewport().setMaxY(50);
        int x = (int) (Math.random()+25);
      //  int angle = 218;
//        String angle1 = "N75W";
//       angle1 =  angle1.substring(1,3);
//        int angle2 = Integer.parseInt(angle1);


        LineGraphSeries<DataPoint> series1 = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(-x, -x*Math.tan(Math.toRadians(90-angle2))),
                new DataPoint(x,x*Math.tan(Math.toRadians(90-angle2))),


        });
        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<DataPoint>(new DataPoint[] {

                new DataPoint(0,0),
                new DataPoint(x,-x/Math.tan(Math.toRadians(90-angle2)))

        });


        series2.setColor(Color.GREEN);
        graph.addSeries(series1);
        graph.addSeries(series2);

    }

}

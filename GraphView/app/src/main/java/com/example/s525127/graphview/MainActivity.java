package com.example.s525127.graphview;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;
import com.jjoe64.graphview.series.Series;

public class MainActivity extends AppCompatActivity {

 LineGraphSeries<DataPoint> series;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        double y,x;
//        x= -5.0;

        GraphView graph = (GraphView)findViewById(R.id.graph);
        // set manual X bounds
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);

        graph.getViewport().setMaxX(20);

        // set manual Y bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(20);
        // use static labels for horizontal and vertical labels
        /*StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(graph);
        graph.getGridLabelRenderer().setNumHorizontalLabels(1);
        staticLabelsFormatter.setHorizontalLabels(new String[] {"WEST"," ","SOUTH"," ","EAST"});
        staticLabelsFormatter.setVerticalLabels(new String[] {"",""});
        graph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);*/

       LineGraphSeries<DataPoint> graph1 = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0,0),
                new DataPoint(7,2),
//              new DataPoint(4,4),


        });

        graph.addSeries(graph1);

        graph1.setDrawDataPoints(true);
      // series1.setDrawAsPath(true);
      // series1.setShape(PointsGraphSeries.Shape.POINT);
       /* // custom paint to make a dotted line
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        series1.setShape(PointsGraphSeries.Shape.TRIANGLE);*/
        //series1.setCustomShape();
       // series1.setCustomPaint(paint);

        //series.appendData(new DataPoint(0,20));
//        for (int i=0;i<20;i++)
//        {
//            x=x+0.1;
//            y=x+1;
//            series.appendData(new DataPoint(x,y),true,500);
//        }
//
//graph.addSeries(series);

       /* PointsGraphSeries<DataPoint> series3 = new PointsGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(1, 3),
                new DataPoint(2, 1),
                new DataPoint(3, 0),
                new DataPoint(4, 4)
        });
        graph.addSeries(series3);
        series3.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series3.setColor(Color.YELLOW);*/

    }
}

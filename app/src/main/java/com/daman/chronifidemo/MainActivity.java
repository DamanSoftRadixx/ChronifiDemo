package com.daman.chronifidemo;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.color.MaterialColors;
import com.highsoft.highcharts.core.*;
import com.highsoft.highcharts.common.hichartsclasses.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
//    LinearLayout layout;
    @SuppressLint({"MissingInflatedId", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("sadfadfsbashdf","asdijfhasdkfhaskdfbaskdfaksjdfhajksdflkajsfhjkasdfasdfnm,sadf");
//         layout = (LinearLayout) findViewById(R.id.layoutLinear);
         TextView txt = new TextView(this);
        HIChartView chartView = findViewById(R.id.rc);

//         txt.setText("Testing");
//         layout.addView(txt);
         // 1 Method
//        LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        LinearLayout myRoot = new LinearLayout(this);
//        View itemView = inflater.inflate(R.layout.activity_mainn, myRoot);
//        HIChartView chartView = findViewById(R.id.hcc);

        // 2. Method
//        LinearLayout myRoot = new LinearLayout(this);
//        myRoot.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT));
//        myRoot.setOrientation(LinearLayout.VERTICAL);
//        HIChartView chartView = new HIChartView(this);

//        HIChartView chartView = (HIChartView) findViewById(R.id.hc);
        chartView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                600));
        chartView.setBackgroundColor(android.R.color.holo_green_light);
//        chartView.viewData();
//        HIOptions options = new HIOptions();
//        HIChart chart = new HIChart();
//        chart.setType("column");
//        options.setChart(chart);
//        HITitle title = new HITitle();
//        title.setText("Demo chart");
//        options.setTitle(title);
//        HIColumn series = new HIColumn();
//        series.setData(new ArrayList<>(Arrays.asList(49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)));
//        options.setSeries(new ArrayList<HISeries>(Collections.singletonList(series)));
//        chartView.setOptions(options);



//        HIChartView chartView = (HIChartView) findViewById(R.id.hc);
  /*      chartView.plugins = new ArrayList<>(Arrays.asList("sankey"));
        HIOptions options = new HIOptions();
        HITitle title = new HITitle();
        title.setText("Highcharts Sankey Diagram");
        options.setTitle(title);
        HISankey series1 = new HISankey();
        String[] keys = new String[] {"from", "to", "weight" };
        series1.setKeys(new ArrayList<>(Arrays.asList(keys)));
        series1.setName("Sankey demo series");
        Object[] object1 = new Object[] { "Brazil", "Portugal", 5 };
        Object[] object2 = new Object[] { "Brazil", "France", 1 };
        Object[] object3 = new Object[] { "Brazil", "Spain", 1 };
        Object[] object4 = new Object[] { "Brazil", "England", 1 };
        Object[] object5 = new Object[] { "Canada", "Portugal", 1 };
        Object[] object6 = new Object[] { "Canada", "France", 5 };
        Object[] object7 = new Object[] { "Canada", "England", 1 };
        Object[] object8 = new Object[] { "Mexico", "Portugal", 1 };
        Object[] object9 = new Object[] { "Mexico", "France", 1 };
        Object[] object10 = new Object[] { "Mexico", "Spain", 5 };
        Object[] object11 = new Object[] { "Mexico", "England", 1 };
        Object[] object12 = new Object[] { "USA", "Portugal", 1 };
        Object[] object13 = new Object[] { "USA", "France", 1 };
        Object[] object14 = new Object[] { "USA", "Spain", 1 };
        Object[] object15 = new Object[] { "USA", "England", 5 };
        Object[] object16 = new Object[] { "Portugal", "Angola", 2 };
        Object[] object17 = new Object[] { "Portugal", "Senegal", 1 };
        Object[] object18 = new Object[] { "Portugal", "Morocco", 1 };
        Object[] object19 = new Object[] { "Portugal", "South Africa", 3 };
        Object[] object20 = new Object[] { "France", "Angola", 1 };
        Object[] object21 = new Object[] { "France", "Senegal", 3 };
        Object[] object22 = new Object[] { "France", "Mali", 3 };
        Object[] object23 = new Object[] { "France", "Morocco", 3 };
        Object[] object24 = new Object[] { "France", "South Africa", 1 };
        Object[] object25 = new Object[] { "Spain", "Senegal", 1 };
        Object[] object26 = new Object[] { "Spain", "Morocco", 3 };
        Object[] object27 = new Object[] { "Spain", "South Africa", 1 };
        Object[] object28 = new Object[] { "England", "Angola", 1 };
        Object[] object29 = new Object[] { "England", "Senegal", 1 };
        Object[] object30 = new Object[] { "England", "Morocco", 2 };
        Object[] object31 = new Object[] { "England", "South Africa", 7 };
        Object[] object32 = new Object[] { "South Africa", "China", 5 };
        Object[] object33 = new Object[] { "South Africa", "India", 1 };
        Object[] object34 = new Object[] { "South Africa", "Japan", 3 };
        Object[] object35 = new Object[] { "Angola", "China", 5 };
        Object[] object36 = new Object[] { "Angola", "India", 1 };
        Object[] object37 = new Object[] { "Angola", "Japan", 3 };
        Object[] object38 = new Object[] { "Senegal", "China", 5 };
        Object[] object39 = new Object[] { "Senegal", "India", 1 };
        Object[] object40 = new Object[] { "Senegal", "Japan", 3 };
        Object[] object41 = new Object[] { "Mali", "China", 5 };
        Object[] object42 = new Object[] { "Mali", "India", 1 };
        Object[] object43 = new Object[] { "Mali", "Japan", 3 };
        Object[] object44 = new Object[] { "Morocco", "China", 5 };
        Object[] object45 = new Object[] { "Morocco", "India", 1 };
        Object[] object46 = new Object[] { "Morocco", "Japan", 3 };
        series1.setData(new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21, object22, object23, object24, object25, object26, object27, object28, object29, object30, object31, object32, object33, object34, object35, object36, object37, object38, object39, object40, object41, object42, object43, object44, object45, object46)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));
        HIChart chart = new HIChart();
        chart.setZoomType("xy");
        options.setChart(chart);
        chartView.setOptions(options);*/


              chartView.plugins = new ArrayList<>(Arrays.asList("sankey"));
        HIOptions options = new HIOptions();
        HITitle title = new HITitle();
        title.setText("Highcharts Sankey Diagram");
        options.setTitle(title);
        HIChart chart = new HIChart();
        chart.setType("sankey");
        chart.setZoomType("x");
        options.setChart(chart);




        HIXAxis xaxis = new HIXAxis();
        xaxis.setType("sankey");
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

//        HIYAxis yaxis = new HIYAxis();
//        yaxis.setTitle(new HITitle());
//        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});
//
//        HITooltip tooltip = new HITooltip();
//        tooltip.setShadow(true);
//        tooltip.setValueSuffix("°C");
//        options.setTooltip(tooltip);
//
//        HILegend legend = new HILegend();
//        legend.setEnabled(false);
//        options.setLegend(legend);




      /*
        HIColumn series = new HIColumn();
        series.setName("Temperatures");
        series.setData(new ArrayList<>(Arrays.asList(49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)));
        options.setSeries(new ArrayList<>(Arrays.asList(series)));*/
        HISankey series1 = new HISankey();
        series1.setEnableMouseTracking(false);
        String[] keys = new String[] {"from", "to", "weight" };
        series1.setKeys(new ArrayList<>(Arrays.asList(keys)));
        series1.setName("Sankey demo series");
        Object[] object1 = new Object[] { "Brazil", "Portugal", 5 };
        Object[] object2 = new Object[] { "Brazil", "France", 1 };
        Object[] object3 = new Object[] { "Brazil", "Spain", 1 };
        Object[] object4 = new Object[] { "Brazil", "England", 1 };
        Object[] object5 = new Object[] { "Canada", "Portugal", 1 };
//        Object[] object6 = new Object[] { "Canada", "France", 5 };
//        Object[] object7 = new Object[] { "Canada", "England", 1 };
//        Object[] object8 = new Object[] { "Mexico", "Portugal", 1 };
//        Object[] object9 = new Object[] { "Mexico", "France", 1 };
//        Object[] object10 = new Object[] { "Mexico", "Spain", 5 };
//        Object[] object11 = new Object[] { "Mexico", "England", 1 };
        Object[] object12 = new Object[] { "USA", "Portugal", 1 };
//        Object[] object13 = new Object[] { "USA", "France", 1 };
//        Object[] object14 = new Object[] { "USA", "Spain", 1 };
//        Object[] object15 = new Object[] { "USA", "England", 5 };
//        Object[] object16 = new Object[] { "Portugal", "Angola", 2 };
        Object[] object17 = new Object[] { "Portugal", "Senegal", 1 };
//        Object[] object18 = new Object[] { "Portugal", "Morocco", 1 };
//        Object[] object19 = new Object[] { "Portugal", "South Africa", 3 };
//        Object[] object20 = new Object[] { "France", "Angola", 1 };
//        Object[] object21 = new Object[] { "France", "Senegal", 3 };
//        Object[] object22 = new Object[] { "France", "Mali", 3 };
//        Object[] object23 = new Object[] { "France", "Morocco", 3 };
//        Object[] object24 = new Object[] { "France", "South Africa", 1 };
//        Object[] object25 = new Object[] { "Spain", "Senegal", 1 };
//        Object[] object26 = new Object[] { "Spain", "Morocco", 3 };
//        Object[] object27 = new Object[] { "Spain", "South Africa", 1 };
//        Object[] object28 = new Object[] { "England", "Angola", 1 };
//        Object[] object29 = new Object[] { "England", "Senegal", 1 };
//        Object[] object30 = new Object[] { "England", "Morocco", 2 };
//        Object[] object31 = new Object[] { "England", "South Africa", 7 };
//        Object[] object32 = new Object[] { "South Africa", "China", 5 };
//        Object[] object33 = new Object[] { "South Africa", "India", 1 };
//        Object[] object34 = new Object[] { "South Africa", "Japan", 3 };
//        Object[] object35 = new Object[] { "Angola", "China", 5 };
//        Object[] object36 = new Object[] { "Angola", "India", 1 };
//        Object[] object37 = new Object[] { "Angola", "Japan", 3 };
//        Object[] object38 = new Object[] { "Senegal", "China", 5 };
//        Object[] object39 = new Object[] { "Senegal", "India", 1 };
//        Object[] object40 = new Object[] { "Senegal", "Japan", 3 };
//        Object[] object41 = new Object[] { "Mali", "China", 5 };
//        Object[] object42 = new Object[] { "Mali", "India", 1 };
//        Object[] object43 = new Object[] { "Mali", "Japan", 3 };
//        Object[] object44 = new Object[] { "Morocco", "China", 5 };
//        Object[] object45 = new Object[] { "Morocco", "India", 1 };
//        Object[] object46 = new Object[] { "Morocco", "Japan", 3 };
        series1.setData(new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21, object22, object23)));
//        series1.setData(new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21, object22, object23, object24, object25, object26, object27, object28, object29, object30, object31, object32, object33, object34, object35, object36, object37, object38, object39, object40, object41, object42, object43, object44, object45, object46)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

        chartView.setOptions(options);


/*

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("arearange");
        chart.setZoomType("xy");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Temperature variation by day");
        options.setTitle(title);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setType("datetime");
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setShadow(true);
        tooltip.setValueSuffix("°C");
        options.setTooltip(tooltip);

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HIColumn series = new HIColumn();
        series.setName("Temperatures");

        series.setData(new ArrayList<>(Arrays.asList(49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)));
        options.setSeries(new ArrayList<>(Arrays.asList(series)));

        chartView.setOptions(options);




*/




  /*      HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("arearange");
        chart.setZoomType("xy");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Temperature variation by day");
        options.setTitle(title);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setType("datetime");
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setShadow(true);
        tooltip.setValueSuffix("°C");
        options.setTooltip(tooltip);

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HIArearange series = new HIArearange();
        series.setName("Temperatures");

        Object[][] seriesData = new Object[][]{
                {1388538000000L, 1.1, 4.7},
                {1388624400000L, 1.8, 6.4},
                {1388710800000L, 1.7, 6.9},
                {1388797200000L, 2.6, 7.4},
                {1388883600000L, 3.3, 9.3},
                {1388970000000L, 3.0, 7.9},
                {1389056400000L, 3.9, 6.0},
                {1389142800000L, 3.9, 5.5},
                {1389229200000L, -0.6, 4.5},
                {1389315600000L, -0.5, 5.3},
                {1389402000000L, -0.3, 2.4},
                {1389488400000L, -6.5, -0.4},
                {1389574800000L, -7.3, -3.4},
                {1389661200000L, -7.3, -2.3},
                {1389747600000L, -7.9, -4.2},
                {1389834000000L, -4.7, 0.9},
                {1389920400000L, -1.2, 0.4},
                {1390006800000L, -2.3, -0.1},
                {1390093200000L, -2.0, 0.3},
                {1390179600000L, -5.1, -2.0},
                {1390266000000L, -4.4, -0.5},
                {1390352400000L, -6.4, -2.7},
                {1390438800000L, -3.2, -0.5},
                {1390525200000L, -5.5, -0.8},
                {1390611600000L, -4.4, 2.4},
                {1390698000000L, -4.0, 1.1},
                {1390784400000L, -3.4, 0.8},
                {1390870800000L, -1.7, 2.6},
                {1390957200000L, -3.1, 3.9},
                {1391043600000L, -4.8, -1.9},
                {1391130000000L, -7.0, -2.8},
                {1391216400000L, -2.7, 2.6},
                {1391302800000L, -1.3, 8.2},
                {1391389200000L, 1.5, 7.7},
                {1391475600000L, -0.5, 5.3},
                {1391562000000L, -0.2, 5.2},
                {1391648400000L, 0.7, 4.8},
                {1391734800000L, 0.9, 5.7},
                {1391821200000L, 1.7, 3.9},
                {1391907600000L, 2.2, 8.8},
                {1391994000000L, 3.0, 6.6},
                {1392080400000L, 1.4, 5.4},
                {1392166800000L, 0.6, 5.1},
                {1392253200000L, 0.1, 7.8},
                {1392339600000L, 3.4, 7.3},
                {1392426000000L, 2.0, 5.9},
                {1392512400000L, 1.1, 4.7},
                {1392598800000L, 1.1, 4.4},
                {1392685200000L, -2.8, 2.6},
                {1392771600000L, -5.0, 0.1},
                {1392858000000L, -5.7, 0.2},
                {1392944400000L, -0.7, 3.9},
                {1393030800000L, 1.5, 7.8},
                {1393117200000L, 5.5, 8.8},
                {1393203600000L, 5.3, 11.7},
                {1393290000000L, 1.7, 11.1},
                {1393376400000L, 3.4, 9.3},
                {1393462800000L, 3.4, 7.3},
                {1393549200000L, 4.5, 8.0},
                {1393635600000L, 2.1, 8.9},
                {1393722000000L, 0.6, 6.1},
                {1393808400000L, 1.2, 9.4},
                {1393981200000L, 3.9, 9.5},
                {1394067600000L, 5.3, 9.9},
                {1394154000000L, 2.7, 7.1},
                {1394240400000L, 4.0, 8.6},
                {1394326800000L, 6.1, 10.7},
                {1394413200000L, 4.2, 7.6},
                {1394499600000L, 2.5, 9.0},
                {1394586000000L, 0.2, 7.0},
                {1394672400000L, -1.2, 6.9},
                {1394758800000L, 0.4, 6.7},
                {1394845200000L, 0.2, 5.1},
                {1394931600000L, -0.1, 6.0},
                {1395018000000L, 1.0, 5.6},
                {1395104400000L, -1.1, 6.3},
                {1395190800000L, -1.9, 0.3},
                {1395277200000L, 0.3, 4.5},
                {1395363600000L, 2.4, 6.7},
                {1395450000000L, 3.2, 9.2},
                {1395536400000L, 1.7, 3.6},
                {1395622800000L, -0.3, 7.9},
                {1395709200000L, -2.4, 8.6},
                {1395795600000L, -1.7, 10.3},
                {1395882000000L, 4.1, 10.0},
                {1395968400000L, 4.4, 14.0},
                {1396054800000L, 3.3, 11.0},
                {1396141200000L, 3.0, 12.5},
                {1396224000000L, 1.4, 10.4},
                {1396310400000L, -1.2, 8.8},
                {1396396800000L, 2.2, 7.6},
                {1396483200000L, -1.0, 10.1},
                {1396569600000L, -1.8, 9.5},
                {1396656000000L, 0.2, 7.7},
                {1396742400000L, 3.7, 6.4},
                {1396828800000L, 5.8, 11.4},
                {1396915200000L, 5.4, 8.7},
                {1397001600000L, 4.5, 12.2},
                {1397088000000L, 3.9, 8.4},
                {1397174400000L, 4.5, 8.0},
                {1397260800000L, 6.6, 8.4},
                {1397347200000L, 3.7, 7.3},
                {1397433600000L, 3.6, 6.7},
                {1397520000000L, 3.5, 8.3},
                {1397606400000L, 1.5, 10.2},
                {1397692800000L, 4.9, 9.4},
                {1397779200000L, 3.5, 12.0},
                {1397865600000L, 1.5, 13.1},
                {1397952000000L, 1.7, 15.6},
                {1398038400000L, 1.4, 16.0},
                {1398124800000L, 3.0, 18.4},
                {1398211200000L, 5.6, 18.8},
                {1398297600000L, 5.7, 17.2},
                {1398384000000L, 4.5, 16.4},
                {1398470400000L, 3.1, 17.6},
                {1398556800000L, 4.7, 18.9},
                {1398643200000L, 4.9, 16.6},
                {1398729600000L, 6.8, 15.6},
                {1398816000000L, 2.8, 9.2},
                {1398902400000L, -2.7, 10.5},
                {1398988800000L, -1.9, 10.9},
                {1399075200000L, 4.5, 8.5},
                {1399161600000L, -0.6, 10.4},
                {1399248000000L, 4.0, 9.7},
                {1399334400000L, 5.5, 9.5},
                {1399420800000L, 6.5, 13.2},
                {1399507200000L, 3.2, 14.5},
                {1399593600000L, 2.1, 13.5},
                {1399680000000L, 6.5, 15.6},
                {1399766400000L, 5.7, 16.2},
                {1399852800000L, 6.3, 15.3},
                {1399939200000L, 5.3, 15.3},
                {1400025600000L, 6.0, 14.1},
                {1400112000000L, 1.9, 7.7},
                {1400198400000L, 7.2, 9.8},
                {1400284800000L, 8.9, 15.2},
                {1400371200000L, 9.1, 20.5},
                {1400457600000L, 8.4, 17.9},
                {1400544000000L, 6.8, 21.5},
                {1400630400000L, 7.6, 14.1},
                {1400716800000L, 11.1, 16.5},
                {1400803200000L, 9.3, 14.3},
                {1400889600000L, 10.4, 19.3},
                {1400976000000L, 5.7, 19.4},
                {1401062400000L, 7.9, 17.9},
                {1401148800000L, 5.0, 22.5},
                {1401235200000L, 7.6, 22.0},
                {1401321600000L, 5.7, 21.9},
                {1401408000000L, 4.6, 20.0},
                {1401494400000L, 7.0, 22.0},
                {1401580800000L, 5.1, 20.6},
                {1401667200000L, 6.6, 24.6},
                {1401753600000L, 9.7, 22.2},
                {1401840000000L, 9.6, 21.6},
                {1401926400000L, 13.0, 20.0},
                {1402012800000L, 12.9, 18.2},
                {1402099200000L, 8.5, 23.2},
                {1402185600000L, 9.2, 21.4},
                {1402272000000L, 10.5, 22.0},
                {1402358400000L, 7.3, 23.4},
                {1402444800000L, 12.1, 18.2},
                {1402531200000L, 11.1, 13.3},
                {1402617600000L, 10.0, 20.7},
                {1402704000000L, 5.8, 23.4},
                {1402790400000L, 7.4, 20.1},
                {1402876800000L, 10.3, 21.9},
                {1402963200000L, 7.8, 16.8},
                {1403049600000L, 11.6, 19.7},
                {1403136000000L, 9.8, 16.0},
                {1403222400000L, 10.7, 14.4},
                {1403308800000L, 9.0, 15.5},
                {1403395200000L, 5.1, 13.3},
                {1403481600000L, 10.0, 19.3},
                {1403568000000L, 5.2, 22.1},
                {1403654400000L, 6.3, 21.3},
                {1403740800000L, 5.5, 21.1},
                {1403827200000L, 8.4, 19.7},
                {1403913600000L, 7.1, 23.3},
                {1404000000000L, 6.1, 20.8},
                {1404086400000L, 8.4, 22.6},
                {1404172800000L, 7.6, 23.3},
                {1404259200000L, 8.1, 21.5},
                {1404345600000L, 11.2, 18.1},
                {1404432000000L, 6.4, 14.9},
                {1404518400000L, 12.7, 23.1},
                {1404604800000L, 15.3, 21.7},
                {1404691200000L, 15.1, 19.4},
                {1404777600000L, 10.8, 22.8},
                {1404864000000L, 15.8, 29.7},
                {1404950400000L, 15.8, 29.0},
                {1405036800000L, 15.2, 30.5},
                {1405123200000L, 14.9, 28.1},
                {1405209600000L, 13.1, 27.4},
                {1405296000000L, 15.5, 23.5},
                {1405382400000L, 14.7, 20.1},
                {1405468800000L, 14.4, 16.8},
                {1405555200000L, 12.6, 18.5},
                {1405641600000L, 13.9, 24.4},
                {1405728000000L, 11.3, 26.9},
                {1405814400000L, 13.3, 27.4},
                {1405900800000L, 13.3, 29.7},
                {1405987200000L, 14.0, 28.8},
                {1406073600000L, 14.1, 29.8},
                {1406160000000L, 15.4, 31.1},
                {1406246400000L, 17.0, 26.5},
                {1406332800000L, 16.6, 27.1},
                {1406419200000L, 13.3, 25.6},
                {1406505600000L, 16.8, 21.9},
                {1406592000000L, 16.0, 22.8},
                {1406678400000L, 14.4, 19.0},
                {1406764800000L, 12.8, 18.1},
                {1406851200000L, 12.6, 18.0},
                {1406937600000L, 11.4, 19.7},
                {1407024000000L, 13.9, 18.9},
                {1407110400000L, 12.5, 19.9},
                {1407196800000L, 12.3, 23.4},
                {1407283200000L, 12.8, 23.3},
                {1407369600000L, 11.0, 20.4},
                {1407456000000L, 14.7, 22.4},
                {1407542400000L, 11.1, 23.6},
                {1407628800000L, 13.5, 20.7},
                {1407715200000L, 13.7, 23.1},
                {1407801600000L, 12.8, 19.6},
                {1407888000000L, 12.1, 18.7},
                {1407974400000L, 8.8, 22.4},
                {1408060800000L, 8.2, 20.1},
                {1408147200000L, 10.9, 16.3},
                {1408233600000L, 10.7, 16.1},
                {1408320000000L, 11.0, 18.9},
                {1408406400000L, 12.1, 14.7},
                {1408492800000L, 11.2, 14.4},
                {1408579200000L, 9.9, 16.6},
                {1408665600000L, 6.9, 15.7},
                {1408752000000L, 8.9, 15.3},
                {1408838400000L, 8.2, 17.6},
                {1408924800000L, 8.4, 19.5},
                {1409011200000L, 6.6, 19.9},
                {1409097600000L, 6.4, 19.7},
                {1409184000000L, null, null},
                {1409270400000L, null, null},
                {1409356800000L, null, null},
                {1409443200000L, null, null},
                {1409529600000L, null, null},
                {1409616000000L, null, null},
                {1409702400000L, null, null},
                {1409788800000L, null, null},
                {1409875200000L, null, null},
                {1409961600000L, 13.4, 13.4},
                {1410048000000L, 13.2, 17.1},
                {1410134400000L, 11.9, 18.9},
                {1410220800000L, 9.0, 15.9},
                {1410307200000L, 5.9, 17.5},
                {1410393600000L, 6.8, 16.2},
                {1410480000000L, 10.3, 19.9},
                {1410566400000L, 8.7, 17.9},
                {1410652800000L, 7.9, 19.1},
                {1410739200000L, 6.0, 20.1},
                {1410825600000L, 4.7, 19.9},
                {1410912000000L, 4.0, 18.8},
                {1410998400000L, 4.5, 17.9},
                {1411084800000L, 3.1, 16.1},
                {1411171200000L, 8.5, 12.2},
                {1411257600000L, 7.6, 13.8},
                {1411344000000L, 1.3, 12.6},
                {1411430400000L, 2.0, 10.9},
                {1411516800000L, 5.0, 10.8},
                {1411603200000L, 6.4, 10.1},
                {1411689600000L, 8.2, 13.3},
                {1411776000000L, 8.9, 11.8},
                {1411862400000L, 9.9, 15.9},
                {1411948800000L, 5.2, 12.5},
                {1412035200000L, 4.6, 11.7},
                {1412121600000L, 8.8, 12.1},
                {1412208000000L, 3.9, 12.3},
                {1412294400000L, 2.7, 18.1},
                {1412380800000L, 10.2, 18.2},
                {1412467200000L, 9.6, 17.9},
                {1412553600000L, 9.3, 17.5},
                {1412640000000L, 8.1, 12.7},
                {1412726400000L, 6.7, 11.2},
                {1412812800000L, 4.0, 10.0},
                {1412899200000L, 6.3, 10.2},
                {1412985600000L, 6.6, 10.7},
                {1413072000000L, 6.6, 10.3},
                {1413158400000L, 5.9, 10.4},
                {1413244800000L, 1.2, 10.6},
                {1413331200000L, -0.1, 9.2},
                {1413417600000L, -1.0, 9.4},
                {1413504000000L, -1.7, 8.3},
                {1413590400000L, -0.6, 7.5},
                {1413676800000L, 6.9, 10.1},
                {1413763200000L, 7.7, 10.5},
                {1413849600000L, 3.8, 9.7},
                {1413936000000L, 6.2, 8.6},
                {1414022400000L, 6.5, 9.2},
                {1414108800000L, 7.9, 10.7},
                {1414195200000L, 6.1, 10.9},
                {1414281600000L, 10.3, 13.1},
                {1414371600000L, 7.1, 13.3},
                {1414458000000L, 0.0, 10.1},
                {1414544400000L, 0.0, 5.7},
                {1414630800000L, 3.9, 4.6},
                {1414717200000L, 4.0, 4.8},
                {1414803600000L, 4.8, 11.2},
                {1414890000000L, 7.0, 8.5},
                {1414976400000L, 3.0, 9.8},
                {1415062800000L, 2.8, 5.9},
                {1415149200000L, 0.8, 4.8},
                {1415235600000L, -0.2, 2.9},
                {1415322000000L, -0.6, 5.5},
                {1415408400000L, 6.6, 10.3},
                {1415494800000L, 5.4, 7.3},
                {1415581200000L, 3.0, 8.4},
                {1415667600000L, 0.4, 3.2},
                {1415754000000L, -0.1, 6.8},
                {1415840400000L, 4.8, 8.8},
                {1415926800000L, 4.6, 8.5},
                {1416013200000L, 4.3, 7.7},
                {1416099600000L, 3.3, 7.5},
                {1416186000000L, -0.4, 3.2},
                {1416272400000L, 1.9, 4.7},
                {1416358800000L, -0.2, 3.7},
                {1416445200000L, -1.3, 2.1},
                {1416531600000L, -1.8, 0.9},
                {1416618000000L, -2.7, 1.3},
                {1416704400000L, 0.3, 2.5},
                {1416790800000L, 3.4, 6.5},
                {1416877200000L, 0.8, 6.1},
                {1416963600000L, -1.0, 1.3},
                {1417050000000L, 0.4, 3.1},
                {1417136400000L, -1.2, 1.9},
                {1417222800000L, -1.1, 2.8},
                {1417309200000L, -0.7, 1.8},
                {1417395600000L, 0.5, 2.5},
                {1417482000000L, 1.4, 3.2},
                {1417568400000L, 4.5, 10.2},
                {1417654800000L, 0.4, 10.0},
                {1417741200000L, 2.5, 3.7},
                {1417827600000L, 1.1, 5.0},
                {1417914000000L, 2.0, 4.4},
                {1418000400000L, 1.4, 2.2},
                {1418086800000L, 0.7, 4.6},
                {1418173200000L, 1.9, 3.9},
                {1418259600000L, -0.2, 3.7},
                {1418346000000L, -0.1, 1.7},
                {1418432400000L, -1.0, 3.8},
                {1418518800000L, 0.5, 5.4},
                {1418605200000L, -1.7, 5.6},
                {1418691600000L, 0.3, 2.8},
                {1418778000000L, -3.0, 0.4},
                {1418864400000L, -1.1, 1.5},
                {1418950800000L, 0.8, 3.4},
                {1419037200000L, 0.9, 4.4},
                {1419123600000L, 0.3, 3.9},
                {1419210000000L, 0.6, 5.3},
                {1419296400000L, 1.5, 4.4},
                {1419382800000L, null, null},
                {1419469200000L, null, null},
                {1419555600000L, -4.2, -4.1},
                {1419642000000L, -10.2, -5.2},
                {1419728400000L, -8.4, -4.1},
                {1419814800000L, -5.2, 2.4},
                {1419901200000L, 1.3, 2.5},
                {1419987600000L, 1.6, 4.2}
        };
        series.setData(new ArrayList<>(Arrays.asList(seriesData)));
        options.setSeries(new ArrayList<>(Arrays.asList(series)));

        chartView.setOptions(options);
*/

       /* chartView.setOnTouchListener(new View.OnTouchListener() {
            private GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onDoubleTap(MotionEvent e) {
                    // Zoom in
                    chartView.zoom(0.5); // Adjust the zoom level as needed
                    return true;
                }

                @Override
                public boolean onDoubleTapEvent(MotionEvent e) {
                    return true;
                }

                @Override
                public boolean onSingleTapConfirmed(MotionEvent e) {
                    // Zoom out
                    chartView.getCh.zoom(-0.5); // Adjust the zoom level as needed
                    return true;
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });*/
//        myRoot.addView(chartView);
//        myRoot.addView(txt);
//        layout.addView(myRoot);
    }
}
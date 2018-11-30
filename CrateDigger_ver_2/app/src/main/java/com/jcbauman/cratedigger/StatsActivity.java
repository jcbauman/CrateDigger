package com.jcbauman.cratedigger;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatsActivity extends AppCompatActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(true);
        pieChart.setExtraOffsets(5,10,5,5);

        pieChart.setDragDecelerationFrictionCoef(0.99f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.BLACK);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"ROCK"));
        yValues.add(new PieEntry(15f,"SOUL/FUNK"));
        yValues.add(new PieEntry(34f,"RAP/HIP HOP/R&B"));
        yValues.add(new PieEntry(34f,"CLASSICAL"));
        yValues.add(new PieEntry(66f,"ELECTRONIC"));
        yValues.add(new PieEntry(34f,"WORLD"));
        yValues.add(new PieEntry(34f,"JAZZ"));

        pieChart.animateY(1000, Easing.EasingOption.EaseInOutCirc);

        Description description = new Description();
        description.setText("");
        pieChart.setDescription(description);

        pieChart.getLegend().setEnabled(false);

        PieDataSet dataSet = new PieDataSet(yValues,"Your Genre Stats");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        PieData data = new PieData(dataSet);
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);


    }
}
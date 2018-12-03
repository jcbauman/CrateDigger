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
    SQLiteDBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        //getSupportActionBar().setTitle("Your Genre Stats");

        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(true);
        pieChart.setExtraOffsets(5,10,5,5);

        pieChart.setDragDecelerationFrictionCoef(0.99f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.BLACK);
        pieChart.setTransparentCircleRadius(61f);

        //initialize genre counts
        int rock = 0;
        int soul = 0;
        int hip = 0;
        int alt = 0;
        int electro = 0;
        int world = 0;
        int other = 0;

        //accessing song data
        dbHelper = new SQLiteDBHelper(StatsActivity.this);
        dbHelper.getWritableDatabase();
        ArrayList<SongObject> list = dbHelper.getAllSongs();
        ArrayList<PieEntry> yValues = new ArrayList<>();
        if(list.size() > 0) {
            for(SongObject songo: list){
                String genre = songo.getSongGenre();
                if(genre.equals("Rock")){
                    rock++;
                }
                if(genre.equals("Soul/Funk/R&B")){
                    soul++;
                }
                if(genre.equals("Hip-Hop/Rap")){
                    hip++;
                }
                if(genre.equals("Alternative/Indie")){
                    alt++;
                }
                if(genre.equals("Dance/Electronic")){
                    electro++;
                }
                if(genre.equals("World")){
                    world++;
                }
                if(genre.equals("Other")){
                    other++;
                }
            }
            if(rock>0){
                yValues.add(new PieEntry(rock,"Rock"));
            }
            if(soul>0){
                yValues.add(new PieEntry(soul,"Soul/Funk/R&B"));
            }
            if(hip>0){
                yValues.add(new PieEntry(hip,"Hip-Hop/Rap"));
            }
            if(alt>0){
                yValues.add(new PieEntry(alt,"Alternative/Indie"));
            }
            if(electro>0){
                yValues.add(new PieEntry(electro,"Dance/Electronic"));
            }
            if(world>0){
                yValues.add(new PieEntry(world,"World"));
            }
            if(other>0){
                yValues.add(new PieEntry(other,"Other"));
            }
        } else{
            yValues.add(new PieEntry(34f,"No songs liked yet"));
        }

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
        data.setValueTextSize(0);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);


    }
}
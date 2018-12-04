package com.jcbauman.cratedigger;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

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
    Toolbar toolbar;
    TextView genreText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Your Genre Stats");


        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(true);
        pieChart.setExtraOffsets(5,30,5,5);

        pieChart.setDragDecelerationFrictionCoef(0.99f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.BLACK);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues = new ArrayList<>();
        int[] genreVals = getGenreStatistics();
        if(genreVals[0]>0){
            yValues.add(new PieEntry(genreVals[0],"Rock"));
        }
        if(genreVals[1]>0){
            yValues.add(new PieEntry(genreVals[1],"Soul/Funk/R&B"));
        }
        if(genreVals[2]>0){
            yValues.add(new PieEntry(genreVals[2],"Hip-Hop/Rap"));
         }
         if(genreVals[3]>0){
            yValues.add(new PieEntry(genreVals[3],"Alternative/Indie"));
        }
        if(genreVals[4]>0){
            yValues.add(new PieEntry(genreVals[4],"Dance/Electronic"));
        }
        if(genreVals[5]>0){
            yValues.add(new PieEntry(genreVals[5],"World"));
        }
        if(genreVals[6]>0){
            yValues.add(new PieEntry(genreVals[6],"Other"));
        }
        if(genreVals[7]>0){
            yValues.add(new PieEntry(genreVals[7],"Jazz"));
        }
        //add in case of empty set
        genreText = (TextView)findViewById(R.id.genreMessage);
        if(yValues.size()==0) {
            yValues.add(new PieEntry(34f, "No songs liked yet"));
            genreText.setText("Swipe on more songs to see your stats.");
        }
        else{
            genreText.setText("You have been digging the '" + getTopGenre(genreVals) + "' genre most.");
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

    public int[] getGenreStatistics(){
        int rock = 0, soul = 0, hip = 0, alt = 0, electro = 0, world = 0, other = 0, jazz = 0;
        dbHelper = new SQLiteDBHelper(StatsActivity.this);
        dbHelper.getWritableDatabase();
        ArrayList<SongObject> list = dbHelper.getLikedSongs();
        if(list.size() > 0) {
            for (SongObject songo : list) {
                String genre = songo.getSongGenre();
                if (genre.equals("Rock")) {
                    rock++;
                }
                if (genre.equals("Soul/Funk/R&B")) {
                    soul++;
                }
                if (genre.equals("Hip-Hop/Rap")) {
                    hip++;
                }
                if (genre.equals("Alternative/Indie")) {
                    alt++;
                }
                if (genre.equals("Dance/Electronic")) {
                    electro++;
                }
                if (genre.equals("World")) {
                    world++;
                }
                if (genre.equals("Other")) {
                    other++;
                }
                if (genre.equals("Jazz")) {
                    jazz++;
                }
            }
        }
        int[] songVal = {rock, soul, hip, alt, electro, world, other, jazz};
        return songVal;
    }

    public String getTopGenre(int[] songVal){
        String max = "";
        int maxVal = 0;
        int maxIndex = -1;
        for(int i = 0;i<songVal.length;i++){
            if(songVal[i]>maxVal){
                maxVal = songVal[i];
                maxIndex = i;
            }
        }
        if(maxVal>0){
            if(maxIndex == 0){
                max = "Rock";
            }
            if(maxIndex == 1){
                max = "Soul/Funk/R&B";
            }
            if(maxIndex == 2){
                max = "Hip-Hop/Rap";
            }
            if(maxIndex == 3){
                max = "Alternative/Indie";
            }
            if(maxIndex == 4){
                max = "Dance/Electronic";
            }
            if(maxIndex == 5){
                max = "World";
            }
            if(maxIndex == 6){
                max = "Other";
            }
            if(maxIndex == 7){
                max = "Jazz";
            }
        }
        return max;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.stats,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.BackToMain:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
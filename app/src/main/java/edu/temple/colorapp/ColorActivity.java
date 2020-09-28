package edu.temple.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner mySpinner = findViewById(R.id.spinner);
        View myBackground = findViewById(R.id.background);
        String[] myColors = {"RED", "BLUE", "YELLOW", "GREEN", "AQUA", "PURPLE", "GREY", "MAGENTA", "CYAN", "WHITE"};
        ColorAdapter myColorAdapter = new ColorAdapter(getApplicationContext(), myColors);
        mySpinner.setAdapter(myColorAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class colorActivity extends AppCompatActivity {

    String color[] = {"blue", "red", "green", "yellow", "purple", "magenta"};
    colorAdapter Adapter;
    RelativeLayout Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner1);
        Adapter = new colorAdapter(colorActivity.this, color);
        spinner.setAdapter(Adapter);
        Layout = findViewById(R.id.layout1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String colorChoice = parent.getSelectedItem().toString();
                view.findViewById(R.id.tvColor).setBackgroundColor(Color.WHITE);
                Layout.setBackgroundColor(Color.parseColor(colorChoice));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
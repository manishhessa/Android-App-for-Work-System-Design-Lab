package com.example.wsdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openexperiments(View view){
        Toast.makeText(this, "Experiments tab is opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Experiments.class);
        startActivity(intent);
    }
    public void openstudymaterial(View view){
        Toast.makeText(this, "Study Material is opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Studymaterial.class);
        startActivity(intent);
    }
    public void openassignments(View view){
        Toast.makeText(this, "Assignment section is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Assignments.class);
        startActivity(intent);
    }
}
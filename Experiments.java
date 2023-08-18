package com.example.wsdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Experiments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiments);
    }
    public void openexperiment1(View view){
        Toast.makeText(this, "Experiment 1 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Experiment1.class);
        startActivity(intent);
    }
    public void openexperiment2(View view){
        Toast.makeText(this, "Experiment 2 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Experiment2.class);
        startActivity(intent);
    }
    public void openexperiment3(View view){
        Toast.makeText(this, "Experiment 3 is opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Experiment3.class);
        startActivity(intent);
    }
    public void openexperiment4(View view){
        Toast.makeText(this, "Experiment 4 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Experiment4.class);
        startActivity(intent);
    }
    public void openexperiment5(View view){
        Toast.makeText(this, "Experiment 5 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Experiment4.class);
        startActivity(intent);
    }
    public void openexperiment6(View view){
        Toast.makeText(this, "Experiment 6 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Experiment6.class);
        startActivity(intent);
    }
}
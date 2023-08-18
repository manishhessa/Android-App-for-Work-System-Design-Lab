package com.example.wsdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Assignments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);
    }
    public void openassignment1(View view){
        Toast.makeText(this, "Assignment 1 is opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Assignment1.class);
        startActivity(intent);
    }
    public void openassignment2(View view){
        Toast.makeText(this, "Assignment 2 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Assignment2.class);
        startActivity(intent);
    }
    public void openassignment3(View view){
        Toast.makeText(this, "Assignment 3 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Assignment3.class);
        startActivity(intent);
    }
    public void openassignment4(View view){
        Toast.makeText(this, "Assignment 4 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Assignment4.class);
        startActivity(intent);
    }
    public void openassignment5(View view){
        Toast.makeText(this, "Assignment 5 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Assignment5.class);
        startActivity(intent);
    }
    public void openassignment6(View view){
        Toast.makeText(this, "Assignment 6 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Assignment6.class);
        startActivity(intent);
    }
    public void openassignment7(View view){
        Toast.makeText(this, "Assignment 7 is Opened", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Assignment7.class);
        startActivity(intent);
    }
}
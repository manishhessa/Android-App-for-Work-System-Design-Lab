package com.example.wsdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Assignment1 extends AppCompatActivity {

    private static final int FILE_PICKER_REQUEST = 1;

    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment1);
        submit = findViewById(R.id.button18);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFilePicker();
            }
        });
    }
    public void opensubmit(View v){
        Toast.makeText(this, "Button is clicked", Toast.LENGTH_SHORT).show();
    }

    private void openFilePicker() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        startActivityForResult(intent, FILE_PICKER_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == FILE_PICKER_REQUEST && resultCode == RESULT_OK) {
            Uri uri = data.getData();
            // Use the Google Drive API to store the selected document in Google Drive
            // Perform necessary operations here
        }
    }

    // Other methods and lifecycle callbacks
}

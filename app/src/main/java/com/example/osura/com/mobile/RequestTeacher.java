package com.example.osura.com.mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RequestTeacher extends AppCompatActivity {
    private Spinner spinner;
    String[] SpinnerSubjects = {"Science","Maths","Chemistry","Physics"};
    String[] SpinnerLevels = {"A/l's","O/L's","University"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_teacher);

        ArrayAdapter<String> arrayAdapterSubject = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,SpinnerSubjects);
        Spinner subject = (Spinner) findViewById(R.id.spnSubject);
        subject.setAdapter(arrayAdapterSubject);

        ArrayAdapter<String> arrayAdapterLevel = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,SpinnerLevels);
        Spinner level = (Spinner) findViewById(R.id.spnLevel);
        level.setAdapter(arrayAdapterLevel);
    }

    public void searchButtonClicked(View view) {
    }
}

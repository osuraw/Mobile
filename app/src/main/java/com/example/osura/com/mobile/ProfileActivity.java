package com.example.osura.com.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.osura.com.mobile.R.*;
import static com.example.osura.com.mobile.R.id.lblAreaList;
import static com.example.osura.com.mobile.R.id.lblName;
import static com.example.osura.com.mobile.R.id.lblQualList;
import static com.example.osura.com.mobile.R.id.lblSubjectsList;
import static com.example.osura.com.mobile.R.id.lblWorkList;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_profile);
        Intent intent=getIntent();
        TextView textView=findViewById(R.id.lblName);
        textView.setText(intent.getStringExtra("name"));
        textView=findViewById(id.lblNic);
        textView.setText(intent.getStringExtra("nic"));

    }

    String subject = "", area="", qual="", work="";

    public void addSubject(View view) {
        EditText txtSubjects = findViewById(id.txtSubjects);
        TextView lblSubjects = findViewById(lblSubjectsList);
        subject = subject + txtSubjects.getText()+ ", ";
        lblSubjects.setText(subject);
        txtSubjects.setText("");

    }

    public void addArea(View view) {
        EditText txtArea = findViewById(id.txtArea);
        TextView lblArea = findViewById(lblAreaList);
        area = area + txtArea.getText() + ", ";
        lblArea.setText(area);
        txtArea.setText("");

    }

    public void addQual(View view) {
        EditText txtQual = findViewById(id.txtQual);
        TextView lblQual = findViewById(lblQualList);
        qual = qual + txtQual.getText() + ", ";
        lblQual.setText(qual);
        txtQual.setText("");

    }

    public void addWork(View view) {
        EditText txtWork = findViewById(id.txtWork);
        TextView lblWork = findViewById(lblWorkList);
        work = work + txtWork.getText() + ", ";
        lblWork.setText(work);
        txtWork.setText("");

    }
    public void update(View view) {
        
    }

}




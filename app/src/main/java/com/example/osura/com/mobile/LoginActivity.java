package com.example.osura.com.mobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Login(){
        EditText uname=(EditText)findViewById(R.id.txtUsername);
        EditText pword=(EditText)findViewById(R.id.txtPassword);

        String username=uname.getText().toString();
        String password=pword.getText().toString();
    }


}

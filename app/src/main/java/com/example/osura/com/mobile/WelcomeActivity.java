package com.example.osura.com.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    public void showLogin(View view){
        Intent intentLogin= new Intent( WelcomeActivity.this,LoginActivity.class);
        startActivity(intentLogin);
    }
    public void showSignup(View view){
        Intent intentSignup= new Intent(WelcomeActivity.this,SignupActivity.class);
        startActivity(intentSignup);
    }


}

package com.example.osura.com.mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void showNext(){
        EditText signup_Name=(EditText)findViewById(R.id.txtName);
        EditText signup_Nic=(EditText)findViewById(R.id.txtNIC);
        EditText signup_Contact=(EditText)findViewById(R.id.txtContact);
        EditText signup_Email=(EditText)findViewById(R.id.txtEmail);
        EditText signup_Address=(EditText)findViewById(R.id.txtAddress);


        String name=signup_Name.getText().toString();
        String nic=signup_Nic.getText().toString();
        String contact=signup_Contact.getText().toString();
        String email=signup_Email.getText().toString();
        String address=signup_Address.getText().toString();
    }
}

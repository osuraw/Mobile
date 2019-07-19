package com.example.osura.com.mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void showNext(View view) {
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

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("users");
        HashMap<String,String> data =new HashMap<>();
        data.put("name",name);
        data.put("nic",nic);
        data.put("contact",contact);
        data.put("email",email);
        data.put("address",address);
        databaseReference.push().setValue(data);


        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
        String userid="";
        intent.putExtra("userID",userid);
        intent.putExtra("name",name);
        intent.putExtra("nic",nic);
        intent.putExtra("contact",contact);
        intent.putExtra("email",email);
        intent.putExtra("address",address);
        startActivity(intent);
    }
}

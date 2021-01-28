package com.example.languages2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView name, pass;

        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);

        String names = getIntent().getExtras().getString("StudentName");

        String passw = getIntent().getExtras().getString("Password");

        name.setText(names);
        pass.setText(passw);
        //Toast.makeText(this, "welcome", Toast.LENGTH_SHORT).show();
    }
}
package com.example.languages2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        name = findViewById(R.id.editTextTextPersonName);

        pass = findViewById(R.id.editTextTextPassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                String names, passw;
                names = name.getText().toString();
                passw = pass.getText().toString();
                intent.putExtra("StudentName",names);
                intent.putExtra("Password", passw);
                startActivity(intent);
            }
        });
    }
}
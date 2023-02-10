package com.example.sports_tournament_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button signin, signup, about, help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        signin = findViewById(R.id.button1);
        signup = findViewById(R.id.button2);
        about = findViewById(R.id.button4);
        help = findViewById(R.id.button3);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignin();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignup();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }
        });

    }

    public void openSignin() {
        Intent intent = new Intent (this, signinjava.class);
        startActivity(intent);
    }

    public void openSignup() {
        Intent intent = new Intent (this, signupjava.class);
        startActivity(intent);
    }

    public void openAbout() {
        Intent intent = new Intent (this, aboutjava.class);
        startActivity(intent);
    }

    public void openHelp() {
        Intent intent = new Intent (this, helpjava.class);
        startActivity(intent);
    }


}
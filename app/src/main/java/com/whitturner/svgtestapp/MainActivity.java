package com.whitturner.svgtestapp;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//This launches the Revs Website activity
        ImageButton btn = findViewById(R.id.imageButton5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String url = "https://revsinstitute.org";
                bundle.putString("urlString", url);
                Intent intent = new Intent(MainActivity.this, WebActivity5.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
        );
//This launches the Revs Digital Library activity
        ImageButton btn1 = findViewById(R.id.imageButton7);
        btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Bundle bundle = new Bundle();
                 String url = "http://library.revsinstitute.org/digital/";
                 bundle.putString("urlString", url);
                 Intent intent = new Intent(MainActivity.this, WebActivity5.class);
                 intent.putExtras(bundle);
                 startActivity(intent);
             }
        }
        );

//This launches the Volunteer Docs activity
        ImageButton btn2 = findViewById(R.id.imageButton6);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String url = "https://revsinstitute.app.box.com/s/vvbgsfzfas3pthsgs7nq";
                bundle.putString("urlString", url);
                Intent intent = new Intent(MainActivity.this, WebActivity5.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
        );

//This launches the Training intent activity
        ImageButton btn3 = findViewById(R.id.imageButton);
        btn3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Bundle bundle = new Bundle();
                 String url = "https://revsinstitute.box.com/s/qmiqh458ahkqgp7ivg2x6c1qz9mb6cje";
                 bundle.putString("urlString", url);
                 Intent intent = new Intent(MainActivity.this, WebActivity5.class);
                 intent.putExtras(bundle);
                 startActivity(intent);
            }
        }
        );

// This will launch the Video activity - right now just points to Revs playlist on YouTube

        ImageButton btn4 = findViewById(R.id.imageButton4);
        btn4.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Bundle bundle = new Bundle();
                  String url = "https://www.youtube.com/watch?v=UzoolNs7sHQ&list=LLDRZAGaKZCrumZjGagUypIA";
                  bundle.putString("urlString", url);
                  Intent intent = new Intent(MainActivity.this, WebActivity5.class);
                  intent.putExtras(bundle);
                  startActivity(intent);
              }
        }
        );

//This launches the Tappet Clatter activity
        ImageButton btn5 = findViewById(R.id.imageButton3);
        btn5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                   Bundle bundle = new Bundle();
                   String url = "https://revsinstitute.box.com/s/h5pttf8nmif3stwbu1yyvjar3hba5grq";
                   bundle.putString("urlString", url);
                   Intent intent = new Intent(MainActivity.this, WebActivity5.class);
                   intent.putExtras(bundle);
                   startActivity(intent);
              }
        }
        );

//This launches the Collection Info Activity



        ImageButton btn6 = findViewById(R.id.imageButton1);
        btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Bundle bundle = new Bundle();
                        String url = "file:///android_asset/index.html#!file:///android_asset/ezguidev3.epub";
                        bundle.putString("urlString", url);
                        Intent intent = new Intent(MainActivity.this, WebActivity5.class);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
        }
        );



    //This launches the Calendar activity
        ImageButton btn7 = findViewById(R.id.imageButton2);
        btn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    String url = "https://calendar.google.com/calendar/b/2/r/month?tab=wc&pli=1&t=AKUaPmYIqjigCA9OQ8DLyfSzYjizZ7BGpCo_6XDO5i3aItUOieqgaiEeKVYe7zRHiKSy2njqvUcjqX6f6AfYBSkcC6UC4DqKtA%3D%3D";
                    bundle.putString("urlString", url);
                    Intent intent = new Intent(MainActivity.this, WebActivity5.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    }
        }
        );

//This launches the Volgistics activity
        ImageButton btn8 = findViewById(R.id.imageButton8);
        btn8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    Bundle bundle = new Bundle();
                    String url = "https://www.volgistics.com/ex2/vicnet.dll?FROM=110030";
                    bundle.putString("urlString", url);
                    Intent intent = new Intent(MainActivity.this, WebActivity5.class);intent.putExtras(bundle);
                    startActivity(intent);
                     }
        }
        );


}}
package com.whitturner.svgtestapp;

/**
 * Created by whit on 3/19/18.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class CollectionActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);


//This launches the ePubReader with binding to EZGuide.epub

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundle = new Bundle();
// change ePubViewer to load file from Box rather than android_asset; this must be a "direct" link in Box; performance seems acceptable
// for local asset, use String url = "file:///android_asset/index.html#!file:///android_asset/ezguidev3.epub";
            String url = "file:///android_asset/index.html#!https://revsinstitute.box.com/shared/static/gmo2sdc5nxbnrckf9rr649avglbi7kn8.epub";
            bundle.putString("urlString", url);
            Intent intent = new Intent(CollectionActivity.this, WebActivity5.class);
            intent.putExtras(bundle);
            startActivity(intent);
            }
        }
        );


//This launches the ePubReader with binding to the Volunteer eHandbook.epub
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundle = new Bundle();
            String url = "file:///android_asset/index.html#!https://revsinstitute.box.com/shared/static/046rt2sta2h0j3lh5smkwq6z53q2rvni.epub";
            bundle.putString("urlString", url);
            Intent intent = new Intent(CollectionActivity.this, WebActivity5.class);
            intent.putExtras(bundle);
            startActivity(intent);
            }
        }
        );

//This launches the gallery map
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                String url ="https://revsinstitute.box.com/s/5cl0ysmd7qvenzf2ujx0oryddwrwn53k";
                bundle.putString("urlString",url);
                Intent intent = new Intent(CollectionActivity.this, WebActivity5.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        Button btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                String url ="https://revsinstitute.box.com/s/b3xkaabrk7elup8y1b8494ar9xdbqrgl";
                bundle.putString("urlString",url);
                Intent intent = new Intent(CollectionActivity.this, WebActivity5.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                String url ="https://revsinstitute.box.com/s/9hnxieidllf42b8i2p8fbze1y7zktbki";
                bundle.putString("urlString",url);
                Intent intent = new Intent(CollectionActivity.this, WebActivity5.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}

//link to car adopt a car https://revsinstitute.box.com/s/3ztxgu0dszi3sdjhmvhtg783lkk2rjkz
package com.example.lenovo.newcustomlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the ABC News category
        TextView news = (TextView) findViewById(R.id.abc_news);

        // Set a click listener on that View
        news.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the ABC News category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ABCNewsActivity}
                Intent ABCNewsIntent = new Intent(MainActivity.this, ABCNewsActivity.class);
                Log.e("eee","llll");
                // Start the new activity
               MainActivity.this.startActivity(ABCNewsIntent);
            }
        });

        // Find the View that shows the The Washington Post category
        TextView TheWashingtonPost = (TextView) findViewById(R.id.the_washington_post);

        // Set a click listener on that View
        TheWashingtonPost.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the The Washington Post category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TheWashingtonPostActivity}
                Intent TheWashingtonPostIntent = new Intent(MainActivity.this, TheWashingtonPostActivity.class);

                // Start the new activity
                startActivity(TheWashingtonPostIntent);
            }
        });

        // Find the View that shows the Fox News category
        TextView FoxNews = (TextView) findViewById(R.id.fox_news);

        // Set a click listener on that View
        FoxNews.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Fox News category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoxNewsActivity}
                Intent FoxNewsIntent = new Intent(MainActivity.this, FoxNewsActivity.class);

                // Start the new activity
                startActivity(FoxNewsIntent);
            }
        });

        // Find the View that shows the CBS News category
        TextView CBSNews = (TextView) findViewById(R.id.cbs_news);

        // Set a click listener on that View
        CBSNews.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the CBS News category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CBSNewsActivity}
                Intent CBSNewsIntent = new Intent(MainActivity.this, CBSNewsActivity.class);

                // Start the new activity
                startActivity(CBSNewsIntent);
            }
        });
    }

   /* public void cbs(View view) {
        Intent CBSNewsIntent = new Intent(MainActivity.this, CBSNewsActivity.class);

        // Start the new activity
        startActivity(CBSNewsIntent);
    }*/
}

package com.example.arvidquarshie.simpletweet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity {
    private EditText et_tweet;
    private Button btn_post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views
        et_tweet = (EditText) findViewById(R.id.et_tweet);
        btn_post = (Button) findViewById(R.id.btn_post);

        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String tweet = et_tweet.getText().toString();
                sendTweet(tweet);
            }
        });
    }

        private void sendTweet(String tweet){
            //url to post to
final String url_to_post = "https://twitter.com/intent/tweet?text=";

            //tweet that we want to send
            final String composeTweet = url_to_post + tweet;

            //convert string to uri and send it over to the browser

            Uri uri = Uri.parse(composeTweet);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
    }


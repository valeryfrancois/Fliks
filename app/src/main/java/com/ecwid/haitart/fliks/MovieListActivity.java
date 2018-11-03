package com.ecwid.haitart.fliks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loopj.android.http.AsyncHttpClient;

public class MovieListActivity extends AppCompatActivity {

    // constants
    // the Base Url for the API
    public final static String API_BASE_URL = "Htpps://api.themoviedb.org/3";
    // The parameter for the API KEY
    public final static String API_KEY_PARAM = "api_key";
    // the API KEY -- TODO move to a source location
    public final static String API_KEY = "1577652f3a0009af62abe92f5ebb4c43";
    // instance Fields
    AsyncHttpClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
        //Initial the client
        client = new AsyncHttpClient();
    }
}

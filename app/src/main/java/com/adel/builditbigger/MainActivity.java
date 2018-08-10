package com.adel.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().
                add(R.id.fragment,new MainActivityFragment()).commit();
    }

    @SuppressWarnings("unchecked")
    public void tellJoke(View view) {
        ProgressBar progressBar = findViewById(R.id.progressbar);
        new EndpointsAsyncTask(this, progressBar).execute();
    }
}

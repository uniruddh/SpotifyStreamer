package com.astuter.spotifystreamer;

/**
 * Created by Aniruddh Bhilvare on 27/01/16.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private final String toastMsg = "This button will launch my ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.main_activity_title));
        setSupportActionBar(toolbar);

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        switch (button.getId()) {
            case R.id.btn_spotify_streamer:
                Toast.makeText(MainActivity.this, toastMsg + "Spotify Streamer App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores_app:
                Toast.makeText(MainActivity.this, toastMsg + "Scores App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_library_app:
                Toast.makeText(MainActivity.this, toastMsg + "Library App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build_it_bigger:
                Toast.makeText(MainActivity.this, toastMsg + "Build It Bigger App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz_reader:
                Toast.makeText(MainActivity.this, toastMsg + "XYZ Reader App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(MainActivity.this, toastMsg + "Capstone App!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

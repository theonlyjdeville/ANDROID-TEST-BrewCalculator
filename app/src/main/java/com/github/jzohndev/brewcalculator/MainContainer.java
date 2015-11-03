package com.github.jzohndev.brewcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainContainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_container);
        Button createButton  = (Button)findViewById(R.id.createProfileButton);
        Button saveButton = (Button)findViewById(R.id.saveProfileButton);
        Button loadButton = (Button)findViewById(R.id.loadProfileButton);
        createButton.setOnClickListener(createListener);
        saveButton.setOnClickListener(saveListener);
        loadButton.setOnClickListener(loadListener);
    }

    private View.OnClickListener createListener = new View.OnClickListener(){
        public void onClick(View v){
            Log.d(logtag, "onClick() called - create profile button");
            //
            Log.d(logtag, "onClick() dismissed - create profile button");
        }
    };

    private View.OnClickListener saveListener = new View.OnClickListener(){
        public void onClick(View v){
            Log.d(logtag, "onClick() called - save profile button");
            ////
            Log.d(logtag, "onClick() dismissed - save profile button");
        }
    };

    private View.OnClickListener loadListener = new View.OnClickListener(){
        public void onClick(View v){
            Log.d(logtag, "onClick() called - load profile button");
            //////
            Log.d(logtag, "onClick() dismissed - load profile button");
        }
    };





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_container, menu);
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

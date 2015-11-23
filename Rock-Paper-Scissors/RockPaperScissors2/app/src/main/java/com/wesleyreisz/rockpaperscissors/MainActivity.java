package com.wesleyreisz.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String CHOICE = "com.wesleyreisz.rockpaperscissors.choice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rockImage = (ImageView)findViewById(R.id.btnRock);
        rockImage.setOnClickListener(this);
        ImageView paperImage = (ImageView)findViewById(R.id.btnPaper);
        paperImage.setOnClickListener(this);
        ImageView scissorsImage = (ImageView)findViewById(R.id.btnScissors);
        scissorsImage.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        Log.d("Test", "I was clicked");
        Intent intent = new Intent(this,ResultsActivity.class);
        intent.putExtra(CHOICE, v.getId());
        startActivity(intent);
    }
}

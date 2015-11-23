package com.example.liltyrant.cis490hw2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.liltyrant.CIS490HW2.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    //public void DisplayAndroidActivity(View view){
    //    Intent intent = new Intent(this, DisplayAndroidActivity.class);

        //EditText editText = (EditText) findViewById(R.id.edit_message);
    //    ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);

        //String message = editText.getText().toString();
        //Image leimage = imageView.getDrawable(droidpic.png);
        //wtf is this shit

        //intent.putExtra(EXTRA_MESSAGE, message);
        //intent.putExtra(EXTRA_MESSAGE, message);
    //    startActivity(intent);
    //}
    public void displayImage(View view)
    {
        Intent intent = new Intent(this, DisplayAndroidActivity.class);
        startActivity(intent);
    }
}

package com.example.kidus.hello_pay;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txt = (TextView) findViewById(R.id.pay_txt);
        Typeface font = Typeface.createFromAsset(getAssets(), "berlin.ttf");
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.transfer_txt);
        font = Typeface.createFromAsset(getAssets(), "berlin.ttf");
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.recharge_txt);
        font = Typeface.createFromAsset(getAssets(), "berlin.ttf");
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.account_txt);
        font = Typeface.createFromAsset(getAssets(), "berlin.ttf");
        txt.setTypeface(font);
        txt = (TextView) findViewById(R.id.info_txt);
        font = Typeface.createFromAsset(getAssets(), "berlin.ttf");
        txt.setTypeface(font);



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

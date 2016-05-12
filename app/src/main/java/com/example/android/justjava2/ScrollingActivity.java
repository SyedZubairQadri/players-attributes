package com.example.android.justjava2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {
    int quantity = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "It will do nothing :p", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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



    private void  skills( ) {
        displayMessages (quantity + 20);


    }

    public void dribbling(){

        displayMessaged (quantity +20);

    }

    public void pace(){

        displayMessagep(quantity -20);

    }
    public void shooting(){

        displayMessagesh(quantity -20 ) ;

    }









    /**
         * This method displays the given text on the screen
         * here are attributes displays.
         */
    private void displayMessages(int message) {
        TextView order_summary_text_view = (TextView) findViewById(R.id.edenskills_text_view);
        order_summary_text_view.setText(message);
    }
    private void displayMessaged(int message) {
        TextView order_summary_text_view = (TextView) findViewById(R.id.edendribbling_text_view);
        order_summary_text_view.setText(message);
    }
    private void displayMessagep(int message) {
        TextView order_summary_text_view = (TextView) findViewById(R.id.edenpace_text_view);
        order_summary_text_view.setText(message);
    }
    private void displayMessagesh(int message) {
        TextView order_summary_text_view = (TextView) findViewById(R.id.edenshooting_text_view);
        order_summary_text_view.setText(message);
    }



}





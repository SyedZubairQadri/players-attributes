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
    int quantitym = 20;
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
                Snackbar.make(view, "it will do nothing", Snackbar.LENGTH_LONG)
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



    private int  skills( ) {
       return  (quantity - 2);


    }

    public int dribbling(){

        return  (quantity - 2);

    }

    public int pace(){

        return(quantity -1);

    }
    public int shooting(){

        return(quantity -1 ) ;

    }




    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        displayMessages("skills    :" + skills() );
        displayMessaged("dribbing  :" + dribbling());
        displayMessagesp("Pace     :" + pace()   );
        displayMessagesh("Shooting :" + shooting());

    }





    /**
         * This method displays the given text on the screen
         * here are attributes displays.
         */
    private void displayMessages(int message) {
        TextView order_summary_text_view = (TextView) findViewById(R.id.edenskills_text_view);
        order_summary_text_view.setText(message);
    }

    private void displayMessages(String message) {
        TextView order_summary_text_view = (TextView) findViewById(R.id.edenskills_text_view);
        order_summary_text_view.setText(message);
    }

    private void displayMessaged(int message) {
        TextView edendribbling_text_view = (TextView) findViewById(R.id.edendribbling_text_view);
        edendribbling_text_view.setText(message);
    }

    private void displayMessaged(String message) {
        TextView edendribbling_text_view = (TextView) findViewById(R.id.edendribbling_text_view);
        edendribbling_text_view.setText(message);
    }

    private void displayMessagesp(int message) {
        TextView edenpace_text_view = (TextView) findViewById(R.id.edenpace_text_view);
        edenpace_text_view.setText(message);
    }

    private void displayMessagesp(String message) {
        TextView edenpace_text_view = (TextView) findViewById(R.id.edenpace_text_view);
        edenpace_text_view.setText(message);
    }

    private void displayMessagesh(int message) {
        TextView edenshooting_text_view = (TextView) findViewById(R.id.edenshooting_text_view);
        edenshooting_text_view.setText(message);
    }

    private void displayMessagesh(String message) {
        TextView edenshooting_text_view = (TextView) findViewById(R.id.edenshooting_text_view);
        edenshooting_text_view.setText(message);
    }





    public int  skillsmessi() {
        return  (quantitym- 1);


    }

    public int dribblingm(){

        return  (quantitym);

    }

    public int pacem(){

        return(quantitym-1);

    }
    public int shootingm(){

        return(quantitym-1 ) ;

    }
    public void submitOrderm(View view) {

        displayMessagemessis("SKILLS    :" + skillsmessi() );
        displayMessagemessid("DRIBBLING  :" + dribblingm());
        displayMessagemessip("PACE     :" + pacem()   );
        displayMessagemessish("SHOOTING :" + shootingm());

    }

    private void displayMessagemessis(int message) {
        TextView messiskills_text_view = (TextView) findViewById(R.id.messiskills_text_view);
        messiskills_text_view.setText(message);
    }

    private void displayMessagemessis(String message) {
        TextView messiskills_text_view = (TextView) findViewById(R.id.messiskills_text_view);
        messiskills_text_view.setText(message);
    }

    private void displayMessagemessid(int message) {
        TextView messidribbling_text_view = (TextView) findViewById(R.id.messidribbling_text_view);
        messidribbling_text_view.setText(message);
    }

    private void displayMessagemessid(String message) {
        TextView messidribbling_text_view = (TextView) findViewById(R.id.messidribbling_text_view);
        messidribbling_text_view.setText(message);
    }

    private void displayMessagemessip(int message) {
        TextView messipace_text_view = (TextView) findViewById(R.id.messipace_text_view);
        messipace_text_view.setText(message);
    }

    private void displayMessagemessip(String message) {
        TextView messipace_text_view = (TextView) findViewById(R.id.messipace_text_view);
        messipace_text_view.setText(message);
    }

    private void displayMessagemessish(int message) {
        TextView messishooting_text_view = (TextView) findViewById(R.id.messishooting_text_view);
        messishooting_text_view.setText(message);
    }

    private void displayMessagemessish(String message) {
        TextView messishooting_text_view = (TextView) findViewById(R.id.messishooting_text_view);
        messishooting_text_view.setText(message);
    }







}


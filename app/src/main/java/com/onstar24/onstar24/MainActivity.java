package com.onstar24.onstar24;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_out);

        loginButton = (Button) findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main_in);
            }
        });

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
        }else if (id == R.id.view_cradle) {
            setContentView(R.layout.cradle);
        }else if (id == R.id.logout_item) {
            setContentView(R.layout.activity_main_out);
        }

        return super.onOptionsItemSelected(item);
    }

    public void button_goto_dash(View view) {
        setContentView(R.layout.activity_main_in);
    }
    //activity_main_in buttons
    public void button_goto_personal(View view) {
        setContentView(R.layout.personal);
    }
    public void button_goto_business(View view) {
        setContentView(R.layout.business);
    }
    public void button_goto_health(View view) {
        setContentView(R.layout.health);
    }
    public void button_goto_emergency(View view) {
        setContentView(R.layout.emergency);
    }
    public void button_goto_adviser(View view) {
        setContentView(R.layout.adviser);
    }
}

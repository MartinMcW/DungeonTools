package com.mcwaterssystems.dungeontools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.Integer;
import android.widget.NumberPicker.Formatter;


import static java.lang.Integer.*;

public class PlayerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_player_list, menu);
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

    public void adjustHPUpFunction( View view )
    {
        String string1;

        // Get playerHP TextView

        TextView playerHPLocal = (TextView) findViewById(R.id.playerHP);

        // Convert playerHp to a String
        string1 = playerHPLocal.getText().toString();

        // Create a new integer and assign it the string's value

        int int1 = new Integer(string1);

        // Modify the integer

        int1++;

        // Convert int1 back to a string

        string1 = String.valueOf(int1);

        playerHPLocal.setText(string1);

    }

    public void adjustHPDownFunction( View view )
    {
        String string1;

        // Get playerHP TextView

        TextView playerHPLocal = (TextView) findViewById(R.id.playerHP);

        // Convert playerHp to a String
        string1 = playerHPLocal.getText().toString();

        // Create a new integer and assign it the string's value

        int int1 = new Integer(string1);

        // Modify the integer

        int1--;

        // Convert int1 back to a string

        string1 = String.valueOf(int1);

        playerHPLocal.setText(string1);
    }
}

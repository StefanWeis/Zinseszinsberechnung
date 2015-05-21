package de.dma.zinseszinsberechnung;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class FourthActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Bundle extras = getIntent().getExtras();
        String startkapital = extras.getString("VALUE_STARTKAPITAL");
        String zinssatz = extras.getString("VALUE_ZINSSATZ");
        String laufzeit = extras.getString("VALUE_LAUFZEIT");

        TextView textView_endewert = (TextView) findViewById(R.id.textView_endewert);
        Double zinseszins = (double)Math.round(Double.valueOf(startkapital) * Math.pow((1 + (Double.valueOf(zinssatz) / 100)), Double.valueOf(laufzeit)) * 100) / 100;
        textView_endewert.setText(String.valueOf(zinseszins) + " €");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fourth, menu);
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

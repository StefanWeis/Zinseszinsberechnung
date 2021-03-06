package de.dma.zinseszinsberechnung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third, menu);
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

    public void startNewActivity(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        EditText editText_laufzeit = (EditText) findViewById(R.id.editText_laufzeit);
        String laufzeit = editText_laufzeit.getText().toString();

        Bundle extras = getIntent().getExtras();
        String startkapital = extras.getString("VALUE_STARTKAPITAL");
        String zinssatz = extras.getString("VALUE_ZINSSATZ");

        intent.putExtra("VALUE_STARTKAPITAL", startkapital);
        intent.putExtra("VALUE_ZINSSATZ", zinssatz);
        intent.putExtra("VALUE_LAUFZEIT", laufzeit);

        startActivity(intent);
    }
}

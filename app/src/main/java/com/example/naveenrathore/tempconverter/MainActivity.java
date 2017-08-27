package com.example.naveenrathore.tempconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void TempratureConverter(View view)
    {
        EditText cValue=(EditText) findViewById(R.id.cValue);
        EditText fValue=(EditText) findViewById(R.id.fValue);
        TextView cResult=(TextView)findViewById(R.id.cResult);
        TextView fResult=(TextView) findViewById(R.id.fResult);
        Button button=(Button) findViewById(R.id.button);

        double c= Double.parseDouble(cValue.getText().toString());
        double f= Double.parseDouble(fValue.getText().toString());

        double cR,fR;

        cR= (f-32)*5/9;
        fR= c*9/5 + 32;

        cResult.setText("Celsius =" + String.valueOf(cR));
        fResult.setText("Fahrenheit =" + String.valueOf(fR));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
        }

        return super.onOptionsItemSelected(item);
    }
}

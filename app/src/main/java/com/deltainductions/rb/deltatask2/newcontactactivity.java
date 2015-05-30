package com.deltainductions.rb.deltatask2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class newcontactactivity extends ActionBarActivity {
    EditText edittextname,edittextnumber;
    String name,number;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newcontactactivity);
        edittextname = (EditText)findViewById(R.id.editTextname);
        edittextnumber = (EditText)findViewById(R.id.editTextnumber);
        button = (Button)findViewById(R.id.buttongo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = edittextname.getText().toString();
                number = edittextnumber.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("name",name);
                intent.putExtra("number",number);
                setResult(2,intent);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_newcontactactivity, menu);
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

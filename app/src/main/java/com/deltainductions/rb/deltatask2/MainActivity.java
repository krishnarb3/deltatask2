package com.deltainductions.rb.deltatask2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    Button buttonnewcontact;
    Boolean newcontactcreated=false;
    ArrayList<String> contactnames = new ArrayList<String>();
    String contactname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonnewcontact = (Button)findViewById(R.id.button);
        buttonnewcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newcontactcreated=true;
                Intent i = new Intent(MainActivity.this,newcontactactivity.class);
                startActivityForResult(i,2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2)
        {
        String newstring = data.getStringExtra("name");
        contactnames.add(newstring);
            contactnames.add(contactname);
            String [] namelist = contactnames.toArray(new String[contactnames.size()]);
            ListAdapter adapter = new customrow(this,namelist);
            ListView listView = (ListView)findViewById(R.id.listView);
            listView.setAdapter(adapter);
        }
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

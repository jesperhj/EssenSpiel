package se.sarang.jesperhj.essenspiel;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit.converter.SimpleXMLConverter;
import se.sarang.jesperhj.essenspiel.API.GeeklistAPI;
import se.sarang.jesperhj.essenspiel.model.Geeklist;
import se.sarang.jesperhj.essenspiel.model.Item;


import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends ActionBarActivity {

    String API = "https://www.boardgamegeek.com/xmlapi";
    //String API = "https://s3-eu-west-1.amazonaws.com/bgg.sarang.se";
    //String Essen2015 = "11205";
    String Essen2015 = "174654";


    TextView tv;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

/*        // Defined Array values to show in ListView
        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);*/



        RestAdapter restAdapter = new RestAdapter.Builder()
                .setConverter(new SimpleXMLConverter())
                .setEndpoint(API).build();

        GeeklistAPI bgg = restAdapter.create(GeeklistAPI.class);

        bgg.getList(Essen2015, new Callback<Geeklist>() {
            @Override
            public void success(Geeklist geeklist, Response response) {
                tv.setText("Title :" + geeklist.getTitle() + "\nItems :" + geeklist.getNumitems());

                fillList(geeklist.getItem());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("App", error.getMessage());
                tv.setText((CharSequence) error.getMessage());
            }
        });
    }

    public void fillList(List<Item> items) {
        lv = (ListView) findViewById(R.id.list);

        // Construct the data source
        //ArrayList<Item> arrayOfItems = new ArrayList<Item>();
        // Create the adapter to convert the array to views

        //ItemAdapter adapter = new ItemAdapter(this, arrayOfItems);
        ItemAdapter adapter = new ItemAdapter(this, items);
        // Attach the adapter to a ListView

        // Assign adapter to ListView
        lv.setAdapter(adapter);
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

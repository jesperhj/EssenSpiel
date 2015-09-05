package se.sarang.jesperhj.essenspiel;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.otto.Subscribe;

import java.util.List;

import retrofit.client.OkClient;
import retrofit.converter.SimpleXMLConverter;
import se.sarang.jesperhj.essenspiel.API.GeeklistAPI;
import se.sarang.jesperhj.essenspiel.API.HttpRequestController;
import se.sarang.jesperhj.essenspiel.bus.BusManager;
import se.sarang.jesperhj.essenspiel.bus.RetrofitErrorEvent;
import se.sarang.jesperhj.essenspiel.composed.GetGeekList;
import se.sarang.jesperhj.essenspiel.model.bgg.Geeklist;
import se.sarang.jesperhj.essenspiel.model.bgg.Item;


import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import se.sarang.jesperhj.essenspiel.sqlite.MySQLiteHelper;

public class MainActivity extends ActionBarActivity {

    //String API = "https://www.boardgamegeek.com/xmlapi";
    //String API = "https://s3-eu-west-1.amazonaws.com/bgg.sarang.se";
    //String Essen2015 = "11205";
    //String Essen2015 = "174654";


    TextView tv;
    ListView lv;

    private HttpRequestController controller;

/*    private static BGGClient bggClient;
    private static RestAdapter restAdapter;

    public static BGGClient getClient() {
        if(bggClient == null)
            bggClient = new BGGClient();
        return bggClient;
    }

    private BGGClient() {
        restAdapter = new RestAdapter.Builder()
                .setConverter(new SimpleXMLConverter())
                .setEndpoint(API)
                .setClient(new OkClient(new OkHttpClient()))
                .build();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        Button postsBtn = (Button) findViewById(R.id.getList);
        postsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // No callback defined at this point
                //controller.getPosts();
                controller.getGeekList();
            }
        });

        BusManager.register(this);

        //MySQLiteHelper db = new MySQLiteHelper(this);
        /*// add Books
        db.addGame(new Game("Android Application Development Cookbook", "Wei Meng Lee"));
        db.addGame((new Game("Android Programming: The Big Nerd Ranch Guide", "Bill Phillips and Brian Hardy"));
        db.addGame((new Game("Learn Android App Development", "Wallace Jackson"));

        // get all books
        List<Game> list = db.getAllBooks();

        // delete one book
        db.deleteGame(list.get(0));

        // get all books
        db.getAllBooks();*/

        /*RestAdapter restAdapter = new RestAdapter.Builder()
                .setConverter(new SimpleXMLConverter())
                .setEndpoint(API)
                .setClient(new OkClient(new OkHttpClient()))
                .build();*/

        /*GeeklistAPI bgg = restAdapter.create(GeeklistAPI.class);

        bgg.getList(Essen2015, new Callback<Geeklist>() {
            @Override
            public void success(Geeklist geeklist, Response response) {
                tv.setText("Title :" + geeklist.getTitle() + "\nItems :" + geeklist.getNumitems());

                //bgg.getBoardgame("180977");
                // iterate via "New way to loop"
                for (Item i : geeklist.getItem()) {
                    System.out.println(i.getId());
                    //db.addGame(new Game(i.getId()));
                }
                //fillList(geeklist.getItem());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("App", error.getMessage());
                tv.setText((CharSequence) error.getMessage());
            }
        });*/
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

    @Override
    protected void onStart() {
        super.onStart();
        controller = new HttpRequestController();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BusManager.unregister(this);
    }

    // Otto Events
    @Subscribe
    public void onGetGeeklist(GetGeekList.Event event){
        tv.setText(event.getGeeklist().getTitle());
        fillList(event.getGeeklist().getItem());
    }


    @Subscribe
    public void onRetrofitErrorEvent(RetrofitErrorEvent event){
        tv.setText(event.getError().getMessage());
    }
}

package se.sarang.jesperhj.essenspiel.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.LinkedList;
import java.util.List;

import se.sarang.jesperhj.essenspiel.model.Game;

/**
 * Created by jesper on 04/09/15.
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "GameDB";

    // Games table name
    private static final String TABLE_GAMES = "games";

    // Games Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_AUTHOR = "publisherId";

    private static final String[] COLUMNS = {KEY_ID,KEY_TITLE,KEY_AUTHOR};

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL statement to create game table
        String CREATE_GAME_TABLE = "CREATE TABLE games ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "title TEXT, "+
                "publisherId INTEGER )";

        // create games table
        db.execSQL(CREATE_GAME_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older games table if existed
        db.execSQL("DROP TABLE IF EXISTS books");

        // create fresh books table
        this.onCreate(db);
    }

    public void addGame(Game game){
        //for logging
        Log.d("addGame", game.toString());

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put(KEY_TITLE, game.getTitle()); // get title
        values.put(KEY_AUTHOR, game.getPublisherId()); // get publisherid

        // 3. insert
        db.insert(TABLE_GAMES, // table
                null, //nullColumnHack
                values); // key/value -> keys = column names/ values = column values

        // 4. close
        db.close();
    }

    public Game getBook(int id){

        // 1. get reference to readable DB
        SQLiteDatabase db = this.getReadableDatabase();

        // 2. build query
        Cursor cursor =
                db.query(TABLE_GAMES, // a. table
                        COLUMNS, // b. column names
                        " id = ?", // c. selections
                        new String[] { String.valueOf(id) }, // d. selections args
                        null, // e. group by
                        null, // f. having
                        null, // g. order by
                        null); // h. limit

        // 3. if we got results get the first one
        if (cursor != null)
            cursor.moveToFirst();

        // 4. build book object
        Game game = new Game();
        game.setId(Integer.parseInt(cursor.getString(0)));
        game.setTitle(cursor.getString(1));
        game.setPublisherId(Integer.parseInt(cursor.getString(2)));

        //log
        Log.d("getGame(" + id + ")", game.toString());

        // 5. return book
        return game;
    }

    public List<Game> getAllBooks() {
        List<Game> games = new LinkedList<Game>();

        // 1. build the query
        String query = "SELECT * FROM " + TABLE_GAMES;

        // 2. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        // 3. go over each row, build game and add it to list
        Game book = null;
        if (cursor.moveToFirst()) {
            do {
                Game game = new Game();
                game.setId(Integer.parseInt(cursor.getString(0)));
                game.setTitle(cursor.getString(1));
                game.setPublisherId(Integer.parseInt(cursor.getString(2)));

                // Add book to books
                games.add(game);
            } while (cursor.moveToNext());
        }

        Log.d("getAllGames()", games.toString());

        // return books
        return games;
    }

    public int updateGame(Game game) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put("title", game.getTitle()); // get title
        values.put("PublisherId", game.getPublisherId()); // get author

        // 3. updating row
        int i = db.update(TABLE_GAMES, //table
                values, // column/value
                KEY_ID+" = ?", // selections
                new String[] { String.valueOf(game.getId()) }); //selection args

        // 4. close
        db.close();

        return i;
    }

    public void deleteGame(Game game) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. delete
        db.delete(TABLE_GAMES, //table name
                KEY_ID+" = ?",  // selections
                new String[] { String.valueOf(game.getId()) }); //selections args

        // 3. close
        db.close();

        //log
        Log.d("deleteGame", game.toString());

    }
}

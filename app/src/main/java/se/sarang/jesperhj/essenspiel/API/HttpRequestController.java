package se.sarang.jesperhj.essenspiel.API;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.SimpleXMLConverter;
import se.sarang.jesperhj.essenspiel.composed.GetBoardgame;
import se.sarang.jesperhj.essenspiel.composed.GetBoardgames;
import se.sarang.jesperhj.essenspiel.composed.GetGeekList;

/**
 * Created by jesper on 05/09/15.
 */
public class HttpRequestController {

    //private static final String API_URL = "https://www.boardgamegeek.com/xmlapi";
    private static final String API_URL = "https://s3-eu-west-1.amazonaws.com/bgg.sarang.se";
    private static String Essen2015 = "174654";
    //String API = "https://s3-eu-west-1.amazonaws.com/bgg.sarang.se";
    //String Essen2015 = "11205";
    //String Essen2015 = "174654";
    private BGGAPI request;

    public HttpRequestController() {
        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setConverter(new SimpleXMLConverter());
        builder.setEndpoint(API_URL);
        builder.setLogLevel(RestAdapter.LogLevel.FULL);
        builder.setClient(new OkClient(new OkHttpClient()));
        RestAdapter controller = builder.build();
        request = controller.create(BGGAPI.class);
    }

    /*public void getPosts(){
        // The result is going to be delivered via an event so the callback
        // can always be the same.
        request.posts(new GetPosts.Callback());
    }*/

    public void getGeekList() {
        request.geeklist(Essen2015, new GetGeekList.Callback());
    }

    public void getBoardGames(String boardgameIds) {
        System.out.println("inside_getBoardGames");
        request.boardgame(boardgameIds, new GetBoardgames.Callback());
    }

    /*public void getUsers(){
        request.users(new GetUsers.Callback());
    }*/

}
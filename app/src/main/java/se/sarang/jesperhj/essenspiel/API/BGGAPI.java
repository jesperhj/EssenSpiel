package se.sarang.jesperhj.essenspiel.API;

import java.util.List;

import se.sarang.jesperhj.essenspiel.model.bgg.Boardgames;
import se.sarang.jesperhj.essenspiel.model.bgg.Geeklist;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;


public interface BGGAPI {
//    @GET("/geeklist/{geeklist}")
//    public void getList(@Path("geeklist") String geeklist, Callback<Geeklist> response);

    @GET("/geeklist/{geeklist}")
    void geeklist(@Path("geeklist") String geeklist, Callback<Geeklist> response);

    //@GET("/posts")
    //void posts(Callback<List<Post>> cb);

    //@GET("/boardgame/{boardgame}")
    //void boardgame(@Path("boardgame") String boardgame, Callback<Boardgames> response);

    @GET("/boardgame/{boardgame}")
    void boardgame(@Path("boardgame") String boardgame, Callback<Boardgames> response);
}
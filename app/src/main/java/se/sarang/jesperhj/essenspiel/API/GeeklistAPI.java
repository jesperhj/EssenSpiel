package se.sarang.jesperhj.essenspiel.API;

import se.sarang.jesperhj.essenspiel.model.Geeklist;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;


public interface GeeklistAPI {
    @GET("/geeklist/{geeklist}")
    public void getList(@Path("geeklist") String geeklist, Callback<Geeklist> response);

}
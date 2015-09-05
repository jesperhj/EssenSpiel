package se.sarang.jesperhj.essenspiel.bus;

import retrofit.RetrofitError;

/**
 * Created by jesper on 05/09/15.
 */
public class RetrofitErrorEvent {

    private RetrofitError error;

    public RetrofitErrorEvent(RetrofitError error) {
        this.error = error;
    }

    public RetrofitError getError() {
        return error;
    }

}

package se.sarang.jesperhj.essenspiel.composed;

import java.util.List;

import retrofit.RetrofitError;
import retrofit.client.Response;
import se.sarang.jesperhj.essenspiel.bus.BusManager;
import se.sarang.jesperhj.essenspiel.bus.RetrofitErrorEvent;
import se.sarang.jesperhj.essenspiel.model.bgg.Boardgame;
import se.sarang.jesperhj.essenspiel.model.bgg.Boardgames;

/**
 * Created by jesper on 06/09/15.
 */
public class GetBoardgames {
    // Not applicable in this example
    public static final class Request {
        // This can be used to send data as POST to the server.
        // This object will be converted to JSON by retrofit
        // For more information about Requests check
        // http://square.github.io/retrofit/ Section REQUEST BODY
        public Request(){};

    }

    public static final class Callback implements retrofit.Callback<Boardgames> {

        @Override
        public void success(Boardgames boardgames, Response retrofitResponse) {

            String ids = "";
            for (Boardgame bg: boardgames.getBoardgame()){
                //System.out.println(bg.getName());
                ids.concat(" " + bg.getName());
            }
            BusManager.post(new Event(ids));
        }

        @Override
        public void failure(RetrofitError error) {
            BusManager.post(new RetrofitErrorEvent(error));
        }

    }



    /*public class GK {
        private final Geeklist geeklist;

        public GK(Geeklist geeklist) {
            this.geeklist = geeklist;
        }

        public String getGeeklist() {
            return geeklist;
        }
    }*/

    // Otto Event
/*    public static final class Event {

        private final Boardgame boardgame;

        public Event(Boardgame boardgame) {
            this.boardgame = boardgame;
        }

        public Boardgame getBoardgame() {
            return boardgame;
        }
    }*/

    public static final class Event {

        private final String status;

        public Event(String status) {
            this.status = status;
        }

        public String getBoardgame() {
            return status;
        }
    }
}

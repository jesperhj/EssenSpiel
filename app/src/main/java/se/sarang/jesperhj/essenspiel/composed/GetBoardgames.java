package se.sarang.jesperhj.essenspiel.composed;

import java.util.List;

import retrofit.RetrofitError;
import retrofit.client.Response;
import se.sarang.jesperhj.essenspiel.bus.BusManager;
import se.sarang.jesperhj.essenspiel.bus.RetrofitErrorEvent;
import se.sarang.jesperhj.essenspiel.model.Game;
import se.sarang.jesperhj.essenspiel.model.bgg.Boardgame;
import se.sarang.jesperhj.essenspiel.model.bgg.Boardgames;
import se.sarang.jesperhj.essenspiel.sqlite.MySQLiteHelper;

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
            System.out.println("inside_GetBoardGames Success");

            /*String ids = "";
            for (Boardgame bg: boardgames.getBoardgame()){
                //ids.concat(" " + bg.getObjectid());
                //System.out.println(bg.getObjectid());
            }
            BusManager.post(new Event(ids));*/
            BusManager.post(new Event(boardgames));
        }

        @Override
        public void failure(RetrofitError error) {
            System.out.println("inside_GetBoardGames Failure");
            System.out.print(error.getMessage());
            BusManager.post(new RetrofitErrorEvent(error));
        }

    }

    // Otto Event
    public static final class Event {

        private final Boardgames boardgames;

        public Event(Boardgames boardgames) {
            this.boardgames = boardgames;
        }

        public Boardgames getBoardgames() {
            return boardgames;
        }
    }

   /* public static final class Event {

        private final String status;

        public Event(String status) {
            this.status = status;
        }

        public String getBoardgame() {
            return status;
        }
    }*/
}

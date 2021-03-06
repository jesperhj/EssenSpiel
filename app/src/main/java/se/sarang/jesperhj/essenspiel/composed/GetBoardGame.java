package se.sarang.jesperhj.essenspiel.composed;

import retrofit.RetrofitError;
import retrofit.client.Response;
import se.sarang.jesperhj.essenspiel.bus.BusManager;
import se.sarang.jesperhj.essenspiel.bus.RetrofitErrorEvent;
import se.sarang.jesperhj.essenspiel.model.bgg.Boardgame;
import se.sarang.jesperhj.essenspiel.model.bgg.Boardgames;
import se.sarang.jesperhj.essenspiel.model.bgg.Geeklist;

/**
 * Created by jesper on 06/09/15.
 */
public class GetBoardgame {
    // Not applicable in this example
    public static final class Request {
        // This can be used to send data as POST to the server.
        // This object will be converted to JSON by retrofit
        // For more information about Requests check
        // http://square.github.io/retrofit/ Section REQUEST BODY
        public Request(){};

    }

    public static final class Callback implements retrofit.Callback<Boardgame> {

        @Override
        public void success(Boardgame boardgame, Response retrofitResponse) {
            // Process the data
            // In a real project this could be the place to save data in the database.
            /*String text = "";
            for (Post post: postsList){
                text = text.concat(post.getId()+": "+post.getTitle()+"\n");
            }*/
            //String text = geeklist.getTitle();
            //Boardgame boardgame = boardgames.getBoardgame().get(0);

            BusManager.post(new Event(boardgame));
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
    public static final class Event {

        private final Boardgame boardgame;

        public Event(Boardgame boardgame) {
            this.boardgame = boardgame;
        }

        public Boardgame getBoardgame() {
            return boardgame;
        }
    }
}

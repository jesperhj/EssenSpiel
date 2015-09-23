package se.sarang.jesperhj.essenspiel.composed;

import java.util.ArrayList;
import java.util.List;

import retrofit.RetrofitError;
import retrofit.client.Response;
import se.sarang.jesperhj.essenspiel.bus.BusManager;
import se.sarang.jesperhj.essenspiel.bus.RetrofitErrorEvent;
import se.sarang.jesperhj.essenspiel.model.bgg.Geeklist;
import se.sarang.jesperhj.essenspiel.model.bgg.Item;

/**
 * Created by jesper on 05/09/15.
 */
public class GetGeekList {

    // Not applicable in this example
    public static final class Request {
        // This can be used to send data as POST to the server.
        // This object will be converted to JSON by retrofit
        // For more information about Requests check
        // http://square.github.io/retrofit/ Section REQUEST BODY
        public Request(){};

    }

    public static final class Callback implements retrofit.Callback<Geeklist> {

        @Override
        public void success(Geeklist geeklist, Response retrofitResponse) {
            // Process the data
            // In a real project this could be the place to save data in the database.
            /*String text = "";
            for (Post post: postsList){
                text = text.concat(post.getId()+": "+post.getTitle()+"\n");
            }*/
            //String text = geeklist.getTitle();
            BusManager.post(new Event(geeklist));
            //List<String> bl = ExtractBoardgamesIds(geeklist);
            //BusManager.post(new BoardgameListEvent(bl));
        }

        @Override
        public void failure(RetrofitError error) {
            BusManager.post(new RetrofitErrorEvent(error));
        }

        private List<String> ExtractBoardgamesIds(Geeklist geeklist) {
            List<String> boardgameList = new ArrayList<String>();
            for (Item i : geeklist.getItem()) {
                boardgameList.add(i.getObjectid().toString());
            }
            return boardgameList;
        }

    }

    // Otto Event
    public static final class Event {

        private final Geeklist geeklist;

        public Event(Geeklist geeklist) {
            this.geeklist = geeklist;
        }

        public Geeklist getGeeklist() {
            return geeklist;
        }
    }

    public static final class BoardgameListEvent {

        private List<String> boardgames;

        public void BoardgameListEvent(List<String> boardgames) {
            this.boardgames = boardgames;
        }

        public List<String> getBoargameList() {
            return boardgames;
        }
    }
}
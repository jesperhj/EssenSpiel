package se.sarang.jesperhj.essenspiel.model;

/**
 * Created by jesper on 02/09/15.
 * http://hmkcode.com/android-simple-sqlite-database-tutorial/
 */
public class Game {
    private int id;
    private String title;
    private int publisherId;

    public Game(){}

    public Game(String title, int publisherId) {
        super();
        this.title = title;
        this.publisherId = publisherId;
    }

    //getters & setters

    @Override
    public String toString() {
        return "Game [id=" + id + ", title=" + title + ", publisherId=" + publisherId
                + "]";
    }
}

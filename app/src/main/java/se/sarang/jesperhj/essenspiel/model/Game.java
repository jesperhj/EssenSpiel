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

    public Game(int id, String title, int publisherId) {
        super();
        this.id = id;
        this.title = title;
        this.publisherId = publisherId;
    }

    //getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getPublisherId() { return publisherId; }
    public void setPublisherId(int publisherId) { this.publisherId = publisherId; }

    @Override
    public String toString() {
        return "Game [id=" + id + ", title=" + title + ", publisherId=" + publisherId
                + "]";
    }
}

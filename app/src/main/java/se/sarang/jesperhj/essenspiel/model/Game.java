package se.sarang.jesperhj.essenspiel.model;

/**
 * Created by jesper on 02/09/15.
 * http://hmkcode.com/android-simple-sqlite-database-tutorial/
 */
public class Game {
    private int id;
    private String title;
    private int publisherId;
    private String players;
    private String age;

    public Game(){}

    public Game(int id, String title, int publisherId) {
        super();
        this.id = id;
        this.title = title;
        this.publisherId = publisherId;
        this.players = "";
        this.age = "";
    }

    //getters & setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getPublisherId() { return publisherId; }
    public void setPublisherId(int publisherId) { this.publisherId = publisherId;}
    public String getPlayers() {return players; }
    public void setPlayers(String players) {this.players = players;}
    public String getAge() {return age;}
    public void setAge(String age) {this.age = age;}



    @Override
    public String toString() {
        return "Game [id=" + id + ", title=" + title + ", publisherId=" + publisherId
                + "]";
    }
}

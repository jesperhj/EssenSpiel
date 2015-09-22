package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;
import java.util.jar.Attributes;

/**
 * Created by jesper on 05/09/15.
 */
@Root(name = "boardgame", strict=false)
public class Boardgame
{
    @Attribute(required=false)
    private String objectid;

    @Element(required=false)
    private String age;
    @ElementList(required=false, inline = true)
    private List<Boardgameartist> boardgameartist;
    @ElementList(required=false, inline = true)
    private List<Boardgamecategory> boardgamecategory;
    @ElementList(required=false, inline = true)
    private List<Boardgamedesigner> boardgamedesigner;
    @ElementList(required=false, inline = true)
    private List<Boardgameexpansion> boardgameexpansion;
    @ElementList(required=false, inline = true)
    private List<Boardgamepublisher> boardgamepublisher;
    @Element(required=false)
    private String description;
    @Element(required=false)
    private String image;
    @Element(required=false)
    private String maxplayers;
    @Element(required=false)
    private String maxplaytime;
    @Element(required=false)
    private String minplayers;
    @Element(required=false)
    private String minplaytime;
    @ElementList(required = false, inline = true)
    private List<Name> name;
    @Element(required=false)
    private String playingtime;
    @ElementList(required=false, entry = "poll", inline = true)
    private List<Poll> poll;
    @Element(required=false)
    private String thumbnail;
    @Element(required=false)
    private String yearpublished;


    public List<Boardgamepublisher> getBoardgamepublisher ()
    {
        return boardgamepublisher;
    }

    public void setBoardgamepublisher (List<Boardgamepublisher> boardgamepublisher)
    {
        this.boardgamepublisher = boardgamepublisher;
    }

    public List<Boardgameexpansion> getBoardgameexpansion ()
    {
        return boardgameexpansion;
    }

    public void setBoardgameexpansion (List<Boardgameexpansion> boardgameexpansion)
    {
        this.boardgameexpansion = boardgameexpansion;
    }

    public List<Boardgameartist> getBoardgameartist ()
    {
        return boardgameartist;
    }

    public void setBoardgameartist (List<Boardgameartist> boardgameartist)
    {
        this.boardgameartist = boardgameartist;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public List<Boardgamedesigner> getBoardgamedesigner ()
    {
        return boardgamedesigner;
    }

    public void setBoardgamedesigner (List<Boardgamedesigner> boardgamedesigner)
    {
        this.boardgamedesigner = boardgamedesigner;
    }

    public String getMinplayers ()
    {
        return minplayers;
    }

    public void setMinplayers (String minplayers)
    {
        this.minplayers = minplayers;
    }

    public String getMaxplaytime ()
    {
        return maxplaytime;
    }

    public void setMaxplaytime (String maxplaytime)
    {
        this.maxplaytime = maxplaytime;
    }

    public String getMaxplayers ()
    {
        return maxplayers;
    }

    public void setMaxplayers (String maxplayers)
    {
        this.maxplayers = maxplayers;
    }

    public List<Poll> getPoll ()
    {
        return poll;
    }

    public void setPoll (List<Poll> poll)
    {
        this.poll = poll;
    }

    public String getThumbnail ()
    {
        return thumbnail;
    }

    public void setThumbnail (String thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public String getPlayingtime ()
    {
        return playingtime;
    }

    public void setPlayingtime (String playingtime)
    {
        this.playingtime = playingtime;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public List<Name> getName ()
    {
        return name;
    }

    public void setName (List<Name> name)
    {
        this.name = name;
    }

    public String getAge ()
    {
        return age;
    }

    public void setAge (String age)
    {
        this.age = age;
    }

    public String getYearpublished ()
    {
        return yearpublished;
    }

    public void setYearpublished (String yearpublished)
    {
        this.yearpublished = yearpublished;
    }

    public String getMinplaytime ()
    {
        return minplaytime;
    }

    public void setMinplaytime (String minplaytime)
    {
        this.minplaytime = minplaytime;
    }

    public List<Boardgamecategory> getBoardgamecategory ()
    {
        return boardgamecategory;
    }

    public void setBoardgamecategory (List<Boardgamecategory> boardgamecategory)
    {
        this.boardgamecategory = boardgamecategory;
    }

    public String getObjectid ()
    {
        System.out.println("Inside Boardgame.getObjectId");
        return objectid;
    }

    public void setObjectid (String objectid)
    {
        this.objectid = objectid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [boardgamepublisher = "+boardgamepublisher+", boardgameexpansion = "+boardgameexpansion+", boardgameartist = "+boardgameartist+", image = "+image+", boardgamedesigner = "+boardgamedesigner+", minplayers = "+minplayers+", maxplaytime = "+maxplaytime+", maxplayers = "+maxplayers+", poll = "+poll+", thumbnail = "+thumbnail+", playingtime = "+playingtime+", description = "+description+", name = "+name+", age = "+age+", yearpublished = "+yearpublished+", minplaytime = "+minplaytime+", boardgamecategory = "+boardgamecategory+", objectid = "+objectid+"]";
    }
}
package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Element;

import java.util.jar.Attributes;

/**
 * Created by jesper on 05/09/15.
 */
public class Boardgame
{
    @Element
    private Boardgamepublisher[] boardgamepublisher;
    @Element
    private Boardgameexpansion boardgameexpansion;
    @Element
    private Boardgameartist[] boardgameartist;
    @Element
    private String image;
    @Element
    private Boardgamedesigner[] boardgamedesigner;
    @Element
    private String minplayers;
    @Element
    private String maxplaytime;
    @Element
    private String maxplayers;
    @Element
    private Poll[] poll;
    @Element
    private String thumbnail;
    @Element
    private String playingtime;
    @Element
    private String description;
    @Element
    private Name name;
    @Element
    private String age;
    @Element
    private String yearpublished;
    @Element
    private String minplaytime;
    @Element
    private Boardgamecategory[] boardgamecategory;
    @Element
    private String objectid;
    @Element
    public Boardgamepublisher[] getBoardgamepublisher ()
    {
        return boardgamepublisher;
    }

    public void setBoardgamepublisher (Boardgamepublisher[] boardgamepublisher)
    {
        this.boardgamepublisher = boardgamepublisher;
    }

    public Boardgameexpansion getBoardgameexpansion ()
    {
        return boardgameexpansion;
    }

    public void setBoardgameexpansion (Boardgameexpansion boardgameexpansion)
    {
        this.boardgameexpansion = boardgameexpansion;
    }

    public Boardgameartist[] getBoardgameartist ()
    {
        return boardgameartist;
    }

    public void setBoardgameartist (Boardgameartist[] boardgameartist)
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

    public Boardgamedesigner[] getBoardgamedesigner ()
    {
        return boardgamedesigner;
    }

    public void setBoardgamedesigner (Boardgamedesigner[] boardgamedesigner)
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

    public Poll[] getPoll ()
    {
        return poll;
    }

    public void setPoll (Poll[] poll)
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

    public Name getName ()
    {
        return name;
    }

    public void setName (Name name)
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

    public Boardgamecategory[] getBoardgamecategory ()
    {
        return boardgamecategory;
    }

    public void setBoardgamecategory (Boardgamecategory[] boardgamecategory)
    {
        this.boardgamecategory = boardgamecategory;
    }

    public String getObjectid ()
    {
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
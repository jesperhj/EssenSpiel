package se.sarang.jesperhj.essenspiel.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

import se.sarang.jesperhj.essenspiel.model.Item;

/**
 * Created by jesper on 01/09/15.
 */
@Root(name = "geeklist")
public class Geeklist
{

    @Attribute
    private String id;

    @Element
    private String thumbs;

    @Element
    private String postdate;

    @Element
    private String editdate_timestamp;

    @Element
    private String username;

    @Element
    private String title;

    @Element
    private String postdate_timestamp;

    @Element
    private String description;

    @ElementList(entry="item", inline=true)
    private List<Item> item;
    //private Item[] item;

    @Element
    private String numitems;

    @Element
    private String editdate;

    @Attribute
    private String termsofuse;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getThumbs ()
    {
        return thumbs;
    }

    public void setThumbs (String thumbs)
    {
        this.thumbs = thumbs;
    }

    public String getPostdate ()
    {
        return postdate;
    }

    public void setPostdate (String postdate)
    {
        this.postdate = postdate;
    }

    public String getEditdate_timestamp ()
    {
        return editdate_timestamp;
    }

    public void setEditdate_timestamp (String editdate_timestamp)
    {
        this.editdate_timestamp = editdate_timestamp;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getPostdate_timestamp ()
    {
        return postdate_timestamp;
    }

    public void setPostdate_timestamp (String postdate_timestamp)
    {
        this.postdate_timestamp = postdate_timestamp;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public List<Item> getItem ()
    {
        return item;
    }

    public void setItem (List<Item> item)
    {
        this.item = item;
    }

    public String getNumitems ()
    {
        return numitems;
    }

    public void setNumitems (String numitems)
    {
        this.numitems = numitems;
    }

    public String getEditdate ()
    {
        return editdate;
    }

    public void setEditdate (String editdate)
    {
        this.editdate = editdate;
    }

    public String getTermsofuse ()
    {
        return termsofuse;
    }

    public void setTermsofuse (String termsofuse)
    {
        this.termsofuse = termsofuse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", thumbs = "+thumbs+", postdate = "+postdate+", editdate_timestamp = "+editdate_timestamp+", username = "+username+", title = "+title+", postdate_timestamp = "+postdate_timestamp+", description = "+description+", item = "+item+", numitems = "+numitems+", editdate = "+editdate+", termsofuse = "+termsofuse+"]";
    }
}
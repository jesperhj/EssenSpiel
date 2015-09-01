package se.sarang.jesperhj.essenspiel.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by jesper on 01/09/15.
 */

public class Item
{
    @Attribute
    private String id;

    @Attribute
    private String objectname;

    @Attribute
    private String thumbs;

    @Attribute
    private String postdate;

    @Element(required=false)
    private String body;

    @Attribute
    private String username;

    @Attribute
    private String objecttype;

    @Attribute
    private String subtype;

    @Attribute
    private String objectid;

    @Attribute
    private String imageid;

    @Attribute
    private String editdate;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getObjectname ()
    {
        return objectname;
    }

    public void setObjectname (String objectname)
    {
        this.objectname = objectname;
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

    public String getBody ()
    {
        return body;
    }

    public void setBody (String body)
    {
        this.body = body;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getObjecttype ()
    {
        return objecttype;
    }

    public void setObjecttype (String objecttype)
    {
        this.objecttype = objecttype;
    }

    public String getSubtype ()
    {
        return subtype;
    }

    public void setSubtype (String subtype)
    {
        this.subtype = subtype;
    }

    public String getObjectid ()
    {
        return objectid;
    }

    public void setObjectid (String objectid)
    {
        this.objectid = objectid;
    }

    public String getImageid ()
    {
        return imageid;
    }

    public void setImageid (String imageid)
    {
        this.imageid = imageid;
    }

    public String getEditdate ()
    {
        return editdate;
    }

    public void setEditdate (String editdate)
    {
        this.editdate = editdate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", objectname = "+objectname+", thumbs = "+thumbs+", postdate = "+postdate+", body = "+body+", username = "+username+", objecttype = "+objecttype+", subtype = "+subtype+", objectid = "+objectid+", imageid = "+imageid+", editdate = "+editdate+"]";
    }
}

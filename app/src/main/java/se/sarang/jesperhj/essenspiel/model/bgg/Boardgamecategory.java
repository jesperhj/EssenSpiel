package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;

/**
 * Created by jesper on 05/09/15.
 */
public class Boardgamecategory
{
    private String content;
    @Attribute
    private String objectid;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
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
        return "ClassPojo [content = "+content+", objectid = "+objectid+"]";
    }
}

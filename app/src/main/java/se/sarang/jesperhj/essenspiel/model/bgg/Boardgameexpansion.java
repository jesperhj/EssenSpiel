package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;

/**
 * Created by jesper on 05/09/15.
 */
public class Boardgameexpansion
{
    private String content;
    @Attribute
    private String objectid;
    @Attribute
    private String inbound;

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

    public String getInbound ()
    {
        return inbound;
    }

    public void setInbound (String inbound)
    {
        this.inbound = inbound;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", objectid = "+objectid+", inbound = "+inbound+"]";
    }
}

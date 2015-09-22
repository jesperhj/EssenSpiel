package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by jesper on 05/09/15.
 */
public class Boardgamecategory
{
    private String content;
    @Attribute(required = false)
    private String inbound;
    @Attribute(required = false)
    private String objectid;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getInbound ()
    {
        return inbound;
    }

    public void setInbound (String inbound)
    {
        this.inbound = inbound;
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

package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;

/**
 * Created by jesper on 05/09/15.
 */
public class Name
{
    private String content;
    @Attribute
    private String sortindex;
    @Attribute
    private String primary;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getSortindex ()
    {
        return sortindex;
    }

    public void setSortindex (String sortindex)
    {
        this.sortindex = sortindex;
    }

    public String getPrimary ()
    {
        return primary;
    }

    public void setPrimary (String primary)
    {
        this.primary = primary;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", sortindex = "+sortindex+", primary = "+primary+"]";
    }
}
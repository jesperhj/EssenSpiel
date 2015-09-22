package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by jesper on 05/09/15.
 */
public class Result
{

    @Attribute(required = false)
    private String level;
    @Attribute(required = false)
    private String value;
    @Attribute(required = false)
    private String numvotes;

    public String getLevel ()
    {
        return level;
    }
    public void setLevel (String level)
    {
        this.level = level;
    }
    public String getValue ()
    {
        return value;
    }
    public void setValue (String value)
    {
        this.value = value;
    }

    public String getNumvotes ()
    {
        return numvotes;
    }

    public void setNumvotes (String numvotes)
    {
        this.numvotes = numvotes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [numvotes = "+numvotes+"]";
    }
}
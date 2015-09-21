package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by jesper on 05/09/15.
 */
@Root(strict = false)
public class Results
{
    private String content;

    @Attribute(required = false)
    private String numplayers;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getNumplayers ()
    {
        return numplayers;
    }

    public void setNumplayers (String numplayers)
    {
        this.numplayers = numplayers;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [numplayers = "+numplayers+"]";
    }
}
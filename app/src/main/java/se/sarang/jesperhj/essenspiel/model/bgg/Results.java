package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by jesper on 05/09/15.
 */
@Root(strict = false)
public class Results
{
    @Attribute(required = false)
    private String numplayers;

    @ElementList(required = false, inline = true)
    private List<Result> result;

    public List<Result> getResult ()
    {
        return result;
    }

    public void setResult (List<Result> result)
    {
        this.result = result;
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
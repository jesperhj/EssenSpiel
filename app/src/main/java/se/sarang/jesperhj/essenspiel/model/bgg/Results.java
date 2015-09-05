package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;

/**
 * Created by jesper on 05/09/15.
 */
public class Results
{
    @Attribute
    private String numplayers;

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
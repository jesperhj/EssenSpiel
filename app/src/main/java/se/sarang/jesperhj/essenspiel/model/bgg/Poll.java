package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by jesper on 05/09/15.
 */
@Root(strict=false)
public class Poll
{
    @Attribute(required = false)
    private String name;
    @Attribute(required = false)
    private String title;
    @Attribute(required = false)
    private String totalvotes;


    @ElementList(required = false, inline = true)
    private List<Results> results;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public List<Results> getResults ()
    {
        return results;
    }

    public void setResults (List<Results> results)
    {
        this.results = results;
    }

    public String getTotalvotes ()
    {
        return totalvotes;
    }

    public void setTotalvotes (String totalvotes)
    {
        this.totalvotes = totalvotes;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", results = "+results+", totalvotes = "+totalvotes+", name = "+name+"]";
    }
}
package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by jesper on 05/09/15.
 */
@Root(strict=false)
public class Poll
{
    @Attribute(required = false)
    private String title;
    @Element(required = false)
    private Results results;
    @Attribute(required = false)
    private String totalvotes;
    @Attribute(required = false)
    private String name;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public Results getResults ()
    {
        return results;
    }

    public void setResults (Results results)
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
package se.sarang.jesperhj.essenspiel.model.bgg;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import se.sarang.jesperhj.essenspiel.model.bgg.Boardgame;

/**
 * Created by jesper on 05/09/15.
 */
@Root(name = "boardgames")
public class Boardgames
{
    @Element
    private Boardgame boardgame;

    @Attribute
    private String termsofuse;

    public Boardgame getBoardgame ()
    {
        return boardgame;
    }

    public void setBoardgame (Boardgame boardgame)
    {
        this.boardgame = boardgame;
    }

    public String getTermsofuse ()
    {
        return termsofuse;
    }

    public void setTermsofuse (String termsofuse)
    {
        this.termsofuse = termsofuse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [boardgame = "+boardgame+", termsofuse = "+termsofuse+"]";
    }
}

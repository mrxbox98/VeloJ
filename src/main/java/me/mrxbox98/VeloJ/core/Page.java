package me.mrxbox98.VeloJ.core;

import me.mrxbox98.VeloJ.elements.Element;

import java.util.ArrayList;

public class Page {

    ArrayList<Element> elements = new ArrayList<Element>();

    boolean staticPage = false;

    String cache = null;

    public String render()
    {
        if(staticPage)
        {
            if(cache != null)
                return cache;
            StringBuilder sb = new StringBuilder();
            for(Element e : elements)
            {
                sb.append(e.toString());
            }
            cache = sb.toString();
            return cache;
        }
        StringBuilder sb = new StringBuilder();
        for(Element e : elements)
        {
            sb.append(e.toString());
        }
        return sb.toString();

    }

}

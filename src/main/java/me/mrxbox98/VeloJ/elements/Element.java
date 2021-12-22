package me.mrxbox98.VeloJ.elements;

import java.util.LinkedList;
import java.util.Optional;

public class Element {

    /**
     * The elements inside this parent element
     */
    private Element[] elements;

    private Optional<LinkedList<String>> classes = Optional.empty();

    private Optional<String> style = Optional.empty();

    private boolean shouldCache = false;

    private Optional<String> cache = Optional.empty();

    /**
     * Creates a new element
     * @param elements the elements inside
     */
    public Element(Element... elements) {
        this.elements = elements;
    }

    /**
     * Gets the inside elements
     * @return the elements inside
     */
    public Element[] getElements()
    {
        return elements;
    }

    /**
     * Sets the elements inside
     * @param elements the elements inside
     */
    public void setElements(Element[] elements)
    {
        this.elements = elements;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(Element e : elements)
        {
            sb.append(e.toString());
        }
        return sb.toString();
    }

    public void addClass(String className)
    {
        if(classes.isPresent())
        {
            classes.get().add(className);
        }
        else
        {
            LinkedList<String> list = new LinkedList<>();
            list.add(className);
            classes = Optional.of(list);
        }
    }

    public String getClasses()
    {
        StringBuilder sb = new StringBuilder();
        for(String s : classes.get())
        {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }

    public void removeClass(String className)
    {
        if(!classes.isPresent())
        {
            return;
        }
        classes.get().remove(className);
    }
}

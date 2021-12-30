package me.mrxbox98.VeloJ.elements;

import java.util.LinkedList;
import java.util.Optional;

public class Element {

    /**
     * The elements inside this parent element
     */
    private Element[] elements;

    /**
     * the CSS Classes of this element
     */
    private LinkedList<String> classes = new LinkedList<>();

    /**
     * The css style of this element
     */
    private String style = null;

    /**
     * Whether this element should be cached or not
     */
    private boolean shouldCache = false;

    /**
     * The content of this element for caching purposes
     */
    private String cache = null;

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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isShouldCache() {
        return shouldCache;
    }

    public void setShouldCache(boolean shouldCache) {
        this.shouldCache = shouldCache;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    /**
     * Gets the HTML compatible string for rendering
     * @return the HTML compatible string
     */
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        if(style!=null)
        {
            sb.append(" style=\"");
            sb.append(style);
            sb.append("\"");
        }

        String classes = getClasses();

        if(classes.length()!=0)
        {
            sb.append(" class=\"");
            sb.append(classes);
            sb.append("\"");
        }
        sb.append(">");

        for(Element e : elements)
        {
            sb.append(e.toString());
        }
        return sb.toString();
    }

    public void addClass(String className)
    {
        classes.add(className);
    }

    public String getClasses()
    {
        StringBuilder sb = new StringBuilder();

        for(String s : classes)
        {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }

    public void removeClass(String className)
    {
        classes.remove(className);
    }
}

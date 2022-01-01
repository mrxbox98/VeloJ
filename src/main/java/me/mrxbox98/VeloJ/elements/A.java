package me.mrxbox98.VeloJ.elements;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Mrxbox98
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a">a element</a>
 */
public class A extends Element {

    /**
     * The download link if this is downloading a file
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a#attr-download">Download Attribute</a>
     */
    private String download = null;

    /**
     * The href of the link
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a#attr-href">Href Attribute</a>
     */
    private String href = null;

    /**
     * The language of the link
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a#attr-hreflang">Hreflang Attribute</a>
     */
    private String hreflang = null;

    /**
     * The ping list of the link
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a#attr-ping">Ping Attribute</a>
     */
    private ArrayList<String> ping = new ArrayList<>();

    /**
     * Gets the Download file
     * @return the download file
     */
    public String getDownload() {
        return download;
    }

    /**
     * Sets the download file
     * @param download the file to download
     * @return the current object for chaining
     */
    public A setDownload(String download) {
        this.download = download;
        return this;
    }

    /**
     * Gets the href value
     * @return the href link
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the href value
     * @param href the new href
     * @return the current object for chaining
     */
    public A setHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Gets the hreflang value
     * @return the hreflang value
     */
    public String getHreflang() {
        return hreflang;
    }

    /**
     * Sets the hreflang value
     * @param hreflang the new hreflang value
     * @return the current object for chaining
     */
    public A setHreflang(String hreflang) {
        this.hreflang = hreflang;
        return this;
    }

    /**
     * Gets the ping list
     * @return the ping list
     */
    public ArrayList<String> getPing() {
        return ping;
    }

    /**
     * Sets the ping list
     * @param ping the new ping list
     * @return the current object for chaining
     */
    public A setPing(ArrayList<String> ping) {
        this.ping = ping;
        return this;
    }

    /**
     * Sets the ping list
     * @param ping the new ping list
     * @return the current object for chaining
     */
    public A setPing(String ping) {
        this.ping = (ArrayList<String>) Arrays.asList(ping.split(" "));
        return this;
    }

    /**
     * Converts this element into an HTML ready string
     * @return The HTML ready string
     */
    public String toString() {

        //Caching logic first
        if(isShouldCache() && getCache()!=null)
        {
            return getCache();
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<a");
        if(getDownload()!=null) {
            sb.append(" download=\"").append(getDownload()).append("\"");
        }
        if(getHref()!=null) {
            sb.append(" href=\"").append(getHref()).append("\"");
        }
        sb.append(super.toString());
        sb.append("</a>");

        //Cache logic second
        if(isShouldCache())
        {
            setCache(sb.toString());
            return getCache();
        }

        return sb.toString();
    }
}

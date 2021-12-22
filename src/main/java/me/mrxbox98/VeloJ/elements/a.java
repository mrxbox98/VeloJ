package me.mrxbox98.VeloJ.elements;

import java.util.Optional;

/**
 * REFERENCE: https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a
 * @author Mrxbox98
 */
public class a extends Element {


    /**
     * REFERENCE: https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a#attr-download
     * The download link if this is downloading a file
     */
    private Optional<String> download = Optional.empty();

    private String href = "";



    public String getDownload() {
        return download.orElse("");
    }

    public void setDownload(String download) {
        this.download = Optional.of(download);
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * Converts this element into an HTML ready string
     * @return The HTML ready string
     */
    public String toString() {



        StringBuilder sb = new StringBuilder();
        sb.append("<a");
        if(!getDownload().isEmpty()) {
            sb.append(" download=\"").append(getDownload()).append("\"");
        }
        if(!getHref().isEmpty()) {
            sb.append(" href=\"").append(getHref()).append("\"");
        }
        sb.append(">");
        sb.append(super.toString());
        sb.append("</a>");
        return sb.toString();
    }
}

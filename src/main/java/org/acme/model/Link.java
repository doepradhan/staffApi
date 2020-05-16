package org.acme.model;

public class Link {
    
    private String href;
    private String ref;

    public Link() {
    }

    public Link(String href, String ref) {
        this.href = href;
        this.ref = ref;
    }

    public String getHref() {
        return this.href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRef() {
        return this.ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

}
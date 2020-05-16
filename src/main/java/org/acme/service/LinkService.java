package org.acme.service;

import java.util.ArrayList;
import java.util.List;

import io.smallrye.mutiny.Uni;
import org.acme.model.Link;

public class LinkService {

    public static List<Link> getLinks(String href, String ref) {

        Link link = new Link(href, ref);
        List<Link> links = new ArrayList<Link>();
        links.add(link);

        return links;
    }
}

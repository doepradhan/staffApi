package org.acme.model;

import java.util.List;

import io.smallrye.mutiny.Uni;

public class StaffResponse {

    private List<Link> links;
    private List<Staff> staff;


    public StaffResponse() {
    }

    public StaffResponse(List<Link> links, List<Staff> staff) {
        this.links = links;
        this.staff = staff;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
}

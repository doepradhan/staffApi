package org.acme.resource;

import org.acme.model.Link;
import org.acme.model.Staff;
import org.acme.model.StaffResponse;
import org.acme.service.LinkService;
import org.acme.service.StaffService;

import io.smallrye.mutiny.Uni;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/staff")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StaffResource {

    @Inject
    StaffService staffService;

    @GET
    @Path("/unpaginated")
    public Uni<List<Staff>> unpaginatedStaffList() {
        return staffService.getStaffResponse();
    }

    @GET
    @Path("/paginated")
    public StaffResponse paginatedStaffList() {
        List<Link> links = LinkService.getLinks("/staff?page=2&limit=20", "next");
        Uni<List<Staff>> staff = (Uni<List<Staff>>) staffService.getStaffResponse();
        return new StaffResponse(links, staff);
    }

}
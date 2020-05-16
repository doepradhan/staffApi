package org.acme.service;

import org.acme.model.Staff;

import io.quarkus.mongodb.reactive.ReactiveMongoClient;
import io.quarkus.mongodb.reactive.ReactiveMongoCollection;
import io.smallrye.mutiny.Uni;

import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class StaffService {

    @Inject 
    ReactiveMongoClient mongoClient;

    public Uni<List<Staff>> getStaffResponse(){
        return getCollection().find()
                .map(document -> {
                    Staff staff = new Staff();
                    staff.setStaffIdentifier(document.getString("staffIdentifier"));
                    staff.setStaffGivenName(document.getString("staffGivenName"));
                    return staff;
                }).collectItems().asList();
    }

    private ReactiveMongoCollection<Document> getCollection() {
        return mongoClient.getDatabase("staff").getCollection("kafka_staff");
    }
   
}
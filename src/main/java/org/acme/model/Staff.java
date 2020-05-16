package org.acme.model;

import java.util.Objects;

public class Staff {
    
    private String staffIdentifier;
    private String staffGivenName;

    public Staff() {
    }

    public Staff(String staffIdentifier, String staffGivenName) {
        this.staffIdentifier = staffIdentifier;
        this.staffGivenName = staffGivenName;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Staff)) {
            return false;
        }

        Staff other = (Staff) obj;

        return Objects.equals(other.staffIdentifier, this.staffIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.staffIdentifier);
    }

    public String getStaffIdentifier() {
        return staffIdentifier;
    }

    public void setStaffIdentifier(String staffIdentifier) {
        this.staffIdentifier = staffIdentifier;
    }

    public String getStaffGivenName() {
        return staffGivenName;
    }

    public void setStaffGivenName(String staffGivenName) {
        this.staffGivenName = staffGivenName;
    }
}
package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    //id, nextId, value, constructors, toString, equals
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }
    //custom methods
    @Override
    public String toString() {
        if (this.value == "") {
            return value = "Data not available.";
        } else return value;
    }
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //Getters and Setters
    public JobField(String value) {
        this();
        this.value = value;
    }

    public String getValue() {
//        if (this.value == "") {
//            return value = "Data not available.";
//        }
//        else
            return value;
    }

    public void setValue(String value) {
//        if (this.value == "") {
//            this.value = "Data not available.";
//        }
        this.value = value;
    }

    public int getId() {
        return id;
    }
}

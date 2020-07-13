package org.launchcode.techjobs_oo;
//stuck on 4.3 how to code the Data not available into the multiline string along with other lines
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job (){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                name.equals(job.name) &&
                employer.equals(job.employer) &&
                location.equals(job.location) &&
                positionType.equals(job.positionType) &&
                coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public String toString() {
        return
                "ID: " + getId()+ "\n" +
                "Name: " + getName()+ "\n" +
                "Employer: " + getEmployer()+ "\n" +
               "Location: " + getLocation()+ "\n" +
                "Position Type: " + getPositionType()+ "\n" +
                "Core Competency: " + getId(); //+ "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        if (this.name == "") {
            return this.name = "Data not available.";
        }
            return name;
    }

    public void setName(String name) {  //tried null & name "" & == & isEmpty()
        this.name = name;
    }
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        if (employer.getValue() == "") {
            this.employer.setValue("Data not available");
        }
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

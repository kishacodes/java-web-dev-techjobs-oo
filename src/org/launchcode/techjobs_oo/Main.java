package org.launchcode.techjobs_oo;
//Finished it except for the Data not available, still can't get it to display.
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        Job job5 = new Job("Web developer", new Employer("Tidal"), new Location("San Francisco"), new PositionType("Production"), new
                CoreCompetency("java certified"));

        ArrayList<Job> jobs = new ArrayList<>();

        jobs.add(job1);
        jobs.add(job3);

        for (Job job : jobs){
            System.out.println(job);
        }
    }

}

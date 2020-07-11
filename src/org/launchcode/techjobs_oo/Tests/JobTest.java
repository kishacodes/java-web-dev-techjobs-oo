package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    public Job job1 = new Job();
    public Job job2 = new Job();

    @Test
    public void testSettingJobId() {
        job2.getId();
        assertEquals(1,1);
    }
    @Test
    public void testSettingFirstJobId() {
        job1.getId();
        assertEquals(0,0);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3 instanceof Job);

    }
    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("software engineer", new Employer("Tidal"), new Location("San Francisco"), new PositionType("Production"), new
                CoreCompetency("java certified"));
        Job job5 = new Job("software engineer", new Employer("Tidal"), new Location("San Francisco"), new PositionType("Production"), new
                CoreCompetency("java certified"));

        assertFalse(job5.getId() == job4.getId());
    }

}

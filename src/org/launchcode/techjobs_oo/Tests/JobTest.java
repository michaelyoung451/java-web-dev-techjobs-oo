package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;

    @Before
    public void createNewJobs() {
        test_job1 = new Job();
        test_job2 = new Job();
    }
    @Test
    public void testSettingJobId() {
        assertEquals(1, test_job2.getId()-test_job1.getId(), .001);
    }

    @Test
    public void testJobsConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob.getName().toString());
        assertEquals("ACME",testJob.getEmployer().toString());
        assertEquals("Desert", testJob.getLocation().toString());
        assertEquals("Quality control", testJob.getPositionType().toString());
        assertEquals("Persistence", testJob.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job1.equals(test_job2));
    }

    @Test
    public void testToString() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        String testJobString = testJob.toString();
        assertEquals("\n" +
                "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data Not Available\n", testJobString);
    }
}

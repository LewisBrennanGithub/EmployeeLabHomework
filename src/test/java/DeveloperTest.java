import org.junit.Before;
import org.junit.Test;

import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {developer = new Developer("Clive", "E61B53", 5.0);}

    @Test
    public void developerHasName() {assertEquals("Clive", developer.getName());}

    @Test
    public void developerHasNiNumber() {assertEquals("E61B53", developer.getNiNumber());}

    @Test
    public void developerHasSalary() {assertEquals(5.0, developer.getSalary(), 0.0);}

    @Test
    public void developerHasRaise()
    {
        developer.raiseSalary(2.0);
        assertEquals(7.0, developer.getSalary(), 0.0);
    }

    @Test
    public void developerHasBonus()
    {
        assertEquals(0.05, developer.payBonus(), 0.0);
    }
}

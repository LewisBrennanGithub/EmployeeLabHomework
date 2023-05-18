import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {databaseAdmin = new DatabaseAdmin("Clive", "E61B53", 5.0);}

    @Test
    public void databaseAdminHasName() {assertEquals("Clive", databaseAdmin.getName());}

    @Test
    public void databaseAdminHasNiNumber() {assertEquals("E61B53", databaseAdmin.getNiNumber());}

    @Test
    public void databaseAdminHasSalary() {assertEquals(5.0, databaseAdmin.getSalary(), 0.0);}

    @Test
    public void databaseAdminHasRaise()
    {
        databaseAdmin.raiseSalary(2.0);
        assertEquals(7.0, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void databaseAdminHasBonus()
    {
        assertEquals(0.05, databaseAdmin.payBonus(), 0.0);
    }

}

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {manager = new Manager("Clive", "E61B53", 5.0, "CSS");}

    @Test
    public void managerHasName() {assertEquals("Clive", manager.getName());}

    @Test
    public void managerHasNiNumber() {assertEquals("E61B53", manager.getNiNumber());}

    @Test
    public void managerHasSalary() {assertEquals(5.0, manager.getSalary(), 0.0);}

    @Test
    public void managerHasDept() {assertEquals("CSS", manager.getDeptName());}

    @Test
    public void managerHasRaise()
    {
        manager.raiseSalary(2.0);
        assertEquals(7.0, manager.getSalary(), 0.0);
    }

    @Test
    public void managerHasBonus()
    {
     assertEquals(0.05, manager.payBonus(), 0.0);
    }
}

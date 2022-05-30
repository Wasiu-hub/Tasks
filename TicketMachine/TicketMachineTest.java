
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TicketMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TicketMachineTest
{
    /**
     * Default constructor for test class TicketMachineTest
     */
    public TicketMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void constructorTest()
    {
        TicketMachine ticket = new TicketMachine(50);
        assertEquals(50, ticket.getPrice());
        assertEquals(0, ticket.getBalance());
        assertEquals(0, ticket.getTotal());
    }

    @Test
    public void insertMoneyTest(){
        TicketMachine tm = new TicketMachine(50);
        tm.insertMoney(10);
        assertEquals(50, tm.getPrice());
        assertEquals(10, tm.getBalance());
        assertEquals(0, tm.getTotal());}
        
    @Test
    public void printTicketTest(){
        TicketMachine tm = new TicketMachine(50);
        tm.insertMoney(50);
        tm.printTicket();
        assertEquals(50, tm.getPrice());
        assertEquals(0, tm.getBalance());
        assertEquals(50, tm.getTotal());
        
    }
    // this added in the lecture
    @Test
    // public void printTicketFail(){ // this line changed to below next line
        public void underchargeTest(){
        TicketMachine tm = new TicketMachine(50);
        tm.insertMoney(10);
        tm.printTicket();
        assertEquals(50, tm.getPrice());
        assertEquals(10, tm.getBalance());
        assertEquals(0, tm.getTotal());
    }
    
     @Test
    public void overchargeTest(){ // this added in the lecture
        TicketMachine tm = new TicketMachine(50);
        tm.insertMoney(70);
        tm.printTicket();
        assertEquals(50, tm.getPrice());
        assertEquals(20, tm.getBalance());
        assertEquals(50, tm.getTotal());
    }
    
    
}

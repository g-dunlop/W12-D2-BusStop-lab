import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("The moon", 4);
        person = new Person();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengersCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassengerToBus(person);
        assertEquals(1, bus.passengersCount());
    }
    @Test
    public void canRemovePassenger(){
        bus.addPassengerToBus(person);
        bus.removePassenger();
        assertEquals(0, bus.passengersCount());
    }


}

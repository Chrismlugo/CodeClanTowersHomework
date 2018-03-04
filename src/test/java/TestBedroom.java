import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBedroom {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void setUp() throws Exception {
        bedroom = new Bedroom(2, 902, 250.0, 3);
        guest = new Guest("Ryan", 400.00);

    }

    @Test
    public void canAddGuestToRoom() {
        bedroom.guests.add(guest);
        assertEquals(1, bedroom.countGuests());
    }
}

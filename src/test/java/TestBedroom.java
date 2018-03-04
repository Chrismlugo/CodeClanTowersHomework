import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBedroom {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void setUp() throws Exception {
        bedroom = new Bedroom( 902, Type.DOUBLE);
        guest = new Guest("Ryan", 400.00);

    }

    @Test
    public void canAddGuestToRoom() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
        bedroom.removeGuest();
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        Guest guest2 = new Guest("Vic", 500.00);
        bedroom.removeGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canGetPriceOfRoom(){
        assertEquals(210.0, bedroom.getRoomPrice(), 0.1);
    }

    @Test
    public void testRoomHasCapacity(){
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void testCanGetGuestsName(){
        assertEquals("Ryan", bedroom.findGuestByName(guest));
    }




}

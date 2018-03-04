import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        diningRoom = new DiningRoom(18, "Chris's Italian Kitchen");
        guest1 = new Guest("Brian", 50.00);
        guest2 = new Guest("Nichola", 30.00);
    }

    @Test
    public void noGuestsInDiningRoom(){
        assertEquals(0, diningRoom.countGuests());
    }


}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMeetingRoom {
    MeetingRoom meetingRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void setUp() throws Exception {
        meetingRoom = new MeetingRoom(8, 001, "Meeting room A", 150.00);
        guest1 = new Guest("Chris", 50.00);
        guest2 = new Guest("Ross", 45.00);
        guest3 = new Guest("Laura", 35.00);
        guest4 = new Guest("Brenda", 25.00);
    }

    @Test
    public void canAddGuestsToMeetingRoom(){
        meetingRoom.guests.add(guest1);
        meetingRoom.guests.add(guest2);
        meetingRoom.guests.add(guest3);
        meetingRoom.guests.add(guest4);
        assertEquals(4, meetingRoom.countGuests());
    }
}

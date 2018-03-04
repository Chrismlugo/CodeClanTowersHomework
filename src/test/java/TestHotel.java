import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {
    Hotel hotel;
    MeetingRoom meetingRoom;
    DiningRoom diningRoom;
    Bedroom bedroom;
    ArrayList<Bedroom> bedrooms;

    @Before
    public void setUp() throws Exception {
        meetingRoom = new MeetingRoom(20, "Meeting Room", 150);
        diningRoom = new DiningRoom(40, "Grill Room");
        hotel = new Hotel(meetingRoom, diningRoom);
        bedrooms = new ArrayList<>();
        bedroom = new Bedroom(205, Type.SINGLE);

    }


    @Test
    public void testHotelCanHaveRooms(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.countBedRooms());
    }

    @Test
    public void meetingRoomIsEmpty(){
        assertEquals(0, hotel.countMeetingRoom());
    }

    @Test
    public void diningRoomIsEmpty(){
        assertEquals(0, hotel.countDiningRoom());
    }

    @Test
    public void canCheckGuestIntoRoom(){
        Bedroom bedroom2 = new Bedroom(201, Type.SUPER);
        hotel.addBedroom(bedroom2);
        Guest guest1 = new Guest("John", 230.00);
        hotel.checkIn(guest1);
        assertEquals(1, bedroom2.countGuests());

    }

    @Test
    public void canCheckManyGuestsIntoRoom(){
        Bedroom bedroom2 = new Bedroom(201, Type.SUPER);
        hotel.addBedroom(bedroom2);
        Guest guest1 = new Guest("John", 230.00);
        Guest guest2 = new Guest("Jayne", 250.00);
        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        assertEquals(2, bedroom2.countGuests());

    }

    @Test
    public void guestCanBeCheckedOut(){
        Bedroom bedroom2 = new Bedroom(201, Type.SUPER);
        hotel.addBedroom(bedroom2);
        Guest guest1 = new Guest("John", 230.00);
        Guest guest2 = new Guest("Jayne", 250.00);
        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        assertEquals(2, bedroom2.countGuests());
        hotel.checkOut(guest1);
        hotel.checkOut(guest2);
        assertEquals(0, bedroom2.countGuests());

    }


}

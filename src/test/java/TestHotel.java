import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {
    Hotel hotel;
    Bedroom bedroom;
    MeetingRoom meetingroom;
    DiningRoom diningroom;
    Guest guest1;
    Guest guest2;

    ArrayList<Bedroom> bedrooms;
    ArrayList<MeetingRoom> meetingrooms;
    ArrayList<DiningRoom> diningrooms;



    @Before
    public void setUp() throws Exception {
        hotel = new Hotel();
        bedrooms = new ArrayList<>();
        meetingrooms = new ArrayList<>();
        diningrooms = new ArrayList<>();
        bedroom = new Bedroom(201, Type.SUPER);
        meetingroom = new MeetingRoom(12,"Meeting Room", 150.00);
        diningroom = new DiningRoom(25, "Little Italian");
        guest1 = new Guest("John", 230.00);
        guest2 = new Guest("Jayne", 250.00);


    }


    @Test
    public void testHotelCanHaveRooms(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.countBedRooms());
    }


    @Test
    public void canCheckGuestIntoRoom(){
        hotel.addBedroom(bedroom);
        hotel.checkIn(guest1);
        assertEquals(1, bedroom.countGuests());

    }

    @Test
    public void canCheckManyGuestsIntoRoom(){
        hotel.addBedroom(bedroom);
        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        assertEquals(2, bedroom.countGuests());

    }

    @Test
    public void guestCanBeCheckedOut(){
        hotel.addBedroom(bedroom);
        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        assertEquals(2, bedroom.countGuests());
        hotel.checkOut(guest2);
        hotel.checkOut(guest1);
        assertEquals(0, bedroom.countGuests());

    }

    @Test
    public void canCheckGuestsAreInRoom(){
        hotel.addBedroom(bedroom);
        hotel.checkIn(guest1);
        hotel.checkIn(guest2);
        hotel.findGuests(201);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void testThereAreNoGuestsInRoom(){
        hotel.findGuests(201);
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void testCanCheckAllVacantRooms(){
        Bedroom bedroom1 = new Bedroom(235, Type.FAMILY);
        hotel.addBedroom(bedroom1);
        hotel.checkIn(guest1);
        hotel.addBedroom(bedroom);

        assertEquals(1,  hotel.findVacantRooms());
    }



}

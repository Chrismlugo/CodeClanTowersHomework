import java.util.ArrayList;

public class Hotel {
    ArrayList<Bedroom> bedrooms;
    private MeetingRoom meetingroom;
    private DiningRoom diningroom;
    private Bedroom bedroom;

    public Hotel(MeetingRoom meetingroom, DiningRoom diningroom){
        bedrooms = new ArrayList<>();

        this.meetingroom = meetingroom;
        this.diningroom = diningroom;
        this.bedroom = new Bedroom(210,Type.DOUBLE);


    }


    public int countBedRooms() {
        return bedrooms.size();
    }

    public int countMeetingRoom() {
      return  meetingroom.countGuests();
    }


    public int countDiningRoom() {
        return diningroom.countGuests();
    }


    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void checkIn(Guest guest) {
        for(Bedroom bedroom: bedrooms){
            if( bedroom.countGuests() <= bedroom.getRoomCapacity()){
                bedroom.addGuest(guest);
            }
        }
    }


    public void checkOut(Guest guest) {
        for(Bedroom bedroom: bedrooms){
            if(guest.getName() == bedroom.findGuestByName(guest)){
                bedroom.removeGuest();
            }


        }

    }
}

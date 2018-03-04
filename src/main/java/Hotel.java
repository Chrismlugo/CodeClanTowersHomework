import java.util.ArrayList;

public class Hotel {
    ArrayList<Bedroom> bedrooms;
    ArrayList<MeetingRoom> meetingrooms;
    ArrayList<DiningRoom> diningrooms;


    public Hotel(){
        bedrooms = new ArrayList<>();
        meetingrooms = new ArrayList<>();
        diningrooms = new ArrayList<>();

    }


    public int countBedRooms() {
        return bedrooms.size();
    }

    public int countDiningRooms(){
        return diningrooms.size();
    }

    public int countMeetingRooms(){
        return meetingrooms.size();
    }



    public void addDiningRoom(DiningRoom diningroom){
        diningrooms.add(diningroom);
    }

    public void addMeetingRoom(MeetingRoom meetingroom){
        meetingrooms.add(meetingroom);
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
            if(guest.Name() == bedroom.findGuestByName(guest)){
                bedroom.removeGuest();

            }


        }

    }
}

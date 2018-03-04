import java.util.ArrayList;

public abstract class Room {

    ArrayList<Guest> guests;


    public Room(){
        guests = new ArrayList<>();

    }

    public void addGuest(Guest guest){
           guests.add(guest);

    }

    public void removeGuest(){
        guests.remove(0);
    }

    public String findGuestByName(Guest guest) {
         return guest.Name();
    }


    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public void getGuests(){
        ArrayList<Guest> copy = this.guests;
    }


    public int countGuests(){
        return guests.size();
    }




}

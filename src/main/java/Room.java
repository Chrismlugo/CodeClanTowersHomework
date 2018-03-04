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
         return guest.getName();
    }


    public void removeGuestByName(String name){
        this.guests.remove(name);
    }

    public void removeGuestByIndex(){
        this.guests.remove(0);
    }

    public int countGuests(){
        return guests.size();
    }




}

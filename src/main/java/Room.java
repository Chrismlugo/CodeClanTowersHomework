import java.util.ArrayList;

public abstract class Room {
    int capacity;
    ArrayList<Guest> guests;
    int roomNumber;

    public Room(int capacity, int roomNumber){
        guests = new ArrayList<>();
        this.capacity = capacity;
        this.roomNumber = roomNumber;
    }

    public void addCard(Guest guest){
        guests.add(guest);
    }

    public int countGuests(){
        return guests.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}

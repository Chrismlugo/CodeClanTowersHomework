

public class DiningRoom extends Room{
    private int capacity;
    private String name;

    public DiningRoom(int capacity, String name){
        super();
        this.name = name;
        this.capacity = capacity;
    }

    public void addGuest(Guest guest){
        if(countGuests() < capacity){
            guests.add(guest);
        }
    }
}

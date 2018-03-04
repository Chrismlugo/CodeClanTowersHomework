import java.util.ArrayList;

public class MeetingRoom extends Room{
    private String name;
    private double price;

    public MeetingRoom(int capacity, int roomNumber, String name, double price){
        super(capacity, roomNumber);
        this.name = name;
        this.price = price;
        guests = new ArrayList<>();
    }
}

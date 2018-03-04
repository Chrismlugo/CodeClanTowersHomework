import java.util.ArrayList;

public class Bedroom extends Room{
    private double cost;
    private int nightStay;

    public Bedroom(int capacity, int roomNumber, double cost, int nightStay){
        super(capacity, roomNumber);
        guests = new ArrayList<>();
        this.cost = cost;
        this.nightStay = nightStay;
    }
}

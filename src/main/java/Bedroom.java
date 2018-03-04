import java.util.ArrayList;

public class Bedroom extends Room{
    private final Type type;
    private int roomNumber;


    public Bedroom( int roomNumber, Type type){
        super();
        this.roomNumber = roomNumber;
        this.type = type;

    }

    public int getRoomNumber() {
        return roomNumber;
    }



        public Type getType() {

        return type;
    }

    public double getRoomPrice(){
        return type.getPrice();
    }

    public int getRoomCapacity() {
        return type.getCapacity();
    }


}

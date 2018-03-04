public enum Type {
    SINGLE(110.00, 1),
    DOUBLE(210.00, 2),
    SUPER(299.00, 2),
    FAMILY(410.00, 4);

    private final double price;
    private final int capacity;

    Type(double price, int capacity){
        this.price = price;
        this.capacity = capacity;
    }

    public double getPrice(){
        return price;
    }
    public int getCapacity(){
        return capacity;
    }

}

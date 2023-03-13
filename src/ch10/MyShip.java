package ch10;

public class MyShip extends Ship{
    private String name;
    public MyShip(String name){
        this.name = name;
    }
    @Override
    public int maxPassengers() {
        return 100;
    }

    @Override
    public int maxLuggage() {
        return 100;
    }
}

package ch09;

public class CarExam {
    public static void main(String[] args) {
        Car k3 = new Car("white", "kia", "k3");


        k3.showInfo();
        k3.startCar();
        k3.speedUp();
        k3.stop();

        Taxi taxi = new Taxi("black", "tesla", "3");
        taxi.startMeter();
        taxi.stopMeter();

        Truck truck = new Truck("black", "hyundai", "bongo");
        truck.load();
        truck.offload();
    }

}
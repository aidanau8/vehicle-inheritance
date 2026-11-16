
public class Main {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car myCar = new Car();
        myCar.setColor("Black");
        myCar.setNumberOfPassengers(5);

        SemiTruck truck = new SemiTruck();
        truck.setCargoCapacity(10000);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("White");

        System.out.println(slowRide.getColor());
        System.out.println(slowRide.getFuelCapacity());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getNumberOfPassengers());
        System.out.println(truck.getCargoCapacity());
        System.out.println(hovercraft.getColor());
    }
}

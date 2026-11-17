
        public class Main {

            public static void main(String[] args) {

                Moped slowRide = new Moped("Red", 1, 0, 5);

                Car myCar = new Car("Black", 5, 500, 60);

                SemiTruck truck = new SemiTruck("Blue", 2, 10000, 300);

                Hovercraft hovercraft = new Hovercraft("White", 8, 1000, 100);

                System.out.println(slowRide.getColor());
                System.out.println(slowRide.getFuelCapacity());

                System.out.println(myCar.getColor());
                System.out.println(myCar.getNumberOfPassengers());

                System.out.println(truck.getCargoCapacity());

                System.out.println(hovercraft.getColor());
            }
        }

public class Main {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        double liters;
        int dist = 100;

        minivan.passengers = 7;
        minivan.fuelCap = 65;
        minivan.lkm = 9.1;

        sportscar.passengers = 2;
        sportscar.fuelCap = 55;
        sportscar.lkm = 12.5;

        liters = minivan.fuelNeeded(dist);
        System.out.println("Minivan needs " + liters + " to ride " + dist + ".");

        liters = sportscar.fuelNeeded(dist);
        System.out.println("Sportscar needs " + liters + " to ride " + dist + ".");
    }
}

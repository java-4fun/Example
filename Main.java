public class Main {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 65, 9.1);
        Vehicle sportscar = new Vehicle(2, 55, 12.5);

        double liters;
        int dist = 200;

        liters = minivan.fuelNeeded(dist);
        System.out.println("Minivan needs " + liters + " to ride " + dist + " km.");

        liters = sportscar.fuelNeeded(dist);
        System.out.println("Sportscar needs " + liters + " to ride " + dist + " km.");
    }
}

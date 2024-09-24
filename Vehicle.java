public class Vehicle {
    int passengers;
    int fuelCap;
    double lkm;

    Vehicle(int p, int f, double l) {
        passengers = p;
        fuelCap = f;
        lkm = l;
    }
    int range() {
        return (int) (fuelCap / lkm * 100);
    }

    double fuelNeeded(int km) {
        return (double) km / 100 * lkm;
    }
}

public class Vehicle {
    int passengers;
    int fuelCap;
    double lkm;

    int range() {
        return (int) (fuelCap / lkm * 100);
    }

    double fuelNeeded(int km) {
        return (double) km / 100 * lkm;
    }
}

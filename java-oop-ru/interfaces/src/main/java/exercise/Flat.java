package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    double totalArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
        this.totalArea = area + balconyArea;
    }

    @Override
    public double getArea() {
        return this.totalArea;
    }

    @Override
    public int  compareTo(Home another) {
        if (this.totalArea == another.getArea()) {
            return 0;
        } else {
            return (this.totalArea > another.getArea()) ? 1 : -1;
        }
    }

    public String toString() {
        return "Квартира площадью "
                + totalArea + " метров"
                + " на " + floor
                + " этаже";
    }
}
// END

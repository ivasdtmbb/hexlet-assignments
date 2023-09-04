package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    public String toString() {
        return floorCount
                + " этажный коттедж площадью "
                + area
                + " метров";
    }

    @Override
    public int compareTo(Home another) {
        if (this.area == another.getArea()) {
            return 0;
        } else {
            return (this.area > another.getArea()) ? 1 : -1;
        }
    }
}
// END

package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        Integer midX = (this.beginPoint.getX() + this.endPoint.getX()) / 2;
        Integer midY = (this.beginPoint.getY() + this.endPoint.getY()) / 2;
        Point midPoint = new Point(midX, midY);
        return midPoint;
    }
}
// END

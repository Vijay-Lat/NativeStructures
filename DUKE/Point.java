
public class Point {

    private int x;
    private int y;

    public Point(int startX, int startY) {
        x = startX;
        y = startY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point otherP) {

        int dx = x - otherP.getX();
        int dy = y - otherP.getY();

        return Math.sqrt(dx * dx + dy * dy);

    }

}

public class Point {
    private int x;
    private int y;

    // Конструкторы
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Методы
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        return x >= topLeft.getX() && x <= bottomRight.getX() &&
                y >= bottomRight.getY() && y <= topLeft.getY();
    }

    public boolean isInCircle(Point center, int radius) {
        int dx = x - center.getX();
        int dy = y - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }
}

public class Point3D extends Point {
    private int z;

    // Конструкторы
    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // Методы
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }

    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        int minX = Math.min(corner1.getX(), corner2.getX());
        int maxX = Math.max(corner1.getX(), corner2.getX());
        int minY = Math.min(corner1.getY(), corner2.getY());
        int maxY = Math.max(corner1.getY(), corner2.getY());
        int minZ = Math.min(corner1.getZ(), corner2.getZ());
        int maxZ = Math.max(corner1.getZ(), corner2.getZ());

        return getX() >= minX && getX() <= maxX &&
                getY() >= minY && getY() <= maxY &&
                getZ() >= minZ && getZ() <= maxZ;
    }

    public boolean isInSphere(Point3D center, int radius) {
        int dx = getX() - center.getX();
        int dy = getY() - center.getY();
        int dz = getZ() - center.getZ();
        return dx * dx + dy * dy + dz * dz <= radius * radius;
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        Point3D point1 = new Point3D(1, 2, 3);
        Point3D point2 = new Point3D(4, 5, 6);

        System.out.println("Point1: " + point1);
        System.out.println("Point2: " + point2);
        System.out.println("Distance from origin (point1): " + point1.distanceFromOrigin());

        Point3D corner1 = new Point3D(0, 0, 0);
        Point3D corner2 = new Point3D(5, 5, 5);
        System.out.println("Point1 in box: " + point1.isInBox(corner1, corner2));

        Point3D sphereCenter = new Point3D(0, 0, 0);
        System.out.println("Point1 in sphere: " + point1.isInSphere(sphereCenter, 5));
    }
}

public class Cube implements Shape {
    private double length;

    public double getVolume() { return length * length * length; }

    Cube(double length) { this.length = length; }
}

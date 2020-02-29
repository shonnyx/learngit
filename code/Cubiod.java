public class Cubiod implements Shape {
    private double length;
    private double width;
    private double height;

    public double getVolume() { return length * width * height; }

    Cubiod(double length,double width,double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

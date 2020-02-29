public class Cuboid {
    private double length;
    private double width;
    private double height;

    double getVolume() {
        return length * width * height;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

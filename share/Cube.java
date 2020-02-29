public class Cube extends Cuboid {
    Cube(double input) { super(input,input,input); }

    double getLength() { return super.getLength(); }

    void setLength(double length) {
        super.setLength(length);
        super.setHeight(length);
        super.setWidth(length);
    }

    double getVolume() { return super.getVolume(); }
}

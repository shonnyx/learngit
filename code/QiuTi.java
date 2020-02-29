public class QiuTi implements Shape {
    private double r1;

    public double getVolume() { return 4 * r1 * r1 * r1 * Math.PI / 3; }

    QiuTi(double r1) { this.r1 = r1; }
}

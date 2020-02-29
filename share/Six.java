public class Six {
    private double x1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double z3;

    Six(double x1,double x2,double y2,double x3,double y3,double z3) {
        this.x1 = x1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.z3 = z3;
    }

    double getVolume() { return x1 * y2 * z3; }
}

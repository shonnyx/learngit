public class YuanTai implements Shape {
    private double r1;
    private double r2;
    private double h1;

    public double getVolume() {
        return Math.PI * h1 * (r1 * r1 + r2 * r2 + r1 * r2) / 3;
    }

    YuanTai(double r1,double r2,double h1) {
        this.r1 = r1;
        this.r2 = r2;
        this.h1 = h1;
    }
}

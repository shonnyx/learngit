public class YuanZhu implements Shape {
    private double r1;
    private double h1;

    public double getVolume() { return r1 * r1 * Math.PI * h1; }

    YuanZhu(double r1,double h1) {
        this.r1 = r1;
        this.h1 = h1;
    }

}

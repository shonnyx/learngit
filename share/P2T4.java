import java.util.Scanner;
import java.util.ArrayList;

public class P2T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        ArrayList<Double> maxVolume = new ArrayList<Double>();
        ArrayList<String> maxType = new ArrayList<String>();
        ArrayList<Double> total = new ArrayList<Double>();
        for (int  x = 0; x < n;x++) {
            list.add(new ArrayList());
            maxVolume.add(0.0);
            maxType.add("1");
            total.add(0.0);
        }
        for (int x = 0; x < m;x++) {
            int type = sc.nextInt();
            int att = sc.nextInt() - 1;
            if (type == 1) { System.out.println(maxVolume.get(att)); }
            else if (type == 2) { System.out.println(maxType.get(att)); }
            else if (type == 3) { System.out.println(total.get(att)); }
            else if (type == 4) {
                switch (sc.next()) {
                    case "1":
                        Six six1 = new Six(sc.nextDouble(),sc.nextDouble(),
                                sc.nextDouble(), sc.nextDouble(),
                                sc.nextDouble(),sc.nextDouble());
                        list.get(att).add(six1);
                        if (six1.getVolume() > maxVolume.get(att)) {
                            maxVolume.set(att,six1.getVolume());
                            maxType.set(att,"1");
                        }
                        total.set(att,total.get(att) + six1.getVolume());
                        break;
                    case "1.1":
                        Cuboid cuboid1 = new Cuboid(sc.nextDouble(),
                                sc.nextDouble(),sc.nextDouble());
                        list.get(att).add(cuboid1);
                        if (cuboid1.getVolume() > maxVolume.get(att)) {
                            maxVolume.set(att,cuboid1.getVolume());
                            maxType.set(att,"1.1");
                        }
                        total.set(att,total.get(att) + cuboid1.getVolume());
                        break;
                    case "1.1.1":
                        Cube cube1 = new Cube(sc.nextDouble());
                        list.get(att).add(cube1);
                        if (cube1.getVolume() > maxVolume.get(att)) {
                            maxVolume.set(att,cube1.getVolume());
                            maxType.set(att,"1.1.1");
                        }
                        total.set(att,total.get(att) + cube1.getVolume());
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
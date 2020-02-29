import java.util.ArrayList;
import java.util.Scanner;

public class P2T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        ArrayList<Double> maxVolume = new ArrayList<Double>();
        ArrayList<String> maxType = new ArrayList<String>();
        ArrayList<Double> total = new ArrayList<Double>();
        for (int x = 0; x < n; x++) {
            list.add(new ArrayList());
            maxVolume.add(0.0);
            maxType.add("1");
            total.add(0.0);
        }
        for (int x = 0; x < m; x++) {
            int type = sc.nextInt();
            int att = sc.nextInt() - 1;
            if (type == 1) {
                System.out.println(maxVolume.get(att));
            } else if (type == 2) {
                System.out.println(maxType.get(att));
            } else if (type == 3) {
                System.out.println(total.get(att));
            } else if (type == 4) {
                ShapeFactory object = new ShapeFactory();
                String str = sc.nextLine().trim();
                Shape object1 = object.getShape(str);
                list.get(att).add(object1);
                if (object1.getVolume() > maxVolume.get(att)) {
                    maxVolume.set(att, object1.getVolume());
                    maxType.set(att, str);
                }
                total.set(att, total.get(att) + object1.getVolume());
            }
        }
    }
}

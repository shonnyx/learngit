public class ShapeFactory {

    public Shape getShape(String str1) {
        String[] str = str1.split(" ");
        switch (str[0]) {
            case "1":
                return new Six(Double.parseDouble(str[1]),
                        Double.parseDouble(str[2]), Double.parseDouble(str[3]),
                        Double.parseDouble(str[4]), Double.parseDouble(str[5]),
                        Double.parseDouble(str[6]));
            case "1.1":
                return new Cubiod(Double.parseDouble(str[1]),
                        Double.parseDouble(str[2]), Double.parseDouble(str[3]));
            case "1.1.1":
                return new Cube(Double.parseDouble(str[1]));
            case "2":
                return new YuanTai(Double.parseDouble(str[1]),
                        Double.parseDouble(str[2]), Double.parseDouble(str[3]));
            case "2.1":
                return new YuanZhu(Double.parseDouble(str[1]),
                        Double.parseDouble(str[2]));
            case "2.2":
                return new YuanZhui(Double.parseDouble(str[1]),
                        Double.parseDouble(str[2]));
            case "3":
                return new QiuTi(Double.parseDouble(str[1]));
            default:
                return null;
        }
    }
}

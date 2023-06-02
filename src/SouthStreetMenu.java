import java.util.List;

public class SouthStreetMenu {
    String menu;
    String desc;

    int price;

    public static String t1 = "\"SouthStreet에 오신 것을 환영합니다.\" \n 아래 메뉴판을 보시고 주문해주세요.";


    public String getMenu() {
        return menu;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }

    public void setMenu(String menu, String desc) {
        this.menu = menu;
        this.desc = desc;
    }

    public void setMenuDescPrice(String menu, String desc, int price) {
        this.menu = menu;
        this.desc = desc;
        this.price = price;
    }

    public void outputM(List input){
        for (int i = 0; i < input.size(); i++) {
            SouthStreetMenu s1 = (SouthStreetMenu) input.get(i);
            System.out.printf("%d.%-20s \t | %s", i + 1, s1.getMenu(), s1.getDesc());
            System.out.println();
        }
    }

    public void outputO(List input){
        for (int i = 0; i < input.size(); i++) {
            SouthStreetMenu s1 = (SouthStreetMenu) input.get(i);
            System.out.printf("%d.%-20s \t | %s", i + 5, s1.getMenu(), s1.getDesc());
            System.out.println();
        }
    }

    public void outputP(List input){
        for (int i = 0; i < input.size(); i++) {
            SouthStreetMenu s1 = (SouthStreetMenu) input.get(i);
            double d = (double) s1.getPrice()/1000;
            System.out.printf("%d.%-18s \t | %2.1f | %s", i + 1, s1.getMenu(), d,s1.getDesc());
            System.out.println();
        }
    }

    public static void title(String s) {
        System.out.println("[ " + s + " ]");
    }
}
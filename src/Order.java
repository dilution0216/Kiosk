import java.util.List;

public class Order {
    public static void stop3Second() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public SouthStreetMenu menuPick(String num) {
        InputAll inputAll = new InputAll();
        List w1 = inputAll.InputB();
        int num1 = Integer.parseInt(num);
        SouthStreetMenu s1 = (SouthStreetMenu) w1.get(num1 - 1);
        return s1;
    }

    public SouthStreetMenu outputM(List input, String num) {
        int num1 = Integer.parseInt(num);
        SouthStreetMenu s1 = (SouthStreetMenu) input.get(num1 - 1);
        double d = (double) s1.getPrice() / 1000;
        System.out.printf("%-18s \t | %2.1f | %s", s1.getMenu(), d, s1.getDesc());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인" + "\t" + "2.취소");
        return s1;
    }

    public void menuCheck2(String s){
        System.out.println(s + "가 장바구니에 추가되었습니다.");
        System.out.println("잠시 후 메인으로 이동합니다.");
    }

}

import java.util.ArrayList;
import java.util.List;

public class InputAll {

    public List InputM() {
        // 1. 객체에 값 저장 후 생성하기
        SouthStreetMenu menu1 = new SouthStreetMenu();
        SouthStreetMenu menu2 = new SouthStreetMenu();
        SouthStreetMenu menu3 = new SouthStreetMenu();
        SouthStreetMenu menu4 = new SouthStreetMenu();
        menu1.setMenu("버거", "필라델피아 치즈가 가미된 사우스스트릿만의 버거입니다");
        menu2.setMenu("호기", "미국에서 파는 고기가 들어간 특급 샌드위치입니다");
        menu3.setMenu("사이드", "햄버거와 함께하는 맛있는 사이드 메뉴");
        menu4.setMenu("음료&디저트", "더 짜릿하게 더 시원하게!");
        // 2. 배열(ArrayList)에 값 저장하기
        // menuList에 생성된 객체들 저장하기
        List menuList = new ArrayList();
        menuList.add(menu1);
        menuList.add(menu2);
        menuList.add(menu3);
        menuList.add(menu4);
        return menuList;
    }

    public List InputO() {
        SouthStreetMenu order1 = new SouthStreetMenu();
        SouthStreetMenu order2 = new SouthStreetMenu();

        order1.setMenu("주문", "장바구니를 확인 후 주문합니다.!");
        order2.setMenu("취소", "진행중인 주문을 취소합니다.");

        List orderList = new ArrayList();
        orderList.add(order1);
        orderList.add(order2);
        return orderList;
    }

    public List InputB() {
        SouthStreetMenu hamburger1 = new SouthStreetMenu();
        SouthStreetMenu hamburger2 = new SouthStreetMenu();
        SouthStreetMenu hamburger3 = new SouthStreetMenu();
        SouthStreetMenu hamburger4 = new SouthStreetMenu();
        hamburger1.setMenuDescPrice("치즈버거", "필라델피아산 치즈가 가미된 맛있는 버거", 7500);
        hamburger2.setMenuDescPrice("더블치즈버거", "필라델피아산 치즈가 두배로 가미된 맛있는 버거", 10000);
        hamburger3.setMenuDescPrice("베이컨치즈버거", "필라델피아산 치즈와 베이컨이 가미된 맛있는 버거", 8500);
        hamburger4.setMenuDescPrice("더블베이컨치즈버거", "필라델피아산 치즈와 베이컨이 두배로 가미된 초특급 맛있는버거", 11000);

        List BurgerList = new ArrayList<>();
        BurgerList.add(hamburger1);
        BurgerList.add(hamburger2);
        BurgerList.add(hamburger3);
        BurgerList.add(hamburger4);
        return BurgerList;

    }

    public List InputA() {
        SouthStreetMenu hoagie1 = new SouthStreetMenu();
        SouthStreetMenu hoagie2 = new SouthStreetMenu();
        SouthStreetMenu hoagie3 = new SouthStreetMenu();
        SouthStreetMenu hoagie4 = new SouthStreetMenu();
        hoagie1.setMenuDescPrice("이탈리안호기", "이탈리아식 맛있는 소고기 들어간 호기", 9500);
        hoagie2.setMenuDescPrice("닭가슴살호기", "닭가슴살이 대신 들어간 웰빙 호기", 9500);
        hoagie3.setMenuDescPrice("햄치즈호기", "칠면조 햄이 들어간 치즈 호기", 10000);
        hoagie4.setMenuDescPrice("B.L.T호기", "베이컨, 양상추, 토마토가 들어간 호기", 9500);

        List BurgerList = new ArrayList<>();
        BurgerList.add(hoagie1);
        BurgerList.add(hoagie2);
        BurgerList.add(hoagie3);
        BurgerList.add(hoagie4);
        return BurgerList;
    }

    public List InputS() {
        SouthStreetMenu side1 = new SouthStreetMenu();
        SouthStreetMenu side2 = new SouthStreetMenu();
        SouthStreetMenu side3 = new SouthStreetMenu();
        SouthStreetMenu side4 = new SouthStreetMenu();
        side1.setMenuDescPrice("감자튀김", "주문 즉시 즉석에서 튀겨주는 감자튀김", 3000);
        side2.setMenuDescPrice("치즈 감자튀김", "치즈 시즈닝을 가미한 감자튀김", 4000);
        side3.setMenuDescPrice("컷 웻지", "야무지게 자른 컷 웻지", 4000);
        side4.setMenuDescPrice("버팔로 윙", "매콤하고 맛있는 버팔로 윙", 9500);


        List sideList = new ArrayList();
        sideList.add(side1);
        sideList.add(side2);
        sideList.add(side3);
        sideList.add(side4);
        return sideList;
    }

    public List InputD() {
        SouthStreetMenu drink1 = new SouthStreetMenu();
        SouthStreetMenu drink2 = new SouthStreetMenu();
        SouthStreetMenu drink3 = new SouthStreetMenu();
        SouthStreetMenu drink4 = new SouthStreetMenu();

        drink1.setMenuDescPrice("코카콜라", "콜라는 역시 코카콜라", 2500);
        drink2.setMenuDescPrice("칠성사이다", "사이다는 역시 칠성사이다", 2500);
        drink3.setMenuDescPrice("닥터페퍼", "미국에서 핫한 탄산음료! 마실수록 빠져든다", 2500);
        drink4.setMenuDescPrice("맥주", "수제버거와 함께하는 시원한 생맥주 한 잔 콜?", 5000);

        List drinkList = new ArrayList();
        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);
        drinkList.add(drink4);
        return drinkList;
    }


}
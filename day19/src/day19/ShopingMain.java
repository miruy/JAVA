package day19;

import java.util.Scanner;

public class ShopingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Shoping girl = new Shoping();
		
		girl.setNumber("201803120001");
		girl.setId("abc123");
		girl.setDate("2018년 3월 12일");
		girl.setName("홍길순");
		girl.setGoodsNum("PD0345-12");
		girl.setAdress("서울시 영등포구 여의도동 20번지");
		
		System.out.println("주문 번호 : " + girl.getNumber());
		System.out.println("주문자 아이디 : " + girl.getId());
		System.out.println("주문 날짜 : " + girl.getDate());
		System.out.println("주문자 이름 : " + girl.getName());
		System.out.println("주문 상품 번호 : " + girl.getGoodsNum());
		System.out.println("배송 주소 : " + girl.getAdress());
	}

}

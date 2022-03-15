package exam;

public class Person {
	Market market;

 public static int checkCard;
 //객체 생성없이 접근가능 
 //프로그램 종료까지 계속 실행 
 //chekcard 변수 사용이 많고 값이 자주 변하기 때문에 실행 시 return해주는 값으로 market클래스에서 사용
	String myList;

	String myList(String a) {
		myList = a;
		System.out.println("내가 구매해야할 목록 : " + a);
		if ((market.list).equals(a)) {
			market.cart();
		} else {
			System.out.println(a + "는 구매 목록에 없습니다.");
		}
		return myList;

	}
	 int buy() {
		if (checkCard == 0 || checkCard < market.price) {      //체크카드 속 돈이 0원이거나 물건가격보자 적은 경우 
			System.out.println("금액이 부족합니다. 충전하세요. ");
		} else {
			System.out.println("계산대로 이동하세요.");  //메인에서 계산 메소드 부르기 
		}
		return checkCard;
	}

	int charge(int a) {
		checkCard += a;
		System.out.println("체크카드에 " + a + "원이 충전되었습니다.");
		System.out.println("충전 후 금액 : " + checkCard + "원");
		return checkCard;
	}

}

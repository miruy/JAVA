package exam;

public class Market {
	Person person = new Person();

	String list;   //마트에서 파는 상품목록 
	int price; // 상품의  금액
	int marketMoney; // 마트가 가져갈 돈

	void open(String a) {
		if (a.equals("open")) {
			System.out.println("어서오세요");
		} else if (a.equals("close")) {
			System.out.println("다음에 다시 오세요.");
		}
	}

	String saleList(String a) {
		list = a;
		System.out.println("마트에서 판매하는 상품 : " + list);
		return list;
	}

	void cart() {
		System.out.println("물건을 카트에 넣습니다.");
	}

	int price(int a) {
		price = a;
		System.out.println(list + "의 가격은 " + price + "원 입니다.");
		return price;
	}

	void account() {
		if(person.checkCard < price) {
			System.out.println("금액이 부족해서 계산할 수 없습니다.");
		}else {
			System.out.println(list + "를 구매합니다.");
			person.checkCard -= price; // 체크카드에서 물건가격 뺌 
			System.out.println("구매 후 잔액 : " + person.checkCard + "원"); // 물건 구매 후 총 잔액
			marketMoney += price; // 물건의 가격은 마트가 가져감
			System.out.println("마트 수익 : " + price + "원");
		}
	}

}

package exam;

public class Test11 {

	public static void main(String[] args) {
		//첫날에 10원을 예금하고 다음날에는 전날의 2배를 예금하는 방식으로 한달동안 저축한 금액은?
		
		long save = 10;
		long totalSave = 0;
		int day = 1;
		
		
		for(day = 0; day < 30; day++) {
			totalSave += save;
			save *= 2;
			
		}
		System.out.print(day + "일 동안 저축한 금액 : " + totalSave + "원");
		

	}

}

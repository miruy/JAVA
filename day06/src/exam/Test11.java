package exam;

public class Test11 {

	public static void main(String[] args) {
		//ù���� 10���� �����ϰ� ���������� ������ 2�踦 �����ϴ� ������� �Ѵ޵��� ������ �ݾ���?
		
		long save = 10;
		long totalSave = 0;
		int day = 1;
		
		
		for(day = 0; day < 30; day++) {
			totalSave += save;
			save *= 2;
			
		}
		System.out.print(day + "�� ���� ������ �ݾ� : " + totalSave + "��");
		

	}

}

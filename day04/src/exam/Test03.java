package exam;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�� ���� �Է¹޾� ū ������� ����Ͻÿ�
			
			System.out.print("ù��° ���� �Է��ϼ��� : ");
			int su1 = sc.nextInt();
			
			System.out.print("�ι�° ���� �Է��ϼ��� : ");
			int su2 = sc.nextInt();
			
			System.out.print("����° ���� �Է��ϼ��� : ");
			int su3 = sc.nextInt();
			
			if(su1 > su2 && su1 > su3) {
				if(su2 > su3) {
					System.out.println(su1 + ">" + su2 + ">" + su3);
				}else if(su2 < su3) {
					System.out.println(su1 + ">" + su3 + ">" + su2);
				}
			}else if(su2 > su1 && su2 > su3) {
				if(su1 > su3) {
					System.out.println(su2 + ">" + su1 + ">" + su3);
				}else if(su1 < su3) {
					System.out.println(su2 + ">" + su3 + ">" + su1);
				}
			}else if(su3 > su1 && su3 > su2) {
				if(su1 > su2) {
					System.out.println(su3 + ">" + su1 + ">" + su2);
				}else if(su1 < su2) {
					System.out.println(su3 + ">" + su2 + ">" + su1);
				}
			}
			
	
		
	}

}

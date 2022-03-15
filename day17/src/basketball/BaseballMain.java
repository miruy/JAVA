package basketball;

import java.util.Scanner;

public class BaseballMain {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				Play player = new Play();    //baseball 객체 셍성 
				Score sco = new Score();
				player.score = sco;
				
				player.start();
				
				System.out.print("점수 입력 : ");
				player.score.score(sc.nextInt());
		
		
		
		
		
		
	}

}

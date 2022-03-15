package exam;

public class Test10 {

	public static void main(String[] args) {
		//쌀 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다.
		//쥐 한마리가 하루에 20g씩의 쌀을 먹고 10일마다 쥐의 수가 2배씩 증가한다.
		//며칠만에 창고의 쌀이 모두 쥐의 먹이가 될까 
		//그리고 쥐는 총 몇마리 인가?(한통은 80kg)

		int rice = 8000000;//g  
		int mouse = 2;
		int day;
		
			for(day = 1; rice > 0; day++) {  //반복할 내용 정하기 : 일 수 지나기 
				rice -= mouse*20;			 //총 쌀통에서 쥐가 먹는 양 빼기
				if(day != 0 && day % 10 == 0) {  //위의 문장 실행 중 조검을 검 - 10일 마다(지나가는 시간을 10으로 나눠서 0으로 떨어지면 10일이라는 뜻)
					mouse*=2;        //10일마다 쥐가 2배로 증가 
				}
			}
				day--; //rice가 0이 될때까지 반복하다보니 하루가 더해져서 마지막에 하루를 뺌
				System.out.print(day + "일만에 총 " + mouse + "마리의 먹이가 됨");

	}

}

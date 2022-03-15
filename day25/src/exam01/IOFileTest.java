package exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class IOFileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Info> info = new ArrayList<>();
		Info infos;
		InputOutput io = new InputOutput();
		String[] choiceArr;
		int lastId = 0;

		System.out.println("데이터 저장용 파일이 존재하지 않습니다.");
		System.out.print("파일을 만드시겠습니까?(y/n) : ");
		String answer = sc.nextLine();
		if (answer.equals("y")) {
			System.out.println("파일이 생성되었습니다.");

			while (true) {
				System.out.print("명령 입력 > ");

				String choice = sc.nextLine();
				choiceArr = choice.split(" ");

				if (choiceArr[0].equals("quit")) {
					System.out.println("프로그램을 저장 후 종료합니다.");
					break;
				}

				if (choiceArr[0].equals("?")) {
					System.out.print("도움말 :");
					System.out.println("삽입 : insert <이름> <나이>");
					System.out.println("목록 : list");
					System.out.println("저장 : save");
					System.out.println("저장하고 종료 : quit");
				}

				if (choiceArr[0].equals("insert")) {
					lastId++;
					int id = lastId;
					String name = choiceArr[1];
					int age = Integer.parseInt(choiceArr[2]);
					info.add(new Info(id, name, age));
				}

				if (choiceArr[0].equals("list")) {
					if (info.isEmpty()) {
						System.out.println("목록이 비었습니다.");
					} else {
						for (int i = 0; i < info.size(); i++) {
							System.out.println(info.get(i));
						}
					}
				}

				if (choiceArr[0].equals("save")) {

					io.Input();
					io.Output();

				}
			}

		} else if (answer.equals("n")) {
			
			System.out.println("프로그램을 종료합니다.");
		}

	}

}

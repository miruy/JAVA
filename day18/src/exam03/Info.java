package exam03;

import java.util.Scanner;

public class Info {
	String name;
	String age;
	String[][] people = new String[5][1];

	public Info() {
	}
//
//	public Info(String name, String age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	public void add(int num, String name, String age) {
//	for (int i = 0; i < people.length; i++) {
//			people[num][0] = name;
//			people[num][1] = age;
//		}
//		System.out.println(name + "님이 등록 되었습니다.");
//		System.out.println(name + "님의 고유번호는 " + num + "번 입니다.");
//	}
//
//	public void view() {
//		for (int i = 0; i < people.length; i++) {
//			for (int j = 0; j < people[i].length; j++) {
//				System.out.println(people[i][j]);
//			}
//		}
//	}
//
//	public void search(String name) {
//		for (int i = 0; i < people.length; i++) {
//			if (people[i][0].equals(name)) {
//				System.out.println(name + "님은 등록 되어있습니다.");
//				break;
//			} else {
//				System.out.println(name + "님은 등록되어 있지않습니다.");
//				break;
//			}
//		}
//	}
//
//	public void edit(String name) {
//		for (int i = 0; i < people.length; i++) {
//			if (people[i][0].equals(name)) {
//				people[i][0] = name;
//				people[i][1] = age;
//				System.out.println("해당 회원의 정보를 수정하였습니다.");
//			}else {
//				System.out.println(name + "님은 등록되어 있지않습니다.");
//			}
//		}
//	}
//
//	public void delet(String name) {
//		for (int i = 0; i < people.length; i++) {
//			if (people[i][0].equals(name)) {
//				people[i] = new String[2];
//			}
//		}
//		System.out.println(name + "님이 삭제 되었습니다.");
//	}

}

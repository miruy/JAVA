package exam01;

import java.util.HashSet;
import java.util.Iterator;

public class Exam01 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("hello");
		hs.add(10); //new Integer(10) auto-boxing
		hs.add(20);
		hs.add(30);
		hs.add(20);
		
		Iterator it = hs.iterator(); //반복자
		while(it.hasNext()) { //순회
			System.out.println(it.next());
		}
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(30));
		System.out.println(hs.contains(30));
		System.out.println(hs.size());
		
		it = hs.iterator(); //다시 생성
		while(it.hasNext()) { //순회
			System.out.println(it.next());
		}
	}
}

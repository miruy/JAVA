package exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExam01 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();

		Scanner sc = new Scanner(System.in);
		boolean boo = true;

		while (boo) {
			System.out.printf("입력(현재길이:%d) : ",hs.size());
			int su = sc.nextInt();
			if (hs.contains(su)) {
				System.out.println("중복!");
				hs.isEmpty();
			} else {
				hs.add(su);
				Iterator it = hs.iterator();

				while (it.hasNext()) {
					System.out.println(it.next());
				}
			}
		}

	}

}

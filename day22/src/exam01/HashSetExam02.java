package exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExam02 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		boolean boo = true;
		
		while(boo) {
			System.out.printf("입력 (현재길이 : %d):", hs.size());
			String str = sc.next();
			if(hs.contains(str)) {
				System.out.println("중복!");
				hs.isEmpty();
			}else {
				hs.add(str);
				Iterator it = hs.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
			}
		}
	}

}

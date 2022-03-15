package exam01;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(111);
		al.add(12);
		al.add(21);
		al.add(31);
		al.add(143);
		al.add(11);

		al.remove(1);
		al.add(1, 200);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}
}

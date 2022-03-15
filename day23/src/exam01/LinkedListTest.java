package exam01;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("안녕");
		ll.add("하하");
		ll.add(0, "안녕");
		ll.add(1, "안되지~?");
		
		System.out.println(ll.get(0));

	}

}

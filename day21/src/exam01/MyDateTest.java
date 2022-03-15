package exam01;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(30, 2, 2000);
		System.out.println(date.isValid());
		
		MyDate date2= new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());

	}

}

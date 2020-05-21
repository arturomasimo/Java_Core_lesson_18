package lession18;
/**
 * The Main class to work whith myMap Generics
 * @author ARTUR
 * @since JDK 13.0.2
 */
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		MyMap<Integer, String> obj = new MyMap<Integer, String>();
		System.out.println("Create and print 10 random element in mymap");

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			obj.addObj(new MyEntry<Integer, String>(i, "value" + r.nextInt(100)));
		}
		obj.printAllMap();

		System.out.println("Remove element for K=1 and K=7 from mymap");

		obj.removeObK(1);
		obj.removeObK(7);
		obj.printAllMap();

		System.out.println("Remove element for value="+ obj.getV(5) +" from mymap");

		String s = obj.getV(5);
		obj.removeObV(s);
		obj.printAllMap();

		System.out.println("Print Key mymap");
		obj.printK();

		System.out.println("Print Value mymap");
		obj.printV();

		System.out.println("Print All mymap");
		obj.printAllMap();

	}
}

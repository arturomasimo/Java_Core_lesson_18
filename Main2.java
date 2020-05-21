package lession18;
/**
 * Main class for working with Aralist type Int and String
 * @author ARTUR
 * @since JDK 13.0.2
 */
public class Main2 {
	public static void main(String[] args) {
		MyList m = new MyList();
		m.setList("-5");
		m.setList(0);
		m.getList().add(5);
		m.getList().add(10);
		m.getList().add(15);
		m.getList().add("20");
		m.getList().add(25);
		m.getList().add("тридцять");

		System.out.println(m.toString());

	}
}

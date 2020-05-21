package lession18;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {
	private List<MyEntry<K, V>> list = new ArrayList<>();

	public void addObj(MyEntry<K, V> myEntry) {
		list.add(myEntry);
	}

	public void removeObK(K ob1) {
		for (MyEntry<K, V> myEntry : list) {
			if (myEntry.getOb1().equals(ob1)) {
				list.remove(myEntry);
				break;
			}
		}
	}

	public void removeObV(V ob2) {
		for (MyEntry<K, V> myEntry : list) {
			if (myEntry.getOb2().equals(ob2)) {
				list.remove(myEntry);
				break;
			}
		}
	}

	public void printK() {
		for (MyEntry<K, V> myEntry : list) {
			System.out.println(myEntry.getOb1());
		}
	}

	public void printV() {
		for (MyEntry <K, V> myEntry : list) {
			System.out.println(myEntry.getOb2());
		}
	}

	public K getK(V ob2) {
		K ob1 = null;
		for (MyEntry<K, V> myEntry : list) {
			if (myEntry.getOb2().equals(ob2)) {
				ob1 = (K) myEntry.getOb1();
				break;
			}
		}
		return ob1;
	}

	public V getV(K ob1) {
		V ob2 = null;
		for (MyEntry<K, V> myEntry : list) {
			if (myEntry.getOb1().equals(ob1)) {
				ob2 = (V) myEntry.getOb2();
				break;
			}
		}
		return ob2;
	}

	public void printAllMap() {
		for (MyEntry<K, V> myEntry : list) {
			System.out.println("K= " + myEntry.getOb1() + ", V= " + myEntry.getOb2());
		}
	}

}

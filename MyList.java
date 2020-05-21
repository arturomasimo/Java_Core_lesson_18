package lession18;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	private List<Integer> list= new ArrayList<Integer>();

	public MyList() { //пустий конструктор
		super();
	}

	public MyList(List<Integer> list) {
		super();
		this.list = list;
	}

	public List getList() { //забрав типізацію <Integer>
		return list;
	}

	public void setList(String s) { //перевантажив функцій 
		//this.list = 
		list.add(Integer.parseInt(s));
	}

	public void setList(int i) { //List<Integer> list
		//this.list = 
		list.add(i);
	}

	@Override
	public String toString() {
		return "MyList [list=" + list + "]";
	}

	
}

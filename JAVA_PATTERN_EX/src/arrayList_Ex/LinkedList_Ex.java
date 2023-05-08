package arrayList_Ex;

import java.util.LinkedList;

public class LinkedList_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Benz");
		list.add("Volvo");
		list.add("BMW");
		list.add("Tata");
		
		System.out.println("Iteration using for-each loop");
		for(String i:list) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Iteration by using size()");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}

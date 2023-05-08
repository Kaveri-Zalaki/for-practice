package arrayList_Ex;

import java.util.HashSet;

public class HashSet_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashSet is a collection of items where every item is unique. and it is found
		// in java.util package

		HashSet<String> set = new HashSet<String>();

		// add items
		set.add("Laptop");
		set.add("Bluetooth");
		set.add("Laptop");
		set.add("Headphones");

		System.out.println(set);

		// Size of set
		System.out.println(set.size());

		// for loop
		for (String i : set) {
			System.out.println(i);
		}
		// remove element
		set.remove("Laptop");
		System.out.println(set);

		// clear elements
		set.clear();
		System.out.println(set);

	}

}

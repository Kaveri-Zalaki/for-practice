package arrayList_Ex;

import java.util.HashMap;

public class HashMap_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "Kaveri");
		map.put(1, "Shital");
		map.put(2, "Ankit");
		map.put(3, "Sukanya");
		map.put(4, "Sangamesh");
		map.put(5, "Bhoomika");

		// To access the element using get()
		System.out.println("accessed element is: " + map.get(0));
		System.out.println();

		// To remove the particular element- remove()
		System.out.println("The element removed from the map is: " + map.remove(5));
		System.out.println();

		// remaining elements in the map
		System.out.println(map);
		System.out.println();

		// To find out the size of list- size()
		System.out.println("The size of the map is: " + map.size());
		System.out.println();

		// To get all the elements via for loop
		System.out.println("The values in the list are: ");
		// To get the values- values()
		for (String i : map.values()) {
			System.out.println(i);
		}
		System.out.println();

		System.out.println("The key elements in the list are: ");
		// To get the key elements-keySet()
		for (int key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println();

		for (int key : map.keySet()) {
			System.out.println("Key: " + key + " Values: " + map.get(key));

		}
		
		System.out.println();
		// To clear all elements
		map.clear();
		System.out.println("The remaining elements in the map after applying clear(): " + map);

	}

}

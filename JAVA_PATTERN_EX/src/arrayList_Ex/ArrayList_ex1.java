package arrayList_Ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Benz");

		//For-each loop
		for (String i : cars) {
			System.out.println(i);
		}

		System.out.println(cars.get(0));

		System.out.println(cars.set(0, "opel"));
		System.out.println(cars);

		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		Collections.sort(cars);
		
		System.out.println("The sorted Arraylist is: "+cars);
		
	}

}

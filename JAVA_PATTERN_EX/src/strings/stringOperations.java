package strings;

public class stringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = { 'K', 'A', 'V', 'E', 'R', 'I' };
		String s = new String(ch);
		System.out.println(s);

		// String length
		System.out.println(s.length());

		// toUpperCase() and toLowerCase()
		String name = "kaveri";
		System.out.println(name.toUpperCase()); //KAVERI
		System.out.println(s.toLowerCase()); //kaveri
		
		//Finding character in a string- indexOf()
		String txt="Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate"));
		
		

		// compareTo()
		String name1 = "Kaveri"; 
		String surname = "Zalaki";

		if (name1.compareTo(surname) == 0) {
			System.out.println("both are same");
		} else {
			System.out.println("both are different");
		}

		// concat()
		String fullName = name + surname;
		String full = name.concat(surname);
		System.out.println(fullName);
		System.out.println(full);

		// equals()

	}

}

package enums;

public enum Levels {

	LOW, MEDIUM, HIGH;

	public static void main(String[] args) {

		Levels l = Levels.LOW;
		System.out.println(l);

		for (Levels i : Levels.values()) {
			System.out.println(i);
		}

		// using Switch
		Levels var = Levels.HIGH;

		switch (var) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		}
	}
}
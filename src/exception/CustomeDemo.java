package exception;

public class CustomeDemo {

	public void checkAGe(int age) throws InvalidAgeException {

		if (age < 18) {

			throw new InvalidAgeException("age is not valid...");
		} else {
			System.out.println(age);
		}
	}

	public static void main(String[] args)  {

		CustomeDemo c = new CustomeDemo();

		try {
			c.checkAGe(15);
		} catch (InvalidAgeException e) {

			System.out.println("invalid...");
		}

	}
}

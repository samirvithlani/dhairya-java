package gc;

/*
 * gc in java is the process by which java programme 
 * perfoam automatic memory managament
 * */
public class GcDemo {

	public static void main(String[] args) {

		Integer i = new Integer(150);
		// i i s eligble for grabge colleation
		i = null;
		System.gc();
		Runtime.getRuntime().gc();

	}

	protected void finalize() throws Throwable {

		System.out.println("before garbge collection...");

	}
}

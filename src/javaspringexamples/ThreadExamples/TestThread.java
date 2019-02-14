package javaspringexamples.ThreadExamples;

/**
 * This class presents the different ways to implement threads.
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class TestThread {

	public static void main(String[] args) {

		// Thread by extending the Thread class.
		ThreadByExtension t1 = new ThreadByExtension();
		t1.start();

		// Thread by implementing the Runnable interface.
		Thread t2 = new Thread(new ThreadByImplementation());
		t2.start();

		// Thread by implementing the Runnable interface anonymously.
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running Anonymous object runnable.");
			}
		};
		Thread t3 = new Thread(r1);
		t3.start();

		// Thread by implementing the Runnable interface anonymously using
		// lambda expression.
		Runnable r2 = () -> System.out.println("Running runnable object using lambda expression Runnable.");
		Thread t4 = new Thread(r2);
		t4.start();
	}
}

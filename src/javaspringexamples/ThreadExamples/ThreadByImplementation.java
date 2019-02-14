package javaspringexamples.ThreadExamples;

/**
 * This class presents how to implement a thread by implementing the Runnable
 * interface.
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class ThreadByImplementation implements Runnable {

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getName());
	}
}

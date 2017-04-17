package com.codercocoon.ThreadExamples;

/**
 * This class presents how to implement a thread by extending the Thread class.
 * 
 * @author contact@codercocoon.com
 *
 */
public class ThreadByExtension extends Thread {

	@Override
	public void run() {
		System.out.println("Running " + this.getClass());
	}
}

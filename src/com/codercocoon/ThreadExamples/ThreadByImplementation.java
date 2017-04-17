package com.codercocoon.ThreadExamples;

/**
 * This class presents how to implement a thread by implementing the Runnable
 * interface.
 * 
 * @author contact@codercocoon.com
 *
 */
public class ThreadByImplementation implements Runnable {

	@Override
	public void run() {
		System.out.println("Running " + this.getClass().getName());
	}
}

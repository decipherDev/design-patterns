package dev.designpattern.singleton;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafeSingletonObjectWithLocks {
	private static ThreadSafeSingletonObjectWithLocks OBJECT = null;
	private static Lock lock = new ReentrantLock();

	private ThreadSafeSingletonObjectWithLocks() {
		//private constructor in order to restrict it's visibility
		//from other classes
	}
	
	public static ThreadSafeSingletonObjectWithLocks instance() throws InterruptedException {
		if (OBJECT == null) {
			TimeUnit.SECONDS.sleep(10);
			lock.lock(); 
			if (OBJECT == null) {
				OBJECT = new ThreadSafeSingletonObjectWithLocks();
			}
			lock.unlock();
		}
		
		return OBJECT;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		Callable<ThreadSafeSingletonObjectWithLocks> runOne = () -> ThreadSafeSingletonObjectWithLocks.instance();
		Callable<ThreadSafeSingletonObjectWithLocks> runTwo = () -> ThreadSafeSingletonObjectWithLocks.instance();
		Callable<ThreadSafeSingletonObjectWithLocks> runThree = () -> ThreadSafeSingletonObjectWithLocks.instance();
		Callable<ThreadSafeSingletonObjectWithLocks> runFour = () -> ThreadSafeSingletonObjectWithLocks.instance();
		
		Future<ThreadSafeSingletonObjectWithLocks> f1 = threadPool.submit(runOne);
		Future<ThreadSafeSingletonObjectWithLocks> f2 = threadPool.submit(runTwo);
		Future<ThreadSafeSingletonObjectWithLocks> f3 = threadPool.submit(runThree);
		Future<ThreadSafeSingletonObjectWithLocks> f4 = threadPool.submit(runFour);
		
		System.out.println(f1.get().hashCode());
		System.out.println(f2.get().hashCode());
		System.out.println(f3.get().hashCode());
		System.out.println(f4.get().hashCode());
	}
}

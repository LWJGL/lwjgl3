package org.eclipse.fx.drift.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

import org.eclipse.fx.drift.internal.GPUSyncUtil.GPUSync;

public class QuantumRendererHelper {
	
	public static class WithFence<T> {
		
		private GPUSync sync;
		private T result;
		
		public WithFence(T result, GPUSync sync) {
			this.sync = sync;
			this.result = result;
		}
		
		public T getResult() {
			return result;
		}
		public GPUSync getFence() {
			return sync;
		}
	}
	

	static boolean initialized = false;
	
	static Executor executor = Executors.newSingleThreadExecutor(new ThreadFactory() {
		@Override
		public Thread newThread(Runnable r) {
			Thread t = new Thread(r);
			t.setName("QuantumRenderer-DriftFX-Helper");
			t.setDaemon(true);
			return t;
		}
	});
	
	public static <T> T syncExecute(Supplier<T> r) {
		if (!initialized) {
			internalSyncExecute(() -> {
				// TODO
			});
			initialized = true;
		}
		return internalSyncExecute(r);
	}
	
	public static <T> WithFence<T> syncExecuteWithFence(Supplier<T> r) {
		T result = syncExecute(r);
		GPUSync fence = GPUSyncUtil.createFence();
		return new WithFence<>(result, fence);
	}
	
	
	public static void syncExecute(Runnable r) {
		if (!initialized) {
			internalSyncExecute(() -> {
				// TODO
			});
			initialized = true;
		}
		internalSyncExecute(r);
	}
	
	public static GPUSync syncExecuteWithFence(Runnable r) {
		syncExecute(r);
		return GPUSyncUtil.createFence();
	}
	
	static void internalSyncExecute(Runnable r) {
		ReentrantLock lock = new ReentrantLock();
		Condition done = lock.newCondition();
		lock.lock();
		executor.execute(() -> {
			lock.lock();
			r.run();
			done.signal();
			lock.unlock();
		});
		try {
			done.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static <T> T internalSyncExecute(Supplier<T> r) {
		ReentrantLock lock = new ReentrantLock();
		AtomicReference<T> result = new AtomicReference<>();
		Condition done = lock.newCondition();
		lock.lock();
		executor.execute(() -> {
			lock.lock();
			result.set(r.get());
			done.signal();
			lock.unlock();
		});
		try {
			done.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return result.get();
	}
	
}

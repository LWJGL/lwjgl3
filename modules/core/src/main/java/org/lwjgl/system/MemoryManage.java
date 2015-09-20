/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jemalloc.JEmalloc.*;
import static org.lwjgl.system.libc.Stdlib.*;

/** Provides {@link MemoryAllocator} implementations for {@link MemoryUtil} to use. */
final class MemoryManage {

	private MemoryManage() {
	}

	static MemoryAllocator getInstance() {
		String allocator = System.getProperty("org.lwjgl.system.allocator", "jemalloc");

		if ( "jemalloc".equals(allocator) ) {
			try {
				// check if the jemalloc library is available
				Class.forName("org.lwjgl.system.jemalloc.JEmalloc").getMethod("getInstance").invoke(null);
				return new JEmallocAllocator();
			} catch (Exception e) {
				if ( LWJGLUtil.DEBUG )
					e.printStackTrace();
				LWJGLUtil.log("[MemoryAllocator] Failed to load the jemalloc library.");
				return new StdlibAllocator();
			}
		} else if ( "system".equals(allocator) ) {
			return new StdlibAllocator();
		} else {
			try {
				return (MemoryAllocator)Class.forName(allocator).newInstance();
			} catch (Exception e) {
				throw new RuntimeException("Failed to instantiate custom memory allocator: " + allocator);
			}
		}
	}

	/** stdlib memory allocator. */
	private static class StdlibAllocator implements MemoryAllocator {

		@Override
		public long malloc(long size) {
			return nmalloc(size);
		}

		@Override
		public long calloc(long num, long size) {
			return ncalloc(num, size);
		}

		@Override
		public long realloc(long ptr, long size) {
			return nrealloc(ptr, size);
		}

		@Override
		public void free(long ptr) {
			nfree(ptr);
		}

		@Override
		public long aligned_alloc(long alignment, long size) {
			return naligned_alloc(alignment, size);
		}

		@Override
		public void aligned_free(long ptr) {
			naligned_free(ptr);
		}

	}

	/** jemalloc memory allocator. */
	private static class JEmallocAllocator implements MemoryAllocator {

		@Override
		public long malloc(long size) {
			return nje_malloc(size);
		}

		@Override
		public long calloc(long num, long size) {
			return nje_calloc(num, size);
		}

		@Override
		public long realloc(long ptr, long size) {
			return nje_realloc(ptr, size);
		}

		@Override
		public void free(long ptr) {
			nje_free(ptr);
		}

		@Override
		public long aligned_alloc(long alignment, long size) {
			return nje_aligned_alloc(alignment, size);
		}

		@Override
		public void aligned_free(long ptr) {
			nje_free(ptr);
		}

	}

	// TODO: evaluate performance and optimize

	/** Wraps a MemoryAllocator to track allocations and detect memory leaks. */
	static class DebugAllocator implements MemoryAllocator {

		private static final ConcurrentMap<Long, Allocation> ALLOCATIONS = new ConcurrentHashMap<Long, Allocation>();
		private static final ConcurrentMap<Long, String>     THREADS     = new ConcurrentHashMap<Long, String>();

		private final MemoryAllocator allocator;

		DebugAllocator(MemoryAllocator allocator) {
			this.allocator = allocator;

			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
					if ( ALLOCATIONS.isEmpty() )
						return;

					for ( Entry<Long, Allocation> entry : ALLOCATIONS.entrySet() ) {
						Long address = entry.getKey();
						Allocation allocation = entry.getValue();

						System.err.format(
							"[LWJGL] %d bytes leaked, thread %d (%s), address: 0x%s\n",
							allocation.size,
							allocation.threadId,
							THREADS.get(allocation.threadId),
							Long.toHexString(address).toUpperCase()
						);
						for ( StackTraceElement el : allocation.stackTrace )
							System.err.println("\t" + el.toString());
					}
				}
			});
		}

		@Override
		public long malloc(long size) {
			return track(allocator.malloc(size), size);
		}

		@Override
		public long calloc(long num, long size) {
			return track(allocator.calloc(num, size), num * size);
		}

		@Override
		public long realloc(long ptr, long size) {
			long address = allocator.realloc(ptr, size);
			if ( address != NULL )
				untrack(ptr);
			return track(address, size);
		}

		@Override
		public void free(long ptr) {
			allocator.free(ptr);
			untrack(ptr);
		}

		@Override
		public long aligned_alloc(long alignment, long size) {
			return track(allocator.aligned_alloc(alignment, size), size);
		}

		@Override
		public void aligned_free(long ptr) {
			allocator.aligned_free(ptr);
			untrack(ptr);
		}

		private static long track(long address, long size) {
			if ( address != NULL ) {
				Thread t = Thread.currentThread();
				Long threadId = t.getId();
				if ( !THREADS.containsKey(threadId) )
					THREADS.put(threadId, t.getName());

				StackTraceElement[] stackTrace = t.getStackTrace();
				int depth = 3;
				for (; depth < stackTrace.length; depth++ ) {
					if ( !"org.lwjgl.system.MemoryUtil".equals(stackTrace[depth].getClassName()) )
						break;
				}

				Allocation allocation = ALLOCATIONS.put(address, new Allocation(Arrays.copyOfRange(stackTrace, depth, stackTrace.length), size));
				if ( allocation != null )
					throw new IllegalStateException("The memory address specified is already being tracked");
			}

			return address;
		}

		private static void untrack(long address) {
			if ( address == NULL )
				return;

			Allocation allocation = ALLOCATIONS.remove(address);
			if ( allocation == null )
				throw new IllegalStateException("The memory address specified is not being tracked");
		}

		private static class Allocation {

			final StackTraceElement[] stackTrace;

			final long size;

			final long threadId;

			Allocation(StackTraceElement[] stackTrace, long size) {
				this.stackTrace = stackTrace;
				this.size = size;
				this.threadId = Thread.currentThread().getId();
			}

			@Override
			public boolean equals(Object o) {
				if ( this == o ) return true;
				if ( o == null || getClass() != o.getClass() ) return false;

				Allocation that = (Allocation)o;

				return Arrays.equals(stackTrace, that.stackTrace);
			}

			@Override
			public int hashCode() {
				return Arrays.hashCode(stackTrace);
			}

		}

		static void report(MemoryAllocationReport report) {
			for ( Allocation allocation : ALLOCATIONS.values() )
				report.invoke(allocation.size, allocation.threadId, THREADS.get(allocation.threadId), allocation.stackTrace);
		}

		private static <T> void aggregate(T t, long size, Map<T, AtomicLong> map) {
			AtomicLong node = map.get(t);
			if ( node == null )
				map.put(t, node = new AtomicLong());
			node.set(node.get() + size);
		}

		static void report(
			MemoryAllocationReport report,
			MemoryAllocationReport.Aggregate groupByStackTrace,
			boolean groupByThread
		) {
			// Using atomic long for the mutability, no concurrency here
			switch ( groupByStackTrace ) {
				case ALL:
					if ( groupByThread ) {
						Map<Long, AtomicLong> mapThread = new HashMap<Long, AtomicLong>();
						for ( Allocation allocation : ALLOCATIONS.values() )
							aggregate(allocation.threadId, allocation.size, mapThread);
						for ( Entry<Long, AtomicLong> entry : mapThread.entrySet() )
							report.invoke(entry.getValue().get(), entry.getKey(), THREADS.get(entry.getKey()), (StackTraceElement[])null);
					} else {
						long total = 0L;
						for ( Allocation allocation : ALLOCATIONS.values() )
							total += allocation.size;
						report.invoke(total, NULL, null, (StackTraceElement[])null);
					}
					break;
				case GROUP_BY_METHOD:
					// Group by StackTraceElement[0]
					if ( groupByThread ) {
						Map<Long, Map<StackTraceElement, AtomicLong>> mapThreadMethod = new HashMap<Long, Map<StackTraceElement, AtomicLong>>();
						for ( Allocation allocation : ALLOCATIONS.values() ) {
							Map<StackTraceElement, AtomicLong> mapMethod = mapThreadMethod.get(allocation.threadId);
							if ( mapMethod == null )
								mapThreadMethod.put(allocation.threadId, mapMethod = new HashMap<StackTraceElement, AtomicLong>());
							aggregate(allocation.stackTrace[0], allocation.size, mapMethod);
						}

						for ( Entry<Long, Map<StackTraceElement, AtomicLong>> tms : mapThreadMethod.entrySet() ) {
							long threadId = tms.getKey();
							Map<StackTraceElement, AtomicLong> mapmapMethod = tms.getValue();

							for ( Entry<StackTraceElement, AtomicLong> ms : mapmapMethod.entrySet() )
								report.invoke(ms.getValue().get(), threadId, THREADS.get(threadId), ms.getKey());
						}
					} else {
						Map<StackTraceElement, AtomicLong> mapMethod = new HashMap<StackTraceElement, AtomicLong>();
						for ( Allocation allocation : ALLOCATIONS.values() )
							aggregate(allocation.stackTrace[0], allocation.size, mapMethod);
						for ( Entry<StackTraceElement, AtomicLong> ms : mapMethod.entrySet() )
							report.invoke(ms.getValue().get(), NULL, null, ms.getKey());
					}
					break;
				case GROUP_BY_STACKTRACE:
					// Group by StackTraceElement[]
					if ( groupByThread ) {
						Map<Long, Map<Allocation, AtomicLong>> mapThreadStackTrace = new HashMap<Long, Map<Allocation, AtomicLong>>();
						for ( Allocation allocation : ALLOCATIONS.values() ) {
							Map<Allocation, AtomicLong> mapStackTrace = mapThreadStackTrace.get(allocation.threadId);
							if ( mapStackTrace == null )
								mapThreadStackTrace.put(allocation.threadId, mapStackTrace = new HashMap<Allocation, AtomicLong>());
							aggregate(allocation, allocation.size, mapStackTrace);
						}

						for ( Entry<Long, Map<Allocation, AtomicLong>> tss : mapThreadStackTrace.entrySet() ) {
							long threadId = tss.getKey();
							Map<Allocation, AtomicLong> mapStackTrace = tss.getValue();

							for ( Entry<Allocation, AtomicLong> ss : mapStackTrace.entrySet() )
								report.invoke(ss.getValue().get(), threadId, THREADS.get(threadId), ss.getKey().stackTrace);
						}
					} else {
						Map<Allocation, AtomicLong> mapStackTrace = new HashMap<Allocation, AtomicLong>();
						for ( Allocation allocation : ALLOCATIONS.values() )
							aggregate(allocation, allocation.size, mapStackTrace);
						for ( Entry<Allocation, AtomicLong> ss : mapStackTrace.entrySet() )
							report.invoke(ss.getValue().get(), NULL, null, ss.getKey().stackTrace);
					}
					break;
			}
		}

	}

}
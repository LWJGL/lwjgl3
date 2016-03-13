/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.util.Arrays;

/**
 * Fast {@code ThreadLocal} implementation, adapted from the
 * <a href="https://github.com/riven8192/LibStruct/blob/master/src/net/indiespot/struct/runtime/FastThreadLocal.java">LibStruct</a> library.
 *
 * <p>This implementation replaces the {@code ThreadLocalMap} lookup in {@link ThreadLocal} with a simple array access. The big advantage of this method is
 * that thread-local accesses are identified as invariant by the JVM, which enables significant code-motion optimizations.</p>
 *
 * <p>The underlying array contains a slot for each thread that uses the {@link FastThreadLocal} instance. The slot is indexed by {@link Thread#getId()}. The
 * array grows if necessary when the {@link #set} method is called.</p>
 *
 * <p>It is assumed that usages of this class will be read heavy, so any contention/false-sharing issues caused by the {@link #set} method are ignored.</p>
 *
 * @param <T> the thread-local value type
 *
 * @author Riven
 * @see java.lang.ThreadLocal
 */
public class FastThreadLocal<T> {

	@SuppressWarnings("unchecked")
	private T[] threadIDMap = (T[])new Object[1];

	/** Creates a thread local variable. */
	public FastThreadLocal() {
	}

	/**
	 * Returns the current thread's "initial value" for this thread-local variable.
	 *
	 * @see ThreadLocal#initialValue()
	 */
	public T initialValue() {
		return null;
	}

	/**
	 * Sets the current thread's copy of this thread-local variable to the specified value.
	 *
	 * @param value the value to be stored in the current thread's copy of this thread-local.
	 *
	 * @see ThreadLocal#set(T)
	 */
	public void set(T value) {
		int id = (int)Thread.currentThread().getId();

		synchronized ( this ) {
			int len = threadIDMap.length;
			if ( len <= id )
				threadIDMap = Arrays.copyOf(threadIDMap, id + 1);

			threadIDMap[id] = value;
		}
	}

	/**
	 * Returns the value in the current thread's copy of this thread-local variable.
	 *
	 * @see ThreadLocal#get()
	 */
	public final T get() {
		int id = (int)Thread.currentThread().getId();

		T[] threadIDMap = this.threadIDMap; // It's OK if the array is resized after this access, will just use the old array.

		T value = threadIDMap.length <= id ? null : threadIDMap[id];

		if ( value == null ) {
			value = initialValue();
			set(value);
		}

		return value;
	}

	/**
	 * Removes the current thread's value for this thread-local variable.
	 *
	 * @see ThreadLocal#remove()
	 */
	public void remove() {
		set(null);
	}

}
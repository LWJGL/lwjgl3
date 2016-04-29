/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.lang.reflect.Field;

import static org.lwjgl.system.APIUtil.*;

/**
 * This class provides storage for all LWJGL objects that must be thread-local. [INTERNAL USE ONLY]
 *
 * <p>The default implementation uses a simple {@link ThreadLocal}. Alternative implementations may have better performance.</p>
 *
 * @see Configuration#THREAD_LOCAL_SPACE
 */
public final class ThreadLocalUtil {

	private static final State TLS = getInstance();

	static {
		apiLog("ThreadLocalUtil state: " + TLS.getClass().getSimpleName());
	}

	private ThreadLocalUtil() {
	}

	public static ThreadLocalState tlsGet() {
		return TLS.get();
	}

	private interface State {
		void set(ThreadLocalState value);
		ThreadLocalState get();
	}

	private static State getInstance() {
		String tls = Configuration.THREAD_LOCAL_SPACE.get("unsafe");

		if ( "unsafe".equals(tls) ) {
			try {
				return new UnsafeState();
			} catch (Throwable t) {
				apiLog("[TLS] Failed to initialize unsafe implementation.");
				return new TLState();
			}
		} else if ( "ThreadLocal".equals(tls) ) {
			return new TLState();
		} else {
			throw new IllegalStateException("Invalid " + Configuration.THREAD_LOCAL_SPACE.getProperty() + " specified.");
		}
	}

	/** {@link ThreadLocal} implementation. */
	private static class TLState implements State {

		private static final ThreadLocal<ThreadLocalState> STATE = new ThreadLocal<ThreadLocalState>() {
			@Override
			protected ThreadLocalState initialValue() {
				return new ThreadLocalState();
			}
		};

		@Override
		public void set(ThreadLocalState value) {
			STATE.set(value);
		}

		@Override
		public ThreadLocalState get() {
			return STATE.get();
		}

	}

	/**
	 * Unsafe implemenation.
	 *
	 * <p>Replaces {@link Thread}'s target runnable with an instance of {@link ThreadLocalState}. The new runnable delegates to the original runnable.</p>
	 *
	 * <p>This implementation trades the {@code ThreadLocalMap} lookup with a plain field derefence, eliminating considerable overhead.</p>
	 */
	private static class UnsafeState implements State {

		private static final sun.misc.Unsafe UNSAFE = MemoryAccess.getUnsafeInstance();

		private static final long TARGET;

		static {
			try {
				Field field = Thread.class.getDeclaredField("target");
				if ( !Runnable.class.isAssignableFrom(field.getType()) )
					throw new IllegalStateException();

				TARGET = UNSAFE.objectFieldOffset(field);
			} catch (NoSuchFieldException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public ThreadLocalState get() {
			Object target = UNSAFE.getObject(Thread.currentThread(), TARGET);
			return ThreadLocalState.class.isInstance(target) ? (ThreadLocalState)target : setInitialValue();
		}

		private ThreadLocalState setInitialValue() {
			ThreadLocalState tls = new ThreadLocalState();
			set(tls);
			return tls;
		}

		@Override
		public void set(ThreadLocalState value) {
			Thread t = Thread.currentThread();

			value.target = (Runnable)UNSAFE.getObject(t, TARGET);
			UNSAFE.putObject(t, TARGET, value);
		}

	}

}
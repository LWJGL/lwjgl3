/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.openal.ALContext;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengles.GLESCapabilities;

import java.lang.reflect.Field;

/**
 * This class provides storage for all LWJGL objects that must be thread-local. [INTERNAL USE ONLY]
 *
 * <p>The default implementation uses a simple {@link ThreadLocal}. Alternative implementations may have better performance.</p>
 */
public final class ThreadLocalUtil {

	private static final ThreadLocal<TLS> TLS = getInstance();

	private ThreadLocalUtil() {
	}

	public static TLS tlsGet() {
		return TLS.get();
	}

	public static class TLS implements Runnable {

		private Runnable target;

		public final APIBuffer __buffer;

		public final MemoryStack stack;

		public GLCapabilities   glCaps;
		public GLESCapabilities glesCaps;

		public ALContext alContext;

		public TLS() {
			__buffer = new APIBuffer();
			stack = new MemoryStack();
		}

		@Override
		public void run() {
			if ( target != null )
				target.run();
		}

	}

	@SuppressWarnings("unchecked")
	static ThreadLocal<TLS> getInstance() {
		String provider = Configuration.THREAD_LOCAL_SPACE.get("FastThreadLocal");

		if ( "FastThreadLocal".equals(provider) ) {
			return new FastThreadLocal<TLS>() {
				@Override
				protected TLS initialValue() {
					return new TLS();
				}
			};
		} else if ( "unsafe".equals(provider) ) {
			return new UnsafeProvider();
		} else if ( "ThreadLocal".equals(provider) ) {
			return new ThreadLocal<ThreadLocalUtil.TLS>() {
				@Override
				protected TLS initialValue() {
					return new TLS();
				}
			};
		} else {
			throw new RuntimeException("Invalid " + Configuration.THREAD_LOCAL_SPACE.getProperty() + "specified.");
		}
	}

	/**
	 * Unsafe implemenation.
	 *
	 * <p>Replaces {@link Thread}'s target runnable with an instance of {@link TLS}. The new runnable delegates to the original runnable.</p>
	 *
	 * <p>This implementation trades the {@code ThreadLocalMap} lookup with a plain field derefence, eliminating considerable overhead.</p>
	 */
	private static class UnsafeProvider extends ThreadLocal<TLS> {

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
		protected TLS initialValue() {
			return new TLS();
		}

		@Override
		public TLS get() {
			Object target = UNSAFE.getObject(Thread.currentThread(), TARGET);
			if ( TLS.class.isInstance(target) )
				return (TLS)target;

			return setInitialValue();
		}

		private TLS setInitialValue() {
			TLS tls = initialValue();
			set(tls);
			return tls;
		}

		@Override
		public void set(TLS value) {
			Thread t = Thread.currentThread();

			value.target = (Runnable)UNSAFE.getObject(t, TARGET);
			UNSAFE.putObject(t, TARGET, value);
		}

		@Override
		public void remove() {
			Thread t = Thread.currentThread();

			Object target = UNSAFE.getObject(t, TARGET);
			if ( TLS.class.isInstance(target) ) {
				TLS tls = (TLS)target;
				UNSAFE.putObject(t, TARGET, tls.target);
			}
		}
	}

}
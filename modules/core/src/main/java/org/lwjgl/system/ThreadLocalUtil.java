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

	private static final Provider provider = getInstance();

	private ThreadLocalUtil() {
	}

	public static TLS tlsGet() {
		return provider.get();
	}

	public static class TLS implements Runnable {

		private final Runnable target;

		public final APIBuffer __buffer;

		public final MemoryStack stack;

		public GLCapabilities   glCaps;
		public GLESCapabilities glesCaps;

		public ALContext alContext;

		public TLS(Runnable target) {
			this.target = target;

			__buffer = new APIBuffer();
			stack = new MemoryStack();
		}

		@Override
		public void run() {
			if ( target != null )
				target.run();
		}

	}

	private interface Provider {

		TLS get();

	}

	static Provider getInstance() {
		try {
			return new FastTLProvider();
			//return new UnsafeProvider();
		} catch (Throwable t) {
		}

		return new DefaultProvider();
	}

	/** Default implementation using {@link ThreadLocal}. */
	private static class DefaultProvider implements Provider {

		private static final ThreadLocal<TLS> TL = new ThreadLocal<TLS>() {
			@Override
			protected TLS initialValue() {
				return new TLS(null);
			}
		};

		@Override
		public TLS get() {
			return TL.get();
		}

	}

	/** Implementation using {@link FastThreadLocal}. */
	public static class FastTLProvider implements Provider {

		private static final FastThreadLocal<TLS> TL = new FastThreadLocal<TLS>() {
			@Override
			public TLS initialValue() {
				return new TLS(null);
			}
		};

		@Override
		public TLS get() {
			return TL.get();
		}

	}

	/**
	 * Unsafe implemenation.
	 *
	 * <p>Replaces {@link Thread}'s target runnable with an instance of {@link TLS}. The new runnable delegates to the original runnable.</p>
	 *
	 * <p>This implementation trades the {@code ThreadLocalMap} lookup with a plain field derefence, eliminating considerable overhead.</p>
	 */
	private static class UnsafeProvider implements Provider {

		private static final sun.misc.Unsafe UNSAFE = MemoryAccess.getUnsafeInstance();

		private static final long TARGET;

		static {
			try {
				Field field = Thread.class.getDeclaredField("target");
				if ( !Runnable.class.isAssignableFrom(field.getType()) )
					throw new IllegalStateException();

				TARGET = UNSAFE.objectFieldOffset(field);

				init();
			} catch (NoSuchFieldException e) {
				throw new RuntimeException(e);
			}
		}

		private static TLS init() {
			Thread t = Thread.currentThread();

			TLS tls = new TLS((Runnable)UNSAFE.getObject(t, TARGET));

			UNSAFE.putObject(t, TARGET, tls);

			return tls;
		}

		@Override
		public TLS get() {
			Object target = UNSAFE.getObject(Thread.currentThread(), TARGET);
			if ( target instanceof TLS )
				return (TLS)target;

			return init();
		}

	}

}
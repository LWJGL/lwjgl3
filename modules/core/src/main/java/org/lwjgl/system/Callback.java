/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.PointerBuffer;

import java.lang.reflect.Method;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * This class makes it possible to dynamically create, at runtime, native functions that call into Java code. Pointers to such functions can then be passed to
 * native APIs as callbacks.
 *
 * <p>Callbacks must be referenced strongly in user code, else a {@link CallbackError} will be thrown on the next native callback invocation. Callbacks also
 * use native resources, while will result in memory leaks if not released after a Callback is no longer required.</p>
 */
public abstract class Callback implements Pointer {

	/** Native callback function pointer. */
	protected static final long
		NATIVE_CALLBACK_VOID,
		NATIVE_CALLBACK_BOOLEAN,
		NATIVE_CALLBACK_BYTE,
		NATIVE_CALLBACK_SHORT,
		NATIVE_CALLBACK_INT,
		NATIVE_CALLBACK_LONG,
		NATIVE_CALLBACK_FLOAT,
		NATIVE_CALLBACK_DOUBLE,
		NATIVE_CALLBACK_PTR;

	static {
		// Setup native callbacks
		PointerBuffer callbacks = null;

		try {
			Class<?>[] params = new Class<?>[] { long.class };

			Method[] methods = new Method[] {
				V.class.getDeclaredMethod("callback", params),
				Z.class.getDeclaredMethod("callback", params),
				B.class.getDeclaredMethod("callback", params),
				S.class.getDeclaredMethod("callback", params),
				I.class.getDeclaredMethod("callback", params),
				J.class.getDeclaredMethod("callback", params),
				F.class.getDeclaredMethod("callback", params),
				D.class.getDeclaredMethod("callback", params),
				P.class.getDeclaredMethod("callback", params)
			};

			callbacks = memAllocPointer(methods.length);

			getNativeCallbacks(methods, memAddress(callbacks));

			NATIVE_CALLBACK_VOID = callbacks.get();
			NATIVE_CALLBACK_BOOLEAN = callbacks.get();
			NATIVE_CALLBACK_BYTE = callbacks.get();
			NATIVE_CALLBACK_SHORT = callbacks.get();
			NATIVE_CALLBACK_INT = callbacks.get();
			NATIVE_CALLBACK_LONG = callbacks.get();
			NATIVE_CALLBACK_FLOAT = callbacks.get();
			NATIVE_CALLBACK_DOUBLE = callbacks.get();
			NATIVE_CALLBACK_PTR = callbacks.get();
		} catch (NoSuchMethodException e) {
			throw new IllegalStateException("Failed to initialize native callbacks.", e);
		} finally {
			if ( callbacks != null )
				memFree(callbacks);
		}
	}

	/** The default calling convention. */
	protected static final String CALL_CONVENTION_DEFAULT;
	/** The system calling convention. This may differ from the default on certain OS/arch combinations. */
	protected static final String CALL_CONVENTION_SYSTEM;

	static {
		// Setup calling conventions
		CALL_CONVENTION_DEFAULT = "";
		CALL_CONVENTION_SYSTEM = Platform.get() == Platform.WINDOWS && Pointer.BITS32
			? "_s"
			: "";
	}

	/** Pointer to a DCCallback object. */
	private long handle;

	/**
	 * Creates a new {@code Callback} instance.
	 *
	 * @param signature      the function signature
	 * @param classPath      an optional UTF-8 encoded string that will be used for debugging
	 * @param nativeCallback the native callback function address
	 */
	Callback(String signature, long classPath, long nativeCallback) {
		// Struct containing two pointers
		long user_data = nmemAlloc(POINTER_SIZE * 2);

		// First pointer is a weak reference to this closure instance.
		// ----
		// If this reference was strong, it would be very easy for users to never pay
		// attention to releasing closures, resulting in memory leaks. For this reason
		// we make it weak, making it eligible for GC very quickly if no strong reference
		// exists. We detect this in native code and instead of crashing or throwing an
		// NPE, we throw a ClosureError with an appropriate message.
		memPutAddress(user_data, memNewWeakGlobalRef(this));

		// Second pointer is a string containing debug information
		if ( Checks.DEBUG ) {
			// In debug mode, we store the current stacktrace (where the closure instance was created)
			StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
			StringBuilder buffer = new StringBuilder(128);
			for ( int i = 3; i < stackTrace.length; i++ ) {
				buffer.append("\n    at ");
				buffer.append(stackTrace[i].toString());
			}
			memPutAddress(user_data + POINTER_SIZE, memAddress(memUTF8(buffer.toString())));
		} else
			memPutAddress(user_data + POINTER_SIZE, classPath); // just the closure class

		handle = dcbNewCallback(signature, nativeCallback, user_data);
		if ( handle == NULL )
			throw new IllegalStateException("Failed to create the DCCallback object");
	}

	@Override
	public long address() {
		if ( !isValid() )
			throw new IllegalStateException("This callback instance has been freed.");

		return handle;
	}

	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( !(o instanceof Callback) ) return false;

		Callback that = (Callback)o;

		return address() == that.address();
	}

	public int hashCode() {
		long a = address();
		return (int)(a ^ (a >>> 32));
	}

	@Override
	public String toString() {
		return String.format("%s closure [0x%X]", getClass().getSimpleName(), address());
	}

	public void free() {
		address(); // already freed check

		long user_data = dcbGetUserData(handle);

		memDeleteWeakGlobalRef(memGetAddress(user_data));
		if ( Checks.DEBUG )
			nmemFree(memGetAddress(user_data + POINTER_SIZE));

		nmemFree(user_data);

		dcbFreeCallback(handle);
		handle = NULL;
	}

	/** Returns true if this Callback has not been destroyed. */
	public boolean isValid() {
		return handle != NULL;
	}

	/**
	 * Converts the specified executable address to the Callback instance associated with it.</p>
	 *
	 * @param functionPointer the function pointer
	 * @param <T>             the Callback instance type
	 *
	 * @return the Callback instance, or null if the function pointer is null
	 */
	public static <T extends Callback> T create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		return memGlobalRefToObject(memGetAddress(dcbGetUserData(functionPointer)));
	}

	/**
	 * If the specified function pointer is not null, frees the Clojure associated with it.
	 *
	 * @param functionPointer the function pointer
	 */
	public static void free(long functionPointer) {
		Callback clojure = create(functionPointer);
		if ( clojure != null )
			clojure.free();
	}

	private static native long getNativeCallbacks(Method[] methods, long callbacks);

	// Callback types

	/** A {@code Callback} with no return value. */
	public abstract static class V extends Callback {
		protected V(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_VOID);
		}

		protected abstract void callback(long args);
	}

	/** A {@code Callback} that returns a boolean value. */
	public abstract static class Z extends Callback {
		protected Z(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_BOOLEAN);
		}

		protected abstract boolean callback(long args);
	}

	/** A {@code Callback} that returns a byte value. */
	public abstract static class B extends Callback {
		protected B(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_BYTE);
		}

		protected abstract byte callback(long args);
	}

	/** A {@code Callback} that returns a short value. */
	public abstract static class S extends Callback {
		protected S(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_SHORT);
		}

		protected abstract short callback(long args);
	}

	/** A {@code Callback} that returns an int value. */
	public abstract static class I extends Callback {
		protected I(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_INT);
		}

		protected abstract int callback(long args);
	}

	/** A {@code Callback} that returns a long value. */
	public abstract static class J extends Callback {
		protected J(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_LONG);
		}

		protected abstract long callback(long args);
	}

	/** A {@code Callback} that returns a float value. */
	public abstract static class F extends Callback {
		protected F(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_FLOAT);
		}

		protected abstract float callback(long args);
	}

	/** A {@code Callback} that returns a double value. */
	public abstract static class D extends Callback {
		protected D(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_DOUBLE);
		}

		protected abstract double callback(long args);
	}

	/** A {@code Callback} that returns a pointer value. */
	public abstract static class P extends Callback {
		protected P(String signature, long classPath) {
			super(signature, classPath, NATIVE_CALLBACK_PTR);
		}

		protected abstract long callback(long args);
	}

}
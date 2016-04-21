/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.PointerBuffer;

import java.lang.reflect.Method;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Base interface for dynamically created native functions that call into Java code. Pointers to such functions can be passed to native APIs as callbacks.
 *
 * <p>This interface does not define a callback method, therefore it should not be implemented directly. The following inner interfaces should be used instead:
 * <ul>
 * <li>{@link V}</li>
 * <li>{@link Z}</li>
 * <li>{@link B}</li>
 * <li>{@link S}</li>
 * <li>{@link I}</li>
 * <li>{@link J}</li>
 * <li>{@link F}</li>
 * <li>{@link D}</li>
 * <li>{@link P}</li>
 * </ul></p>
 *
 * <p>Callback instances use native resources and must be explicitly freed when no longer used.</p>
 */
public interface Callback extends Pointer {

	/**
	 * Creates a native function that delegates to the specified {@code Callback} instance when called.
	 *
	 * <p>The native function uses the default calling convention.</p>
	 *
	 * @param function  the target {@code Callback} instance
	 * @param signature the {@code dyncall} function signature
	 *
	 * @return the dynamically generated native function
	 */
	static long create(Callback function, String signature) {
		return create(function, signature, false);
	}

	/**
	 * Creates a native function that delegates to the specified {@code Callback} instance when called.
	 *
	 * @param function             the target {@code Callback} instance
	 * @param signature            the {@code dyncall} function signature
	 * @param systemCallConvention if true, the system calling convention will be used (i.e. stdcall on Windows x86)
	 *
	 * @return the dynamically generated native function
	 */
	static long create(Callback function, String signature, boolean systemCallConvention) {
		long handle = dcbNewCallback(
			systemCallConvention && Platform.get() == Platform.WINDOWS && Pointer.BITS32 ? "_s" + signature : signature,
			CallbackNative.get(signature.charAt(signature.length() - 1)),
			memNewGlobalRef(function)
		);
		if ( handle == NULL )
			throw new IllegalStateException("Failed to create the DCCallback object");

		return handle;
	}

	/**
	 * Converts the specified function pointer to the {@code Callback} instance associated with it.</p>
	 *
	 * @param functionPointer a function pointer
	 * @param <T>             the {@code Callback} instance type
	 *
	 * @return the {@code Callback} instance, or null if the function pointer is {@code NULL}.
	 */
	static <T extends Callback> T get(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		return memGlobalRefToObject(dcbGetUserData(functionPointer));
	}

	/**
	 * Frees any resources held by the specified function pointer.
	 *
	 * @param functionPointer the function pointer
	 */
	static void free(long functionPointer) {
		memDeleteGlobalRef(dcbGetUserData(functionPointer));
		dcbFreeCallback(functionPointer);
	}

	/** Frees any resources held by this callback instance. */
	default void free() {
		throw new UnsupportedOperationException();
	}

	// Callback types

	/** A {@code Callback} with no return value. */
	interface V extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 */
		void callback(long args);
	}

	/** A {@code Callback} that returns a boolean value. */
	interface Z extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 *
		 * @return the value to store to the result {@code DCValue}
		 */
		boolean callback(long args);
	}

	/** A {@code Callback} that returns a byte value. */
	interface B extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 *
		 * @return the value to store to the result {@code DCValue}
		 */
		byte callback(long args);
	}

	/** A {@code Callback} that returns a short value. */
	interface S extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 *
		 * @return the value to store to the result {@code DCValue}
		 */
		short callback(long args);
	}

	/** A {@code Callback} that returns an int value. */
	interface I extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 *
		 * @return the value to store to the result {@code DCValue}
		 */
		int callback(long args);
	}

	/** A {@code Callback} that returns a long value. */
	interface J extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 *
		 * @return the value to store to the result {@code DCValue}
		 */
		long callback(long args);
	}

	/** A {@code Callback} that returns a float value. */
	interface F extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 *
		 * @return the value to store to the result {@code DCValue}
		 */
		float callback(long args);
	}

	/** A {@code Callback} that returns a double value. */
	interface D extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 *
		 * @return the value to store to the result {@code DCValue}
		 */
		double callback(long args);
	}

	/** A {@code Callback} that returns a pointer value. */
	interface P extends Callback {
		/**
		 * Will be called by native code.
		 *
		 * @param args pointer to a {@code DCArgs} iterator
		 *
		 * @return the value to store to the result {@code DCValue}
		 */
		long callback(long args);
	}

}

/** Contains native callback function pointers. */
final class CallbackNative {

	private static final long
		VOID,
		BOOLEAN,
		BYTE,
		SHORT,
		INT,
		LONG,
		FLOAT,
		DOUBLE,
		PTR;

	static {
		// Setup native callbacks
		try ( MemoryStack stack = stackPush() ) {
			Class<?>[] params = new Class<?>[] { long.class };

			Method[] methods = new Method[] {
				Callback.V.class.getDeclaredMethod("callback", params),
				Callback.Z.class.getDeclaredMethod("callback", params),
				Callback.B.class.getDeclaredMethod("callback", params),
				Callback.S.class.getDeclaredMethod("callback", params),
				Callback.I.class.getDeclaredMethod("callback", params),
				Callback.J.class.getDeclaredMethod("callback", params),
				Callback.F.class.getDeclaredMethod("callback", params),
				Callback.D.class.getDeclaredMethod("callback", params),
				Callback.P.class.getDeclaredMethod("callback", params)
			};

			PointerBuffer callbacks = stack.mallocPointer(methods.length);

			getNativeCallbacks(methods, memAddress(callbacks));

			VOID = callbacks.get();
			BOOLEAN = callbacks.get();
			BYTE = callbacks.get();
			SHORT = callbacks.get();
			INT = callbacks.get();
			LONG = callbacks.get();
			FLOAT = callbacks.get();
			DOUBLE = callbacks.get();
			PTR = callbacks.get();
		} catch (Exception e) {
			throw new IllegalStateException("Failed to initialize native callbacks.", e);
		}
	}

	private CallbackNative() {}

	private static native long getNativeCallbacks(Method[] methods, long callbacks);

	static long get(char type) {
		switch ( type ) {
			case 'v':
				return VOID;
			case 'B':
				return BOOLEAN;
			case 'c':
				return BYTE;
			case 's':
				return SHORT;
			case 'i':
				return INT;
			case 'l':
				return LONG;
			case 'p':
				return PTR;
			case 'f':
				return FLOAT;
			case 'd':
				return DOUBLE;
			default:
				throw new IllegalArgumentException();
		}
	}

}
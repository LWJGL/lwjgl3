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
 * Base class for dynamically created native functions that call into Java code.
 *
 * <p>Callback instances use native resources and must be explicitly freed when no longer used by calling the {@link #free} method.</p>
 */
public abstract class Callback extends Pointer.Default {

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
				CallbackI.V.class.getDeclaredMethod("callback", params),
				CallbackI.Z.class.getDeclaredMethod("callback", params),
				CallbackI.B.class.getDeclaredMethod("callback", params),
				CallbackI.S.class.getDeclaredMethod("callback", params),
				CallbackI.I.class.getDeclaredMethod("callback", params),
				CallbackI.J.class.getDeclaredMethod("callback", params),
				CallbackI.F.class.getDeclaredMethod("callback", params),
				CallbackI.D.class.getDeclaredMethod("callback", params),
				CallbackI.P.class.getDeclaredMethod("callback", params)
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

	protected Callback(long address) {
		super(address);
	}

	/** Frees any resources held by this callback instance. */
	public void free() {
		Callback.free(address());
	}

	private static native long getNativeCallbacks(Method[] methods, long callbacks);

	private static long getNativeFunction(char type) {
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
	/**
	 * Creates a native function that delegates to the specified {@code CallbackI} instance when called.
	 *
	 * <p>The native function uses the default calling convention.</p>
	 *
	 * @param function  the target {@code CallbackI} instance
	 * @param signature the {@code dyncall} function signature
	 *
	 * @return the dynamically generated native function
	 */
	public static long create(CallbackI function, String signature) {
		return create(function, signature, false);
	}

	/**
	 * Creates a native function that delegates to the specified {@code Callback} instance when called.
	 *
	 * @param function             the target {@code CallbackI} instance
	 * @param signature            the {@code dyncall} function signature
	 * @param systemCallConvention if true, the system calling convention will be used (i.e. stdcall on Windows x86)
	 *
	 * @return the dynamically generated native function
	 */
	public static long create(CallbackI function, String signature, boolean systemCallConvention) {
		long handle = dcbNewCallback(
			systemCallConvention && Platform.get() == Platform.WINDOWS && Pointer.BITS32 ? "_s" + signature : signature,
			getNativeFunction(signature.charAt(signature.length() - 1)),
			memNewGlobalRef(function)
		);
		if ( handle == NULL )
			throw new IllegalStateException("Failed to create the DCCallback object");

		return handle;
	}

	/**
	 * Converts the specified function pointer to the {@code CallbackI} instance associated with it.</p>
	 *
	 * @param functionPointer a function pointer
	 * @param <T>             the {@code CallbackI} instance type
	 *
	 * @return the {@code CallbackI} instance, or null if the function pointer is {@code NULL}.
	 */
	public static <T extends CallbackI> T get(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		return memGlobalRefToObject(dcbGetUserData(functionPointer));
	}

	/**
	 * Frees any resources held by the specified function pointer.
	 *
	 * @param functionPointer the function pointer
	 */
	public static void free(long functionPointer) {
		memDeleteGlobalRef(dcbGetUserData(functionPointer));
		dcbFreeCallback(functionPointer);
	}

}
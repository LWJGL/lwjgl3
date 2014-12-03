/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.Platform;
import org.lwjgl.Pointer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.Retainable.Default;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * This class makes it possible to dynamically create, at runtime, native functions that call into Java code. Pointers to such functions can then be passed to
 * native APIs as callbacks.
 */
public abstract class Closure extends Default implements Pointer {

	/*
		We could use a single method (ret, args) in this class that forwards all callbacks, but then we'd
		have the following issues:

		a) The call would be heavily megamorphic. Instead, we create a callback struct (jobject, jMethodID)
		per instance. jMethodID points to the non virtual callback method in the callback subclass, avoiding
		the vtable lookup.

		b) We also use the MethodA routines so that we decode an array of jvalues, instead of an array of
		pointers to jvalues. We cannot also pass the ret pointer, so we use different native callbacks per
		return type.
	 */

	/** Native callback function pointer. */
	protected static final long
		NATIVE_CALLBACK_VOID,
		NATIVE_CALLBACK_BYTE,
		NATIVE_CALLBACK_SHORT,
		NATIVE_CALLBACK_INT,
		NATIVE_CALLBACK_LONG,
		NATIVE_CALLBACK_FLOAT,
		NATIVE_CALLBACK_DOUBLE,
		NATIVE_CALLBACK_PTR;

	/** The default calling convention. */
	protected static final int CALL_CONVENTION_DEFAULT;
	/** The system calling convention. This may differ from the default on certain OS/arch combinations. */
	protected static final int CALL_CONVENTION_SYSTEM;

	static {
		// Setup native callbacks
		PointerBuffer callbacks = BufferUtils.createPointerBuffer(8);

		getNativeCallbacks(memAddress(callbacks));

		NATIVE_CALLBACK_VOID = callbacks.get(0);
		NATIVE_CALLBACK_BYTE = callbacks.get(1);
		NATIVE_CALLBACK_SHORT = callbacks.get(2);
		NATIVE_CALLBACK_INT = callbacks.get(3);
		NATIVE_CALLBACK_LONG = callbacks.get(4);
		NATIVE_CALLBACK_FLOAT = callbacks.get(5);
		NATIVE_CALLBACK_DOUBLE = callbacks.get(6);
		NATIVE_CALLBACK_PTR = callbacks.get(7);

		// Setup calling conventions
		CALL_CONVENTION_DEFAULT = FFI_DEFAULT_ABI;
		CALL_CONVENTION_SYSTEM = LWJGLUtil.getPlatform() == Platform.WINDOWS && Pointer.BITS32
			? FFI_STDCALL
			: FFI_DEFAULT_ABI;
	}

	/** Optional class to which all allocated Closures will be registered. */
	private static final ClosureRegistry registry;

	static {
		String factoryClass = System.getProperty("org.lwjgl.system.libffi.ClosureRegistry");
		if ( factoryClass == null )
			registry = null;
		else {
			try {
				Class<?> factory = Class.forName(factoryClass);
				Method create = factory.getMethod("get");
				if ( !Modifier.isStatic(create.getModifiers()) || !ClosureRegistry.class.isAssignableFrom(create.getReturnType()) )
					throw new IllegalArgumentException("Invalid ClosureRegistry specified.");

				registry = (ClosureRegistry)create.invoke(null);
			} catch (Exception e) {
				throw new IllegalStateException("Failed to initialize the Closure registry.", e);
			}
		}
	}

	/** The ClosureCallback structure. */
	private final ByteBuffer callback;

	/** Pointer to libFFI's cif structure. */
	private long closure;

	/** The dynamically generated function pointer. */
	private final long pointer;

	protected Closure(ByteBuffer cif, long nativeCallback) {
		this.callback = getJavaCallback(this.getClass(), "callback", long.class);

		// Allocate ffi closure
		APIBuffer __buf = apiStack();
		this.closure = nffi_closure_alloc(ffi_closure.SIZEOF, __buf.address() + __buf.getOffset());
		this.pointer = __buf.pointerValue(__buf.getOffset());
		__buf.pop();

		if ( closure == NULL ) {
			memDeleteWeakGlobalRef(PointerBuffer.get(callback, 0));
			throw new OutOfMemoryError("Failed to allocate libffi closure.");
		}

		// Prepare ffi closure
		int status = nffi_prep_closure_loc(
			closure,                // ffi_closure*
			memAddress(cif),        // ffi_cif*
			nativeCallback,        // (void)(*FFI_CLOSURE_FUN)(ffi_cif* cif, void* ret, void** args, void* user_data)
			memAddress(callback),   // ClosureCallback*
			pointer                 // function*
		);
		if ( status != FFI_OK ) {
			destroy();
			throw new IllegalStateException(String.format("Failed to prepare libffi closure. Status: 0x%X", status));
		}

		if ( registry != null )
			registry.register(this);
	}

	@Override
	public long getPointer() {
		if ( closure == NULL )
			throw new IllegalStateException("This closure instance has been destroyed.");

		return pointer;
	}

	@Override
	protected void destroy() {
		if ( closure == NULL )
			throw new IllegalStateException("This closure instance has been destroyed.");

		memDeleteWeakGlobalRef(PointerBuffer.get(callback, 0));
		nffi_closure_free(closure);
		closure = NULL;
	}

	/**
	 * Returns true if this Closure has been destroyed.
	 *
	 * @return the if the Closure is destroyed
	 */
	public boolean isDestroyed() {
		return closure == NULL;
	}

	/**
	 * Converts the specified executable address to the Closure instance associated with it.</p>
	 *
	 * @param functionPointer the function pointer
	 * @param <T>             the Closure instance type
	 *
	 * @return the Closure instance, or null if the function pointer is null
	 */
	public static <T extends Closure> T create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		/*
			This implementation assumes that ffi_closure and executable both point to the same address.
	        This is valid for x86 architectures on Windows, Linux and OS X. It is not valid on ARM and
	        other architectures/OSes. TODO: Fix on other architectures

			function*
				... USER_DATA bytes
				ClosureCallback* -> globalRef
		 */
		return memGlobalRefToObject(memGetAddress(memGetAddress(functionPointer + ffi_closure.USER_DATA)));
	}

	/**
	 * If the specified function pointer is not null, releases the Clojure associated with it.
	 *
	 * @param functionPointer the function pointer
	 */
	public static void release(long functionPointer) {
		Closure clojure = create(functionPointer);
		if ( clojure != null )
			clojure.release();
	}

	private ByteBuffer getJavaCallback(Class<? extends Closure> clazz, String name, Class<?>... parameterTypes) {
		try {
			Class<?> source = clazz;
			while ( source.getSuperclass() != Closure.class )
				source = source.getSuperclass();

			ByteBuffer callback = ClosureCallback.malloc();
			getJavaCallback(source.getDeclaredMethod(name, parameterTypes), memAddress(callback));
			return callback;
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
	}

	private native void getJavaCallback(Method method, long callback);

	private static native long getNativeCallbacks(long callbacks);

}
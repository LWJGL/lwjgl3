/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * This class makes it possible to dynamically create, at runtime, native functions that call into Java code. Pointers to such functions can then be passed to
 * native APIs as callbacks.
 * <p/>
 * Closures must be referenced strongly in user code, else a {@link ClosureError} will be thrown on the next native callback invocation. Closures also use
 * native resources, while will result in memory leaks if not released after a Closure is no longer required.
 */
public abstract class Closure extends Retainable.Default implements Pointer {

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
				Void.class.getDeclaredMethod("callback", params),
				Boolean.class.getDeclaredMethod("callback", params),
				Byte.class.getDeclaredMethod("callback", params),
				Short.class.getDeclaredMethod("callback", params),
				Int.class.getDeclaredMethod("callback", params),
				Long.class.getDeclaredMethod("callback", params),
				Float.class.getDeclaredMethod("callback", params),
				Double.class.getDeclaredMethod("callback", params),
				Ptr.class.getDeclaredMethod("callback", params)
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
			throw new IllegalStateException("Failed to initialize closure callbacks.", e);
		} finally {
			if ( callbacks != null )
				memFree(callbacks);
		}
	}

	/** The default calling convention. */
	protected static final int CALL_CONVENTION_DEFAULT;
	/** The system calling convention. This may differ from the default on certain OS/arch combinations. */
	protected static final int CALL_CONVENTION_SYSTEM;

	static {
		// Setup calling conventions
		CALL_CONVENTION_DEFAULT = FFI_DEFAULT_ABI;
		CALL_CONVENTION_SYSTEM = Platform.get() == Platform.WINDOWS && Pointer.BITS32
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
				Class<?> factory = Thread.currentThread().getContextClassLoader().loadClass(factoryClass);
				Method create = factory.getMethod("get");
				if ( !Modifier.isStatic(create.getModifiers()) || !ClosureRegistry.class.isAssignableFrom(create.getReturnType()) )
					throw new IllegalArgumentException("Invalid ClosureRegistry specified.");

				registry = (ClosureRegistry)create.invoke(null);
			} catch (Exception e) {
				throw new IllegalStateException("Failed to initialize the Closure registry.", e);
			}
		}
	}

	/** The user data structure. */
	private long user_data;

	/** Pointer to libFFI's closure structure. */
	private final long closure;

	/** The dynamically generated function pointer. */
	private final long pointer;

	Closure(FFICIF cif, long classPath, long nativeCallback) {
		// Allocate ffi closure
		APIBuffer __buf = apiStack();
		this.closure = nffi_closure_alloc(FFIClosure.SIZEOF, __buf.address(__buf.getOffset()));
		this.pointer = __buf.pointerValue(__buf.getOffset());
		__buf.pop();

		if ( closure == NULL )
			throw new OutOfMemoryError("Failed to allocate libffi closure.");

		// Struct containing two pointers
		user_data = nmemAlloc(POINTER_SIZE * 2);

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
			memPutAddress(user_data + POINTER_SIZE, memAddress(memEncodeASCII(buffer.toString(), true, BufferAllocator.MALLOC)));
		} else
			memPutAddress(user_data + POINTER_SIZE, classPath); // just the closure class

		// Prepare ffi closure
		int status = nffi_prep_closure_loc(
			closure,        // ffi_closure*
			cif.address(),  // ffi_cif*
			nativeCallback, // (void)(*FFI_CLOSURE_FUN)(ffi_cif* cif, void* ret, void** args, void* user_data)
			user_data,      // void*
			pointer         // function*
		);
		if ( status != FFI_OK ) {
			destroy();
			throw new IllegalStateException(String.format("Failed to prepare libffi closure. Status: 0x%X", status));
		}

		if ( registry != null )
			registry.register(this);
	}

	@Override
	public long address() {
		if ( isDestroyed() )
			throw new IllegalStateException("This closure instance has been destroyed.");

		return pointer;
	}

	@Override
	protected void destroy() {
		if ( isDestroyed() )
			throw new IllegalStateException("This closure instance has been destroyed.");

		memDeleteWeakGlobalRef(memGetAddress(user_data));
		if ( Checks.DEBUG )
			nmemFree(memGetAddress(user_data + POINTER_SIZE));

		nmemFree(user_data);
		user_data = NULL;

		nffi_closure_free(closure);
	}

	/**
	 * Returns true if this Closure has been destroyed.
	 *
	 * @return the if the Closure is destroyed
	 */
	public boolean isDestroyed() {
		return user_data == NULL;
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
		 */
		return memGlobalRefToObject(memGetAddress(memGetAddress(functionPointer + FFIClosure.USER_DATA)));
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

	protected static FFICIF staticAllocCIF() {
		return new FFICIF(getAllocator().malloc(FFICIF.SIZEOF));
	}

	protected static PointerBuffer staticAllocPointer(int size) {
		return memPointerBuffer(getAllocator().malloc(size * POINTER_SIZE), size);
	}

	protected static long staticAllocText(String text) {
		int size = text.length() + 1;
		long address = getAllocator().malloc(size);
		memEncodeASCII(text, true, memByteBuffer(address, size));
		return address;
	}

	protected static void prepareCIF(int ABI, FFICIF CIF, FFIType rtype, PointerBuffer ARGS, FFIType... atypes) {
		for ( int i = 0; i < atypes.length; i++ )
			ARGS.put(i, atypes[i]);

		int status = ffi_prep_cif(CIF, ABI, rtype, ARGS);
		if ( status != FFI_OK )
			throw new IllegalStateException(String.format("Failed to prepare callback interface. Status: 0x%X", status));
	}

	private static native long getNativeCallbacks(Method[] methods, long callbacks);

	// Closures types

	/** A {@code Closure} with no return value. */
	public abstract static class Void extends Closure {
		protected Void(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_VOID);
		}

		protected abstract void callback(long args);
	}

	/** A {@code Closure} that returns a boolean value. */
	public abstract static class Boolean extends Closure {
		protected Boolean(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_BOOLEAN);
		}

		protected abstract boolean callback(long args);
	}

	/** A {@code Closure} that returns a byte value. */
	public abstract static class Byte extends Closure {
		protected Byte(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_BYTE);
		}

		protected abstract byte callback(long args);
	}

	/** A {@code Closure} that returns a short value. */
	public abstract static class Short extends Closure {
		protected Short(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_SHORT);
		}

		protected abstract short callback(long args);
	}

	/** A {@code Closure} that returns an int value. */
	public abstract static class Int extends Closure {
		protected Int(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_INT);
		}

		protected abstract int callback(long args);
	}

	/** A {@code Closure} that returns a long value. */
	public abstract static class Long extends Closure {
		protected Long(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_LONG);
		}

		protected abstract long callback(long args);
	}

	/** A {@code Closure} that returns a float value. */
	public abstract static class Float extends Closure {
		protected Float(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_FLOAT);
		}

		protected abstract float callback(long args);
	}

	/** A {@code Closure} that returns a double value. */
	public abstract static class Double extends Closure {
		protected Double(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_DOUBLE);
		}

		protected abstract double callback(long args);
	}

	/** A {@code Closure} that returns a pointer value. */
	public abstract static class Ptr extends Closure {
		protected Ptr(FFICIF cif, long classPath) {
			super(cif, classPath, NATIVE_CALLBACK_PTR);
		}

		protected abstract long callback(long args);
	}

}
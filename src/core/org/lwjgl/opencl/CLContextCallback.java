/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIBuffer;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this interface may be passed to the {@link CL10#clCreateContext(PointerBuffer, PointerBuffer, CLContextCallback, IntBuffer) CreateContext}
 * or {@link CL10#clCreateContextFromType(PointerBuffer, long, CLContextCallback, IntBuffer) CreateContextFromType} methods.
 */
/*@FunctionalInterface*/
public interface CLContextCallback {

	/**
	 * Invoked to report information on errors during context creation as well as errors that occur at runtime.
	 *
	 * @param errinfo      a pointer to an error string
	 * @param private_info a pointer to binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in
	 *                     debugging the error.
	 * @param cb           the number of bytes in the {@code private_info} pointer
	 */
	void invoke(long errinfo, long private_info, long cb);

	/** Extends {@code CLContextCallback} with an alternative version that accepts a string. */
	/*@FunctionalInterface*/
	interface Str extends CLContextCallback {
		/*@Override
		default void invoke(long errinfo, long private_info, long cb) {
			invoke(memDecodeUTF8(memByteBufferNT1(errinfo)), private_info == NULL ? null : memByteBuffer(private_info, cb));
		}*/

		/**
		 * Invoked to report information on errors during context creation as well as errors that occur at runtime.
		 *
		 * @param errinfo      an error string
		 * @param private_info binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in
		 *                     debugging the error. May be null.
		 */
		void invoke(String errinfo, ByteBuffer private_info);
	}

	/** A {@link CLContextCallback.Str} adapter. */
	abstract class StrAdapter implements Str {
		@Override
		public void invoke(long errinfo, long private_info, long cb) {
			invoke(memByteBufferNT1(errinfo), private_info == NULL ? null : memByteBuffer(private_info, cb));
		}

		/** Alternative version that accepts a buffer. */
		public void invoke(ByteBuffer errinfo, ByteBuffer private_info) {
			invoke(memDecodeUTF8(errinfo), private_info);
		}

		@Override
		public void invoke(String errinfo, ByteBuffer private_info) {
		}
	}

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(CLContextCallback.class, long.class, long.class, long.class));

		private static final CLContextCallback DEFAULT = new StrAdapter() {
			@Override
			public void invoke(String errinfo, ByteBuffer private_info) {
				System.err.println("[LWJGL] cl_create_context_callback");
				System.err.println("\tInfo: " + errinfo);
			}
		};

		// Map from cl_context to CLContextCallback global reference.
		private static final Map<Long, Long> contextCallbacks = new HashMap<>(8);

		private Util() {
		}

		private static native long setCallback(Method callback);

		static long register(CLContextCallback proc) {
			return proc == null ? NULL : memGlobalRefNew(proc);
		}

		static void retain(long context, long proc) {
			if ( proc == NULL )
				return;

			if ( context == NULL ) // CreateContext failed.
				memGlobalRefDelete(proc);
			else
				contextCallbacks.put(context, proc);
		}

		static int getReferenceCount(long context) {
			APIBuffer __buffer = apiBuffer();
			int __result = nclGetContextInfo(context, CL_CONTEXT_REFERENCE_COUNT, 4, __buffer.address(), NULL);
			return __result == CL_SUCCESS ? __buffer.intValue(0) : -1;
		}

		static void release(long context) {
			Long proc = contextCallbacks.get(context);
			if ( proc == null )
				return;

			memGlobalRefDelete(proc);
			contextCallbacks.remove(context);
		}

		/**
		 * Returns a default {@code CLContextCallback} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static CLContextCallback getDefault() {
			return DEFAULT;
		}

	}

}
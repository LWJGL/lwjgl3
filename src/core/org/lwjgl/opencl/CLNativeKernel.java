/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this interface may be passed to the {@link CL10#clEnqueueNativeKernel(long, CLNativeKernel, ByteBuffer, PointerBuffer,
 * PointerBuffer, PointerBuffer, PointerBuffer) EnqueueNativeKernel} method. Instances may be re-used after the native kernel has been invoked.
 */
/*@FunctionalInterface*/
public interface CLNativeKernel {

	/**
	 * The native kernel implementation.
	 *
	 * @param args    a pointer to the native kernel arguments
	 * @param cb_args the size in bytes of the args list that {@code args} points to
	 */
	void invoke(long args, int cb_args);

	/** Extends {@code CLNativeKernel} with an alternative version that accepts a buffer. */
	/*@FunctionalInterface*/
	interface Buf extends CLNativeKernel {
		/*@Override
		default void invoke(long args, int cb_args) {
			invoke(cb_args == 0 ? null : memByteBuffer(args, cb_args));
		}*/

		/**
		 * The native kernel implementation.
		 *
		 * @param args the native kernel arguments. In the default implementation, this will be null if the enqueued arguments buffer for this native kernel
		 *             did not have space for anything other than 2 pointers.
		 */
		void invoke(ByteBuffer args);
	}

	/** A {@link CLNativeKernel.Buf} adapter. */
	abstract class BufAdapter implements Buf {
		@Override
		public void invoke(long args, int cb_args) {
			invoke(cb_args == 0 ? null : memByteBuffer(args, cb_args));
		}
	}

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(CLNativeKernel.class, long.class, int.class));

		private Util() {
		}

		private static native long setCallback(Method callback);

		static long register(CLNativeKernel kernel, ByteBuffer args) {
			if ( kernel == null )
				return NULL;

			if ( LWJGLUtil.DEBUG && args.remaining() < POINTER_SIZE * 2 )
				throw new IllegalArgumentException("The arguments buffer must have enough space for 2 pointer values.");

			long globalRef = memGlobalRefNew(kernel); // this global reference is deleted in native code (after invoke)
			PointerBuffer.put(args, 0, globalRef);

			// Even though we need 4 bytes for cb_args, reserve POINTER_SIZE bytes to ensure the real arguments have natural alignment on x64 platforms.
			args.putInt(POINTER_SIZE, args.remaining() - POINTER_SIZE * 2);

			return globalRef;
		}

	}

}
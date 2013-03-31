/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.PointerBuffer;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link CL10#clEnqueueNativeKernel(CLCommandQueue, CLNativeKernel, ByteBuffer, PointerBuffer, PointerBuffer, PointerBuffer, PointerBuffer)} method.
 * Instances may be re-used after the native kernel has been invoked.
 * <p/>
 * Override the {@link #invoke(ByteBuffer)} method to implement the native kernel. The default implementation does nothing.
 */
public class CLNativeKernel {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(CLNativeKernel.class.getMethod(
				"invoke", long.class
			));
		} catch (Exception e) {
			throw new OpenCLException(e);
		}
	}

	private int argsSize;

	protected CLNativeKernel() {
	}

	private static native long setCallback(Method callback);

	long register(ByteBuffer args) {
		if ( argsSize != 0 )
			throw new IllegalStateException("This CLNativeKernel instance is already in use.");

		argsSize = args.remaining() - POINTER_SIZE;

		long globalRef = memGlobalRefNew(this); // this global reference is deleted in native code (after invoke)
		PointerBuffer.put(args, 0, globalRef);
		return globalRef;
	}

	/**
	 * The native kernel implementation.
	 *
	 * @param argsAddress a pointer to the native kernel arguments
	 */
	public void invoke(long argsAddress) {
		ByteBuffer args = memByteBuffer(argsAddress, argsSize);
		invoke(args);
	}

	public void invoke(ByteBuffer args) {
	}

}
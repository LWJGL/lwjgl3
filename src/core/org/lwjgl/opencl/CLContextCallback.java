/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.PointerBuffer;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link CL10#clCreateContext(PointerBuffer, PointerBuffer, CLContextCallback, IntBuffer)}
 * or {@link CL10#clCreateContextFromType(PointerBuffer, long, CLContextCallback, IntBuffer)} methods.
 */
public class CLContextCallback {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(CLContextCallback.class.getMethod(
				"invoke", long.class, long.class, long.class
			));
		} catch (Exception e) {
			throw new OpenCLException(e);
		}
	}

	public CLContextCallback() {
	}

	private static native long setCallback(Method callback);

	static long register(CLContextCallback proc) {
		return proc == null ? 0L : memGlobalRefNewWeak(proc);
	}

	/**
	 * Invoked to report information on errors during context creation as well as errors that occur at runtime.
	 *
	 * @param errinfo      a pointer to an error string
	 * @param private_info a pointer to binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in
	 *                     debugging the error.
	 * @param cb           the number of bytes in the {@code private_info} pointer
	 */
	public void invoke(long errinfo, long private_info, long cb) {
		invoke(memByteBufferNT1(errinfo), memByteBuffer(private_info, cb));
	}

	/** Alternative version of {@link #invoke(long, long, long)}. */
	public void invoke(ByteBuffer errinfo, ByteBuffer private_info) {
		invoke(memDecodeUTF8(errinfo), private_info);
	}

	/** String version of {@link #invoke(ByteBuffer, ByteBuffer)}. */
	public void invoke(String errinfo, ByteBuffer private_info) {
		System.err.println("[LWJGL] cl_create_context_callback");
		System.err.println("\tInfo: " + errinfo);
	}

}
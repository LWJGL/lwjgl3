/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Method;

/**
 * Instances of this class may be passed to the {@link CL11#clSetMemObjectDestructorCallback(CLMem, CLMemObjectDestructorCallback)} method.
 * <p/>
 * Override the {@link #invoke(long)} method to implement any necessary actions. The default implementation prints a simple description in the standard
 * output stream.
 */
public class CLMemObjectDestructorCallback {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(CLMemObjectDestructorCallback.class.getMethod(
				"invoke", long.class
			));
		} catch (Exception e) {
			throw new OpenCLException(e);
		}
	}

	protected CLMemObjectDestructorCallback() {
	}

	private static native long setCallback(Method callback);

	/**
	 * Called when a memory object is being deleted. When the user callback is called by the implementation, the memory object is not longer valid.
	 * {@code memobj} is only provided for reference purposes.
	 *
	 * @param memobj the cl_mem object being deleted
	 */
	public void invoke(long memobj) {
		System.out.println("[LWJGL] cl_mem object destroyed [" + LWJGLUtil.toHexString(memobj) + "]");
	}

}
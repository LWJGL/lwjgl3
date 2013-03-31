/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import java.lang.reflect.Method;

import static org.lwjgl.system.MemoryUtil.*;

/** Common functionality for cl_program callbacks. */
abstract class CLProgramCallback {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(CLProgramCallback.class.getDeclaredMethod(
				"invoke", long.class
			));
		} catch (Exception e) {
			throw new OpenCLException(e);
		}
	}

	private static native long setCallback(Method callback);

	protected CLProgramCallback() {
	}

	static long register(CLProgramCallback proc) {
		if ( proc == null )
			return 0L;

		return memGlobalRefNew(proc); // this global reference is deleted in native code (after invoke)
	}

	public abstract void invoke(long cl_program);

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;

/**
 * Instances of this class may be passed to the {@link }
 * method. Instances may be re-used after the callback function has been invoked.
 * <p/>
 * Override the {@link #invoke(long)} method to implement any necessary actions. The default implementation prints a simple description in the standard
 * output stream.
 */
public class CLProgramCallbackLink extends CLProgramCallback {

	public CLProgramCallbackLink() {
	}

	/**
	 * Invoked when a program executable has been compiled.
	 *
	 * @param cl_program the program object that was compiled
	 */
	@Override
	public void invoke(long cl_program) {
		System.out.println("[LWJGL] clLinkProgram callback [" + LWJGLUtil.toHexString(cl_program) + "]");
	}

}
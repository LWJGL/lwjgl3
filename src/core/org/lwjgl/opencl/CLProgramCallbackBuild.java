/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;

/**
 * Instances of this class may be passed to the {@link CL10#clBuildProgram(CLProgram, PointerBuffer, CharSequence, CLProgramCallbackBuild)} method. Instances
 * may be re-used after the callback function has been invoked.
 * <p/>
 * Override the {@link #invoke(long)} method to implement any necessary actions. The default implementation prints a simple description in the standard
 * output stream.
 */
public class CLProgramCallbackBuild extends CLProgramCallback {

	public CLProgramCallbackBuild() {
	}

	/**
	 * Invoked when a program executable has been built.
	 *
	 * @param cl_program the program object that was built
	 */
	@Override
	public void invoke(long cl_program) {
		System.out.println("[LWJGL] clBuildProgram callback [" + LWJGLUtil.toHexString(cl_program) + "]");
	}

}
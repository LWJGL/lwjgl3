/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;

/**
 * Instances of this class may be passed to the {@link CL12#clCompileProgram(CLProgram, PointerBuffer, ByteBuffer, PointerBuffer, PointerBuffer, CLProgramCallbackCompile)}
 * method. Instances may be re-used after the callback function has been invoked.
 * <p/>
 * Override the {@link #invoke(long)} method to implement any necessary actions. The default implementation prints a simple description in the standard
 * output stream.
 */
public class CLProgramCallbackCompile extends CLProgramCallback {

	public CLProgramCallbackCompile() {
	}

	/**
	 * Invoked when a program executable has been compiled.
	 *
	 * @param cl_program the program object that was compiled
	 */
	@Override
	public void invoke(long cl_program) {
		System.out.println("[LWJGL] clCompileProgram callback [" + LWJGLUtil.toHexString(cl_program) + "]");
	}

}
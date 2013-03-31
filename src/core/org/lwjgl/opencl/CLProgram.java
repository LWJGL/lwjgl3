/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

/** This class is a wrapper around a cl_program pointer. */
public class CLProgram extends CLObjectChild<CLContext> {

	private CLProgram(long pointer, CLContext context) {
		super(pointer, context);
	}

	public static CLProgram create(long cl_program, CLContext context) {
		if ( cl_program == 0L )
			return null;

		return new CLProgram(cl_program, context);
	}

}
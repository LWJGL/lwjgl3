/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

/** This class is a wrapper around a cl_sampler pointer. */
public class CLSampler extends CLObjectChild<CLContext> {

	private CLSampler(long pointer, CLContext context) {
		super(pointer, context);
	}

	public static CLSampler create(long cl_sampler, CLContext context) {
		if ( cl_sampler == 0L )
			return null;

		return new CLSampler(cl_sampler, context);
	}

}
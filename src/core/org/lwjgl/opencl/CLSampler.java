/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_sampler pointer. */
public class CLSampler extends CLObjectChild<CLContext> {

	private CLSampler(long pointer, CLContext context) {
		super(pointer, context);
	}

	public static CLSampler create(long cl_sampler, CLContext context) {
		if ( cl_sampler == NULL )
			return null;

		return new CLSampler(cl_sampler, context);
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetSamplerInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.clGetSamplerInfo);
	}

}
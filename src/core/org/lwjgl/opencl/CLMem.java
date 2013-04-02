/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import static org.lwjgl.opencl.CL10.*;

public class CLMem extends CLObjectChild<CLContext> {

	private CLMem(long pointer, CLContext context) {
		super(pointer, context);
	}

	/**
	 * Sub-buffer constructor.
	 *
	 * @param pointer the subbuffer pointer
	 * @param buffer  the parent pointer
	 */
	private CLMem(long pointer, CLMem buffer) {
		super(pointer, buffer.getParent());
	}

	public static CLMem create(long cl_mem, CLContext context) {
		if ( cl_mem == 0L )
			return null;

		return new CLMem(cl_mem, context);
	}

	public static CLMem create(long pointer, CLMem parent) {
		if ( pointer == 0L )
			return null;

		return new CLMem(pointer, parent.getParent());
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetMemObjectInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.clGetMemObjectInfo);
	}

}
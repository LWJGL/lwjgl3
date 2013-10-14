/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_event pointer. */
public class CLEvent extends CLObjectChild<CLContext> {

	private CLEvent(long pointer, CLContext context) {
		super(pointer, context);
	}

	public static CLEvent create(long cl_event, CLContext context) {
		if ( cl_event == NULL )
			return null;

		return new CLEvent(cl_event, context);
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetEventInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.GetEventInfo);
	}

}
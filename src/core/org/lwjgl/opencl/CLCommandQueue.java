/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_command_queue pointer. */
public class CLCommandQueue extends CLObjectChild<CLDevice> {

	private final CLContext context;

	private CLCommandQueue(long pointer, CLContext context, CLDevice device) {
		super(pointer, device);

		this.context = context;
	}

	public static CLCommandQueue create(long cl_command_queue, CLContext context, CLDevice device) {
		if ( cl_command_queue == NULL )
			return null;

		return new CLCommandQueue(cl_command_queue, context, device);
	}

	public CLContext getContext() {
		return context;
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetCommandQueueInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.GetCommandQueueInfo);
	}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.APIUtil;

import java.nio.ByteBuffer;

import static org.lwjgl.opencl.CL10.*;

/** This class is a wrapper around a cl_command_queue pointer. */
public class CLCommandQueue extends CLObjectChild<CLDevice> {

	private final CLContext context;

	private CLCommandQueue(long pointer, CLContext context, CLDevice device) {
		super(pointer, device);

		this.context = context;
	}

	public static CLCommandQueue create(long cl_command_queue, CLContext context, CLDevice device) {
		if ( cl_command_queue == 0L )
			return null;

		return new CLCommandQueue(cl_command_queue, context, device);
	}

	public CLContext getContext() {
		return context;
	}

	public int getInfoInt(int param_name) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		clGetCommandQueueInfo(this, param_name, 4, __buffer.buffer(), (ByteBuffer)null);
		return __buffer.intValue(0);
	}

}
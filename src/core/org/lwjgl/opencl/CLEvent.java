/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.APIUtil;

import java.nio.ByteBuffer;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CLUtil.*;

/** This class is a wrapper around a cl_event pointer. */
public class CLEvent extends CLObjectChild<CLContext> {

	private CLEvent(long pointer, CLContext context) {
		super(pointer, context);
	}

	public static CLEvent create(long cl_event, CLContext context) {
		if ( cl_event == 0L )
			return null;

		return new CLEvent(cl_event, context);
	}

	public int getInfoInt(int param_name) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = clGetEventInfo(this, param_name, 4, __buffer.buffer(), (ByteBuffer)null);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.intValue(0);
	}

}
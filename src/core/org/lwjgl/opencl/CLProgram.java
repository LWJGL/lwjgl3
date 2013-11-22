/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_program pointer. */
public class CLProgram extends CLObjectChild<CLContext> {

	private CLProgram(long pointer, CLContext context) {
		super(pointer, context);
	}

	public static CLProgram create(long cl_program, CLContext context) {
		if ( cl_program == NULL )
			return null;

		return new CLProgram(cl_program, context);
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetProgramInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.GetProgramInfo);
	}

	private int getBuildInfo(CLDevice device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetProgramBuildInfo(getPointer(),
		                              device.getPointer(),
		                              param_name,
		                              param_value_size,
		                              param_value,
		                              param_value_size_ret,
		                              getCapabilities().__CL10.GetProgramBuildInfo);
	}

	public int getBuildInfoInt(CLDevice device, int param_name) {
		APIBuffer __buffer = apiBuffer();
		int errcode = getBuildInfo(device, param_name, 4L, __buffer.address(), NULL);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.intValue(0);
	}

	public String getBuildInfoString(CLDevice device, int param_name) {
		APIBuffer __buffer = apiBuffer();

		// Get string length
		int errcode = getBuildInfo(device, param_name, 0L, NULL, __buffer.address());
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);

		int bytes = __buffer.intValue(0);
		__buffer.bufferParam(bytes);

		// Get string
		errcode = getBuildInfo(device, param_name, bytes, __buffer.address(), NULL);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);

		return __buffer.stringValueUTF8(0, bytes - 1); // all OpenCL char[] parameters are null-terminated
	}

}
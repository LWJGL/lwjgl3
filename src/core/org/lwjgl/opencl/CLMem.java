/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.APIUtil;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CLUtil.*;

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

	public int getInfoInt(int param_name) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = clGetMemObjectInfo(this, param_name, 4, __buffer.buffer(), (ByteBuffer)null);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.intValue(0);
	}

	public long getInfoLong(int param_name) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = clGetMemObjectInfo(this, param_name, 8, __buffer.buffer(), (ByteBuffer)null);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.longValue(0);
	}

	public long getInfoPointer(int param_name) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = clGetMemObjectInfo(this, param_name, POINTER_SIZE, __buffer.buffer(), (ByteBuffer)null);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.pointerValue(0);
	}

}
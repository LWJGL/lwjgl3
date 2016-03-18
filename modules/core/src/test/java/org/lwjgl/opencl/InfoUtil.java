/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** OpenCL object info utilities. */
public final class InfoUtil {

	private InfoUtil() {
	}

	public static String getPlatformInfoStringASCII(long cl_platform_id, int param_name) {
		MemoryStack stack = stackPush();
		try {
			PointerBuffer pp = stack.mallocPointer(1);
			checkCLError(clGetPlatformInfo(cl_platform_id, param_name, (ByteBuffer)null, pp));
			int bytes = (int)pp.get(0);

			ByteBuffer buffer = stack.malloc(bytes);
			checkCLError(clGetPlatformInfo(cl_platform_id, param_name, buffer, null));

			return memDecodeASCII(buffer, bytes - 1);
		} finally {
			stack.pop();
		}
	}

	public static String getPlatformInfoStringUTF8(long cl_platform_id, int param_name) {
		MemoryStack stack = stackPush();
		try {
			PointerBuffer pp = stack.mallocPointer(1);
			checkCLError(clGetPlatformInfo(cl_platform_id, param_name, (ByteBuffer)null, pp));
			int bytes = (int)pp.get(0);

			ByteBuffer buffer = stack.malloc(bytes);
			checkCLError(clGetPlatformInfo(cl_platform_id, param_name, buffer, null));

			return memDecodeUTF8(buffer, bytes - 1);
		} finally {
			stack.pop();
		}
	}

	public static int getDeviceInfoInt(long cl_device_id, int param_name) {
		MemoryStack stack = stackPush();
		try {
			IntBuffer pl = stack.mallocInt(1);
			checkCLError(clGetDeviceInfo(cl_device_id, param_name, pl, null));
			return pl.get(0);
		} finally {
			stack.pop();
		}
	}

	public static long getDeviceInfoLong(long cl_device_id, int param_name) {
		MemoryStack stack = stackPush();
		try {
			LongBuffer pl = stack.mallocLong(1);
			checkCLError(clGetDeviceInfo(cl_device_id, param_name, pl, null));
			return pl.get(0);
		} finally {
			stack.pop();
		}
	}

	public static long getDeviceInfoPointer(long cl_device_id, int param_name) {
		MemoryStack stack = stackPush();
		try {
			PointerBuffer pp = stack.mallocPointer(1);
			checkCLError(clGetDeviceInfo(cl_device_id, param_name, pp, null));
			return pp.get(0);
		} finally {
			stack.pop();
		}
	}

	public static String getDeviceInfoStringUTF8(long cl_device_id, int param_name) {
		MemoryStack stack = stackPush();
		try {
			PointerBuffer pp = stack.mallocPointer(1);
			checkCLError(clGetDeviceInfo(cl_device_id, param_name, (ByteBuffer)null, pp));
			int bytes = (int)pp.get(0);

			ByteBuffer buffer = stack.malloc(bytes);
			checkCLError(clGetDeviceInfo(cl_device_id, param_name, buffer, null));

			return memDecodeUTF8(buffer, bytes - 1);
		} finally {
			stack.pop();
		}
	}

	public static long getMemObjectInfoPointer(long cl_mem, int param_name) {
		MemoryStack stack = stackPush();
		try {
			PointerBuffer pp = stack.mallocPointer(1);
			checkCLError(clGetMemObjectInfo(cl_mem, param_name, pp, null));
			return pp.get(0);
		} finally {
			stack.pop();
		}
	}

	public static long getMemObjectInfoInt(long cl_mem, int param_name) {
		MemoryStack stack = stackPush();
		try {
			IntBuffer pi = stack.mallocInt(1);
			checkCLError(clGetMemObjectInfo(cl_mem, param_name, pi, null));
			return pi.get(0);
		} finally {
			stack.pop();
		}
	}

	public static int getProgramBuildInfoInt(long cl_program_id, long cl_device_id, int param_name) {
		MemoryStack stack = stackPush();
		try {
			IntBuffer pl = stack.mallocInt(1);
			checkCLError(clGetProgramBuildInfo(cl_program_id, cl_device_id, param_name, pl, null));
			return pl.get(0);
		} finally {
			stack.pop();
		}
	}

	public static String getProgramBuildInfoStringASCII(long cl_program_id, long cl_device_id, int param_name) {
		MemoryStack stack = stackPush();
		try {
			PointerBuffer pp = stack.mallocPointer(1);
			checkCLError(clGetProgramBuildInfo(cl_program_id, cl_device_id, param_name, (ByteBuffer)null, pp));
			int bytes = (int)pp.get(0);

			ByteBuffer buffer = stack.malloc(bytes);
			checkCLError(clGetProgramBuildInfo(cl_program_id, cl_device_id, param_name, buffer, null));

			return memDecodeASCII(buffer, bytes - 1);
		} finally {
			stack.pop();
		}
	}

}
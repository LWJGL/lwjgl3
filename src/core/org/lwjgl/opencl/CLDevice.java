/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Integer.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_device_id pointer. */
public class CLDevice extends CLObjectChild<CLPlatform> {

	private final CLCapabilities capabilities;

	private CLDevice(long cl_device_id, CLPlatform platform) {
		super(cl_device_id, platform);

		capabilities = createCapabilities(cl_device_id, platform);
	}

	public static CLDevice create(long cl_device_id, CLPlatform platform) {
		if ( cl_device_id == NULL )
			return null;

		return new CLDevice(cl_device_id, platform);
	}

	private static CLCapabilities createCapabilities(long cl_device_id, CLPlatform platform) {
		long clGetDeviceInfo = CL10.getInstance().GetDeviceInfo;

		Set<String> supportedExtensions = new HashSet<>(32);

		// Parse DEVICE_EXTENSIONS string
		String extensionsString = getDeviceInfo(cl_device_id, CL_DEVICE_EXTENSIONS, clGetDeviceInfo);
		CL.addExtensions(extensionsString, supportedExtensions);

		// Parse DEVICE_VERSION string
		String version = getDeviceInfo(cl_device_id, CL_DEVICE_VERSION, clGetDeviceInfo);
		int majorVersion;
		int minorVersion;
		try {
			StringTokenizer tokenizer = new StringTokenizer(version.substring(7), ". ");

			majorVersion = parseInt(tokenizer.nextToken());
			minorVersion = parseInt(tokenizer.nextToken());
		} catch (Exception e) {
			throw new OpenCLException("The device major and/or minor OpenCL version \"" + version + "\" is malformed: " + e.getMessage());
		}
		CL.addCLVersions(majorVersion, minorVersion, supportedExtensions);

		return new CLCapabilities(majorVersion, minorVersion, supportedExtensions, platform.getCapabilities());
	}

	static String getDeviceInfo(long device_id, int param_name, long clGetDeviceInfo) {
		APIBuffer __buffer = apiBuffer();

		__buffer.intParam(0);
		int errcode = nclGetDeviceInfo(device_id, param_name, 0L, NULL, __buffer.address(), clGetDeviceInfo);
		if ( LWJGLUtil.DEBUG && errcode != CL_SUCCESS )
			throw new OpenCLException("Failed to query size of OpenCL device information.");

		int bytes = __buffer.intValue(0);

		__buffer.bufferParam(bytes);
		errcode = nclGetDeviceInfo(device_id, param_name, bytes, __buffer.address(), NULL, clGetDeviceInfo);
		if ( LWJGLUtil.DEBUG && errcode != CL_SUCCESS )
			throw new OpenCLException("Failed to query OpenCL device information.");

		return __buffer.stringValueASCII(0, bytes - 1);
	}

	public CLCapabilities getCapabilities() {
		return capabilities;
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetDeviceInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, CL10.getInstance().GetDeviceInfo);
	}

}
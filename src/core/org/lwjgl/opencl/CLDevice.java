/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.opencl.CLUtil.*;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.APIUtil;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Integer.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CLUtil.*;

/** This class is a wrapper around a cl_device_id pointer. */
public class CLDevice extends CLObjectChild<CLPlatform> {

	private final CLCapabilities capabilities;

	private CLDevice(long cl_device_id, CLPlatform platform) {
		super(cl_device_id, platform);

		capabilities = createCapabilities(cl_device_id, platform);
	}

	public static CLDevice create(long cl_device_id, CLPlatform platform) {
		if ( cl_device_id == 0L )
			return null;

		return new CLDevice(cl_device_id, platform);
	}

	private static CLCapabilities createCapabilities(long cl_device_id, CLPlatform platform) {
		long clGetDeviceInfo = CL10.getInstance(platform).clGetDeviceInfo;

		Set<String> supportedExtensions = new HashSet<String>(32);

		// Parse DEVICE_EXTENSIONS string
		String extensionsString = CL.getDeviceInfo(cl_device_id, CL_DEVICE_EXTENSIONS, clGetDeviceInfo);
		CL.addExtensions(extensionsString, supportedExtensions);

		// Parse DEVICE_VERSION string
		String version = CL.getDeviceInfo(cl_device_id, CL_DEVICE_VERSION, clGetDeviceInfo);
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

		return new CLCapabilities(majorVersion, minorVersion, supportedExtensions, platform);
	}

	private static final StringInfoProvider<CLDevice> stringInfoProvider = new StringInfoProvider<CLDevice>() {
		public int getInfo(CLDevice device, int param_name, long param_value_size, ByteBuffer param_value, ByteBuffer param_value_size_ret) {
			return clGetDeviceInfo(device, param_name, param_value_size, param_value, param_value_size_ret);
		}
	};

	public CLCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Returns the String value of the specified parameter.
	 *
	 * @param param_name the parameter
	 *
	 * @return the parameter value
	 */
	public String getInfoString(int param_name) {
		return CLUtil.getInfoStringUTF8(this, param_name, stringInfoProvider);
	}

	public boolean getInfoBoolean(int param_name) {
		return getInfoInt(param_name) != 0;
	}

	public int getInfoInt(int param_name) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = clGetDeviceInfo(this, param_name, 4, __buffer.buffer(), (ByteBuffer)null);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.intValue(0);
	}

	public long getInfoLong(int param_name) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = clGetDeviceInfo(this, param_name, 8, __buffer.buffer(), (ByteBuffer)null);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.longValue(0);
	}

	public long getInfoSize(int param_name) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = clGetDeviceInfo(this, param_name, POINTER_SIZE, __buffer.buffer(), (ByteBuffer)null);
		if ( LWJGLUtil.DEBUG )
			checkCLError(errcode);
		return __buffer.pointerValue(0);
	}

}
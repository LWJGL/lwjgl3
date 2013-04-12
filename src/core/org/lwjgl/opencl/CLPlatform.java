/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.FastLongMap;
import org.lwjgl.system.FunctionProvider;

import java.util.ArrayList;
import java.util.List;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_platform_id pointer. */
public class CLPlatform extends CLObject {

	private static final FastLongMap<CLPlatform> platforms = new FastLongMap<CLPlatform>();

	private CLCapabilities capabilities;

	private CLPlatform(long pointer) {
		super(pointer);

		capabilities = CL.createCapabilities(pointer);
	}

	public static CLPlatform create(long id) {
		CLPlatform platform = new CLPlatform(id);
		platforms.put(id, platform);
		return platform;
	}

	@Override
	public CLCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Returns a CLPlatform with the specified id.
	 *
	 * @param cl_platform_id the platform object id
	 *
	 * @return the CLPlatform object
	 */
	public static CLPlatform get(long cl_platform_id) { return platforms.get(cl_platform_id); }

	/**
	 * Returns a list of all the available platforms.
	 *
	 * @return the available platforms
	 */
	public static List<CLPlatform> getPlatforms() {
		return getPlatforms(null);
	}

	/**
	 * Returns a list of the available platforms, filtered by the specified filter.
	 *
	 * @param filter the platform filter
	 *
	 * @return the available platforms
	 */
	public static List<CLPlatform> getPlatforms(Filter<CLPlatform> filter) {
		FunctionProvider functionProvider = CL.getFunctionProvider();

		long clGetPlatformIDs = functionProvider.getFunctionAddress("clGetPlatformIDs");
		if ( clGetPlatformIDs == NULL )
			throw new OpenCLException("A core OpenCL function could not be found. Make sure that OpenCL has been loaded.");

		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = nclGetPlatformIDs(0, NULL, __buffer.address(), clGetPlatformIDs);
		checkCLError(errcode);

		int num_platforms = __buffer.intValue(0);
		if ( num_platforms == 0 )
			return null;

		__buffer.bufferParam(num_platforms << POINTER_SHIFT);

		errcode = nclGetPlatformIDs(num_platforms, __buffer.address(), NULL, clGetPlatformIDs);
		checkCLError(errcode);

		long[] platformIDs = new long[num_platforms];
		for ( int i = 0; i < num_platforms; i++ )
			platformIDs[i] = __buffer.pointerValue(i << POINTER_SHIFT);

		List<CLPlatform> platforms = new ArrayList<CLPlatform>(num_platforms);
		for ( int i = 0; i < num_platforms; i++ ) {
			CLPlatform platform = create(platformIDs[i]);
			if ( filter == null || filter.accept(platform) )
				platforms.add(platform);
		}

		return platforms;
	}

	@Override
	protected int getInfo(long pointer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
		return nclGetPlatformInfo(pointer, param_name, param_value_size, param_value, param_value_size_ret, getCapabilities().__CL10.clGetPlatformInfo);
	}

	/**
	 * Returns a list of the available devices on this platform that
	 * match the specified type.
	 *
	 * @param device_type the device type
	 *
	 * @return the available devices
	 */
	public List<CLDevice> getDevices(int device_type) {
		return getDevices(device_type, null);
	}

	/**
	 * Returns a list of the available devices on this platform that
	 * match the specified type, filtered by the specified filter.
	 *
	 * @param device_type the device type
	 * @param filter      the device filter
	 *
	 * @return the available devices
	 */
	public List<CLDevice> getDevices(int device_type, Filter<CLDevice> filter) {
		APIBuffer __buffer = APIUtil.apiBuffer();
		int errcode = clGetDeviceIDs(this, device_type, 0, null, __buffer.buffer());
		checkCLError(errcode);

		int num_devices = __buffer.intValue(0);
		if ( num_devices == 0 )
			return null;

		__buffer.bufferParam(num_devices << POINTER_SHIFT);

		errcode = clGetDeviceIDs(this, device_type, num_devices, __buffer.buffer(), null);
		checkCLError(errcode);

		long[] deviceIDs = new long[num_devices];
		for ( int i = 0; i < num_devices; i++ )
			deviceIDs[i] = __buffer.pointerValue(i << POINTER_SHIFT);

		List<CLDevice> devices = new ArrayList<CLDevice>(num_devices);
		for ( int i = 0; i < num_devices; i++ ) {
			CLDevice device = CLDevice.create(deviceIDs[i], this);
			if ( filter == null || filter.accept(device) )
				devices.add(device);
		}

		return devices.isEmpty() ? null : devices;
	}

	// -- [ INTERNAL ] --

	static void destroy() {
		platforms.clear();
	}

}
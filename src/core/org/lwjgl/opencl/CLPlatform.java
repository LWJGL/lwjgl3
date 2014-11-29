/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.PointerWrapper;

import java.util.*;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CLUtil.*;
import static org.lwjgl.opencl.Info.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper around a cl_platform_id pointer. */
public class CLPlatform extends PointerWrapper {

	private final CLCapabilities capabilities;

	public CLPlatform(long cl_platform_id) {
		super(cl_platform_id);

		this.capabilities = createCapabilities(cl_platform_id);
	}

	/** Returns the {@link CLCapabilities} instance associated with this OpenCL platform. */
	public CLCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Creates a {@link CLCapabilities} instance for the specified OpenCL platform.
	 * <p/>
	 * This method call is relatively expensive. The result should be cached and reused.
	 *
	 * @param cl_platform_id the platform to query
	 *
	 * @return the {@link CLCapabilities instance}
	 */
	public static CLCapabilities createCapabilities(long cl_platform_id) {
		Set<String> supportedExtensions = new HashSet<String>(32);

		// Parse PLATFORM_EXTENSIONS string
		String extensionsString = clGetPlatformInfoStringASCII(cl_platform_id, CL_PLATFORM_EXTENSIONS);
		CL.addExtensions(extensionsString, supportedExtensions);

		// Enumerate devices
		{
			APIBuffer __buffer = apiBuffer();

			int errcode = nclGetDeviceIDs(cl_platform_id, CL_DEVICE_TYPE_ALL, 0, NULL, __buffer.address());
			if ( LWJGLUtil.DEBUG && errcode != CL_SUCCESS )
				throw new OpenCLException("Failed to query number of OpenCL platform devices.");

			int num_devices = __buffer.intValue(0);
			if ( num_devices == 0 )
				return null;

			__buffer.bufferParam(num_devices << POINTER_SHIFT);

			errcode = nclGetDeviceIDs(cl_platform_id, CL_DEVICE_TYPE_ALL, num_devices, __buffer.address(), NULL);
			if ( LWJGLUtil.DEBUG && errcode != CL_SUCCESS )
				throw new OpenCLException("Failed to query OpenCL platform devices.");

			long[] devices = new long[num_devices];
			for ( int i = 0; i < num_devices; i++ )
				devices[i] = __buffer.pointerValue(i << POINTER_SHIFT);

			// Add device extensions to the set
			for ( int i = 0; i < num_devices; i++ ) {
				extensionsString = clGetDeviceInfoStringASCII(devices[i], CL_DEVICE_EXTENSIONS);
				CL.addExtensions(extensionsString, supportedExtensions);
			}
		}

		// Parse PLATFORM_VERSION string
		APIVersion version = apiParseVersion(clGetPlatformInfoStringASCII(cl_platform_id, CL_PLATFORM_VERSION), "OpenCL");
		CL.addCLVersions(version.major, version.minor, supportedExtensions);

		return new CLCapabilities(version.major, version.minor, supportedExtensions, CL.getICD());
	}

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
		long clGetPlatformIDs = CL10.getInstance().GetPlatformIDs;

		APIBuffer __buffer = apiBuffer();
		int errcode = nclGetPlatformIDs(0, NULL, __buffer.address(), clGetPlatformIDs);
		checkCLError(errcode);

		int num_platforms = __buffer.intValue(0);
		if ( num_platforms == 0 )
			return Collections.emptyList();

		__buffer.bufferParam(num_platforms << POINTER_SHIFT);

		errcode = nclGetPlatformIDs(num_platforms, __buffer.address(), NULL, clGetPlatformIDs);
		checkCLError(errcode);

		long[] platformIDs = new long[num_platforms];
		for ( int i = 0; i < num_platforms; i++ )
			platformIDs[i] = __buffer.pointerValue(i << POINTER_SHIFT);

		return filterObjects(platformIDs, filter, new Factory<CLPlatform>() {
			@Override
			public CLPlatform create(long object_id) {
				return new CLPlatform(object_id);
			}
		});
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
		APIBuffer __buffer = apiBuffer();
		int errcode = clGetDeviceIDs(getPointer(), device_type, 0, null, __buffer.buffer());
		checkCLError(errcode);

		int num_devices = __buffer.intValue(0);
		if ( num_devices == 0 )
			return Collections.emptyList();

		__buffer.bufferParam(num_devices << POINTER_SHIFT);

		errcode = clGetDeviceIDs(getPointer(), device_type, num_devices, __buffer.buffer(), null);
		checkCLError(errcode);

		long[] deviceIDs = new long[num_devices];
		for ( int i = 0; i < num_devices; i++ )
			deviceIDs[i] = __buffer.pointerValue(i << POINTER_SHIFT);

		return filterObjects(deviceIDs, filter, new Factory<CLDevice>() {
			@Override
			public CLDevice create(long object_id) {
				return new CLDevice(object_id, getCapabilities());
			}
		});
	}

	private static <T> List<T> filterObjects(long[] objects, Filter<T> filter, Factory<T> factory) {
		ArrayList<T> list = new ArrayList<T>(objects.length);
		for ( int i = 0; i < objects.length; i++ ) {
			T object = factory.create(objects[i]);
			if ( filter == null || filter.accept(object) )
				list.add(object);
		}

		if ( list.size() < objects.length )
			list.trimToSize();

		return list;
	}

	/** Simple filter interface. */
	public interface Filter<T> {

		/**
		 * Returns true if the specified object passes the filter.
		 *
		 * @param object the object to test
		 *
		 * @return true if the object is accepted
		 */
		boolean accept(T object);

	}

	private interface Factory<T> {
		T create(long object_id);
	}

}
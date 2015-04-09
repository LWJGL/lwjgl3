/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.PointerWrapper;

import java.util.HashSet;
import java.util.Set;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.Info.*;
import static org.lwjgl.system.APIUtil.*;

/** This class is a wrapper around a cl_device_id pointer. */
public class CLDevice extends PointerWrapper {

	private final CLCapabilities capabilities;

	public CLDevice(long cl_device_id, CLPlatform platform) {
		this(cl_device_id, platform.getCapabilities());

		if ( LWJGLUtil.DEBUG && clGetDeviceInfoPointer(cl_device_id, CL_DEVICE_PLATFORM) != platform.getPointer() )
			throw new IllegalArgumentException("The specified device does not belong to the specified platform.");
	}

	public CLDevice(long cl_device_id, CLCapabilities platformCapabilities) {
		super(cl_device_id);

		this.capabilities = createCapabilities(cl_device_id, platformCapabilities);
	}

	/** Returns the {@link CLCapabilities} instance associated with this OpenCL device. */
	public CLCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Creates a {@link CLCapabilities} instance for the specified OpenCL device.
	 * <p/>
	 * This method call is relatively expensive. The result should be cached and reused.
	 *
	 * @param cl_device_id the device to query
	 *
	 * @return the {@link CLCapabilities instance}
	 */
	public static CLCapabilities createCapabilities(long cl_device_id, CLCapabilities platformCapabilities) {
		Set<String> supportedExtensions = new HashSet<String>(32);

		// Parse DEVICE_EXTENSIONS string
		String extensionsString = clGetDeviceInfoStringASCII(cl_device_id, CL_DEVICE_EXTENSIONS);
		CL.addExtensions(extensionsString, supportedExtensions);

		// Parse DEVICE_VERSION string
		APIVersion version = apiParseVersion(clGetDeviceInfoStringASCII(cl_device_id, CL_DEVICE_VERSION), "OpenCL");
		CL.addCLVersions(version.major, version.minor, supportedExtensions);

		return new CLCapabilities(version.major, version.minor, supportedExtensions, platformCapabilities);
	}

}
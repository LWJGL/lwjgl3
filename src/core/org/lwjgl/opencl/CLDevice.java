/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.PointerWrapper;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Integer.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.Info.*;

/** This class is a wrapper around a cl_device_id pointer. */
public class CLDevice extends PointerWrapper {

	private final CLCapabilities capabilities;

	public CLDevice(long cl_device_id, CLPlatform platform) {
		this(cl_device_id, platform.getCapabilities());

		if ( LWJGLUtil.DEBUG && clGetDeviceInfoPointer(cl_device_id, CL_DEVICE_PLATFORM) != platform.getPointer() )
			throw new IllegalArgumentException("The given device does not belong to the given platform.");
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
	 * Creates a {@link CLCapabilities} instance for the given OpenCL device.
	 * <p/>
	 * This method call is relatively expensive. The result should be cached and reused.
	 *
	 * @param cl_device_id the device to query
	 *
	 * @return the {@link CLCapabilities instance}
	 */
	public static CLCapabilities createCapabilities(long cl_device_id, CLCapabilities platformCapabilities) {
		Set<String> supportedExtensions = new HashSet<>(32);

		// Parse DEVICE_EXTENSIONS string
		String extensionsString = clGetDeviceInfoStringASCII(cl_device_id, CL_DEVICE_EXTENSIONS);
		CL.addExtensions(extensionsString, supportedExtensions);

		// Parse DEVICE_VERSION string
		String version = clGetDeviceInfoStringASCII(cl_device_id, CL_DEVICE_VERSION);
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

		return new CLCapabilities(majorVersion, minorVersion, supportedExtensions, platformCapabilities);
	}

}
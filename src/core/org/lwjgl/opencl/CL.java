/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.DynamicLinkLibrary;
import org.lwjgl.system.FunctionMap;
import org.lwjgl.system.FunctionProviderLocal;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Integer.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CL12.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/*
	TODO:

	- Split core caps and extension caps.
		* We can store the core caps in a static instance. (worth it?)

	- Allow for OpenCL library name override with a -D param.
		* Allows to skip the extra ICD indirection.
		* In the future, provide a means to enumarate the OpenCL dlls (see the KHR_Icd extension for per-platform details)
		* clGetExtensionFunctionAddressForPlatform should be optional when we skip the ICD (not exposed on current AMD drivers, maybe others too?).

	- Fix callbacks.
	- Finish the CL public API.
*/
public final class CL {

	private static FunctionProviderLocal functionProvider;

	private CL() {}

	public static void create() {
		// TODO: document this property
		create(System.getProperty("org.lwjgl.opencl.libname", null));
	}

	public static void create(String libNameOverride) {
		if ( functionProvider != null )
			throw new IllegalStateException("CL has already been created.");

		final String libName;

		if ( libNameOverride == null ) {
			switch ( LWJGLUtil.getPlatform() ) {
				case WINDOWS:
					libName = "OpenCL.dll";
					break;
				case LINUX:
					libName = BITS64 ? "libOpenCL64.so" : "libOpenCL.so";
					break;
				case MACOSX:
					libName = "OpenCL.dylib";
					break;
				default:
					throw new IllegalStateException();
			}
		} else
			libName = libNameOverride;

		functionProvider = new FunctionProviderLocal() {

			private final DynamicLinkLibrary OPENCL = apiCreateLibrary(libName);

			private final long clGetExtensionFunctionAddress;
			private final long clGetExtensionFunctionAddressForPlatform;

			{
				clGetExtensionFunctionAddress = OPENCL.getFunctionAddress("clGetExtensionFunctionAddress");
				clGetExtensionFunctionAddressForPlatform = OPENCL.getFunctionAddress("clGetExtensionFunctionAddressForPlatform");
				if ( clGetExtensionFunctionAddress == NULL && clGetExtensionFunctionAddressForPlatform == NULL ) {
					OPENCL.destroy();
					throw new OpenCLException("A core OpenCL function is missing. Make sure that OpenCL is available.");
				}

				//System.out.println("clGetExtensionFunctionAddress = " + clGetExtensionFunctionAddress);
				//System.out.println("clGetExtensionFunctionAddressForPlatform = " + clGetExtensionFunctionAddressForPlatform);
			}

			@Override
			public long getFunctionAddress(String functionName) {
				long address = OPENCL.getFunctionAddress(functionName);
				if ( address == NULL )
					LWJGLUtil.log("Failed to locate address for CL platform function " + functionName);

				return address;
			}

			@Override
			public long getFunctionAddress(long handle, String functionName) {
				ByteBuffer nameBuffer = memEncodeASCII(functionName);
				long address =
					clGetExtensionFunctionAddressForPlatform != NULL ?
					nclGetExtensionFunctionAddressForPlatform(handle, memAddress(nameBuffer), clGetExtensionFunctionAddressForPlatform) :
					nclGetExtensionFunctionAddress(memAddress(nameBuffer), clGetExtensionFunctionAddress);

				if ( address == NULL )
					LWJGLUtil.log("Failed to locate address for CL extension function " + functionName);

				return address;
			}

			@Override
			public void destroy() {
				OPENCL.destroy();
			}
		};
	}

	public static void destroy() {
		if ( functionProvider == null )
			return;

		CLPlatform.destroy();
		functionProvider.destroy();
		functionProvider = null;
	}

	public static FunctionProviderLocal getFunctionProvider() {
		return functionProvider;
	}

	/**
	 * Bootstrapping code that creates a {@link CLCapabilities} instance for an OpenCL platform.
	 *
	 * @return the capabilities instance
	 */
	public static CLCapabilities createCapabilities(long platform) {
		// We don't have a CLPlatformCapabilities when this method is called
		// so we have to use the native bindings directly.
		long clGetPlatformInfo = functionProvider.getFunctionAddress("clGetPlatformInfo");
		long clGetDeviceIDs = functionProvider.getFunctionAddress("clGetDeviceIDs");
		long clGetDeviceInfo = functionProvider.getFunctionAddress("clGetDeviceInfo");
		if ( LWJGLUtil.DEBUG && (clGetPlatformInfo == NULL || clGetDeviceIDs == NULL || clGetDeviceInfo == NULL) )
			throw new OpenCLException("A core OpenCL function is missing. Make sure that OpenCL is available.");

		Set<String> supportedExtensions = new HashSet<String>(32);

		// Parse PLATFORM_EXTENSIONS string
		String extensionsString = getPlatformInfo(platform, CL_PLATFORM_EXTENSIONS, clGetPlatformInfo);
		addExtensions(extensionsString, supportedExtensions);

		// Enumerate devices
		{
			APIBuffer __buffer = apiBuffer();
			int errcode = nclGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL, 0, NULL, __buffer.address(), clGetDeviceIDs);
			if ( LWJGLUtil.DEBUG && errcode != CL_SUCCESS )
				throw new OpenCLException("Failed to query number of OpenCL platform devices.");

			int num_devices = __buffer.intValue(0);
			if ( num_devices == 0 )
				return null;

			__buffer.bufferParam(num_devices << POINTER_SHIFT);

			errcode = nclGetDeviceIDs(platform, CL_DEVICE_TYPE_ALL, num_devices, __buffer.address(), NULL, clGetDeviceIDs);
			if ( LWJGLUtil.DEBUG && errcode != CL_SUCCESS )
				throw new OpenCLException("Failed to query OpenCL platform devices.");

			long[] devices = new long[num_devices];
			for ( int i = 0; i < num_devices; i++ )
				devices[i] = __buffer.pointerValue(i << POINTER_SHIFT);

			// Add device extensions to the set
			for ( int i = 0; i < num_devices; i++ ) {
				extensionsString = getDeviceInfo(devices[i], CL_DEVICE_EXTENSIONS, clGetDeviceInfo);
				addExtensions(extensionsString, supportedExtensions);
			}
		}

		// Parse PLATFORM_VERSION string
		String version = getPlatformInfo(platform, CL_PLATFORM_VERSION, clGetPlatformInfo);
		int majorVersion;
		int minorVersion;
		try {
			StringTokenizer tokenizer = new StringTokenizer(version.substring(7), ". ");

			majorVersion = parseInt(tokenizer.nextToken());
			minorVersion = parseInt(tokenizer.nextToken());
		} catch (Exception e) {
			throw new OpenCLException("The platform major and/or minor OpenCL version \"" + version + "\" is malformed: " + e.getMessage());
		}
		addCLVersions(majorVersion, minorVersion, supportedExtensions);

		return new CLCapabilities(platform, majorVersion, minorVersion, supportedExtensions);
	}

	static void addExtensions(String extensionsString, Set<String> supportedExtensions) {
		StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() )
			supportedExtensions.add(tokenizer.nextToken());
	}

	/** Must be called after addExtensions. */
	static void addCLVersions(int majorVersion, int minorVersion, Set<String> supportedExtensions) {
		// Detect OpenGL interop
		boolean interopGL = supportedExtensions.contains("cl_khr_gl_sharing") || supportedExtensions.contains("cl_apple_gl_sharing");

		supportedExtensions.add("OpenCL10");
		if ( interopGL )
			supportedExtensions.add("OpenCL10GL");

		// Detect post-1.0 functionality
		if ( 1 < majorVersion || 1 <= minorVersion ) supportedExtensions.add("OpenCL11");
		if ( 1 < majorVersion || 2 <= minorVersion ) {
			supportedExtensions.add("OpenCL12");
			if ( interopGL )
				supportedExtensions.add("OpenCL12GL");
		}
	}

	static String getPlatformInfo(long platform, int param_name, long clGetPlatformInfo) {
		APIBuffer __buffer = apiBuffer();

		__buffer.intValue(0, 0);
		int errcode = nclGetPlatformInfo(platform, param_name, 0L, NULL, __buffer.address(), clGetPlatformInfo);
		if ( LWJGLUtil.DEBUG && errcode != CL_SUCCESS )
			throw new OpenCLException("Failed to query size of OpenCL platform information.");

		int bytes = __buffer.intValue(0);

		__buffer.bufferParam(bytes);
		errcode = nclGetPlatformInfo(platform, param_name, bytes, __buffer.address(), NULL, clGetPlatformInfo);
		if ( LWJGLUtil.DEBUG && errcode != CL_SUCCESS )
			throw new OpenCLException("Failed to query OpenCL platform information.");

		return __buffer.stringValueASCII(0, bytes - 1);
	}

	static String getDeviceInfo(long device_id, int param_name, long clGetDeviceInfo) {
		APIBuffer __buffer = apiBuffer();

		__buffer.intValue(0, 0);
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

	static <T extends FunctionMap> T checkExtension(String extension, T functions, boolean supported) {
		if ( supported )
			return functions;
		else {
			LWJGLUtil.log("[CL] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Math.*;
import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class loads the OpenCL library (usually via the ICD loader) into the JVM process.
 *
 * <p>The {@link CLCapabilities} instance returned by {@link #getICD()} contains function pointers for all functionality present in the ICD. This may include
 * multiple platforms with very different capabilities. It should only be used if direct access to the ICD function pointers is required, for customization
 * purposes.</p>
 *
 * <p>Platform capabilities can be created with {@link CLPlatform#createCapabilities(long)}. For a more friendly way, call {@link CLPlatform#getPlatforms()},
 * iterate on the available platforms and call {@link CLPlatform#getCapabilities()}.</p>
 *
 * <p>Device capabilities can be created with {@link CLDevice#createCapabilities(long, CLCapabilities)}. For a more friendly way, call
 * {@link CLPlatform#getDevices(int)}, iterate on the available devices and call {@link CLDevice#getCapabilities()}.</p>
 */
public final class CL {

	private static FunctionProviderLocal functionProvider;

	private static CLCapabilities icd;

	static {
		if ( !Configuration.EXPLICIT_INIT_OPENCL.<Boolean>get() )
			create();
	}

	private CL() {}

	/** Loads the OpenCL native library, using the default library name. */
	public static void create() {
		SharedLibrary CL;
		switch ( Platform.get() ) {
			case LINUX:
			case WINDOWS:
				CL = Library.loadNative(Configuration.LIBRARY_NAME_OPENCL, "OpenCL");
				break;
			case MACOSX:
				CL = Library.loadNative(Configuration.LIBRARY_NAME_OPENCL, "OpenCL", "/System/Library/Frameworks/OpenCL.framework");
				break;
			default:
				throw new IllegalStateException();
		}
		create(CL);
	}

	/**
	 * Loads the OpenCL native library, using the specified library name.
	 *
	 * @param libName the native library name
	 */
	public static void create(String libName) {
		create(Library.loadNative(libName));
	}

	private static void create(final SharedLibrary OPENCL) {
		try {
			FunctionProviderLocal functionProvider = new FunctionProviderLocal() {

				private final long clGetExtensionFunctionAddress;
				private final long clGetExtensionFunctionAddressForPlatform;

				// NULL if multiple platforms are available.
				private final long platform;

				{
					clGetExtensionFunctionAddress = OPENCL.getFunctionAddress("clGetExtensionFunctionAddress");
					clGetExtensionFunctionAddressForPlatform = OPENCL.getFunctionAddress("clGetExtensionFunctionAddressForPlatform");
					if ( clGetExtensionFunctionAddress == NULL && clGetExtensionFunctionAddressForPlatform == NULL ) {
						OPENCL.free();
						throw new OpenCLException("A core OpenCL function is missing. Make sure that OpenCL is available.");
					}

					/*
					We'll use clGetExtensionFunctionAddress, even if it has been deprecated, because clGetExtensionFunctionAddressForPlatform is pointless
					when the ICD is used. clGetExtensionFunctionAddressForPlatform will be used only if there is just 1 platform available and that platform
					supports OpenCL 1.2 or higher.
					*/
					long platform = NULL;
					if ( clGetExtensionFunctionAddressForPlatform != NULL ) {
						long clGetPlatformIDs = OPENCL.getFunctionAddress("clGetPlatformIDs");
						if ( clGetPlatformIDs == NULL )
							throw new OpenCLException("A core OpenCL function is missing. Make sure that OpenCL is available.");

						APIBuffer __buffer = apiBuffer();
						callIPPI(clGetPlatformIDs, 0, NULL, __buffer.address());

						int platforms = __buffer.intValue(0);

						if ( platforms == 1 ) {
							callIPPI(clGetPlatformIDs, 1, __buffer.address(), NULL);
							long cl_platform_id = __buffer.pointerValue(0);
							if ( supportsOpenCL12(__buffer, cl_platform_id) )
								platform = cl_platform_id;
						} else if ( clGetExtensionFunctionAddress == NULL )
							throw new IllegalStateException();
					}
					this.platform = platform;
				}

				private boolean supportsOpenCL12(APIBuffer __buffer, long platform) {
					long clGetPlatformInfo = OPENCL.getFunctionAddress("clGetPlatformInfo");
					if ( clGetPlatformInfo == NULL )
						return false;

					int errcode = callPIPPPI(clGetPlatformInfo, platform, CL_PLATFORM_VERSION, 0, NULL, __buffer.address());
					if ( errcode != CL_SUCCESS )
						return false;

					long bytes = __buffer.pointerValue(0);
					__buffer.bufferParam((int)bytes);

					errcode = callPIPPPI(clGetPlatformInfo, platform, CL_PLATFORM_VERSION, bytes, __buffer.address(), NULL);
					if ( errcode != CL_SUCCESS )
						return false;

					APIVersion version = apiParseVersion(__buffer.stringValueASCII(0, (int)bytes - 1), "OpenCL");
					return 1 < version.major || 2 <= version.minor;
				}

				@Override
				public long getFunctionAddress(CharSequence functionName) {
					APIBuffer __buffer = apiBuffer();
					__buffer.stringParamASCII(functionName, true);

					long address = platform == NULL
						? callPP(clGetExtensionFunctionAddress, __buffer.address())
						: callPPP(clGetExtensionFunctionAddressForPlatform, platform, __buffer.address());

					if ( address == NULL )
						address = OPENCL.getFunctionAddress(functionName);

					return address;
				}

				@Override
				public long getFunctionAddress(long handle, CharSequence functionName) {
					APIBuffer __buffer = apiBuffer();
					__buffer.stringParamASCII(functionName, true);

					return callPPP(clGetExtensionFunctionAddressForPlatform, handle, __buffer.address());
				}

				@Override
				public void free() {
					OPENCL.free();
				}
			};
			create(functionProvider);
		} catch (RuntimeException e) {
			OPENCL.free();
			throw e;
		}
	}

	/**
	 * Initializes OpenCL with the specified {@link FunctionProviderLocal}. This method can be used to implement custom OpenCL library loading.
	 *
	 * @param functionProvider the provider of OpenCL function addresses
	 */
	public static void create(FunctionProviderLocal functionProvider) {
		if ( CL.functionProvider != null )
			throw new IllegalStateException("OpenCL has already been created.");

		CL.functionProvider = functionProvider;

		icd = new CLCapabilities(functionProvider);
		if ( icd.__CL10 == null )
			throw new IllegalStateException("OpenCL 1.0 is missing. Make sure that OpenCL is available");
	}

	/** Unloads the OpenCL native library. */
	public static void destroy() {
		if ( functionProvider == null )
			return;

		functionProvider.free();
		functionProvider = null;
		icd = null;
	}

	/** Returns the {@link FunctionProviderLocal} for the OpenCL native library. */
	public static FunctionProviderLocal getFunctionProvider() {
		return functionProvider;
	}

	/** Returns the {@link CLCapabilities} of the ICD. */
	public static CLCapabilities getICD() { return icd; }

	static void addExtensions(String extensionsString, Set<String> supportedExtensions) {
		StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() )
			supportedExtensions.add(tokenizer.nextToken());
	}

	/** Must be called after addExtensions. */
	static void addCLVersions(int MAJOR, int MINOR, Set<String> supportedExtensions) {
		addCLVersions(
			MAJOR, MINOR, supportedExtensions, "",
			new int[][] {
				{ 0, 1, 2 },    // 10, 11, 12
				{ 0, 1 },       // 20, 21
			}
		);

		// Detect OpenGL interop
		if ( supportedExtensions.contains("cl_khr_gl_sharing") || supportedExtensions.contains("cl_APPLE_gl_sharing") )
			addCLVersions(
				MAJOR, MINOR, supportedExtensions, "GL",
				new int[][] {
					{ 0, 2 },    // 10GL, 12GL
					{}
				}
			);
	}

	private static void addCLVersions(int MAJOR, int MINOR, Set<String> supportedExtensions, String postfix, int[][] versions) {
		for ( int major = 1; major <= min(MAJOR, versions.length); major++ ) {
			for ( int minor : versions[major - 1] ) {
				if ( major == MAJOR && MINOR < minor )
					break;

				supportedExtensions.add(String.format("OpenCL%d%d%s", major, minor, postfix));
			}
		}
	}

	static <T> T checkExtension(Set<String> ext, String extension, T functions) {
		if ( ext.contains(extension) ) {
			if ( functions != null )
				return functions;

			apiLog("[CL] " + extension + " was reported as available but an entry point is missing.");
		}
		return null;
	}

}
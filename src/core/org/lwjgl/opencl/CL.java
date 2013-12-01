/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.LWJGLUtil.Platform;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.DynamicLinkLibrary;
import org.lwjgl.system.FunctionProviderLocal;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.StringTokenizer;

import static org.lwjgl.opencl.CL10.*;
import static org.lwjgl.opencl.CL12.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class CL {

	private static FunctionProviderLocal functionProvider;

	private static CLCapabilities icd;

	private CL() {}

	public static void create() {
		String libName = System.getProperty("org.lwjgl.opencl.libname", null);
		if ( libName == null ) {
			switch ( LWJGLUtil.getPlatform() ) {
				case WINDOWS:
					libName = "OpenCL.dll";
					break;
				case LINUX:
					libName = "libOpenCL.so";
					break;
				case MACOSX:
					libName = "OpenCL.dylib";
					break;
				default:
					throw new IllegalStateException();
			}
		}

		create(libName);
	}

	public static void create(final String libName) {
		if ( functionProvider != null )
			throw new IllegalStateException("CL has already been created.");

		functionProvider = new FunctionProviderLocal.Default() {

			private final DynamicLinkLibrary OPENCL;

			{
				DynamicLinkLibrary dll;
				try {
					dll = apiCreateLibrary(libName);
				} catch (Exception e) {
					if ( LWJGLUtil.getPlatform() == Platform.MACOSX )
						dll = apiCreateLibrary("/System/Library/Frameworks/OpenCL.framework");
					else
						throw new RuntimeException(e);
				}
				OPENCL = dll;
			}

			private final long clGetExtensionFunctionAddress;
			private final long clGetExtensionFunctionAddressForPlatform;

			// NULL if multiple platforms are available.
			private final long platform;

			{
				clGetExtensionFunctionAddress = OPENCL.getFunctionAddress("clGetExtensionFunctionAddress");
				clGetExtensionFunctionAddressForPlatform = OPENCL.getFunctionAddress("clGetExtensionFunctionAddressForPlatform");
				if ( clGetExtensionFunctionAddress == NULL && clGetExtensionFunctionAddressForPlatform == NULL ) {
					OPENCL.release();
					throw new OpenCLException("A core OpenCL function is missing. Make sure that OpenCL is available.");
				}

				// clGetExtensionFunctionAddress has been deprecated, but clGetExtensionFunctionAddressForPlatform is pointless when the ICD is used.
				// If there is only 1 platform available, try to use clGetExtensionFunctionAddressForPlatform instead.
				long platform = NULL;
				if ( clGetExtensionFunctionAddressForPlatform != NULL ) {
					long clGetPlatformIDs = OPENCL.getFunctionAddress("clGetPlatformIDs");
					if ( clGetPlatformIDs == NULL )
						throw new OpenCLException("A core OpenCL function is missing. Make sure that OpenCL is available.");

					APIBuffer __buffer = apiBuffer();
					nclGetPlatformIDs(0, NULL, __buffer.address(), clGetPlatformIDs);

					int platforms = __buffer.intValue(0);

					if ( platforms == 1 ) {
						nclGetPlatformIDs(1, __buffer.address(), NULL, clGetPlatformIDs);
						platform = __buffer.pointerValue(0);
					} else if ( clGetExtensionFunctionAddress == NULL )
						throw new IllegalStateException();
				}
				this.platform = platform;
			}

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				ByteBuffer nameBuffer = memEncodeASCII(functionName);

				long address =
					platform == NULL
					? nclGetExtensionFunctionAddress(memAddress(nameBuffer), clGetExtensionFunctionAddress)
					: nclGetExtensionFunctionAddressForPlatform(platform, memAddress(nameBuffer), clGetExtensionFunctionAddressForPlatform);

				if ( address == NULL )
					address = OPENCL.getFunctionAddress(functionName);

				return address;
			}

			@Override
			public long getFunctionAddress(long handle, CharSequence functionName) {
				ByteBuffer nameBuffer = memEncodeASCII(functionName);
				return nclGetExtensionFunctionAddressForPlatform(handle, memAddress(nameBuffer), clGetExtensionFunctionAddressForPlatform);
			}

			@Override
			protected void destroy() {
				OPENCL.release();
			}
		};

		icd = new CLCapabilities(functionProvider);
		if ( icd.__CL10 == null )
			throw new IllegalStateException("OpenCL 1.0 is missing. Make sure that OpenCL is available");
	}

	public static void destroy() {
		if ( functionProvider == null )
			return;

		functionProvider.release();
		functionProvider = null;
	}

	public static FunctionProviderLocal getFunctionProvider() {
		return functionProvider;
	}

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
				{ 0 },          // 20
			}
		);

		// Detect OpenGL interop
		if ( supportedExtensions.contains("cl_khr_gl_sharing") || supportedExtensions.contains("cl_APPLE_gl_sharing") )
			addCLVersions(
				MAJOR, MINOR, supportedExtensions, "GL",
				new int[][] {
					{ 0, 2 },    // 10GL, 12GL
					{ }
				}
			);
	}

	private static void addCLVersions(int MAJOR, int MINOR, Set<String> supportedExtensions, String postfix, int[][] versions) {
		for ( int major = 1; major <= versions.length; major++ ) {
			for ( int minor : versions[major - 1] ) {
				if ( major < MAJOR || (major == MAJOR && minor <= MINOR) )
					supportedExtensions.add(String.format("OpenCL%d%d%s", major, minor, postfix));
			}
		}
	}

	static <T> T checkExtension(Set<String> ext, String extension, T functions) {
		if ( ext.contains(extension) ) {
			if ( functions != null )
				return functions;

			LWJGLUtil.log("[CL] " + extension + " was reported as available but an entry point is missing.");
		}
		return null;
	}

}
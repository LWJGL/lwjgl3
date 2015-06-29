/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Pointer;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.DynamicLinkLibrary;
import org.lwjgl.system.FunctionProviderLocal;

import java.nio.ByteBuffer;
import java.util.*;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class ALC {

	private static FunctionProviderLocal functionProvider;

	static {
		if ( !Boolean.getBoolean("org.lwjgl.openal.explicitInit") )
			create();
	}

	private ALC() {}

	public static void create() {
		String libName;
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				libName = "OpenAL";
				break;
			case LINUX:
				libName = "openal";
				break;
			case MACOSX:
				libName = "openal";
				break;
			default:
				throw new IllegalStateException();
		}

		create(System.getProperty("org.lwjgl.openal.libname", Pointer.BITS64 ? libName : libName + "32"));
	}

	public static void create(String libName) {
		if ( functionProvider != null )
			throw new IllegalStateException("OpenAL has already been created.");

		final DynamicLinkLibrary OPENAL = LWJGLUtil.loadLibraryNative(libName);

		functionProvider = new FunctionProviderLocal.Default() {

			private final long alcGetProcAddress = getFunctionAddress("alcGetProcAddress");

			{
				if ( alcGetProcAddress == NULL ) {
					OPENAL.release();
					throw new RuntimeException("A core ALC function is missing. Make sure that OpenAL has been loaded.");
				}
			}

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				long address = OPENAL.getFunctionAddress(functionName);
				if ( address == NULL )
					LWJGLUtil.log("Failed to locate address for ALC function " + functionName);

				return address;
			}

			@Override
			public long getFunctionAddress(long handle, CharSequence functionName) {
				APIBuffer __buffer = apiBuffer();
				__buffer.stringParamASCII(functionName, true);

				long address = nalcGetProcAddress(handle, __buffer.address(), alcGetProcAddress);
				if ( address == NULL )
					LWJGLUtil.log("Failed to locate address for ALC extension function " + functionName);

				return address;
			}

			@Override
			protected void destroy() {
				OPENAL.release();
			}
		};

		AL.init();
	}

	public static void destroy() {
		if ( functionProvider == null )
			return;

		AL.destroy();

		functionProvider.release();
		functionProvider = null;
	}

	public static FunctionProviderLocal getFunctionProvider() {
		return functionProvider;
	}

	public static ALCCapabilities getCapabilities() {
		ALContext context = AL.getCurrentContext();
		if ( context != null )
			return context.getDevice().getCapabilities();

		return ALDevice.getLastDevice().getCapabilities();
	}

	// We could remove the method below if we add support for it in the code generator.
	// But this is the only occurance of this pattern, so not really worth it.

	/**
	 * Obtains string values from ALC. This is a custom implementation for those tokens that return a list of strings instead of a single string.
	 *
	 * @param deviceHandle the device to query
	 * @param token        the information to query. One of:<p/>{@link ALC11#ALC_ALL_DEVICES_SPECIFIER}, {@link ALC11#ALC_CAPTURE_DEVICE_SPECIFIER}
	 */
	public static List<String> getStringList(long deviceHandle, int token) {
		long __result = nalcGetString(deviceHandle, token);
		if ( __result == NULL )
			return null;

		ByteBuffer buffer = memByteBuffer(__result, Integer.MAX_VALUE);

		List<String> strings = new ArrayList<String>();

		int offset = 0;
		while ( true ) {
			if ( buffer.get() == 0 ) {
				int limit = buffer.position() - 1;
				if ( limit == offset ) // Previous char was also a \0 == end of list.
					break;

				// Prepare for decoding
				buffer.position(offset); // Start index
				buffer.limit(limit); // \0 index

				// Decode
				strings.add(memDecodeUTF8(buffer));

				// Reset
				buffer.limit(Integer.MAX_VALUE);
				buffer.position(offset = limit + 1); // index after \0
			}
		}

		return strings;
	}

	/**
	 * Bootstrapping code that creates the ALCCapabilities instance.
	 *
	 * @return the ALCCapabilities instance
	 */
	static ALCCapabilities createCapabilities(long device) {
		// We don't have an ALCCapabilities instance when this method is called
		// so we have to use the native bindings directly.
		long GetIntegerv = functionProvider.getFunctionAddress("alcGetIntegerv");
		long GetString = functionProvider.getFunctionAddress("alcGetString");
		long IsExtensionPresent = functionProvider.getFunctionAddress("alcIsExtensionPresent");

		if ( GetIntegerv == NULL || GetString == NULL || IsExtensionPresent == NULL )
			throw new IllegalStateException("Core ALC functions could not be found. Make sure that OpenAL has been loaded.");

		APIBuffer __buffer = apiBuffer();

		nalcGetIntegerv(device, ALC_MAJOR_VERSION, 1, __buffer.address(), GetIntegerv);
		nalcGetIntegerv(device, ALC_MINOR_VERSION, 1, __buffer.address(4), GetIntegerv);

		int majorVersion = __buffer.intValue(0);
		int minorVersion = __buffer.intValue(4);

		int[][] ALC_VERSIONS = {
			{ 0, 1 },  // ALC 1
		};

		Set<String> supportedExtensions = new HashSet<String>(16);

		for ( int major = 1; major <= ALC_VERSIONS.length; major++ ) {
			int[] minors = ALC_VERSIONS[major - 1];
			for ( int minor : minors ) {
				if ( major < majorVersion || (major == majorVersion && minor <= minorVersion) )
					supportedExtensions.add("OpenALC" + Integer.toString(major) + Integer.toString(minor));
			}
		}

		// Parse EXTENSIONS string
		String extensionsString = memDecodeUTF8(checkPointer(nalcGetString(device, ALC_EXTENSIONS, GetString)));

		StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() ) {
			String extName = tokenizer.nextToken();
			__buffer.reset().stringParamASCII(extName, true);
			if ( nalcIsExtensionPresent(device, __buffer.address(), IsExtensionPresent) )
				supportedExtensions.add(extName);
		}

		return new ALCCapabilities(getFunctionProvider(), device, supportedExtensions);
	}

	static <T> T checkExtension(String extension, T functions, boolean supported) {
		if ( supported )
			return functions;
		else {
			LWJGLUtil.log("[ALC] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.FunctionMap;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.windows.WindowsLibrary;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.*;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;

public class ALC {

	static final FunctionProviderALC functionProvider;

	static {
		switch ( LWJGLUtil.getPlatform() ) {
			case LWJGLUtil.PLATFORM_WINDOWS:
				functionProvider = new FunctionProviderALC() {

					private final WindowsLibrary OPENAL;
					private final long alcGetProcAddress;

					{
						final String[] paths = LWJGLUtil.getLibraryPaths(
							"OpenAL32",
							PointerBuffer.is64Bit() ? "OpenAL64.dll" : "OpenAL32.dll",
							ALC.class.getClassLoader()
						);

						WindowsLibrary lib = null;
						for ( String path : paths ) {
							try {
								lib = new WindowsLibrary("OpenAL32.dll");
								break;
							} catch (Exception e) {
								LWJGLUtil.log("Failed to load " + path + ": " + e.getMessage());
							}
						}
						if ( lib == null )
							throw new RuntimeException("Failed to locate the OpenAL library");

						OPENAL = lib;

						// We'll use alcGetProcAddress for both core and extension entry points.
						// To do that, we need to first grab the alcGetProcAddress function from
						// the OpenAL native library.
						alcGetProcAddress = GetProcAddress(OPENAL.getHandle(), "alcGetProcAddress");
						if ( alcGetProcAddress == 0L ) {
							lib.destroy();
							throw new RuntimeException("A core ALC function is missing. Make sure that OpenAL has been loaded.");
						}
					}

					public long getFunctionAddress(final String functionName) {
						final ByteBuffer nameBuffer = memEncodeASCII(functionName);
						long address = nalcGetProcAddress(OPENAL.getHandle(), memAddress(nameBuffer), alcGetProcAddress);
						if ( address == 0L )
							address = getLibraryFunctionAddress(functionName);

						return address;
					}

					public long getLibraryFunctionAddress(final String functionName) {
						final long address = GetProcAddress(OPENAL.getHandle(), functionName);
						if ( LWJGLUtil.DEBUG && address == 0L )
							System.err.println("Failed to locate address for AL function " + functionName);

						return address;
					}
				};
				break;
			case LWJGLUtil.PLATFORM_LINUX:
			case LWJGLUtil.PLATFORM_MACOSX:
			default:
				throw new UnsupportedOperationException();
		}
	}

	private static ALCContext context;

	public ALC() {
	}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	/**
	 * Creates an ALCContext from the specified device. The device name may be null,
	 * in which case the default device will be used.
	 *
	 * @param deviceName the device to open
	 *
	 * @return the created ALCContext on the specified device
	 */
	public static ALCContext createALCContextFromDevice(final String deviceName) {
		final long alcOpenDevice = functionProvider.getFunctionAddress("alcOpenDevice");
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(alcOpenDevice);

		final ByteBuffer nameBuffer = deviceName == null ? null : memEncodeUTF8(deviceName);
		final long device = nalcOpenDevice(memAddressSafe(nameBuffer), alcOpenDevice);
		if ( device == 0L )
			throw new RuntimeException("Failed to open the device.");

		return new ALCContext(device);
	}

	static void setCurrent(final ALCContext context) {
		ALC.context = context;
	}

	public static ALCCapabilities getCapabilities() {
		return context.getCapabilities();
	}

	// We could remove the method below if we add support for it in the code generator.
	// But this is the only occurance of this pattern, so not really worth it.

	/**
	 * Obtains string values from ALC. This is a custom implementation for those tokens that return a list of strings instead of a single string.
	 *
	 * @param deviceHandle the device to query
	 * @param token        the information to query. One of:<p/>{@link ALC11#ALC_ALL_DEVICES_SPECIFIER}, {@link ALC11#ALC_CAPTURE_DEVICE_SPECIFIER}
	 */
	public static List<String> getStringList(final long deviceHandle, final int token) {
		final long alcGetString = functionProvider.getFunctionAddress("alcGetString");
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(alcGetString);

		final long __result = nalcGetString(deviceHandle, token, alcGetString);
		if ( __result == 0L )
			return null;

		final ByteBuffer buffer = memByteBuffer(__result, Integer.MAX_VALUE);

		final List<String> strings = new ArrayList<String>();

		int offset = 0;
		while ( true ) {
			if ( buffer.get() == 0 ) {
				final int limit = buffer.position() - 1;
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
	static ALCCapabilities createCapabilities(final long device) {
		// We don't have an ALCCapabilities instance when this method is called
		// so we have to use the native bindings directly.
		final long GetIntegerv = functionProvider.getFunctionAddress("alcGetIntegerv");
		final long GetString = functionProvider.getFunctionAddress("alcGetString");
		final long IsExtensionPresent = functionProvider.getFunctionAddress("alcIsExtensionPresent");

		if ( GetIntegerv == 0L || GetString == 0L || IsExtensionPresent == 0L )
			throw new IllegalStateException("Core ALC functions could not be found. Make sure that OpenAL has been loaded.");

		final IntBuffer versionBuffer = BufferUtils.createIntBuffer(2);

		nalcGetIntegerv(device, ALC_MAJOR_VERSION, 1, memAddress(versionBuffer), GetIntegerv);
		nalcGetIntegerv(device, ALC_MINOR_VERSION, 1, memAddress(versionBuffer) + 4, GetIntegerv);

		final int majorVersion = versionBuffer.get(0);
		final int minorVersion = versionBuffer.get(1);

		final int[][] ALC_VERSIONS = {
			{ 0, 1 },  // ALC 1
		};

		final Set<String> supportedExtensions = new LinkedHashSet<String>();

		for ( int major = 1; major <= ALC_VERSIONS.length; major++ ) {
			int[] minors = ALC_VERSIONS[major - 1];
			for ( int minor : minors ) {
				if ( major < majorVersion || (major == majorVersion && minor <= minorVersion) )
					supportedExtensions.add("OpenALC" + Integer.toString(major) + Integer.toString(minor));
			}
		}

		// Parse EXTENSIONS string
		final String extensionsString = memDecodeUTF8(memByteBufferNT1(checkPointer(nalcGetString(device, ALC_EXTENSIONS, GetString))));

		/*
		OpenALSoft: ALC_ENUMERATE_ALL_EXT ALC_ENUMERATION_EXT ALC_EXT_CAPTURE ALC_EXT_DEDICATED ALC_EXT_disconnect ALC_EXT_EFX ALC_EXT_thread_local_context ALC_SOFT_loopback
		Creative: ALC_ENUMERATE_ALL_EXT ALC_ENUMERATION_EXT ALC_EXT_CAPTURE ALC_EXT_EFX
		 */

		final StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() ) {
			final String extName = tokenizer.nextToken();
			final ByteBuffer nameBuffer = memEncodeASCII(extName);
			if ( nalcIsExtensionPresent(device, memAddress(nameBuffer), IsExtensionPresent) )
				supportedExtensions.add(extName);
		}

		return new ALCCapabilities(supportedExtensions);
	}

	static <T extends FunctionMap> T checkExtension(final String extension, final T functions, final boolean supported) {
		if ( supported )
			return functions;
		else {
			if ( LWJGLUtil.DEBUG )
				System.err.println("[ALC] " + extension + " was reported as available but an entry point is missing.");

			return null;
		}
	}

	/**
	 * Some OpenAL implementations will crash when alcGetProcAddress is called with
	 * an unsupported function name (instead of returning 0L). We extend FunctionProvider
	 * so that {@link AL} can grab a function pointer without going through ALC.
	 */
	interface FunctionProviderALC extends FunctionProvider {

		/**
		 * Returns a function pointer from the loaded OpenAL library, without
		 * calling alcGetProcAddress first.
		 *
		 * @param functionName the function name to query
		 *
		 * @return the function address or 0L
		 */
		long getLibraryFunctionAddress(String functionName);

	}

}
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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;

public class ALC {

	private static final FunctionProvider functionProvider;

	static {
		switch ( LWJGLUtil.getPlatform() ) {
			case LWJGLUtil.PLATFORM_WINDOWS:
				functionProvider = new FunctionProvider() {

					// TODO: Make this available to both ALC and AL
					private final WindowsLibrary OPENAL;

					{
						final String[] paths = LWJGLUtil.getLibraryPaths(
							"OpenAL32",
							PointerBuffer.is64Bit() ? "OpenAL64.dll" : "OpenAL32.dll",
							ALC.class.getClassLoader()
						);

						WindowsLibrary lib = null;
						for ( String path : paths ) {
							try {
								lib = new WindowsLibrary(path);
								break;
							} catch (Exception e) {
								LWJGLUtil.log("Failed to load " + path + ": " + e.getMessage());
							}
						}
						if ( lib == null )
							throw new RuntimeException("Failed to locate the OpenAL library");

						OPENAL = lib;
					}

					public long getFunctionAddress(final String functionName) {
						final long address = GetProcAddress(OPENAL.getHandle(), functionName);
						if ( LWJGLUtil.DEBUG && address == 0L )
							System.err.println("Failed to locate address for function " + functionName);

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

	private static final ALCCapabilities capabilities = createCapabilities();

	public ALC() {
	}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	public static ALCCapabilities getCapabilities() {
		return capabilities;
	}

	// We could remove the method below if we add support for it in the code generator.
	// But this is the only occurance of this pattern, so not really worth it.

	/**
	 * Obtains string values from ALC. This is a custom implementation for those tokens that return a list of strings instead of a single string.
	 *
	 * @param deviceHandle the device to query
	 * @param token        the information to query. One of:<p/>{@link ALC10#ALC_DEVICE_SPECIFIER}, {@link ALC10#ALC_EXTENSIONS}, {@link ALC11#ALC_CAPTURE_DEVICE_SPECIFIER}
	 */
	public static List<String> getStringList(final long deviceHandle, final int token) {
		final long __functionAddress = ALC10.getInstance().alcGetString;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);

		final long __result = nalcGetString(deviceHandle, token, __functionAddress);
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
	private static ALCCapabilities createCapabilities() {
		// We don't have an ALCCapabilities instance when this method is called
		// so we have to use the native bindings directly.
		final long OpenDevice = functionProvider.getFunctionAddress("alcOpenDevice");
		final long CloseDevice = functionProvider.getFunctionAddress("alcCloseDevice");
		final long GetIntegerv = functionProvider.getFunctionAddress("alcGetIntegerv");

		if ( OpenDevice == 0L || CloseDevice == 0L || GetIntegerv == 0L )
			throw new IllegalStateException("Core ALC functions could not be found. Make sure that OpenAL has been loaded.");

		// Normally we'd call alcGetInteger with a NULL device, but some implementations return 0.0.
		// So we open the default device and use that instead.
		final long defaultDevice = nalcOpenDevice(0L, OpenDevice);
		if ( defaultDevice == 0L )
			throw new RuntimeException("Failed to open the default ALC device.");

		final Set<String> supportedExtensions;
		try {
			final IntBuffer versionBuffer = BufferUtils.createIntBuffer(2);

			nalcGetIntegerv(defaultDevice, ALC_MAJOR_VERSION, 1, memAddress(versionBuffer), GetIntegerv);
			nalcGetIntegerv(defaultDevice, ALC_MINOR_VERSION, 1, memAddress(versionBuffer) + 4, GetIntegerv);

			final int majorVersion = versionBuffer.get(0);
			final int minorVersion = versionBuffer.get(1);

			final int[][] ALC_VERSIONS = {
				{ 0, 1 },  // ALC 1
			};

			supportedExtensions = new LinkedHashSet<String>();

			for ( int major = 1; major <= ALC_VERSIONS.length; major++ ) {
				int[] minors = ALC_VERSIONS[major - 1];
				for ( int minor : minors ) {
					if ( major < majorVersion || (major == majorVersion && minor <= minorVersion) )
						supportedExtensions.add("OpenALC" + Integer.toString(major) + Integer.toString(minor));
				}
			}
		} finally {
			nalcCloseDevice(defaultDevice, CloseDevice);
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

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.FunctionMap;
import org.lwjgl.system.FunctionProvider;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.ALC10.alcCreateContext;
import static org.lwjgl.openal.ALC11.ALC_ALL_DEVICES_SPECIFIER;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class AL {

	private static final FunctionProvider functionProvider = new FunctionProvider() {

		// We'll use alGetProcAddress for both core and extension entry points.
		// To do that, we need to first grab the alGetProcAddress function from
		// the OpenAL native library.
		private final long alGetProcAddress = ALC.functionProvider.getLibraryFunctionAddress("alGetProcAddress");

		public long getFunctionAddress(final String functionName) {
			final ByteBuffer nameBuffer = memEncodeASCII(functionName);
			final long address = nalGetProcAddress(memAddress(nameBuffer), alGetProcAddress);
			if ( address == 0L )
				LWJGLUtil.log("Failed to locate address for AL function " + functionName);

			return address;
		}

		@Override
		public long getLibraryFunctionAddress(final String functionName) { throw new UnsupportedOperationException(); }

	};

	private static ALContext context;

	public AL() {
	}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	static void setCurrent(final ALContext context) {
		// TODO: Synchronize or let the user handle it?
		// The current AL context is process-wide, so synchronization won't offer anything interesting.
		// Users doing advanced stuff can sync as necessary.

		// TODO: Handle ALC_EXT_thread_local_context?
		AL.context = context;
		ALC.setCurrent(context.getDeviceContext());
	}

	public static ALCapabilities getCapabilities() {
		return context.getCapabilities();
	}

	/**
	 * Bootstrapping code that creates an ALCapabilities instance.
	 *
	 * @return the ALCapabilities instance
	 */
	public static ALCapabilities createCapabilities(final long device) {
		int majorVersion = alcGetInteger(device, ALC_MAJOR_VERSION);
		int minorVersion = alcGetInteger(device, ALC_MINOR_VERSION);

		final int[][] AL_VERSIONS = {
			{ 0, 1 }  // OpenAL 1
		};

		final Set<String> supportedExtensions = new LinkedHashSet<String>(32);

		for ( int major = 1; major <= AL_VERSIONS.length; major++ ) {
			int[] minors = AL_VERSIONS[major - 1];
			for ( int minor : minors ) {
				if ( major < majorVersion || (major == majorVersion && minor <= minorVersion) )
					supportedExtensions.add("OpenAL" + Integer.toString(major) + Integer.toString(minor));
			}
		}

		final long GetString = functionProvider.getFunctionAddress("alGetString");
		final long IsExtensionPresent = functionProvider.getFunctionAddress("alIsExtensionPresent");
		if ( GetString == 0L || IsExtensionPresent == 0L )
			throw new IllegalStateException("Core OpenAL functions could not be found. Make sure that OpenAL has been loaded.");

		// Parse EXTENSIONS string
		final String extensionsString = memDecodeUTF8(memByteBufferNT1(checkPointer(nalGetString(AL_EXTENSIONS, GetString))));

		/*
		OpenALSoft: AL_EXT_ALAW AL_EXT_DOUBLE AL_EXT_EXPONENT_DISTANCE AL_EXT_FLOAT32 AL_EXT_IMA4 AL_EXT_LINEAR_DISTANCE AL_EXT_MCFORMATS AL_EXT_MULAW AL_EXT_MULAW_MCFORMATS AL_EXT_OFFSET AL_EXT_source_distance_model AL_LOKI_quadriphonic AL_SOFT_buffer_samples AL_SOFT_buffer_sub_data AL_SOFTX_deferred_updates AL_SOFT_direct_channels AL_SOFT_loop_points
		Creative: EAX EAX2.0 EAX3.0 EAX4.0 EAX5.0 EAX3.0EMULATED EAX4.0EMULATED AL_EXT_OFFSET AL_EXT_LINEAR_DISTANCE AL_EXT_EXPONENT_DISTANCE
		 */

		final StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() ) {
			final String extName = tokenizer.nextToken();
			final ByteBuffer nameBuffer = memEncodeASCII(extName);
			if ( nalIsExtensionPresent(memAddress(nameBuffer), IsExtensionPresent) )
				supportedExtensions.add(extName);
		}

		return new ALCapabilities(supportedExtensions);
	}

	static <T extends FunctionMap> T checkExtension(final String extension, final T functions, final boolean supported) {
		if ( supported )
			return functions;
		else {
			LWJGLUtil.log("[AL] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

    public static ALContext getCurrent() {
        return context;
    }

    public static boolean isCreated() {
        return context != null;
    }

    public static void create() {
        create(null, 44100, 60, false);
    }

    public static void destroy() {
        ALCContext deviceContext = context.getDeviceContext();
        context.destroy();
        deviceContext.destroy();
        context = null;
    }

    public static void create(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized) {
        final ALCContext deviceContext = ALC.createALCContextFromDevice(deviceArguments);
        final IntBuffer attribs = BufferUtils.createIntBuffer(16);

        attribs.put(ALC_FREQUENCY);
        attribs.put(contextFrequency);

        attribs.put(ALC_REFRESH);
        attribs.put(contextRefresh);

        attribs.put(ALC_SYNC);
        attribs.put(contextSynchronized ? ALC10.ALC_TRUE : ALC10.ALC_FALSE);

        attribs.put(0);
        attribs.flip();

        final long contextHandle = alcCreateContext(deviceContext.getDevice(), attribs);
        context = new ALContext(deviceContext, contextHandle);
    }
}
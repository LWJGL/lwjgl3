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
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class AL {

	private static final FunctionProvider functionProvider = new FunctionProvider() {

		// We'll use alGetProcAddress for both core and extension entry points.
		// To do that, we need to first grab the alGetProcAddress function from
		// the OpenAL native library.
		private final long alGetProcAddress = ALC.functionProvider.getFunctionAddress("alGetProcAddress");

		@Override
		public long getFunctionAddress(String functionName) {
			ByteBuffer nameBuffer = memEncodeASCII(functionName);
			long address = nalGetProcAddress(memAddress(nameBuffer), alGetProcAddress);
			if ( address == NULL )
				LWJGLUtil.log("Failed to locate address for AL function " + functionName);

			return address;
		}

		@Override
		public void destroy() {}
	};

	private static ALContext context;

	private AL() {}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	static void setCurrent(ALContext context) {
		// TODO: Synchronize or let the user handle it?
		// The current AL context is process-wide, so synchronization won't offer anything interesting.
		// Users doing advanced stuff can sync as necessary.

		// TODO: Handle ALC_EXT_thread_local_context?
		// Add custom code to alcSetThreadContext and new ThreadLocal context state to track everything.
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
	public static ALCapabilities createCapabilities(long device) {
		int majorVersion = alcGetInteger(device, ALC_MAJOR_VERSION);
		int minorVersion = alcGetInteger(device, ALC_MINOR_VERSION);

		int[][] AL_VERSIONS = {
			{ 0, 1 }  // OpenAL 1
		};

		Set<String> supportedExtensions = new HashSet<String>(32);

		for ( int major = 1; major <= AL_VERSIONS.length; major++ ) {
			int[] minors = AL_VERSIONS[major - 1];
			for ( int minor : minors ) {
				if ( major < majorVersion || (major == majorVersion && minor <= minorVersion) )
					supportedExtensions.add("OpenAL" + Integer.toString(major) + Integer.toString(minor));
			}
		}

		long GetString = functionProvider.getFunctionAddress("alGetString");
		long IsExtensionPresent = functionProvider.getFunctionAddress("alIsExtensionPresent");
		if ( GetString == NULL || IsExtensionPresent == NULL )
			throw new IllegalStateException("Core OpenAL functions could not be found. Make sure that OpenAL has been loaded.");

		// Parse EXTENSIONS string
		String extensionsString = memDecodeUTF8(memByteBufferNT1(checkPointer(nalGetString(AL_EXTENSIONS, GetString))));

		/*
		OpenALSoft: AL_EXT_ALAW AL_EXT_DOUBLE AL_EXT_EXPONENT_DISTANCE AL_EXT_FLOAT32 AL_EXT_IMA4 AL_EXT_LINEAR_DISTANCE AL_EXT_MCFORMATS AL_EXT_MULAW AL_EXT_MULAW_MCFORMATS AL_EXT_OFFSET AL_EXT_source_distance_model AL_LOKI_quadriphonic AL_SOFT_buffer_samples AL_SOFT_buffer_sub_data AL_SOFTX_deferred_updates AL_SOFT_direct_channels AL_SOFT_loop_points
		Creative: EAX EAX2.0 EAX3.0 EAX4.0 EAX5.0 EAX3.0EMULATED EAX4.0EMULATED AL_EXT_OFFSET AL_EXT_LINEAR_DISTANCE AL_EXT_EXPONENT_DISTANCE
		 */

		StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() ) {
			String extName = tokenizer.nextToken();
			ByteBuffer nameBuffer = memEncodeASCII(extName);
			if ( nalIsExtensionPresent(memAddress(nameBuffer), IsExtensionPresent) )
				supportedExtensions.add(extName);
		}

		return new ALCapabilities(supportedExtensions);
	}

	static <T extends FunctionMap> T checkExtension(String extension, T functions, boolean supported) {
		if ( supported )
			return functions;
		else {
			LWJGLUtil.log("[AL] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

	public static ALContext create() {
		return create(null, 44100, 60, false);
	}

	public static void destroy(ALContext alContext) {
		ALCContext deviceContext = alContext.getDeviceContext();
		alContext.destroy();
		deviceContext.destroy();
	}

	public static ALContext create(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized) {
		ALCContext deviceContext = ALC.createALCContextFromDevice(deviceArguments);
		IntBuffer attribs = BufferUtils.createIntBuffer(16);

		attribs.put(ALC_FREQUENCY);
		attribs.put(contextFrequency);

		attribs.put(ALC_REFRESH);
		attribs.put(contextRefresh);

		attribs.put(ALC_SYNC);
		attribs.put(contextSynchronized ? ALC10.ALC_TRUE : ALC10.ALC_FALSE);

		attribs.put(0);
		attribs.flip();

		long contextHandle = alcCreateContext(deviceContext.getDevice(), attribs);
		return new ALContext(deviceContext, contextHandle);
	}

}
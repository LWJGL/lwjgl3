/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.FunctionProvider;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class AL {

	private static FunctionProvider functionProvider;

	private static ALContext processContext;
	private static final ThreadLocal<ALContext> threadContext = new ThreadLocal<ALContext>();

	private AL() {}

	static void init() {
		functionProvider = new FunctionProvider.Default() {

			// We'll use alGetProcAddress for both core and extension entry points.
			// To do that, we need to first grab the alGetProcAddress function from
			// the OpenAL native library.
			private final long alGetProcAddress = ALC.getFunctionProvider().getFunctionAddress("alGetProcAddress");

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				APIBuffer __buffer = apiBuffer();
				__buffer.stringParamASCII(functionName, true);

				long address = nalGetProcAddress(__buffer.address(), alGetProcAddress);
				if ( address == NULL )
					LWJGLUtil.log("Failed to locate address for AL function " + functionName);

				return address;
			}

			@Override
			protected void destroy() {}
		};
	}

	static void destroy() {
		if ( functionProvider == null )
			return;

		setCurrentProcess(null);

		functionProvider.release();
		functionProvider = null;
	}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	static void setCurrentProcess(ALContext context) {
		processContext = context;
		threadContext.set(null); // See EXT_thread_local_context, second Q.
	}

	static void setCurrentThread(ALContext context) {
		threadContext.set(context);
	}

	public static ALContext getCurrentContext() {
		ALContext context = threadContext.get();
		return context != null ? context : processContext;
	}

	public static ALCapabilities getCapabilities() {
		return getCurrentContext().getCapabilities();
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
		String extensionsString = memDecodeUTF8(checkPointer(nalGetString(AL_EXTENSIONS, GetString)));

		/*
		OpenALSoft: AL_EXT_ALAW AL_EXT_DOUBLE AL_EXT_EXPONENT_DISTANCE AL_EXT_FLOAT32 AL_EXT_IMA4 AL_EXT_LINEAR_DISTANCE AL_EXT_MCFORMATS AL_EXT_MULAW
		AL_EXT_MULAW_MCFORMATS AL_EXT_OFFSET AL_EXT_source_distance_model AL_LOKI_quadriphonic AL_SOFT_buffer_samples AL_SOFT_buffer_sub_data
		AL_SOFTX_deferred_updates AL_SOFT_direct_channels AL_SOFT_loop_points
		Creative: EAX EAX2.0 EAX3.0 EAX4.0 EAX5.0 EAX3.0EMULATED EAX4.0EMULATED AL_EXT_OFFSET AL_EXT_LINEAR_DISTANCE AL_EXT_EXPONENT_DISTANCE
		 */

		APIBuffer __buffer = apiBuffer();
		StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() ) {
			String extName = tokenizer.nextToken();
			__buffer.reset().stringParamASCII(extName, true);
			if ( nalIsExtensionPresent(__buffer.address(), IsExtensionPresent) )
				supportedExtensions.add(extName);
		}

		return new ALCapabilities(getFunctionProvider(), supportedExtensions);
	}

	static <T> T checkExtension(String extension, T functions, boolean supported) {
		if ( supported )
			return functions;
		else {
			LWJGLUtil.log("[AL] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

	public static void destroy(ALContext alContext) {
		ALDevice device = alContext.getDevice();
		alContext.destroy();
		device.destroy();
	}

}
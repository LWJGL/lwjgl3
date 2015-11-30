/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.FunctionProvider;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class must be used before any OpenAL function is called. It has the following responsibilities:
 * <ul>
 * <li>Creates instances of {@link ALCapabilities} classes. An {@code ALCapabilities} instance contains flags for functionality that is available in an OpenAL
 * context. Internally, it also contains function pointers that are only valid in that specific OpenAL context.</li>
 * <li>Maintains thread-local and global state for {@code ALCapabilities} instances, corresponding to OpenAL contexts that are current in those threads and the
 * entire process, respectively.</li>
 * </ul>
 *
 * <h3>ALCapabilities creation</h3>
 * <p>Instances of {@code ALCapabilities} can be created with the {@link #createCapabilities} method. An OpenAL context must be current in the current thread
 * or process before it is called. Calling this method is expensive, so {@code ALCapabilities} instances are automatically created by and cached in
 * {@link ALContext} instances.</p>
 *
 * <h3>Thread-local state</h3>
 * <p>Before a function for a given OpenAL context can be called, the corresponding {@code ALContext} instance must be made current in the current thread or
 * process. The user is also responsible for clearing the current {@code ALCapabilities} instance when the context is destroyed or made current in another
 * thread.</p>
 *
 * <p>Note that OpenAL contexts are made current process-wide by default. Current thread-local contexts are only available if the
 * {@link EXTThreadLocalContext ALC_EXT_thread_local_context} extension is supported by the OpenAL implementation. <em>OpenAL Soft</em>, the implementation
 * that LWJGL ships with, supports this extension.</p>
 *
 * @see ALContext
 * @see ALDevice
 * @see ALC
 */
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

				long address = invokePP(alGetProcAddress, __buffer.address());
				if ( address == NULL )
					apiLog("Failed to locate address for AL function " + functionName);

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

	/**
	 * Sets the specified {@link ALContext} as the current process-wide OpenAL context.
	 *
	 * <p>If the current thread had a context current (see {@link #setCurrentThread}), that context is cleared. Any OpenAL functions called in the current
	 * thread, or any threads that have no context current, will use the specified context.</p>
	 *
	 * @param context the {@link ALContext} to make current, or null
	 */
	public static void setCurrentProcess(ALContext context) {
		processContext = context;
		threadContext.set(null); // See EXT_thread_local_context, second Q.
	}

	/**
	 * Sets the specified {@link ALContext} as the current OpenAL context in the current thread.
	 *
	 * <p>Any OpenAL functions called in the current thread will use the specified context.</p>
	 *
	 * @param context the {@link ALContext} to make current, or null
	 */
	public static void setCurrentThread(ALContext context) {
		threadContext.set(context);
	}

	/**
	 * Returns the {@link ALContext} that is current in the current thread or process.
	 *
	 * If no {@link ALContext} is current in the current thread or process, null is returned.
	 */
	public static ALContext getCurrentContext() {
		ALContext context = threadContext.get();
		return context != null ? context : processContext;
	}

	/**
	 * Returns the {@link ALCapabilities} of the OpenAL context that is current in the current thread or process.
	 *
	 * @throws IllegalStateException if no {@link ALContext} is current in the current thread or process
	 */
	public static ALCapabilities getCapabilities() {
		ALContext current = getCurrentContext();
		if ( current == null )
			throw new IllegalStateException("No ALContext has been made current for the current thread or process.");

		return current.getCapabilities();
	}

	/**
	 * Creates a new {@link ALCapabilities} instance for the OpenAL context that is current in the current thread or process.
	 *
	 * @param alcCaps the {@link ALCCapabilities} of the device associated with the current context
	 *
	 * @return the ALCapabilities instance
	 */
	public static ALCapabilities createCapabilities(ALCCapabilities alcCaps) {
		long GetString = functionProvider.getFunctionAddress("alGetString");
		long GetError = functionProvider.getFunctionAddress("alGetError");
		long IsExtensionPresent = functionProvider.getFunctionAddress("alIsExtensionPresent");
		if ( GetString == NULL || GetError == NULL || IsExtensionPresent == NULL )
			throw new IllegalStateException("Core OpenAL functions could not be found. Make sure that the OpenAL library has been loaded correctly.");

		long versionString = invokeIP(GetString, AL_VERSION);
		if ( versionString == NULL || callI(GetError) != AL_NO_ERROR )
			throw new IllegalStateException("There is no OpenAL context current in the current thread or process.");

		APIVersion apiVersion = apiParseVersion(memDecodeASCII(versionString));
		int majorVersion = apiVersion.major;
		int minorVersion = apiVersion.minor;

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

		// Parse EXTENSIONS string
		String extensionsString = memDecodeUTF8(checkPointer(invokeIP(GetString, AL_EXTENSIONS)));

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
			if ( invokePZ(IsExtensionPresent, __buffer.address()) )
				supportedExtensions.add(extName);
		}

		return new ALCapabilities(functionProvider, supportedExtensions, alcCaps);
	}

	static <T> T checkExtension(String extension, T functions, boolean supported) {
		if ( supported )
			return functions;
		else {
			apiLog("[AL] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

}
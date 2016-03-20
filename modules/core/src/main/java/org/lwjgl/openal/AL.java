/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.ThreadLocalUtil;

import java.lang.reflect.Field;
import java.util.*;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.EXTThreadLocalContext.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.checkPointer;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.ThreadLocalUtil.*;

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
 * or process before it is called. Calling this method is expensive, so {@code ALCapabilities} instances should be cached in user code.</p>
 *
 * <h3>Thread-local state</h3>
 * <p>Before a function for a given OpenAL context can be called, the corresponding {@code ALCapabilities} instance must be made current in the current
 * thread or process. The user is also responsible for clearing the current {@code ALCapabilities} instance when the context is destroyed or made current in
 * another thread.</p>
 *
 * <p>Note that OpenAL contexts are made current process-wide by default. Current thread-local contexts are only available if the
 * {@link EXTThreadLocalContext ALC_EXT_thread_local_context} extension is supported by the OpenAL implementation. <em>OpenAL Soft</em>, the implementation
 * that LWJGL ships with, supports this extension.</p>
 *
 * @see ALC
 */
public final class AL {

	private static FunctionProvider functionProvider;

	private static ALCapabilities processCaps;

	private static CapabilitiesState capsProvider = new GlobalCapabilitiesState();

	private AL() {}

	static void init() {
		functionProvider = new FunctionProvider() {
			// We'll use alGetProcAddress for both core and extension entry points.
			// To do that, we need to first grab the alGetProcAddress function from
			// the OpenAL native library.
			private final long alGetProcAddress = ALC.getFunctionProvider().getFunctionAddress("alGetProcAddress");

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				stackPush();
				try {
					long address = invokePP(alGetProcAddress, memAddress(memEncodeASCII(functionName, true, BufferAllocator.STACK)));
					if ( address == NULL )
						apiLog("Failed to locate address for AL function " + functionName);

					return address;
				} finally {
					stackPop();
				}
			}

			@Override
			public void free() {}
		};
	}

	static void destroy() {
		if ( functionProvider == null )
			return;

		setCurrentProcess(null);

		functionProvider.free();
		functionProvider = null;
	}

	/**
	 * Sets the specified {@link ALCapabilities} for the current process-wide OpenAL context.
	 *
	 * <p>If the current thread had a context current (see {@link #setCurrentThread}), those {@code ALCapabilities} cleared. Any OpenAL functions called in the
	 * current thread, or any threads that have no context current, will use the specified {@code ALCapabilities}.</p>
	 *
	 * @param caps the {@link ALCapabilities} to make current, or null
	 */
	public static void setCurrentProcess(ALCapabilities caps) {
		processCaps = caps;
		capsProvider.set(null); // See EXT_thread_local_context, second Q.
	}

	/**
	 * Sets the specified {@link ALCapabilities} for the current OpenAL context in the current thread.
	 *
	 * <p>Any OpenAL functions called in the current thread will use the specified {@code ALCapabilities}.</p>
	 *
	 * @param caps the {@link ALCapabilities} to make current, or null
	 */
	public static void setCurrentThread(ALCapabilities caps) {
		capsProvider.set(caps);
	}

	/**
	 * Returns the {@link ALCapabilities} for the OpenAL context that is current in the current thread or process.
	 *
	 * If no OpenAL context is current in the current thread or process, null is returned.
	 */
	public static ALCapabilities getCurrentCapabilities() {
		ALCapabilities caps = capsProvider.get();
		return caps != null ? caps : processCaps;
	}

	/**
	 * Returns the {@link ALCapabilities} for the OpenAL context that is current in the current thread or process.
	 *
	 * @throws IllegalStateException if no OpenAL context is current in the current thread or process
	 */
	public static ALCapabilities getCapabilities() {
		ALCapabilities current = getCurrentCapabilities();
		if ( current == null )
			throw new IllegalStateException("No OpenAL context has been made current for the current thread or process.");

		return current;
	}

	/**
	 * Creates a new {@link ALCapabilities} instance for the OpenAL context that is current in the current thread or process.
	 *
	 * @param alcCaps the {@link ALCCapabilities} of the device associated with the current context
	 *
	 * @return the ALCapabilities instance
	 */
	public static ALCapabilities createCapabilities(ALCCapabilities alcCaps) {
		ALCapabilities caps = null;

		try {
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

			MemoryStack stack = stackGet();
			StringTokenizer tokenizer = new StringTokenizer(extensionsString);
			while ( tokenizer.hasMoreTokens() ) {
				String extName = tokenizer.nextToken();
				stack.push();
				try {
					if ( invokePZ(IsExtensionPresent, memAddress(memEncodeASCII(extName, true, BufferAllocator.STACK))) )
						supportedExtensions.add(extName);
				} finally {
					stack.pop();
				}
			}

			return caps = new ALCapabilities(functionProvider, supportedExtensions, alcCaps);
		} finally {
			if ( alcCaps.ALC_EXT_thread_local_context && alcGetThreadContext() != NULL )
				setCurrentThread(caps);
			else
				setCurrentProcess(caps);
		}
	}

	static <T> T checkExtension(String extension, T functions, boolean supported) {
		if ( supported )
			return functions;
		else {
			apiLog("[AL] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

	/** Manages the thread-local {@link ALCapabilities} state. */
	private interface CapabilitiesState {
		void set(ALCapabilities caps);
		ALCapabilities get();
	}

	/** Default {@link CapabilitiesState} implementation using {@link ThreadLocalUtil.TLS}. */
	private static class TLCapabilitiesState implements CapabilitiesState {
		@Override
		public void set(ALCapabilities caps) { tlsGet().alCaps = caps; }

		@Override
		public ALCapabilities get() { return tlsGet().alCaps; }
	}

	/**
	 * This is the initial {@link CapabilitiesState}. As long as we do not encounter a {@link ALCapabilities} instance that is different than the first
	 * instance passed to {@link #setCurrentThread} (very unlikely to happen in most programs), we continue using it. This implementation skips the
	 * thread-local
	 * lookup and therefore provides a much more efficient {@link #getCapabilities} (but a much slower {@link #setCurrentThread}).
	 *
	 * <p>A {@link TLCapabilitiesState} instance is maintained internally. If the above rare condition is triggered, {@link #capsProvider} is switched to that
	 * instance and {@link GlobalCapabilitiesState} is never used again.</p>
	 */
	private static class GlobalCapabilitiesState implements CapabilitiesState {

		// The static final here helps performance if we switch.
		private static final TLCapabilitiesState tlProvider = new TLCapabilitiesState();

		// We need this to able to reset caps to null. This is useful during init; the first OpenGL created is usually a dummy context with different
		// capabilities to what we're actually going to use.
		private final WeakHashMap<Thread, ALCapabilities> tlMap = new WeakHashMap<Thread, ALCapabilities>(16);

		private final List<Field> flags;
		private final List<Field> funcs;

		private ALCapabilities caps;

		GlobalCapabilitiesState() {
			Field[] fields = ALCapabilities.class.getDeclaredFields();

			this.flags = new ArrayList<Field>(64);
			this.funcs = new ArrayList<Field>(16);

			for ( Field f : fields )
				(f.getType() == Boolean.TYPE ? flags : funcs).add(f);
		}

		@Override
		public synchronized void set(ALCapabilities caps) {
			tlProvider.set(caps);

			if ( caps == null ) {
				tlMap.remove(Thread.currentThread());
				if ( tlMap.isEmpty() )
					this.caps = null;
			} else {
				if ( tlMap.isEmpty() ) // poll the reference queue, in case a thread didn't call AL.setCurrentThread(null) before exiting
					this.caps = null;

				tlMap.put(Thread.currentThread(), caps);

				if ( this.caps == null )
					this.caps = caps;
				else if ( !apiCompareCapabilities(flags, funcs, this.caps, caps) ) {
					apiLog("An OpenAL context with different functionality detected. Switching to thread-local ALCapabilities.");
					capsProvider = tlProvider;
				}
			}
		}

		@Override
		public ALCapabilities get() {
			return caps;
		}

	}

}
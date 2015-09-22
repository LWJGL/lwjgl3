/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.DynamicLinkLibrary;
import org.lwjgl.system.FunctionProvider;

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Math.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL32.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class must be used before any OpenGL function is called. It has the following responsibilities:
 * <ul>
 * <li>Loads the OpenGL native library into the JVM process.</li>
 * <li>Creates instances of {@link GLCapabilities} classes. A {@code GLCapabilities} instance contains flags for functionality that is available in an OpenGL
 * context. Internally, it also contains function pointers that are only valid in that specific OpenGL context.</li>
 * <li>Maintains thread-local state for {@code GLCapabilities} instances, corresponding to OpenGL contexts that are current in those threads.</li>
 * </ul>
 *
 * <h3>Library lifecycle</h3>
 * <p>The OpenGL library is loaded automatically when this class is initialized. Set the {@code org.lwjgl.opengl.explicitInit=true} system property to override
 * this behavior. Manual loading/unloading can be achieved with the {@link #create} and {@link #destroy} functions. The name of the library loaded can
 * be overridden with the {@code org.lwjgl.opengl.libname} system property. The maximum OpenGL version loaded can be set with the
 * {@code org.lwjgl.opengl.maxVersion=M.n} system property. This can be useful to ensure that no functionality above a specific version is used during
 * development.</p>
 *
 * <h3>GLCapabilities creation</h3>
 * <p>Instances of {@code GLCapabilities} can be created with the {@link #createCapabilities} method. An OpenGL context must be current in the current thread
 * before it is called. Calling this method is expensive, so the {@code GLCapabilities} instance should be associated with the OpenGL context and reused as
 * necessary.</p>
 *
 * <h3>Thread-local state</h3>
 * <p>Before a function for a given OpenGL context can be called, the corresponding {@code GLCapabilities} instance must be passed to the
 * {@link #setCapabilities} method. The user is also responsible for clearing the current {@code GLCapabilities} instance when the context is destroyed or made
 * current in another thread.</p>
 *
 * <p>Note that the {@link #createCapabilities} method implicitly calls {@link #setCapabilities} with the newly created instance.</p>
 */
public final class GL {

	private static final ThreadLocal<GLCapabilities> capsTL = new ThreadLocal<GLCapabilities>();

	private static final APIVersion MAX_VERSION;

	private static FunctionProvider functionProvider;

	static {
		String max = System.getProperty("org.lwjgl.opengl.maxVersion");
		MAX_VERSION = max == null ? null : apiParseVersion(max, null);

		if ( !Boolean.getBoolean("org.lwjgl.opengl.explicitInit") )
			create();
	}

	private GL() {}

	/** Loads the OpenGL native library, using the default library name. */
	public static void create() {
		String libName;
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				libName = "opengl32";
				break;
			case LINUX:
				libName = "libGL.so.1";
				break;
			case MACOSX:
				libName = "/System/Library/Frameworks/OpenGL.framework";
				break;
			default:
				throw new IllegalStateException();
		}

		create(System.getProperty("org.lwjgl.opengl.libname", libName));
	}

	/**
	 * Loads the OpenGL native library, using the specified library name.
	 *
	 * @param libName the native library name
	 */
	public static void create(String libName) {
		final DynamicLinkLibrary OPENGL = LWJGLUtil.loadLibraryNative(libName);

		abstract class FunctionProviderGL extends FunctionProvider.Default {
			abstract long getExtensionAddress(long name);

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				APIBuffer __buffer = apiBuffer();
				__buffer.stringParamASCII(functionName, true);

				long address = getExtensionAddress(__buffer.address());
				if ( address == NULL ) {
					address = OPENGL.getFunctionAddress(functionName);
					if ( address == NULL )
						LWJGLUtil.log("Failed to locate address for GL function " + functionName);
				}

				return address;
			}

			@Override
			protected void destroy() {
				OPENGL.release();
			}
		}

		FunctionProvider functionProvider;
		try {
			switch ( LWJGLUtil.getPlatform() ) {
				case WINDOWS:
					functionProvider = new FunctionProviderGL() {
						private final long wglGetProcAddress = OPENGL.getFunctionAddress("wglGetProcAddress");

						@Override
						long getExtensionAddress(long name) {
							return callPP(wglGetProcAddress, name);
						}
					};
					break;
				case LINUX:
					functionProvider = new FunctionProviderGL() {
						private final long glXGetProcAddress = OPENGL.getFunctionAddress("glXGetProcAddress");
						private final long glXGetProcAddressARB = OPENGL.getFunctionAddress("glXGetProcAddressARB");

						@Override
						long getExtensionAddress(long name) {
							if ( glXGetProcAddress != NULL )
								return callPP(glXGetProcAddress, name);

							if ( glXGetProcAddressARB != NULL )
								return callPP(glXGetProcAddressARB, name);

							return NULL;
						}
					};
					break;
				case MACOSX:
					functionProvider = new FunctionProviderGL() {
						@Override
						long getExtensionAddress(long name) {
							return NULL;
						}
					};
					break;
				default:
					throw new IllegalStateException();
			}
			create(functionProvider);
		} catch (RuntimeException e) {
			OPENGL.release();
			throw e;
		}
	}

	/**
	 * Initializes OpenGL with the specified {@link FunctionProvider}. This method can be used to implement custom OpenGL library loading.
	 *
	 * @param functionProvider the provider of OpenGL function addresses
	 */
	public static void create(FunctionProvider functionProvider) {
		if ( GL.functionProvider != null )
			throw new IllegalStateException("OpenGL has already been created.");

		GL.functionProvider = functionProvider;
	}

	/** Unloads the OpenGL native library. */
	public static void destroy() {
		if ( functionProvider == null )
			return;

		functionProvider.release();
		functionProvider = null;
	}

	/** Returns the {@link FunctionProvider} for the OpenGL native library. */
	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	/**
	 * Sets the {@link GLCapabilities} of the OpenGL context that is current in the current thread.
	 *
	 * <p>This {@code GLCapabilities} instance will be used by any OpenGL ES call in the current thread, until {@code setCapabilities} is called again with
	 * a different value.</p>
	 */
	public static void setCapabilities(GLCapabilities caps) {
		capsTL.set(caps);
	}

	/**
	 * Returns the {@link GLCapabilities} of the OpenGL ES context that is current in the current thread.
	 *
	 * @throws IllegalStateException if {@link #setCapabilities} has never been called in the current thread or was last called with a {@code null} value
	 */
	public static GLCapabilities getCapabilities() {
		GLCapabilities caps = capsTL.get();
		if ( caps == null )
			throw new IllegalStateException("No GLCapabilities instance has been set for the current thread.");

		return caps;
	}

	/**
	 * Creates a new {@link GLCapabilities} instance for the OpenGL context that is current in the current thread.
	 *
	 * <p>Depending on the current context, the instance returned may or may not contain the deprecated functionality removed since OpenGL version 3.1.</p>
	 *
	 * <p>This method calls {@link #setCapabilities(GLCapabilities)} with the new instance before returning.</p>
	 *
	 * @return the GLCapabilities instance
	 */
	public static GLCapabilities createCapabilities() {
		return createCapabilities(false);
	}

	/**
	 * Creates a new {@link GLCapabilities} instance for the OpenGL context that is current in the current thread.
	 *
	 * <p>Depending on the current context, the instance returned may or may not contain the deprecated functionality removed since OpenGL version 3.1. The
	 * {@code forwardCompatible} flag will force LWJGL to not load the deprecated functions, even if the current context exposes them.</p>
	 *
	 * <p>This method calls {@link #setCapabilities(GLCapabilities)} with the new instance before returning.</p>
	 *
	 * @param forwardCompatible if true, LWJGL will create forward compatible capabilities
	 *
	 * @return the GLCapabilities instance
	 */
	public static GLCapabilities createCapabilities(boolean forwardCompatible) {
		GLCapabilities caps = null;

		try {
			// We don't have a current ContextCapabilities when this method is called
			// so we have to use the native bindings directly.
			long GetError = functionProvider.getFunctionAddress("glGetError");
			long GetString = functionProvider.getFunctionAddress("glGetString");
			long GetIntegerv = functionProvider.getFunctionAddress("glGetIntegerv");

			if ( GetError == NULL || GetString == NULL || GetIntegerv == NULL )
				throw new IllegalStateException("Core OpenGL functions could not be found. Make sure that a GL context is current in the current thread.");

			int errorCode = callI(GetError);
			if ( errorCode != GL_NO_ERROR )
				LWJGLUtil.log(
					"A GL context was in an error state before the creation of its capabilities instance. Error: " + GLUtil.getErrorString(errorCode)
				);

			APIBuffer __buffer = apiBuffer();

			int majorVersion;
			int minorVersion;

			// Try the 3.0+ version query first
			__buffer.intParam(0, 0, 0);
			callIPV(GetIntegerv, GL_MAJOR_VERSION, __buffer.address());
			if ( callI(GetError) == GL_NO_ERROR && 3 <= (majorVersion = __buffer.intValue(0)) ) {
				// We're on an 3.0+ context.
				callIPV(GetIntegerv, GL_MINOR_VERSION, __buffer.address());
				minorVersion = __buffer.intValue(0);
			} else {
				// Fallback to the string query.
				APIVersion version = apiParseVersion(memDecodeUTF8(checkPointer(callIP(GetString, GL_VERSION))));

				majorVersion = version.major;
				minorVersion = version.minor;
			}

			if ( majorVersion < 1 || (majorVersion == 1 && minorVersion < 1) )
				throw new IllegalStateException("OpenGL 1.1 is required.");

			int[] GL_VERSIONS = {
				5, // OpenGL 1.1 to 1.5
				1, // OpenGL 2.0 to 2.1
				3, // OpenGL 3.0 to 3.3
				5, // OpenGL 4.0 to 4.5
			};

			Set<String> supportedExtensions = new HashSet<String>(512);

			int maxMajor = min(majorVersion, GL_VERSIONS.length);
			if ( MAX_VERSION != null )
				maxMajor = min(MAX_VERSION.major, maxMajor);
			for ( int M = 1; M <= maxMajor; M++ ) {
				int maxMinor = GL_VERSIONS[M - 1];
				if ( M == majorVersion )
					maxMinor = min(minorVersion, maxMinor);
				if ( MAX_VERSION != null && M == MAX_VERSION.major )
					maxMinor = min(MAX_VERSION.minor, maxMinor);

				for ( int m = M == 1 ? 1 : 0; m <= maxMinor; m++ )
					supportedExtensions.add(String.format("OpenGL%d%d", M, m));
			}

			if ( majorVersion < 3 ) {
				// Parse EXTENSIONS string
				String extensionsString = memDecodeASCII(checkPointer(callIP(GetString, GL_EXTENSIONS)));

				StringTokenizer tokenizer = new StringTokenizer(extensionsString);
				while ( tokenizer.hasMoreTokens() )
					supportedExtensions.add(tokenizer.nextToken());
			} else {
				// Use indexed EXTENSIONS
				callIPV(GetIntegerv, GL_NUM_EXTENSIONS, __buffer.address());
				int extensionCount = __buffer.intValue(0);

				long GetStringi = checkPointer(checkFunctionAddress(functionProvider.getFunctionAddress("glGetStringi")));
				for ( int i = 0; i < extensionCount; i++ )
					supportedExtensions.add(memDecodeASCII(callIIP(GetStringi, GL_EXTENSIONS, i)));

				// In real drivers, we may encounter the following weird scenarios:
				// - 3.1 context without GL_ARB_compatibility but with deprecated functionality exposed and working.
				// - Core or forward-compatible context with GL_ARB_compatibility exposed, but not working when used.
				// We ignore these and go by the spec.

				// Force forwardCompatible to true if the context is a forward-compatible context.
				callIPV(GetIntegerv, GL_CONTEXT_FLAGS, __buffer.address());
				if ( (__buffer.intValue(0) & GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT) != 0 )
					forwardCompatible = true;
				else {
					// Force forwardCompatible to true if the context is a core profile context.
					if ( (3 < majorVersion || 1 <= minorVersion) ) { // OpenGL 3.1+
						if ( 3 < majorVersion || 2 <= minorVersion ) { // OpenGL 3.2+
							callIPV(GetIntegerv, GL_CONTEXT_PROFILE_MASK, __buffer.address());
							if ( (__buffer.intValue(0) & GL_CONTEXT_CORE_PROFILE_BIT) != 0 )
								forwardCompatible = true;
						} else
							forwardCompatible = !supportedExtensions.contains("GL_ARB_compatibility");
					}
				}
			}

			switch ( LWJGLUtil.getPlatform() ) {
				case WINDOWS:
					supportedExtensions.add("WGL");
					addWGLExtensions(supportedExtensions);
					break;
				case LINUX:
					supportedExtensions.add("GLX");
					addGLXExtensions(supportedExtensions);
					break;
				case MACOSX:
					supportedExtensions.add("CGL");
					break;
				default:
					throw new UnsupportedOperationException();
			}

			return caps = new GLCapabilities(getFunctionProvider(), supportedExtensions, forwardCompatible);
		} finally {
			setCapabilities(caps);
		}
	}

	private static void addWGLExtensions(Set<String> supportedExtensions) {
		String wglExtensions;

		long wglGetExtensionsString = functionProvider.getFunctionAddress("wglGetExtensionsStringARB");
		if ( wglGetExtensionsString != NULL ) {
			long dc = callP(functionProvider.getFunctionAddress("wglGetCurrentDC"));
			if ( dc == NULL )
				throw new IllegalStateException("Failed to retrieve the device context of the current thread.");
			wglExtensions = memDecodeASCII(callPP(wglGetExtensionsString, dc));
		} else {
			wglGetExtensionsString = functionProvider.getFunctionAddress("wglGetExtensionsStringEXT");
			if ( wglGetExtensionsString == NULL )
				return;

			wglExtensions = memDecodeASCII(callP(wglGetExtensionsString));
		}

		StringTokenizer tokenizer = new StringTokenizer(wglExtensions);
		while ( tokenizer.hasMoreTokens() )
			supportedExtensions.add(tokenizer.nextToken());
	}

	private static void addGLXExtensions(Set<String> supportedExtensions) {
		long glXGetCurrentDisplay = GL.getFunctionProvider().getFunctionAddress("glXGetCurrentDisplay");
		if ( glXGetCurrentDisplay == NULL )
			throw new OpenGLException("Failed to retrieve glXGetCurrentDisplay function address.");

		long display = callP(glXGetCurrentDisplay);

		APIBuffer __buffer = apiBuffer();

		long glXQueryVersion = functionProvider.getFunctionAddress("glXQueryVersion");
		if ( callPPPI(glXQueryVersion, display, __buffer.address(), __buffer.address(4)) == 0 )
			throw new OpenGLException("GLX is not available."); // TODO: can't happen, right?

		int majorVersion = __buffer.intValue(0);
		int minorVersion = __buffer.intValue(4);
		if ( majorVersion != 1 )
			throw new OpenGLException("Invalid GLX major version: " + majorVersion);

		int[][] GLX_VERSIONS = {
			{ 1, 2, 3, 4 }
		};

		for ( int major = 1; major <= GLX_VERSIONS.length; major++ ) {
			int[] minors = GLX_VERSIONS[major - 1];
			for ( int minor : minors ) {
				if ( major < majorVersion || (major == majorVersion && minor <= minorVersion) )
					supportedExtensions.add("GLX" + Integer.toString(major) + Integer.toString(minor));
			}
		}

		long glXQueryExtensionsString = functionProvider.getFunctionAddress("glXQueryExtensionsString");
		if ( glXQueryExtensionsString == NULL )
			return;

		String glxExtensions = memDecodeASCII(callPIP(glXQueryExtensionsString, display, 0));
		StringTokenizer tokenizer = new StringTokenizer(glxExtensions);
		while ( tokenizer.hasMoreTokens() )
			supportedExtensions.add(tokenizer.nextToken());
	}

	static long getFunctionAddress(FunctionProvider provider, String functionName, boolean fc) {
		return fc ? NULL : provider.getFunctionAddress(functionName);
	}

	static <T> T checkExtension(String extension, T functions, boolean supported) {
		if ( supported )
			return functions;
		else {
			LWJGLUtil.log("[GL] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

}
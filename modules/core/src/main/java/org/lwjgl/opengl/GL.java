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
import static org.lwjgl.opengl.GLX.*;
import static org.lwjgl.opengl.GLX11.*;
import static org.lwjgl.opengl.GLX12.*;
import static org.lwjgl.opengl.GLX14.*;
import static org.lwjgl.opengl.GLXARBGetProcAddress.*;
import static org.lwjgl.opengl.WGL.*;
import static org.lwjgl.opengl.WGLARBExtensionsString.*;
import static org.lwjgl.opengl.WGLEXTExtensionsString.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class GL {

	private static FunctionProvider functionProvider;

	private static final ThreadLocal<GLContext> contextTL = new ThreadLocal<GLContext>();

	private static final APIVersion MAX_VERSION;

	static {
		String max = System.getProperty("org.lwjgl.opengl.maxVersion");
		MAX_VERSION = max == null ? null : apiParseVersion(max, null);

		if ( !Boolean.getBoolean("org.lwjgl.opengl.explicitInit") )
			create();
	}

	private GL() {}

	public static void create() {
		String libName;
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				libName = "opengl32";
				break;
			case LINUX:
				libName = "GL";
				break;
			case MACOSX:
				libName = "/System/Library/Frameworks/OpenGL.framework";
				break;
			default:
				throw new IllegalStateException();
		}

		create(System.getProperty("org.lwjgl.opengl.libname", libName));
	}

	public static void create(String libName) {
		if ( functionProvider != null )
			throw new IllegalStateException("OpenGL has already been created.");

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

		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				functionProvider = new FunctionProviderGL() {
					@Override
					long getExtensionAddress(long name) {
						return nwglGetProcAddress(name);
					}
				};
				break;
			case LINUX:
				functionProvider = new FunctionProviderGL() {
					final long glXGetProcAddress = OPENGL.getFunctionAddress("glXGetProcAddress");
					final long glXGetProcAddressARB = OPENGL.getFunctionAddress("glXGetProcAddressARB");

					@Override
					long getExtensionAddress(long name) {
						if ( glXGetProcAddress != NULL )
							return nglXGetProcAddress(name, glXGetProcAddress);

						if ( glXGetProcAddressARB != NULL )
							return nglXGetProcAddressARB(name, glXGetProcAddressARB);

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
	}

	public static void destroy() {
		if ( functionProvider == null )
			return;

		functionProvider.release();
		functionProvider = null;
	}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	/** Sets the current {@link GLContext} in the current thread. */
	public static void setCurrent(GLContext context) {
		contextTL.set(context);
	}

	/** Returns the current {@link GLContext} in the current thread. */
	public static GLContext getCurrent() {
		return contextTL.get();
	}

	/** Returns the {@link ContextCapabilities} of the {@link GLContext} that is current in the current thread. */
	public static ContextCapabilities getCapabilities() {
		GLContext currentContext = contextTL.get();
		if ( currentContext == null )
			throw new IllegalStateException("There is no OpenGL context current in the current thread.");

		return currentContext.capabilities;
	}

	/**
	 * Creates a new ContextCapabilities instance for the current OpenGL context.
	 * <p/>
	 * Depending on the current context, the instance returned may or may not contain the
	 * deprecated functionality removed since OpenGL version 3.1. The {@code forwardCompatible}
	 * flag will force LWJGL to not load the deprecated functions, even if the current context
	 * exposes them.
	 *
	 * @param forwardCompatible if true, LWJGL will create forward compatible capabilities
	 *
	 * @return the ContextCapabilities instance
	 */
	public static ContextCapabilities createCapabilities(boolean forwardCompatible) {
		// We don't have a current ContextCapabilities when this method is called
		// so we have to use the native bindings directly.
		long GetError = functionProvider.getFunctionAddress("glGetError");
		long GetString = functionProvider.getFunctionAddress("glGetString");
		long GetIntegerv = functionProvider.getFunctionAddress("glGetIntegerv");

		if ( GetError == NULL || GetString == NULL || GetIntegerv == NULL )
			throw new IllegalStateException("Core OpenGL functions could not be found. Make sure that a GL context is current in the current thread.");

		int errorCode = nglGetError(GetError);
		if ( errorCode != GL_NO_ERROR )
			LWJGLUtil.log(
				"A GL context was in an error state before the creation of its capabilities instance. Error: " + GLContext.translateGLErrorString(errorCode)
			);

		APIBuffer __buffer = apiBuffer();

		int majorVersion;
		int minorVersion;

		// Try the 3.0+ version query first
		__buffer.intParam(0, 0, 0);
		nglGetIntegerv(GL_MAJOR_VERSION, __buffer.address(), GetIntegerv);
		if ( nglGetError(GetError) == GL_NO_ERROR && 3 <= (majorVersion = __buffer.intValue(0)) ) {
			// We're on an 3.0+ context.
			nglGetIntegerv(GL_MINOR_VERSION, __buffer.address(), GetIntegerv);
			minorVersion = __buffer.intValue(0);
		} else {
			// Fallback to the string query.
			APIVersion version = apiParseVersion(memDecodeUTF8(checkPointer(nglGetString(GL_VERSION, GetString))));

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

		Set<String> supportedExtensions = new HashSet<String>(128);

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
			String extensionsString = memDecodeASCII(checkPointer(nglGetString(GL_EXTENSIONS, GetString)));

			StringTokenizer tokenizer = new StringTokenizer(extensionsString);
			while ( tokenizer.hasMoreTokens() )
				supportedExtensions.add(tokenizer.nextToken());
		} else {
			// Use forward compatible indexed EXTENSIONS

			nglGetIntegerv(GL_NUM_EXTENSIONS, __buffer.address(), GetIntegerv);
			int extensionCount = __buffer.intValue(0);

			long GetStringi = checkPointer(checkFunctionAddress(functionProvider.getFunctionAddress("glGetStringi")));
			for ( int i = 0; i < extensionCount; i++ )
				supportedExtensions.add(memDecodeASCII(nglGetStringi(GL_EXTENSIONS, i, GetStringi)));

			// In real drivers, we may encounter the following weird scenarios:
			// - 3.1 context without GL_ARB_compatibility but with deprecated functionality exposed and working.
			// - Core or forward-compatible context with GL_ARB_compatibility exposed, but not working when used.
			// We ignore these and go by the spec.

			// Force forwardCompatible to true if the context is a forward-compatible context.
			nglGetIntegerv(GL_CONTEXT_FLAGS, __buffer.address(), GetIntegerv);
			if ( (__buffer.intValue(0) & GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT) != 0 )
				forwardCompatible = true;
			else {
				// Force forwardCompatible to true if the context is a core profile context.
				if ( (3 < majorVersion || 1 <= minorVersion) ) { // OpenGL 3.1+
					if ( 3 < majorVersion || 2 <= minorVersion ) { // OpenGL 3.2+
						nglGetIntegerv(GL_CONTEXT_PROFILE_MASK, __buffer.address(), GetIntegerv);
						if ( (__buffer.intValue(0) & GL_CONTEXT_CORE_PROFILE_BIT) != 0 )
							forwardCompatible = true;
					} else
						forwardCompatible = !supportedExtensions.contains("GL_ARB_compatibility");
				}
			}
		}

		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				addWGLExtensions(supportedExtensions);
				break;
			case LINUX:
				addGLXExtensions(supportedExtensions);
				break;
			case MACOSX:
				break;
			default:
				throw new UnsupportedOperationException();
		}

		return new ContextCapabilities(getFunctionProvider(), supportedExtensions, forwardCompatible);
	}

	private static void addWGLExtensions(Set<String> supportedExtensions) {
		String wglExtensions;

		long wglGetExtensionsString = functionProvider.getFunctionAddress("wglGetExtensionsStringARB");
		if ( wglGetExtensionsString != NULL ) {
			wglExtensions = memDecodeASCII(nwglGetExtensionsStringARB(wglGetCurrentDC(), wglGetExtensionsString));
		} else {
			wglGetExtensionsString = functionProvider.getFunctionAddress("wglGetExtensionsStringEXT");
			if ( wglGetExtensionsString == NULL )
				return;

			wglExtensions = memDecodeASCII(nwglGetExtensionsStringEXT(wglGetExtensionsString));
		}

		StringTokenizer tokenizer = new StringTokenizer(wglExtensions);
		while ( tokenizer.hasMoreTokens() )
			supportedExtensions.add(tokenizer.nextToken());
	}

	private static void addGLXExtensions(Set<String> supportedExtensions) {
		long glXGetCurrentDisplay = GL.getFunctionProvider().getFunctionAddress("glXGetCurrentDisplay");
		if ( glXGetCurrentDisplay == NULL )
			throw new OpenGLException("Failed to retrieve glXGetCurrentDisplay function address.");

		long display = nglXGetCurrentDisplay(glXGetCurrentDisplay);

		APIBuffer __buffer = apiBuffer();

		if ( nglXQueryVersion(display, __buffer.address(), __buffer.address(4)) == 0 )
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
					supportedExtensions.add("GLX_" + Integer.toString(major) + Integer.toString(minor));
			}
		}

		long glXQueryExtensionsString = functionProvider.getFunctionAddress("glXQueryExtensionsString");
		if ( glXQueryExtensionsString == NULL )
			return;

		String glxExtensions = memDecodeASCII(nglXQueryExtensionsString(display, 0, glXQueryExtensionsString));
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
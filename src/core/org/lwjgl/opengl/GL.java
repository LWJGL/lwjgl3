/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.DynamicLinkLibrary;
import org.lwjgl.system.FunctionMap;
import org.lwjgl.system.FunctionProvider;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL32.*;
import static org.lwjgl.opengl.GLX11.*;
import static org.lwjgl.opengl.GLX12.*;
import static org.lwjgl.opengl.GLX14.*;
import static org.lwjgl.opengl.GLXARBGetProcAddress.*;
import static org.lwjgl.opengl.WGLARBExtensionsString.*;
import static org.lwjgl.opengl.WGLEXTExtensionsString.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.linux.GLX.*;
import static org.lwjgl.system.windows.WGL.*;

public final class GL {

	private static final FunctionProvider functionProvider;

	static {
		String libName;
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				libName = "opengl32.dll";
				break;
			case LINUX:
				libName = "libGL.so";
				break;
			case MACOSX:
				throw new UnsupportedOperationException("not implemented yet");
			default:
				throw new IllegalStateException();
		}

		final DynamicLinkLibrary OPENGL = apiCreateLibrary(libName);

		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				functionProvider = new FunctionProvider() {
					@Override
					public long getFunctionAddress(String functionName) {
						ByteBuffer nameBuffer = memEncodeASCII(functionName);
						long address = wglGetProcAddress(nameBuffer);
						if ( address == NULL ) {
							address = OPENGL.getFunctionAddress(nameBuffer);
							if ( address == NULL )
								LWJGLUtil.log("Failed to locate address for GL function " + functionName);
						}

						return address;
					}

					@Override
					public void destroy() {
						OPENGL.destroy();
					}
				};
				break;
			case LINUX:
				functionProvider = new FunctionProvider() {

					final long glXGetProcAddress = OPENGL.getFunctionAddress("glXGetProcAddress");
					final long glXGetProcAddressARB = OPENGL.getFunctionAddress("glXGetProcAddressARB");

					private long getGLXFunctionAddress(ByteBuffer nameBuffer) {
						if ( glXGetProcAddress != NULL )
							return nglXGetProcAddress(memAddress(nameBuffer), glXGetProcAddress);

						if ( glXGetProcAddressARB != NULL )
							return nglXGetProcAddressARB(memAddress(nameBuffer), glXGetProcAddressARB);

						return NULL;
					}

					@Override
					public long getFunctionAddress(String functionName) {
						ByteBuffer nameBuffer = memEncodeASCII(functionName);
						long address = getGLXFunctionAddress(nameBuffer);
						if ( address == NULL ) {
							address = OPENGL.getFunctionAddress(nameBuffer);
							if ( address == NULL )
								LWJGLUtil.log("Failed to locate address for GL function " + functionName);
						}

						return address;
					}

					@Override
					public void destroy() {
						OPENGL.destroy();
					}
				};
				break;
			case MACOSX:
				throw new UnsupportedOperationException("not implemented yet");
			default:
				throw new IllegalStateException();
		}

	}

	private static final ThreadLocal<GLContext> contextTL = new ThreadLocal<GLContext>();

	private GL() {}

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
				"A GL context was in an error state before the creation of its capabilities instance. Error: " + Util.translateGLErrorString(errorCode)
			);

		APIBuffer __buffer = apiBuffer();

		int majorVersion;
		int minorVersion;

		// Try the 3.0+ version query first
		nglGetIntegerv(GL_MAJOR_VERSION, __buffer.address(), GetIntegerv);
		errorCode = nglGetError(GetError);
		if ( errorCode == GL_NO_ERROR ) {
			// We're on an 3.0+ context.
			majorVersion = __buffer.intValue(0);
			assert 3 <= majorVersion;

			nglGetIntegerv(GL_MINOR_VERSION, __buffer.address(), GetIntegerv);
			minorVersion = __buffer.intValue(0);
		} else {
			// Fallback to the string query.
			String version = memDecodeUTF8(memByteBufferNT1(checkPointer(nglGetString(GL_VERSION, GetString))));

			try {
				StringTokenizer versionTokenizer = new StringTokenizer(version, ". ");

				majorVersion = Integer.parseInt(versionTokenizer.nextToken());
				minorVersion = Integer.parseInt(versionTokenizer.nextToken());
			} catch (Exception e) {
				throw new IllegalStateException("The OpenGL version string is malformed: " + version, e);
			}
		}

		int[][] GL_VERSIONS = {
			{ 1, 2, 3, 4, 5 },  // OpenGL 1
			{ 0, 1 },           // OpenGL 2
			{ 0, 1, 2, 3 },     // OpenGL 3
			{ 0, 1, 2, 3 },     // OpenGL 4
		};

		Set<String> supportedExtensions = new HashSet<String>(128);

		for ( int major = 1; major <= GL_VERSIONS.length; major++ ) {
			int[] minors = GL_VERSIONS[major - 1];
			for ( int minor : minors ) {
				if ( major < majorVersion || (major == majorVersion && minor <= minorVersion) )
					supportedExtensions.add("OpenGL" + Integer.toString(major) + Integer.toString(minor));
			}
		}

		if ( majorVersion < 3 ) {
			// Parse EXTENSIONS string
			String extensionsString = memDecodeASCII(memByteBufferNT1(checkPointer(nglGetString(GL_EXTENSIONS, GetString))));

			StringTokenizer tokenizer = new StringTokenizer(extensionsString);
			while ( tokenizer.hasMoreTokens() )
				supportedExtensions.add(tokenizer.nextToken());
		} else {
			// Use forward compatible indexed EXTENSIONS

			nglGetIntegerv(GL_NUM_EXTENSIONS, __buffer.address(), GetIntegerv);
			int extensionCount = __buffer.intValue(0);

			long GetStringi = checkPointer(checkFunctionAddress(functionProvider.getFunctionAddress("glGetStringi")));
			for ( int i = 0; i < extensionCount; i++ )
				supportedExtensions.add(memDecodeASCII(memByteBufferNT1(nglGetStringi(GL_EXTENSIONS, i, GetStringi))));

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
			default:
				throw new UnsupportedOperationException();
		}

		return new ContextCapabilities(supportedExtensions, forwardCompatible);
	}

	private static void addWGLExtensions(Set<String> supportedExtensions) {
		String wglExtensions;

		long wglGetExtensionsString = functionProvider.getFunctionAddress("wglGetExtensionsStringARB");
		if ( wglGetExtensionsString != NULL ) {
			wglExtensions = memDecodeASCII(memByteBufferNT1(nwglGetExtensionsStringARB(wglGetCurrentDC(), wglGetExtensionsString)));
		} else {
			wglGetExtensionsString = functionProvider.getFunctionAddress("wglGetExtensionsStringEXT");
			if ( wglGetExtensionsString == NULL )
				return;

			wglExtensions = memDecodeASCII(memByteBufferNT1(nwglGetExtensionsStringEXT(wglGetExtensionsString)));
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

		if ( nglXQueryVersion(display, __buffer.address(), __buffer.address() + 4) == 0 )
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

		String glxExtensions = memDecodeASCII(memByteBufferNT1(nglXQueryExtensionsString(display, 0, glXQueryExtensionsString)));
		StringTokenizer tokenizer = new StringTokenizer(glxExtensions);
		while ( tokenizer.hasMoreTokens() )
			supportedExtensions.add(tokenizer.nextToken());
	}

	static long getFunctionAddress(FunctionProvider provider, String functionName, boolean fc) {
		return fc ? NULL : provider.getFunctionAddress(functionName);
	}

	static boolean isFunctionSupported(long address) {
		return address != NULL;
	}

	static boolean isFunctionSupported(long address, boolean fc) {
		return fc || address != NULL;
	}

	static <T extends FunctionMap> T checkExtension(String extension, T functions, boolean supported) {
		if ( supported )
			return functions;
		else {
			LWJGLUtil.log("[GL] " + extension + " was reported as available but an entry point is missing.");
			return null;
		}
	}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.FunctionMap;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.windows.WindowsLibrary;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL32.*;
import static org.lwjgl.opengl.WGLARBExtensionsString.*;
import static org.lwjgl.opengl.WGLEXTExtensionsString.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WGL.*;
import static org.lwjgl.system.windows.WinBase.*;

public class GL {

	private static final FunctionProvider functionProvider;

	static {
		switch ( LWJGLUtil.getPlatform() ) {
			case LWJGLUtil.PLATFORM_WINDOWS:
				functionProvider = new FunctionProvider() {

					private final WindowsLibrary OPENGL = new WindowsLibrary("opengl32.dll");

					public long getFunctionAddress(final String functionName) {
						final ByteBuffer nameBuffer = memEncodeASCII(functionName);

						long address = wglGetProcAddress(nameBuffer);
						if ( address == 0L ) {
							address = GetProcAddress(OPENGL.getHandle(), nameBuffer);
							if ( LWJGLUtil.DEBUG && address == 0L )
								System.err.println("Failed to locate address for GL function " + functionName);
						}

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

	private static final ThreadLocal<GLContext> contextTL = new ThreadLocal<GLContext>();

	public GL() {
	}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	static void setCurrent(final GLContext context) {
		contextTL.set(context);
	}

	public static ContextCapabilities getCapabilities() {
		return contextTL.get().getCapabilities();
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
		final long GetString = functionProvider.getFunctionAddress("glGetString");
		final long GetIntegerv = functionProvider.getFunctionAddress("glGetIntegerv");

		if ( GetString == 0L || GetIntegerv == 0L )
			throw new IllegalStateException("Core OpenGL functions could not be found. Make sure that a GL context is current in the current thread.");

		final String version = memDecodeUTF8(memByteBufferNT1(checkPointer(nglGetString(GL_VERSION, GetString))));

		final StringTokenizer versionTokenizer = new StringTokenizer(version, ". ");
		final String majorString = versionTokenizer.nextToken();
		final String minorString = versionTokenizer.nextToken();

		int majorVersion;
		int minorVersion;
		try {
			majorVersion = Integer.parseInt(majorString);
			minorVersion = Integer.parseInt(minorString);
		} catch (NumberFormatException e) {
			throw new IllegalStateException("The major and/or minor OpenGL version is malformed.", e);
		}

		final int[][] GL_VERSIONS = {
			{ 1, 2, 3, 4, 5 },  // OpenGL 1
			{ 0, 1 },           // OpenGL 2
			{ 0, 1, 2, 3 },     // OpenGL 3
			{ 0, 1, 2 },        // OpenGL 4
		};

		final Set<String> supportedExtensions = new LinkedHashSet<String>(128);

		for ( int major = 1; major <= GL_VERSIONS.length; major++ ) {
			int[] minors = GL_VERSIONS[major - 1];
			for ( int minor : minors ) {
				if ( major < majorVersion || (major == majorVersion && minor <= minorVersion) )
					supportedExtensions.add("OpenGL" + Integer.toString(major) + Integer.toString(minor));
			}
		}

		if ( majorVersion < 3 ) {
			// Parse EXTENSIONS string
			final String extensionsString = memDecodeUTF8(memByteBufferNT1(checkPointer(nglGetString(GL_EXTENSIONS, GetString))));

			final StringTokenizer tokenizer = new StringTokenizer(extensionsString);
			while ( tokenizer.hasMoreTokens() )
				supportedExtensions.add(tokenizer.nextToken());
		} else {
			// Use forward compatible indexed EXTENSIONS

			final IntBuffer param = BufferUtils.createIntBuffer(1);
			nglGetIntegerv(GL_NUM_EXTENSIONS, memAddress(param), GetIntegerv);
			final int extensionCount = param.get(0);

			final long GetStringi = checkFunctionAddress(functionProvider.getFunctionAddress("glGetStringi"));
			if ( GetStringi == 0L )
				throw new IllegalStateException("The glGetStringi function address could not be found.");

			for ( int i = 0; i < extensionCount; i++ )
				supportedExtensions.add(memDecodeUTF8(memByteBufferNT1(nglGetStringi(GL_EXTENSIONS, i, GetStringi))));

			// Force forwardCompatible to true if the context is a forward-compatible context.
			nglGetIntegerv(GL_CONTEXT_FLAGS, memAddress(param), GetIntegerv);
			if ( (param.get(0) & GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT) != 0 )
				forwardCompatible = true;
			else {
				// Force forwardCompatible to true if the context is a core profile context.
				if ( supportedExtensions.contains("OpenGL31") && !supportedExtensions.contains("GL_ARB_compatibility") ) {
					if ( supportedExtensions.contains("OpenGL32") ) {
						nglGetIntegerv(GL_CONTEXT_PROFILE_MASK, memAddress(param), GetIntegerv);
						if ( (param.get(0) & GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT) == 0 )
							forwardCompatible = true;
					} else
						forwardCompatible = true;
				}
			}
		}

		switch ( LWJGLUtil.getPlatform() ) {
			case LWJGLUtil.PLATFORM_WINDOWS:
				addWGLExtensions(supportedExtensions);
				break;
			case LWJGLUtil.PLATFORM_LINUX:
			case LWJGLUtil.PLATFORM_MACOSX:
			default:
				throw new UnsupportedOperationException();
		}

		return new ContextCapabilities(supportedExtensions, forwardCompatible);
	}

	private static void addWGLExtensions(final Set<String> supportedExtensions) {
		final String wglExtensions;

		long wglGetExtensionsString = functionProvider.getFunctionAddress("wglGetExtensionsStringARB");
		if ( wglGetExtensionsString != 0L ) {
			wglExtensions = memDecodeASCII(memByteBufferNT1(nwglGetExtensionsStringARB(wglGetCurrentDC(), wglGetExtensionsString)));
		} else {
			wglGetExtensionsString = functionProvider.getFunctionAddress("wglGetExtensionsStringEXT");
			if ( wglGetExtensionsString == 0L )
				return;

			wglExtensions = memDecodeASCII(memByteBufferNT1(nwglGetExtensionsStringEXT(wglGetExtensionsString)));
		}

		final StringTokenizer tokenizer = new StringTokenizer(wglExtensions);
		while ( tokenizer.hasMoreTokens() )
			supportedExtensions.add(tokenizer.nextToken());
	}

	static <T extends FunctionMap> T checkExtension(final String extension, final T functions, final boolean supported) {
		if ( supported )
			return functions;
		else {
			if ( LWJGLUtil.DEBUG )
				System.err.println("[GL] " + extension + " was reported as available but an entry point is missing.");

			return null;
		}
	}

}
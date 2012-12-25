/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.windows.WindowsLibrary;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.WGLARBExtensionsString.*;
import static org.lwjgl.opengl.WGLEXTExtensionsString.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WGL.*;
import static org.lwjgl.system.windows.WinBase.*;

public class GLContext {

	private static final FunctionProvider functionProvider;

	static {
		switch ( LWJGLUtil.getPlatform() ) {
			case LWJGLUtil.PLATFORM_WINDOWS:
				functionProvider = new FunctionProvider() {

					private final WindowsLibrary OPENGL = new WindowsLibrary("opengl32.dll");

					public long getFunctionAddress(final String functionName) {
						final ByteBuffer nameBuffer = memEncodeASCII(functionName);

						long address = wglGetProcAddress(nameBuffer);
						if ( address == 0 )
							address = GetProcAddress(OPENGL.getHandle(), nameBuffer);

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

	private static final ThreadLocal<Context> contextTL = new ThreadLocal<Context>();

	public GLContext() {
	}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	static void setCurrent(final Context context) {
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
		final long GetError = functionProvider.getFunctionAddress("glGetError");
		final long GetString = functionProvider.getFunctionAddress("glGetString");
		final long GetIntegerv = functionProvider.getFunctionAddress("glGetIntegerv");

		if ( GetError == 0L || GetString == 0L || GetIntegerv == 0L )
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

		if ( true || majorVersion < 3 ) {
			// Parse EXTENSIONS string
			final String extensionsString = memDecodeUTF8(memByteBufferNT1(checkPointer(nglGetString(GL_EXTENSIONS, GetString))));

			final StringTokenizer tokenizer = new StringTokenizer(extensionsString);
			while ( tokenizer.hasMoreTokens() )
				supportedExtensions.add(tokenizer.nextToken());
		} else {
			final IntBuffer param = BufferUtils.createIntBuffer(1);

			// TODO: Implement
			final long GetStringi = checkFunctionAddress(functionProvider.getFunctionAddress("glGetStringi"));

			// Use forward compatible indexed EXTENSIONS
			nglGetIntegerv(0x821D, memAddress(param), GetIntegerv); // GL_NUM_EXTENSIONS
			final int extensionCount = param.get(0);

			/*for ( int i = 0; i < extensionCount; i++ )
				supportedExtensions.add(memDecodeUTF8(memByteBufferNT1(nglGetStringi(GL_EXTENSIONS, i, GetStringi)));*/

			if ( supportedExtensions.contains("OpenGL31") && !supportedExtensions.contains("GL_ARB_compatibility") ) {
				if ( supportedExtensions.contains("OpenGL32") ) {
					nglGetIntegerv(0x9126, memAddress(param), GetIntegerv); // GL_CONTEXT_PROFILE_MASK
					if ( (param.get(0) & 0x2) == 0 ) // GL_CONTEXT_COMPATIBILITY_PROFILE_BIT
						forwardCompatible = true;
				} else
					forwardCompatible = true;
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

}
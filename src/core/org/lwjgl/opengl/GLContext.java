/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.system.FunctionProvider;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.windows.WinBase;
import org.lwjgl.system.windows.WindowsLibrary;

import java.nio.ByteBuffer;

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

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.opengl.AMDDebugOutput.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link AMDDebugOutput#glDebugMessageCallbackAMD(DEBUGPROCAMD)} method. */
public class DEBUGPROCAMD {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(DEBUGPROCAMD.class.getDeclaredMethod(
				"invoke", int.class, int.class, int.class, int.class, long.class
			));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public DEBUGPROCAMD() {
	}

	private static native long setCallback(Method callback);

	static long register(final Functions context, final DEBUGPROCAMD proc) {
		if ( context.DEBUGPROCAMD != 0L )
			memGlobalRefDelete(context.DEBUGPROCAMD);

		return context.DEBUGPROCAMD = proc == null ? 0L : memGlobalRefNew(proc);
	}

	/**
	 * This method will be called when an AMD_debug_output message is generated. It should be overriden if custom behavior is desired.
	 * The default implementation will print the message details on the standard error stream.
	 *
	 * @param id       the message ID
	 * @param source   the message category
	 * @param severity the message severity
	 * @param length   the message length
	 * @param message  a pointer to the message characters
	 */
	public void invoke(final int id, final int category, final int severity, final int length, final long message) {
		invoke(id, category, severity, memByteBuffer(message, length));
	}

	/** Alternative version of {@link #invoke(int, int, int, long, long)}. */
	public void invoke(final int id, final int category, final int severity, final ByteBuffer message) {
		invoke(id, category, severity, memDecodeUTF8(message));
	}

	/** String version of {@link #invoke(int, int, int, long, long)}. */
	public void invoke(final int id, final int category, final int severity, final String message) {
		System.err.println("[LWJGL] AMD_debug_output message");
		System.err.println("\tID: " + id);

		String description;
		switch ( category ) {
			case GL_DEBUG_CATEGORY_API_ERROR_AMD:
				description = "API ERROR";
				break;
			case GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD:
				description = "WINDOW SYSTEM";
				break;
			case GL_DEBUG_CATEGORY_DEPRECATION_AMD:
				description = "DEPRECATION";
				break;
			case GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD:
				description = "UNDEFINED BEHAVIOR";
				break;
			case GL_DEBUG_CATEGORY_PERFORMANCE_AMD:
				description = "PERFORMANCE";
				break;
			case GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD:
				description = "SHADER COMPILER";
				break;
			case GL_DEBUG_CATEGORY_APPLICATION_AMD:
				description = "APPLICATION";
				break;
			case GL_DEBUG_CATEGORY_OTHER_AMD:
				description = "OTHER";
				break;
			default:
				description = printUnknownToken(category);
		}
		System.err.println("\tCategory: " + description);

		switch ( severity ) {
			case GL_DEBUG_SEVERITY_HIGH_AMD:
				description = "HIGH";
				break;
			case GL_DEBUG_SEVERITY_MEDIUM_AMD:
				description = "MEDIUM";
				break;
			case GL_DEBUG_SEVERITY_LOW_AMD:
				description = "LOW";
				break;
			default:
				description = printUnknownToken(severity);
		}
		System.err.println("\tSeverity: " + description);

		System.err.println("\tMessage: " + message);
	}

	private static String printUnknownToken(final int token) {
		return "Unknown (0x" + Integer.toHexString(token).toUpperCase() + ")";
	}

}
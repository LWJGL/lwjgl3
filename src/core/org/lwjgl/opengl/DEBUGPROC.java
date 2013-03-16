/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be passed to the {@link GL43#glDebugMessageCallback(DEBUGPROC)} method. */
public class DEBUGPROC {

	static final long CALLBACK;

	static {
		try {
			CALLBACK = setCallback(DEBUGPROC.class.getDeclaredMethod(
				"invoke", int.class, int.class, int.class, int.class, int.class, long.class
			));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public DEBUGPROC() {
	}

	private static native long setCallback(Method callback);

	static long register(GL43.Functions context, DEBUGPROC proc) {
		if ( context.DEBUGPROC != 0L )
			memGlobalRefDelete(context.DEBUGPROC);

		return context.DEBUGPROC = proc == null ? 0L : memGlobalRefNew(proc);
	}

	/**
	 * This method will be called when an KHR_debug message is generated. It should be overriden if custom behavior is desired.
	 * The default implementation will print the message details on the standard error stream.
	 *
	 * @param source   the message source
	 * @param type     the message type
	 * @param id       the message ID
	 * @param severity the message severity
	 * @param length   the message length
	 * @param message  a pointer to the message characters
	 */
	public void invoke(int source, int type, int id, int severity, int length, long message) {
		invoke(source, type, id, severity, memByteBuffer(message, length));
	}

	/** Alternative version of {@link #invoke(int, int, int, int, int, long)}. */
	public void invoke(int source, int type, int id, int severity, ByteBuffer message) {
		invoke(source, type, id, severity, memDecodeUTF8(message));
	}

	/** String version of {@link #invoke(int, int, int, int, int, long)}. */
	public void invoke(int source, int type, int id, int severity, String message) {
		System.err.println("[LWJGL] KHR_debug message");
		System.err.println("\tID: " + id);

		String description;
		switch ( source ) {
			case GL_DEBUG_SOURCE_API:
				description = "API";
				break;
			case GL_DEBUG_SOURCE_WINDOW_SYSTEM:
				description = "WINDOW SYSTEM";
				break;
			case GL_DEBUG_SOURCE_SHADER_COMPILER:
				description = "SHADER COMPILER";
				break;
			case GL_DEBUG_SOURCE_THIRD_PARTY:
				description = "THIRD PARTY";
				break;
			case GL_DEBUG_SOURCE_APPLICATION:
				description = "APPLICATION";
				break;
			case GL_DEBUG_SOURCE_OTHER:
				description = "OTHER";
				break;
			default:
				description = printUnknownToken(source);
		}
		System.err.println("\tSource: " + description);

		switch ( type ) {
			case GL_DEBUG_TYPE_ERROR:
				description = "ERROR";
				break;
			case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR:
				description = "DEPRECATED BEHAVIOR";
				break;
			case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR:
				description = "UNDEFINED BEHAVIOR";
				break;
			case GL_DEBUG_TYPE_PORTABILITY:
				description = "PORTABILITY";
				break;
			case GL_DEBUG_TYPE_PERFORMANCE:
				description = "PERFORMANCE";
				break;
			case GL_DEBUG_TYPE_OTHER:
				description = "OTHER";
				break;
			case GL_DEBUG_TYPE_MARKER:
				description = "MARKER";
				break;
			default:
				description = printUnknownToken(type);
		}
		System.err.println("\tType: " + description);

		switch ( severity ) {
			case GL_DEBUG_SEVERITY_HIGH:
				description = "HIGH";
				break;
			case GL_DEBUG_SEVERITY_MEDIUM:
				description = "MEDIUM";
				break;
			case GL_DEBUG_SEVERITY_LOW:
				description = "LOW";
				break;
			case GL_DEBUG_SEVERITY_NOTIFICATION:
				description = "NOTIFICATION";
				break;
			default:
				description = printUnknownToken(severity);
		}
		System.err.println("\tSeverity: " + description);

		System.err.println("\tMessage: " + message);
	}

	private static String printUnknownToken(int token) {
		return "Unknown (" + LWJGLUtil.toHexString(token) + ")";
	}

}
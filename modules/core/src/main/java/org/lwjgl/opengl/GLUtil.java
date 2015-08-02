/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.system.libffi.Closure;

import java.io.PrintStream;

import static org.lwjgl.LWJGLUtil.*;
import static org.lwjgl.opengl.AMDDebugOutput.*;
import static org.lwjgl.opengl.ARBDebugOutput.*;
import static org.lwjgl.opengl.ARBImaging.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** OpenGL utilities. */
public final class GLUtil {

	private GLUtil() {
	}

	/**
	 * Checks the current context for OpenGL errors.
	 *
	 * @throws OpenGLException if {@link GL11#glGetError GetError} returns anything other than {@link GL11#GL_NO_ERROR NO_ERROR}
	 */
	public void checkGLError() throws OpenGLException {
		int err = glGetError();
		if ( err != GL_NO_ERROR )
			throw new OpenGLException(err);
	}

	/**
	 * Translates an OpenGL error code to a String describing the error.
	 *
	 * @param errorCode the error code, as returned by {@link GL11#glGetError GetError}.
	 *
	 * @return the error description
	 */
	public static String getErrorString(int errorCode) {
		switch ( errorCode ) {
			case GL_NO_ERROR:
				return "No error";
			case GL_INVALID_ENUM:
				return "Enum argument out of range";
			case GL_INVALID_VALUE:
				return "Numeric argument out of range";
			case GL_INVALID_OPERATION:
				return "Operation illegal in current state";
			case GL_STACK_OVERFLOW:
				return "Command would cause a stack overflow";
			case GL_STACK_UNDERFLOW:
				return "Command would cause a stack underflow";
			case GL_OUT_OF_MEMORY:
				return "Not enough memory left to execute command";
			case GL_INVALID_FRAMEBUFFER_OPERATION:
				return "Framebuffer object is not complete";
			case GL_TABLE_TOO_LARGE:
				return "The specified table is too large";
			default:
				return apiUnknownToken(errorCode);
		}
	}

	/**
	 * Detects the best debug output functionality to use and creates a callback that prints information to the standard error stream. The callback function is
	 * returned as a {@link Closure}, that should be {@link Closure#release released} when no longer needed.
	 */
	public static Closure setupDebugMessageCallback() {
		return setupDebugMessageCallback(System.err);
	}

	/**
	 * Detects the best debug output functionality to use and creates a callback that prints information to the specified {@link java.io.PrintStream}. The
	 * callback function is returned as a {@link Closure}, that should be {@link Closure#release released} when no longer needed.
	 *
	 * @param stream the output PrintStream
	 */
	public static Closure setupDebugMessageCallback(PrintStream stream) {
		GLCapabilities caps = GL.getCapabilities();

		if ( caps.OpenGL43 ) {
			log("[GL] Using OpenGL 4.3 for error logging.");
			GLDebugMessageCallback proc = createDEBUGPROC(stream);
			glDebugMessageCallback(proc, NULL);
			if ( (glGetInteger(GL_CONTEXT_FLAGS) & GL_CONTEXT_FLAG_DEBUG_BIT) == 0 ) {
				log("[GL] Warning: A non-debug context may not produce any debug output.");
				glEnable(GL_DEBUG_OUTPUT);
			}
			return proc;
		}

		if ( caps.GL_KHR_debug ) {
			log("[GL] Using KHR_debug for error logging.");
			GLDebugMessageCallback proc = createDEBUGPROC(stream);
			KHRDebug.glDebugMessageCallback(proc, NULL);
			if ( caps.OpenGL30 && (glGetInteger(GL_CONTEXT_FLAGS) & GL_CONTEXT_FLAG_DEBUG_BIT) == 0 ) {
				log("[GL] Warning: A non-debug context may not produce any debug output.");
				glEnable(GL_DEBUG_OUTPUT);
			}
			return proc;
		}

		if ( caps.GL_ARB_debug_output ) {
			log("[GL] Using ARB_debug_output for error logging.");
			GLDebugMessageARBCallback proc = createDEBUGPROCARB(stream);
			glDebugMessageCallbackARB(proc, NULL);
			return proc;
		}

		if ( caps.GL_AMD_debug_output ) {
			log("[GL] Using AMD_debug_output for error logging.");
			GLDebugMessageAMDCallback proc = createDEBUGPROCAMD(stream);
			glDebugMessageCallbackAMD(proc, NULL);
			return proc;
		}

		log("[GL] No debug output implementation is available.");
		return null;
	}

	private static void printDetail(PrintStream stream, String type, String message) {
		stream.printf("\t%s: %s\n", type, message);
	}

	private static GLDebugMessageCallback createDEBUGPROC(final PrintStream stream) {
		return new GLDebugMessageCallback() {
			@Override
			public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
				stream.println("[LWJGL] OpenGL debug message");
				printDetail(stream, "ID", String.format("0x%X", id));
				printDetail(stream, "Source", getSource(source));
				printDetail(stream, "Type", getType(type));
				printDetail(stream, "Severity", getSeverity(severity));
				printDetail(stream, "Message", memDecodeUTF8(memByteBuffer(message, length)));
			}

			private String getSource(int source) {
				switch ( source ) {
					case GL_DEBUG_SOURCE_API:
						return "API";
					case GL_DEBUG_SOURCE_WINDOW_SYSTEM:
						return "WINDOW SYSTEM";
					case GL_DEBUG_SOURCE_SHADER_COMPILER:
						return "SHADER COMPILER";
					case GL_DEBUG_SOURCE_THIRD_PARTY:
						return "THIRD PARTY";
					case GL_DEBUG_SOURCE_APPLICATION:
						return "APPLICATION";
					case GL_DEBUG_SOURCE_OTHER:
						return "OTHER";
					default:
						return apiUnknownToken(source);
				}
			}

			private String getType(int type) {
				switch ( type ) {
					case GL_DEBUG_TYPE_ERROR:
						return "ERROR";
					case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR:
						return "DEPRECATED BEHAVIOR";
					case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR:
						return "UNDEFINED BEHAVIOR";
					case GL_DEBUG_TYPE_PORTABILITY:
						return "PORTABILITY";
					case GL_DEBUG_TYPE_PERFORMANCE:
						return "PERFORMANCE";
					case GL_DEBUG_TYPE_OTHER:
						return "OTHER";
					case GL_DEBUG_TYPE_MARKER:
						return "MARKER";
					default:
						return apiUnknownToken(type);
				}
			}

			private String getSeverity(int severity) {
				switch ( severity ) {
					case GL_DEBUG_SEVERITY_HIGH:
						return "HIGH";
					case GL_DEBUG_SEVERITY_MEDIUM:
						return "MEDIUM";
					case GL_DEBUG_SEVERITY_LOW:
						return "LOW";
					case GL_DEBUG_SEVERITY_NOTIFICATION:
						return "NOTIFICATION";
					default:
						return apiUnknownToken(severity);
				}
			}
		};
	}

	private static GLDebugMessageARBCallback createDEBUGPROCARB(final PrintStream stream) {
		return new GLDebugMessageARBCallback() {
			@Override
			public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
				stream.println("[LWJGL] ARB_debug_output message");
				printDetail(stream, "ID", String.format("0x%X", id));
				printDetail(stream, "Source", getSource(source));
				printDetail(stream, "Type", getType(type));
				printDetail(stream, "Severity", getSeverity(severity));
				printDetail(stream, "Message", memDecodeUTF8(memByteBuffer(message, length)));
			}

			private String getSource(int source) {
				switch ( source ) {
					case GL_DEBUG_SOURCE_API_ARB:
						return "API";
					case GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB:
						return "WINDOW SYSTEM";
					case GL_DEBUG_SOURCE_SHADER_COMPILER_ARB:
						return "SHADER COMPILER";
					case GL_DEBUG_SOURCE_THIRD_PARTY_ARB:
						return "THIRD PARTY";
					case GL_DEBUG_SOURCE_APPLICATION_ARB:
						return "APPLICATION";
					case GL_DEBUG_SOURCE_OTHER_ARB:
						return "OTHER";
					default:
						return apiUnknownToken(source);
				}
			}

			private String getType(int type) {
				switch ( type ) {
					case GL_DEBUG_TYPE_ERROR_ARB:
						return "ERROR";
					case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB:
						return "DEPRECATED BEHAVIOR";
					case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB:
						return "UNDEFINED BEHAVIOR";
					case GL_DEBUG_TYPE_PORTABILITY_ARB:
						return "PORTABILITY";
					case GL_DEBUG_TYPE_PERFORMANCE_ARB:
						return "PERFORMANCE";
					case GL_DEBUG_TYPE_OTHER_ARB:
						return "OTHER";
					default:
						return apiUnknownToken(type);
				}
			}

			private String getSeverity(int severity) {
				switch ( severity ) {
					case GL_DEBUG_SEVERITY_HIGH_ARB:
						return "HIGH";
					case GL_DEBUG_SEVERITY_MEDIUM_ARB:
						return "MEDIUM";
					case GL_DEBUG_SEVERITY_LOW_ARB:
						return "LOW";
					default:
						return apiUnknownToken(severity);
				}
			}
		};
	}

	private static GLDebugMessageAMDCallback createDEBUGPROCAMD(final PrintStream stream) {
		return new GLDebugMessageAMDCallback() {
			@Override
			public void invoke(int id, int category, int severity, int length, long message, long userParam) {
				stream.println("[LWJGL] AMD_debug_output message");
				printDetail(stream, "ID", String.format("0x%X", id));
				printDetail(stream, "Category", getCategory(category));
				printDetail(stream, "Severity", getSeverity(severity));
				printDetail(stream, "Message", memDecodeUTF8(memByteBuffer(message, length)));
			}

			private String getCategory(int category) {
				switch ( category ) {
					case GL_DEBUG_CATEGORY_API_ERROR_AMD:
						return "API ERROR";
					case GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD:
						return "WINDOW SYSTEM";
					case GL_DEBUG_CATEGORY_DEPRECATION_AMD:
						return "DEPRECATION";
					case GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD:
						return "UNDEFINED BEHAVIOR";
					case GL_DEBUG_CATEGORY_PERFORMANCE_AMD:
						return "PERFORMANCE";
					case GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD:
						return "SHADER COMPILER";
					case GL_DEBUG_CATEGORY_APPLICATION_AMD:
						return "APPLICATION";
					case GL_DEBUG_CATEGORY_OTHER_AMD:
						return "OTHER";
					default:
						return apiUnknownToken(category);
				}
			}

			private String getSeverity(int severity) {
				switch ( severity ) {
					case GL_DEBUG_SEVERITY_HIGH_AMD:
						return "HIGH";
					case GL_DEBUG_SEVERITY_MEDIUM_AMD:
						return "MEDIUM";
					case GL_DEBUG_SEVERITY_LOW_AMD:
						return "LOW";
					default:
						return apiUnknownToken(severity);
				}
			}
		};
	}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Pointer;
import org.lwjgl.system.libffi.Closure;

import java.io.PrintStream;

import static org.lwjgl.LWJGLUtil.*;
import static org.lwjgl.opengl.AMDDebugOutput.*;
import static org.lwjgl.opengl.ARBDebugOutput.*;
import static org.lwjgl.opengl.ARBImaging.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This class is a wrapper over an OS-specific OpenGL context handle and provides basic functionality related to OpenGL contexts. */
public abstract class GLContext implements Pointer {

	final ContextCapabilities capabilities;

	protected GLContext(ContextCapabilities capabilities) {
		this.capabilities = capabilities;

		GL.setCurrent(this);
	}

	public static GLContext createFromCurrent() {
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				return GLContextWindows.createFromCurrent();
			case LINUX:
				return GLContextLinux.createFromCurrent();
			case MACOSX:
				return GLContextMacOSX.createFromCurrent();
			default:
				throw new IllegalStateException();
		}
	}

	/**
	 * Returns the {@code ContextCapabilities} instance that describes the capabilities of this context.
	 *
	 * @return the {@code ContextCapabilities} instance associated with this context
	 */
	public ContextCapabilities getCapabilities() {
		return capabilities;
	}

	/**
	 * Makes the context current in the current thread and associates with the device/drawable specified by the {@code target} handle for both draw and read
	 * operations.
	 * <p/>
	 * The {@code target} handle is OS-specific.
	 *
	 * @param target the device/drawable to associate the context with
	 *
	 * @see GL#setCurrent(GLContext)
	 */
	public void makeCurrent(long target) {
		makeCurrentImpl(target);
		GL.setCurrent(this);
	}

	/**
	 * Makes the context current in the current thread and associates with the device/drawable specified by the {@code targetDraw} handle for draw operations
	 * and the device/drawable specified by the {@code targetRead} handle for read operations. This functionality is optional as it may not be supported by
	 * the OpenGL implementation. The user must check the availability of the corresponding OpenGL extension before calling this method.
	 * <p/>
	 * The {@code targetDraw} and {@code targetRead} handles are OS-specific.
	 *
	 * @param targetDraw the device/drawable to associate the context with for draw operations
	 * @param targetRead the device/drawable to associate the context with for read operations
	 *
	 * @throws OpenGLException if separate associations are not supported
	 */
	public void makeCurrent(long targetDraw, long targetRead) {
		makeCurrentImpl(targetDraw, targetRead);
		GL.setCurrent(this);
	}

	protected abstract void makeCurrentImpl(long target);

	protected abstract void makeCurrentImpl(long targetDraw, long targetRead);

	/** Returns true if this {@code GLContext} is current in the current thread. */
	public abstract boolean isCurrent();

	/** Destroys this {@code GLContext} and releases any resources associated with it. */
	public void destroy() {
		destroyImpl();
	}

	protected abstract void destroyImpl();

	/**
	 * Checks the current context for OpenGL errors and throws an {@link OpenGLException} if {@link GL11#glGetError GetError} returns anything else than {@link
	 * GL11#GL_NO_ERROR NO_ERROR}.
	 */
	public void checkGLError() throws OpenGLException {
		int err = nglGetError(capabilities.__GL11.GetError);
		if ( err != GL_NO_ERROR )
			throw new OpenGLException(err);
	}

	/** Translates an OpenGL error code to a String describing the error. */
	public static String translateGLErrorString(int errorCode) {
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
				return getUnknownToken(errorCode);
		}
	}

	private static String getUnknownToken(int token) {
		return String.format("Unknown (0x%X)", token);
	}

	/**
	 * Detects the best debug output functionality to use and creates a callback that prints information to the standard error stream. The callback function is
	 * returned as a {@link Closure}, that should be {@link Closure#release released} when no longer needed.
	 */
	public Closure setupDebugMessageCallback() {
		return setupDebugMessageCallback(System.err);
	}

	/**
	 * Detects the best debug output functionality to use and creates a callback that prints information to the specified {@link java.io.PrintStream}. The
	 * callback function is returned as a {@link Closure}, that should be {@link Closure#release released} when no longer needed.
	 *
	 * @param stream the output PrintStream
	 */
	public Closure setupDebugMessageCallback(PrintStream stream) {
		if ( capabilities.OpenGL43 ) {
			log("[GL] Using OpenGL 4.3 for error logging.");
			GLDebugMessageCallback proc = createDEBUGPROC(stream);
			glDebugMessageCallback(proc, NULL);
			if ( (glGetInteger(GL_CONTEXT_FLAGS) & GL_CONTEXT_FLAG_DEBUG_BIT) == 0 ) {
				log("[GL] Warning: A non-debug context may not produce any debug output.");
				glEnable(GL_DEBUG_OUTPUT);
			}
			return proc;
		}

		if ( capabilities.GL_KHR_debug ) {
			log("[GL] Using KHR_debug for error logging.");
			GLDebugMessageCallback proc = createDEBUGPROC(stream);
			KHRDebug.glDebugMessageCallback(proc, NULL);
			if ( (glGetInteger(GL_CONTEXT_FLAGS) & GL_CONTEXT_FLAG_DEBUG_BIT) == 0 ) {
				log("[GL] Warning: A non-debug context may not produce any debug output.");
				glEnable(GL_DEBUG_OUTPUT);
			}
			return proc;
		}

		if ( capabilities.GL_ARB_debug_output ) {
			log("[GL] Using ARB_debug_output for error logging.");
			GLDebugMessageARBCallback proc = createDEBUGPROCARB(stream);
			glDebugMessageCallbackARB(proc, NULL);
			return proc;
		}

		if ( capabilities.GL_AMD_debug_output ) {
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
						return getUnknownToken(source);
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
						return getUnknownToken(type);
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
						return getUnknownToken(severity);
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
						return getUnknownToken(source);
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
						return getUnknownToken(type);
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
						return getUnknownToken(severity);
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
						return getUnknownToken(category);
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
						return getUnknownToken(severity);
				}
			}
		};
	}

}
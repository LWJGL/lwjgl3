/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.opengl.GL43.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link GL43#glDebugMessageCallback(DEBUGPROC)} method. */
/*@FunctionalInterface*/
public interface DEBUGPROC {

	/**
	 * This method will be called when an KHR_debug message is generated.
	 *
	 * @param source   the message source
	 * @param type     the message type
	 * @param id       the message ID
	 * @param severity the message severity
	 * @param length   the message length
	 * @param message  a pointer to the message characters
	 */
	void invoke(int source, int type, int id, int severity, int length, long message);

	/** Extends {@code DEBUGPROC} with an alternative version that accepts a string. */
	/*@FunctionalInterface*/
	interface Str extends DEBUGPROC {
		/*@Override
		default void invoke(int source, int type, int id, int severity, int length, long message) {
			invoke(source, type, id, severity, memDecodeUTF8(memByteBuffer(message, length)));
		}*/

		/** String version of {@link #invoke(int, int, int, int, int, long)}. */
		void invoke(int source, int type, int id, int severity, String message);
	}

	/** A {@link DEBUGPROC.Str} adapter. */
	abstract class StrAdapter implements Str {
		@Override
		public void invoke(int source, int type, int id, int severity, int length, long message) {
			invoke(source, type, id, severity, memByteBuffer(message, length));
		}

		/** Alternative version of {@link #invoke(int, int, int, int, int, long)}. */
		public void invoke(int source, int type, int id, int severity, ByteBuffer message) {
			invoke(source, type, id, severity, memDecodeUTF8(message));
		}

		@Override
		public void invoke(int source, int type, int id, int severity, String message) {
		}
	}

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(DEBUGPROC.class, int.class, int.class, int.class, int.class, int.class, long.class));

		private static final DEBUGPROC DEFAULT = new StrAdapter() {
			@Override
			public void invoke(int source, int type, int id, int severity, String message) {
				System.err.println("[LWJGL] KHR_debug message");
				printDetail("ID", Integer.toString(id));

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
						description = getUnknownToken(source);
				}
				printDetail("Source", description);

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
						description = getUnknownToken(type);
				}
				printDetail("Type", description);

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
						description = getUnknownToken(severity);
				}
				printDetail("Severity", description);

				printDetail("Message", message);
			}

			private String getUnknownToken(int token) {
				return String.format("Unknown (0x%X)", token);
			}

			private void printDetail(String type, String message) {
				System.err.printf("\t%s: %s\n", type, message);
			}
		};

		private Util() {
		}

		private static native long setCallback(Method callback);

		static long register(GL43.Functions context, DEBUGPROC proc) {
			if ( context.DEBUGPROC != NULL )
				memGlobalRefDelete(context.DEBUGPROC);

			return context.DEBUGPROC = proc == null ? NULL : memGlobalRefNew(proc);
		}

		/**
		 * Returns a default {@code DEBUGPROC} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static DEBUGPROC getDefault() {
			return DEFAULT;
		}

	}

}
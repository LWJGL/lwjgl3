/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.opengl.ARBDebugOutput.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link ARBDebugOutput#glDebugMessageCallbackARB(DEBUGPROCARB) DebugMessageCallbackARB} method. */
/*@FunctionalInterface*/
public interface DEBUGPROCARB {

	/**
	 * This method will be called when an ARB_debug_output message is generated.
	 *
	 * @param source   the message source
	 * @param type     the message type
	 * @param id       the message ID
	 * @param severity the message severity
	 * @param length   the message length
	 * @param message  a pointer to the message characters
	 */
	void invoke(int source, int type, int id, int severity, int length, long message);

	/** Extends {@code DEBUGPROCARB} with an alternative version that accepts a string. */
	/*@FunctionalInterface*/
	interface Str extends DEBUGPROCARB {
		/*@Override
		default void invoke(int source, int type, int id, int severity, int length, long message) {
			invoke(source, type, id, severity, memDecodeUTF8(memByteBuffer(message, length)));
		}*/

		/** String version of {@link #invoke(int, int, int, int, int, long)}. */
		void invoke(int source, int type, int id, int severity, String message);
	}

	/** A {@link org.lwjgl.opengl.DEBUGPROCARB.Str} adapter. */
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

		static final long CALLBACK = setCallback(apiCallbackMethod(DEBUGPROCARB.class, int.class, int.class, int.class, int.class, long.class));

		private static final DEBUGPROCARB DEFAULT = new StrAdapter() {
			@Override
			public void invoke(int source, int type, int id, int severity, String message) {
				System.err.println("[LWJGL] ARB_debug_output message");
				printDetail("ID", String.format("0x%X", id));

				String description;
				switch ( source ) {
					case GL_DEBUG_SOURCE_API_ARB:
						description = "API";
						break;
					case GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB:
						description = "WINDOW SYSTEM";
						break;
					case GL_DEBUG_SOURCE_SHADER_COMPILER_ARB:
						description = "SHADER COMPILER";
						break;
					case GL_DEBUG_SOURCE_THIRD_PARTY_ARB:
						description = "THIRD PARTY";
						break;
					case GL_DEBUG_SOURCE_APPLICATION_ARB:
						description = "APPLICATION";
						break;
					case GL_DEBUG_SOURCE_OTHER_ARB:
						description = "OTHER";
						break;
					default:
						description = getUnknownToken(source);
				}
				printDetail("Source", description);

				switch ( type ) {
					case GL_DEBUG_TYPE_ERROR_ARB:
						description = "ERROR";
						break;
					case GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB:
						description = "DEPRECATED BEHAVIOR";
						break;
					case GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB:
						description = "UNDEFINED BEHAVIOR";
						break;
					case GL_DEBUG_TYPE_PORTABILITY_ARB:
						description = "PORTABILITY";
						break;
					case GL_DEBUG_TYPE_PERFORMANCE_ARB:
						description = "PERFORMANCE";
						break;
					case GL_DEBUG_TYPE_OTHER_ARB:
						description = "OTHER";
						break;
					default:
						description = getUnknownToken(type);
				}
				printDetail("Type", description);

				switch ( severity ) {
					case GL_DEBUG_SEVERITY_HIGH_ARB:
						description = "HIGH";
						break;
					case GL_DEBUG_SEVERITY_MEDIUM_ARB:
						description = "MEDIUM";
						break;
					case GL_DEBUG_SEVERITY_LOW_ARB:
						description = "LOW";
						break;
					default:
						description = getUnknownToken(type);
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

		static long register(ARBDebugOutput context, DEBUGPROCARB proc) {
			if ( context.refDEBUGPROCARB != NULL )
				memGlobalRefDelete(context.refDEBUGPROCARB);

			return context.refDEBUGPROCARB = proc == null ? NULL : memGlobalRefNew(proc);
		}

		/**
		 * Returns a default {@code DEBUGPROCARB} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static DEBUGPROCARB getDefault() {
			return DEFAULT;
		}

	}

}
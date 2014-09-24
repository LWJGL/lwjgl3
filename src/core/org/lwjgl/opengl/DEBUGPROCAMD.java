/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.opengl.AMDDebugOutput.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link AMDDebugOutput#glDebugMessageCallbackAMD(DEBUGPROCAMD) DebugMessageCallbackAMD} method. */
/*@FunctionalInterface*/
public interface DEBUGPROCAMD {

	/**
	 * This method will be called when an AMD_debug_output message is generated.
	 *
	 * @param id       the message ID
	 * @param category the message category
	 * @param severity the message severity
	 * @param length   the message length
	 * @param message  a pointer to the message characters
	 */
	void invoke(int id, int category, int severity, int length, long message);

	/** Extends {@code DEBUGPROCAMD} with an alternative version that accepts a string. */
	/*@FunctionalInterface*/
	interface Str extends DEBUGPROCAMD {
		/*@Override
		default void invoke(int id, category, int severity, int length, long message) {
			invoke(id, category, severity, memDecodeUTF8(memByteBuffer(message, length)));
		}*/

		/** String version of {@link #invoke(int, int, int, int, long)}. */
		void invoke(int id, int category, int severity, String message);
	}

	/** A {@link DEBUGPROCAMD.Str} adapter. */
	abstract class StrAdapter implements Str {
		@Override
		public void invoke(int id, int category, int severity, int length, long message) {
			invoke(id, category, severity, memByteBuffer(message, length));
		}

		/** Alternative version of {@link #invoke(int, int, int, int, long)}. */
		public void invoke(int id, int category, int severity, ByteBuffer message) {
			invoke(id, category, severity, memDecodeUTF8(message));
		}

		@Override
		public void invoke(int id, int category, int severity, String message) {
		}
	}

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(DEBUGPROCAMD.class, int.class, int.class, int.class, int.class, long.class));

		private static final DEBUGPROCAMD DEFAULT = new StrAdapter() {
			@Override
			public void invoke(int id, int category, int severity, String message) {
				System.err.println("[LWJGL] AMD_debug_output message");
				printDetail("ID", String.format("0x%X", id));

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
						description = getUnknownToken(category);
				}
				printDetail("Category", description);

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

		static long register(AMDDebugOutput context, DEBUGPROCAMD proc) {
			if ( context.refDEBUGPROCAMD != NULL )
				memGlobalRefDelete(context.refDEBUGPROCAMD);

			return context.refDEBUGPROCAMD = proc == null ? NULL : memGlobalRefNew(proc);
		}

		/**
		 * Returns a default {@code DEBUGPROCAMD} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static DEBUGPROCAMD getDefault() {
			return DEFAULT;
		}

	}

}
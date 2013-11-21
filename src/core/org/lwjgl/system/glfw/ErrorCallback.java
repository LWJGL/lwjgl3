/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.glfw;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link GLFW#glfwSetErrorCallback(ErrorCallback) SetErrorCallback} method. */
/*@FunctionalInterface*/
public interface ErrorCallback {

	/**
	 * This method will be called when a GLFW error is generated.
	 *
	 * @param error       the error code
	 * @param description a pointer to a UTF-8 encoded string describing the error
	 */
	void invoke(int error, long description);

	/** Extends {@code ErrorCallback} with an alternative version that accepts a string. */
	/*@FunctionalInterface*/
	interface Str extends ErrorCallback {
		/*@Override
		default void invoke(int error, long description) {
			invoke(error, memDecodeUTF8(memByteBufferNT1(description)));
		}*/

		/**
		 * This method will be called when a GLFW error is generated.
		 *
		 * @param error       the error code
		 * @param description a string describing the error
		 */
		void invoke(int error, String description);
	}

	/** An {@link ErrorCallback.Str} adapter. */
	abstract class StrAdapter implements Str {
		@Override
		public void invoke(int error, long description) {
			invoke(error, memByteBufferNT1(description));
		}

		/** Alternative version that accepts a buffer. */
		public void invoke(int error, ByteBuffer description) {
			invoke(error, memDecodeUTF8(description));
		}

		@Override
		public void invoke(int error, String description) {
		}
	}

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(ErrorCallback.Util.class, int.class, long.class));

		private static final ErrorCallback DEFAULT = new StrAdapter() {
			@Override
			public void invoke(int error, String description) {
				System.err.print("[LWJGL] GLFW error");
				System.err.printf("\tCode: 0x%X\n", error);
				System.err.println("\tDescription: " + description);
				System.err.println("\tStacktrace:");
				StackTraceElement[] stack = Thread.currentThread().getStackTrace();
				for ( int i = 4; i < stack.length; i++ ) {
					System.err.print("\t\t");
					System.err.println(stack[i].toString());
				}
			}
		};

		private static ErrorCallback callback;

		private Util() {
		}

		private static native long setCallback(Method callback);

		static long register(ErrorCallback proc) {
			callback = proc;
			return proc == null ? NULL : CALLBACK;
		}

		private static void invoke(int error, long description) {
			callback.invoke(error, description);
		}

		/**
		 * Returns a default {@code ErrorCallback} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static ErrorCallback getDefault() {
			return DEFAULT;
		}

	}

}
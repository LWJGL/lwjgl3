/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.PointerBuffer;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this interface may be passed to the {@link CL10#clBuildProgram(long, PointerBuffer, ByteBuffer, CLProgramCallback) BuildProgram},
 * {@link CL12#clCompileProgram(long, PointerBuffer, ByteBuffer, PointerBuffer, PointerBuffer, CLProgramCallback) CompileProgram} and
 * {@link CL12#clLinkProgram(long, PointerBuffer, ByteBuffer, PointerBuffer, CLProgramCallback) LinkProgram} methods.
 */
/*@FunctionalInterface*/
public interface CLProgramCallback {

	void invoke(long cl_program);

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(CLProgramCallback.class, long.class));

		private static final CLProgramCallback DEFAULT_BUILD = new CLProgramCallback() {
			@Override
			public void invoke(long cl_program) {
				System.out.printf("[LWJGL] cl_program [0x%X] built\n", cl_program);
			}
		};

		private static final CLProgramCallback DEFAULT_COMPILE = new CLProgramCallback() {
			@Override
			public void invoke(long cl_program) {
				System.out.printf("[LWJGL] cl_program [0x%X] compiled\n", cl_program);
			}
		};

		private static final CLProgramCallback DEFAULT_LINK = new CLProgramCallback() {
			@Override
			public void invoke(long cl_program) {
				System.out.printf("[LWJGL] cl_program [0x%X] linked\n", cl_program);
			}
		};

		private Util() {
		}

		private static native long setCallback(Method callback);

		static long register(CLProgramCallback proc) {
			if ( proc == null )
				return NULL;

			return memGlobalRefNew(proc); // this global reference is deleted in native code (after invoke)
		}

		/**
		 * Returns a default {@code CLProgramCallback} implementation that prints a simple description in the standard output stream when the program is built.
		 *
		 * @return the default implementation
		 */
		public static CLProgramCallback getDefaultBuild() {
			return DEFAULT_BUILD;
		}

		/**
		 * Returns a default {@code CLProgramCallback} implementation that prints a simple description in the standard output stream when the program is
		 * compiled.
		 *
		 * @return the default implementation
		 */
		public static CLProgramCallback getDefaultCompile() {
			return DEFAULT_COMPILE;
		}

		/**
		 * Returns a default {@code CLProgramCallback} implementation that prints a simple description in the standard output stream when the program is
		 * linked.
		 *
		 * @return the default implementation
		 */
		public static CLProgramCallback getDefaultLink() {
			return DEFAULT_LINK;
		}

	}

}
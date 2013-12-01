/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/**
 * Instances of this interface may be passed to the {@link CL11#clSetMemObjectDestructorCallback(long,
 * CLMemObjectDestructorCallback) SetMemObjectDestructorCallback} method.
 */
/*@FunctionalInterface*/
public interface CLMemObjectDestructorCallback {

	/**
	 * Called when a memory object is being deleted. When the user callback is called by the implementation, the memory object is not longer valid.
	 * {@code cl_mem} is only provided for reference purposes.
	 *
	 * @param cl_mem the {@code cl_mem} object being deleted
	 */
	void invoke(long cl_mem);

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(CLMemObjectDestructorCallback.class, long.class));

		private static final CLMemObjectDestructorCallback DEFAULT = new CLMemObjectDestructorCallback() {
			@Override
			public void invoke(long cl_mem) {
				System.out.printf("[LWJGL] cl_mem object destroyed [0x%X]\n", cl_mem);
			}
		};

		private Util() {
		}

		private static native long setCallback(Method callback);

		/**
		 * Returns a default {@code CLMemObjectDestructorCallback} implementation that prints a simple description in the standard output stream.
		 *
		 * @return the default implementation
		 */
		public static CLMemObjectDestructorCallback getDefault() {
			return DEFAULT;
		}

	}

}
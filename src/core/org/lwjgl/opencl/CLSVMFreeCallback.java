/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl;

import org.lwjgl.PointerBuffer;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this interface may be passed to the {@link CL20#clEnqueueSVMFree(long, PointerBuffer, CLSVMFreeCallback, PointerBuffer,
 * PointerBuffer) EnqueueSVMFree} method.
 */
/*@FunctionalInterface*/
public interface CLSVMFreeCallback {

	/**
	 * The {@link CL20#clEnqueueSVMFree} callback.
	 *
	 * @param queue            the opaque pointer of the command queue in which {@link CL20#clEnqueueSVMFree} was enqueued
	 * @param num_svm_pointers the count of SVM pointers to free
	 * @param svm_pointers     the list of SVM pointers to free
	 */
	void invoke(long queue, int num_svm_pointers, long svm_pointers);

	/** Extends {@code CLSVMFreeCallback} with an alternative version that accepts a buffer. */
	/*@FunctionalInterface*/
	interface Buf extends CLSVMFreeCallback {
		/*@Override
		default void invoke(long queue, int num_svm_pointers, long svm_pointers) {
			invoke(queue, memPointerBuffer(svm_pointers, num_svm_pointers));
		}*/

		/**
		 * The {@link CL20#clEnqueueSVMFree} callback.
		 *
		 * @param queue        the opaque pointer of the command queue in which {@link CL20#clEnqueueSVMFree} was enqueued
		 * @param svm_pointers the list of SVM pointers to free
		 */
		void invoke(long queue, PointerBuffer svm_pointers);

	}

	/** A {@link CLSVMFreeCallback.Buf} adapter. */
	abstract class BufAdapter implements Buf {
		@Override
		public void invoke(long queue, int num_svm_pointers, long svm_pointers) {
			invoke(queue, memPointerBuffer(svm_pointers, num_svm_pointers));
		}
	}

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(CLSVMFreeCallback.class, long.class, int.class, long.class));

		private Util() {
		}

		private static native long setCallback(Method callback);

		static long register(CLSVMFreeCallback proc) {
			if ( proc == null )
				return NULL;

			return memGlobalRefNew(proc); // this global reference is deleted in native code (after invoke)
		}

	}

}
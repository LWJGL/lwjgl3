/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import static org.lwjgl.system.MemoryUtil.*;

/** A platform/device/context specific provider of native function addresses. */
public interface FunctionProviderLocal extends FunctionProvider {

	/**
	 * Returns the function address of the specified function for the platform, device
	 * or context specified by {@code handle}. If the function is not supported, 0L is
	 * returned.
	 *
	 * @param handle       the handle to a platform/device/context
	 * @param functionName the function name to query
	 *
	 * @return the function address or 0L if the function is not supported
	 */
	long getFunctionAddress(long handle, CharSequence functionName);

	abstract class Default extends Retainable.Default implements FunctionProviderLocal {
	}

	/** A {@code FunctionProviderLocal} implementation that always returns {@code NULL}. */
	FunctionProviderLocal DUMMY = new Default() {

		@Override
		public long getFunctionAddress(CharSequence functionName) {
			return NULL;
		}

		@Override
		public long getFunctionAddress(long handle, CharSequence functionName) {
			return NULL;
		}

		@Override
		protected void destroy() {
		}

	};

}
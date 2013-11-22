/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import static org.lwjgl.system.MemoryUtil.*;

/** A provider of native function addresses. */
public interface FunctionProvider extends Retainable {

	/**
	 * Returns the function address of the specified function. If the function
	 * is not supported by the platform or context, 0L is returned.
	 *
	 * @param functionName the function name to query
	 *
	 * @return the function address or 0L if the function is not supported
	 */
	long getFunctionAddress(CharSequence functionName);

	abstract class Default extends Retainable.Default implements FunctionProvider {
	}

	/** A {@code FunctionProvider} implementation that always returns {@code NULL}. */
	FunctionProvider DUMMY = new Default() {

		@Override
		public long getFunctionAddress(CharSequence functionName) {
			return NULL;
		}

		@Override
		protected void destroy() {
		}

	};

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryStack.*;

/** A provider of native function addresses. */
public interface FunctionProvider {

	/** {@link CharSequence} version of {@link #getFunctionAddress(ByteBuffer)}. */
	default long getFunctionAddress(CharSequence functionName) {
		MemoryStack stack = stackPush();
		try {
			return getFunctionAddress(stack.ASCII(functionName));
		} finally {
			stack.pop();
		}
	}

	/**
	 * Returns the function address of the specified function. If the function is not supported, returns 0L.
	 *
	 * @param functionName the encoded name of the function to query
	 *
	 * @return the function address or 0L if the function is not supported
	 */
	long getFunctionAddress(ByteBuffer functionName);

	/** Releases any resource held by this {@link FunctionProvider}. */
	void free();

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A provider of native function addresses. */
public interface FunctionProvider {

	/** {@link CharSequence} version of {@link #getFunctionAddress(ByteBuffer)}. */
	long getFunctionAddress(CharSequence functionName);

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

	abstract class Default implements FunctionProvider {

		@Override
		public long getFunctionAddress(CharSequence functionName) {
			MemoryStack stack = stackPush();
			try {
				ByteBuffer encoded = stack.malloc(functionName.length() + 1);
				memEncodeASCII(functionName, true, encoded);
				return getFunctionAddress(encoded);
			} finally {
				stack.pop();
			}
		}

	}

}
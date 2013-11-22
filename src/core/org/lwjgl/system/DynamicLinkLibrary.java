/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.Pointer;

import java.nio.ByteBuffer;

public interface DynamicLinkLibrary extends FunctionProvider, Pointer {

	/** Returns the library name. */
	String getName();

	/**
	 * Returns the address of a function in the library.
	 *
	 * @param name the function name
	 *
	 * @return the function address
	 */
	long getFunctionAddress(ByteBuffer name);

	abstract class Default extends Retainable.Default implements DynamicLinkLibrary {
	}

}
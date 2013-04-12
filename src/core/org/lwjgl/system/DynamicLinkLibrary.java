/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.nio.ByteBuffer;

public interface DynamicLinkLibrary {

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

	/** Alternative version of: {@link #getFunctionAddress(ByteBuffer)} */
	long getFunctionAddress(String name);

	/** Releases any resources held by the library. */
	void destroy();

}
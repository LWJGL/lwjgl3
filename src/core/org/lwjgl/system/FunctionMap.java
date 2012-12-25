/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

/**
 * Instances of this interface contain function addresses for a specific piece
 * of functionality for a platform or context.
 */
public interface FunctionMap {

	/**
	 * Checks if all functions in this {@code FunctionMap} are available (their addresses are all non-zero).
	 *
	 * @return true if all functions are available
	 */
	boolean isSupported();

}
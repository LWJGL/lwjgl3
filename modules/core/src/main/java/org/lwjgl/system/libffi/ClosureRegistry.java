/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi;

/**
 *
 */
public interface ClosureRegistry {

	/**
	 * Registers the specified {@link Closure} instance.
	 *
	 * @param closure the Closure instance to register
	 */
	void register(Closure closure);

}
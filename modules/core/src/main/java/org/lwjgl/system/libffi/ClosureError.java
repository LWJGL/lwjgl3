/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi;

/**
 * This error will be thrown by native code, if a {@link Closure} instance that
 * has been previously garbage collected is accessed by a callback invocation.
 */
public class ClosureError extends Error {

	private static final long serialVersionUID = 1L;

	public ClosureError() {
		super("Callback failed because the closure instance has been garbage collected.");
	}

}
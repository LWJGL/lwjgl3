/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.libffi;

import org.lwjgl.LWJGLUtil;

/**
 * This error will be thrown by native code, if a {@link Closure} instance that
 * has been previously garbage collected is accessed by a callback invocation.
 */
public class ClosureError extends Error {

	private static final long serialVersionUID = 1L;

	public ClosureError(String debug) {
		super("Callback failed because the closure instance has been garbage collected.");

		LWJGLUtil.DEBUG_STREAM.format("[LWJGL] ClosureError for closure: %s\n", debug);
		if ( !LWJGLUtil.DEBUG )
			LWJGLUtil.DEBUG_STREAM.println("[LWJGL] Enable debug mode to discover where the closure was instantiated.");
	}

}
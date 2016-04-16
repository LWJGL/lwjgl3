/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

/**
 * This error will be thrown by native code, if a {@link Callback} instance that
 * has been previously garbage collected is accessed by a callback invocation.
 */
public class CallbackError extends Error {

	private static final long serialVersionUID = 1L;

	public CallbackError() {
		this(null);
	}

	public CallbackError(String debug) {
		super("The callback instance has been garbage collected.");

		if ( debug != null )
			APIUtil.DEBUG_STREAM.format("[LWJGL] CallbackError for callback: %s\n", debug);
		if ( !Checks.DEBUG )
			APIUtil.DEBUG_STREAM.println("[LWJGL] Enable debug mode to discover where the callback was instantiated.");
	}

}
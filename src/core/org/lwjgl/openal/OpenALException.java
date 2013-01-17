/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.openal;

/**
 * A runtime exception thrown by LWJGL when it encounters an OpenAL error. The checks that
 * trigger this exception are only enabled when {@link org.lwjgl.LWJGLUtil#DEBUG} is true.
 */
public class OpenALException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OpenALException() {
		super();
	}

	public OpenALException(String message) {
		super(message);
	}

	public OpenALException(String message, Throwable cause) {
		super(message, cause);
	}

	public OpenALException(Throwable cause) {
		super(cause);
	}

}

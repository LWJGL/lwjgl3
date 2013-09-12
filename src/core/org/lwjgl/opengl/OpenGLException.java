/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

/**
 * A runtime exception thrown by LWJGL when it encounters an OpenGL error. The checks that
 * trigger this exception are only enabled when {@link org.lwjgl.LWJGLUtil#DEBUG} is true.
 */
public class OpenGLException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/** Constructor for OpenGLException. */
	public OpenGLException(int gl_error_code) {
		this(createErrorMessage(gl_error_code));
	}

	private static String createErrorMessage(int gl_error_code) {
		String error_string = Util.translateGLErrorString(gl_error_code);
		return error_string + " (" + gl_error_code + ")";
	}

	public OpenGLException(String message) {
		super(message);
	}

	public OpenGLException(String format, Object... args) {
		super(String.format(format, args));
	}

}

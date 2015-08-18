/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles;

/** A runtime exception thrown by LWJGL when it encounters an OpenGL ES error. */
public class OpenGLESException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OpenGLESException(int errorCode) {
		this(String.format("%s [0x%X]", GLESUtil.getErrorString(errorCode), errorCode));
	}

	public OpenGLESException(String message) {
		super(message);
	}

	public OpenGLESException(String format, Object... args) {
		super(String.format(format, args));
	}

}
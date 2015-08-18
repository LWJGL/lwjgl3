/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl;

/** A runtime exception thrown by LWJGL when it encounters an EGL error. */
public class EGLException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EGLException(int errorCode) {
		this(String.format("%s [0x%X]", EGLUtil.getErrorString(errorCode), errorCode));
	}

	public EGLException(String message) {
		super(message);
	}

	public EGLException(String format, Object... args) {
		super(String.format(format, args));
	}

}
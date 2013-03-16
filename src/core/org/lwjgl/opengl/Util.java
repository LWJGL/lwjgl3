/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import static org.lwjgl.opengl.ARBImaging.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;

/** Simple OpenGL utility class. */
public final class Util {

	private Util() {
	}

	/** Throws OpenGLException if glGetError() returns anything else than GL_NO_ERROR */
	public static void checkGLError() throws OpenGLException {
		int err = glGetError();
		if ( err != GL_NO_ERROR )
			throw new OpenGLException(err);
	}

	/** Translates an OpenGL error code to a String describing the error. */
	public static String translateGLErrorString(int errorCode) {
		switch ( errorCode ) {
			case GL_NO_ERROR:
				return "No error";
			case GL_INVALID_ENUM:
				return "Enum argument out of range";
			case GL_INVALID_VALUE:
				return "Numeric argument out of range";
			case GL_INVALID_OPERATION:
				return "Operation illegal in current state";
			case GL_STACK_OVERFLOW:
				return "Command would cause a stack overflow";
			case GL_STACK_UNDERFLOW:
				return "Command would cause a stack underflow";
			case GL_OUT_OF_MEMORY:
				return "Not enough memory left to execute command";
			case GL_INVALID_FRAMEBUFFER_OPERATION:
				return "Framebuffer object is not complete";
			case GL_TABLE_TOO_LARGE:
				return "The specified table is too large";
			default:
				return "Unknown error code";
		}
	}
}

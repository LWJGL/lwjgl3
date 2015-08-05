/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles;

import static org.lwjgl.opengles.GLES20.*;
import static org.lwjgl.system.APIUtil.*;

public final class GLESUtil {

	private GLESUtil() {

	}

	/**
	 * Translates an OpenGL ES error code to a String describing the error.
	 *
	 * @param errorCode the OpenGL ES error code, as returned by {@link GLES20#glGetError}
	 *
	 * @return a string with the error description
	 */
	public static String getErrorString(int errorCode) {
		switch ( errorCode ) {
			case GL_NO_ERROR:
				return "No error";
			case GL_INVALID_ENUM:
				return "Enum argument out of range";
			case GL_INVALID_VALUE:
				return "Numeric argument out of range";
			case GL_INVALID_OPERATION:
				return "Operation illegal in current state";
			case GL_OUT_OF_MEMORY:
				return "Not enough memory left to execute command";
			case GL_INVALID_FRAMEBUFFER_OPERATION:
				return "Framebuffer object is not complete";
			default:
				return apiUnknownToken(errorCode);
		}
	}

}
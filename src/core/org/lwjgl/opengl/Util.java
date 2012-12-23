/*
 * Copyright (c) 2002-2008 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.lwjgl.opengl;

import static org.lwjgl.opengl.GL11.*;

/** Simple OpenGL utility class. */
public final class Util {

	private Util() {
	}

	/** Throws OpenGLException if glGetError() returns anything else than GL_NO_ERROR */
	public static void checkGLError() throws OpenGLException {
		final int err = glGetError();
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
			// TODO: enable
			/*case GL_INVALID_FRAMEBUFFER_OPERATION:
				return "Framebuffer object is not complete";*/
			case GL_OUT_OF_MEMORY:
				return "Not enough memory left to execute command";
			case GL_STACK_OVERFLOW:
				return "Command would cause a stack overflow";
			case GL_STACK_UNDERFLOW:
				return "Commnad would cause a stack underflow";
			// TODO: enable
			/*case GL_TABLE_TOO_LARGE:
				return "The specified table is too large";*/
			default:
				return null;
		}
	}
}

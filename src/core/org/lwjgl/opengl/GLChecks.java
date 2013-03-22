/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.LWJGLUtil;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.glGetInteger;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL30.*;

final class GLChecks {

	private GLChecks() {
	}

	static void ensureBufferObject(int binding, boolean enabled) {
		if ( LWJGLUtil.DEBUG ) {
			if ( (glGetInteger(binding) != 0) ^ enabled )
				throw new OpenGLException("Cannot use " + (enabled ? "offsets" : "buffers") + " when " + translateBufferObjectBinding(binding) + " buffer object is " + (enabled ? "disabled" : "enabled"));
		}
	}

	private static String translateBufferObjectBinding(int binding) {
		switch ( binding ) {
			case GL_ARRAY_BUFFER_BINDING:
				return "array";
			case GL_ELEMENT_ARRAY_BUFFER_BINDING:
				return "element array";
			default:
				// TODO: Add more?
				throw new IllegalArgumentException(LWJGLUtil.toHexString(binding));
		}
	}

	/**
	 * Returns the number of bytes required to store the specified OpenGL type.
	 *
	 * @param type the OpenGL type to translate
	 *
	 * @return the number of bytes
	 */
	static int translateTypeToBytes(int type) {
		switch ( type ) {
			case GL_BYTE:
			case GL_UNSIGNED_BYTE:
				return 1;
			case GL_SHORT:
			case GL_UNSIGNED_SHORT:
			case GL_2_BYTES:
			case GL_HALF_FLOAT:
				return 2;
			case GL_3_BYTES:
				return 3;
			case GL_INT:
			case GL_UNSIGNED_INT:
			case GL_FLOAT:
			case GL_4_BYTES:
				return 4;
			case GL_DOUBLE:
				return 8;
			default:
				throw new IllegalArgumentException(LWJGLUtil.toHexString(type));
		}
	}

}
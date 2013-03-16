/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl;

import org.lwjgl.LWJGLUtil;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.glGetInteger;
import static org.lwjgl.opengl.GL12.*;
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

	/**
	 * Returns the number of components required to specify the specified OpenGL pixel format.
	 *
	 * @param format the OpenGL format to translate
	 *
	 * @return the number of components
	 */
	static int translatePixelFormatToComponents(int format) {
		switch ( format ) {
			case GL_STENCIL_INDEX:
			case GL_DEPTH_COMPONENT:
			case GL_DEPTH_STENCIL:
			case GL_RED:
			case GL_GREEN:
			case GL_BLUE:
			case GL_ALPHA:
			case GL_LUMINANCE:
			case GL_RED_INTEGER:
			case GL_GREEN_INTEGER:
			case GL_BLUE_INTEGER:
			case GL_ALPHA_INTEGER:
				return 1;
			case GL_RG:
			case GL_RG_INTEGER:
			case GL_LUMINANCE_ALPHA:
				return 2;
			case GL_RGB:
			case GL_BGR:
			case GL_RGB_INTEGER:
			case GL_BGR_INTEGER:
				return 3;
			case GL_RGBA:
			case GL_BGRA:
			case GL_RGBA_INTEGER:
			case GL_BGRA_INTEGER:
				return 4;
			default:
				throw new IllegalArgumentException(LWJGLUtil.toHexString(format));
		}
	}

	/**
	 * Returns the number of bytes required to store the specified OpenGL pixel.
	 *
	 * @param format the pixel data format
	 * @param type   the pixel data type
	 *
	 * @return the number of bytes
	 */
	static int getPixelBytes(int format, int type) {
		return translatePixelFormatToComponents(format) * translateTypeToBytes(type);
	}

}
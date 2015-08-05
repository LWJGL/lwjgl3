/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles;

import org.lwjgl.LWJGLUtil;

import static org.lwjgl.opengles.GLES20.*;
import static org.lwjgl.opengles.GLES30.*;
import static org.lwjgl.opengles.GLES31.*;
import static org.lwjgl.system.APIUtil.*;

final class GLESChecks {

	private GLESChecks() {
	}

	static void ensureBufferObject(int binding, boolean enabled) {
		if ( LWJGLUtil.DEBUG && (glGetInteger(binding) != 0) ^ enabled )
			throw new OpenGLESException(
				"Cannot use %s when %s buffer object is %s",
				enabled ? "offsets" : "buffers",
				getBufferObjectBindingString(binding),
				enabled ? "disabled" : "enabled"
			);
	}

	private static String getBufferObjectBindingString(int binding) {
		switch ( binding ) {
			case GL_ARRAY_BUFFER_BINDING:
				return "array";
			case GL_ELEMENT_ARRAY_BUFFER_BINDING:
				return "element array";
			case GL_PIXEL_PACK_BUFFER_BINDING:
				return "pixel pack";
			case GL_PIXEL_UNPACK_BUFFER_BINDING:
				return "pixel unpack";
			case GL_DRAW_INDIRECT_BUFFER_BINDING:
				return "draw indirect";
			case GL_DISPATCH_INDIRECT_BUFFER_BINDING:
				return "dispatch indirect";
			default:
				// TODO: Add more?
				throw new IllegalArgumentException(apiUnknownToken("Unsupported buffer binding", binding));
		}
	}

	/**
	 * Returns the power-of-two of the number of bytes required to store the specified OpenGL ES type.
	 *
	 * @param type the OpenGL ES type to translate
	 *
	 * @return the number of bytes PoT value
	 */
	static int typeToByteShift(int type) {
		switch ( type ) {
			case GL_BYTE:
			case GL_UNSIGNED_BYTE:
				return 0;
			case GL_SHORT:
			case GL_UNSIGNED_SHORT:
			case GL_HALF_FLOAT:
				return 1;
			case GL_INT:
			case GL_UNSIGNED_INT:
			case GL_FLOAT:
			case GL_FIXED:
				return 2;
			// TODO:
			/*case GL_DOUBLE:
			case GL_INT64_NV:
			case GL_UNSIGNED_INT64_NV:
				return 3;*/
			default:
				throw new IllegalArgumentException(apiUnknownToken("Unsupported OpenGL type", type));
		}
	}

}
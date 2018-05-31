/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles;

import static org.lwjgl.opengles.GLES30.*;
import static org.lwjgl.opengles.NVGPUShader5.*;
import static org.lwjgl.system.APIUtil.*;

final class GLESChecks {

    private GLESChecks() {
    }

    /**
     * Returns the power-of-two of the number of bytes required to store the specified OpenGL ES type.
     *
     * @param type the OpenGL ES type to translate
     *
     * @return the number of bytes PoT value
     */
    static int typeToByteShift(int type) {
        switch (type) {
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
            case GL_INT64_NV:
            case GL_UNSIGNED_INT64_NV:
                return 3;
            default:
                throw new IllegalArgumentException(apiUnknownToken("Unsupported OpenGL ES type", type));
        }
    }

}
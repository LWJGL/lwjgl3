/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl;

import static org.lwjgl.opengl.GL41.*;
import static org.lwjgl.opengl.NVGPUShader5.*;
import static org.lwjgl.system.APIUtil.*;

final class GLChecks {

    private GLChecks() {
    }

    /**
     * Returns the number of bytes required to store the specified OpenGL type.
     *
     * @param type the OpenGL type to translate
     *
     * @return the number of bytes
     */
    static int typeToBytes(int type) {
        switch (type) {
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
            case GL_FIXED:
                return 4;
            case GL_DOUBLE:
            case GL_INT64_NV:
            case GL_UNSIGNED_INT64_NV:
                return 8;
            default:
                throw new IllegalArgumentException(apiUnknownToken("Unsupported OpenGL type", type));
        }
    }

    /**
     * Returns the power-of-two of the number of bytes required to store the specified OpenGL type.
     *
     * @param type the OpenGL type to translate
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
            case GL_2_BYTES:
            case GL_HALF_FLOAT:
                return 1;
            case GL_INT:
            case GL_UNSIGNED_INT:
            case GL_FLOAT:
            case GL_4_BYTES:
            case GL_FIXED:
                return 2;
            case GL_DOUBLE:
            case GL_INT64_NV:
            case GL_UNSIGNED_INT64_NV:
                return 3;
            default:
                throw new IllegalArgumentException(apiUnknownToken("Unsupported OpenGL type", type));
        }
    }

    /**
     * Queries the specified parameter of the specified texture object level. If direct-state-access functionality is not available, the texture must be
     * currently bound to the specified texture target.
     *
     * @param texture the texture object
     * @param target  the texture target
     * @param level   the texture level
     * @param pname   the parameter to query
     *
     * @return the parameter value
     */
    static int getTexLevelParameteri(int texture, int target, int level, int pname) {
        GLCapabilities caps = GL.getCapabilities();

        if (caps.OpenGL45) {
            return GL45.glGetTextureLevelParameteri(texture, level, pname);
        }
        if (caps.GL_ARB_direct_state_access) {
            return ARBDirectStateAccess.glGetTextureLevelParameteri(texture, level, pname);
        }
        if (caps.GL_EXT_direct_state_access) {
            return EXTDirectStateAccess.glGetTextureLevelParameteriEXT(texture, target, level, pname);
        }

        return glGetTexLevelParameteri(target, level, pname);
    }

}
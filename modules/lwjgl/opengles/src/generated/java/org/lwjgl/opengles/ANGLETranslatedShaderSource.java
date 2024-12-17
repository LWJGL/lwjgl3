/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANGLETranslatedShaderSource {

    static { GLES.initialize(); }

    public static final int GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE = 0x93A0;

    protected ANGLETranslatedShaderSource() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetTranslatedShaderSourceANGLE ] ---

    /** {@code void glGetTranslatedShaderSourceANGLE(GLuint shader, GLsizei bufsize, GLsizei * length, GLchar * source)} */
    public static native void nglGetTranslatedShaderSourceANGLE(int shader, int bufsize, long length, long source);

    /** {@code void glGetTranslatedShaderSourceANGLE(GLuint shader, GLsizei bufsize, GLsizei * length, GLchar * source)} */
    public static void glGetTranslatedShaderSourceANGLE(@NativeType("GLuint") int shader, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer source) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetTranslatedShaderSourceANGLE(shader, source.remaining(), memAddressSafe(length), memAddress(source));
    }

    /** {@code void glGetTranslatedShaderSourceANGLE(GLuint shader, GLsizei bufsize, GLsizei * length, GLchar * source)} */
    @NativeType("void")
    public static String glGetTranslatedShaderSourceANGLE(@NativeType("GLuint") int shader, @NativeType("GLsizei") int bufsize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer source = memAlloc(bufsize);
        try {
            IntBuffer length = stack.ints(0);
            nglGetTranslatedShaderSourceANGLE(shader, bufsize, memAddress(length), memAddress(source));
            return memUTF8(source, length.get(0));
        } finally {
            memFree(source);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetTranslatedShaderSourceANGLE(GLuint shader, GLsizei bufsize, GLsizei * length, GLchar * source)} */
    @NativeType("void")
    public static String glGetTranslatedShaderSourceANGLE(@NativeType("GLuint") int shader) {
        return glGetTranslatedShaderSourceANGLE(shader, GLES20.glGetShaderi(shader, GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE));
    }

    /** {@code void glGetTranslatedShaderSourceANGLE(GLuint shader, GLsizei bufsize, GLsizei * length, GLchar * source)} */
    public static void glGetTranslatedShaderSourceANGLE(@NativeType("GLuint") int shader, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer source) {
        long __functionAddress = GLES.getICD().glGetTranslatedShaderSourceANGLE;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(shader, source.remaining(), length, memAddress(source), __functionAddress);
    }

}
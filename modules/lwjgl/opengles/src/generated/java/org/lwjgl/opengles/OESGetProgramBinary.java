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
import static org.lwjgl.system.MemoryUtil.*;

public class OESGetProgramBinary {

    static { GLES.initialize(); }

    public static final int GL_PROGRAM_BINARY_LENGTH_OES = 0x8741;

    public static final int
        GL_NUM_PROGRAM_BINARY_FORMATS_OES = 0x87FE,
        GL_PROGRAM_BINARY_FORMATS_OES     = 0x87FF;

    protected OESGetProgramBinary() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetProgramBinaryOES ] ---

    /** {@code void glGetProgramBinaryOES(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static native void nglGetProgramBinaryOES(int program, int bufSize, long length, long binaryFormat, long binary);

    /** {@code void glGetProgramBinaryOES(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinaryOES(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLenum *") IntBuffer binaryFormat, @NativeType("void *") ByteBuffer binary) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(binaryFormat, 1);
        }
        nglGetProgramBinaryOES(program, binary.remaining(), memAddressSafe(length), memAddress(binaryFormat), memAddress(binary));
    }

    // --- [ glProgramBinaryOES ] ---

    /** {@code void glProgramBinaryOES(GLuint program, GLenum binaryFormat, void const * binary, GLint length)} */
    public static native void nglProgramBinaryOES(int program, int binaryFormat, long binary, int length);

    /** {@code void glProgramBinaryOES(GLuint program, GLenum binaryFormat, void const * binary, GLint length)} */
    public static void glProgramBinaryOES(@NativeType("GLuint") int program, @NativeType("GLenum") int binaryFormat, @NativeType("void const *") ByteBuffer binary) {
        nglProgramBinaryOES(program, binaryFormat, memAddress(binary), binary.remaining());
    }

    /** {@code void glGetProgramBinaryOES(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinaryOES(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLenum *") int[] binaryFormat, @NativeType("void *") ByteBuffer binary) {
        long __functionAddress = GLES.getICD().glGetProgramBinaryOES;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(binaryFormat, 1);
        }
        callPPPV(program, binary.remaining(), length, binaryFormat, memAddress(binary), __functionAddress);
    }

}
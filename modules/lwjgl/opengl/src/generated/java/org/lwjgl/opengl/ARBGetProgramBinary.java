/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBGetProgramBinary {

    static { GL.initialize(); }

    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;

    public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;

    public static final int
        GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE,
        GL_PROGRAM_BINARY_FORMATS     = 0x87FF;

    protected ARBGetProgramBinary() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetProgramBinary ] ---

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary) {
        GL41C.nglGetProgramBinary(program, bufSize, length, binaryFormat, binary);
    }

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinary(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLenum *") IntBuffer binaryFormat, @NativeType("void *") ByteBuffer binary) {
        GL41C.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    // --- [ glProgramBinary ] ---

    /** {@code void glProgramBinary(GLuint program, GLenum binaryFormat, void const * binary, GLsizei length)} */
    public static void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
        GL41C.nglProgramBinary(program, binaryFormat, binary, length);
    }

    /** {@code void glProgramBinary(GLuint program, GLenum binaryFormat, void const * binary, GLsizei length)} */
    public static void glProgramBinary(@NativeType("GLuint") int program, @NativeType("GLenum") int binaryFormat, @NativeType("void const *") ByteBuffer binary) {
        GL41C.glProgramBinary(program, binaryFormat, binary);
    }

    // --- [ glProgramParameteri ] ---

    /** {@code void glProgramParameteri(GLuint program, GLenum pname, GLint value)} */
    public static void glProgramParameteri(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        GL41C.glProgramParameteri(program, pname, value);
    }

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinary(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLenum *") int[] binaryFormat, @NativeType("void *") ByteBuffer binary) {
        GL41C.glGetProgramBinary(program, length, binaryFormat, binary);
    }

}
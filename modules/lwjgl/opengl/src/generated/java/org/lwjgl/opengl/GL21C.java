/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL21C extends GL20C {

    static { GL.initialize(); }

    public static final int
        GL_FLOAT_MAT2x3 = 0x8B65,
        GL_FLOAT_MAT2x4 = 0x8B66,
        GL_FLOAT_MAT3x2 = 0x8B67,
        GL_FLOAT_MAT3x4 = 0x8B68,
        GL_FLOAT_MAT4x2 = 0x8B69,
        GL_FLOAT_MAT4x3 = 0x8B6A;

    public static final int
        GL_PIXEL_PACK_BUFFER   = 0x88EB,
        GL_PIXEL_UNPACK_BUFFER = 0x88EC;

    public static final int
        GL_PIXEL_PACK_BUFFER_BINDING   = 0x88ED,
        GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;

    public static final int
        GL_SRGB                  = 0x8C40,
        GL_SRGB8                 = 0x8C41,
        GL_SRGB_ALPHA            = 0x8C42,
        GL_SRGB8_ALPHA8          = 0x8C43,
        GL_COMPRESSED_SRGB       = 0x8C48,
        GL_COMPRESSED_SRGB_ALPHA = 0x8C49;

    protected GL21C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniformMatrix2x3fv ] ---

    /** {@code void glUniformMatrix2x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2x3fv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x2fv ] ---

    /** {@code void glUniformMatrix3x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3x2fv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x4fv ] ---

    /** {@code void glUniformMatrix2x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2x4fv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x2fv ] ---

    /** {@code void glUniformMatrix4x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4x2fv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x4fv ] ---

    /** {@code void glUniformMatrix3x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3x4fv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x3fv ] ---

    /** {@code void glUniformMatrix4x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4x3fv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    /** {@code void glUniformMatrix2x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

}
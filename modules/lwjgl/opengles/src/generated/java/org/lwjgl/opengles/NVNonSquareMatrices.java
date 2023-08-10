/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_non_square_matrices.txt">NV_non_square_matrices</a> extension.
 * 
 * <p>This extension adds support for non-square matrix variables in GLSL shaders.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class NVNonSquareMatrices {

    static { GLES.initialize(); }

    /** Returned by GetActiveAttrib and GetActiveUniform. */
    public static final int
        GL_FLOAT_MAT2x3_NV = 0x8B65,
        GL_FLOAT_MAT2x4_NV = 0x8B66,
        GL_FLOAT_MAT3x2_NV = 0x8B67,
        GL_FLOAT_MAT3x4_NV = 0x8B68,
        GL_FLOAT_MAT4x2_NV = 0x8B69,
        GL_FLOAT_MAT4x3_NV = 0x8B6A;

    protected NVNonSquareMatrices() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniformMatrix2x3fvNV ] ---

    public static native void nglUniformMatrix2x3fvNV(int location, int count, boolean transpose, long value);

    public static void glUniformMatrix2x3fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2x3fvNV(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x2fvNV ] ---

    public static native void nglUniformMatrix3x2fvNV(int location, int count, boolean transpose, long value);

    public static void glUniformMatrix3x2fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3x2fvNV(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x4fvNV ] ---

    public static native void nglUniformMatrix2x4fvNV(int location, int count, boolean transpose, long value);

    public static void glUniformMatrix2x4fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2x4fvNV(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x2fvNV ] ---

    public static native void nglUniformMatrix4x2fvNV(int location, int count, boolean transpose, long value);

    public static void glUniformMatrix4x2fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4x2fvNV(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x4fvNV ] ---

    public static native void nglUniformMatrix3x4fvNV(int location, int count, boolean transpose, long value);

    public static void glUniformMatrix3x4fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3x4fvNV(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x3fvNV ] ---

    public static native void nglUniformMatrix4x3fvNV(int location, int count, boolean transpose, long value);

    public static void glUniformMatrix4x3fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4x3fvNV(location, value.remaining() / 12, transpose, memAddress(value));
    }

    /** Array version of: {@link #glUniformMatrix2x3fvNV UniformMatrix2x3fvNV} */
    public static void glUniformMatrix2x3fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix2x3fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glUniformMatrix3x2fvNV UniformMatrix3x2fvNV} */
    public static void glUniformMatrix3x2fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix3x2fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glUniformMatrix2x4fvNV UniformMatrix2x4fvNV} */
    public static void glUniformMatrix2x4fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix2x4fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glUniformMatrix4x2fvNV UniformMatrix4x2fvNV} */
    public static void glUniformMatrix4x2fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix4x2fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glUniformMatrix3x4fvNV UniformMatrix3x4fvNV} */
    public static void glUniformMatrix3x4fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix3x4fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glUniformMatrix4x3fvNV UniformMatrix4x3fvNV} */
    public static void glUniformMatrix4x3fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix4x3fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

}
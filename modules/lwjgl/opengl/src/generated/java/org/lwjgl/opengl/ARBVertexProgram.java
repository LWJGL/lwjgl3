/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARBVertexProgram {

    static { GL.initialize(); }

    public static final int GL_VERTEX_PROGRAM_ARB = 0x8620;

    public static final int
        GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642,
        GL_VERTEX_PROGRAM_TWO_SIDE_ARB   = 0x8643,
        GL_COLOR_SUM_ARB                 = 0x8458;

    public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;

    public static final int
        GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB    = 0x8622,
        GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB       = 0x8623,
        GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB     = 0x8624,
        GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB       = 0x8625,
        GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A,
        GL_CURRENT_VERTEX_ATTRIB_ARB          = 0x8626;

    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;

    public static final int
        GL_PROGRAM_LENGTH_ARB                       = 0x8627,
        GL_PROGRAM_FORMAT_ARB                       = 0x8876,
        GL_PROGRAM_BINDING_ARB                      = 0x8677,
        GL_PROGRAM_INSTRUCTIONS_ARB                 = 0x88A0,
        GL_MAX_PROGRAM_INSTRUCTIONS_ARB             = 0x88A1,
        GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB          = 0x88A2,
        GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB      = 0x88A3,
        GL_PROGRAM_TEMPORARIES_ARB                  = 0x88A4,
        GL_MAX_PROGRAM_TEMPORARIES_ARB              = 0x88A5,
        GL_PROGRAM_NATIVE_TEMPORARIES_ARB           = 0x88A6,
        GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB       = 0x88A7,
        GL_PROGRAM_PARAMETERS_ARB                   = 0x88A8,
        GL_MAX_PROGRAM_PARAMETERS_ARB               = 0x88A9,
        GL_PROGRAM_NATIVE_PARAMETERS_ARB            = 0x88AA,
        GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB        = 0x88AB,
        GL_PROGRAM_ATTRIBS_ARB                      = 0x88AC,
        GL_MAX_PROGRAM_ATTRIBS_ARB                  = 0x88AD,
        GL_PROGRAM_NATIVE_ATTRIBS_ARB               = 0x88AE,
        GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB           = 0x88AF,
        GL_PROGRAM_ADDRESS_REGISTERS_ARB            = 0x88B0,
        GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB        = 0x88B1,
        GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB     = 0x88B2,
        GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B3,
        GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB         = 0x88B4,
        GL_MAX_PROGRAM_ENV_PARAMETERS_ARB           = 0x88B5,
        GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB          = 0x88B6;

    public static final int GL_PROGRAM_STRING_ARB = 0x8628;

    public static final int
        GL_PROGRAM_ERROR_POSITION_ARB         = 0x864B,
        GL_CURRENT_MATRIX_ARB                 = 0x8641,
        GL_TRANSPOSE_CURRENT_MATRIX_ARB       = 0x88B7,
        GL_CURRENT_MATRIX_STACK_DEPTH_ARB     = 0x8640,
        GL_MAX_VERTEX_ATTRIBS_ARB             = 0x8869,
        GL_MAX_PROGRAM_MATRICES_ARB           = 0x862F,
        GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;

    public static final int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;

    public static final int
        GL_MATRIX0_ARB  = 0x88C0,
        GL_MATRIX1_ARB  = 0x88C1,
        GL_MATRIX2_ARB  = 0x88C2,
        GL_MATRIX3_ARB  = 0x88C3,
        GL_MATRIX4_ARB  = 0x88C4,
        GL_MATRIX5_ARB  = 0x88C5,
        GL_MATRIX6_ARB  = 0x88C6,
        GL_MATRIX7_ARB  = 0x88C7,
        GL_MATRIX8_ARB  = 0x88C8,
        GL_MATRIX9_ARB  = 0x88C9,
        GL_MATRIX10_ARB = 0x88CA,
        GL_MATRIX11_ARB = 0x88CB,
        GL_MATRIX12_ARB = 0x88CC,
        GL_MATRIX13_ARB = 0x88CD,
        GL_MATRIX14_ARB = 0x88CE,
        GL_MATRIX15_ARB = 0x88CF,
        GL_MATRIX16_ARB = 0x88D0,
        GL_MATRIX17_ARB = 0x88D1,
        GL_MATRIX18_ARB = 0x88D2,
        GL_MATRIX19_ARB = 0x88D3,
        GL_MATRIX20_ARB = 0x88D4,
        GL_MATRIX21_ARB = 0x88D5,
        GL_MATRIX22_ARB = 0x88D6,
        GL_MATRIX23_ARB = 0x88D7,
        GL_MATRIX24_ARB = 0x88D8,
        GL_MATRIX25_ARB = 0x88D9,
        GL_MATRIX26_ARB = 0x88DA,
        GL_MATRIX27_ARB = 0x88DB,
        GL_MATRIX28_ARB = 0x88DC,
        GL_MATRIX29_ARB = 0x88DD,
        GL_MATRIX30_ARB = 0x88DE,
        GL_MATRIX31_ARB = 0x88DF;

    protected ARBVertexProgram() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttrib1sARB ] ---

    /** {@code void glVertexAttrib1sARB(GLuint index, GLshort v0)} */
    public static void glVertexAttrib1sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0) {
        ARBVertexShader.glVertexAttrib1sARB(index, v0);
    }

    // --- [ glVertexAttrib1fARB ] ---

    /** {@code void glVertexAttrib1fARB(GLuint index, GLfloat v0)} */
    public static void glVertexAttrib1fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0) {
        ARBVertexShader.glVertexAttrib1fARB(index, v0);
    }

    // --- [ glVertexAttrib1dARB ] ---

    /** {@code void glVertexAttrib1dARB(GLuint index, GLdouble v0)} */
    public static void glVertexAttrib1dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0) {
        ARBVertexShader.glVertexAttrib1dARB(index, v0);
    }

    // --- [ glVertexAttrib2sARB ] ---

    /** {@code void glVertexAttrib2sARB(GLuint index, GLshort v0, GLshort v1)} */
    public static void glVertexAttrib2sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1) {
        ARBVertexShader.glVertexAttrib2sARB(index, v0, v1);
    }

    // --- [ glVertexAttrib2fARB ] ---

    /** {@code void glVertexAttrib2fARB(GLuint index, GLfloat v0, GLfloat v1)} */
    public static void glVertexAttrib2fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        ARBVertexShader.glVertexAttrib2fARB(index, v0, v1);
    }

    // --- [ glVertexAttrib2dARB ] ---

    /** {@code void glVertexAttrib2dARB(GLuint index, GLdouble v0, GLdouble v1)} */
    public static void glVertexAttrib2dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1) {
        ARBVertexShader.glVertexAttrib2dARB(index, v0, v1);
    }

    // --- [ glVertexAttrib3sARB ] ---

    /** {@code void glVertexAttrib3sARB(GLuint index, GLshort v0, GLshort v1, GLshort v2)} */
    public static void glVertexAttrib3sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2) {
        ARBVertexShader.glVertexAttrib3sARB(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib3fARB ] ---

    /** {@code void glVertexAttrib3fARB(GLuint index, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static void glVertexAttrib3fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        ARBVertexShader.glVertexAttrib3fARB(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib3dARB ] ---

    /** {@code void glVertexAttrib3dARB(GLuint index, GLdouble v0, GLdouble v1, GLdouble v2)} */
    public static void glVertexAttrib3dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2) {
        ARBVertexShader.glVertexAttrib3dARB(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib4sARB ] ---

    /** {@code void glVertexAttrib4sARB(GLuint index, GLshort v0, GLshort v1, GLshort v2, GLshort v3)} */
    public static void glVertexAttrib4sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3) {
        ARBVertexShader.glVertexAttrib4sARB(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4fARB ] ---

    /** {@code void glVertexAttrib4fARB(GLuint index, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static void glVertexAttrib4fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        ARBVertexShader.glVertexAttrib4fARB(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4dARB ] ---

    /** {@code void glVertexAttrib4dARB(GLuint index, GLdouble v0, GLdouble v1, GLdouble v2, GLdouble v3)} */
    public static void glVertexAttrib4dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3) {
        ARBVertexShader.glVertexAttrib4dARB(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4NubARB ] ---

    /** {@code void glVertexAttrib4NubARB(GLuint index, GLubyte x, GLubyte y, GLubyte z, GLubyte w)} */
    public static void glVertexAttrib4NubARB(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w) {
        ARBVertexShader.glVertexAttrib4NubARB(index, x, y, z, w);
    }

    // --- [ glVertexAttrib1svARB ] ---

    /** {@code void glVertexAttrib1svARB(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib1svARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib1svARB(index, v);
    }

    /** {@code void glVertexAttrib1svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib1svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib1svARB(index, v);
    }

    // --- [ glVertexAttrib1fvARB ] ---

    /** {@code void glVertexAttrib1fvARB(GLuint index, GLfloat const * v)} */
    public static void nglVertexAttrib1fvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib1fvARB(index, v);
    }

    /** {@code void glVertexAttrib1fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        ARBVertexShader.glVertexAttrib1fvARB(index, v);
    }

    // --- [ glVertexAttrib1dvARB ] ---

    /** {@code void glVertexAttrib1dvARB(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttrib1dvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib1dvARB(index, v);
    }

    /** {@code void glVertexAttrib1dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib1dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        ARBVertexShader.glVertexAttrib1dvARB(index, v);
    }

    // --- [ glVertexAttrib2svARB ] ---

    /** {@code void glVertexAttrib2svARB(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib2svARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib2svARB(index, v);
    }

    /** {@code void glVertexAttrib2svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib2svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib2svARB(index, v);
    }

    // --- [ glVertexAttrib2fvARB ] ---

    /** {@code void glVertexAttrib2fvARB(GLuint index, GLfloat const * v)} */
    public static void nglVertexAttrib2fvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib2fvARB(index, v);
    }

    /** {@code void glVertexAttrib2fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        ARBVertexShader.glVertexAttrib2fvARB(index, v);
    }

    // --- [ glVertexAttrib2dvARB ] ---

    /** {@code void glVertexAttrib2dvARB(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttrib2dvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib2dvARB(index, v);
    }

    /** {@code void glVertexAttrib2dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib2dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        ARBVertexShader.glVertexAttrib2dvARB(index, v);
    }

    // --- [ glVertexAttrib3svARB ] ---

    /** {@code void glVertexAttrib3svARB(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib3svARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib3svARB(index, v);
    }

    /** {@code void glVertexAttrib3svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib3svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib3svARB(index, v);
    }

    // --- [ glVertexAttrib3fvARB ] ---

    /** {@code void glVertexAttrib3fvARB(GLuint index, GLfloat const * v)} */
    public static void nglVertexAttrib3fvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib3fvARB(index, v);
    }

    /** {@code void glVertexAttrib3fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        ARBVertexShader.glVertexAttrib3fvARB(index, v);
    }

    // --- [ glVertexAttrib3dvARB ] ---

    /** {@code void glVertexAttrib3dvARB(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttrib3dvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib3dvARB(index, v);
    }

    /** {@code void glVertexAttrib3dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib3dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        ARBVertexShader.glVertexAttrib3dvARB(index, v);
    }

    // --- [ glVertexAttrib4fvARB ] ---

    /** {@code void glVertexAttrib4fvARB(GLuint index, GLfloat const * v)} */
    public static void nglVertexAttrib4fvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4fvARB(index, v);
    }

    /** {@code void glVertexAttrib4fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        ARBVertexShader.glVertexAttrib4fvARB(index, v);
    }

    // --- [ glVertexAttrib4bvARB ] ---

    /** {@code void glVertexAttrib4bvARB(GLuint index, GLbyte const * v)} */
    public static void nglVertexAttrib4bvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4bvARB(index, v);
    }

    /** {@code void glVertexAttrib4bvARB(GLuint index, GLbyte const * v)} */
    public static void glVertexAttrib4bvARB(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        ARBVertexShader.glVertexAttrib4bvARB(index, v);
    }

    // --- [ glVertexAttrib4svARB ] ---

    /** {@code void glVertexAttrib4svARB(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib4svARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4svARB(index, v);
    }

    /** {@code void glVertexAttrib4svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib4svARB(index, v);
    }

    // --- [ glVertexAttrib4ivARB ] ---

    /** {@code void glVertexAttrib4ivARB(GLuint index, GLint const * v)} */
    public static void nglVertexAttrib4ivARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4ivARB(index, v);
    }

    /** {@code void glVertexAttrib4ivARB(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4ivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        ARBVertexShader.glVertexAttrib4ivARB(index, v);
    }

    // --- [ glVertexAttrib4ubvARB ] ---

    /** {@code void glVertexAttrib4ubvARB(GLuint index, GLubyte const * v)} */
    public static void nglVertexAttrib4ubvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4ubvARB(index, v);
    }

    /** {@code void glVertexAttrib4ubvARB(GLuint index, GLubyte const * v)} */
    public static void glVertexAttrib4ubvARB(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        ARBVertexShader.glVertexAttrib4ubvARB(index, v);
    }

    // --- [ glVertexAttrib4usvARB ] ---

    /** {@code void glVertexAttrib4usvARB(GLuint index, GLushort const * v)} */
    public static void nglVertexAttrib4usvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4usvARB(index, v);
    }

    /** {@code void glVertexAttrib4usvARB(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4usvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib4usvARB(index, v);
    }

    // --- [ glVertexAttrib4uivARB ] ---

    /** {@code void glVertexAttrib4uivARB(GLuint index, GLuint const * v)} */
    public static void nglVertexAttrib4uivARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4uivARB(index, v);
    }

    /** {@code void glVertexAttrib4uivARB(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4uivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        ARBVertexShader.glVertexAttrib4uivARB(index, v);
    }

    // --- [ glVertexAttrib4dvARB ] ---

    /** {@code void glVertexAttrib4dvARB(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttrib4dvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4dvARB(index, v);
    }

    /** {@code void glVertexAttrib4dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib4dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        ARBVertexShader.glVertexAttrib4dvARB(index, v);
    }

    // --- [ glVertexAttrib4NbvARB ] ---

    /** {@code void glVertexAttrib4NbvARB(GLuint index, GLbyte const * v)} */
    public static void nglVertexAttrib4NbvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NbvARB(index, v);
    }

    /** {@code void glVertexAttrib4NbvARB(GLuint index, GLbyte const * v)} */
    public static void glVertexAttrib4NbvARB(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        ARBVertexShader.glVertexAttrib4NbvARB(index, v);
    }

    // --- [ glVertexAttrib4NsvARB ] ---

    /** {@code void glVertexAttrib4NsvARB(GLuint index, GLshort const * v)} */
    public static void nglVertexAttrib4NsvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NsvARB(index, v);
    }

    /** {@code void glVertexAttrib4NsvARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4NsvARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib4NsvARB(index, v);
    }

    // --- [ glVertexAttrib4NivARB ] ---

    /** {@code void glVertexAttrib4NivARB(GLuint index, GLint const * v)} */
    public static void nglVertexAttrib4NivARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NivARB(index, v);
    }

    /** {@code void glVertexAttrib4NivARB(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4NivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        ARBVertexShader.glVertexAttrib4NivARB(index, v);
    }

    // --- [ glVertexAttrib4NubvARB ] ---

    /** {@code void glVertexAttrib4NubvARB(GLuint index, GLubyte const * v)} */
    public static void nglVertexAttrib4NubvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NubvARB(index, v);
    }

    /** {@code void glVertexAttrib4NubvARB(GLuint index, GLubyte const * v)} */
    public static void glVertexAttrib4NubvARB(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        ARBVertexShader.glVertexAttrib4NubvARB(index, v);
    }

    // --- [ glVertexAttrib4NusvARB ] ---

    /** {@code void glVertexAttrib4NusvARB(GLuint index, GLushort const * v)} */
    public static void nglVertexAttrib4NusvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NusvARB(index, v);
    }

    /** {@code void glVertexAttrib4NusvARB(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4NusvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib4NusvARB(index, v);
    }

    // --- [ glVertexAttrib4NuivARB ] ---

    /** {@code void glVertexAttrib4NuivARB(GLuint index, GLuint const * v)} */
    public static void nglVertexAttrib4NuivARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NuivARB(index, v);
    }

    /** {@code void glVertexAttrib4NuivARB(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4NuivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        ARBVertexShader.glVertexAttrib4NuivARB(index, v);
    }

    // --- [ glVertexAttribPointerARB ] ---

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void nglVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer) {
        ARBVertexShader.nglVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    // --- [ glEnableVertexAttribArrayARB ] ---

    /** {@code void glEnableVertexAttribArrayARB(GLuint index)} */
    public static void glEnableVertexAttribArrayARB(@NativeType("GLuint") int index) {
        ARBVertexShader.glEnableVertexAttribArrayARB(index);
    }

    // --- [ glDisableVertexAttribArrayARB ] ---

    /** {@code void glDisableVertexAttribArrayARB(GLuint index)} */
    public static void glDisableVertexAttribArrayARB(@NativeType("GLuint") int index) {
        ARBVertexShader.glDisableVertexAttribArrayARB(index);
    }

    // --- [ glProgramStringARB ] ---

    /** {@code void glProgramStringARB(GLenum target, GLenum format, GLsizei len, void const * string)} */
    public static native void nglProgramStringARB(int target, int format, int len, long string);

    /** {@code void glProgramStringARB(GLenum target, GLenum format, GLsizei len, void const * string)} */
    public static void glProgramStringARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer string) {
        nglProgramStringARB(target, format, string.remaining(), memAddress(string));
    }

    // --- [ glBindProgramARB ] ---

    /** {@code void glBindProgramARB(GLenum target, GLuint program)} */
    public static native void glBindProgramARB(@NativeType("GLenum") int target, @NativeType("GLuint") int program);

    // --- [ glDeleteProgramsARB ] ---

    /** {@code void glDeleteProgramsARB(GLsizei n, GLuint const * programs)} */
    public static native void nglDeleteProgramsARB(int n, long programs);

    /** {@code void glDeleteProgramsARB(GLsizei n, GLuint const * programs)} */
    public static void glDeleteProgramsARB(@NativeType("GLuint const *") IntBuffer programs) {
        nglDeleteProgramsARB(programs.remaining(), memAddress(programs));
    }

    // --- [ glGenProgramsARB ] ---

    /** {@code void glGenProgramsARB(GLsizei n, GLuint * programs)} */
    public static native void nglGenProgramsARB(int n, long programs);

    /** {@code void glGenProgramsARB(GLsizei n, GLuint * programs)} */
    public static void glGenProgramsARB(@NativeType("GLuint *") IntBuffer programs) {
        nglGenProgramsARB(programs.remaining(), memAddress(programs));
    }

    /** {@code void glGenProgramsARB(GLsizei n, GLuint * programs)} */
    @NativeType("void")
    public static int glGenProgramsARB() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer programs = stack.callocInt(1);
            nglGenProgramsARB(1, memAddress(programs));
            return programs.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramEnvParameter4dARB ] ---

    /** {@code void glProgramEnvParameter4dARB(GLenum target, GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static native void glProgramEnvParameter4dARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glProgramEnvParameter4dvARB ] ---

    /** {@code void glProgramEnvParameter4dvARB(GLenum target, GLuint index, GLdouble const * params)} */
    public static native void nglProgramEnvParameter4dvARB(int target, int index, long params);

    /** {@code void glProgramEnvParameter4dvARB(GLenum target, GLuint index, GLdouble const * params)} */
    public static void glProgramEnvParameter4dvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglProgramEnvParameter4dvARB(target, index, memAddress(params));
    }

    // --- [ glProgramEnvParameter4fARB ] ---

    /** {@code void glProgramEnvParameter4fARB(GLenum target, GLuint index, GLfloat x, GLfloat y, GLfloat z, GLfloat w)} */
    public static native void glProgramEnvParameter4fARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    // --- [ glProgramEnvParameter4fvARB ] ---

    /** {@code void glProgramEnvParameter4fvARB(GLenum target, GLuint index, GLfloat const * params)} */
    public static native void nglProgramEnvParameter4fvARB(int target, int index, long params);

    /** {@code void glProgramEnvParameter4fvARB(GLenum target, GLuint index, GLfloat const * params)} */
    public static void glProgramEnvParameter4fvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglProgramEnvParameter4fvARB(target, index, memAddress(params));
    }

    // --- [ glProgramLocalParameter4dARB ] ---

    /** {@code void glProgramLocalParameter4dARB(GLenum target, GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static native void glProgramLocalParameter4dARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glProgramLocalParameter4dvARB ] ---

    /** {@code void glProgramLocalParameter4dvARB(GLenum target, GLuint index, GLdouble const * params)} */
    public static native void nglProgramLocalParameter4dvARB(int target, int index, long params);

    /** {@code void glProgramLocalParameter4dvARB(GLenum target, GLuint index, GLdouble const * params)} */
    public static void glProgramLocalParameter4dvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglProgramLocalParameter4dvARB(target, index, memAddress(params));
    }

    // --- [ glProgramLocalParameter4fARB ] ---

    /** {@code void glProgramLocalParameter4fARB(GLenum target, GLuint index, GLfloat x, GLfloat y, GLfloat z, GLfloat w)} */
    public static native void glProgramLocalParameter4fARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    // --- [ glProgramLocalParameter4fvARB ] ---

    /** {@code void glProgramLocalParameter4fvARB(GLenum target, GLuint index, GLfloat const * params)} */
    public static native void nglProgramLocalParameter4fvARB(int target, int index, long params);

    /** {@code void glProgramLocalParameter4fvARB(GLenum target, GLuint index, GLfloat const * params)} */
    public static void glProgramLocalParameter4fvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglProgramLocalParameter4fvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramEnvParameterfvARB ] ---

    /** {@code void glGetProgramEnvParameterfvARB(GLenum target, GLuint index, GLfloat * params)} */
    public static native void nglGetProgramEnvParameterfvARB(int target, int index, long params);

    /** {@code void glGetProgramEnvParameterfvARB(GLenum target, GLuint index, GLfloat * params)} */
    public static void glGetProgramEnvParameterfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetProgramEnvParameterfvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramEnvParameterdvARB ] ---

    /** {@code void glGetProgramEnvParameterdvARB(GLenum target, GLuint index, GLdouble * params)} */
    public static native void nglGetProgramEnvParameterdvARB(int target, int index, long params);

    /** {@code void glGetProgramEnvParameterdvARB(GLenum target, GLuint index, GLdouble * params)} */
    public static void glGetProgramEnvParameterdvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetProgramEnvParameterdvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramLocalParameterfvARB ] ---

    /** {@code void glGetProgramLocalParameterfvARB(GLenum target, GLuint index, GLfloat * params)} */
    public static native void nglGetProgramLocalParameterfvARB(int target, int index, long params);

    /** {@code void glGetProgramLocalParameterfvARB(GLenum target, GLuint index, GLfloat * params)} */
    public static void glGetProgramLocalParameterfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetProgramLocalParameterfvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramLocalParameterdvARB ] ---

    /** {@code void glGetProgramLocalParameterdvARB(GLenum target, GLuint index, GLdouble * params)} */
    public static native void nglGetProgramLocalParameterdvARB(int target, int index, long params);

    /** {@code void glGetProgramLocalParameterdvARB(GLenum target, GLuint index, GLdouble * params)} */
    public static void glGetProgramLocalParameterdvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetProgramLocalParameterdvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramivARB ] ---

    /** {@code void glGetProgramivARB(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetProgramivARB(int target, int pname, long params);

    /** {@code void glGetProgramivARB(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetProgramivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramivARB(target, pname, memAddress(params));
    }

    /** {@code void glGetProgramivARB(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgramiARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramivARB(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramStringARB ] ---

    /** {@code void glGetProgramStringARB(GLenum target, GLenum pname, void * string)} */
    public static native void nglGetProgramStringARB(int target, int pname, long string);

    /** {@code void glGetProgramStringARB(GLenum target, GLenum pname, void * string)} */
    public static void glGetProgramStringARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void *") ByteBuffer string) {
        if (CHECKS) {
            if (DEBUG) {
                check(string, glGetProgramiARB(target, GL_PROGRAM_LENGTH_ARB));
            }
        }
        nglGetProgramStringARB(target, pname, memAddress(string));
    }

    // --- [ glGetVertexAttribfvARB ] ---

    /** {@code void glGetVertexAttribfvARB(GLuint index, GLenum pname, GLfloat * params)} */
    public static void nglGetVertexAttribfvARB(int index, int pname, long params) {
        ARBVertexShader.nglGetVertexAttribfvARB(index, pname, params);
    }

    /** {@code void glGetVertexAttribfvARB(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        ARBVertexShader.glGetVertexAttribfvARB(index, pname, params);
    }

    // --- [ glGetVertexAttribdvARB ] ---

    /** {@code void glGetVertexAttribdvARB(GLuint index, GLenum pname, GLdouble * params)} */
    public static void nglGetVertexAttribdvARB(int index, int pname, long params) {
        ARBVertexShader.nglGetVertexAttribdvARB(index, pname, params);
    }

    /** {@code void glGetVertexAttribdvARB(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribdvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        ARBVertexShader.glGetVertexAttribdvARB(index, pname, params);
    }

    // --- [ glGetVertexAttribivARB ] ---

    /** {@code void glGetVertexAttribivARB(GLuint index, GLenum pname, GLint * params)} */
    public static void nglGetVertexAttribivARB(int index, int pname, long params) {
        ARBVertexShader.nglGetVertexAttribivARB(index, pname, params);
    }

    /** {@code void glGetVertexAttribivARB(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribivARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        ARBVertexShader.glGetVertexAttribivARB(index, pname, params);
    }

    /** {@code void glGetVertexAttribivARB(GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribiARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return ARBVertexShader.glGetVertexAttribiARB(index, pname);
    }

    // --- [ glGetVertexAttribPointervARB ] ---

    /** {@code void glGetVertexAttribPointervARB(GLuint index, GLenum pname, void ** pointer)} */
    public static void nglGetVertexAttribPointervARB(int index, int pname, long pointer) {
        ARBVertexShader.nglGetVertexAttribPointervARB(index, pname, pointer);
    }

    /** {@code void glGetVertexAttribPointervARB(GLuint index, GLenum pname, void ** pointer)} */
    public static void glGetVertexAttribPointervARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        ARBVertexShader.glGetVertexAttribPointervARB(index, pname, pointer);
    }

    /** {@code void glGetVertexAttribPointervARB(GLuint index, GLenum pname, void ** pointer)} */
    @NativeType("void")
    public static long glGetVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return ARBVertexShader.glGetVertexAttribPointerARB(index, pname);
    }

    // --- [ glIsProgramARB ] ---

    /** {@code GLboolean glIsProgramARB(GLuint program)} */
    @NativeType("GLboolean")
    public static native boolean glIsProgramARB(@NativeType("GLuint") int program);

    /** {@code void glVertexAttrib1svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib1svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib1svARB(index, v);
    }

    /** {@code void glVertexAttrib1fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        ARBVertexShader.glVertexAttrib1fvARB(index, v);
    }

    /** {@code void glVertexAttrib1dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib1dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        ARBVertexShader.glVertexAttrib1dvARB(index, v);
    }

    /** {@code void glVertexAttrib2svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib2svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib2svARB(index, v);
    }

    /** {@code void glVertexAttrib2fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        ARBVertexShader.glVertexAttrib2fvARB(index, v);
    }

    /** {@code void glVertexAttrib2dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib2dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        ARBVertexShader.glVertexAttrib2dvARB(index, v);
    }

    /** {@code void glVertexAttrib3svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib3svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib3svARB(index, v);
    }

    /** {@code void glVertexAttrib3fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        ARBVertexShader.glVertexAttrib3fvARB(index, v);
    }

    /** {@code void glVertexAttrib3dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib3dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        ARBVertexShader.glVertexAttrib3dvARB(index, v);
    }

    /** {@code void glVertexAttrib4fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        ARBVertexShader.glVertexAttrib4fvARB(index, v);
    }

    /** {@code void glVertexAttrib4svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib4svARB(index, v);
    }

    /** {@code void glVertexAttrib4ivARB(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4ivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        ARBVertexShader.glVertexAttrib4ivARB(index, v);
    }

    /** {@code void glVertexAttrib4usvARB(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4usvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        ARBVertexShader.glVertexAttrib4usvARB(index, v);
    }

    /** {@code void glVertexAttrib4uivARB(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4uivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        ARBVertexShader.glVertexAttrib4uivARB(index, v);
    }

    /** {@code void glVertexAttrib4dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib4dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        ARBVertexShader.glVertexAttrib4dvARB(index, v);
    }

    /** {@code void glVertexAttrib4NsvARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4NsvARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib4NsvARB(index, v);
    }

    /** {@code void glVertexAttrib4NivARB(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4NivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        ARBVertexShader.glVertexAttrib4NivARB(index, v);
    }

    /** {@code void glVertexAttrib4NusvARB(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4NusvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        ARBVertexShader.glVertexAttrib4NusvARB(index, v);
    }

    /** {@code void glVertexAttrib4NuivARB(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4NuivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        ARBVertexShader.glVertexAttrib4NuivARB(index, v);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glDeleteProgramsARB(GLsizei n, GLuint const * programs)} */
    public static void glDeleteProgramsARB(@NativeType("GLuint const *") int[] programs) {
        long __functionAddress = GL.getICD().glDeleteProgramsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(programs.length, programs, __functionAddress);
    }

    /** {@code void glGenProgramsARB(GLsizei n, GLuint * programs)} */
    public static void glGenProgramsARB(@NativeType("GLuint *") int[] programs) {
        long __functionAddress = GL.getICD().glGenProgramsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(programs.length, programs, __functionAddress);
    }

    /** {@code void glProgramEnvParameter4dvARB(GLenum target, GLuint index, GLdouble const * params)} */
    public static void glProgramEnvParameter4dvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glProgramEnvParameter4dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glProgramEnvParameter4fvARB(GLenum target, GLuint index, GLfloat const * params)} */
    public static void glProgramEnvParameter4fvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramEnvParameter4fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glProgramLocalParameter4dvARB(GLenum target, GLuint index, GLdouble const * params)} */
    public static void glProgramLocalParameter4dvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glProgramLocalParameter4dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glProgramLocalParameter4fvARB(GLenum target, GLuint index, GLfloat const * params)} */
    public static void glProgramLocalParameter4fvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramLocalParameter4fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glGetProgramEnvParameterfvARB(GLenum target, GLuint index, GLfloat * params)} */
    public static void glGetProgramEnvParameterfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetProgramEnvParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glGetProgramEnvParameterdvARB(GLenum target, GLuint index, GLdouble * params)} */
    public static void glGetProgramEnvParameterdvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetProgramEnvParameterdvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glGetProgramLocalParameterfvARB(GLenum target, GLuint index, GLfloat * params)} */
    public static void glGetProgramLocalParameterfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetProgramLocalParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glGetProgramLocalParameterdvARB(GLenum target, GLuint index, GLdouble * params)} */
    public static void glGetProgramLocalParameterdvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetProgramLocalParameterdvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** {@code void glGetProgramivARB(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetProgramivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetProgramivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribfvARB(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        ARBVertexShader.glGetVertexAttribfvARB(index, pname, params);
    }

    /** {@code void glGetVertexAttribdvARB(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribdvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        ARBVertexShader.glGetVertexAttribdvARB(index, pname, params);
    }

    /** {@code void glGetVertexAttribivARB(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribivARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        ARBVertexShader.glGetVertexAttribivARB(index, pname, params);
    }

}
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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_program.txt">ARB_vertex_program</a> extension.
 * 
 * <p>Unextended OpenGL mandates a certain set of configurable per-vertex computations defining vertex transformation, texture coordinate generation and
 * transformation, and lighting. Several extensions have added further per-vertex computations to OpenGL. For example, extensions have defined new texture
 * coordinate generation modes ({@link ARBTextureCubeMap ARB_texture_cube_map}, {@link NVTexgenReflection NV_texgen_reflection}, <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texgen_emboss.txt">NV_texgen_emboss</a>), new vertex
 * transformation modes ({@link ARBVertexBlend ARB_vertex_blend}, <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_vertex_weighting.txt">EXT_vertex_weighting</a>), new lighting modes (OpenGL 1.2's separate specular and
 * rescale normal functionality), several modes for fog distance generation ({@link NVFogDistance NV_fog_distance}), and eye-distance point size attenuation
 * ({@link ARBPointParameters ARB_point_parameters}).</p>
 * 
 * <p>Each such extension adds a small set of relatively inflexible per-vertex computations.</p>
 * 
 * <p>This inflexibility is in contrast to the typical flexibility provided by the underlying programmable floating point engines (whether micro-coded vertex
 * engines, DSPs, or CPUs) that are traditionally used to implement OpenGL's per-vertex computations. The purpose of this extension is to expose to the
 * OpenGL application writer a significant degree of per-vertex programmability for computing vertex parameters.</p>
 * 
 * <p>For the purposes of discussing this extension, a vertex program is a sequence of floating-point 4-component vector operations that determines how a set
 * of program parameters (defined outside of OpenGL's {@link GL11#glBegin Begin}/{@link GL11#glEnd End} pair) and an input set of per-vertex parameters are transformed to a set of
 * per-vertex result parameters.</p>
 * 
 * <p>The per-vertex computations for standard OpenGL given a particular set of lighting and texture coordinate generation modes (along with any state for
 * extensions defining per-vertex computations) is, in essence, a vertex program. However, the sequence of operations is defined implicitly by the current
 * OpenGL state settings rather than defined explicitly as a sequence of instructions.</p>
 * 
 * <p>This extension provides an explicit mechanism for defining vertex program instruction sequences for application-defined vertex programs. In order to
 * define such vertex programs, this extension defines a vertex programming model including a floating-point 4-component vector instruction set and a
 * relatively large set of floating-point 4-component registers.</p>
 * 
 * <p>The extension's vertex programming model is designed for efficient hardware implementation and to support a wide variety of vertex programs. By design,
 * the entire set of existing vertex programs defined by existing OpenGL per-vertex computation extensions can be implemented using the extension's vertex
 * programming model.</p>
 */
public class ARBVertexProgram {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev, and by the {@code target} parameter of ProgramStringARB, BindProgramARB, ProgramEnvParameter4[df][v]ARB, ProgramLocalParameter4[df][v]ARB,
     * GetProgramEnvParameter[df]vARB, GetProgramLocalParameter[df]vARB, GetProgramivARB, and GetProgramStringARB.
     */
    public static final int GL_VERTEX_PROGRAM_ARB = 0x8620;

    /**
     * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int
        GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642,
        GL_VERTEX_PROGRAM_TWO_SIDE_ARB   = 0x8643,
        GL_COLOR_SUM_ARB                 = 0x8458;

    /** Accepted by the {@code format} parameter of ProgramStringARB. */
    public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib[dfi]vARB. */
    public static final int
        GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB    = 0x8622,
        GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB       = 0x8623,
        GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB     = 0x8624,
        GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB       = 0x8625,
        GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A,
        GL_CURRENT_VERTEX_ATTRIB_ARB          = 0x8626;

    /** Accepted by the {@code pname} parameter of GetVertexAttribPointervARB. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;

    /** Accepted by the {@code pname} parameter of GetProgramivARB. */
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

    /** Accepted by the {@code pname} parameter of GetProgramStringARB. */
    public static final int GL_PROGRAM_STRING_ARB = 0x8628;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_PROGRAM_ERROR_POSITION_ARB         = 0x864B,
        GL_CURRENT_MATRIX_ARB                 = 0x8641,
        GL_TRANSPOSE_CURRENT_MATRIX_ARB       = 0x88B7,
        GL_CURRENT_MATRIX_STACK_DEPTH_ARB     = 0x8640,
        GL_MAX_VERTEX_ATTRIBS_ARB             = 0x8869,
        GL_MAX_PROGRAM_MATRICES_ARB           = 0x862F,
        GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;

    /** Accepted by the {@code name} parameter of GetString. */
    public static final int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;

    /** Accepted by the {@code mode} parameter of MatrixMode. */
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

    /**
     * Short version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     */
    public static void glVertexAttrib1sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0) {
        ARBVertexShader.glVertexAttrib1sARB(index, v0);
    }

    // --- [ glVertexAttrib1fARB ] ---

    /**
     * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     */
    public static void glVertexAttrib1fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0) {
        ARBVertexShader.glVertexAttrib1fARB(index, v0);
    }

    // --- [ glVertexAttrib1dARB ] ---

    /**
     * Double version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     */
    public static void glVertexAttrib1dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0) {
        ARBVertexShader.glVertexAttrib1dARB(index, v0);
    }

    // --- [ glVertexAttrib2sARB ] ---

    /**
     * Short version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     */
    public static void glVertexAttrib2sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1) {
        ARBVertexShader.glVertexAttrib2sARB(index, v0, v1);
    }

    // --- [ glVertexAttrib2fARB ] ---

    /**
     * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     */
    public static void glVertexAttrib2fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1) {
        ARBVertexShader.glVertexAttrib2fARB(index, v0, v1);
    }

    // --- [ glVertexAttrib2dARB ] ---

    /**
     * Double version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     */
    public static void glVertexAttrib2dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1) {
        ARBVertexShader.glVertexAttrib2dARB(index, v0, v1);
    }

    // --- [ glVertexAttrib3sARB ] ---

    /**
     * Short version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     */
    public static void glVertexAttrib3sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2) {
        ARBVertexShader.glVertexAttrib3sARB(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib3fARB ] ---

    /**
     * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     */
    public static void glVertexAttrib3fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2) {
        ARBVertexShader.glVertexAttrib3fARB(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib3dARB ] ---

    /**
     * Double version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     */
    public static void glVertexAttrib3dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2) {
        ARBVertexShader.glVertexAttrib3dARB(index, v0, v1, v2);
    }

    // --- [ glVertexAttrib4sARB ] ---

    /**
     * Short version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     */
    public static void glVertexAttrib4sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3) {
        ARBVertexShader.glVertexAttrib4sARB(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4fARB ] ---

    /**
     * Specifies the value of a generic vertex attribute.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     */
    public static void glVertexAttrib4fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3) {
        ARBVertexShader.glVertexAttrib4fARB(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4dARB ] ---

    /**
     * Double version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     */
    public static void glVertexAttrib4dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3) {
        ARBVertexShader.glVertexAttrib4dARB(index, v0, v1, v2, v3);
    }

    // --- [ glVertexAttrib4NubARB ] ---

    /**
     * Normalized unsigned byte version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     */
    public static void glVertexAttrib4NubARB(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w) {
        ARBVertexShader.glVertexAttrib4NubARB(index, x, y, z, w);
    }

    // --- [ glVertexAttrib1svARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib1svARB VertexAttrib1svARB} */
    public static void nglVertexAttrib1svARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib1svARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib1sARB VertexAttrib1sARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib1svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib1svARB(index, v);
    }

    // --- [ glVertexAttrib1fvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib1fvARB VertexAttrib1fvARB} */
    public static void nglVertexAttrib1fvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib1fvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib1fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        ARBVertexShader.glVertexAttrib1fvARB(index, v);
    }

    // --- [ glVertexAttrib1dvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib1dvARB VertexAttrib1dvARB} */
    public static void nglVertexAttrib1dvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib1dvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib1dARB VertexAttrib1dARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib1dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        ARBVertexShader.glVertexAttrib1dvARB(index, v);
    }

    // --- [ glVertexAttrib2svARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib2svARB VertexAttrib2svARB} */
    public static void nglVertexAttrib2svARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib2svARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib2sARB VertexAttrib2sARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib2svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib2svARB(index, v);
    }

    // --- [ glVertexAttrib2fvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib2fvARB VertexAttrib2fvARB} */
    public static void nglVertexAttrib2fvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib2fvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib2fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        ARBVertexShader.glVertexAttrib2fvARB(index, v);
    }

    // --- [ glVertexAttrib2dvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib2dvARB VertexAttrib2dvARB} */
    public static void nglVertexAttrib2dvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib2dvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib2dARB VertexAttrib2dARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib2dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        ARBVertexShader.glVertexAttrib2dvARB(index, v);
    }

    // --- [ glVertexAttrib3svARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib3svARB VertexAttrib3svARB} */
    public static void nglVertexAttrib3svARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib3svARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib3sARB VertexAttrib3sARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib3svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib3svARB(index, v);
    }

    // --- [ glVertexAttrib3fvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib3fvARB VertexAttrib3fvARB} */
    public static void nglVertexAttrib3fvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib3fvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib3fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        ARBVertexShader.glVertexAttrib3fvARB(index, v);
    }

    // --- [ glVertexAttrib3dvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib3dvARB VertexAttrib3dvARB} */
    public static void nglVertexAttrib3dvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib3dvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib3dARB VertexAttrib3dARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib3dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        ARBVertexShader.glVertexAttrib3dvARB(index, v);
    }

    // --- [ glVertexAttrib4fvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4fvARB VertexAttrib4fvARB} */
    public static void nglVertexAttrib4fvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4fvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        ARBVertexShader.glVertexAttrib4fvARB(index, v);
    }

    // --- [ glVertexAttrib4bvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4bvARB VertexAttrib4bvARB} */
    public static void nglVertexAttrib4bvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4bvARB(index, v);
    }

    /**
     * Byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4bvARB(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        ARBVertexShader.glVertexAttrib4bvARB(index, v);
    }

    // --- [ glVertexAttrib4svARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4svARB VertexAttrib4svARB} */
    public static void nglVertexAttrib4svARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4svARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib4sARB VertexAttrib4sARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib4svARB(index, v);
    }

    // --- [ glVertexAttrib4ivARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4ivARB VertexAttrib4ivARB} */
    public static void nglVertexAttrib4ivARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4ivARB(index, v);
    }

    /**
     * Integer pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4ivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        ARBVertexShader.glVertexAttrib4ivARB(index, v);
    }

    // --- [ glVertexAttrib4ubvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4ubvARB VertexAttrib4ubvARB} */
    public static void nglVertexAttrib4ubvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4ubvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib4NubARB VertexAttrib4NubARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4ubvARB(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        ARBVertexShader.glVertexAttrib4ubvARB(index, v);
    }

    // --- [ glVertexAttrib4usvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4usvARB VertexAttrib4usvARB} */
    public static void nglVertexAttrib4usvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4usvARB(index, v);
    }

    /**
     * Unsigned short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4usvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib4usvARB(index, v);
    }

    // --- [ glVertexAttrib4uivARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4uivARB VertexAttrib4uivARB} */
    public static void nglVertexAttrib4uivARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4uivARB(index, v);
    }

    /**
     * Unsigned int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4uivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        ARBVertexShader.glVertexAttrib4uivARB(index, v);
    }

    // --- [ glVertexAttrib4dvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4dvARB VertexAttrib4dvARB} */
    public static void nglVertexAttrib4dvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4dvARB(index, v);
    }

    /**
     * Pointer version of {@link #glVertexAttrib4dARB VertexAttrib4dARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        ARBVertexShader.glVertexAttrib4dvARB(index, v);
    }

    // --- [ glVertexAttrib4NbvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4NbvARB VertexAttrib4NbvARB} */
    public static void nglVertexAttrib4NbvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NbvARB(index, v);
    }

    /**
     * Normalized byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4NbvARB(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        ARBVertexShader.glVertexAttrib4NbvARB(index, v);
    }

    // --- [ glVertexAttrib4NsvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4NsvARB VertexAttrib4NsvARB} */
    public static void nglVertexAttrib4NsvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NsvARB(index, v);
    }

    /**
     * Normalized short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4NsvARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib4NsvARB(index, v);
    }

    // --- [ glVertexAttrib4NivARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4NivARB VertexAttrib4NivARB} */
    public static void nglVertexAttrib4NivARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NivARB(index, v);
    }

    /**
     * Normalized int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4NivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        ARBVertexShader.glVertexAttrib4NivARB(index, v);
    }

    // --- [ glVertexAttrib4NubvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4NubvARB VertexAttrib4NubvARB} */
    public static void nglVertexAttrib4NubvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NubvARB(index, v);
    }

    /**
     * Normalized unsigned byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4NubvARB(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        ARBVertexShader.glVertexAttrib4NubvARB(index, v);
    }

    // --- [ glVertexAttrib4NusvARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4NusvARB VertexAttrib4NusvARB} */
    public static void nglVertexAttrib4NusvARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NusvARB(index, v);
    }

    /**
     * Normalized unsigned short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4NusvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        ARBVertexShader.glVertexAttrib4NusvARB(index, v);
    }

    // --- [ glVertexAttrib4NuivARB ] ---

    /** Unsafe version of: {@link #glVertexAttrib4NuivARB VertexAttrib4NuivARB} */
    public static void nglVertexAttrib4NuivARB(int index, long v) {
        ARBVertexShader.nglVertexAttrib4NuivARB(index, v);
    }

    /**
     * Normalized unsigned int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     */
    public static void glVertexAttrib4NuivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        ARBVertexShader.glVertexAttrib4NuivARB(index, v);
    }

    // --- [ glVertexAttribPointerARB ] ---

    /** Unsafe version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
    public static void nglVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer) {
        ARBVertexShader.nglVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    // --- [ glEnableVertexAttribArrayARB ] ---

    /**
     * Enables a generic vertex attribute array.
     *
     * @param index the index of the generic vertex attribute to be enabled
     */
    public static void glEnableVertexAttribArrayARB(@NativeType("GLuint") int index) {
        ARBVertexShader.glEnableVertexAttribArrayARB(index);
    }

    // --- [ glDisableVertexAttribArrayARB ] ---

    /**
     * Disables a generic vertex attribute array.
     *
     * @param index the index of the generic vertex attribute to be disabled
     */
    public static void glDisableVertexAttribArrayARB(@NativeType("GLuint") int index) {
        ARBVertexShader.glDisableVertexAttribArrayARB(index);
    }

    // --- [ glProgramStringARB ] ---

    /**
     * Unsafe version of: {@link #glProgramStringARB ProgramStringARB}
     *
     * @param len the length of the program string, excluding the null-terminator
     */
    public static native void nglProgramStringARB(int target, int format, int len, long string);

    /**
     * Updates the program string for the current program object for {@code target}.
     * 
     * <p>When a program string is loaded, it is interpreted according to syntactic and semantic rules corresponding to the program target specified by
     * {@code target}. If a program violates the syntactic or semantic restrictions of the program target, ProgramStringARB generates the error
     * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}.</p>
     * 
     * <p>Additionally, ProgramString will update the program error position ({@link #GL_PROGRAM_ERROR_POSITION_ARB PROGRAM_ERROR_POSITION_ARB}) and error string ({@link #GL_PROGRAM_ERROR_STRING_ARB PROGRAM_ERROR_STRING_ARB}). If a
     * program fails to load, the value of the program error position is set to the ubyte offset into the specified program string indicating where the first
     * program error was detected. If the program fails to load because of a semantic restriction that is not detected until the program is fully scanned, the
     * error position is set to the value of {@code len}. If a program loads successfully, the error position is set to the value negative one. The
     * implementation-dependent program error string contains one or more error or warning messages.  If a program loads succesfully, the error string may
     * either contain warning messages or be empty.</p>
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param format the format of the program string. Must be:<br><table><tr><td>{@link #GL_PROGRAM_FORMAT_ASCII_ARB PROGRAM_FORMAT_ASCII_ARB}</td></tr></table>
     * @param string an array of bytes representing the program string being loaded
     */
    public static void glProgramStringARB(@NativeType("GLenum") int target, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer string) {
        nglProgramStringARB(target, format, string.remaining(), memAddress(string));
    }

    // --- [ glBindProgramARB ] ---

    /**
     * Creates a named program object by binding an unused program object name to a valid program target. Also can be used to bind an existing program object
     * to a program target.
     *
     * @param target  the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param program the program object to bind. If {@code program} is zero, the default program object for {@code target} is bound.  If {@code program} is the name of
     *                an existing program object whose associated program target is {@code target}, the named program object is bound.
     */
    public static native void glBindProgramARB(@NativeType("GLenum") int target, @NativeType("GLuint") int program);

    // --- [ glDeleteProgramsARB ] ---

    /**
     * Unsafe version of: {@link #glDeleteProgramsARB DeleteProgramsARB}
     *
     * @param n the number of program object to delete
     */
    public static native void nglDeleteProgramsARB(int n, long programs);

    /**
     * Deletes program objects.
     *
     * @param programs an array of {@code n} program objects to be deleted
     */
    public static void glDeleteProgramsARB(@NativeType("GLuint const *") IntBuffer programs) {
        nglDeleteProgramsARB(programs.remaining(), memAddress(programs));
    }

    // --- [ glGenProgramsARB ] ---

    /**
     * Unsafe version of: {@link #glGenProgramsARB GenProgramsARB}
     *
     * @param n the number of program names to genereate
     */
    public static native void nglGenProgramsARB(int n, long programs);

    /**
     * Returns {@code n} currently unused program names in {@code programs}. These names are marked as used, for the purposes of GenProgramsARB only, but
     * objects are created only when they are first bound using {@link #glBindProgramARB BindProgramARB}.
     *
     * @param programs an array in which to return the generated program names
     */
    public static void glGenProgramsARB(@NativeType("GLuint *") IntBuffer programs) {
        nglGenProgramsARB(programs.remaining(), memAddress(programs));
    }

    /**
     * Returns {@code n} currently unused program names in {@code programs}. These names are marked as used, for the purposes of GenProgramsARB only, but
     * objects are created only when they are first bound using {@link #glBindProgramARB BindProgramARB}.
     */
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

    /**
     * Double version of {@link #glProgramEnvParameter4fARB ProgramEnvParameter4fARB}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param x      the {@code x} parameter component
     * @param y      the {@code y} parameter component
     * @param z      the {@code z} parameter component
     * @param w      the {@code w} parameter component
     */
    public static native void glProgramEnvParameter4dARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glProgramEnvParameter4dvARB ] ---

    /** Unsafe version of: {@link #glProgramEnvParameter4dvARB ProgramEnvParameter4dvARB} */
    public static native void nglProgramEnvParameter4dvARB(int target, int index, long params);

    /**
     * Pointer version of {@link #glProgramEnvParameter4dARB ProgramEnvParameter4dARB}
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param params a buffer from which to read the parameter value
     */
    public static void glProgramEnvParameter4dvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglProgramEnvParameter4dvARB(target, index, memAddress(params));
    }

    // --- [ glProgramEnvParameter4fARB ] ---

    /**
     * Updates the values of the program environment parameter numbered {@code index} for the specified program target {@code target}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param x      the {@code x} parameter component
     * @param y      the {@code y} parameter component
     * @param z      the {@code z} parameter component
     * @param w      the {@code w} parameter component
     */
    public static native void glProgramEnvParameter4fARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    // --- [ glProgramEnvParameter4fvARB ] ---

    /** Unsafe version of: {@link #glProgramEnvParameter4fvARB ProgramEnvParameter4fvARB} */
    public static native void nglProgramEnvParameter4fvARB(int target, int index, long params);

    /**
     * Pointer version of {@link #glProgramEnvParameter4fARB ProgramEnvParameter4fARB}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param params a buffer from which to read the parameter value
     */
    public static void glProgramEnvParameter4fvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglProgramEnvParameter4fvARB(target, index, memAddress(params));
    }

    // --- [ glProgramLocalParameter4dARB ] ---

    /**
     * Double version of {@link #glProgramLocalParameter4fARB ProgramLocalParameter4fARB}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param x      the {@code x} parameter component
     * @param y      the {@code y} parameter component
     * @param z      the {@code z} parameter component
     * @param w      the {@code w} parameter component
     */
    public static native void glProgramLocalParameter4dARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glProgramLocalParameter4dvARB ] ---

    /** Unsafe version of: {@link #glProgramLocalParameter4dvARB ProgramLocalParameter4dvARB} */
    public static native void nglProgramLocalParameter4dvARB(int target, int index, long params);

    /**
     * Pointer version of {@link #glProgramLocalParameter4dARB ProgramLocalParameter4dARB}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param params a buffer from which to read the parameter value
     */
    public static void glProgramLocalParameter4dvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglProgramLocalParameter4dvARB(target, index, memAddress(params));
    }

    // --- [ glProgramLocalParameter4fARB ] ---

    /**
     * Updates the values of the program local parameter numbered {@code index} for the specified program target {@code target}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param x      the {@code x} parameter component
     * @param y      the {@code y} parameter component
     * @param z      the {@code z} parameter component
     * @param w      the {@code w} parameter component
     */
    public static native void glProgramLocalParameter4fARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    // --- [ glProgramLocalParameter4fvARB ] ---

    /** Unsafe version of: {@link #glProgramLocalParameter4fvARB ProgramLocalParameter4fvARB} */
    public static native void nglProgramLocalParameter4fvARB(int target, int index, long params);

    /**
     * Pointer version of {@link #glProgramLocalParameter4fARB ProgramLocalParameter4fARB}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param params a buffer from which to read the parameter value
     */
    public static void glProgramLocalParameter4fvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglProgramLocalParameter4fvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramEnvParameterfvARB ] ---

    /** Unsafe version of: {@link #glGetProgramEnvParameterfvARB GetProgramEnvParameterfvARB} */
    public static native void nglGetProgramEnvParameterfvARB(int target, int index, long params);

    /**
     * Obtain the current value for the program environment parameter numbered {@code index} for the specified program target {@code target}, and places the
     * information in the array {@code params}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param params a buffer in which to place the current parameter value
     */
    public static void glGetProgramEnvParameterfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetProgramEnvParameterfvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramEnvParameterdvARB ] ---

    /** Unsafe version of: {@link #glGetProgramEnvParameterdvARB GetProgramEnvParameterdvARB} */
    public static native void nglGetProgramEnvParameterdvARB(int target, int index, long params);

    /**
     * Double version of {@link #glGetProgramEnvParameterfvARB GetProgramEnvParameterfvARB}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param params a buffer in which to place the current parameter value
     */
    public static void glGetProgramEnvParameterdvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetProgramEnvParameterdvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramLocalParameterfvARB ] ---

    /** Unsafe version of: {@link #glGetProgramLocalParameterfvARB GetProgramLocalParameterfvARB} */
    public static native void nglGetProgramLocalParameterfvARB(int target, int index, long params);

    /**
     * Obtain the current value for the program local parameter numbered {@code index} for the specified program target {@code target}, and places the
     * information in the array {@code params}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param params a buffer in which to place the current parameter value
     */
    public static void glGetProgramLocalParameterfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetProgramLocalParameterfvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramLocalParameterdvARB ] ---

    /** Unsafe version of: {@link #glGetProgramLocalParameterdvARB GetProgramLocalParameterdvARB} */
    public static native void nglGetProgramLocalParameterdvARB(int target, int index, long params);

    /**
     * Double version of {@link #glGetProgramLocalParameterfvARB GetProgramLocalParameterfvARB}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param index  the environment parameter index
     * @param params a buffer in which to place the current parameter value
     */
    public static void glGetProgramLocalParameterdvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetProgramLocalParameterdvARB(target, index, memAddress(params));
    }

    // --- [ glGetProgramivARB ] ---

    /** Unsafe version of: {@link #glGetProgramivARB GetProgramivARB} */
    public static native void nglGetProgramivARB(int target, int pname, long params);

    /**
     * Obtains program state for the program target {@code target}, writing the state into the array given by {@code params}. GetProgramivARB can be used to
     * determine the properties of the currently bound program object or implementation limits for {@code target}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_PROGRAM_LENGTH_ARB PROGRAM_LENGTH_ARB}</td><td>{@link #GL_PROGRAM_FORMAT_ARB PROGRAM_FORMAT_ARB}</td></tr><tr><td>{@link #GL_PROGRAM_BINDING_ARB PROGRAM_BINDING_ARB}</td><td>{@link #GL_PROGRAM_INSTRUCTIONS_ARB PROGRAM_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_INSTRUCTIONS_ARB MAX_PROGRAM_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_TEMPORARIES_ARB PROGRAM_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_TEMPORARIES_ARB MAX_PROGRAM_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_TEMPORARIES_ARB PROGRAM_NATIVE_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB MAX_PROGRAM_NATIVE_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_PARAMETERS_ARB PROGRAM_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_PARAMETERS_ARB MAX_PROGRAM_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_PARAMETERS_ARB PROGRAM_NATIVE_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB MAX_PROGRAM_NATIVE_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_ATTRIBS_ARB PROGRAM_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ATTRIBS_ARB MAX_PROGRAM_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ATTRIBS_ARB PROGRAM_NATIVE_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB MAX_PROGRAM_NATIVE_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_ADDRESS_REGISTERS_ARB PROGRAM_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB MAX_PROGRAM_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB MAX_PROGRAM_LOCAL_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ENV_PARAMETERS_ARB MAX_PROGRAM_ENV_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB PROGRAM_UNDER_NATIVE_LIMITS_ARB}</td></tr></table>
     * @param params an array in which to place the parameter value
     */
    public static void glGetProgramivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramivARB(target, pname, memAddress(params));
    }

    /**
     * Obtains program state for the program target {@code target}, writing the state into the array given by {@code params}. GetProgramivARB can be used to
     * determine the properties of the currently bound program object or implementation limits for {@code target}.
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_PROGRAM_LENGTH_ARB PROGRAM_LENGTH_ARB}</td><td>{@link #GL_PROGRAM_FORMAT_ARB PROGRAM_FORMAT_ARB}</td></tr><tr><td>{@link #GL_PROGRAM_BINDING_ARB PROGRAM_BINDING_ARB}</td><td>{@link #GL_PROGRAM_INSTRUCTIONS_ARB PROGRAM_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_INSTRUCTIONS_ARB MAX_PROGRAM_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_TEMPORARIES_ARB PROGRAM_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_TEMPORARIES_ARB MAX_PROGRAM_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_TEMPORARIES_ARB PROGRAM_NATIVE_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB MAX_PROGRAM_NATIVE_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_PARAMETERS_ARB PROGRAM_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_PARAMETERS_ARB MAX_PROGRAM_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_PARAMETERS_ARB PROGRAM_NATIVE_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB MAX_PROGRAM_NATIVE_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_ATTRIBS_ARB PROGRAM_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ATTRIBS_ARB MAX_PROGRAM_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ATTRIBS_ARB PROGRAM_NATIVE_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB MAX_PROGRAM_NATIVE_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_ADDRESS_REGISTERS_ARB PROGRAM_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB MAX_PROGRAM_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB MAX_PROGRAM_LOCAL_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ENV_PARAMETERS_ARB MAX_PROGRAM_ENV_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB PROGRAM_UNDER_NATIVE_LIMITS_ARB}</td></tr></table>
     */
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

    /** Unsafe version of: {@link #glGetProgramStringARB GetProgramStringARB} */
    public static native void nglGetProgramStringARB(int target, int pname, long string);

    /**
     * Obtains the program string for the program object bound to {@code target} and places the information in the array {@code string}.
     * 
     * <p>{@code n} ubytes are returned into the array program where {@code n} is the length of the program in ubytes, as returned by {@link #glGetProgramivARB GetProgramivARB} when
     * {@code pname} is {@link #GL_PROGRAM_LENGTH_ARB PROGRAM_LENGTH_ARB}. The program string is always returned using the format given when the program string was specified.</p>
     *
     * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
     * @param pname  the parameter to query. Must be:<br><table><tr><td>{@link #GL_PROGRAM_STRING_ARB PROGRAM_STRING_ARB}</td></tr></table>
     * @param string an array in which to place the program string
     */
    public static void glGetProgramStringARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void *") ByteBuffer string) {
        if (CHECKS) {
            if (DEBUG) {
                check(string, glGetProgramiARB(target, GL_PROGRAM_LENGTH_ARB));
            }
        }
        nglGetProgramStringARB(target, pname, memAddress(string));
    }

    // --- [ glGetVertexAttribfvARB ] ---

    /** Unsafe version of: {@link #glGetVertexAttribfvARB GetVertexAttribfvARB} */
    public static void nglGetVertexAttribfvARB(int index, int pname, long params) {
        ARBVertexShader.nglGetVertexAttribfvARB(index, pname, params);
    }

    /**
     * Float version of {@link #glGetVertexAttribivARB GetVertexAttribivARB}.
     *
     * @param index  the generic vertex attribute parameter to be queried
     * @param pname  the symbolic name of the vertex attribute parameter to be queried
     * @param params returns the requested data
     */
    public static void glGetVertexAttribfvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        ARBVertexShader.glGetVertexAttribfvARB(index, pname, params);
    }

    // --- [ glGetVertexAttribdvARB ] ---

    /** Unsafe version of: {@link #glGetVertexAttribdvARB GetVertexAttribdvARB} */
    public static void nglGetVertexAttribdvARB(int index, int pname, long params) {
        ARBVertexShader.nglGetVertexAttribdvARB(index, pname, params);
    }

    /**
     * Double version of {@link #glGetVertexAttribivARB GetVertexAttribivARB}.
     *
     * @param index  the generic vertex attribute parameter to be queried
     * @param pname  the symbolic name of the vertex attribute parameter to be queried
     * @param params returns the requested data
     */
    public static void glGetVertexAttribdvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        ARBVertexShader.glGetVertexAttribdvARB(index, pname, params);
    }

    // --- [ glGetVertexAttribivARB ] ---

    /** Unsafe version of: {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
    public static void nglGetVertexAttribivARB(int index, int pname, long params) {
        ARBVertexShader.nglGetVertexAttribivARB(index, pname, params);
    }

    /**
     * Returns the integer value of a generic vertex attribute parameter.
     *
     * @param index  the generic vertex attribute parameter to be queried
     * @param pname  the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}</td></tr><tr><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}</td><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}</td></tr><tr><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}</td><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}</td></tr><tr><td>{@link ARBVertexShader#GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>
     * @param params returns the requested data
     */
    public static void glGetVertexAttribivARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        ARBVertexShader.glGetVertexAttribivARB(index, pname, params);
    }

    /**
     * Returns the integer value of a generic vertex attribute parameter.
     *
     * @param index the generic vertex attribute parameter to be queried
     * @param pname the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}</td></tr><tr><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}</td><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}</td></tr><tr><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}</td><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}</td></tr><tr><td>{@link ARBVertexShader#GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetVertexAttribiARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return ARBVertexShader.glGetVertexAttribiARB(index, pname);
    }

    // --- [ glGetVertexAttribPointervARB ] ---

    /** Unsafe version of: {@link #glGetVertexAttribPointervARB GetVertexAttribPointervARB} */
    public static void nglGetVertexAttribPointervARB(int index, int pname, long pointer) {
        ARBVertexShader.nglGetVertexAttribPointervARB(index, pname, pointer);
    }

    /**
     * Returns the address of the specified generic vertex attribute pointer.
     *
     * @param index   the generic vertex attribute parameter to be queried
     * @param pname   the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}</td></tr></table>
     * @param pointer the pointer value
     */
    public static void glGetVertexAttribPointervARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        ARBVertexShader.glGetVertexAttribPointervARB(index, pname, pointer);
    }

    /**
     * Returns the address of the specified generic vertex attribute pointer.
     *
     * @param index the generic vertex attribute parameter to be queried
     * @param pname the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link ARBVertexShader#GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}</td></tr></table>
     */
    @NativeType("void")
    public static long glGetVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return ARBVertexShader.glGetVertexAttribPointerARB(index, pname);
    }

    // --- [ glIsProgramARB ] ---

    /**
     * Returns {@link GL11#GL_TRUE TRUE} if {@code program} is the name of a program object. If {@code program} is zero or is a non-zero value that is not the name of a
     * program object, or if an error condition occurs, IsProgramARB returns {@link GL11#GL_FALSE FALSE}. A name returned by {@link #glGenProgramsARB GenProgramsARB}, but not yet bound, is not the
     * name of a program object.
     *
     * @param program the program name
     */
    @NativeType("GLboolean")
    public static native boolean glIsProgramARB(@NativeType("GLuint") int program);

    /** Array version of: {@link #glVertexAttrib1svARB VertexAttrib1svARB} */
    public static void glVertexAttrib1svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib1svARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib1fvARB VertexAttrib1fvARB} */
    public static void glVertexAttrib1fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        ARBVertexShader.glVertexAttrib1fvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib1dvARB VertexAttrib1dvARB} */
    public static void glVertexAttrib1dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        ARBVertexShader.glVertexAttrib1dvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib2svARB VertexAttrib2svARB} */
    public static void glVertexAttrib2svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib2svARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib2fvARB VertexAttrib2fvARB} */
    public static void glVertexAttrib2fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        ARBVertexShader.glVertexAttrib2fvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib2dvARB VertexAttrib2dvARB} */
    public static void glVertexAttrib2dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        ARBVertexShader.glVertexAttrib2dvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib3svARB VertexAttrib3svARB} */
    public static void glVertexAttrib3svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib3svARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib3fvARB VertexAttrib3fvARB} */
    public static void glVertexAttrib3fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        ARBVertexShader.glVertexAttrib3fvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib3dvARB VertexAttrib3dvARB} */
    public static void glVertexAttrib3dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        ARBVertexShader.glVertexAttrib3dvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4fvARB VertexAttrib4fvARB} */
    public static void glVertexAttrib4fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        ARBVertexShader.glVertexAttrib4fvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4svARB VertexAttrib4svARB} */
    public static void glVertexAttrib4svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib4svARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4ivARB VertexAttrib4ivARB} */
    public static void glVertexAttrib4ivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        ARBVertexShader.glVertexAttrib4ivARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4usvARB VertexAttrib4usvARB} */
    public static void glVertexAttrib4usvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        ARBVertexShader.glVertexAttrib4usvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4uivARB VertexAttrib4uivARB} */
    public static void glVertexAttrib4uivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        ARBVertexShader.glVertexAttrib4uivARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4dvARB VertexAttrib4dvARB} */
    public static void glVertexAttrib4dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        ARBVertexShader.glVertexAttrib4dvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4NsvARB VertexAttrib4NsvARB} */
    public static void glVertexAttrib4NsvARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        ARBVertexShader.glVertexAttrib4NsvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4NivARB VertexAttrib4NivARB} */
    public static void glVertexAttrib4NivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        ARBVertexShader.glVertexAttrib4NivARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4NusvARB VertexAttrib4NusvARB} */
    public static void glVertexAttrib4NusvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        ARBVertexShader.glVertexAttrib4NusvARB(index, v);
    }

    /** Array version of: {@link #glVertexAttrib4NuivARB VertexAttrib4NuivARB} */
    public static void glVertexAttrib4NuivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        ARBVertexShader.glVertexAttrib4NuivARB(index, v);
    }

    /** Array version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** Array version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** Array version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        ARBVertexShader.glVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** Array version of: {@link #glDeleteProgramsARB DeleteProgramsARB} */
    public static void glDeleteProgramsARB(@NativeType("GLuint const *") int[] programs) {
        long __functionAddress = GL.getICD().glDeleteProgramsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(programs.length, programs, __functionAddress);
    }

    /** Array version of: {@link #glGenProgramsARB GenProgramsARB} */
    public static void glGenProgramsARB(@NativeType("GLuint *") int[] programs) {
        long __functionAddress = GL.getICD().glGenProgramsARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(programs.length, programs, __functionAddress);
    }

    /** Array version of: {@link #glProgramEnvParameter4dvARB ProgramEnvParameter4dvARB} */
    public static void glProgramEnvParameter4dvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glProgramEnvParameter4dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glProgramEnvParameter4fvARB ProgramEnvParameter4fvARB} */
    public static void glProgramEnvParameter4fvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramEnvParameter4fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glProgramLocalParameter4dvARB ProgramLocalParameter4dvARB} */
    public static void glProgramLocalParameter4dvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glProgramLocalParameter4dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glProgramLocalParameter4fvARB ProgramLocalParameter4fvARB} */
    public static void glProgramLocalParameter4fvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramLocalParameter4fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetProgramEnvParameterfvARB GetProgramEnvParameterfvARB} */
    public static void glGetProgramEnvParameterfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetProgramEnvParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetProgramEnvParameterdvARB GetProgramEnvParameterdvARB} */
    public static void glGetProgramEnvParameterdvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetProgramEnvParameterdvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetProgramLocalParameterfvARB GetProgramLocalParameterfvARB} */
    public static void glGetProgramLocalParameterfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetProgramLocalParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetProgramLocalParameterdvARB GetProgramLocalParameterdvARB} */
    public static void glGetProgramLocalParameterdvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetProgramLocalParameterdvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, index, params, __functionAddress);
    }

    /** Array version of: {@link #glGetProgramivARB GetProgramivARB} */
    public static void glGetProgramivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetProgramivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetVertexAttribfvARB GetVertexAttribfvARB} */
    public static void glGetVertexAttribfvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        ARBVertexShader.glGetVertexAttribfvARB(index, pname, params);
    }

    /** Array version of: {@link #glGetVertexAttribdvARB GetVertexAttribdvARB} */
    public static void glGetVertexAttribdvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        ARBVertexShader.glGetVertexAttribdvARB(index, pname, params);
    }

    /** Array version of: {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
    public static void glGetVertexAttribivARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        ARBVertexShader.glGetVertexAttribivARB(index, pname, params);
    }

}
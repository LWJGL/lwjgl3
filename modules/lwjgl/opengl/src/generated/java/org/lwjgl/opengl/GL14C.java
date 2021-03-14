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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The OpenGL functionality of a forward compatible context, up to version 1.4.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_blend_square.txt">NV_blend_square</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_depth_texture.txt">ARB_depth_texture</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shadow.txt">ARB_shadow</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_fog_coord.txt">EXT_fog_coord</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multi_draw_arrays.txt">EXT_multi_draw_arrays</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_point_parameters.txt">ARB_point_parameters</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_blend_func_separate.txt">EXT_blend_func_separate</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_stencil_wrap.txt">EXT_stencil_wrap</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_env_crossbar.txt">ARB_texture_env_crossbar</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_lod_bias.txt">EXT_texture_lod_bias</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_mirrored_repeat.txt">ARB_texture_mirrored_repeat</a></li>
 * </ul>
 */
public class GL14C extends GL13C {

    static { GL.initialize(); }

    /** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc. */
    public static final int
        GL_CONSTANT_COLOR           = 0x8001,
        GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
        GL_CONSTANT_ALPHA           = 0x8003,
        GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

    /** Accepted by the {@code mode} parameter of BlendEquation. */
    public static final int
        GL_FUNC_ADD = 0x8006,
        GL_MIN      = 0x8007,
        GL_MAX      = 0x8008;

    /** Accepted by the {@code mode} parameter of BlendEquation. */
    public static final int
        GL_FUNC_SUBTRACT         = 0x800A,
        GL_FUNC_REVERSE_SUBTRACT = 0x800B;

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, CopyTexImage1D and CopyTexImage2D. */
    public static final int
        GL_DEPTH_COMPONENT16 = 0x81A5,
        GL_DEPTH_COMPONENT24 = 0x81A6,
        GL_DEPTH_COMPONENT32 = 0x81A7;

    /** Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv. */
    public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;

    /** Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int
        GL_TEXTURE_COMPARE_MODE = 0x884C,
        GL_TEXTURE_COMPARE_FUNC = 0x884D;

    /** Accepted by the {@code pname} parameter of PointParameterfARB, and the {@code pname} of Get. */
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_BLEND_DST_RGB   = 0x80C8,
        GL_BLEND_SRC_RGB   = 0x80C9,
        GL_BLEND_DST_ALPHA = 0x80CA,
        GL_BLEND_SRC_ALPHA = 0x80CB;

    /** Accepted by the {@code sfail}, {@code dpfail}, and {@code dppass} parameter of StencilOp. */
    public static final int
        GL_INCR_WRAP = 0x8507,
        GL_DECR_WRAP = 0x8508;

    /**
     * When the {@code target} parameter of GetTexEnvfv, GetTexEnviv, TexEnvi, TexEnvf, TexEnviv, and TexEnvfv is TEXTURE_FILTER_CONTROL, then the value of
     * {@code pname} may be.
     */
    public static final int GL_TEXTURE_LOD_BIAS = 0x8501;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;

    /**
     * Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
     * when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T, or TEXTURE_WRAP_R.
     */
    public static final int GL_MIRRORED_REPEAT = 0x8370;

    protected GL14C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendColor ] ---

    /**
     * Specifies the constant color C<sub>c</sub> to be used in blending.
     *
     * @param red   the red color component
     * @param green the green color component
     * @param blue  the blue color component
     * @param alpha the alpha color component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBlendColor">Reference Page</a>
     */
    public static native void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

    // --- [ glBlendEquation ] ---

    /**
     * Controls the blend equations used for per-fragment blending.
     *
     * @param mode the blend equation. One of:<br><table><tr><td>{@link #GL_FUNC_ADD FUNC_ADD}</td><td>{@link #GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link #GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link #GL_MIN MIN}</td><td>{@link #GL_MAX MAX}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBlendEquation">Reference Page</a>
     */
    public static native void glBlendEquation(@NativeType("GLenum") int mode);

    // --- [ glMultiDrawArrays ] ---

    /**
     * Unsafe version of: {@link #glMultiDrawArrays MultiDrawArrays}
     *
     * @param drawcount the size of {@code first} and {@code count}
     */
    public static native void nglMultiDrawArrays(int mode, long first, long count, int drawcount);

    /**
     * Renders multiple sets of primitives from array data.
     *
     * @param mode  the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param first an array of starting indices in the enabled arrays
     * @param count an array of the number of indices to be rendered
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glMultiDrawArrays">Reference Page</a>
     */
    public static void glMultiDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint const *") IntBuffer first, @NativeType("GLsizei const *") IntBuffer count) {
        if (CHECKS) {
            check(count, first.remaining());
        }
        nglMultiDrawArrays(mode, memAddress(first), memAddress(count), first.remaining());
    }

    // --- [ glMultiDrawElements ] ---

    /**
     * Unsafe version of: {@link #glMultiDrawElements MultiDrawElements}
     *
     * @param drawcount the size of the {@code count} array
     */
    public static native void nglMultiDrawElements(int mode, long count, int type, long indices, int drawcount);

    /**
     * Renders multiple sets of primitives by specifying indices of array data elements.
     * 
     * <p><b>LWJGL note</b>: Use {@link org.lwjgl.system.MemoryUtil#memAddress} to retrieve pointers to the index buffers.</p>
     *
     * @param mode    the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param count   an array of the elements counts
     * @param type    the type of the values in indices. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices a pointer to the location where the indices are stored
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glMultiDrawElements">Reference Page</a>
     */
    public static void glMultiDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const **") PointerBuffer indices) {
        if (CHECKS) {
            check(indices, count.remaining());
        }
        nglMultiDrawElements(mode, memAddress(count), type, memAddress(indices), count.remaining());
    }

    // --- [ glPointParameterf ] ---

    /**
     * Sets the float value of a pointer parameter.
     *
     * @param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}</td></tr></table>
     * @param param the parameter value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glPointParameterf">Reference Page</a>
     */
    public static native void glPointParameterf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glPointParameteri ] ---

    /**
     * Integer version of {@link #glPointParameterf PointParameterf}.
     *
     * @param pname the parameter to set. Must be:<br><table><tr><td>{@link #GL_POINT_FADE_THRESHOLD_SIZE POINT_FADE_THRESHOLD_SIZE}</td></tr></table>
     * @param param the parameter value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glPointParameteri">Reference Page</a>
     */
    public static native void glPointParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glPointParameterfv ] ---

    /** Unsafe version of: {@link #glPointParameterfv PointParameterfv} */
    public static native void nglPointParameterfv(int pname, long params);

    /**
     * Pointer version of {@link #glPointParameterf PointParameterf}.
     *
     * @param pname  the parameter to set
     * @param params the parameter value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glPointParameter">Reference Page</a>
     */
    public static void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 3);
        }
        nglPointParameterfv(pname, memAddress(params));
    }

    // --- [ glPointParameteriv ] ---

    /** Unsafe version of: {@link #glPointParameteriv PointParameteriv} */
    public static native void nglPointParameteriv(int pname, long params);

    /**
     * Pointer version of {@link #glPointParameteri PointParameteri}.
     *
     * @param pname  the parameter to set
     * @param params the parameter value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glPointParameter">Reference Page</a>
     */
    public static void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 3);
        }
        nglPointParameteriv(pname, memAddress(params));
    }

    // --- [ glBlendFuncSeparate ] ---

    /**
     * Specifies pixel arithmetic for RGB and alpha components separately.
     *
     * @param sfactorRGB   how the red, green, and blue blending factors are computed. The initial value is GL_ONE.
     * @param dfactorRGB   how the red, green, and blue destination blending factors are computed. The initial value is GL_ZERO.
     * @param sfactorAlpha how the alpha source blending factor is computed. The initial value is GL_ONE.
     * @param dfactorAlpha how the alpha destination blending factor is computed. The initial value is GL_ZERO.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBlendFuncSeparate">Reference Page</a>
     */
    public static native void glBlendFuncSeparate(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha);

    /**
     * Array version of: {@link #glMultiDrawArrays MultiDrawArrays}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glMultiDrawArrays">Reference Page</a>
     */
    public static void glMultiDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint const *") int[] first, @NativeType("GLsizei const *") int[] count) {
        long __functionAddress = GL.getICD().glMultiDrawArrays;
        if (CHECKS) {
            check(__functionAddress);
            check(count, first.length);
        }
        callPPV(mode, first, count, first.length, __functionAddress);
    }

    /**
     * Array version of: {@link #glMultiDrawElements MultiDrawElements}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glMultiDrawElements">Reference Page</a>
     */
    public static void glMultiDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei *") int[] count, @NativeType("GLenum") int type, @NativeType("void const **") PointerBuffer indices) {
        long __functionAddress = GL.getICD().glMultiDrawElements;
        if (CHECKS) {
            check(__functionAddress);
            check(indices, count.length);
        }
        callPPV(mode, count, type, memAddress(indices), count.length, __functionAddress);
    }

    /**
     * Array version of: {@link #glPointParameterfv PointParameterfv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glPointParameter">Reference Page</a>
     */
    public static void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glPointParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 3);
        }
        callPV(pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glPointParameteriv PointParameteriv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glPointParameter">Reference Page</a>
     */
    public static void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glPointParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 3);
        }
        callPV(pname, params, __functionAddress);
    }

}
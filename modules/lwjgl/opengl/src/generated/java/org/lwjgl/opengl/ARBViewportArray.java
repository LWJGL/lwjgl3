/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_viewport_array.txt">ARB_viewport_array</a> extension.
 * 
 * <p>OpenGL is modeled on a pipeline of operations. The final stage in this pipeline before rasterization is the viewport transformation. This stage
 * transforms vertices from view space into window coordinates and allows the application to specify a rectangular region of screen space into which OpenGL
 * should draw primitives. Unextended OpenGL implementations provide a single viewport per context. In order to draw primitives into multiple viewports,
 * the OpenGL viewport may be changed between several draw calls. With the advent of Geometry Shaders, it has become possible for an application to amplify
 * geometry and produce multiple output primitives for each primitive input to the Geometry Shader. It is possible to direct these primitives to render
 * into a selected render target. However, all render targets share the same, global OpenGL viewport.</p>
 * 
 * <p>This extension enhances OpenGL by providing a mechanism to expose multiple viewports. Each viewport is specified as a rectangle. The destination
 * viewport may be selected per-primitive by the geometry shader. This allows the Geometry Shader to produce different versions of primitives destined for
 * separate viewport rectangles on the same surface. Additionally, when combined with multiple framebuffer attachments, it allows a different viewport
 * rectangle to be selected for each. This extension also exposes a separate scissor rectangle for each viewport. Finally, the viewport bounds are now
 * floating point quantities allowing fractional pixel offsets to be applied during the viewport transform.</p>
 * 
 * <p>Requires {@link GL32 OpenGL 3.2} or {@link EXTGeometryShader4 EXT_geometry_shader4} or {@link ARBGeometryShader4 ARB_geometry_shader4}. Promoted to core in {@link GL41 OpenGL 4.1}.</p>
 */
public class ARBViewportArray {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v. */
    public static final int
        GL_MAX_VIEWPORTS                   = 0x825B,
        GL_VIEWPORT_SUBPIXEL_BITS          = 0x825C,
        GL_VIEWPORT_BOUNDS_RANGE           = 0x825D,
        GL_LAYER_PROVOKING_VERTEX          = 0x825E,
        GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;

    /** Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX or VIEWPORT_INDEX_PROVOKING_VERTEX. */
    public static final int GL_UNDEFINED_VERTEX = 0x8260;

    protected ARBViewportArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportArrayv ] ---

    /**
     * Unsafe version of: {@link #glViewportArrayv ViewportArrayv}
     *
     * @param count the number of viewports to set
     */
    public static void nglViewportArrayv(int first, int count, long v) {
        GL41C.nglViewportArrayv(first, count, v);
    }

    /**
     * Sets multiple viewports.
     *
     * @param first the first viewport to set
     * @param v     an array containing the viewport parameters
     */
    public static void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        GL41C.glViewportArrayv(first, v);
    }

    // --- [ glViewportIndexedf ] ---

    /**
     * Sets a specified viewport.
     *
     * @param index the viewport to set
     * @param x     the left viewport coordinate
     * @param y     the bottom viewport coordinate
     * @param w     the viewport width
     * @param h     the viewport height
     */
    public static void glViewportIndexedf(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h) {
        GL41C.glViewportIndexedf(index, x, y, w, h);
    }

    // --- [ glViewportIndexedfv ] ---

    /** Unsafe version of: {@link #glViewportIndexedfv ViewportIndexedfv} */
    public static void nglViewportIndexedfv(int index, long v) {
        GL41C.nglViewportIndexedfv(index, v);
    }

    /**
     * Pointer version of {@link #glViewportIndexedf ViewportIndexedf}.
     *
     * @param index the viewport to set
     * @param v     the viewport parameters
     */
    public static void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        GL41C.glViewportIndexedfv(index, v);
    }

    // --- [ glScissorArrayv ] ---

    /**
     * Unsafe version of: {@link #glScissorArrayv ScissorArrayv}
     *
     * @param count the number of scissor boxes to modify
     */
    public static void nglScissorArrayv(int first, int count, long v) {
        GL41C.nglScissorArrayv(first, count, v);
    }

    /**
     * Defines the scissor box for multiple viewports.
     *
     * @param first the index of the first viewport whose scissor box to modify
     * @param v     an array containing the left, bottom, width and height of each scissor box, in that order
     */
    public static void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        GL41C.glScissorArrayv(first, v);
    }

    // --- [ glScissorIndexed ] ---

    /**
     * Defines the scissor box for a specific viewport.
     *
     * @param index  the index of the viewport whose scissor box to modify
     * @param left   the left scissor box coordinate
     * @param bottom the bottom scissor box coordinate
     * @param width  the scissor box width
     * @param height the scissor box height
     */
    public static void glScissorIndexed(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL41C.glScissorIndexed(index, left, bottom, width, height);
    }

    // --- [ glScissorIndexedv ] ---

    /** Unsafe version of: {@link #glScissorIndexedv ScissorIndexedv} */
    public static void nglScissorIndexedv(int index, long v) {
        GL41C.nglScissorIndexedv(index, v);
    }

    /**
     * Pointer version of {@link #glScissorIndexed ScissorIndexed}.
     *
     * @param index the index of the viewport whose scissor box to modify
     * @param v     an array containing the left, bottom, width and height of each scissor box, in that order
     */
    public static void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL41C.glScissorIndexedv(index, v);
    }

    // --- [ glDepthRangeArrayv ] ---

    /**
     * Unsafe version of: {@link #glDepthRangeArrayv DepthRangeArrayv}
     *
     * @param count the number of viewports whose depth range to update
     */
    public static void nglDepthRangeArrayv(int first, int count, long v) {
        GL41C.nglDepthRangeArrayv(first, count, v);
    }

    /**
     * Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified set of viewports.
     *
     * @param first the index of the first viewport whose depth range to update
     * @param v     n array containing the near and far values for the depth range of each modified viewport
     */
    public static void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glDepthRangeArrayv(first, v);
    }

    // --- [ glDepthRangeIndexed ] ---

    /**
     * Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified viewport.
     *
     * @param index the index of the viewport whose depth range to update
     * @param zNear the mapping of the near clipping plane to window coordinates. The initial value is 0.
     * @param zFar  the mapping of the far clipping plane to window coordinates. The initial value is 1.
     */
    public static void glDepthRangeIndexed(@NativeType("GLuint") int index, @NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        GL41C.glDepthRangeIndexed(index, zNear, zFar);
    }

    // --- [ glGetFloati_v ] ---

    /** Unsafe version of: {@link #glGetFloati_v GetFloati_v} */
    public static void nglGetFloati_v(int target, int index, long data) {
        GL41C.nglGetFloati_v(target, index, data);
    }

    /**
     * Queries the float value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * @param data   a scalar or buffer in which to place the returned data
     */
    public static void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer data) {
        GL41C.glGetFloati_v(target, index, data);
    }

    /**
     * Queries the float value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     */
    @NativeType("void")
    public static float glGetFloati(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL41C.glGetFloati(target, index);
    }

    // --- [ glGetDoublei_v ] ---

    /** Unsafe version of: {@link #glGetDoublei_v GetDoublei_v} */
    public static void nglGetDoublei_v(int target, int index, long data) {
        GL41C.nglGetDoublei_v(target, index, data);
    }

    /**
     * Queries the double value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     * @param data   a scalar or buffer in which to place the returned data
     */
    public static void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer data) {
        GL41C.glGetDoublei_v(target, index, data);
    }

    /**
     * Queries the double value of an indexed state variable.
     *
     * @param target the indexed state to query
     * @param index  the index of the element being queried
     */
    @NativeType("void")
    public static double glGetDoublei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL41C.glGetDoublei(target, index);
    }

    /** Array version of: {@link #glViewportArrayv ViewportArrayv} */
    public static void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        GL41C.glViewportArrayv(first, v);
    }

    /** Array version of: {@link #glViewportIndexedfv ViewportIndexedfv} */
    public static void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        GL41C.glViewportIndexedfv(index, v);
    }

    /** Array version of: {@link #glScissorArrayv ScissorArrayv} */
    public static void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        GL41C.glScissorArrayv(first, v);
    }

    /** Array version of: {@link #glScissorIndexedv ScissorIndexedv} */
    public static void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL41C.glScissorIndexedv(index, v);
    }

    /** Array version of: {@link #glDepthRangeArrayv DepthRangeArrayv} */
    public static void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") double[] v) {
        GL41C.glDepthRangeArrayv(first, v);
    }

    /** Array version of: {@link #glGetFloati_v GetFloati_v} */
    public static void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] data) {
        GL41C.glGetFloati_v(target, index, data);
    }

    /** Array version of: {@link #glGetDoublei_v GetDoublei_v} */
    public static void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] data) {
        GL41C.glGetDoublei_v(target, index, data);
    }

}
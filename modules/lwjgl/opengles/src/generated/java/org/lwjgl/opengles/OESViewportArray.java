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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_viewport_array.txt">OES_viewport_array</a> extension.
 * 
 * <p>OpenGL ES is modeled on a pipeline of operations. The final stage in this pipeline before rasterization is the viewport transformation. This stage
 * transforms vertices from view space into window coordinates and allows the application to specify a rectangular region of screen space into which
 * OpenGL ES should draw primitives. Unextended OpenGL ES implementations provide a single viewport per context. In order to draw primitives into multiple
 * viewports, the OpenGL ES viewport may be changed between several draw calls. With the advent of Geometry Shaders, it has become possible for an
 * application to amplify geometry and produce multiple output primitives for each primitive input to the Geometry Shader. It is possible to direct these
 * primitives to render into a selected render target. However, all render targets share the same, global OpenGL ES viewport.</p>
 * 
 * <p>This extension enhances OpenGL ES by providing a mechanism to expose multiple viewports. Each viewport is specified as a rectangle. The destination
 * viewport may be selected per-primitive by the geometry shader. This allows the Geometry Shader to produce different versions of primitives destined for
 * separate viewport rectangles on the same surface. Additionally, when combined with multiple framebuffer attachments, it allows a different viewport
 * rectangle to be selected for each. This extension also exposes a separate scissor rectangle for each viewport. Finally, the viewport bounds are now
 * floating point quantities allowing fractional pixel offsets to be applied during the viewport transform.</p>
 * 
 * <p>Requires {@link GLES32 GLES32}, {@link EXTGeometryShader EXT_geometry_shader} or {@link OESGeometryShader OES_geometry_shader}.</p>
 */
public class OESViewportArray {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetInteger64v. */
    public static final int
        GL_MAX_VIEWPORTS_OES                   = 0x825B,
        GL_VIEWPORT_SUBPIXEL_BITS_OES          = 0x825C,
        GL_VIEWPORT_BOUNDS_RANGE_OES           = 0x825D,
        GL_VIEWPORT_INDEX_PROVOKING_VERTEX_OES = 0x825F;

    protected OESViewportArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportArrayvOES ] ---

    public static native void nglViewportArrayvOES(int first, int count, long v);

    public static void glViewportArrayvOES(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        nglViewportArrayvOES(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glViewportIndexedfOES ] ---

    public static native void glViewportIndexedfOES(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h);

    // --- [ glViewportIndexedfvOES ] ---

    public static native void nglViewportIndexedfvOES(int index, long v);

    public static void glViewportIndexedfvOES(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglViewportIndexedfvOES(index, memAddress(v));
    }

    // --- [ glScissorArrayvOES ] ---

    public static native void nglScissorArrayvOES(int first, int count, long v);

    public static void glScissorArrayvOES(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        nglScissorArrayvOES(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glScissorIndexedOES ] ---

    public static native void glScissorIndexedOES(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glScissorIndexedvOES ] ---

    public static native void nglScissorIndexedvOES(int index, long v);

    public static void glScissorIndexedvOES(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglScissorIndexedvOES(index, memAddress(v));
    }

    // --- [ glDepthRangeArrayfvOES ] ---

    public static native void nglDepthRangeArrayfvOES(int first, int count, long v);

    public static void glDepthRangeArrayfvOES(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        nglDepthRangeArrayfvOES(first, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glDepthRangeIndexedfOES ] ---

    public static native void glDepthRangeIndexedfOES(@NativeType("GLuint") int index, @NativeType("GLfloat") float n, @NativeType("GLfloat") float f);

    // --- [ glGetFloati_vOES ] ---

    public static native void nglGetFloati_vOES(int target, int index, long data);

    public static void glGetFloati_vOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetFloati_vOES(target, index, memAddress(data));
    }

    @NativeType("void")
    public static float glGetFloatiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetFloati_vOES(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnableiOES ] ---

    public static void glEnableiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        OESDrawBuffersIndexed.glEnableiOES(target, index);
    }

    // --- [ glDisableiOES ] ---

    public static void glDisableiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        OESDrawBuffersIndexed.glDisableiOES(target, index);
    }

    // --- [ glIsEnablediOES ] ---

    @NativeType("GLboolean")
    public static boolean glIsEnablediOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return OESDrawBuffersIndexed.glIsEnablediOES(target, index);
    }

    /** Array version of: {@link #glViewportArrayvOES ViewportArrayvOES} */
    public static void glViewportArrayvOES(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glViewportArrayvOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

    /** Array version of: {@link #glViewportIndexedfvOES ViewportIndexedfvOES} */
    public static void glViewportIndexedfvOES(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glViewportIndexedfvOES;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glScissorArrayvOES ScissorArrayvOES} */
    public static void glScissorArrayvOES(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GLES.getICD().glScissorArrayvOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

    /** Array version of: {@link #glScissorIndexedvOES ScissorIndexedvOES} */
    public static void glScissorIndexedvOES(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GLES.getICD().glScissorIndexedvOES;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glDepthRangeArrayfvOES DepthRangeArrayfvOES} */
    public static void glDepthRangeArrayfvOES(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glDepthRangeArrayfvOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 1, v, __functionAddress);
    }

    /** Array version of: {@link #glGetFloati_vOES GetFloati_vOES} */
    public static void glGetFloati_vOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GLES.getICD().glGetFloati_vOES;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

}
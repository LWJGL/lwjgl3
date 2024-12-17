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

public class OESViewportArray {

    static { GLES.initialize(); }

    public static final int
        GL_MAX_VIEWPORTS_OES                   = 0x825B,
        GL_VIEWPORT_SUBPIXEL_BITS_OES          = 0x825C,
        GL_VIEWPORT_BOUNDS_RANGE_OES           = 0x825D,
        GL_VIEWPORT_INDEX_PROVOKING_VERTEX_OES = 0x825F;

    protected OESViewportArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportArrayvOES ] ---

    /** {@code void glViewportArrayvOES(GLuint first, GLsizei count, GLfloat const * v)} */
    public static native void nglViewportArrayvOES(int first, int count, long v);

    /** {@code void glViewportArrayvOES(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayvOES(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        nglViewportArrayvOES(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glViewportIndexedfOES ] ---

    /** {@code void glViewportIndexedfOES(GLuint index, GLfloat x, GLfloat y, GLfloat w, GLfloat h)} */
    public static native void glViewportIndexedfOES(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h);

    // --- [ glViewportIndexedfvOES ] ---

    /** {@code void glViewportIndexedfvOES(GLuint index, GLfloat const * v)} */
    public static native void nglViewportIndexedfvOES(int index, long v);

    /** {@code void glViewportIndexedfvOES(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfvOES(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglViewportIndexedfvOES(index, memAddress(v));
    }

    // --- [ glScissorArrayvOES ] ---

    /** {@code void glScissorArrayvOES(GLuint first, GLsizei count, GLint const * v)} */
    public static native void nglScissorArrayvOES(int first, int count, long v);

    /** {@code void glScissorArrayvOES(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayvOES(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        nglScissorArrayvOES(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glScissorIndexedOES ] ---

    /** {@code void glScissorIndexedOES(GLuint index, GLint left, GLint bottom, GLsizei width, GLsizei height)} */
    public static native void glScissorIndexedOES(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glScissorIndexedvOES ] ---

    /** {@code void glScissorIndexedvOES(GLuint index, GLint const * v)} */
    public static native void nglScissorIndexedvOES(int index, long v);

    /** {@code void glScissorIndexedvOES(GLuint index, GLint const * v)} */
    public static void glScissorIndexedvOES(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglScissorIndexedvOES(index, memAddress(v));
    }

    // --- [ glDepthRangeArrayfvOES ] ---

    /** {@code void glDepthRangeArrayfvOES(GLuint first, GLsizei count, GLfloat const * v)} */
    public static native void nglDepthRangeArrayfvOES(int first, int count, long v);

    /** {@code void glDepthRangeArrayfvOES(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glDepthRangeArrayfvOES(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        nglDepthRangeArrayfvOES(first, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glDepthRangeIndexedfOES ] ---

    /** {@code void glDepthRangeIndexedfOES(GLuint index, GLfloat n, GLfloat f)} */
    public static native void glDepthRangeIndexedfOES(@NativeType("GLuint") int index, @NativeType("GLfloat") float n, @NativeType("GLfloat") float f);

    // --- [ glGetFloati_vOES ] ---

    /** {@code void glGetFloati_vOES(GLenum target, GLuint index, GLfloat * data)} */
    public static native void nglGetFloati_vOES(int target, int index, long data);

    /** {@code void glGetFloati_vOES(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_vOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetFloati_vOES(target, index, memAddress(data));
    }

    /** {@code void glGetFloati_vOES(GLenum target, GLuint index, GLfloat * data)} */
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

    /** {@code void glEnableiOES(GLenum target, GLuint index)} */
    public static void glEnableiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        OESDrawBuffersIndexed.glEnableiOES(target, index);
    }

    // --- [ glDisableiOES ] ---

    /** {@code void glDisableiOES(GLenum target, GLuint index)} */
    public static void glDisableiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        OESDrawBuffersIndexed.glDisableiOES(target, index);
    }

    // --- [ glIsEnablediOES ] ---

    /** {@code GLboolean glIsEnablediOES(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static boolean glIsEnablediOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return OESDrawBuffersIndexed.glIsEnablediOES(target, index);
    }

    /** {@code void glViewportArrayvOES(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayvOES(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glViewportArrayvOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

    /** {@code void glViewportIndexedfvOES(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfvOES(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glViewportIndexedfvOES;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glScissorArrayvOES(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayvOES(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GLES.getICD().glScissorArrayvOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

    /** {@code void glScissorIndexedvOES(GLuint index, GLint const * v)} */
    public static void glScissorIndexedvOES(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GLES.getICD().glScissorIndexedvOES;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glDepthRangeArrayfvOES(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glDepthRangeArrayfvOES(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glDepthRangeArrayfvOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 1, v, __functionAddress);
    }

    /** {@code void glGetFloati_vOES(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_vOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GLES.getICD().glGetFloati_vOES;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

}
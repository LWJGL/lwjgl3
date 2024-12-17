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

public class NVViewportArray {

    static { GLES.initialize(); }

    public static final int
        GL_MAX_VIEWPORTS_NV                   = 0x825B,
        GL_VIEWPORT_SUBPIXEL_BITS_NV          = 0x825C,
        GL_VIEWPORT_BOUNDS_RANGE_NV           = 0x825D,
        GL_VIEWPORT_INDEX_PROVOKING_VERTEX_NV = 0x825F;

    protected NVViewportArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glViewportArrayvNV ] ---

    /** {@code void glViewportArrayvNV(GLuint first, GLsizei count, GLfloat const * v)} */
    public static native void nglViewportArrayvNV(int first, int count, long v);

    /** {@code void glViewportArrayvNV(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayvNV(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        nglViewportArrayvNV(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glViewportIndexedfNV ] ---

    /** {@code void glViewportIndexedfNV(GLuint index, GLfloat x, GLfloat y, GLfloat w, GLfloat h)} */
    public static native void glViewportIndexedfNV(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h);

    // --- [ glViewportIndexedfvNV ] ---

    /** {@code void glViewportIndexedfvNV(GLuint index, GLfloat const * v)} */
    public static native void nglViewportIndexedfvNV(int index, long v);

    /** {@code void glViewportIndexedfvNV(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfvNV(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglViewportIndexedfvNV(index, memAddress(v));
    }

    // --- [ glScissorArrayvNV ] ---

    /** {@code void glScissorArrayvNV(GLuint first, GLsizei count, GLint const * v)} */
    public static native void nglScissorArrayvNV(int first, int count, long v);

    /** {@code void glScissorArrayvNV(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayvNV(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        nglScissorArrayvNV(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glScissorIndexedNV ] ---

    /** {@code void glScissorIndexedNV(GLuint index, GLint left, GLint bottom, GLsizei width, GLsizei height)} */
    public static native void glScissorIndexedNV(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glScissorIndexedvNV ] ---

    /** {@code void glScissorIndexedvNV(GLuint index, GLint const * v)} */
    public static native void nglScissorIndexedvNV(int index, long v);

    /** {@code void glScissorIndexedvNV(GLuint index, GLint const * v)} */
    public static void glScissorIndexedvNV(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglScissorIndexedvNV(index, memAddress(v));
    }

    // --- [ glDepthRangeArrayfvNV ] ---

    /** {@code void glDepthRangeArrayfvNV(GLuint first, GLsizei count, GLfloat const * v)} */
    public static native void nglDepthRangeArrayfvNV(int first, int count, long v);

    /** {@code void glDepthRangeArrayfvNV(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glDepthRangeArrayfvNV(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        nglDepthRangeArrayfvNV(first, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glDepthRangeIndexedfNV ] ---

    /** {@code void glDepthRangeIndexedfNV(GLuint index, GLfloat n, GLfloat f)} */
    public static native void glDepthRangeIndexedfNV(@NativeType("GLuint") int index, @NativeType("GLfloat") float n, @NativeType("GLfloat") float f);

    // --- [ glGetFloati_vNV ] ---

    /** {@code void glGetFloati_vNV(GLenum target, GLuint index, GLfloat * data)} */
    public static native void nglGetFloati_vNV(int target, int index, long data);

    /** {@code void glGetFloati_vNV(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_vNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetFloati_vNV(target, index, memAddress(data));
    }

    /** {@code void glGetFloati_vNV(GLenum target, GLuint index, GLfloat * data)} */
    @NativeType("void")
    public static float glGetFloatiNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetFloati_vNV(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnableiNV ] ---

    /** {@code void glEnableiNV(GLenum target, GLuint index)} */
    public static native void glEnableiNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDisableiNV ] ---

    /** {@code void glDisableiNV(GLenum target, GLuint index)} */
    public static native void glDisableiNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glIsEnablediNV ] ---

    /** {@code GLboolean glIsEnablediNV(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static native boolean glIsEnablediNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    /** {@code void glViewportArrayvNV(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayvNV(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glViewportArrayvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

    /** {@code void glViewportIndexedfvNV(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfvNV(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glViewportIndexedfvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glScissorArrayvNV(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayvNV(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GLES.getICD().glScissorArrayvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

    /** {@code void glScissorIndexedvNV(GLuint index, GLint const * v)} */
    public static void glScissorIndexedvNV(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GLES.getICD().glScissorIndexedvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glDepthRangeArrayfvNV(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glDepthRangeArrayfvNV(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glDepthRangeArrayfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 1, v, __functionAddress);
    }

    /** {@code void glGetFloati_vNV(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_vNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GLES.getICD().glGetFloati_vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

}
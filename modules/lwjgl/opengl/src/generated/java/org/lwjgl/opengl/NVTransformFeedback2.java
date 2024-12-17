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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVTransformFeedback2 {

    static { GL.initialize(); }

    public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;

    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23,
        GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24,
        GL_TRANSFORM_FEEDBACK_BINDING_NV       = 0x8E25;

    protected NVTransformFeedback2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindTransformFeedbackNV ] ---

    /** {@code void glBindTransformFeedbackNV(GLenum target, GLuint id)} */
    public static native void glBindTransformFeedbackNV(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glDeleteTransformFeedbacksNV ] ---

    /** {@code void glDeleteTransformFeedbacksNV(GLsizei n, GLuint const * ids)} */
    public static native void nglDeleteTransformFeedbacksNV(int n, long ids);

    /** {@code void glDeleteTransformFeedbacksNV(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacksNV(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteTransformFeedbacksNV(ids.remaining(), memAddress(ids));
    }

    /** {@code void glDeleteTransformFeedbacksNV(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacksNV(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteTransformFeedbacksNV(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenTransformFeedbacksNV ] ---

    /** {@code void glGenTransformFeedbacksNV(GLsizei n, GLuint * ids)} */
    public static native void nglGenTransformFeedbacksNV(int n, long ids);

    /** {@code void glGenTransformFeedbacksNV(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacksNV(@NativeType("GLuint *") IntBuffer ids) {
        if (CHECKS) {
            check(ids, 1);
        }
        nglGenTransformFeedbacksNV(ids.remaining(), memAddress(ids));
    }

    /** {@code void glGenTransformFeedbacksNV(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenTransformFeedbacksNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenTransformFeedbacksNV(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsTransformFeedbackNV ] ---

    /** {@code GLboolean glIsTransformFeedbackNV(GLuint id)} */
    @NativeType("GLboolean")
    public static native boolean glIsTransformFeedbackNV(@NativeType("GLuint") int id);

    // --- [ glPauseTransformFeedbackNV ] ---

    /** {@code void glPauseTransformFeedbackNV(void)} */
    public static native void glPauseTransformFeedbackNV();

    // --- [ glResumeTransformFeedbackNV ] ---

    /** {@code void glResumeTransformFeedbackNV(void)} */
    public static native void glResumeTransformFeedbackNV();

    // --- [ glDrawTransformFeedbackNV ] ---

    /** {@code void glDrawTransformFeedbackNV(GLenum mode, GLuint id)} */
    public static native void glDrawTransformFeedbackNV(@NativeType("GLenum") int mode, @NativeType("GLuint") int id);

    /** {@code void glDeleteTransformFeedbacksNV(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacksNV(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GL.getICD().glDeleteTransformFeedbacksNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGenTransformFeedbacksNV(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacksNV(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glGenTransformFeedbacksNV;
        if (CHECKS) {
            check(__functionAddress);
            check(ids, 1);
        }
        callPV(ids.length, ids, __functionAddress);
    }

}
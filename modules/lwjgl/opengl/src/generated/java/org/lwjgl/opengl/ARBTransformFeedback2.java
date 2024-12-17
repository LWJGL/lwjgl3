/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBTransformFeedback2 {

    static { GL.initialize(); }

    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;

    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23,
        GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24,
        GL_TRANSFORM_FEEDBACK_BINDING       = 0x8E25;

    protected ARBTransformFeedback2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindTransformFeedback ] ---

    /** {@code void glBindTransformFeedback(GLenum target, GLuint id)} */
    public static void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        GL40C.glBindTransformFeedback(target, id);
    }

    // --- [ glDeleteTransformFeedbacks ] ---

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void nglDeleteTransformFeedbacks(int n, long ids) {
        GL40C.nglDeleteTransformFeedbacks(n, ids);
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        GL40C.glDeleteTransformFeedbacks(ids);
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        GL40C.glDeleteTransformFeedbacks(id);
    }

    // --- [ glGenTransformFeedbacks ] ---

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void nglGenTransformFeedbacks(int n, long ids) {
        GL40C.nglGenTransformFeedbacks(n, ids);
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        GL40C.glGenTransformFeedbacks(ids);
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenTransformFeedbacks() {
        return GL40C.glGenTransformFeedbacks();
    }

    // --- [ glIsTransformFeedback ] ---

    /** {@code GLboolean glIsTransformFeedback(GLuint id)} */
    @NativeType("GLboolean")
    public static boolean glIsTransformFeedback(@NativeType("GLuint") int id) {
        return GL40C.glIsTransformFeedback(id);
    }

    // --- [ glPauseTransformFeedback ] ---

    /** {@code void glPauseTransformFeedback(void)} */
    public static void glPauseTransformFeedback() {
        GL40C.glPauseTransformFeedback();
    }

    // --- [ glResumeTransformFeedback ] ---

    /** {@code void glResumeTransformFeedback(void)} */
    public static void glResumeTransformFeedback() {
        GL40C.glResumeTransformFeedback();
    }

    // --- [ glDrawTransformFeedback ] ---

    /** {@code void glDrawTransformFeedback(GLenum mode, GLuint id)} */
    public static void glDrawTransformFeedback(@NativeType("GLenum") int mode, @NativeType("GLuint") int id) {
        GL40C.glDrawTransformFeedback(mode, id);
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        GL40C.glDeleteTransformFeedbacks(ids);
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        GL40C.glGenTransformFeedbacks(ids);
    }

}
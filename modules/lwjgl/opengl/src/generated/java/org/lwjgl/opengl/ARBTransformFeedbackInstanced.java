/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBTransformFeedbackInstanced {

    static { GL.initialize(); }

    protected ARBTransformFeedbackInstanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawTransformFeedbackInstanced ] ---

    /** {@code void glDrawTransformFeedbackInstanced(GLenum mode, GLuint id, GLsizei primcount)} */
    public static void glDrawTransformFeedbackInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLsizei") int primcount) {
        GL42C.glDrawTransformFeedbackInstanced(mode, id, primcount);
    }

    // --- [ glDrawTransformFeedbackStreamInstanced ] ---

    /** {@code void glDrawTransformFeedbackStreamInstanced(GLenum mode, GLuint id, GLuint stream, GLsizei primcount)} */
    public static void glDrawTransformFeedbackStreamInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream, @NativeType("GLsizei") int primcount) {
        GL42C.glDrawTransformFeedbackStreamInstanced(mode, id, stream, primcount);
    }

}
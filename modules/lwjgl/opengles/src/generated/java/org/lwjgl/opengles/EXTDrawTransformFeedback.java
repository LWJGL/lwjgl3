/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTDrawTransformFeedback {

    static { GLES.initialize(); }

    protected EXTDrawTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawTransformFeedbackEXT ] ---

    /** {@code void glDrawTransformFeedbackEXT(GLenum mode, GLuint id)} */
    public static native void glDrawTransformFeedbackEXT(@NativeType("GLenum") int mode, @NativeType("GLuint") int id);

    // --- [ glDrawTransformFeedbackInstancedEXT ] ---

    /** {@code void glDrawTransformFeedbackInstancedEXT(GLenum mode, GLuint id, GLsizei instancecount)} */
    public static native void glDrawTransformFeedbackInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLsizei") int instancecount);

}
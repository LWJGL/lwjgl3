/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_draw_transform_feedback.txt">EXT_draw_transform_feedback</a> extension.
 * 
 * <p>This extension adds the {@code DrawTransformFeedback} commands. These were omitted from OpenGL ES 3.0 because the number of vertices captured by
 * transform feedback could never be different than the number drawn during capture. The addition of geometry shaders in OpenGL ES 3.2 broke that
 * assumption but, due to an oversight, {@code DrawTransformFeedback} et al were not reinstated. The {@code DrawTransformFeedback} commands unlock the
 * full potential of geometry shaders.</p>
 * 
 * <p>Requires {@link GLES32 GLES 3.2}.</p>
 */
public class EXTDrawTransformFeedback {

    static { GLES.initialize(); }

    protected EXTDrawTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawTransformFeedbackEXT ] ---

    public static native void glDrawTransformFeedbackEXT(@NativeType("GLenum") int mode, @NativeType("GLuint") int id);

    // --- [ glDrawTransformFeedbackInstancedEXT ] ---

    public static native void glDrawTransformFeedbackInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLsizei") int instancecount);

}
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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_transform_feedback2.txt">NV_transform_feedback2</a> extension.
 * 
 * <p>The NV_transform_feedback and EXT_transform_feedback extensions allow applications to capture primitives to one or more buffer objects when transformed
 * by the GL. This extension provides a few additional capabilities to these extensions, making transform feedback mode more useful.</p>
 * 
 * <p>First, it provides transform feedback objects encapsulating transform feedback-related state, allowing applications to replace the entire transform
 * feedback configuration in a single bind call. Second, it provides the ability to pause and resume transform feedback operations. When transform
 * feedback is paused, applications may render without transform feedback or may use transform feedback with different state and a different transform
 * feedback object. When transform feedback is resumed, additional primitives are captured and appended to previously captured primitives for the object.</p>
 * 
 * <p>Additionally, this extension provides the ability to draw primitives captured in transform feedback mode without querying the captured primitive count.
 * The command DrawTransformFeedbackNV() is equivalent to {@code glDrawArrays(<mode>, 0, <count>)}, where {@code count} is the number of vertices captured
 * to buffer objects during the last transform feedback capture operation on the transform feedback object used. This draw operation only provides a
 * vertex count -- it does not automatically set up vertex array state or vertex buffer object bindings, which must be done separately by the application.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5} and {@link NVTransformFeedback NV_transform_feedback} or {@link EXTTransformFeedback EXT_transform_feedback}.</p>
 */
public class NVTransformFeedback2 {

    static { GL.initialize(); }

    /** Accepted by the {@code target} parameter of BindTransformFeedbackNV. */
    public static final int GL_TRANSFORM_FEEDBACK_NV = 0x8E22;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED_NV = 0x8E23,
        GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE_NV = 0x8E24,
        GL_TRANSFORM_FEEDBACK_BINDING_NV       = 0x8E25;

    protected NVTransformFeedback2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindTransformFeedbackNV ] ---

    public static native void glBindTransformFeedbackNV(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glDeleteTransformFeedbacksNV ] ---

    public static native void nglDeleteTransformFeedbacksNV(int n, long ids);

    public static void glDeleteTransformFeedbacksNV(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteTransformFeedbacksNV(ids.remaining(), memAddress(ids));
    }

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

    public static native void nglGenTransformFeedbacksNV(int n, long ids);

    public static void glGenTransformFeedbacksNV(@NativeType("GLuint *") IntBuffer ids) {
        if (CHECKS) {
            check(ids, 1);
        }
        nglGenTransformFeedbacksNV(ids.remaining(), memAddress(ids));
    }

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

    @NativeType("GLboolean")
    public static native boolean glIsTransformFeedbackNV(@NativeType("GLuint") int id);

    // --- [ glPauseTransformFeedbackNV ] ---

    public static native void glPauseTransformFeedbackNV();

    // --- [ glResumeTransformFeedbackNV ] ---

    public static native void glResumeTransformFeedbackNV();

    // --- [ glDrawTransformFeedbackNV ] ---

    public static native void glDrawTransformFeedbackNV(@NativeType("GLenum") int mode, @NativeType("GLuint") int id);

    /** Array version of: {@link #glDeleteTransformFeedbacksNV DeleteTransformFeedbacksNV} */
    public static void glDeleteTransformFeedbacksNV(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GL.getICD().glDeleteTransformFeedbacksNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** Array version of: {@link #glGenTransformFeedbacksNV GenTransformFeedbacksNV} */
    public static void glGenTransformFeedbacksNV(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glGenTransformFeedbacksNV;
        if (CHECKS) {
            check(__functionAddress);
            check(ids, 1);
        }
        callPV(ids.length, ids, __functionAddress);
    }

}
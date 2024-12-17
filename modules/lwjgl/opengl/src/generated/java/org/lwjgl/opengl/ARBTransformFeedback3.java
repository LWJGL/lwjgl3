/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBTransformFeedback3 {

    static { GL.initialize(); }

    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70,
        GL_MAX_VERTEX_STREAMS             = 0x8E71;

    protected ARBTransformFeedback3() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawTransformFeedbackStream ] ---

    /** {@code void glDrawTransformFeedbackStream(GLenum mode, GLuint id, GLuint stream)} */
    public static void glDrawTransformFeedbackStream(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream) {
        GL40C.glDrawTransformFeedbackStream(mode, id, stream);
    }

    // --- [ glBeginQueryIndexed ] ---

    /** {@code void glBeginQueryIndexed(GLenum target, GLuint index, GLuint id)} */
    public static void glBeginQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int id) {
        GL40C.glBeginQueryIndexed(target, index, id);
    }

    // --- [ glEndQueryIndexed ] ---

    /** {@code void glEndQueryIndexed(GLenum target, GLuint index)} */
    public static void glEndQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        GL40C.glEndQueryIndexed(target, index);
    }

    // --- [ glGetQueryIndexediv ] ---

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static void nglGetQueryIndexediv(int target, int index, int pname, long params) {
        GL40C.nglGetQueryIndexediv(target, index, pname, params);
    }

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL40C.glGetQueryIndexediv(target, index, pname, params);
    }

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryIndexedi(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL40C.glGetQueryIndexedi(target, index, pname);
    }

    /** {@code void glGetQueryIndexediv(GLenum target, GLuint index, GLenum pname, GLint * params)} */
    public static void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL40C.glGetQueryIndexediv(target, index, pname, params);
    }

}
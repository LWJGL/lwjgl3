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
import static org.lwjgl.system.MemoryUtil.*;

public class EXTGPUProgramParameters {

    static { GL.initialize(); }

    protected EXTGPUProgramParameters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glProgramEnvParameters4fvEXT ] ---

    /** {@code void glProgramEnvParameters4fvEXT(GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static native void nglProgramEnvParameters4fvEXT(int target, int index, int count, long params);

    /** {@code void glProgramEnvParameters4fvEXT(GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static void glProgramEnvParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        nglProgramEnvParameters4fvEXT(target, index, params.remaining() >> 2, memAddress(params));
    }

    // --- [ glProgramLocalParameters4fvEXT ] ---

    /** {@code void glProgramLocalParameters4fvEXT(GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static native void nglProgramLocalParameters4fvEXT(int target, int index, int count, long params);

    /** {@code void glProgramLocalParameters4fvEXT(GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static void glProgramLocalParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer params) {
        nglProgramLocalParameters4fvEXT(target, index, params.remaining() >> 2, memAddress(params));
    }

    /** {@code void glProgramEnvParameters4fvEXT(GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static void glProgramEnvParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramEnvParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params.length >> 2, params, __functionAddress);
    }

    /** {@code void glProgramLocalParameters4fvEXT(GLenum target, GLuint index, GLsizei count, GLfloat const * params)} */
    public static void glProgramLocalParameters4fvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glProgramLocalParameters4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, index, params.length >> 2, params, __functionAddress);
    }

}
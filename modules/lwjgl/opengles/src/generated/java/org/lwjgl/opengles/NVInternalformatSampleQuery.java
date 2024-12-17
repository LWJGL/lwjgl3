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
import static org.lwjgl.system.MemoryUtil.*;

public class NVInternalformatSampleQuery {

    static { GLES.initialize(); }

    public static final int
        GL_MULTISAMPLES_NV        = 0x9371,
        GL_SUPERSAMPLE_SCALE_X_NV = 0x9372,
        GL_SUPERSAMPLE_SCALE_Y_NV = 0x9373,
        GL_CONFORMANT_NV          = 0x9374;

    protected NVInternalformatSampleQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetInternalformatSampleivNV ] ---

    /** {@code void glGetInternalformatSampleivNV(GLenum target, GLenum internalformat, GLsizei samples, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static native void nglGetInternalformatSampleivNV(int target, int internalformat, int samples, int pname, int bufSize, long params);

    /** {@code void glGetInternalformatSampleivNV(GLenum target, GLenum internalformat, GLsizei samples, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void glGetInternalformatSampleivNV(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int samples, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        nglGetInternalformatSampleivNV(target, internalformat, samples, pname, params.remaining(), memAddress(params));
    }

    /** {@code void glGetInternalformatSampleivNV(GLenum target, GLenum internalformat, GLsizei samples, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void glGetInternalformatSampleivNV(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int samples, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetInternalformatSampleivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, samples, pname, params.length, params, __functionAddress);
    }

}
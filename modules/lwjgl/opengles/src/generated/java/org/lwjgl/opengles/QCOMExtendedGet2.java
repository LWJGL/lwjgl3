/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class QCOMExtendedGet2 {

    static { GLES.initialize(); }

    protected QCOMExtendedGet2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glExtGetShadersQCOM ] ---

    /** {@code void glExtGetShadersQCOM(GLuint * shaders, GLint maxShaders, GLint * numShaders)} */
    public static native void nglExtGetShadersQCOM(long shaders, int maxShaders, long numShaders);

    /** {@code void glExtGetShadersQCOM(GLuint * shaders, GLint maxShaders, GLint * numShaders)} */
    public static void glExtGetShadersQCOM(@NativeType("GLuint *") @Nullable IntBuffer shaders, @NativeType("GLint *") @Nullable IntBuffer numShaders) {
        if (CHECKS) {
            checkSafe(numShaders, 1);
        }
        nglExtGetShadersQCOM(memAddressSafe(shaders), remainingSafe(shaders), memAddressSafe(numShaders));
    }

    // --- [ glExtGetProgramsQCOM ] ---

    /** {@code void glExtGetProgramsQCOM(GLuint * programs, GLint maxPrograms, GLint * numPrograms)} */
    public static native void nglExtGetProgramsQCOM(long programs, int maxPrograms, long numPrograms);

    /** {@code void glExtGetProgramsQCOM(GLuint * programs, GLint maxPrograms, GLint * numPrograms)} */
    public static void glExtGetProgramsQCOM(@NativeType("GLuint *") @Nullable IntBuffer programs, @NativeType("GLint *") @Nullable IntBuffer numPrograms) {
        if (CHECKS) {
            checkSafe(numPrograms, 1);
        }
        nglExtGetProgramsQCOM(memAddressSafe(programs), remainingSafe(programs), memAddressSafe(numPrograms));
    }

    // --- [ glExtIsProgramBinaryQCOM ] ---

    /** {@code GLboolean glExtIsProgramBinaryQCOM(GLuint program)} */
    @NativeType("GLboolean")
    public static native boolean glExtIsProgramBinaryQCOM(@NativeType("GLuint") int program);

    // --- [ glExtGetProgramBinarySourceQCOM ] ---

    /** {@code void glExtGetProgramBinarySourceQCOM(GLuint program, GLenum shadertype, GLchar * source, GLint * length)} */
    public static native void nglExtGetProgramBinarySourceQCOM(int program, int shadertype, long source, long length);

    /** {@code void glExtGetProgramBinarySourceQCOM(GLuint program, GLenum shadertype, GLchar * source, GLint * length)} */
    public static void glExtGetProgramBinarySourceQCOM(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar *") ByteBuffer source, @NativeType("GLint *") @Nullable IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglExtGetProgramBinarySourceQCOM(program, shadertype, memAddress(source), memAddressSafe(length));
    }

    /** {@code void glExtGetShadersQCOM(GLuint * shaders, GLint maxShaders, GLint * numShaders)} */
    public static void glExtGetShadersQCOM(@NativeType("GLuint *") int @Nullable [] shaders, @NativeType("GLint *") int @Nullable [] numShaders) {
        long __functionAddress = GLES.getICD().glExtGetShadersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numShaders, 1);
        }
        callPPV(shaders, lengthSafe(shaders), numShaders, __functionAddress);
    }

    /** {@code void glExtGetProgramsQCOM(GLuint * programs, GLint maxPrograms, GLint * numPrograms)} */
    public static void glExtGetProgramsQCOM(@NativeType("GLuint *") int @Nullable [] programs, @NativeType("GLint *") int @Nullable [] numPrograms) {
        long __functionAddress = GLES.getICD().glExtGetProgramsQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numPrograms, 1);
        }
        callPPV(programs, lengthSafe(programs), numPrograms, __functionAddress);
    }

    /** {@code void glExtGetProgramBinarySourceQCOM(GLuint program, GLenum shadertype, GLchar * source, GLint * length)} */
    public static void glExtGetProgramBinarySourceQCOM(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar *") ByteBuffer source, @NativeType("GLint *") int @Nullable [] length) {
        long __functionAddress = GLES.getICD().glExtGetProgramBinarySourceQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, shadertype, memAddress(source), length, __functionAddress);
    }

}
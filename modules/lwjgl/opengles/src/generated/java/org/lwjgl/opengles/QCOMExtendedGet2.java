/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_extended_get2.txt">QCOM_extended_get2</a> extension.
 * 
 * <p>This extension enables instrumenting the driver for debugging of OpenGL ES applications.</p>
 */
public class QCOMExtendedGet2 {

    static { GLES.initialize(); }

    protected QCOMExtendedGet2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glExtGetShadersQCOM ] ---

    public static native void nglExtGetShadersQCOM(long shaders, int maxShaders, long numShaders);

    public static void glExtGetShadersQCOM(@Nullable @NativeType("GLuint *") IntBuffer shaders, @Nullable @NativeType("GLint *") IntBuffer numShaders) {
        if (CHECKS) {
            checkSafe(numShaders, 1);
        }
        nglExtGetShadersQCOM(memAddressSafe(shaders), remainingSafe(shaders), memAddressSafe(numShaders));
    }

    // --- [ glExtGetProgramsQCOM ] ---

    public static native void nglExtGetProgramsQCOM(long programs, int maxPrograms, long numPrograms);

    public static void glExtGetProgramsQCOM(@Nullable @NativeType("GLuint *") IntBuffer programs, @Nullable @NativeType("GLint *") IntBuffer numPrograms) {
        if (CHECKS) {
            checkSafe(numPrograms, 1);
        }
        nglExtGetProgramsQCOM(memAddressSafe(programs), remainingSafe(programs), memAddressSafe(numPrograms));
    }

    // --- [ glExtIsProgramBinaryQCOM ] ---

    @NativeType("GLboolean")
    public static native boolean glExtIsProgramBinaryQCOM(@NativeType("GLuint") int program);

    // --- [ glExtGetProgramBinarySourceQCOM ] ---

    public static native void nglExtGetProgramBinarySourceQCOM(int program, int shadertype, long source, long length);

    public static void glExtGetProgramBinarySourceQCOM(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar *") ByteBuffer source, @Nullable @NativeType("GLint *") IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglExtGetProgramBinarySourceQCOM(program, shadertype, memAddress(source), memAddressSafe(length));
    }

    /** Array version of: {@link #glExtGetShadersQCOM ExtGetShadersQCOM} */
    public static void glExtGetShadersQCOM(@Nullable @NativeType("GLuint *") int[] shaders, @Nullable @NativeType("GLint *") int[] numShaders) {
        long __functionAddress = GLES.getICD().glExtGetShadersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numShaders, 1);
        }
        callPPV(shaders, lengthSafe(shaders), numShaders, __functionAddress);
    }

    /** Array version of: {@link #glExtGetProgramsQCOM ExtGetProgramsQCOM} */
    public static void glExtGetProgramsQCOM(@Nullable @NativeType("GLuint *") int[] programs, @Nullable @NativeType("GLint *") int[] numPrograms) {
        long __functionAddress = GLES.getICD().glExtGetProgramsQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numPrograms, 1);
        }
        callPPV(programs, lengthSafe(programs), numPrograms, __functionAddress);
    }

    /** Array version of: {@link #glExtGetProgramBinarySourceQCOM ExtGetProgramBinarySourceQCOM} */
    public static void glExtGetProgramBinarySourceQCOM(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar *") ByteBuffer source, @Nullable @NativeType("GLint *") int[] length) {
        long __functionAddress = GLES.getICD().glExtGetProgramBinarySourceQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, shadertype, memAddress(source), length, __functionAddress);
    }

}
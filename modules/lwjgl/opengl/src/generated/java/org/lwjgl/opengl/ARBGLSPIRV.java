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

public class ARBGLSPIRV {

    static { GL.initialize(); }

    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 0x9551;

    public static final int GL_SPIR_V_BINARY_ARB = 0x9552;

    protected ARBGLSPIRV() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSpecializeShaderARB ] ---

    /** {@code void glSpecializeShaderARB(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static native void nglSpecializeShaderARB(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue);

    /** {@code void glSpecializeShaderARB(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") IntBuffer pConstantIndex, @NativeType("GLuint const *") IntBuffer pConstantValue) {
        if (CHECKS) {
            checkNT1(pEntryPoint);
            check(pConstantValue, pConstantIndex.remaining());
        }
        nglSpecializeShaderARB(shader, memAddress(pEntryPoint), pConstantIndex.remaining(), memAddress(pConstantIndex), memAddress(pConstantValue));
    }

    /** {@code void glSpecializeShaderARB(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") IntBuffer pConstantIndex, @NativeType("GLuint const *") IntBuffer pConstantValue) {
        if (CHECKS) {
            check(pConstantValue, pConstantIndex.remaining());
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            nglSpecializeShaderARB(shader, pEntryPointEncoded, pConstantIndex.remaining(), memAddress(pConstantIndex), memAddress(pConstantValue));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glSpecializeShaderARB(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") int[] pConstantIndex, @NativeType("GLuint const *") int[] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShaderARB;
        if (CHECKS) {
            check(__functionAddress);
            checkNT1(pEntryPoint);
            check(pConstantValue, pConstantIndex.length);
        }
        callPPPV(shader, memAddress(pEntryPoint), pConstantIndex.length, pConstantIndex, pConstantValue, __functionAddress);
    }

    /** {@code void glSpecializeShaderARB(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") int[] pConstantIndex, @NativeType("GLuint const *") int[] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShaderARB;
        if (CHECKS) {
            check(__functionAddress);
            check(pConstantValue, pConstantIndex.length);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            callPPPV(shader, pEntryPointEncoded, pConstantIndex.length, pConstantIndex, pConstantValue, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}
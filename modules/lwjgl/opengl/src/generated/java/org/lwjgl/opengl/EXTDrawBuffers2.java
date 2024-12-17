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

public class EXTDrawBuffers2 {

    static { GL.initialize(); }

    protected EXTDrawBuffers2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glColorMaskIndexedEXT ] ---

    /** {@code void glColorMaskIndexedEXT(GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a)} */
    public static native void glColorMaskIndexedEXT(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glGetBooleanIndexedvEXT ] ---

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    public static native void nglGetBooleanIndexedvEXT(int target, int index, long data);

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    public static void glGetBooleanIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetBooleanIndexedvEXT(target, index, memAddress(data));
    }

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    @NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer data = stack.calloc(1);
            nglGetBooleanIndexedvEXT(target, index, memAddress(data));
            return data.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetIntegerIndexedvEXT ] ---

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static native void nglGetIntegerIndexedvEXT(int target, int index, long data);

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetIntegerIndexedvEXT(target, index, memAddress(data));
    }

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    @NativeType("void")
    public static int glGetIntegerIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetIntegerIndexedvEXT(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnableIndexedEXT ] ---

    /** {@code void glEnableIndexedEXT(GLenum target, GLuint index)} */
    public static native void glEnableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDisableIndexedEXT ] ---

    /** {@code void glDisableIndexedEXT(GLenum target, GLuint index)} */
    public static native void glDisableIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glIsEnabledIndexedEXT ] ---

    /** {@code GLboolean glIsEnabledIndexedEXT(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static native boolean glIsEnabledIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetIntegerIndexedvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

}
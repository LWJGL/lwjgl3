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

public class APPLEObjectPurgeable {

    static { GL.initialize(); }

    public static final int
        GL_RELEASED_APPLE = 0x8A19,
        GL_VOLATILE_APPLE = 0x8A1A;

    public static final int
        GL_RETAINED_APPLE  = 0x8A1B,
        GL_UNDEFINED_APPLE = 0x8A1C;

    public static final int GL_PURGEABLE_APPLE = 0x8A1D;

    public static final int GL_BUFFER_OBJECT_APPLE = 0x85B3;

    protected APPLEObjectPurgeable() {
        throw new UnsupportedOperationException();
    }

    // --- [ glObjectPurgeableAPPLE ] ---

    /** {@code GLenum glObjectPurgeableAPPLE(GLenum objectType, GLuint name, GLenum option)} */
    @NativeType("GLenum")
    public static native int glObjectPurgeableAPPLE(@NativeType("GLenum") int objectType, @NativeType("GLuint") int name, @NativeType("GLenum") int option);

    // --- [ glObjectUnpurgeableAPPLE ] ---

    /** {@code GLenum glObjectUnpurgeableAPPLE(GLenum objectType, GLuint name, GLenum option)} */
    @NativeType("GLenum")
    public static native int glObjectUnpurgeableAPPLE(@NativeType("GLenum") int objectType, @NativeType("GLuint") int name, @NativeType("GLenum") int option);

    // --- [ glGetObjectParameterivAPPLE ] ---

    /** {@code void glGetObjectParameterivAPPLE(GLenum objectType, GLuint name, GLenum pname, GLint * params)} */
    public static native void nglGetObjectParameterivAPPLE(int objectType, int name, int pname, long params);

    /** {@code void glGetObjectParameterivAPPLE(GLenum objectType, GLuint name, GLenum pname, GLint * params)} */
    public static void glGetObjectParameterivAPPLE(@NativeType("GLenum") int objectType, @NativeType("GLuint") int name, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetObjectParameterivAPPLE(objectType, name, pname, memAddress(params));
    }

    /** {@code void glGetObjectParameterivAPPLE(GLenum objectType, GLuint name, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetObjectParameterivAPPLE(@NativeType("GLenum") int objectType, @NativeType("GLuint") int name, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetObjectParameterivAPPLE(objectType, name, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetObjectParameterivAPPLE(GLenum objectType, GLuint name, GLenum pname, GLint * params)} */
    public static void glGetObjectParameterivAPPLE(@NativeType("GLenum") int objectType, @NativeType("GLuint") int name, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetObjectParameterivAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(objectType, name, pname, params, __functionAddress);
    }

}
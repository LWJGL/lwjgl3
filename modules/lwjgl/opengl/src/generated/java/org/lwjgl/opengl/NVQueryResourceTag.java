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

public class NVQueryResourceTag {

    static { GL.initialize(); }

    protected NVQueryResourceTag() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenQueryResourceTagNV ] ---

    /** {@code void glGenQueryResourceTagNV(GLsizei n, GLuint * tagIds)} */
    public static native void nglGenQueryResourceTagNV(int n, long tagIds);

    /** {@code void glGenQueryResourceTagNV(GLsizei n, GLuint * tagIds)} */
    public static void glGenQueryResourceTagNV(@NativeType("GLuint *") IntBuffer tagIds) {
        nglGenQueryResourceTagNV(tagIds.remaining(), memAddress(tagIds));
    }

    /** {@code void glGenQueryResourceTagNV(GLsizei n, GLuint * tagIds)} */
    @NativeType("void")
    public static int glGenQueryResourceTagNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer tagIds = stack.callocInt(1);
            nglGenQueryResourceTagNV(1, memAddress(tagIds));
            return tagIds.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteQueryResourceTagNV ] ---

    /** {@code void glDeleteQueryResourceTagNV(GLsizei n, GLuint const * tagIds)} */
    public static native void nglDeleteQueryResourceTagNV(int n, long tagIds);

    /** {@code void glDeleteQueryResourceTagNV(GLsizei n, GLuint const * tagIds)} */
    public static void glDeleteQueryResourceTagNV(@NativeType("GLuint const *") IntBuffer tagIds) {
        nglDeleteQueryResourceTagNV(tagIds.remaining(), memAddress(tagIds));
    }

    /** {@code void glDeleteQueryResourceTagNV(GLsizei n, GLuint const * tagIds)} */
    public static void glDeleteQueryResourceTagNV(@NativeType("GLuint const *") int tagId) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer tagIds = stack.ints(tagId);
            nglDeleteQueryResourceTagNV(1, memAddress(tagIds));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glQueryResourceTagNV ] ---

    /** {@code void glQueryResourceTagNV(GLuint tagId, GLchar const * tagString)} */
    public static native void nglQueryResourceTagNV(int tagId, long tagString);

    /** {@code void glQueryResourceTagNV(GLuint tagId, GLchar const * tagString)} */
    public static void glQueryResourceTagNV(@NativeType("GLuint") int tagId, @NativeType("GLchar const *") ByteBuffer tagString) {
        if (CHECKS) {
            checkNT1(tagString);
        }
        nglQueryResourceTagNV(tagId, memAddress(tagString));
    }

    /** {@code void glQueryResourceTagNV(GLuint tagId, GLchar const * tagString)} */
    public static void glQueryResourceTagNV(@NativeType("GLuint") int tagId, @NativeType("GLchar const *") CharSequence tagString) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(tagString, true);
            long tagStringEncoded = stack.getPointerAddress();
            nglQueryResourceTagNV(tagId, tagStringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGenQueryResourceTagNV(GLsizei n, GLuint * tagIds)} */
    public static void glGenQueryResourceTagNV(@NativeType("GLuint *") int[] tagIds) {
        long __functionAddress = GL.getICD().glGenQueryResourceTagNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tagIds.length, tagIds, __functionAddress);
    }

    /** {@code void glDeleteQueryResourceTagNV(GLsizei n, GLuint const * tagIds)} */
    public static void glDeleteQueryResourceTagNV(@NativeType("GLuint const *") int[] tagIds) {
        long __functionAddress = GL.getICD().glDeleteQueryResourceTagNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tagIds.length, tagIds, __functionAddress);
    }

}
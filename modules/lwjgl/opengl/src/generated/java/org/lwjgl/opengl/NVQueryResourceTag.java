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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_query_resource_tag.txt">NV_query_resource_tag</a> extension.
 * 
 * <p>This extension adds the capability to associate a tag with one or more memory resource allocations. This tag can be reported back during
 * {@code queryResource} operations and also be used to limit resource reporting to only those allocations with the specified tag. A tag is a previously
 * reserved id and an optional text string.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and {@link NVQueryResource NV_query_resource}.</p>
 */
public class NVQueryResourceTag {

    static { GL.initialize(); }

    protected NVQueryResourceTag() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenQueryResourceTagNV ] ---

    public static native void nglGenQueryResourceTagNV(int n, long tagIds);

    public static void glGenQueryResourceTagNV(@NativeType("GLuint *") IntBuffer tagIds) {
        nglGenQueryResourceTagNV(tagIds.remaining(), memAddress(tagIds));
    }

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

    public static native void nglDeleteQueryResourceTagNV(int n, long tagIds);

    public static void glDeleteQueryResourceTagNV(@NativeType("GLuint const *") IntBuffer tagIds) {
        nglDeleteQueryResourceTagNV(tagIds.remaining(), memAddress(tagIds));
    }

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

    public static native void nglQueryResourceTagNV(int tagId, long tagString);

    public static void glQueryResourceTagNV(@NativeType("GLuint") int tagId, @NativeType("GLchar const *") ByteBuffer tagString) {
        if (CHECKS) {
            checkNT1(tagString);
        }
        nglQueryResourceTagNV(tagId, memAddress(tagString));
    }

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

    /** Array version of: {@link #glGenQueryResourceTagNV GenQueryResourceTagNV} */
    public static void glGenQueryResourceTagNV(@NativeType("GLuint *") int[] tagIds) {
        long __functionAddress = GL.getICD().glGenQueryResourceTagNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tagIds.length, tagIds, __functionAddress);
    }

    /** Array version of: {@link #glDeleteQueryResourceTagNV DeleteQueryResourceTagNV} */
    public static void glDeleteQueryResourceTagNV(@NativeType("GLuint const *") int[] tagIds) {
        long __functionAddress = GL.getICD().glDeleteQueryResourceTagNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tagIds.length, tagIds, __functionAddress);
    }

}
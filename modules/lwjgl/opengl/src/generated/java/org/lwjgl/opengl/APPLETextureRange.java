/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class APPLETextureRange {

    static { GL.initialize(); }

    public static final int GL_TEXTURE_STORAGE_HINT_APPLE = 0x85BC;

    public static final int
        GL_STORAGE_PRIVATE_APPLE = 0x85BD,
        GL_STORAGE_CACHED_APPLE  = 0x85BE,
        GL_STORAGE_SHARED_APPLE  = 0x85BF;

    public static final int GL_TEXTURE_RANGE_LENGTH_APPLE = 0x85B7;

    public static final int GL_TEXTURE_RANGE_POINTER_APPLE = 0x85B8;

    protected APPLETextureRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureRangeAPPLE ] ---

    /** {@code void glTextureRangeAPPLE(GLenum target, GLsizei length, void * pointer)} */
    public static native void nglTextureRangeAPPLE(int target, int length, long pointer);

    /** {@code void glTextureRangeAPPLE(GLenum target, GLsizei length, void * pointer)} */
    public static void glTextureRangeAPPLE(@NativeType("GLenum") int target, @NativeType("void *") ByteBuffer pointer) {
        nglTextureRangeAPPLE(target, pointer.remaining(), memAddress(pointer));
    }

    // --- [ glGetTexParameterPointervAPPLE ] ---

    /** {@code void glGetTexParameterPointervAPPLE(GLenum target, GLenum pname, void ** params)} */
    public static native void nglGetTexParameterPointervAPPLE(int target, int pname, long params);

    /** {@code void glGetTexParameterPointervAPPLE(GLenum target, GLenum pname, void ** params)} */
    public static void glGetTexParameterPointervAPPLE(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterPointervAPPLE(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterPointervAPPLE(GLenum target, GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetTexParameterPointervAPPLE(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetTexParameterPointervAPPLE(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}
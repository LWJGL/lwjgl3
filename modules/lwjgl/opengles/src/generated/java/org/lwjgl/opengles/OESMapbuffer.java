/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class OESMapbuffer {

    static { GLES.initialize(); }

    public static final int GL_WRITE_ONLY_OES = 0x88B9;

    public static final int
        GL_BUFFER_ACCESS_OES = 0x88BB,
        GL_BUFFER_MAPPED_OES = 0x88BC;

    public static final int GL_BUFFER_MAP_POINTER_OES = 0x88BD;

    protected OESMapbuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMapBufferOES ] ---

    /** {@code void * glMapBufferOES(GLenum target, GLenum access)} */
    public static native long nglMapBufferOES(int target, int access);

    /** {@code void * glMapBufferOES(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferOES(@NativeType("GLenum") int target, @NativeType("GLenum") int access) {
        long __result = nglMapBufferOES(target, access);
        return memByteBufferSafe(__result, GLES20.glGetBufferParameteri(target, GLES20.GL_BUFFER_SIZE));
    }

    /** {@code void * glMapBufferOES(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferOES(@NativeType("GLenum") int target, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferOES(target, access);
        int length = GLES20.glGetBufferParameteri(target, GLES20.GL_BUFFER_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /** {@code void * glMapBufferOES(GLenum target, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferOES(@NativeType("GLenum") int target, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferOES(target, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapBufferOES ] ---

    /** {@code GLboolean glUnmapBufferOES(GLenum target)} */
    @NativeType("GLboolean")
    public static native boolean glUnmapBufferOES(@NativeType("GLenum") int target);

    // --- [ glGetBufferPointervOES ] ---

    /** {@code void glGetBufferPointervOES(GLenum target, GLenum pname, void ** params)} */
    public static native void nglGetBufferPointervOES(int target, int pname, long params);

    /** {@code void glGetBufferPointervOES(GLenum target, GLenum pname, void ** params)} */
    public static void glGetBufferPointervOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferPointervOES(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferPointervOES(GLenum target, GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetBufferPointerOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetBufferPointervOES(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}
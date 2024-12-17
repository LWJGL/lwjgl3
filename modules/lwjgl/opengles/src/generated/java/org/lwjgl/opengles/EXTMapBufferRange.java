/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTMapBufferRange {

    static { GLES.initialize(); }

    public static final int
        GL_MAP_READ_BIT_EXT              = 0x1,
        GL_MAP_WRITE_BIT_EXT             = 0x2,
        GL_MAP_INVALIDATE_RANGE_BIT_EXT  = 0x4,
        GL_MAP_INVALIDATE_BUFFER_BIT_EXT = 0x8,
        GL_MAP_FLUSH_EXPLICIT_BIT_EXT    = 0x10,
        GL_MAP_UNSYNCHRONIZED_BIT_EXT    = 0x20;

    protected EXTMapBufferRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMapBufferRangeEXT ] ---

    /** {@code void * glMapBufferRangeEXT(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    public static native long nglMapBufferRangeEXT(int target, long offset, long length, int access);

    /** {@code void * glMapBufferRangeEXT(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        long __result = nglMapBufferRangeEXT(target, offset, length, access);
        return memByteBufferSafe(__result, (int)length);
    }

    /** {@code void * glMapBufferRangeEXT(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferRangeEXT(target, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glFlushMappedBufferRangeEXT ] ---

    /** {@code void glFlushMappedBufferRangeEXT(GLenum target, GLintptr offset, GLsizeiptr length)} */
    public static native void glFlushMappedBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

}
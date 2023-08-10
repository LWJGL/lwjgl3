/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_map_buffer_range.txt">EXT_map_buffer_range</a> extension.
 * 
 * <p>EXT_map_buffer_range expands the buffer object API to allow greater performance when a client application only needs to write to a sub-range of a
 * buffer object. To that end, this extension introduces two new buffer object features: non-serialized buffer modification and explicit sub-range
 * flushing for mapped buffer objects.</p>
 * 
 * <p>OpenGL requires that commands occur in a FIFO manner meaning that any changes to buffer objects either block until the data has been processed by the
 * OpenGL pipeline or else create extra copies to avoid such a block. By providing a method to asynchronously modify buffer object data, an application is
 * then able to manage the synchronization points themselves and modify ranges of data contained by a buffer object even though OpenGL might still be
 * using other parts of it.</p>
 * 
 * <p>This extension also provides a method for explicitly flushing ranges of a mapped buffer object so OpenGL does not have to assume that the entire range
 * may have been modified. Further, it allows the application to more precisely specify its intent with respect to reading, writing, and whether the
 * previous contents of a mapped range of interest need be preserved prior to modification.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link OESMapbuffer OES_mapbuffer}.</p>
 */
public class EXTMapBufferRange {

    static { GLES.initialize(); }

    /** Accepted by the {@code access} parameter of MapBufferRangeEXT. */
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

    public static native long nglMapBufferRangeEXT(int target, long offset, long length, int access);

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        long __result = nglMapBufferRangeEXT(target, offset, length, access);
        return memByteBufferSafe(__result, (int)length);
    }

    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferRangeEXT(target, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glFlushMappedBufferRangeEXT ] ---

    public static native void glFlushMappedBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

}
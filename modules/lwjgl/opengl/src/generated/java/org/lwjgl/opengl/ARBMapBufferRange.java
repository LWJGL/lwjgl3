/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_map_buffer_range.txt">ARB_map_buffer_range</a> extension.
 * 
 * <p>ARB_map_buffer_range expands the buffer object API to allow greater performance when a client application only needs to write to a sub-range of a buffer
 * object. To that end, this extension introduces two new buffer object features: non-serialized buffer modification and explicit sub-range flushing for
 * mapped buffer objects.</p>
 * 
 * <p>OpenGL requires that commands occur in a FIFO manner meaning that any changes to buffer objects either block until the data has been processed by the
 * OpenGL pipeline or else create extra copies to avoid such a block. By providing a method to asynchronously modify buffer object data, an application is
 * then able to manage the synchronization points themselves and modify ranges of data contained by a buffer object even though OpenGL might still be using
 * other parts of it.</p>
 * 
 * <p>This extension also provides a method for explicitly flushing ranges of a mapped buffer object so OpenGL does not have to assume that the entire range
 * may have been modified. Further, it allows the application to more precisely specify its intent with respect to reading, writing, and whether the
 * previous contents of a mapped range of interest need be preserved prior to modification.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1}. Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class ARBMapBufferRange {

    static { GL.initialize(); }

    /** Accepted by the {@code access} parameter of MapBufferRange. */
    public static final int
        GL_MAP_READ_BIT              = 0x1,
        GL_MAP_WRITE_BIT             = 0x2,
        GL_MAP_INVALIDATE_RANGE_BIT  = 0x4,
        GL_MAP_INVALIDATE_BUFFER_BIT = 0x8,
        GL_MAP_FLUSH_EXPLICIT_BIT    = 0x10,
        GL_MAP_UNSYNCHRONIZED_BIT    = 0x20;

    protected ARBMapBufferRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMapBufferRange ] ---

    /** Unsafe version of: {@link #glMapBufferRange MapBufferRange} */
    public static long nglMapBufferRange(int target, long offset, long length, int access) {
        return GL30C.nglMapBufferRange(target, offset, length, access);
    }

    /**
     * Maps a section of a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 2 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
     * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li>
     * </ol>
     *
     * @param target a binding to which the target buffer is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30C#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30C#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30C#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30C#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        return GL30C.glMapBufferRange(target, offset, length, access);
    }

    /**
     * Maps a section of a buffer object's data store.
     * 
     * <p><b>LWJGL note</b>: This method comes in 2 flavors:</p>
     * 
     * <ol>
     * <li>{@link #glMapBufferRange(int, long, long, int)} - Always returns a new ByteBuffer instance.</li>
     * <li>{@link #glMapBufferRange(int, long, long, int, ByteBuffer)} - The {@code old_buffer} parameter is reused if not null.</li>
     * </ol>
     *
     * @param target a binding to which the target buffer is bound. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the starting offset within the buffer of the range to be mapped
     * @param length the length of the range to be mapped
     * @param access a combination of access flags indicating the desired access to the range. One or more of:<br><table><tr><td>{@link GL30C#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30C#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_RANGE_BIT MAP_INVALIDATE_RANGE_BIT}</td><td>{@link GL30C#GL_MAP_INVALIDATE_BUFFER_BIT MAP_INVALIDATE_BUFFER_BIT}</td></tr><tr><td>{@link GL30C#GL_MAP_FLUSH_EXPLICIT_BIT MAP_FLUSH_EXPLICIT_BIT}</td><td>{@link GL30C#GL_MAP_UNSYNCHRONIZED_BIT MAP_UNSYNCHRONIZED_BIT}</td></tr></table>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        return GL30C.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    // --- [ glFlushMappedBufferRange ] ---

    /**
     * Indicates modifications to a range of a mapped buffer.
     *
     * @param target the target of the flush operation. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30C#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the start of the buffer subrange, in basic machine units
     * @param length the length of the buffer subrange, in basic machine units
     */
    public static void glFlushMappedBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        GL30C.glFlushMappedBufferRange(target, offset, length);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_copy_buffer.txt">ARB_copy_buffer</a> extension.
 * 
 * <p>This extension provides a mechanism to do an accelerated copy from one buffer object to another. This may be useful to load buffer objects in a "loading
 * thread" while minimizing cost and synchronization effort in the "rendering thread."</p>
 * 
 * <p>Promoted to core in {@link GL31 OpenGL 3.1}.</p>
 */
public class ARBCopyBuffer {

    static { GL.initialize(); }

    /**
     * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
     * FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
     */
    public static final int
        GL_COPY_READ_BUFFER  = 0x8F36,
        GL_COPY_WRITE_BUFFER = 0x8F37;

    protected ARBCopyBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCopyBufferSubData ] ---

    /**
     * Copies all or part of one buffer object's data store to the data store of another buffer object.
     * 
     * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if any of readoffset, writeoffset, or size are negative, if readoffset+size exceeds the size of the buffer object
     * bound to readtarget, or if writeoffset+size exceeds the size of the buffer object bound to writetarget.</p>
     * 
     * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if the same buffer object is bound to both readtarget and writetarget, and the ranges [readoffset, readoffset+size)
     * and [writeoffset, writeoffset+size) overlap.</p>
     * 
     * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if zero is bound to readtarget or writetarget.</p>
     * 
     * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if the buffer objects bound to either readtarget or writetarget are mapped.</p>
     *
     * @param readTarget  the source buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL31C#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td><td>{@link GL31C#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td></tr><tr><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31C#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td></tr></table>
     * @param writeTarget the destination buffer object target
     * @param readOffset  the source buffer object offset, in bytes
     * @param writeOffset the destination buffer object offset, in bytes
     * @param size        the number of bytes to copy
     */
    public static void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        GL31C.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

}
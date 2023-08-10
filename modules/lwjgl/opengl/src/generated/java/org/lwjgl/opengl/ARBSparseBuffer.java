/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_sparse_buffer.txt">ARB_sparse_buffer</a> extension.
 * 
 * <p>This extension adds to GL a mechanism to decouple the virtual and physical storage requirements of textures and allows an application
 * to create partially populated textures that would over-subscribe available graphics memory if made fully resident. This extension provides like
 * functionality for buffer objects, allowing applications to manage buffer object storage in a similar manner.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5} or {@link ARBVertexBufferObject ARB_vertex_buffer_object}.</p>
 */
public class ARBSparseBuffer {

    static { GL.initialize(); }

    /** Accepted as part of the {@code flags} parameter to {@link GL44C#glBufferStorage BufferStorage}. */
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x400;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;

    protected ARBSparseBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferPageCommitmentARB ] ---

    /**
     * Commit and de-commits regions of sparse buffer storage.
     *
     * @param target buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td><td>{@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td></tr><tr><td>{@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td><td>{@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}</td></tr><tr><td>{@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}</td><td>{@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}</td></tr></table>
     * @param offset the region offset. Must be an integer multiple of the implementation dependent constant {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}.
     * @param size   the data size. must either be a multiple of {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}, or extend to the end of the buffer's data store.
     * @param commit If true, then pages contained in the specified range become committed and become physically backed. If false, then physical storage associated with
     *               the data store in the specified region may be freed and those pages become uncommitted. Newly committed pages have undefined content. However,
     *               redundantly committing pages does not alter their content.
     */
    public static native void glBufferPageCommitmentARB(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit);

    // --- [ glNamedBufferPageCommitmentEXT ] ---

    /**
     * Direct-state-access version of {@link #glBufferPageCommitmentARB BufferPageCommitmentARB}.
     *
     * @param buffer the buffer object
     * @param offset the region offset. Must be an integer multiple of the implementation dependent constant {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}.
     * @param size   the data size. must either be a multiple of {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}, or extend to the end of the buffer's data store.
     * @param commit the commit state
     */
    public static native void glNamedBufferPageCommitmentEXT(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit);

    // --- [ glNamedBufferPageCommitmentARB ] ---

    /**
     * Direct-state-access version of {@link #glBufferPageCommitmentARB BufferPageCommitmentARB}.
     *
     * @param buffer the buffer object
     * @param offset the region offset. Must be an integer multiple of the implementation dependent constant {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}.
     * @param size   the data size. must either be a multiple of {@link #GL_SPARSE_BUFFER_PAGE_SIZE_ARB SPARSE_BUFFER_PAGE_SIZE_ARB}, or extend to the end of the buffer's data store.
     * @param commit the commit state
     */
    public static native void glNamedBufferPageCommitmentARB(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLboolean") boolean commit);

}
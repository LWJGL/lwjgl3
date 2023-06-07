/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_GRAPH_INSTANTIATE_PARAMS {
 *     cuuint64_t flags;
 *     CUstream hUploadStream;
 *     CUgraphNode hErrNode_out;
 *     CUgraphInstantiateResult result_out;
 * }</code></pre>
 */
public class CUDA_GRAPH_INSTANTIATE_PARAMS extends Struct<CUDA_GRAPH_INSTANTIATE_PARAMS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        HUPLOADSTREAM,
        HERRNODE_OUT,
        RESULT_OUT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        HUPLOADSTREAM = layout.offsetof(1);
        HERRNODE_OUT = layout.offsetof(2);
        RESULT_OUT = layout.offsetof(3);
    }

    protected CUDA_GRAPH_INSTANTIATE_PARAMS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_GRAPH_INSTANTIATE_PARAMS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_GRAPH_INSTANTIATE_PARAMS(address, container);
    }

    /**
     * Creates a {@code CUDA_GRAPH_INSTANTIATE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_GRAPH_INSTANTIATE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("cuuint64_t")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code hUploadStream} field. */
    @NativeType("CUstream")
    public long hUploadStream() { return nhUploadStream(address()); }
    /** @return the value of the {@code hErrNode_out} field. */
    @NativeType("CUgraphNode")
    public long hErrNode_out() { return nhErrNode_out(address()); }
    /** @return the value of the {@code result_out} field. */
    @NativeType("CUgraphInstantiateResult")
    public int result_out() { return nresult_out(address()); }

    // -----------------------------------

    /** Returns a new {@code CUDA_GRAPH_INSTANTIATE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS malloc() {
        return new CUDA_GRAPH_INSTANTIATE_PARAMS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_GRAPH_INSTANTIATE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS calloc() {
        return new CUDA_GRAPH_INSTANTIATE_PARAMS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_GRAPH_INSTANTIATE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_GRAPH_INSTANTIATE_PARAMS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_GRAPH_INSTANTIATE_PARAMS} instance for the specified memory address. */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS create(long address) {
        return new CUDA_GRAPH_INSTANTIATE_PARAMS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_GRAPH_INSTANTIATE_PARAMS createSafe(long address) {
        return address == NULL ? null : new CUDA_GRAPH_INSTANTIATE_PARAMS(address, null);
    }

    /**
     * Returns a new {@link CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_GRAPH_INSTANTIATE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS malloc(MemoryStack stack) {
        return new CUDA_GRAPH_INSTANTIATE_PARAMS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_GRAPH_INSTANTIATE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS calloc(MemoryStack stack) {
        return new CUDA_GRAPH_INSTANTIATE_PARAMS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + CUDA_GRAPH_INSTANTIATE_PARAMS.FLAGS); }
    /** Unsafe version of {@link #hUploadStream}. */
    public static long nhUploadStream(long struct) { return memGetAddress(struct + CUDA_GRAPH_INSTANTIATE_PARAMS.HUPLOADSTREAM); }
    /** Unsafe version of {@link #hErrNode_out}. */
    public static long nhErrNode_out(long struct) { return memGetAddress(struct + CUDA_GRAPH_INSTANTIATE_PARAMS.HERRNODE_OUT); }
    /** Unsafe version of {@link #result_out}. */
    public static int nresult_out(long struct) { return UNSAFE.getInt(null, struct + CUDA_GRAPH_INSTANTIATE_PARAMS.RESULT_OUT); }

    // -----------------------------------

    /** An array of {@link CUDA_GRAPH_INSTANTIATE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_GRAPH_INSTANTIATE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_GRAPH_INSTANTIATE_PARAMS ELEMENT_FACTORY = CUDA_GRAPH_INSTANTIATE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_GRAPH_INSTANTIATE_PARAMS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_GRAPH_INSTANTIATE_PARAMS#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected CUDA_GRAPH_INSTANTIATE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("cuuint64_t")
        public long flags() { return CUDA_GRAPH_INSTANTIATE_PARAMS.nflags(address()); }
        /** @return the value of the {@code hUploadStream} field. */
        @NativeType("CUstream")
        public long hUploadStream() { return CUDA_GRAPH_INSTANTIATE_PARAMS.nhUploadStream(address()); }
        /** @return the value of the {@code hErrNode_out} field. */
        @NativeType("CUgraphNode")
        public long hErrNode_out() { return CUDA_GRAPH_INSTANTIATE_PARAMS.nhErrNode_out(address()); }
        /** @return the value of the {@code result_out} field. */
        @NativeType("CUgraphInstantiateResult")
        public int result_out() { return CUDA_GRAPH_INSTANTIATE_PARAMS.nresult_out(address()); }

    }

}
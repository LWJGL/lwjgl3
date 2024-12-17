/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct CUDA_CONDITIONAL_NODE_PARAMS {
 *     CUgraphConditionalHandle handle;
 *     CUgraphConditionalNodeType type;
 *     unsigned int size;
 *     CUgraph * phGraph_out;
 *     CUcontext ctx;
 * }}</pre>
 */
public class CUDA_CONDITIONAL_NODE_PARAMS extends Struct<CUDA_CONDITIONAL_NODE_PARAMS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        TYPE,
        SIZE,
        PHGRAPH_OUT,
        CTX;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        SIZE = layout.offsetof(2);
        PHGRAPH_OUT = layout.offsetof(3);
        CTX = layout.offsetof(4);
    }

    protected CUDA_CONDITIONAL_NODE_PARAMS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_CONDITIONAL_NODE_PARAMS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_CONDITIONAL_NODE_PARAMS(address, container);
    }

    /**
     * Creates a {@code CUDA_CONDITIONAL_NODE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_CONDITIONAL_NODE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code handle} field. */
    @NativeType("CUgraphConditionalHandle")
    public long handle() { return nhandle(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("CUgraphConditionalNodeType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("unsigned int")
    public int size() { return nsize(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code phGraph_out} field. */
    @NativeType("CUgraph *")
    public PointerBuffer phGraph_out() { return nphGraph_out(address()); }
    /** @return the value of the {@code ctx} field. */
    @NativeType("CUcontext")
    public long ctx() { return nctx(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public CUDA_CONDITIONAL_NODE_PARAMS handle(@NativeType("CUgraphConditionalHandle") long value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public CUDA_CONDITIONAL_NODE_PARAMS type(@NativeType("CUgraphConditionalNodeType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public CUDA_CONDITIONAL_NODE_PARAMS size(@NativeType("unsigned int") int value) { nsize(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code phGraph_out} field. */
    public CUDA_CONDITIONAL_NODE_PARAMS phGraph_out(@NativeType("CUgraph *") PointerBuffer value) { nphGraph_out(address(), value); return this; }
    /** Sets the specified value to the {@code ctx} field. */
    public CUDA_CONDITIONAL_NODE_PARAMS ctx(@NativeType("CUcontext") long value) { nctx(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_CONDITIONAL_NODE_PARAMS set(
        long handle,
        int type,
        int size,
        PointerBuffer phGraph_out,
        long ctx
    ) {
        handle(handle);
        type(type);
        size(size);
        phGraph_out(phGraph_out);
        ctx(ctx);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_CONDITIONAL_NODE_PARAMS set(CUDA_CONDITIONAL_NODE_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_CONDITIONAL_NODE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_CONDITIONAL_NODE_PARAMS malloc() {
        return new CUDA_CONDITIONAL_NODE_PARAMS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_CONDITIONAL_NODE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_CONDITIONAL_NODE_PARAMS calloc() {
        return new CUDA_CONDITIONAL_NODE_PARAMS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_CONDITIONAL_NODE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_CONDITIONAL_NODE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_CONDITIONAL_NODE_PARAMS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_CONDITIONAL_NODE_PARAMS} instance for the specified memory address. */
    public static CUDA_CONDITIONAL_NODE_PARAMS create(long address) {
        return new CUDA_CONDITIONAL_NODE_PARAMS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_CONDITIONAL_NODE_PARAMS createSafe(long address) {
        return address == NULL ? null : new CUDA_CONDITIONAL_NODE_PARAMS(address, null);
    }

    /**
     * Returns a new {@link CUDA_CONDITIONAL_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_CONDITIONAL_NODE_PARAMS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_CONDITIONAL_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_CONDITIONAL_NODE_PARAMS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_CONDITIONAL_NODE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_CONDITIONAL_NODE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_CONDITIONAL_NODE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_CONDITIONAL_NODE_PARAMS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_CONDITIONAL_NODE_PARAMS.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_CONDITIONAL_NODE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_CONDITIONAL_NODE_PARAMS malloc(MemoryStack stack) {
        return new CUDA_CONDITIONAL_NODE_PARAMS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_CONDITIONAL_NODE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_CONDITIONAL_NODE_PARAMS calloc(MemoryStack stack) {
        return new CUDA_CONDITIONAL_NODE_PARAMS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_CONDITIONAL_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_CONDITIONAL_NODE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_CONDITIONAL_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_CONDITIONAL_NODE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetLong(struct + CUDA_CONDITIONAL_NODE_PARAMS.HANDLE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + CUDA_CONDITIONAL_NODE_PARAMS.TYPE); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + CUDA_CONDITIONAL_NODE_PARAMS.SIZE); }
    /** Unsafe version of {@link #phGraph_out() phGraph_out}. */
    public static PointerBuffer nphGraph_out(long struct) { return memPointerBuffer(memGetAddress(struct + CUDA_CONDITIONAL_NODE_PARAMS.PHGRAPH_OUT), 1); }
    /** Unsafe version of {@link #ctx}. */
    public static long nctx(long struct) { return memGetAddress(struct + CUDA_CONDITIONAL_NODE_PARAMS.CTX); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutLong(struct + CUDA_CONDITIONAL_NODE_PARAMS.HANDLE, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + CUDA_CONDITIONAL_NODE_PARAMS.TYPE, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + CUDA_CONDITIONAL_NODE_PARAMS.SIZE, value); }
    /** Unsafe version of {@link #phGraph_out(PointerBuffer) phGraph_out}. */
    public static void nphGraph_out(long struct, PointerBuffer value) { memPutAddress(struct + CUDA_CONDITIONAL_NODE_PARAMS.PHGRAPH_OUT, memAddress(value)); }
    /** Unsafe version of {@link #ctx(long) ctx}. */
    public static void nctx(long struct, long value) { memPutAddress(struct + CUDA_CONDITIONAL_NODE_PARAMS.CTX, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_CONDITIONAL_NODE_PARAMS.PHGRAPH_OUT));
        check(memGetAddress(struct + CUDA_CONDITIONAL_NODE_PARAMS.CTX));
    }

    // -----------------------------------

    /** An array of {@link CUDA_CONDITIONAL_NODE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_CONDITIONAL_NODE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_CONDITIONAL_NODE_PARAMS ELEMENT_FACTORY = CUDA_CONDITIONAL_NODE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_CONDITIONAL_NODE_PARAMS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_CONDITIONAL_NODE_PARAMS#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected CUDA_CONDITIONAL_NODE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code handle} field. */
        @NativeType("CUgraphConditionalHandle")
        public long handle() { return CUDA_CONDITIONAL_NODE_PARAMS.nhandle(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("CUgraphConditionalNodeType")
        public int type() { return CUDA_CONDITIONAL_NODE_PARAMS.ntype(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("unsigned int")
        public int size() { return CUDA_CONDITIONAL_NODE_PARAMS.nsize(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code phGraph_out} field. */
        @NativeType("CUgraph *")
        public PointerBuffer phGraph_out() { return CUDA_CONDITIONAL_NODE_PARAMS.nphGraph_out(address()); }
        /** @return the value of the {@code ctx} field. */
        @NativeType("CUcontext")
        public long ctx() { return CUDA_CONDITIONAL_NODE_PARAMS.nctx(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public CUDA_CONDITIONAL_NODE_PARAMS.Buffer handle(@NativeType("CUgraphConditionalHandle") long value) { CUDA_CONDITIONAL_NODE_PARAMS.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public CUDA_CONDITIONAL_NODE_PARAMS.Buffer type(@NativeType("CUgraphConditionalNodeType") int value) { CUDA_CONDITIONAL_NODE_PARAMS.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public CUDA_CONDITIONAL_NODE_PARAMS.Buffer size(@NativeType("unsigned int") int value) { CUDA_CONDITIONAL_NODE_PARAMS.nsize(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code phGraph_out} field. */
        public CUDA_CONDITIONAL_NODE_PARAMS.Buffer phGraph_out(@NativeType("CUgraph *") PointerBuffer value) { CUDA_CONDITIONAL_NODE_PARAMS.nphGraph_out(address(), value); return this; }
        /** Sets the specified value to the {@code ctx} field. */
        public CUDA_CONDITIONAL_NODE_PARAMS.Buffer ctx(@NativeType("CUcontext") long value) { CUDA_CONDITIONAL_NODE_PARAMS.nctx(address(), value); return this; }

    }

}
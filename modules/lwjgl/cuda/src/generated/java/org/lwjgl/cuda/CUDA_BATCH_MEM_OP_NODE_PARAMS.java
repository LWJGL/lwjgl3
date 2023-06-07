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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_BATCH_MEM_OP_NODE_PARAMS {
 *     CUcontext ctx;
 *     unsigned int count;
 *     {@link CUstreamBatchMemOpParams CUstreamBatchMemOpParams} * paramArray;
 *     unsigned int flags;
 * }</code></pre>
 */
public class CUDA_BATCH_MEM_OP_NODE_PARAMS extends Struct<CUDA_BATCH_MEM_OP_NODE_PARAMS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CTX,
        COUNT,
        PARAMARRAY,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CTX = layout.offsetof(0);
        COUNT = layout.offsetof(1);
        PARAMARRAY = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected CUDA_BATCH_MEM_OP_NODE_PARAMS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_BATCH_MEM_OP_NODE_PARAMS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_BATCH_MEM_OP_NODE_PARAMS(address, container);
    }

    /**
     * Creates a {@code CUDA_BATCH_MEM_OP_NODE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_BATCH_MEM_OP_NODE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ctx} field. */
    @NativeType("CUcontext")
    public long ctx() { return nctx(address()); }
    /** @return the value of the {@code count} field. */
    @NativeType("unsigned int")
    public int count() { return ncount(address()); }
    /** @return a {@link CUstreamBatchMemOpParams.Buffer} view of the struct array pointed to by the {@code paramArray} field. */
    @Nullable
    @NativeType("CUstreamBatchMemOpParams *")
    public CUstreamBatchMemOpParams.Buffer paramArray() { return nparamArray(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code ctx} field. */
    public CUDA_BATCH_MEM_OP_NODE_PARAMS ctx(@NativeType("CUcontext") long value) { nctx(address(), value); return this; }
    /** Sets the specified value to the {@code count} field. */
    public CUDA_BATCH_MEM_OP_NODE_PARAMS count(@NativeType("unsigned int") int value) { ncount(address(), value); return this; }
    /** Sets the address of the specified {@link CUstreamBatchMemOpParams.Buffer} to the {@code paramArray} field. */
    public CUDA_BATCH_MEM_OP_NODE_PARAMS paramArray(@Nullable @NativeType("CUstreamBatchMemOpParams *") CUstreamBatchMemOpParams.Buffer value) { nparamArray(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public CUDA_BATCH_MEM_OP_NODE_PARAMS flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_BATCH_MEM_OP_NODE_PARAMS set(
        long ctx,
        int count,
        @Nullable CUstreamBatchMemOpParams.Buffer paramArray,
        int flags
    ) {
        ctx(ctx);
        count(count);
        paramArray(paramArray);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_BATCH_MEM_OP_NODE_PARAMS set(CUDA_BATCH_MEM_OP_NODE_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_BATCH_MEM_OP_NODE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS malloc() {
        return new CUDA_BATCH_MEM_OP_NODE_PARAMS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_BATCH_MEM_OP_NODE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS calloc() {
        return new CUDA_BATCH_MEM_OP_NODE_PARAMS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_BATCH_MEM_OP_NODE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_BATCH_MEM_OP_NODE_PARAMS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_BATCH_MEM_OP_NODE_PARAMS} instance for the specified memory address. */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS create(long address) {
        return new CUDA_BATCH_MEM_OP_NODE_PARAMS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS createSafe(long address) {
        return address == NULL ? null : new CUDA_BATCH_MEM_OP_NODE_PARAMS(address, null);
    }

    /**
     * Returns a new {@link CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_BATCH_MEM_OP_NODE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS malloc(MemoryStack stack) {
        return new CUDA_BATCH_MEM_OP_NODE_PARAMS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_BATCH_MEM_OP_NODE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS calloc(MemoryStack stack) {
        return new CUDA_BATCH_MEM_OP_NODE_PARAMS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ctx}. */
    public static long nctx(long struct) { return memGetAddress(struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.CTX); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.COUNT); }
    /** Unsafe version of {@link #paramArray}. */
    @Nullable public static CUstreamBatchMemOpParams.Buffer nparamArray(long struct) { return CUstreamBatchMemOpParams.createSafe(memGetAddress(struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.PARAMARRAY), ncount(struct)); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.FLAGS); }

    /** Unsafe version of {@link #ctx(long) ctx}. */
    public static void nctx(long struct, long value) { memPutAddress(struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.CTX, check(value)); }
    /** Sets the specified value to the {@code count} field of the specified {@code struct}. */
    public static void ncount(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.COUNT, value); }
    /** Unsafe version of {@link #paramArray(CUstreamBatchMemOpParams.Buffer) paramArray}. */
    public static void nparamArray(long struct, @Nullable CUstreamBatchMemOpParams.Buffer value) { memPutAddress(struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.PARAMARRAY, memAddressSafe(value)); ncount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_BATCH_MEM_OP_NODE_PARAMS.CTX));
    }

    // -----------------------------------

    /** An array of {@link CUDA_BATCH_MEM_OP_NODE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_BATCH_MEM_OP_NODE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_BATCH_MEM_OP_NODE_PARAMS ELEMENT_FACTORY = CUDA_BATCH_MEM_OP_NODE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_BATCH_MEM_OP_NODE_PARAMS#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_BATCH_MEM_OP_NODE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ctx} field. */
        @NativeType("CUcontext")
        public long ctx() { return CUDA_BATCH_MEM_OP_NODE_PARAMS.nctx(address()); }
        /** @return the value of the {@code count} field. */
        @NativeType("unsigned int")
        public int count() { return CUDA_BATCH_MEM_OP_NODE_PARAMS.ncount(address()); }
        /** @return a {@link CUstreamBatchMemOpParams.Buffer} view of the struct array pointed to by the {@code paramArray} field. */
        @Nullable
        @NativeType("CUstreamBatchMemOpParams *")
        public CUstreamBatchMemOpParams.Buffer paramArray() { return CUDA_BATCH_MEM_OP_NODE_PARAMS.nparamArray(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("unsigned int")
        public int flags() { return CUDA_BATCH_MEM_OP_NODE_PARAMS.nflags(address()); }

        /** Sets the specified value to the {@code ctx} field. */
        public CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer ctx(@NativeType("CUcontext") long value) { CUDA_BATCH_MEM_OP_NODE_PARAMS.nctx(address(), value); return this; }
        /** Sets the specified value to the {@code count} field. */
        public CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer count(@NativeType("unsigned int") int value) { CUDA_BATCH_MEM_OP_NODE_PARAMS.ncount(address(), value); return this; }
        /** Sets the address of the specified {@link CUstreamBatchMemOpParams.Buffer} to the {@code paramArray} field. */
        public CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer paramArray(@Nullable @NativeType("CUstreamBatchMemOpParams *") CUstreamBatchMemOpParams.Buffer value) { CUDA_BATCH_MEM_OP_NODE_PARAMS.nparamArray(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public CUDA_BATCH_MEM_OP_NODE_PARAMS.Buffer flags(@NativeType("unsigned int") int value) { CUDA_BATCH_MEM_OP_NODE_PARAMS.nflags(address(), value); return this; }

    }

}
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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_MEMCPY_NODE_PARAMS {
 *     int flags;
 *     int reserved;
 *     CUcontext copyCtx;
 *     {@link CUDA_MEMCPY3D CUDA_MEMCPY3D} copyParams;
 * }</code></pre>
 */
public class CUDA_MEMCPY_NODE_PARAMS extends Struct<CUDA_MEMCPY_NODE_PARAMS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        RESERVED,
        COPYCTX,
        COPYPARAMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(CUDA_MEMCPY3D.SIZEOF, CUDA_MEMCPY3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        COPYCTX = layout.offsetof(2);
        COPYPARAMS = layout.offsetof(3);
    }

    protected CUDA_MEMCPY_NODE_PARAMS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_MEMCPY_NODE_PARAMS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_MEMCPY_NODE_PARAMS(address, container);
    }

    /**
     * Creates a {@code CUDA_MEMCPY_NODE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_MEMCPY_NODE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code reserved} field. */
    public int reserved() { return nreserved(address()); }
    /** @return the value of the {@code copyCtx} field. */
    @NativeType("CUcontext")
    public long copyCtx() { return ncopyCtx(address()); }
    /** @return a {@link CUDA_MEMCPY3D} view of the {@code copyParams} field. */
    public CUDA_MEMCPY3D copyParams() { return ncopyParams(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public CUDA_MEMCPY_NODE_PARAMS flags(int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public CUDA_MEMCPY_NODE_PARAMS reserved(int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code copyCtx} field. */
    public CUDA_MEMCPY_NODE_PARAMS copyCtx(@NativeType("CUcontext") long value) { ncopyCtx(address(), value); return this; }
    /** Copies the specified {@link CUDA_MEMCPY3D} to the {@code copyParams} field. */
    public CUDA_MEMCPY_NODE_PARAMS copyParams(CUDA_MEMCPY3D value) { ncopyParams(address(), value); return this; }
    /** Passes the {@code copyParams} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUDA_MEMCPY_NODE_PARAMS copyParams(java.util.function.Consumer<CUDA_MEMCPY3D> consumer) { consumer.accept(copyParams()); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_MEMCPY_NODE_PARAMS set(
        int flags,
        int reserved,
        long copyCtx,
        CUDA_MEMCPY3D copyParams
    ) {
        flags(flags);
        reserved(reserved);
        copyCtx(copyCtx);
        copyParams(copyParams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_MEMCPY_NODE_PARAMS set(CUDA_MEMCPY_NODE_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_MEMCPY_NODE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY_NODE_PARAMS malloc() {
        return new CUDA_MEMCPY_NODE_PARAMS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_MEMCPY_NODE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY_NODE_PARAMS calloc() {
        return new CUDA_MEMCPY_NODE_PARAMS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_MEMCPY_NODE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_MEMCPY_NODE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_MEMCPY_NODE_PARAMS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_MEMCPY_NODE_PARAMS} instance for the specified memory address. */
    public static CUDA_MEMCPY_NODE_PARAMS create(long address) {
        return new CUDA_MEMCPY_NODE_PARAMS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_MEMCPY_NODE_PARAMS createSafe(long address) {
        return address == NULL ? null : new CUDA_MEMCPY_NODE_PARAMS(address, null);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY_NODE_PARAMS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY_NODE_PARAMS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY_NODE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY_NODE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_MEMCPY_NODE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY_NODE_PARAMS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_MEMCPY_NODE_PARAMS.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_MEMCPY_NODE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY_NODE_PARAMS malloc(MemoryStack stack) {
        return new CUDA_MEMCPY_NODE_PARAMS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_MEMCPY_NODE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY_NODE_PARAMS calloc(MemoryStack stack) {
        return new CUDA_MEMCPY_NODE_PARAMS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY_NODE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY_NODE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + CUDA_MEMCPY_NODE_PARAMS.FLAGS); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + CUDA_MEMCPY_NODE_PARAMS.RESERVED); }
    /** Unsafe version of {@link #copyCtx}. */
    public static long ncopyCtx(long struct) { return memGetAddress(struct + CUDA_MEMCPY_NODE_PARAMS.COPYCTX); }
    /** Unsafe version of {@link #copyParams}. */
    public static CUDA_MEMCPY3D ncopyParams(long struct) { return CUDA_MEMCPY3D.create(struct + CUDA_MEMCPY_NODE_PARAMS.COPYPARAMS); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + CUDA_MEMCPY_NODE_PARAMS.FLAGS, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + CUDA_MEMCPY_NODE_PARAMS.RESERVED, value); }
    /** Unsafe version of {@link #copyCtx(long) copyCtx}. */
    public static void ncopyCtx(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY_NODE_PARAMS.COPYCTX, check(value)); }
    /** Unsafe version of {@link #copyParams(CUDA_MEMCPY3D) copyParams}. */
    public static void ncopyParams(long struct, CUDA_MEMCPY3D value) { memCopy(value.address(), struct + CUDA_MEMCPY_NODE_PARAMS.COPYPARAMS, CUDA_MEMCPY3D.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_MEMCPY_NODE_PARAMS.COPYCTX));
    }

    // -----------------------------------

    /** An array of {@link CUDA_MEMCPY_NODE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_MEMCPY_NODE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_MEMCPY_NODE_PARAMS ELEMENT_FACTORY = CUDA_MEMCPY_NODE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_MEMCPY_NODE_PARAMS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_MEMCPY_NODE_PARAMS#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_MEMCPY_NODE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        public int flags() { return CUDA_MEMCPY_NODE_PARAMS.nflags(address()); }
        /** @return the value of the {@code reserved} field. */
        public int reserved() { return CUDA_MEMCPY_NODE_PARAMS.nreserved(address()); }
        /** @return the value of the {@code copyCtx} field. */
        @NativeType("CUcontext")
        public long copyCtx() { return CUDA_MEMCPY_NODE_PARAMS.ncopyCtx(address()); }
        /** @return a {@link CUDA_MEMCPY3D} view of the {@code copyParams} field. */
        public CUDA_MEMCPY3D copyParams() { return CUDA_MEMCPY_NODE_PARAMS.ncopyParams(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public CUDA_MEMCPY_NODE_PARAMS.Buffer flags(int value) { CUDA_MEMCPY_NODE_PARAMS.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public CUDA_MEMCPY_NODE_PARAMS.Buffer reserved(int value) { CUDA_MEMCPY_NODE_PARAMS.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code copyCtx} field. */
        public CUDA_MEMCPY_NODE_PARAMS.Buffer copyCtx(@NativeType("CUcontext") long value) { CUDA_MEMCPY_NODE_PARAMS.ncopyCtx(address(), value); return this; }
        /** Copies the specified {@link CUDA_MEMCPY3D} to the {@code copyParams} field. */
        public CUDA_MEMCPY_NODE_PARAMS.Buffer copyParams(CUDA_MEMCPY3D value) { CUDA_MEMCPY_NODE_PARAMS.ncopyParams(address(), value); return this; }
        /** Passes the {@code copyParams} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUDA_MEMCPY_NODE_PARAMS.Buffer copyParams(java.util.function.Consumer<CUDA_MEMCPY3D> consumer) { consumer.accept(copyParams()); return this; }

    }

}
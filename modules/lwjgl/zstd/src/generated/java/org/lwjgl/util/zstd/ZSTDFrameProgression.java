/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

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
 * struct ZSTD_frameProgression {
 *     unsigned long long {@link #ingested};
 *     unsigned long long {@link #consumed};
 *     unsigned long long {@link #produced};
 *     unsigned long long {@link #flushed};
 *     unsigned int {@link #currentJobID};
 *     unsigned int {@link #nbActiveWorkers};
 * }</code></pre>
 */
@NativeType("struct ZSTD_frameProgression")
public class ZSTDFrameProgression extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INGESTED,
        CONSUMED,
        PRODUCED,
        FLUSHED,
        CURRENTJOBID,
        NBACTIVEWORKERS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INGESTED = layout.offsetof(0);
        CONSUMED = layout.offsetof(1);
        PRODUCED = layout.offsetof(2);
        FLUSHED = layout.offsetof(3);
        CURRENTJOBID = layout.offsetof(4);
        NBACTIVEWORKERS = layout.offsetof(5);
    }

    /**
     * Creates a {@code ZSTDFrameProgression} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDFrameProgression(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** nb input bytes read and buffered */
    @NativeType("unsigned long long")
    public long ingested() { return ningested(address()); }
    /** nb input bytes actually compressed */
    @NativeType("unsigned long long")
    public long consumed() { return nconsumed(address()); }
    /** nb of compressed bytes generated and buffered */
    @NativeType("unsigned long long")
    public long produced() { return nproduced(address()); }
    /** nb of compressed bytes flushed: not provided; can be tracked from caller side */
    @NativeType("unsigned long long")
    public long flushed() { return nflushed(address()); }
    /** mT only: latest started job nb */
    @NativeType("unsigned int")
    public int currentJobID() { return ncurrentJobID(address()); }
    /** mT only: nb of workers actively compressing at probe time */
    @NativeType("unsigned int")
    public int nbActiveWorkers() { return nnbActiveWorkers(address()); }

    // -----------------------------------

    /** Returns a new {@code ZSTDFrameProgression} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDFrameProgression malloc() {
        return wrap(ZSTDFrameProgression.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZSTDFrameProgression} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDFrameProgression calloc() {
        return wrap(ZSTDFrameProgression.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZSTDFrameProgression} instance allocated with {@link BufferUtils}. */
    public static ZSTDFrameProgression create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZSTDFrameProgression.class, memAddress(container), container);
    }

    /** Returns a new {@code ZSTDFrameProgression} instance for the specified memory address. */
    public static ZSTDFrameProgression create(long address) {
        return wrap(ZSTDFrameProgression.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDFrameProgression createSafe(long address) {
        return address == NULL ? null : wrap(ZSTDFrameProgression.class, address);
    }

    /**
     * Returns a new {@link ZSTDFrameProgression.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameProgression.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameProgression.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameProgression.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameProgression.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameProgression.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZSTDFrameProgression.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameProgression.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDFrameProgression.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameProgression mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameProgression callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameProgression mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameProgression callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameProgression.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameProgression.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameProgression.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameProgression.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ZSTDFrameProgression} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameProgression malloc(MemoryStack stack) {
        return wrap(ZSTDFrameProgression.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZSTDFrameProgression} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameProgression calloc(MemoryStack stack) {
        return wrap(ZSTDFrameProgression.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDFrameProgression.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameProgression.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameProgression.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameProgression.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ingested}. */
    public static long ningested(long struct) { return UNSAFE.getLong(null, struct + ZSTDFrameProgression.INGESTED); }
    /** Unsafe version of {@link #consumed}. */
    public static long nconsumed(long struct) { return UNSAFE.getLong(null, struct + ZSTDFrameProgression.CONSUMED); }
    /** Unsafe version of {@link #produced}. */
    public static long nproduced(long struct) { return UNSAFE.getLong(null, struct + ZSTDFrameProgression.PRODUCED); }
    /** Unsafe version of {@link #flushed}. */
    public static long nflushed(long struct) { return UNSAFE.getLong(null, struct + ZSTDFrameProgression.FLUSHED); }
    /** Unsafe version of {@link #currentJobID}. */
    public static int ncurrentJobID(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameProgression.CURRENTJOBID); }
    /** Unsafe version of {@link #nbActiveWorkers}. */
    public static int nnbActiveWorkers(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameProgression.NBACTIVEWORKERS); }

    // -----------------------------------

    /** An array of {@link ZSTDFrameProgression} structs. */
    public static class Buffer extends StructBuffer<ZSTDFrameProgression, Buffer> implements NativeResource {

        private static final ZSTDFrameProgression ELEMENT_FACTORY = ZSTDFrameProgression.create(-1L);

        /**
         * Creates a new {@code ZSTDFrameProgression.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDFrameProgression#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDFrameProgression getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ZSTDFrameProgression#ingested} field. */
        @NativeType("unsigned long long")
        public long ingested() { return ZSTDFrameProgression.ningested(address()); }
        /** @return the value of the {@link ZSTDFrameProgression#consumed} field. */
        @NativeType("unsigned long long")
        public long consumed() { return ZSTDFrameProgression.nconsumed(address()); }
        /** @return the value of the {@link ZSTDFrameProgression#produced} field. */
        @NativeType("unsigned long long")
        public long produced() { return ZSTDFrameProgression.nproduced(address()); }
        /** @return the value of the {@link ZSTDFrameProgression#flushed} field. */
        @NativeType("unsigned long long")
        public long flushed() { return ZSTDFrameProgression.nflushed(address()); }
        /** @return the value of the {@link ZSTDFrameProgression#currentJobID} field. */
        @NativeType("unsigned int")
        public int currentJobID() { return ZSTDFrameProgression.ncurrentJobID(address()); }
        /** @return the value of the {@link ZSTDFrameProgression#nbActiveWorkers} field. */
        @NativeType("unsigned int")
        public int nbActiveWorkers() { return ZSTDFrameProgression.nnbActiveWorkers(address()); }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct ExrDecoderCreateInfo {
 *     {@link ExrDataSource ExrDataSource} source;
 *     ExrMemoryPool scratch_pool;
 *     uint32_t flags;
 * }</code></pre>
 */
public class ExrDecoderCreateInfo extends Struct<ExrDecoderCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SOURCE,
        SCRATCH_POOL,
        FLAGS;

    static {
        ExrDataSource.createSafe(NULL);

        Layout layout = __struct(
            __member(ExrDataSource.SIZEOF, ExrDataSource.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SOURCE = layout.offsetof(0);
        SCRATCH_POOL = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected ExrDecoderCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrDecoderCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrDecoderCreateInfo(address, container);
    }

    /**
     * Creates a {@code ExrDecoderCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrDecoderCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ExrDataSource} view of the {@code source} field. */
    public ExrDataSource source() { return nsource(address()); }
    /** @return the value of the {@code scratch_pool} field. */
    @NativeType("ExrMemoryPool")
    public long scratch_pool() { return nscratch_pool(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }

    /** Copies the specified {@link ExrDataSource} to the {@code source} field. */
    public ExrDecoderCreateInfo source(ExrDataSource value) { nsource(address(), value); return this; }
    /** Passes the {@code source} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrDecoderCreateInfo source(java.util.function.Consumer<ExrDataSource> consumer) { consumer.accept(source()); return this; }
    /** Sets the specified value to the {@code scratch_pool} field. */
    public ExrDecoderCreateInfo scratch_pool(@NativeType("ExrMemoryPool") long value) { nscratch_pool(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrDecoderCreateInfo flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrDecoderCreateInfo set(
        ExrDataSource source,
        long scratch_pool,
        int flags
    ) {
        source(source);
        scratch_pool(scratch_pool);
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
    public ExrDecoderCreateInfo set(ExrDecoderCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrDecoderCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrDecoderCreateInfo malloc() {
        return new ExrDecoderCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrDecoderCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrDecoderCreateInfo calloc() {
        return new ExrDecoderCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrDecoderCreateInfo} instance allocated with {@link BufferUtils}. */
    public static ExrDecoderCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrDecoderCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrDecoderCreateInfo} instance for the specified memory address. */
    public static ExrDecoderCreateInfo create(long address) {
        return new ExrDecoderCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrDecoderCreateInfo createSafe(long address) {
        return address == NULL ? null : new ExrDecoderCreateInfo(address, null);
    }

    /**
     * Returns a new {@link ExrDecoderCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDecoderCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrDecoderCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDecoderCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDecoderCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDecoderCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrDecoderCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrDecoderCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrDecoderCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrDecoderCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDecoderCreateInfo malloc(MemoryStack stack) {
        return new ExrDecoderCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrDecoderCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDecoderCreateInfo calloc(MemoryStack stack) {
        return new ExrDecoderCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrDecoderCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDecoderCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDecoderCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDecoderCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #source}. */
    public static ExrDataSource nsource(long struct) { return ExrDataSource.create(struct + ExrDecoderCreateInfo.SOURCE); }
    /** Unsafe version of {@link #scratch_pool}. */
    public static long nscratch_pool(long struct) { return memGetAddress(struct + ExrDecoderCreateInfo.SCRATCH_POOL); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrDecoderCreateInfo.FLAGS); }

    /** Unsafe version of {@link #source(ExrDataSource) source}. */
    public static void nsource(long struct, ExrDataSource value) { memCopy(value.address(), struct + ExrDecoderCreateInfo.SOURCE, ExrDataSource.SIZEOF); }
    /** Unsafe version of {@link #scratch_pool(long) scratch_pool}. */
    public static void nscratch_pool(long struct, long value) { memPutAddress(struct + ExrDecoderCreateInfo.SCRATCH_POOL, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrDecoderCreateInfo.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        ExrDataSource.validate(struct + ExrDecoderCreateInfo.SOURCE);
    }

    // -----------------------------------

    /** An array of {@link ExrDecoderCreateInfo} structs. */
    public static class Buffer extends StructBuffer<ExrDecoderCreateInfo, Buffer> implements NativeResource {

        private static final ExrDecoderCreateInfo ELEMENT_FACTORY = ExrDecoderCreateInfo.create(-1L);

        /**
         * Creates a new {@code ExrDecoderCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrDecoderCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrDecoderCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ExrDataSource} view of the {@code source} field. */
        public ExrDataSource source() { return ExrDecoderCreateInfo.nsource(address()); }
        /** @return the value of the {@code scratch_pool} field. */
        @NativeType("ExrMemoryPool")
        public long scratch_pool() { return ExrDecoderCreateInfo.nscratch_pool(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrDecoderCreateInfo.nflags(address()); }

        /** Copies the specified {@link ExrDataSource} to the {@code source} field. */
        public ExrDecoderCreateInfo.Buffer source(ExrDataSource value) { ExrDecoderCreateInfo.nsource(address(), value); return this; }
        /** Passes the {@code source} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrDecoderCreateInfo.Buffer source(java.util.function.Consumer<ExrDataSource> consumer) { consumer.accept(source()); return this; }
        /** Sets the specified value to the {@code scratch_pool} field. */
        public ExrDecoderCreateInfo.Buffer scratch_pool(@NativeType("ExrMemoryPool") long value) { ExrDecoderCreateInfo.nscratch_pool(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrDecoderCreateInfo.Buffer flags(@NativeType("uint32_t") int value) { ExrDecoderCreateInfo.nflags(address(), value); return this; }

    }

}
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
 * struct ExrEncoderCreateInfo {
 *     {@link ExrDataSink ExrDataSink} sink;
 *     ExrMemoryPool scratch_pool;
 *     uint32_t flags;
 * }</code></pre>
 */
public class ExrEncoderCreateInfo extends Struct<ExrEncoderCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SINK,
        SCRATCH_POOL,
        FLAGS;

    static {
        ExrDataSink.createSafe(NULL);

        Layout layout = __struct(
            __member(ExrDataSink.SIZEOF, ExrDataSink.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SINK = layout.offsetof(0);
        SCRATCH_POOL = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected ExrEncoderCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrEncoderCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrEncoderCreateInfo(address, container);
    }

    /**
     * Creates a {@code ExrEncoderCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrEncoderCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ExrDataSink} view of the {@code sink} field. */
    public ExrDataSink sink() { return nsink(address()); }
    /** @return the value of the {@code scratch_pool} field. */
    @NativeType("ExrMemoryPool")
    public long scratch_pool() { return nscratch_pool(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }

    /** Copies the specified {@link ExrDataSink} to the {@code sink} field. */
    public ExrEncoderCreateInfo sink(ExrDataSink value) { nsink(address(), value); return this; }
    /** Passes the {@code sink} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrEncoderCreateInfo sink(java.util.function.Consumer<ExrDataSink> consumer) { consumer.accept(sink()); return this; }
    /** Sets the specified value to the {@code scratch_pool} field. */
    public ExrEncoderCreateInfo scratch_pool(@NativeType("ExrMemoryPool") long value) { nscratch_pool(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrEncoderCreateInfo flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrEncoderCreateInfo set(
        ExrDataSink sink,
        long scratch_pool,
        int flags
    ) {
        sink(sink);
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
    public ExrEncoderCreateInfo set(ExrEncoderCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrEncoderCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrEncoderCreateInfo malloc() {
        return new ExrEncoderCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrEncoderCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrEncoderCreateInfo calloc() {
        return new ExrEncoderCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrEncoderCreateInfo} instance allocated with {@link BufferUtils}. */
    public static ExrEncoderCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrEncoderCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrEncoderCreateInfo} instance for the specified memory address. */
    public static ExrEncoderCreateInfo create(long address) {
        return new ExrEncoderCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrEncoderCreateInfo createSafe(long address) {
        return address == NULL ? null : new ExrEncoderCreateInfo(address, null);
    }

    /**
     * Returns a new {@link ExrEncoderCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrEncoderCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrEncoderCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrEncoderCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrEncoderCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrEncoderCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrEncoderCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrEncoderCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrEncoderCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrEncoderCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrEncoderCreateInfo malloc(MemoryStack stack) {
        return new ExrEncoderCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrEncoderCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrEncoderCreateInfo calloc(MemoryStack stack) {
        return new ExrEncoderCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrEncoderCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrEncoderCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrEncoderCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrEncoderCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sink}. */
    public static ExrDataSink nsink(long struct) { return ExrDataSink.create(struct + ExrEncoderCreateInfo.SINK); }
    /** Unsafe version of {@link #scratch_pool}. */
    public static long nscratch_pool(long struct) { return memGetAddress(struct + ExrEncoderCreateInfo.SCRATCH_POOL); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrEncoderCreateInfo.FLAGS); }

    /** Unsafe version of {@link #sink(ExrDataSink) sink}. */
    public static void nsink(long struct, ExrDataSink value) { memCopy(value.address(), struct + ExrEncoderCreateInfo.SINK, ExrDataSink.SIZEOF); }
    /** Unsafe version of {@link #scratch_pool(long) scratch_pool}. */
    public static void nscratch_pool(long struct, long value) { memPutAddress(struct + ExrEncoderCreateInfo.SCRATCH_POOL, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrEncoderCreateInfo.FLAGS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        ExrDataSink.validate(struct + ExrEncoderCreateInfo.SINK);
    }

    // -----------------------------------

    /** An array of {@link ExrEncoderCreateInfo} structs. */
    public static class Buffer extends StructBuffer<ExrEncoderCreateInfo, Buffer> implements NativeResource {

        private static final ExrEncoderCreateInfo ELEMENT_FACTORY = ExrEncoderCreateInfo.create(-1L);

        /**
         * Creates a new {@code ExrEncoderCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrEncoderCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrEncoderCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ExrDataSink} view of the {@code sink} field. */
        public ExrDataSink sink() { return ExrEncoderCreateInfo.nsink(address()); }
        /** @return the value of the {@code scratch_pool} field. */
        @NativeType("ExrMemoryPool")
        public long scratch_pool() { return ExrEncoderCreateInfo.nscratch_pool(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrEncoderCreateInfo.nflags(address()); }

        /** Copies the specified {@link ExrDataSink} to the {@code sink} field. */
        public ExrEncoderCreateInfo.Buffer sink(ExrDataSink value) { ExrEncoderCreateInfo.nsink(address(), value); return this; }
        /** Passes the {@code sink} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrEncoderCreateInfo.Buffer sink(java.util.function.Consumer<ExrDataSink> consumer) { consumer.accept(sink()); return this; }
        /** Sets the specified value to the {@code scratch_pool} field. */
        public ExrEncoderCreateInfo.Buffer scratch_pool(@NativeType("ExrMemoryPool") long value) { ExrEncoderCreateInfo.nscratch_pool(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrEncoderCreateInfo.Buffer flags(@NativeType("uint32_t") int value) { ExrEncoderCreateInfo.nflags(address(), value); return this; }

    }

}
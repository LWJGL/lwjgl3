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
 * <pre>{@code
 * struct ExrMemoryPoolCreateInfo {
 *     size_t initial_size;
 *     size_t max_size;
 *     uint32_t flags;
 * }}</pre>
 */
public class ExrMemoryPoolCreateInfo extends Struct<ExrMemoryPoolCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INITIAL_SIZE,
        MAX_SIZE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INITIAL_SIZE = layout.offsetof(0);
        MAX_SIZE = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected ExrMemoryPoolCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrMemoryPoolCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrMemoryPoolCreateInfo(address, container);
    }

    /**
     * Creates a {@code ExrMemoryPoolCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrMemoryPoolCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code initial_size} field. */
    @NativeType("size_t")
    public long initial_size() { return ninitial_size(address()); }
    /** @return the value of the {@code max_size} field. */
    @NativeType("size_t")
    public long max_size() { return nmax_size(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@code initial_size} field. */
    public ExrMemoryPoolCreateInfo initial_size(@NativeType("size_t") long value) { ninitial_size(address(), value); return this; }
    /** Sets the specified value to the {@code max_size} field. */
    public ExrMemoryPoolCreateInfo max_size(@NativeType("size_t") long value) { nmax_size(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrMemoryPoolCreateInfo flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrMemoryPoolCreateInfo set(
        long initial_size,
        long max_size,
        int flags
    ) {
        initial_size(initial_size);
        max_size(max_size);
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
    public ExrMemoryPoolCreateInfo set(ExrMemoryPoolCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrMemoryPoolCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrMemoryPoolCreateInfo malloc() {
        return new ExrMemoryPoolCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrMemoryPoolCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrMemoryPoolCreateInfo calloc() {
        return new ExrMemoryPoolCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrMemoryPoolCreateInfo} instance allocated with {@link BufferUtils}. */
    public static ExrMemoryPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrMemoryPoolCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrMemoryPoolCreateInfo} instance for the specified memory address. */
    public static ExrMemoryPoolCreateInfo create(long address) {
        return new ExrMemoryPoolCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrMemoryPoolCreateInfo createSafe(long address) {
        return address == NULL ? null : new ExrMemoryPoolCreateInfo(address, null);
    }

    /**
     * Returns a new {@link ExrMemoryPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrMemoryPoolCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrMemoryPoolCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrMemoryPoolCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrMemoryPoolCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrMemoryPoolCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrMemoryPoolCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrMemoryPoolCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrMemoryPoolCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrMemoryPoolCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrMemoryPoolCreateInfo malloc(MemoryStack stack) {
        return new ExrMemoryPoolCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrMemoryPoolCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrMemoryPoolCreateInfo calloc(MemoryStack stack) {
        return new ExrMemoryPoolCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrMemoryPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrMemoryPoolCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrMemoryPoolCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrMemoryPoolCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #initial_size}. */
    public static long ninitial_size(long struct) { return memGetAddress(struct + ExrMemoryPoolCreateInfo.INITIAL_SIZE); }
    /** Unsafe version of {@link #max_size}. */
    public static long nmax_size(long struct) { return memGetAddress(struct + ExrMemoryPoolCreateInfo.MAX_SIZE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrMemoryPoolCreateInfo.FLAGS); }

    /** Unsafe version of {@link #initial_size(long) initial_size}. */
    public static void ninitial_size(long struct, long value) { memPutAddress(struct + ExrMemoryPoolCreateInfo.INITIAL_SIZE, value); }
    /** Unsafe version of {@link #max_size(long) max_size}. */
    public static void nmax_size(long struct, long value) { memPutAddress(struct + ExrMemoryPoolCreateInfo.MAX_SIZE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrMemoryPoolCreateInfo.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link ExrMemoryPoolCreateInfo} structs. */
    public static class Buffer extends StructBuffer<ExrMemoryPoolCreateInfo, Buffer> implements NativeResource {

        private static final ExrMemoryPoolCreateInfo ELEMENT_FACTORY = ExrMemoryPoolCreateInfo.create(-1L);

        /**
         * Creates a new {@code ExrMemoryPoolCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrMemoryPoolCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrMemoryPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code initial_size} field. */
        @NativeType("size_t")
        public long initial_size() { return ExrMemoryPoolCreateInfo.ninitial_size(address()); }
        /** @return the value of the {@code max_size} field. */
        @NativeType("size_t")
        public long max_size() { return ExrMemoryPoolCreateInfo.nmax_size(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrMemoryPoolCreateInfo.nflags(address()); }

        /** Sets the specified value to the {@code initial_size} field. */
        public ExrMemoryPoolCreateInfo.Buffer initial_size(@NativeType("size_t") long value) { ExrMemoryPoolCreateInfo.ninitial_size(address(), value); return this; }
        /** Sets the specified value to the {@code max_size} field. */
        public ExrMemoryPoolCreateInfo.Buffer max_size(@NativeType("size_t") long value) { ExrMemoryPoolCreateInfo.nmax_size(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrMemoryPoolCreateInfo.Buffer flags(@NativeType("uint32_t") int value) { ExrMemoryPoolCreateInfo.nflags(address(), value); return this; }

    }

}
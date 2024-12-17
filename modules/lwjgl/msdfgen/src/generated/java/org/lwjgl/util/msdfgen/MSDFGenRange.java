/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct msdf_range {
 *     double lower;
 *     double upper;
 * }}</pre>
 */
@NativeType("struct msdf_range")
public class MSDFGenRange extends Struct<MSDFGenRange> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOWER,
        UPPER;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOWER = layout.offsetof(0);
        UPPER = layout.offsetof(1);
    }

    protected MSDFGenRange(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected MSDFGenRange create(long address, @Nullable ByteBuffer container) {
        return new MSDFGenRange(address, container);
    }

    /**
     * Creates a {@code MSDFGenRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MSDFGenRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code lower} field. */
    public double lower() { return nlower(address()); }
    /** @return the value of the {@code upper} field. */
    public double upper() { return nupper(address()); }

    /** Sets the specified value to the {@code lower} field. */
    public MSDFGenRange lower(double value) { nlower(address(), value); return this; }
    /** Sets the specified value to the {@code upper} field. */
    public MSDFGenRange upper(double value) { nupper(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MSDFGenRange set(
        double lower,
        double upper
    ) {
        lower(lower);
        upper(upper);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MSDFGenRange set(MSDFGenRange src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MSDFGenRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MSDFGenRange malloc() {
        return new MSDFGenRange(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MSDFGenRange calloc() {
        return new MSDFGenRange(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code MSDFGenRange} instance allocated with {@link BufferUtils}. */
    public static MSDFGenRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new MSDFGenRange(memAddress(container), container);
    }

    /** Returns a new {@code MSDFGenRange} instance for the specified memory address. */
    public static MSDFGenRange create(long address) {
        return new MSDFGenRange(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable MSDFGenRange createSafe(long address) {
        return address == NULL ? null : new MSDFGenRange(address, null);
    }

    /**
     * Returns a new {@link MSDFGenRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenRange.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MSDFGenRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenRange.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MSDFGenRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link MSDFGenRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MSDFGenRange.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static MSDFGenRange.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code MSDFGenRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenRange malloc(MemoryStack stack) {
        return new MSDFGenRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code MSDFGenRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MSDFGenRange calloc(MemoryStack stack) {
        return new MSDFGenRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link MSDFGenRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenRange.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MSDFGenRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MSDFGenRange.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #lower}. */
    public static double nlower(long struct) { return memGetDouble(struct + MSDFGenRange.LOWER); }
    /** Unsafe version of {@link #upper}. */
    public static double nupper(long struct) { return memGetDouble(struct + MSDFGenRange.UPPER); }

    /** Unsafe version of {@link #lower(double) lower}. */
    public static void nlower(long struct, double value) { memPutDouble(struct + MSDFGenRange.LOWER, value); }
    /** Unsafe version of {@link #upper(double) upper}. */
    public static void nupper(long struct, double value) { memPutDouble(struct + MSDFGenRange.UPPER, value); }

    // -----------------------------------

    /** An array of {@link MSDFGenRange} structs. */
    public static class Buffer extends StructBuffer<MSDFGenRange, Buffer> implements NativeResource {

        private static final MSDFGenRange ELEMENT_FACTORY = MSDFGenRange.create(-1L);

        /**
         * Creates a new {@code MSDFGenRange.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MSDFGenRange#SIZEOF}, and its mark will be undefined.</p>
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
        protected MSDFGenRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code lower} field. */
        public double lower() { return MSDFGenRange.nlower(address()); }
        /** @return the value of the {@code upper} field. */
        public double upper() { return MSDFGenRange.nupper(address()); }

        /** Sets the specified value to the {@code lower} field. */
        public MSDFGenRange.Buffer lower(double value) { MSDFGenRange.nlower(address(), value); return this; }
        /** Sets the specified value to the {@code upper} field. */
        public MSDFGenRange.Buffer upper(double value) { MSDFGenRange.nupper(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_offs {
 *     int32_t x;
 *     int32_t y;
 *     uint8_t unit_specifier;
 * }}</pre>
 */
@NativeType("struct spng_offs")
public class spng_offs extends Struct<spng_offs> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        UNIT_SPECIFIER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        UNIT_SPECIFIER = layout.offsetof(2);
    }

    protected spng_offs(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_offs create(long address, @Nullable ByteBuffer container) {
        return new spng_offs(address, container);
    }

    /**
     * Creates a {@code spng_offs} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_offs(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    @NativeType("int32_t")
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    @NativeType("int32_t")
    public int y() { return ny(address()); }
    /** @return the value of the {@code unit_specifier} field. */
    @NativeType("uint8_t")
    public byte unit_specifier() { return nunit_specifier(address()); }

    /** Sets the specified value to the {@code x} field. */
    public spng_offs x(@NativeType("int32_t") int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public spng_offs y(@NativeType("int32_t") int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code unit_specifier} field. */
    public spng_offs unit_specifier(@NativeType("uint8_t") byte value) { nunit_specifier(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_offs set(
        int x,
        int y,
        byte unit_specifier
    ) {
        x(x);
        y(y);
        unit_specifier(unit_specifier);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_offs set(spng_offs src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_offs} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_offs malloc() {
        return new spng_offs(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_offs} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_offs calloc() {
        return new spng_offs(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_offs} instance allocated with {@link BufferUtils}. */
    public static spng_offs create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_offs(memAddress(container), container);
    }

    /** Returns a new {@code spng_offs} instance for the specified memory address. */
    public static spng_offs create(long address) {
        return new spng_offs(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_offs createSafe(long address) {
        return address == NULL ? null : new spng_offs(address, null);
    }

    /**
     * Returns a new {@link spng_offs.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_offs.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_offs.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_offs.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_offs.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_offs.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_offs.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_offs.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_offs.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_offs} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_offs malloc(MemoryStack stack) {
        return new spng_offs(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_offs} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_offs calloc(MemoryStack stack) {
        return new spng_offs(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_offs.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_offs.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_offs.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_offs.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + spng_offs.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + spng_offs.Y); }
    /** Unsafe version of {@link #unit_specifier}. */
    public static byte nunit_specifier(long struct) { return memGetByte(struct + spng_offs.UNIT_SPECIFIER); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { memPutInt(struct + spng_offs.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { memPutInt(struct + spng_offs.Y, value); }
    /** Unsafe version of {@link #unit_specifier(byte) unit_specifier}. */
    public static void nunit_specifier(long struct, byte value) { memPutByte(struct + spng_offs.UNIT_SPECIFIER, value); }

    // -----------------------------------

    /** An array of {@link spng_offs} structs. */
    public static class Buffer extends StructBuffer<spng_offs, Buffer> implements NativeResource {

        private static final spng_offs ELEMENT_FACTORY = spng_offs.create(-1L);

        /**
         * Creates a new {@code spng_offs.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_offs#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_offs getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        @NativeType("int32_t")
        public int x() { return spng_offs.nx(address()); }
        /** @return the value of the {@code y} field. */
        @NativeType("int32_t")
        public int y() { return spng_offs.ny(address()); }
        /** @return the value of the {@code unit_specifier} field. */
        @NativeType("uint8_t")
        public byte unit_specifier() { return spng_offs.nunit_specifier(address()); }

        /** Sets the specified value to the {@code x} field. */
        public spng_offs.Buffer x(@NativeType("int32_t") int value) { spng_offs.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public spng_offs.Buffer y(@NativeType("int32_t") int value) { spng_offs.ny(address(), value); return this; }
        /** Sets the specified value to the {@code unit_specifier} field. */
        public spng_offs.Buffer unit_specifier(@NativeType("uint8_t") byte value) { spng_offs.nunit_specifier(address(), value); return this; }

    }

}
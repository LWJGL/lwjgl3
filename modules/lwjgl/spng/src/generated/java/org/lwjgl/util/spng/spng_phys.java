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
 * struct spng_phys {
 *     uint32_t ppu_x;
 *     uint32_t ppu_y;
 *     uint8_t unit_specifier;
 * }}</pre>
 */
@NativeType("struct spng_phys")
public class spng_phys extends Struct<spng_phys> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PPU_X,
        PPU_Y,
        UNIT_SPECIFIER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PPU_X = layout.offsetof(0);
        PPU_Y = layout.offsetof(1);
        UNIT_SPECIFIER = layout.offsetof(2);
    }

    protected spng_phys(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_phys create(long address, @Nullable ByteBuffer container) {
        return new spng_phys(address, container);
    }

    /**
     * Creates a {@code spng_phys} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_phys(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ppu_x} field. */
    @NativeType("uint32_t")
    public int ppu_x() { return nppu_x(address()); }
    /** @return the value of the {@code ppu_y} field. */
    @NativeType("uint32_t")
    public int ppu_y() { return nppu_y(address()); }
    /** @return the value of the {@code unit_specifier} field. */
    @NativeType("uint8_t")
    public byte unit_specifier() { return nunit_specifier(address()); }

    /** Sets the specified value to the {@code ppu_x} field. */
    public spng_phys ppu_x(@NativeType("uint32_t") int value) { nppu_x(address(), value); return this; }
    /** Sets the specified value to the {@code ppu_y} field. */
    public spng_phys ppu_y(@NativeType("uint32_t") int value) { nppu_y(address(), value); return this; }
    /** Sets the specified value to the {@code unit_specifier} field. */
    public spng_phys unit_specifier(@NativeType("uint8_t") byte value) { nunit_specifier(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_phys set(
        int ppu_x,
        int ppu_y,
        byte unit_specifier
    ) {
        ppu_x(ppu_x);
        ppu_y(ppu_y);
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
    public spng_phys set(spng_phys src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_phys} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_phys malloc() {
        return new spng_phys(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_phys} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_phys calloc() {
        return new spng_phys(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_phys} instance allocated with {@link BufferUtils}. */
    public static spng_phys create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_phys(memAddress(container), container);
    }

    /** Returns a new {@code spng_phys} instance for the specified memory address. */
    public static spng_phys create(long address) {
        return new spng_phys(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_phys createSafe(long address) {
        return address == NULL ? null : new spng_phys(address, null);
    }

    /**
     * Returns a new {@link spng_phys.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_phys.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_phys.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_phys.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_phys.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_phys.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_phys.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_phys.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_phys.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_phys} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_phys malloc(MemoryStack stack) {
        return new spng_phys(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_phys} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_phys calloc(MemoryStack stack) {
        return new spng_phys(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_phys.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_phys.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_phys.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_phys.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ppu_x}. */
    public static int nppu_x(long struct) { return memGetInt(struct + spng_phys.PPU_X); }
    /** Unsafe version of {@link #ppu_y}. */
    public static int nppu_y(long struct) { return memGetInt(struct + spng_phys.PPU_Y); }
    /** Unsafe version of {@link #unit_specifier}. */
    public static byte nunit_specifier(long struct) { return memGetByte(struct + spng_phys.UNIT_SPECIFIER); }

    /** Unsafe version of {@link #ppu_x(int) ppu_x}. */
    public static void nppu_x(long struct, int value) { memPutInt(struct + spng_phys.PPU_X, value); }
    /** Unsafe version of {@link #ppu_y(int) ppu_y}. */
    public static void nppu_y(long struct, int value) { memPutInt(struct + spng_phys.PPU_Y, value); }
    /** Unsafe version of {@link #unit_specifier(byte) unit_specifier}. */
    public static void nunit_specifier(long struct, byte value) { memPutByte(struct + spng_phys.UNIT_SPECIFIER, value); }

    // -----------------------------------

    /** An array of {@link spng_phys} structs. */
    public static class Buffer extends StructBuffer<spng_phys, Buffer> implements NativeResource {

        private static final spng_phys ELEMENT_FACTORY = spng_phys.create(-1L);

        /**
         * Creates a new {@code spng_phys.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_phys#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_phys getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ppu_x} field. */
        @NativeType("uint32_t")
        public int ppu_x() { return spng_phys.nppu_x(address()); }
        /** @return the value of the {@code ppu_y} field. */
        @NativeType("uint32_t")
        public int ppu_y() { return spng_phys.nppu_y(address()); }
        /** @return the value of the {@code unit_specifier} field. */
        @NativeType("uint8_t")
        public byte unit_specifier() { return spng_phys.nunit_specifier(address()); }

        /** Sets the specified value to the {@code ppu_x} field. */
        public spng_phys.Buffer ppu_x(@NativeType("uint32_t") int value) { spng_phys.nppu_x(address(), value); return this; }
        /** Sets the specified value to the {@code ppu_y} field. */
        public spng_phys.Buffer ppu_y(@NativeType("uint32_t") int value) { spng_phys.nppu_y(address(), value); return this; }
        /** Sets the specified value to the {@code unit_specifier} field. */
        public spng_phys.Buffer unit_specifier(@NativeType("uint8_t") byte value) { spng_phys.nunit_specifier(address(), value); return this; }

    }

}
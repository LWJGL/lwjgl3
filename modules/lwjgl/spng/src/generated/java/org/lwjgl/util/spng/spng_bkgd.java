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
 * struct spng_bkgd {
 *     uint16_t gray;
 *     uint16_t red;
 *     uint16_t green;
 *     uint16_t blue;
 *     uint16_t plte_index;
 * }}</pre>
 */
@NativeType("struct spng_bkgd")
public class spng_bkgd extends Struct<spng_bkgd> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GRAY,
        RED,
        GREEN,
        BLUE,
        PLTE_INDEX;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GRAY = layout.offsetof(0);
        RED = layout.offsetof(1);
        GREEN = layout.offsetof(2);
        BLUE = layout.offsetof(3);
        PLTE_INDEX = layout.offsetof(4);
    }

    protected spng_bkgd(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_bkgd create(long address, @Nullable ByteBuffer container) {
        return new spng_bkgd(address, container);
    }

    /**
     * Creates a {@code spng_bkgd} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_bkgd(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code gray} field. */
    @NativeType("uint16_t")
    public short gray() { return ngray(address()); }
    /** @return the value of the {@code red} field. */
    @NativeType("uint16_t")
    public short red() { return nred(address()); }
    /** @return the value of the {@code green} field. */
    @NativeType("uint16_t")
    public short green() { return ngreen(address()); }
    /** @return the value of the {@code blue} field. */
    @NativeType("uint16_t")
    public short blue() { return nblue(address()); }
    /** @return the value of the {@code plte_index} field. */
    @NativeType("uint16_t")
    public short plte_index() { return nplte_index(address()); }

    /** Sets the specified value to the {@code gray} field. */
    public spng_bkgd gray(@NativeType("uint16_t") short value) { ngray(address(), value); return this; }
    /** Sets the specified value to the {@code red} field. */
    public spng_bkgd red(@NativeType("uint16_t") short value) { nred(address(), value); return this; }
    /** Sets the specified value to the {@code green} field. */
    public spng_bkgd green(@NativeType("uint16_t") short value) { ngreen(address(), value); return this; }
    /** Sets the specified value to the {@code blue} field. */
    public spng_bkgd blue(@NativeType("uint16_t") short value) { nblue(address(), value); return this; }
    /** Sets the specified value to the {@code plte_index} field. */
    public spng_bkgd plte_index(@NativeType("uint16_t") short value) { nplte_index(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_bkgd set(
        short gray,
        short red,
        short green,
        short blue,
        short plte_index
    ) {
        gray(gray);
        red(red);
        green(green);
        blue(blue);
        plte_index(plte_index);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_bkgd set(spng_bkgd src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_bkgd} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_bkgd malloc() {
        return new spng_bkgd(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_bkgd} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_bkgd calloc() {
        return new spng_bkgd(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_bkgd} instance allocated with {@link BufferUtils}. */
    public static spng_bkgd create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_bkgd(memAddress(container), container);
    }

    /** Returns a new {@code spng_bkgd} instance for the specified memory address. */
    public static spng_bkgd create(long address) {
        return new spng_bkgd(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_bkgd createSafe(long address) {
        return address == NULL ? null : new spng_bkgd(address, null);
    }

    /**
     * Returns a new {@link spng_bkgd.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_bkgd.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_bkgd.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_bkgd.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_bkgd.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_bkgd.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_bkgd.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_bkgd.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_bkgd.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_bkgd} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_bkgd malloc(MemoryStack stack) {
        return new spng_bkgd(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_bkgd} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_bkgd calloc(MemoryStack stack) {
        return new spng_bkgd(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_bkgd.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_bkgd.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_bkgd.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_bkgd.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #gray}. */
    public static short ngray(long struct) { return memGetShort(struct + spng_bkgd.GRAY); }
    /** Unsafe version of {@link #red}. */
    public static short nred(long struct) { return memGetShort(struct + spng_bkgd.RED); }
    /** Unsafe version of {@link #green}. */
    public static short ngreen(long struct) { return memGetShort(struct + spng_bkgd.GREEN); }
    /** Unsafe version of {@link #blue}. */
    public static short nblue(long struct) { return memGetShort(struct + spng_bkgd.BLUE); }
    /** Unsafe version of {@link #plte_index}. */
    public static short nplte_index(long struct) { return memGetShort(struct + spng_bkgd.PLTE_INDEX); }

    /** Unsafe version of {@link #gray(short) gray}. */
    public static void ngray(long struct, short value) { memPutShort(struct + spng_bkgd.GRAY, value); }
    /** Unsafe version of {@link #red(short) red}. */
    public static void nred(long struct, short value) { memPutShort(struct + spng_bkgd.RED, value); }
    /** Unsafe version of {@link #green(short) green}. */
    public static void ngreen(long struct, short value) { memPutShort(struct + spng_bkgd.GREEN, value); }
    /** Unsafe version of {@link #blue(short) blue}. */
    public static void nblue(long struct, short value) { memPutShort(struct + spng_bkgd.BLUE, value); }
    /** Unsafe version of {@link #plte_index(short) plte_index}. */
    public static void nplte_index(long struct, short value) { memPutShort(struct + spng_bkgd.PLTE_INDEX, value); }

    // -----------------------------------

    /** An array of {@link spng_bkgd} structs. */
    public static class Buffer extends StructBuffer<spng_bkgd, Buffer> implements NativeResource {

        private static final spng_bkgd ELEMENT_FACTORY = spng_bkgd.create(-1L);

        /**
         * Creates a new {@code spng_bkgd.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_bkgd#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_bkgd getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code gray} field. */
        @NativeType("uint16_t")
        public short gray() { return spng_bkgd.ngray(address()); }
        /** @return the value of the {@code red} field. */
        @NativeType("uint16_t")
        public short red() { return spng_bkgd.nred(address()); }
        /** @return the value of the {@code green} field. */
        @NativeType("uint16_t")
        public short green() { return spng_bkgd.ngreen(address()); }
        /** @return the value of the {@code blue} field. */
        @NativeType("uint16_t")
        public short blue() { return spng_bkgd.nblue(address()); }
        /** @return the value of the {@code plte_index} field. */
        @NativeType("uint16_t")
        public short plte_index() { return spng_bkgd.nplte_index(address()); }

        /** Sets the specified value to the {@code gray} field. */
        public spng_bkgd.Buffer gray(@NativeType("uint16_t") short value) { spng_bkgd.ngray(address(), value); return this; }
        /** Sets the specified value to the {@code red} field. */
        public spng_bkgd.Buffer red(@NativeType("uint16_t") short value) { spng_bkgd.nred(address(), value); return this; }
        /** Sets the specified value to the {@code green} field. */
        public spng_bkgd.Buffer green(@NativeType("uint16_t") short value) { spng_bkgd.ngreen(address(), value); return this; }
        /** Sets the specified value to the {@code blue} field. */
        public spng_bkgd.Buffer blue(@NativeType("uint16_t") short value) { spng_bkgd.nblue(address(), value); return this; }
        /** Sets the specified value to the {@code plte_index} field. */
        public spng_bkgd.Buffer plte_index(@NativeType("uint16_t") short value) { spng_bkgd.nplte_index(address(), value); return this; }

    }

}
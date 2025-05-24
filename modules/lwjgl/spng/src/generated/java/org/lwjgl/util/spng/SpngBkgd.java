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
public class SpngBkgd extends Struct<SpngBkgd> implements NativeResource {

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

    protected SpngBkgd(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngBkgd create(long address, @Nullable ByteBuffer container) {
        return new SpngBkgd(address, container);
    }

    /**
     * Creates a {@code SpngBkgd} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngBkgd(ByteBuffer container) {
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
    public SpngBkgd gray(@NativeType("uint16_t") short value) { ngray(address(), value); return this; }
    /** Sets the specified value to the {@code red} field. */
    public SpngBkgd red(@NativeType("uint16_t") short value) { nred(address(), value); return this; }
    /** Sets the specified value to the {@code green} field. */
    public SpngBkgd green(@NativeType("uint16_t") short value) { ngreen(address(), value); return this; }
    /** Sets the specified value to the {@code blue} field. */
    public SpngBkgd blue(@NativeType("uint16_t") short value) { nblue(address(), value); return this; }
    /** Sets the specified value to the {@code plte_index} field. */
    public SpngBkgd plte_index(@NativeType("uint16_t") short value) { nplte_index(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngBkgd set(
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
    public SpngBkgd set(SpngBkgd src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngBkgd} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngBkgd malloc() {
        return new SpngBkgd(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngBkgd} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngBkgd calloc() {
        return new SpngBkgd(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngBkgd} instance allocated with {@link BufferUtils}. */
    public static SpngBkgd create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngBkgd(memAddress(container), container);
    }

    /** Returns a new {@code SpngBkgd} instance for the specified memory address. */
    public static SpngBkgd create(long address) {
        return new SpngBkgd(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngBkgd createSafe(long address) {
        return address == NULL ? null : new SpngBkgd(address, null);
    }

    /**
     * Returns a new {@link SpngBkgd.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngBkgd.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngBkgd.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngBkgd.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngBkgd.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngBkgd.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngBkgd.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngBkgd.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngBkgd.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngBkgd} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngBkgd malloc(MemoryStack stack) {
        return new SpngBkgd(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngBkgd} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngBkgd calloc(MemoryStack stack) {
        return new SpngBkgd(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngBkgd.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngBkgd.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngBkgd.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngBkgd.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #gray}. */
    public static short ngray(long struct) { return memGetShort(struct + SpngBkgd.GRAY); }
    /** Unsafe version of {@link #red}. */
    public static short nred(long struct) { return memGetShort(struct + SpngBkgd.RED); }
    /** Unsafe version of {@link #green}. */
    public static short ngreen(long struct) { return memGetShort(struct + SpngBkgd.GREEN); }
    /** Unsafe version of {@link #blue}. */
    public static short nblue(long struct) { return memGetShort(struct + SpngBkgd.BLUE); }
    /** Unsafe version of {@link #plte_index}. */
    public static short nplte_index(long struct) { return memGetShort(struct + SpngBkgd.PLTE_INDEX); }

    /** Unsafe version of {@link #gray(short) gray}. */
    public static void ngray(long struct, short value) { memPutShort(struct + SpngBkgd.GRAY, value); }
    /** Unsafe version of {@link #red(short) red}. */
    public static void nred(long struct, short value) { memPutShort(struct + SpngBkgd.RED, value); }
    /** Unsafe version of {@link #green(short) green}. */
    public static void ngreen(long struct, short value) { memPutShort(struct + SpngBkgd.GREEN, value); }
    /** Unsafe version of {@link #blue(short) blue}. */
    public static void nblue(long struct, short value) { memPutShort(struct + SpngBkgd.BLUE, value); }
    /** Unsafe version of {@link #plte_index(short) plte_index}. */
    public static void nplte_index(long struct, short value) { memPutShort(struct + SpngBkgd.PLTE_INDEX, value); }

    // -----------------------------------

    /** An array of {@link SpngBkgd} structs. */
    public static class Buffer extends StructBuffer<SpngBkgd, Buffer> implements NativeResource {

        private static final SpngBkgd ELEMENT_FACTORY = SpngBkgd.create(-1L);

        /**
         * Creates a new {@code SpngBkgd.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngBkgd#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngBkgd getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code gray} field. */
        @NativeType("uint16_t")
        public short gray() { return SpngBkgd.ngray(address()); }
        /** @return the value of the {@code red} field. */
        @NativeType("uint16_t")
        public short red() { return SpngBkgd.nred(address()); }
        /** @return the value of the {@code green} field. */
        @NativeType("uint16_t")
        public short green() { return SpngBkgd.ngreen(address()); }
        /** @return the value of the {@code blue} field. */
        @NativeType("uint16_t")
        public short blue() { return SpngBkgd.nblue(address()); }
        /** @return the value of the {@code plte_index} field. */
        @NativeType("uint16_t")
        public short plte_index() { return SpngBkgd.nplte_index(address()); }

        /** Sets the specified value to the {@code gray} field. */
        public SpngBkgd.Buffer gray(@NativeType("uint16_t") short value) { SpngBkgd.ngray(address(), value); return this; }
        /** Sets the specified value to the {@code red} field. */
        public SpngBkgd.Buffer red(@NativeType("uint16_t") short value) { SpngBkgd.nred(address(), value); return this; }
        /** Sets the specified value to the {@code green} field. */
        public SpngBkgd.Buffer green(@NativeType("uint16_t") short value) { SpngBkgd.ngreen(address(), value); return this; }
        /** Sets the specified value to the {@code blue} field. */
        public SpngBkgd.Buffer blue(@NativeType("uint16_t") short value) { SpngBkgd.nblue(address(), value); return this; }
        /** Sets the specified value to the {@code plte_index} field. */
        public SpngBkgd.Buffer plte_index(@NativeType("uint16_t") short value) { SpngBkgd.nplte_index(address(), value); return this; }

    }

}
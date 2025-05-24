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
 * struct spng_splt_entry {
 *     uint16_t red;
 *     uint16_t green;
 *     uint16_t blue;
 *     uint16_t alpha;
 *     uint16_t frequency;
 * }}</pre>
 */
@NativeType("struct spng_splt_entry")
public class SpngSpltEntry extends Struct<SpngSpltEntry> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RED,
        GREEN,
        BLUE,
        ALPHA,
        FREQUENCY;

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

        RED = layout.offsetof(0);
        GREEN = layout.offsetof(1);
        BLUE = layout.offsetof(2);
        ALPHA = layout.offsetof(3);
        FREQUENCY = layout.offsetof(4);
    }

    protected SpngSpltEntry(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngSpltEntry create(long address, @Nullable ByteBuffer container) {
        return new SpngSpltEntry(address, container);
    }

    /**
     * Creates a {@code SpngSpltEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngSpltEntry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code red} field. */
    @NativeType("uint16_t")
    public short red() { return nred(address()); }
    /** @return the value of the {@code green} field. */
    @NativeType("uint16_t")
    public short green() { return ngreen(address()); }
    /** @return the value of the {@code blue} field. */
    @NativeType("uint16_t")
    public short blue() { return nblue(address()); }
    /** @return the value of the {@code alpha} field. */
    @NativeType("uint16_t")
    public short alpha() { return nalpha(address()); }
    /** @return the value of the {@code frequency} field. */
    @NativeType("uint16_t")
    public short frequency() { return nfrequency(address()); }

    /** Sets the specified value to the {@code red} field. */
    public SpngSpltEntry red(@NativeType("uint16_t") short value) { nred(address(), value); return this; }
    /** Sets the specified value to the {@code green} field. */
    public SpngSpltEntry green(@NativeType("uint16_t") short value) { ngreen(address(), value); return this; }
    /** Sets the specified value to the {@code blue} field. */
    public SpngSpltEntry blue(@NativeType("uint16_t") short value) { nblue(address(), value); return this; }
    /** Sets the specified value to the {@code alpha} field. */
    public SpngSpltEntry alpha(@NativeType("uint16_t") short value) { nalpha(address(), value); return this; }
    /** Sets the specified value to the {@code frequency} field. */
    public SpngSpltEntry frequency(@NativeType("uint16_t") short value) { nfrequency(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngSpltEntry set(
        short red,
        short green,
        short blue,
        short alpha,
        short frequency
    ) {
        red(red);
        green(green);
        blue(blue);
        alpha(alpha);
        frequency(frequency);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpngSpltEntry set(SpngSpltEntry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngSpltEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngSpltEntry malloc() {
        return new SpngSpltEntry(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngSpltEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngSpltEntry calloc() {
        return new SpngSpltEntry(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngSpltEntry} instance allocated with {@link BufferUtils}. */
    public static SpngSpltEntry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngSpltEntry(memAddress(container), container);
    }

    /** Returns a new {@code SpngSpltEntry} instance for the specified memory address. */
    public static SpngSpltEntry create(long address) {
        return new SpngSpltEntry(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngSpltEntry createSafe(long address) {
        return address == NULL ? null : new SpngSpltEntry(address, null);
    }

    /**
     * Returns a new {@link SpngSpltEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngSpltEntry.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngSpltEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngSpltEntry.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngSpltEntry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngSpltEntry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngSpltEntry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngSpltEntry.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngSpltEntry.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngSpltEntry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngSpltEntry malloc(MemoryStack stack) {
        return new SpngSpltEntry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngSpltEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngSpltEntry calloc(MemoryStack stack) {
        return new SpngSpltEntry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngSpltEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngSpltEntry.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngSpltEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngSpltEntry.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #red}. */
    public static short nred(long struct) { return memGetShort(struct + SpngSpltEntry.RED); }
    /** Unsafe version of {@link #green}. */
    public static short ngreen(long struct) { return memGetShort(struct + SpngSpltEntry.GREEN); }
    /** Unsafe version of {@link #blue}. */
    public static short nblue(long struct) { return memGetShort(struct + SpngSpltEntry.BLUE); }
    /** Unsafe version of {@link #alpha}. */
    public static short nalpha(long struct) { return memGetShort(struct + SpngSpltEntry.ALPHA); }
    /** Unsafe version of {@link #frequency}. */
    public static short nfrequency(long struct) { return memGetShort(struct + SpngSpltEntry.FREQUENCY); }

    /** Unsafe version of {@link #red(short) red}. */
    public static void nred(long struct, short value) { memPutShort(struct + SpngSpltEntry.RED, value); }
    /** Unsafe version of {@link #green(short) green}. */
    public static void ngreen(long struct, short value) { memPutShort(struct + SpngSpltEntry.GREEN, value); }
    /** Unsafe version of {@link #blue(short) blue}. */
    public static void nblue(long struct, short value) { memPutShort(struct + SpngSpltEntry.BLUE, value); }
    /** Unsafe version of {@link #alpha(short) alpha}. */
    public static void nalpha(long struct, short value) { memPutShort(struct + SpngSpltEntry.ALPHA, value); }
    /** Unsafe version of {@link #frequency(short) frequency}. */
    public static void nfrequency(long struct, short value) { memPutShort(struct + SpngSpltEntry.FREQUENCY, value); }

    // -----------------------------------

    /** An array of {@link SpngSpltEntry} structs. */
    public static class Buffer extends StructBuffer<SpngSpltEntry, Buffer> implements NativeResource {

        private static final SpngSpltEntry ELEMENT_FACTORY = SpngSpltEntry.create(-1L);

        /**
         * Creates a new {@code SpngSpltEntry.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngSpltEntry#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngSpltEntry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code red} field. */
        @NativeType("uint16_t")
        public short red() { return SpngSpltEntry.nred(address()); }
        /** @return the value of the {@code green} field. */
        @NativeType("uint16_t")
        public short green() { return SpngSpltEntry.ngreen(address()); }
        /** @return the value of the {@code blue} field. */
        @NativeType("uint16_t")
        public short blue() { return SpngSpltEntry.nblue(address()); }
        /** @return the value of the {@code alpha} field. */
        @NativeType("uint16_t")
        public short alpha() { return SpngSpltEntry.nalpha(address()); }
        /** @return the value of the {@code frequency} field. */
        @NativeType("uint16_t")
        public short frequency() { return SpngSpltEntry.nfrequency(address()); }

        /** Sets the specified value to the {@code red} field. */
        public SpngSpltEntry.Buffer red(@NativeType("uint16_t") short value) { SpngSpltEntry.nred(address(), value); return this; }
        /** Sets the specified value to the {@code green} field. */
        public SpngSpltEntry.Buffer green(@NativeType("uint16_t") short value) { SpngSpltEntry.ngreen(address(), value); return this; }
        /** Sets the specified value to the {@code blue} field. */
        public SpngSpltEntry.Buffer blue(@NativeType("uint16_t") short value) { SpngSpltEntry.nblue(address(), value); return this; }
        /** Sets the specified value to the {@code alpha} field. */
        public SpngSpltEntry.Buffer alpha(@NativeType("uint16_t") short value) { SpngSpltEntry.nalpha(address(), value); return this; }
        /** Sets the specified value to the {@code frequency} field. */
        public SpngSpltEntry.Buffer frequency(@NativeType("uint16_t") short value) { SpngSpltEntry.nfrequency(address(), value); return this; }

    }

}
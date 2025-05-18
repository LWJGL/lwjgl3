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
public class spng_splt_entry extends Struct<spng_splt_entry> implements NativeResource {

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

    protected spng_splt_entry(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_splt_entry create(long address, @Nullable ByteBuffer container) {
        return new spng_splt_entry(address, container);
    }

    /**
     * Creates a {@code spng_splt_entry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_splt_entry(ByteBuffer container) {
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
    public spng_splt_entry red(@NativeType("uint16_t") short value) { nred(address(), value); return this; }
    /** Sets the specified value to the {@code green} field. */
    public spng_splt_entry green(@NativeType("uint16_t") short value) { ngreen(address(), value); return this; }
    /** Sets the specified value to the {@code blue} field. */
    public spng_splt_entry blue(@NativeType("uint16_t") short value) { nblue(address(), value); return this; }
    /** Sets the specified value to the {@code alpha} field. */
    public spng_splt_entry alpha(@NativeType("uint16_t") short value) { nalpha(address(), value); return this; }
    /** Sets the specified value to the {@code frequency} field. */
    public spng_splt_entry frequency(@NativeType("uint16_t") short value) { nfrequency(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_splt_entry set(
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
    public spng_splt_entry set(spng_splt_entry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_splt_entry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_splt_entry malloc() {
        return new spng_splt_entry(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_splt_entry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_splt_entry calloc() {
        return new spng_splt_entry(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_splt_entry} instance allocated with {@link BufferUtils}. */
    public static spng_splt_entry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_splt_entry(memAddress(container), container);
    }

    /** Returns a new {@code spng_splt_entry} instance for the specified memory address. */
    public static spng_splt_entry create(long address) {
        return new spng_splt_entry(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_splt_entry createSafe(long address) {
        return address == NULL ? null : new spng_splt_entry(address, null);
    }

    /**
     * Returns a new {@link spng_splt_entry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_splt_entry.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_splt_entry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_splt_entry.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_splt_entry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_splt_entry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_splt_entry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_splt_entry.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_splt_entry.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_splt_entry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_splt_entry malloc(MemoryStack stack) {
        return new spng_splt_entry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_splt_entry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_splt_entry calloc(MemoryStack stack) {
        return new spng_splt_entry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_splt_entry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_splt_entry.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_splt_entry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_splt_entry.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #red}. */
    public static short nred(long struct) { return memGetShort(struct + spng_splt_entry.RED); }
    /** Unsafe version of {@link #green}. */
    public static short ngreen(long struct) { return memGetShort(struct + spng_splt_entry.GREEN); }
    /** Unsafe version of {@link #blue}. */
    public static short nblue(long struct) { return memGetShort(struct + spng_splt_entry.BLUE); }
    /** Unsafe version of {@link #alpha}. */
    public static short nalpha(long struct) { return memGetShort(struct + spng_splt_entry.ALPHA); }
    /** Unsafe version of {@link #frequency}. */
    public static short nfrequency(long struct) { return memGetShort(struct + spng_splt_entry.FREQUENCY); }

    /** Unsafe version of {@link #red(short) red}. */
    public static void nred(long struct, short value) { memPutShort(struct + spng_splt_entry.RED, value); }
    /** Unsafe version of {@link #green(short) green}. */
    public static void ngreen(long struct, short value) { memPutShort(struct + spng_splt_entry.GREEN, value); }
    /** Unsafe version of {@link #blue(short) blue}. */
    public static void nblue(long struct, short value) { memPutShort(struct + spng_splt_entry.BLUE, value); }
    /** Unsafe version of {@link #alpha(short) alpha}. */
    public static void nalpha(long struct, short value) { memPutShort(struct + spng_splt_entry.ALPHA, value); }
    /** Unsafe version of {@link #frequency(short) frequency}. */
    public static void nfrequency(long struct, short value) { memPutShort(struct + spng_splt_entry.FREQUENCY, value); }

    // -----------------------------------

    /** An array of {@link spng_splt_entry} structs. */
    public static class Buffer extends StructBuffer<spng_splt_entry, Buffer> implements NativeResource {

        private static final spng_splt_entry ELEMENT_FACTORY = spng_splt_entry.create(-1L);

        /**
         * Creates a new {@code spng_splt_entry.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_splt_entry#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_splt_entry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code red} field. */
        @NativeType("uint16_t")
        public short red() { return spng_splt_entry.nred(address()); }
        /** @return the value of the {@code green} field. */
        @NativeType("uint16_t")
        public short green() { return spng_splt_entry.ngreen(address()); }
        /** @return the value of the {@code blue} field. */
        @NativeType("uint16_t")
        public short blue() { return spng_splt_entry.nblue(address()); }
        /** @return the value of the {@code alpha} field. */
        @NativeType("uint16_t")
        public short alpha() { return spng_splt_entry.nalpha(address()); }
        /** @return the value of the {@code frequency} field. */
        @NativeType("uint16_t")
        public short frequency() { return spng_splt_entry.nfrequency(address()); }

        /** Sets the specified value to the {@code red} field. */
        public spng_splt_entry.Buffer red(@NativeType("uint16_t") short value) { spng_splt_entry.nred(address(), value); return this; }
        /** Sets the specified value to the {@code green} field. */
        public spng_splt_entry.Buffer green(@NativeType("uint16_t") short value) { spng_splt_entry.ngreen(address(), value); return this; }
        /** Sets the specified value to the {@code blue} field. */
        public spng_splt_entry.Buffer blue(@NativeType("uint16_t") short value) { spng_splt_entry.nblue(address(), value); return this; }
        /** Sets the specified value to the {@code alpha} field. */
        public spng_splt_entry.Buffer alpha(@NativeType("uint16_t") short value) { spng_splt_entry.nalpha(address(), value); return this; }
        /** Sets the specified value to the {@code frequency} field. */
        public spng_splt_entry.Buffer frequency(@NativeType("uint16_t") short value) { spng_splt_entry.nfrequency(address(), value); return this; }

    }

}
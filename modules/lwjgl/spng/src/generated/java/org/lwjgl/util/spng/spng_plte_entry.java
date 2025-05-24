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
 * struct spng_plte_entry {
 *     uint8_t red;
 *     uint8_t green;
 *     uint8_t blue;
 *     uint8_t alpha;
 * }}</pre>
 */
@NativeType("struct spng_plte_entry")
public class spng_plte_entry extends Struct<spng_plte_entry> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RED,
        GREEN,
        BLUE,
        ALPHA;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RED = layout.offsetof(0);
        GREEN = layout.offsetof(1);
        BLUE = layout.offsetof(2);
        ALPHA = layout.offsetof(3);
    }

    protected spng_plte_entry(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_plte_entry create(long address, @Nullable ByteBuffer container) {
        return new spng_plte_entry(address, container);
    }

    /**
     * Creates a {@code spng_plte_entry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_plte_entry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code red} field. */
    @NativeType("uint8_t")
    public byte red() { return nred(address()); }
    /** @return the value of the {@code green} field. */
    @NativeType("uint8_t")
    public byte green() { return ngreen(address()); }
    /** @return the value of the {@code blue} field. */
    @NativeType("uint8_t")
    public byte blue() { return nblue(address()); }
    /** @return the value of the {@code alpha} field. */
    @NativeType("uint8_t")
    public byte alpha() { return nalpha(address()); }

    /** Sets the specified value to the {@code red} field. */
    public spng_plte_entry red(@NativeType("uint8_t") byte value) { nred(address(), value); return this; }
    /** Sets the specified value to the {@code green} field. */
    public spng_plte_entry green(@NativeType("uint8_t") byte value) { ngreen(address(), value); return this; }
    /** Sets the specified value to the {@code blue} field. */
    public spng_plte_entry blue(@NativeType("uint8_t") byte value) { nblue(address(), value); return this; }
    /** Sets the specified value to the {@code alpha} field. */
    public spng_plte_entry alpha(@NativeType("uint8_t") byte value) { nalpha(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_plte_entry set(
        byte red,
        byte green,
        byte blue,
        byte alpha
    ) {
        red(red);
        green(green);
        blue(blue);
        alpha(alpha);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_plte_entry set(spng_plte_entry src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_plte_entry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_plte_entry malloc() {
        return new spng_plte_entry(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_plte_entry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_plte_entry calloc() {
        return new spng_plte_entry(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_plte_entry} instance allocated with {@link BufferUtils}. */
    public static spng_plte_entry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_plte_entry(memAddress(container), container);
    }

    /** Returns a new {@code spng_plte_entry} instance for the specified memory address. */
    public static spng_plte_entry create(long address) {
        return new spng_plte_entry(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_plte_entry createSafe(long address) {
        return address == NULL ? null : new spng_plte_entry(address, null);
    }

    /**
     * Returns a new {@link spng_plte_entry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_plte_entry.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_plte_entry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_plte_entry.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_plte_entry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_plte_entry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_plte_entry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_plte_entry.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_plte_entry.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_plte_entry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_plte_entry malloc(MemoryStack stack) {
        return new spng_plte_entry(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_plte_entry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_plte_entry calloc(MemoryStack stack) {
        return new spng_plte_entry(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_plte_entry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_plte_entry.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_plte_entry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_plte_entry.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #red}. */
    public static byte nred(long struct) { return memGetByte(struct + spng_plte_entry.RED); }
    /** Unsafe version of {@link #green}. */
    public static byte ngreen(long struct) { return memGetByte(struct + spng_plte_entry.GREEN); }
    /** Unsafe version of {@link #blue}. */
    public static byte nblue(long struct) { return memGetByte(struct + spng_plte_entry.BLUE); }
    /** Unsafe version of {@link #alpha}. */
    public static byte nalpha(long struct) { return memGetByte(struct + spng_plte_entry.ALPHA); }

    /** Unsafe version of {@link #red(byte) red}. */
    public static void nred(long struct, byte value) { memPutByte(struct + spng_plte_entry.RED, value); }
    /** Unsafe version of {@link #green(byte) green}. */
    public static void ngreen(long struct, byte value) { memPutByte(struct + spng_plte_entry.GREEN, value); }
    /** Unsafe version of {@link #blue(byte) blue}. */
    public static void nblue(long struct, byte value) { memPutByte(struct + spng_plte_entry.BLUE, value); }
    /** Unsafe version of {@link #alpha(byte) alpha}. */
    public static void nalpha(long struct, byte value) { memPutByte(struct + spng_plte_entry.ALPHA, value); }

    // -----------------------------------

    /** An array of {@link spng_plte_entry} structs. */
    public static class Buffer extends StructBuffer<spng_plte_entry, Buffer> implements NativeResource {

        private static final spng_plte_entry ELEMENT_FACTORY = spng_plte_entry.create(-1L);

        /**
         * Creates a new {@code spng_plte_entry.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_plte_entry#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_plte_entry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code red} field. */
        @NativeType("uint8_t")
        public byte red() { return spng_plte_entry.nred(address()); }
        /** @return the value of the {@code green} field. */
        @NativeType("uint8_t")
        public byte green() { return spng_plte_entry.ngreen(address()); }
        /** @return the value of the {@code blue} field. */
        @NativeType("uint8_t")
        public byte blue() { return spng_plte_entry.nblue(address()); }
        /** @return the value of the {@code alpha} field. */
        @NativeType("uint8_t")
        public byte alpha() { return spng_plte_entry.nalpha(address()); }

        /** Sets the specified value to the {@code red} field. */
        public spng_plte_entry.Buffer red(@NativeType("uint8_t") byte value) { spng_plte_entry.nred(address(), value); return this; }
        /** Sets the specified value to the {@code green} field. */
        public spng_plte_entry.Buffer green(@NativeType("uint8_t") byte value) { spng_plte_entry.ngreen(address(), value); return this; }
        /** Sets the specified value to the {@code blue} field. */
        public spng_plte_entry.Buffer blue(@NativeType("uint8_t") byte value) { spng_plte_entry.nblue(address(), value); return this; }
        /** Sets the specified value to the {@code alpha} field. */
        public spng_plte_entry.Buffer alpha(@NativeType("uint8_t") byte value) { spng_plte_entry.nalpha(address(), value); return this; }

    }

}
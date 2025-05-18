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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_trns {
 *     uint16_t gray;
 *     uint16_t red;
 *     uint16_t green;
 *     uint16_t blue;
 *     uint32_t n_type3_entries;
 *     uint8_t type3_alpha[256];
 * }}</pre>
 */
@NativeType("struct spng_trns")
public class spng_trns extends Struct<spng_trns> implements NativeResource {

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
        N_TYPE3_ENTRIES,
        TYPE3_ALPHA;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(4),
            __array(1, 256)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GRAY = layout.offsetof(0);
        RED = layout.offsetof(1);
        GREEN = layout.offsetof(2);
        BLUE = layout.offsetof(3);
        N_TYPE3_ENTRIES = layout.offsetof(4);
        TYPE3_ALPHA = layout.offsetof(5);
    }

    protected spng_trns(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_trns create(long address, @Nullable ByteBuffer container) {
        return new spng_trns(address, container);
    }

    /**
     * Creates a {@code spng_trns} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_trns(ByteBuffer container) {
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
    /** @return the value of the {@code n_type3_entries} field. */
    @NativeType("uint32_t")
    public int n_type3_entries() { return nn_type3_entries(address()); }
    /** @return a {@link ByteBuffer} view of the {@code type3_alpha} field. */
    @NativeType("uint8_t[256]")
    public ByteBuffer type3_alpha() { return ntype3_alpha(address()); }
    /** @return the value at the specified index of the {@code type3_alpha} field. */
    @NativeType("uint8_t")
    public byte type3_alpha(int index) { return ntype3_alpha(address(), index); }

    /** Sets the specified value to the {@code gray} field. */
    public spng_trns gray(@NativeType("uint16_t") short value) { ngray(address(), value); return this; }
    /** Sets the specified value to the {@code red} field. */
    public spng_trns red(@NativeType("uint16_t") short value) { nred(address(), value); return this; }
    /** Sets the specified value to the {@code green} field. */
    public spng_trns green(@NativeType("uint16_t") short value) { ngreen(address(), value); return this; }
    /** Sets the specified value to the {@code blue} field. */
    public spng_trns blue(@NativeType("uint16_t") short value) { nblue(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code type3_alpha} field. */
    public spng_trns type3_alpha(@NativeType("uint8_t[256]") ByteBuffer value) { ntype3_alpha(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code type3_alpha} field. */
    public spng_trns type3_alpha(int index, @NativeType("uint8_t") byte value) { ntype3_alpha(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_trns set(
        short gray,
        short red,
        short green,
        short blue,
        ByteBuffer type3_alpha
    ) {
        gray(gray);
        red(red);
        green(green);
        blue(blue);
        type3_alpha(type3_alpha);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_trns set(spng_trns src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_trns} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_trns malloc() {
        return new spng_trns(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_trns} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_trns calloc() {
        return new spng_trns(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_trns} instance allocated with {@link BufferUtils}. */
    public static spng_trns create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_trns(memAddress(container), container);
    }

    /** Returns a new {@code spng_trns} instance for the specified memory address. */
    public static spng_trns create(long address) {
        return new spng_trns(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_trns createSafe(long address) {
        return address == NULL ? null : new spng_trns(address, null);
    }

    /**
     * Returns a new {@link spng_trns.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_trns.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_trns.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_trns.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_trns.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_trns.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_trns.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_trns.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_trns.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_trns} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_trns malloc(MemoryStack stack) {
        return new spng_trns(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_trns} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_trns calloc(MemoryStack stack) {
        return new spng_trns(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_trns.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_trns.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_trns.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_trns.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #gray}. */
    public static short ngray(long struct) { return memGetShort(struct + spng_trns.GRAY); }
    /** Unsafe version of {@link #red}. */
    public static short nred(long struct) { return memGetShort(struct + spng_trns.RED); }
    /** Unsafe version of {@link #green}. */
    public static short ngreen(long struct) { return memGetShort(struct + spng_trns.GREEN); }
    /** Unsafe version of {@link #blue}. */
    public static short nblue(long struct) { return memGetShort(struct + spng_trns.BLUE); }
    /** Unsafe version of {@link #n_type3_entries}. */
    public static int nn_type3_entries(long struct) { return memGetInt(struct + spng_trns.N_TYPE3_ENTRIES); }
    /** Unsafe version of {@link #type3_alpha}. */
    public static ByteBuffer ntype3_alpha(long struct) { return memByteBuffer(struct + spng_trns.TYPE3_ALPHA, nn_type3_entries(struct)); }
    /** Unsafe version of {@link #type3_alpha(int) type3_alpha}. */
    public static byte ntype3_alpha(long struct, int index) {
        return memGetByte(struct + spng_trns.TYPE3_ALPHA + check(index, 256) * 1);
    }

    /** Unsafe version of {@link #gray(short) gray}. */
    public static void ngray(long struct, short value) { memPutShort(struct + spng_trns.GRAY, value); }
    /** Unsafe version of {@link #red(short) red}. */
    public static void nred(long struct, short value) { memPutShort(struct + spng_trns.RED, value); }
    /** Unsafe version of {@link #green(short) green}. */
    public static void ngreen(long struct, short value) { memPutShort(struct + spng_trns.GREEN, value); }
    /** Unsafe version of {@link #blue(short) blue}. */
    public static void nblue(long struct, short value) { memPutShort(struct + spng_trns.BLUE, value); }
    /** Sets the specified value to the {@code n_type3_entries} field of the specified {@code struct}. */
    public static void nn_type3_entries(long struct, int value) { memPutInt(struct + spng_trns.N_TYPE3_ENTRIES, value); }
    /** Unsafe version of {@link #type3_alpha(ByteBuffer) type3_alpha}. */
    public static void ntype3_alpha(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 256); }
        memCopy(memAddress(value), struct + spng_trns.TYPE3_ALPHA, value.remaining() * 1);
        nn_type3_entries(struct, value.remaining());
    }
    /** Unsafe version of {@link #type3_alpha(int, byte) type3_alpha}. */
    public static void ntype3_alpha(long struct, int index, byte value) {
        memPutByte(struct + spng_trns.TYPE3_ALPHA + check(index, 256) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link spng_trns} structs. */
    public static class Buffer extends StructBuffer<spng_trns, Buffer> implements NativeResource {

        private static final spng_trns ELEMENT_FACTORY = spng_trns.create(-1L);

        /**
         * Creates a new {@code spng_trns.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_trns#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_trns getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code gray} field. */
        @NativeType("uint16_t")
        public short gray() { return spng_trns.ngray(address()); }
        /** @return the value of the {@code red} field. */
        @NativeType("uint16_t")
        public short red() { return spng_trns.nred(address()); }
        /** @return the value of the {@code green} field. */
        @NativeType("uint16_t")
        public short green() { return spng_trns.ngreen(address()); }
        /** @return the value of the {@code blue} field. */
        @NativeType("uint16_t")
        public short blue() { return spng_trns.nblue(address()); }
        /** @return the value of the {@code n_type3_entries} field. */
        @NativeType("uint32_t")
        public int n_type3_entries() { return spng_trns.nn_type3_entries(address()); }
        /** @return a {@link ByteBuffer} view of the {@code type3_alpha} field. */
        @NativeType("uint8_t[256]")
        public ByteBuffer type3_alpha() { return spng_trns.ntype3_alpha(address()); }
        /** @return the value at the specified index of the {@code type3_alpha} field. */
        @NativeType("uint8_t")
        public byte type3_alpha(int index) { return spng_trns.ntype3_alpha(address(), index); }

        /** Sets the specified value to the {@code gray} field. */
        public spng_trns.Buffer gray(@NativeType("uint16_t") short value) { spng_trns.ngray(address(), value); return this; }
        /** Sets the specified value to the {@code red} field. */
        public spng_trns.Buffer red(@NativeType("uint16_t") short value) { spng_trns.nred(address(), value); return this; }
        /** Sets the specified value to the {@code green} field. */
        public spng_trns.Buffer green(@NativeType("uint16_t") short value) { spng_trns.ngreen(address(), value); return this; }
        /** Sets the specified value to the {@code blue} field. */
        public spng_trns.Buffer blue(@NativeType("uint16_t") short value) { spng_trns.nblue(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code type3_alpha} field. */
        public spng_trns.Buffer type3_alpha(@NativeType("uint8_t[256]") ByteBuffer value) { spng_trns.ntype3_alpha(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code type3_alpha} field. */
        public spng_trns.Buffer type3_alpha(int index, @NativeType("uint8_t") byte value) { spng_trns.ntype3_alpha(address(), index, value); return this; }

    }

}
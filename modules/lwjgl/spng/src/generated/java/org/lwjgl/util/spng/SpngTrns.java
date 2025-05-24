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
public class SpngTrns extends Struct<SpngTrns> implements NativeResource {

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

    protected SpngTrns(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngTrns create(long address, @Nullable ByteBuffer container) {
        return new SpngTrns(address, container);
    }

    /**
     * Creates a {@code SpngTrns} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngTrns(ByteBuffer container) {
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
    public SpngTrns gray(@NativeType("uint16_t") short value) { ngray(address(), value); return this; }
    /** Sets the specified value to the {@code red} field. */
    public SpngTrns red(@NativeType("uint16_t") short value) { nred(address(), value); return this; }
    /** Sets the specified value to the {@code green} field. */
    public SpngTrns green(@NativeType("uint16_t") short value) { ngreen(address(), value); return this; }
    /** Sets the specified value to the {@code blue} field. */
    public SpngTrns blue(@NativeType("uint16_t") short value) { nblue(address(), value); return this; }
    /** Sets the specified value to the {@code n_type3_entries} field. */
    public SpngTrns n_type3_entries(@NativeType("uint32_t") int value) { nn_type3_entries(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code type3_alpha} field. */
    public SpngTrns type3_alpha(@NativeType("uint8_t[256]") ByteBuffer value) { ntype3_alpha(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code type3_alpha} field. */
    public SpngTrns type3_alpha(int index, @NativeType("uint8_t") byte value) { ntype3_alpha(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngTrns set(
        short gray,
        short red,
        short green,
        short blue,
        int n_type3_entries,
        ByteBuffer type3_alpha
    ) {
        gray(gray);
        red(red);
        green(green);
        blue(blue);
        n_type3_entries(n_type3_entries);
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
    public SpngTrns set(SpngTrns src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngTrns} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngTrns malloc() {
        return new SpngTrns(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngTrns} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngTrns calloc() {
        return new SpngTrns(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngTrns} instance allocated with {@link BufferUtils}. */
    public static SpngTrns create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngTrns(memAddress(container), container);
    }

    /** Returns a new {@code SpngTrns} instance for the specified memory address. */
    public static SpngTrns create(long address) {
        return new SpngTrns(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngTrns createSafe(long address) {
        return address == NULL ? null : new SpngTrns(address, null);
    }

    /**
     * Returns a new {@link SpngTrns.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngTrns.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngTrns.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngTrns.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngTrns.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngTrns.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngTrns.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngTrns.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngTrns.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngTrns} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngTrns malloc(MemoryStack stack) {
        return new SpngTrns(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngTrns} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngTrns calloc(MemoryStack stack) {
        return new SpngTrns(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngTrns.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngTrns.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngTrns.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngTrns.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #gray}. */
    public static short ngray(long struct) { return memGetShort(struct + SpngTrns.GRAY); }
    /** Unsafe version of {@link #red}. */
    public static short nred(long struct) { return memGetShort(struct + SpngTrns.RED); }
    /** Unsafe version of {@link #green}. */
    public static short ngreen(long struct) { return memGetShort(struct + SpngTrns.GREEN); }
    /** Unsafe version of {@link #blue}. */
    public static short nblue(long struct) { return memGetShort(struct + SpngTrns.BLUE); }
    /** Unsafe version of {@link #n_type3_entries}. */
    public static int nn_type3_entries(long struct) { return memGetInt(struct + SpngTrns.N_TYPE3_ENTRIES); }
    /** Unsafe version of {@link #type3_alpha}. */
    public static ByteBuffer ntype3_alpha(long struct) { return memByteBuffer(struct + SpngTrns.TYPE3_ALPHA, 256); }
    /** Unsafe version of {@link #type3_alpha(int) type3_alpha}. */
    public static byte ntype3_alpha(long struct, int index) {
        return memGetByte(struct + SpngTrns.TYPE3_ALPHA + check(index, 256) * 1);
    }

    /** Unsafe version of {@link #gray(short) gray}. */
    public static void ngray(long struct, short value) { memPutShort(struct + SpngTrns.GRAY, value); }
    /** Unsafe version of {@link #red(short) red}. */
    public static void nred(long struct, short value) { memPutShort(struct + SpngTrns.RED, value); }
    /** Unsafe version of {@link #green(short) green}. */
    public static void ngreen(long struct, short value) { memPutShort(struct + SpngTrns.GREEN, value); }
    /** Unsafe version of {@link #blue(short) blue}. */
    public static void nblue(long struct, short value) { memPutShort(struct + SpngTrns.BLUE, value); }
    /** Unsafe version of {@link #n_type3_entries(int) n_type3_entries}. */
    public static void nn_type3_entries(long struct, int value) { memPutInt(struct + SpngTrns.N_TYPE3_ENTRIES, value); }
    /** Unsafe version of {@link #type3_alpha(ByteBuffer) type3_alpha}. */
    public static void ntype3_alpha(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 256); }
        memCopy(memAddress(value), struct + SpngTrns.TYPE3_ALPHA, value.remaining() * 1);
    }
    /** Unsafe version of {@link #type3_alpha(int, byte) type3_alpha}. */
    public static void ntype3_alpha(long struct, int index, byte value) {
        memPutByte(struct + SpngTrns.TYPE3_ALPHA + check(index, 256) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link SpngTrns} structs. */
    public static class Buffer extends StructBuffer<SpngTrns, Buffer> implements NativeResource {

        private static final SpngTrns ELEMENT_FACTORY = SpngTrns.create(-1L);

        /**
         * Creates a new {@code SpngTrns.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngTrns#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngTrns getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code gray} field. */
        @NativeType("uint16_t")
        public short gray() { return SpngTrns.ngray(address()); }
        /** @return the value of the {@code red} field. */
        @NativeType("uint16_t")
        public short red() { return SpngTrns.nred(address()); }
        /** @return the value of the {@code green} field. */
        @NativeType("uint16_t")
        public short green() { return SpngTrns.ngreen(address()); }
        /** @return the value of the {@code blue} field. */
        @NativeType("uint16_t")
        public short blue() { return SpngTrns.nblue(address()); }
        /** @return the value of the {@code n_type3_entries} field. */
        @NativeType("uint32_t")
        public int n_type3_entries() { return SpngTrns.nn_type3_entries(address()); }
        /** @return a {@link ByteBuffer} view of the {@code type3_alpha} field. */
        @NativeType("uint8_t[256]")
        public ByteBuffer type3_alpha() { return SpngTrns.ntype3_alpha(address()); }
        /** @return the value at the specified index of the {@code type3_alpha} field. */
        @NativeType("uint8_t")
        public byte type3_alpha(int index) { return SpngTrns.ntype3_alpha(address(), index); }

        /** Sets the specified value to the {@code gray} field. */
        public SpngTrns.Buffer gray(@NativeType("uint16_t") short value) { SpngTrns.ngray(address(), value); return this; }
        /** Sets the specified value to the {@code red} field. */
        public SpngTrns.Buffer red(@NativeType("uint16_t") short value) { SpngTrns.nred(address(), value); return this; }
        /** Sets the specified value to the {@code green} field. */
        public SpngTrns.Buffer green(@NativeType("uint16_t") short value) { SpngTrns.ngreen(address(), value); return this; }
        /** Sets the specified value to the {@code blue} field. */
        public SpngTrns.Buffer blue(@NativeType("uint16_t") short value) { SpngTrns.nblue(address(), value); return this; }
        /** Sets the specified value to the {@code n_type3_entries} field. */
        public SpngTrns.Buffer n_type3_entries(@NativeType("uint32_t") int value) { SpngTrns.nn_type3_entries(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code type3_alpha} field. */
        public SpngTrns.Buffer type3_alpha(@NativeType("uint8_t[256]") ByteBuffer value) { SpngTrns.ntype3_alpha(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code type3_alpha} field. */
        public SpngTrns.Buffer type3_alpha(int index, @NativeType("uint8_t") byte value) { SpngTrns.ntype3_alpha(address(), index, value); return this; }

    }

}
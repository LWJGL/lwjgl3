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
 * struct spng_splt {
 *     char name[80];
 *     uint8_t sample_depth;
 *     uint32_t n_entries;
 *     {@link SpngSpltEntry spng_splt_entry} * entries;
 * }}</pre>
 */
@NativeType("struct spng_splt")
public class SpngSplt extends Struct<SpngSplt> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        SAMPLE_DEPTH,
        N_ENTRIES,
        ENTRIES;

    static {
        Layout layout = __struct(
            __array(1, 80),
            __member(1),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        SAMPLE_DEPTH = layout.offsetof(1);
        N_ENTRIES = layout.offsetof(2);
        ENTRIES = layout.offsetof(3);
    }

    protected SpngSplt(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngSplt create(long address, @Nullable ByteBuffer container) {
        return new SpngSplt(address, container);
    }

    /**
     * Creates a {@code SpngSplt} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngSplt(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[80]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the value at the specified index of the {@code name} field. */
    @NativeType("char")
    public byte name(int index) { return nname(address(), index); }
    /** @return the value of the {@code sample_depth} field. */
    @NativeType("uint8_t")
    public byte sample_depth() { return nsample_depth(address()); }
    /** @return the value of the {@code n_entries} field. */
    @NativeType("uint32_t")
    public int n_entries() { return nn_entries(address()); }
    /** @return a {@link SpngSpltEntry} view of the struct pointed to by the {@code entries} field. */
    @NativeType("spng_splt_entry *")
    public SpngSpltEntry entries() { return nentries(address()); }

    /** Copies the specified {@link ByteBuffer} to the {@code name} field. */
    public SpngSplt name(@NativeType("char[80]") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code name} field. */
    public SpngSplt name(int index, @NativeType("char") byte value) { nname(address(), index, value); return this; }
    /** Sets the specified value to the {@code sample_depth} field. */
    public SpngSplt sample_depth(@NativeType("uint8_t") byte value) { nsample_depth(address(), value); return this; }
    /** Sets the specified value to the {@code n_entries} field. */
    public SpngSplt n_entries(@NativeType("uint32_t") int value) { nn_entries(address(), value); return this; }
    /** Sets the address of the specified {@link SpngSpltEntry} to the {@code entries} field. */
    public SpngSplt entries(@NativeType("spng_splt_entry *") SpngSpltEntry value) { nentries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngSplt set(
        ByteBuffer name,
        byte sample_depth,
        int n_entries,
        SpngSpltEntry entries
    ) {
        name(name);
        sample_depth(sample_depth);
        n_entries(n_entries);
        entries(entries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpngSplt set(SpngSplt src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngSplt} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngSplt malloc() {
        return new SpngSplt(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngSplt} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngSplt calloc() {
        return new SpngSplt(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngSplt} instance allocated with {@link BufferUtils}. */
    public static SpngSplt create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngSplt(memAddress(container), container);
    }

    /** Returns a new {@code SpngSplt} instance for the specified memory address. */
    public static SpngSplt create(long address) {
        return new SpngSplt(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngSplt createSafe(long address) {
        return address == NULL ? null : new SpngSplt(address, null);
    }

    /**
     * Returns a new {@link SpngSplt.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngSplt.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngSplt.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngSplt.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngSplt.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngSplt.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngSplt.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngSplt.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngSplt.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngSplt} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngSplt malloc(MemoryStack stack) {
        return new SpngSplt(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngSplt} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngSplt calloc(MemoryStack stack) {
        return new SpngSplt(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngSplt.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngSplt.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngSplt.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngSplt.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + SpngSplt.NAME, 80); }
    /** Unsafe version of {@link #name(int) name}. */
    public static byte nname(long struct, int index) {
        return memGetByte(struct + SpngSplt.NAME + check(index, 80) * 1);
    }
    /** Unsafe version of {@link #sample_depth}. */
    public static byte nsample_depth(long struct) { return memGetByte(struct + SpngSplt.SAMPLE_DEPTH); }
    /** Unsafe version of {@link #n_entries}. */
    public static int nn_entries(long struct) { return memGetInt(struct + SpngSplt.N_ENTRIES); }
    /** Unsafe version of {@link #entries}. */
    public static SpngSpltEntry nentries(long struct) { return SpngSpltEntry.create(memGetAddress(struct + SpngSplt.ENTRIES)); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 80); }
        memCopy(memAddress(value), struct + SpngSplt.NAME, value.remaining() * 1);
    }
    /** Unsafe version of {@link #name(int, byte) name}. */
    public static void nname(long struct, int index, byte value) {
        memPutByte(struct + SpngSplt.NAME + check(index, 80) * 1, value);
    }
    /** Unsafe version of {@link #sample_depth(byte) sample_depth}. */
    public static void nsample_depth(long struct, byte value) { memPutByte(struct + SpngSplt.SAMPLE_DEPTH, value); }
    /** Unsafe version of {@link #n_entries(int) n_entries}. */
    public static void nn_entries(long struct, int value) { memPutInt(struct + SpngSplt.N_ENTRIES, value); }
    /** Unsafe version of {@link #entries(SpngSpltEntry) entries}. */
    public static void nentries(long struct, SpngSpltEntry value) { memPutAddress(struct + SpngSplt.ENTRIES, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpngSplt.ENTRIES));
    }

    // -----------------------------------

    /** An array of {@link SpngSplt} structs. */
    public static class Buffer extends StructBuffer<SpngSplt, Buffer> implements NativeResource {

        private static final SpngSplt ELEMENT_FACTORY = SpngSplt.create(-1L);

        /**
         * Creates a new {@code SpngSplt.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngSplt#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngSplt getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[80]")
        public ByteBuffer name() { return SpngSplt.nname(address()); }
        /** @return the value at the specified index of the {@code name} field. */
        @NativeType("char")
        public byte name(int index) { return SpngSplt.nname(address(), index); }
        /** @return the value of the {@code sample_depth} field. */
        @NativeType("uint8_t")
        public byte sample_depth() { return SpngSplt.nsample_depth(address()); }
        /** @return the value of the {@code n_entries} field. */
        @NativeType("uint32_t")
        public int n_entries() { return SpngSplt.nn_entries(address()); }
        /** @return a {@link SpngSpltEntry} view of the struct pointed to by the {@code entries} field. */
        @NativeType("spng_splt_entry *")
        public SpngSpltEntry entries() { return SpngSplt.nentries(address()); }

        /** Copies the specified {@link ByteBuffer} to the {@code name} field. */
        public SpngSplt.Buffer name(@NativeType("char[80]") ByteBuffer value) { SpngSplt.nname(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code name} field. */
        public SpngSplt.Buffer name(int index, @NativeType("char") byte value) { SpngSplt.nname(address(), index, value); return this; }
        /** Sets the specified value to the {@code sample_depth} field. */
        public SpngSplt.Buffer sample_depth(@NativeType("uint8_t") byte value) { SpngSplt.nsample_depth(address(), value); return this; }
        /** Sets the specified value to the {@code n_entries} field. */
        public SpngSplt.Buffer n_entries(@NativeType("uint32_t") int value) { SpngSplt.nn_entries(address(), value); return this; }
        /** Sets the address of the specified {@link SpngSpltEntry} to the {@code entries} field. */
        public SpngSplt.Buffer entries(@NativeType("spng_splt_entry *") SpngSpltEntry value) { SpngSplt.nentries(address(), value); return this; }

    }

}
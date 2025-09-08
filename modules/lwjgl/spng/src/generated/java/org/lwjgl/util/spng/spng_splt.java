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
 * <pre><code>
 * struct spng_splt {
 *     char name[80];
 *     uint8_t sample_depth;
 *     uint32_t n_entries;
 *     {@link spng_splt_entry struct spng_splt_entry} * entries;
 * }</code></pre>
 */
@NativeType("struct spng_splt")
public class spng_splt extends Struct<spng_splt> implements NativeResource {

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

    protected spng_splt(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_splt create(long address, @Nullable ByteBuffer container) {
        return new spng_splt(address, container);
    }

    /**
     * Creates a {@code spng_splt} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_splt(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[80]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[80]")
    public String nameString() { return nnameString(address()); }
    /** @return the value of the {@code sample_depth} field. */
    @NativeType("uint8_t")
    public byte sample_depth() { return nsample_depth(address()); }
    /** @return the value of the {@code n_entries} field. */
    @NativeType("uint32_t")
    public int n_entries() { return nn_entries(address()); }
    /** @return a {@link spng_splt_entry.Buffer} view of the struct array pointed to by the {@code entries} field. */
    @NativeType("struct spng_splt_entry *")
    public spng_splt_entry.Buffer entries() { return nentries(address()); }

    /** Copies the specified encoded string to the {@code name} field. */
    public spng_splt name(@NativeType("char[80]") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code sample_depth} field. */
    public spng_splt sample_depth(@NativeType("uint8_t") byte value) { nsample_depth(address(), value); return this; }
    /** Sets the address of the specified {@link spng_splt_entry.Buffer} to the {@code entries} field. */
    public spng_splt entries(@NativeType("struct spng_splt_entry *") spng_splt_entry.Buffer value) { nentries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_splt set(
        ByteBuffer name,
        byte sample_depth,
        spng_splt_entry.Buffer entries
    ) {
        name(name);
        sample_depth(sample_depth);
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
    public spng_splt set(spng_splt src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_splt} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_splt malloc() {
        return new spng_splt(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_splt} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_splt calloc() {
        return new spng_splt(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_splt} instance allocated with {@link BufferUtils}. */
    public static spng_splt create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_splt(memAddress(container), container);
    }

    /** Returns a new {@code spng_splt} instance for the specified memory address. */
    public static spng_splt create(long address) {
        return new spng_splt(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_splt createSafe(long address) {
        return address == NULL ? null : new spng_splt(address, null);
    }

    /**
     * Returns a new {@link spng_splt.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_splt.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_splt.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_splt.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_splt.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_splt.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_splt.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_splt.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_splt.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_splt} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_splt malloc(MemoryStack stack) {
        return new spng_splt(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_splt} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_splt calloc(MemoryStack stack) {
        return new spng_splt(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_splt.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_splt.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_splt.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_splt.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + spng_splt.NAME, 80); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + spng_splt.NAME); }
    /** Unsafe version of {@link #sample_depth}. */
    public static byte nsample_depth(long struct) { return memGetByte(struct + spng_splt.SAMPLE_DEPTH); }
    /** Unsafe version of {@link #n_entries}. */
    public static int nn_entries(long struct) { return memGetInt(struct + spng_splt.N_ENTRIES); }
    /** Unsafe version of {@link #entries}. */
    public static spng_splt_entry.Buffer nentries(long struct) { return spng_splt_entry.create(memGetAddress(struct + spng_splt.ENTRIES), nn_entries(struct)); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 80);
        }
        memCopy(memAddress(value), struct + spng_splt.NAME, value.remaining());
    }
    /** Unsafe version of {@link #sample_depth(byte) sample_depth}. */
    public static void nsample_depth(long struct, byte value) { memPutByte(struct + spng_splt.SAMPLE_DEPTH, value); }
    /** Sets the specified value to the {@code n_entries} field of the specified {@code struct}. */
    public static void nn_entries(long struct, int value) { memPutInt(struct + spng_splt.N_ENTRIES, value); }
    /** Unsafe version of {@link #entries(spng_splt_entry.Buffer) entries}. */
    public static void nentries(long struct, spng_splt_entry.Buffer value) { memPutAddress(struct + spng_splt.ENTRIES, value.address()); nn_entries(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + spng_splt.ENTRIES));
    }

    // -----------------------------------

    /** An array of {@link spng_splt} structs. */
    public static class Buffer extends StructBuffer<spng_splt, Buffer> implements NativeResource {

        private static final spng_splt ELEMENT_FACTORY = spng_splt.create(-1L);

        /**
         * Creates a new {@code spng_splt.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_splt#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_splt getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[80]")
        public ByteBuffer name() { return spng_splt.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[80]")
        public String nameString() { return spng_splt.nnameString(address()); }
        /** @return the value of the {@code sample_depth} field. */
        @NativeType("uint8_t")
        public byte sample_depth() { return spng_splt.nsample_depth(address()); }
        /** @return the value of the {@code n_entries} field. */
        @NativeType("uint32_t")
        public int n_entries() { return spng_splt.nn_entries(address()); }
        /** @return a {@link spng_splt_entry.Buffer} view of the struct array pointed to by the {@code entries} field. */
        @NativeType("struct spng_splt_entry *")
        public spng_splt_entry.Buffer entries() { return spng_splt.nentries(address()); }

        /** Copies the specified encoded string to the {@code name} field. */
        public spng_splt.Buffer name(@NativeType("char[80]") ByteBuffer value) { spng_splt.nname(address(), value); return this; }
        /** Sets the specified value to the {@code sample_depth} field. */
        public spng_splt.Buffer sample_depth(@NativeType("uint8_t") byte value) { spng_splt.nsample_depth(address(), value); return this; }
        /** Sets the address of the specified {@link spng_splt_entry.Buffer} to the {@code entries} field. */
        public spng_splt.Buffer entries(@NativeType("struct spng_splt_entry *") spng_splt_entry.Buffer value) { spng_splt.nentries(address(), value); return this; }

    }

}
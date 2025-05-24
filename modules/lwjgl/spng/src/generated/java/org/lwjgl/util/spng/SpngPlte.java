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
 * struct spng_plte {
 *     uint32_t n_entries;
 *     {@link SpngPlteEntry spng_plte_entry} entries[256];
 * }}</pre>
 */
@NativeType("struct spng_plte")
public class SpngPlte extends Struct<SpngPlte> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        N_ENTRIES,
        ENTRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __array(SpngPlteEntry.SIZEOF, SpngPlteEntry.ALIGNOF, 256)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        N_ENTRIES = layout.offsetof(0);
        ENTRIES = layout.offsetof(1);
    }

    protected SpngPlte(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngPlte create(long address, @Nullable ByteBuffer container) {
        return new SpngPlte(address, container);
    }

    /**
     * Creates a {@code SpngPlte} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngPlte(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code n_entries} field. */
    @NativeType("uint32_t")
    public int n_entries() { return nn_entries(address()); }
    /** @return a {@link SpngPlteEntry}.Buffer view of the {@code entries} field. */
    @NativeType("spng_plte_entry[256]")
    public SpngPlteEntry.Buffer entries() { return nentries(address()); }
    /** @return a {@link SpngPlteEntry} view of the struct at the specified index of the {@code entries} field. */
    @NativeType("spng_plte_entry")
    public SpngPlteEntry entries(int index) { return nentries(address(), index); }

    /** Sets the specified value to the {@code n_entries} field. */
    public SpngPlte n_entries(@NativeType("uint32_t") int value) { nn_entries(address(), value); return this; }
    /** Copies the specified {@link SpngPlteEntry.Buffer} to the {@code entries} field. */
    public SpngPlte entries(@NativeType("spng_plte_entry[256]") SpngPlteEntry.Buffer value) { nentries(address(), value); return this; }
    /** Copies the specified {@link SpngPlteEntry} at the specified index of the {@code entries} field. */
    public SpngPlte entries(int index, @NativeType("spng_plte_entry") SpngPlteEntry value) { nentries(address(), index, value); return this; }
    /** Passes the {@code entries} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SpngPlte entries(java.util.function.Consumer<SpngPlteEntry.Buffer> consumer) { consumer.accept(entries()); return this; }
    /** Passes the element at {@code index} of the {@code entries} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SpngPlte entries(int index, java.util.function.Consumer<SpngPlteEntry> consumer) { consumer.accept(entries(index)); return this; }

    /** Initializes this struct with the specified values. */
    public SpngPlte set(
        int n_entries,
        SpngPlteEntry.Buffer entries
    ) {
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
    public SpngPlte set(SpngPlte src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngPlte} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngPlte malloc() {
        return new SpngPlte(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngPlte} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngPlte calloc() {
        return new SpngPlte(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngPlte} instance allocated with {@link BufferUtils}. */
    public static SpngPlte create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngPlte(memAddress(container), container);
    }

    /** Returns a new {@code SpngPlte} instance for the specified memory address. */
    public static SpngPlte create(long address) {
        return new SpngPlte(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngPlte createSafe(long address) {
        return address == NULL ? null : new SpngPlte(address, null);
    }

    /**
     * Returns a new {@link SpngPlte.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngPlte.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngPlte.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngPlte.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngPlte.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngPlte.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngPlte.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngPlte.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngPlte.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngPlte} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngPlte malloc(MemoryStack stack) {
        return new SpngPlte(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngPlte} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngPlte calloc(MemoryStack stack) {
        return new SpngPlte(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngPlte.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngPlte.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngPlte.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngPlte.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #n_entries}. */
    public static int nn_entries(long struct) { return memGetInt(struct + SpngPlte.N_ENTRIES); }
    /** Unsafe version of {@link #entries}. */
    public static SpngPlteEntry.Buffer nentries(long struct) { return SpngPlteEntry.create(struct + SpngPlte.ENTRIES, 256); }
    /** Unsafe version of {@link #entries(int) entries}. */
    public static SpngPlteEntry nentries(long struct, int index) {
        return SpngPlteEntry.create(struct + SpngPlte.ENTRIES + check(index, 256) * SpngPlteEntry.SIZEOF);
    }

    /** Unsafe version of {@link #n_entries(int) n_entries}. */
    public static void nn_entries(long struct, int value) { memPutInt(struct + SpngPlte.N_ENTRIES, value); }
    /** Unsafe version of {@link #entries(SpngPlteEntry.Buffer) entries}. */
    public static void nentries(long struct, SpngPlteEntry.Buffer value) {
        if (CHECKS) { checkGT(value, 256); }
        memCopy(value.address(), struct + SpngPlte.ENTRIES, value.remaining() * SpngPlteEntry.SIZEOF);
    }
    /** Unsafe version of {@link #entries(int, SpngPlteEntry) entries}. */
    public static void nentries(long struct, int index, SpngPlteEntry value) {
        memCopy(value.address(), struct + SpngPlte.ENTRIES + check(index, 256) * SpngPlteEntry.SIZEOF, SpngPlteEntry.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link SpngPlte} structs. */
    public static class Buffer extends StructBuffer<SpngPlte, Buffer> implements NativeResource {

        private static final SpngPlte ELEMENT_FACTORY = SpngPlte.create(-1L);

        /**
         * Creates a new {@code SpngPlte.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngPlte#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngPlte getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code n_entries} field. */
        @NativeType("uint32_t")
        public int n_entries() { return SpngPlte.nn_entries(address()); }
        /** @return a {@link SpngPlteEntry}.Buffer view of the {@code entries} field. */
        @NativeType("spng_plte_entry[256]")
        public SpngPlteEntry.Buffer entries() { return SpngPlte.nentries(address()); }
        /** @return a {@link SpngPlteEntry} view of the struct at the specified index of the {@code entries} field. */
        @NativeType("spng_plte_entry")
        public SpngPlteEntry entries(int index) { return SpngPlte.nentries(address(), index); }

        /** Sets the specified value to the {@code n_entries} field. */
        public SpngPlte.Buffer n_entries(@NativeType("uint32_t") int value) { SpngPlte.nn_entries(address(), value); return this; }
        /** Copies the specified {@link SpngPlteEntry.Buffer} to the {@code entries} field. */
        public SpngPlte.Buffer entries(@NativeType("spng_plte_entry[256]") SpngPlteEntry.Buffer value) { SpngPlte.nentries(address(), value); return this; }
        /** Copies the specified {@link SpngPlteEntry} at the specified index of the {@code entries} field. */
        public SpngPlte.Buffer entries(int index, @NativeType("spng_plte_entry") SpngPlteEntry value) { SpngPlte.nentries(address(), index, value); return this; }
        /** Passes the {@code entries} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SpngPlte.Buffer entries(java.util.function.Consumer<SpngPlteEntry.Buffer> consumer) { consumer.accept(entries()); return this; }
        /** Passes the element at {@code index} of the {@code entries} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SpngPlte.Buffer entries(int index, java.util.function.Consumer<SpngPlteEntry> consumer) { consumer.accept(entries(index)); return this; }

    }

}
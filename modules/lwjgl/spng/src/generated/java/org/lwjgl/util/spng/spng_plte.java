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
 * struct spng_plte {
 *     uint32_t n_entries;
 *     {@link spng_plte_entry struct spng_plte_entry} entries[256];
 * }</code></pre>
 */
@NativeType("struct spng_plte")
public class spng_plte extends Struct<spng_plte> implements NativeResource {

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
            __array(spng_plte_entry.SIZEOF, spng_plte_entry.ALIGNOF, 256)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        N_ENTRIES = layout.offsetof(0);
        ENTRIES = layout.offsetof(1);
    }

    protected spng_plte(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_plte create(long address, @Nullable ByteBuffer container) {
        return new spng_plte(address, container);
    }

    /**
     * Creates a {@code spng_plte} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_plte(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code n_entries} field. */
    @NativeType("uint32_t")
    public int n_entries() { return nn_entries(address()); }
    /** @return a {@link spng_plte_entry}.Buffer view of the {@code entries} field. */
    @NativeType("struct spng_plte_entry[256]")
    public spng_plte_entry.Buffer entries() { return nentries(address()); }
    /** @return a {@link spng_plte_entry} view of the struct at the specified index of the {@code entries} field. */
    @NativeType("struct spng_plte_entry")
    public spng_plte_entry entries(int index) { return nentries(address(), index); }

    /** Copies the specified {@link spng_plte_entry.Buffer} to the {@code entries} field. */
    public spng_plte entries(@NativeType("struct spng_plte_entry[256]") spng_plte_entry.Buffer value) { nentries(address(), value); return this; }
    /** Copies the specified {@link spng_plte_entry} at the specified index of the {@code entries} field. */
    public spng_plte entries(int index, @NativeType("struct spng_plte_entry") spng_plte_entry value) { nentries(address(), index, value); return this; }
    /** Passes the {@code entries} field to the specified {@link java.util.function.Consumer Consumer}. */
    public spng_plte entries(java.util.function.Consumer<spng_plte_entry.Buffer> consumer) { consumer.accept(entries()); return this; }
    /** Passes the element at {@code index} of the {@code entries} field to the specified {@link java.util.function.Consumer Consumer}. */
    public spng_plte entries(int index, java.util.function.Consumer<spng_plte_entry> consumer) { consumer.accept(entries(index)); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_plte set(spng_plte src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_plte} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_plte malloc() {
        return new spng_plte(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_plte} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_plte calloc() {
        return new spng_plte(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_plte} instance allocated with {@link BufferUtils}. */
    public static spng_plte create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_plte(memAddress(container), container);
    }

    /** Returns a new {@code spng_plte} instance for the specified memory address. */
    public static spng_plte create(long address) {
        return new spng_plte(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_plte createSafe(long address) {
        return address == NULL ? null : new spng_plte(address, null);
    }

    /**
     * Returns a new {@link spng_plte.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_plte.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_plte.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_plte.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_plte.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_plte.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_plte.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_plte.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_plte.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_plte} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_plte malloc(MemoryStack stack) {
        return new spng_plte(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_plte} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_plte calloc(MemoryStack stack) {
        return new spng_plte(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_plte.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_plte.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_plte.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_plte.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #n_entries}. */
    public static int nn_entries(long struct) { return memGetInt(struct + spng_plte.N_ENTRIES); }
    /** Unsafe version of {@link #entries}. */
    public static spng_plte_entry.Buffer nentries(long struct) { return spng_plte_entry.create(struct + spng_plte.ENTRIES, nn_entries(struct)); }
    /** Unsafe version of {@link #entries(int) entries}. */
    public static spng_plte_entry nentries(long struct, int index) {
        return spng_plte_entry.create(struct + spng_plte.ENTRIES + check(index, nn_entries(struct)) * spng_plte_entry.SIZEOF);
    }

    /** Sets the specified value to the {@code n_entries} field of the specified {@code struct}. */
    public static void nn_entries(long struct, int value) { memPutInt(struct + spng_plte.N_ENTRIES, value); }
    /** Unsafe version of {@link #entries(spng_plte_entry.Buffer) entries}. */
    public static void nentries(long struct, spng_plte_entry.Buffer value) {
        if (CHECKS) { checkGT(value, 256); }
        memCopy(value.address(), struct + spng_plte.ENTRIES, value.remaining() * spng_plte_entry.SIZEOF);
        nn_entries(struct, value.remaining());
    }
    /** Unsafe version of {@link #entries(int, spng_plte_entry) entries}. */
    public static void nentries(long struct, int index, spng_plte_entry value) {
        memCopy(value.address(), struct + spng_plte.ENTRIES + check(index, 256) * spng_plte_entry.SIZEOF, spng_plte_entry.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link spng_plte} structs. */
    public static class Buffer extends StructBuffer<spng_plte, Buffer> implements NativeResource {

        private static final spng_plte ELEMENT_FACTORY = spng_plte.create(-1L);

        /**
         * Creates a new {@code spng_plte.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_plte#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_plte getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code n_entries} field. */
        @NativeType("uint32_t")
        public int n_entries() { return spng_plte.nn_entries(address()); }
        /** @return a {@link spng_plte_entry}.Buffer view of the {@code entries} field. */
        @NativeType("struct spng_plte_entry[256]")
        public spng_plte_entry.Buffer entries() { return spng_plte.nentries(address()); }
        /** @return a {@link spng_plte_entry} view of the struct at the specified index of the {@code entries} field. */
        @NativeType("struct spng_plte_entry")
        public spng_plte_entry entries(int index) { return spng_plte.nentries(address(), index); }

        /** Copies the specified {@link spng_plte_entry.Buffer} to the {@code entries} field. */
        public spng_plte.Buffer entries(@NativeType("struct spng_plte_entry[256]") spng_plte_entry.Buffer value) { spng_plte.nentries(address(), value); return this; }
        /** Copies the specified {@link spng_plte_entry} at the specified index of the {@code entries} field. */
        public spng_plte.Buffer entries(int index, @NativeType("struct spng_plte_entry") spng_plte_entry value) { spng_plte.nentries(address(), index, value); return this; }
        /** Passes the {@code entries} field to the specified {@link java.util.function.Consumer Consumer}. */
        public spng_plte.Buffer entries(java.util.function.Consumer<spng_plte_entry.Buffer> consumer) { consumer.accept(entries()); return this; }
        /** Passes the element at {@code index} of the {@code entries} field to the specified {@link java.util.function.Consumer Consumer}. */
        public spng_plte.Buffer entries(int index, java.util.function.Consumer<spng_plte_entry> consumer) { consumer.accept(entries(index)); return this; }

    }

}
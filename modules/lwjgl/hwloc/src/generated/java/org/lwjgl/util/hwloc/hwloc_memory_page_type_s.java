/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hwloc_memory_page_type_s {
 *     hwloc_uint64_t size;
 *     hwloc_uint64_t count;
 * }</code></pre>
 */
public class hwloc_memory_page_type_s extends Struct<hwloc_memory_page_type_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        COUNT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        COUNT = layout.offsetof(1);
    }

    protected hwloc_memory_page_type_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_memory_page_type_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_memory_page_type_s(address, container);
    }

    /**
     * Creates a {@code hwloc_memory_page_type_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_memory_page_type_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code size} field. */
    @NativeType("hwloc_uint64_t")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code count} field. */
    @NativeType("hwloc_uint64_t")
    public long count() { return ncount(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_memory_page_type_s} instance for the specified memory address. */
    public static hwloc_memory_page_type_s create(long address) {
        return new hwloc_memory_page_type_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_memory_page_type_s createSafe(long address) {
        return address == NULL ? null : new hwloc_memory_page_type_s(address, null);
    }

    /**
     * Create a {@link hwloc_memory_page_type_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_memory_page_type_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_memory_page_type_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + hwloc_memory_page_type_s.SIZE); }
    /** Unsafe version of {@link #count}. */
    public static long ncount(long struct) { return UNSAFE.getLong(null, struct + hwloc_memory_page_type_s.COUNT); }

    // -----------------------------------

    /** An array of {@link hwloc_memory_page_type_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_memory_page_type_s, Buffer> {

        private static final hwloc_memory_page_type_s ELEMENT_FACTORY = hwloc_memory_page_type_s.create(-1L);

        /**
         * Creates a new {@code hwloc_memory_page_type_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_memory_page_type_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_memory_page_type_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code size} field. */
        @NativeType("hwloc_uint64_t")
        public long size() { return hwloc_memory_page_type_s.nsize(address()); }
        /** @return the value of the {@code count} field. */
        @NativeType("hwloc_uint64_t")
        public long count() { return hwloc_memory_page_type_s.ncount(address()); }

    }

}
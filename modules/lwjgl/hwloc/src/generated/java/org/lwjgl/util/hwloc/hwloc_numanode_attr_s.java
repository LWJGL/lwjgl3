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
 * struct hwloc_numanode_attr_s {
 *     hwloc_uint64_t local_memory;
 *     unsigned page_types_len;
 *     {@link hwloc_memory_page_type_s hwloc_memory_page_type_s} * page_types;
 * }</code></pre>
 */
public class hwloc_numanode_attr_s extends Struct<hwloc_numanode_attr_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCAL_MEMORY,
        PAGE_TYPES_LEN,
        PAGE_TYPES;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCAL_MEMORY = layout.offsetof(0);
        PAGE_TYPES_LEN = layout.offsetof(1);
        PAGE_TYPES = layout.offsetof(2);
    }

    protected hwloc_numanode_attr_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_numanode_attr_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_numanode_attr_s(address, container);
    }

    /**
     * Creates a {@code hwloc_numanode_attr_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_numanode_attr_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code local_memory} field. */
    @NativeType("hwloc_uint64_t")
    public long local_memory() { return nlocal_memory(address()); }
    /** @return the value of the {@code page_types_len} field. */
    @NativeType("unsigned")
    public int page_types_len() { return npage_types_len(address()); }
    /** @return a {@link hwloc_memory_page_type_s.Buffer} view of the struct array pointed to by the {@code page_types} field. */
    @Nullable
    @NativeType("hwloc_memory_page_type_s *")
    public hwloc_memory_page_type_s.Buffer page_types() { return npage_types(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_numanode_attr_s} instance for the specified memory address. */
    public static hwloc_numanode_attr_s create(long address) {
        return new hwloc_numanode_attr_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_numanode_attr_s createSafe(long address) {
        return address == NULL ? null : new hwloc_numanode_attr_s(address, null);
    }

    /**
     * Create a {@link hwloc_numanode_attr_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_numanode_attr_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_numanode_attr_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #local_memory}. */
    public static long nlocal_memory(long struct) { return UNSAFE.getLong(null, struct + hwloc_numanode_attr_s.LOCAL_MEMORY); }
    /** Unsafe version of {@link #page_types_len}. */
    public static int npage_types_len(long struct) { return UNSAFE.getInt(null, struct + hwloc_numanode_attr_s.PAGE_TYPES_LEN); }
    /** Unsafe version of {@link #page_types}. */
    @Nullable public static hwloc_memory_page_type_s.Buffer npage_types(long struct) { return hwloc_memory_page_type_s.createSafe(memGetAddress(struct + hwloc_numanode_attr_s.PAGE_TYPES), npage_types_len(struct)); }

    // -----------------------------------

    /** An array of {@link hwloc_numanode_attr_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_numanode_attr_s, Buffer> {

        private static final hwloc_numanode_attr_s ELEMENT_FACTORY = hwloc_numanode_attr_s.create(-1L);

        /**
         * Creates a new {@code hwloc_numanode_attr_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_numanode_attr_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_numanode_attr_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code local_memory} field. */
        @NativeType("hwloc_uint64_t")
        public long local_memory() { return hwloc_numanode_attr_s.nlocal_memory(address()); }
        /** @return the value of the {@code page_types_len} field. */
        @NativeType("unsigned")
        public int page_types_len() { return hwloc_numanode_attr_s.npage_types_len(address()); }
        /** @return a {@link hwloc_memory_page_type_s.Buffer} view of the struct array pointed to by the {@code page_types} field. */
        @Nullable
        @NativeType("hwloc_memory_page_type_s *")
        public hwloc_memory_page_type_s.Buffer page_types() { return hwloc_numanode_attr_s.npage_types(address()); }

    }

}
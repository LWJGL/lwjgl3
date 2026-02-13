/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct hwloc_numanode_attr_s {
 *     hwloc_uint64_t local_memory;
 * }}</pre>
 */
public class hwloc_numanode_attr_s extends Struct<hwloc_numanode_attr_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LOCAL_MEMORY;

    static {
        Layout layout = __struct(
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LOCAL_MEMORY = layout.offsetof(0);
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

    // -----------------------------------

    /** Returns a new {@code hwloc_numanode_attr_s} instance for the specified memory address. */
    public static hwloc_numanode_attr_s create(long address) {
        return new hwloc_numanode_attr_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable hwloc_numanode_attr_s createSafe(long address) {
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
    public static hwloc_numanode_attr_s.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #local_memory}. */
    public static long nlocal_memory(long struct) { return memGetLong(struct + hwloc_numanode_attr_s.LOCAL_MEMORY); }

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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected hwloc_numanode_attr_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code local_memory} field. */
        @NativeType("hwloc_uint64_t")
        public long local_memory() { return hwloc_numanode_attr_s.nlocal_memory(address()); }

    }

}
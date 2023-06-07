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
 * struct hwloc_topology_diff_generic_s {
 *     hwloc_topology_diff_type_t type;
 *     {@link hwloc_topology_diff_u hwloc_topology_diff_u} * next;
 * }</code></pre>
 */
public class hwloc_topology_diff_generic_s extends Struct<hwloc_topology_diff_generic_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected hwloc_topology_diff_generic_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_diff_generic_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_diff_generic_s(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_diff_generic_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_diff_generic_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("hwloc_topology_diff_type_t")
    public int type() { return ntype(address()); }
    /** @return a {@link hwloc_topology_diff_u} view of the struct pointed to by the {@code next} field. */
    @NativeType("hwloc_topology_diff_u *")
    public hwloc_topology_diff_u next() { return nnext(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_diff_generic_s} instance for the specified memory address. */
    public static hwloc_topology_diff_generic_s create(long address) {
        return new hwloc_topology_diff_generic_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_generic_s createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_diff_generic_s(address, null);
    }

    /**
     * Create a {@link hwloc_topology_diff_generic_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_diff_generic_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_generic_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + hwloc_topology_diff_generic_s.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static hwloc_topology_diff_u nnext(long struct) { return hwloc_topology_diff_u.create(memGetAddress(struct + hwloc_topology_diff_generic_s.NEXT)); }

    // -----------------------------------

    /** An array of {@link hwloc_topology_diff_generic_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_diff_generic_s, Buffer> {

        private static final hwloc_topology_diff_generic_s ELEMENT_FACTORY = hwloc_topology_diff_generic_s.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_diff_generic_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_diff_generic_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_diff_generic_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("hwloc_topology_diff_type_t")
        public int type() { return hwloc_topology_diff_generic_s.ntype(address()); }
        /** @return a {@link hwloc_topology_diff_u} view of the struct pointed to by the {@code next} field. */
        @NativeType("hwloc_topology_diff_u *")
        public hwloc_topology_diff_u next() { return hwloc_topology_diff_generic_s.nnext(address()); }

    }

}
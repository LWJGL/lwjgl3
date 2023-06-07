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
 * struct hwloc_topology_diff_too_complex_s {
 *     hwloc_topology_diff_type_t type;
 *     {@link hwloc_topology_diff_u struct hwloc_topology_diff_u} * next;
 *     int obj_depth;
 *     unsigned int obj_index;
 * }</code></pre>
 */
public class hwloc_topology_diff_too_complex_s extends Struct<hwloc_topology_diff_too_complex_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        OBJ_DEPTH,
        OBJ_INDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        OBJ_DEPTH = layout.offsetof(2);
        OBJ_INDEX = layout.offsetof(3);
    }

    protected hwloc_topology_diff_too_complex_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_diff_too_complex_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_diff_too_complex_s(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_diff_too_complex_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_diff_too_complex_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("hwloc_topology_diff_type_t")
    public int type() { return ntype(address()); }
    /** @return a {@link hwloc_topology_diff_u} view of the struct pointed to by the {@code next} field. */
    @Nullable
    @NativeType("struct hwloc_topology_diff_u *")
    public hwloc_topology_diff_u next() { return nnext(address()); }
    /** @return the value of the {@code obj_depth} field. */
    public int obj_depth() { return nobj_depth(address()); }
    /** @return the value of the {@code obj_index} field. */
    @NativeType("unsigned int")
    public int obj_index() { return nobj_index(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_diff_too_complex_s} instance for the specified memory address. */
    public static hwloc_topology_diff_too_complex_s create(long address) {
        return new hwloc_topology_diff_too_complex_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_too_complex_s createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_diff_too_complex_s(address, null);
    }

    /**
     * Create a {@link hwloc_topology_diff_too_complex_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_diff_too_complex_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_too_complex_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + hwloc_topology_diff_too_complex_s.TYPE); }
    /** Unsafe version of {@link #next}. */
    @Nullable public static hwloc_topology_diff_u nnext(long struct) { return hwloc_topology_diff_u.createSafe(memGetAddress(struct + hwloc_topology_diff_too_complex_s.NEXT)); }
    /** Unsafe version of {@link #obj_depth}. */
    public static int nobj_depth(long struct) { return UNSAFE.getInt(null, struct + hwloc_topology_diff_too_complex_s.OBJ_DEPTH); }
    /** Unsafe version of {@link #obj_index}. */
    public static int nobj_index(long struct) { return UNSAFE.getInt(null, struct + hwloc_topology_diff_too_complex_s.OBJ_INDEX); }

    // -----------------------------------

    /** An array of {@link hwloc_topology_diff_too_complex_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_diff_too_complex_s, Buffer> {

        private static final hwloc_topology_diff_too_complex_s ELEMENT_FACTORY = hwloc_topology_diff_too_complex_s.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_diff_too_complex_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_diff_too_complex_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_diff_too_complex_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("hwloc_topology_diff_type_t")
        public int type() { return hwloc_topology_diff_too_complex_s.ntype(address()); }
        /** @return a {@link hwloc_topology_diff_u} view of the struct pointed to by the {@code next} field. */
        @Nullable
        @NativeType("struct hwloc_topology_diff_u *")
        public hwloc_topology_diff_u next() { return hwloc_topology_diff_too_complex_s.nnext(address()); }
        /** @return the value of the {@code obj_depth} field. */
        public int obj_depth() { return hwloc_topology_diff_too_complex_s.nobj_depth(address()); }
        /** @return the value of the {@code obj_index} field. */
        @NativeType("unsigned int")
        public int obj_index() { return hwloc_topology_diff_too_complex_s.nobj_index(address()); }

    }

}
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
 * union struct hwloc_topology_diff_u {
 *     {@link hwloc_topology_diff_generic_s hwloc_topology_diff_generic_s} generic;
 *     {@link hwloc_topology_diff_obj_attr_s hwloc_topology_diff_obj_attr_s} obj_attr;
 *     {@link hwloc_topology_diff_too_complex_s hwloc_topology_diff_too_complex_s} too_complex;
 * }</code></pre>
 */
@NativeType("union struct hwloc_topology_diff_u")
public class hwloc_topology_diff_u extends Struct<hwloc_topology_diff_u> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GENERIC,
        OBJ_ATTR,
        TOO_COMPLEX;

    static {
        Layout layout = __union(
            __member(hwloc_topology_diff_generic_s.SIZEOF, hwloc_topology_diff_generic_s.ALIGNOF),
            __member(hwloc_topology_diff_obj_attr_s.SIZEOF, hwloc_topology_diff_obj_attr_s.ALIGNOF),
            __member(hwloc_topology_diff_too_complex_s.SIZEOF, hwloc_topology_diff_too_complex_s.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GENERIC = layout.offsetof(0);
        OBJ_ATTR = layout.offsetof(1);
        TOO_COMPLEX = layout.offsetof(2);
    }

    protected hwloc_topology_diff_u(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_diff_u create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_diff_u(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_diff_u} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_diff_u(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link hwloc_topology_diff_generic_s} view of the {@code generic} field. */
    public hwloc_topology_diff_generic_s generic() { return ngeneric(address()); }
    /** @return a {@link hwloc_topology_diff_obj_attr_s} view of the {@code obj_attr} field. */
    public hwloc_topology_diff_obj_attr_s obj_attr() { return nobj_attr(address()); }
    /** @return a {@link hwloc_topology_diff_too_complex_s} view of the {@code too_complex} field. */
    public hwloc_topology_diff_too_complex_s too_complex() { return ntoo_complex(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_diff_u} instance for the specified memory address. */
    public static hwloc_topology_diff_u create(long address) {
        return new hwloc_topology_diff_u(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_u createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_diff_u(address, null);
    }

    /**
     * Create a {@link hwloc_topology_diff_u.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_diff_u.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_diff_u.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #generic}. */
    public static hwloc_topology_diff_generic_s ngeneric(long struct) { return hwloc_topology_diff_generic_s.create(struct + hwloc_topology_diff_u.GENERIC); }
    /** Unsafe version of {@link #obj_attr}. */
    public static hwloc_topology_diff_obj_attr_s nobj_attr(long struct) { return hwloc_topology_diff_obj_attr_s.create(struct + hwloc_topology_diff_u.OBJ_ATTR); }
    /** Unsafe version of {@link #too_complex}. */
    public static hwloc_topology_diff_too_complex_s ntoo_complex(long struct) { return hwloc_topology_diff_too_complex_s.create(struct + hwloc_topology_diff_u.TOO_COMPLEX); }

    // -----------------------------------

    /** An array of {@link hwloc_topology_diff_u} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_diff_u, Buffer> {

        private static final hwloc_topology_diff_u ELEMENT_FACTORY = hwloc_topology_diff_u.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_diff_u.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_diff_u#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_diff_u getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link hwloc_topology_diff_generic_s} view of the {@code generic} field. */
        public hwloc_topology_diff_generic_s generic() { return hwloc_topology_diff_u.ngeneric(address()); }
        /** @return a {@link hwloc_topology_diff_obj_attr_s} view of the {@code obj_attr} field. */
        public hwloc_topology_diff_obj_attr_s obj_attr() { return hwloc_topology_diff_u.nobj_attr(address()); }
        /** @return a {@link hwloc_topology_diff_too_complex_s} view of the {@code too_complex} field. */
        public hwloc_topology_diff_too_complex_s too_complex() { return hwloc_topology_diff_u.ntoo_complex(address()); }

    }

}
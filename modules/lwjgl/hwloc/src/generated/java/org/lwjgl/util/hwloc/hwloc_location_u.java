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
 * union hwloc_location_u {
 *     hwloc_cpuset_t cpuset;
 *     hwloc_obj_t object;
 * }</code></pre>
 */
public class hwloc_location_u extends Struct<hwloc_location_u> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPUSET,
        OBJECT;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPUSET = layout.offsetof(0);
        OBJECT = layout.offsetof(1);
    }

    protected hwloc_location_u(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_location_u create(long address, @Nullable ByteBuffer container) {
        return new hwloc_location_u(address, container);
    }

    /**
     * Creates a {@code hwloc_location_u} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_location_u(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cpuset} field. */
    @NativeType("hwloc_cpuset_t")
    public long cpuset() { return ncpuset(address()); }
    /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code object} field. */
    @NativeType("hwloc_obj_t")
    public hwloc_obj object() { return nobject(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_location_u} instance for the specified memory address. */
    public static hwloc_location_u create(long address) {
        return new hwloc_location_u(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_location_u createSafe(long address) {
        return address == NULL ? null : new hwloc_location_u(address, null);
    }

    /**
     * Create a {@link hwloc_location_u.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_location_u.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_location_u.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cpuset}. */
    public static long ncpuset(long struct) { return memGetAddress(struct + hwloc_location_u.CPUSET); }
    /** Unsafe version of {@link #object}. */
    public static hwloc_obj nobject(long struct) { return hwloc_obj.create(memGetAddress(struct + hwloc_location_u.OBJECT)); }

    // -----------------------------------

    /** An array of {@link hwloc_location_u} structs. */
    public static class Buffer extends StructBuffer<hwloc_location_u, Buffer> {

        private static final hwloc_location_u ELEMENT_FACTORY = hwloc_location_u.create(-1L);

        /**
         * Creates a new {@code hwloc_location_u.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_location_u#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_location_u getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cpuset} field. */
        @NativeType("hwloc_cpuset_t")
        public long cpuset() { return hwloc_location_u.ncpuset(address()); }
        /** @return a {@link hwloc_obj} view of the struct pointed to by the {@code object} field. */
        @NativeType("hwloc_obj_t")
        public hwloc_obj object() { return hwloc_location_u.nobject(address()); }

    }

}
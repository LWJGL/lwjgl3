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
 * struct hwloc_topology_misc_support {
 *     unsigned char imported_support;
 * }</code></pre>
 */
@NativeType("struct hwloc_topology_misc_support")
public class hwloc_topology_misc_support extends Struct<hwloc_topology_misc_support> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMPORTED_SUPPORT;

    static {
        Layout layout = __struct(
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMPORTED_SUPPORT = layout.offsetof(0);
    }

    protected hwloc_topology_misc_support(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_misc_support create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_misc_support(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_misc_support} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_misc_support(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code imported_support} field. */
    @NativeType("unsigned char")
    public boolean imported_support() { return nimported_support(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_misc_support} instance for the specified memory address. */
    public static hwloc_topology_misc_support create(long address) {
        return new hwloc_topology_misc_support(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_misc_support createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_misc_support(address, null);
    }

    /**
     * Create a {@link hwloc_topology_misc_support.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_misc_support.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_misc_support.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #imported_support}. */
    public static boolean nimported_support(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_misc_support.IMPORTED_SUPPORT) != 0; }

    // -----------------------------------

    /** An array of {@link hwloc_topology_misc_support} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_misc_support, Buffer> {

        private static final hwloc_topology_misc_support ELEMENT_FACTORY = hwloc_topology_misc_support.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_misc_support.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_misc_support#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_misc_support getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code imported_support} field. */
        @NativeType("unsigned char")
        public boolean imported_support() { return hwloc_topology_misc_support.nimported_support(address()); }

    }

}
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
 * struct hwloc_topology_support {
 *     {@link hwloc_topology_discovery_support struct hwloc_topology_discovery_support} * discovery;
 *     {@link hwloc_topology_cpubind_support struct hwloc_topology_cpubind_support} * cpubind;
 *     {@link hwloc_topology_membind_support struct hwloc_topology_membind_support} * membind;
 *     {@link hwloc_topology_misc_support struct hwloc_topology_misc_support} * misc;
 * }</code></pre>
 */
@NativeType("struct hwloc_topology_support")
public class hwloc_topology_support extends Struct<hwloc_topology_support> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DISCOVERY,
        CPUBIND,
        MEMBIND,
        MISC;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DISCOVERY = layout.offsetof(0);
        CPUBIND = layout.offsetof(1);
        MEMBIND = layout.offsetof(2);
        MISC = layout.offsetof(3);
    }

    protected hwloc_topology_support(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_support create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_support(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_support} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_support(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link hwloc_topology_discovery_support} view of the struct pointed to by the {@code discovery} field. */
    @NativeType("struct hwloc_topology_discovery_support *")
    public hwloc_topology_discovery_support discovery() { return ndiscovery(address()); }
    /** @return a {@link hwloc_topology_cpubind_support} view of the struct pointed to by the {@code cpubind} field. */
    @NativeType("struct hwloc_topology_cpubind_support *")
    public hwloc_topology_cpubind_support cpubind() { return ncpubind(address()); }
    /** @return a {@link hwloc_topology_membind_support} view of the struct pointed to by the {@code membind} field. */
    @NativeType("struct hwloc_topology_membind_support *")
    public hwloc_topology_membind_support membind() { return nmembind(address()); }
    /** @return a {@link hwloc_topology_misc_support} view of the struct pointed to by the {@code misc} field. */
    @NativeType("struct hwloc_topology_misc_support *")
    public hwloc_topology_misc_support misc() { return nmisc(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_support} instance for the specified memory address. */
    public static hwloc_topology_support create(long address) {
        return new hwloc_topology_support(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_support createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_support(address, null);
    }

    /**
     * Create a {@link hwloc_topology_support.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_support.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_support.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #discovery}. */
    public static hwloc_topology_discovery_support ndiscovery(long struct) { return hwloc_topology_discovery_support.create(memGetAddress(struct + hwloc_topology_support.DISCOVERY)); }
    /** Unsafe version of {@link #cpubind}. */
    public static hwloc_topology_cpubind_support ncpubind(long struct) { return hwloc_topology_cpubind_support.create(memGetAddress(struct + hwloc_topology_support.CPUBIND)); }
    /** Unsafe version of {@link #membind}. */
    public static hwloc_topology_membind_support nmembind(long struct) { return hwloc_topology_membind_support.create(memGetAddress(struct + hwloc_topology_support.MEMBIND)); }
    /** Unsafe version of {@link #misc}. */
    public static hwloc_topology_misc_support nmisc(long struct) { return hwloc_topology_misc_support.create(memGetAddress(struct + hwloc_topology_support.MISC)); }

    // -----------------------------------

    /** An array of {@link hwloc_topology_support} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_support, Buffer> {

        private static final hwloc_topology_support ELEMENT_FACTORY = hwloc_topology_support.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_support.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_support#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_support getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link hwloc_topology_discovery_support} view of the struct pointed to by the {@code discovery} field. */
        @NativeType("struct hwloc_topology_discovery_support *")
        public hwloc_topology_discovery_support discovery() { return hwloc_topology_support.ndiscovery(address()); }
        /** @return a {@link hwloc_topology_cpubind_support} view of the struct pointed to by the {@code cpubind} field. */
        @NativeType("struct hwloc_topology_cpubind_support *")
        public hwloc_topology_cpubind_support cpubind() { return hwloc_topology_support.ncpubind(address()); }
        /** @return a {@link hwloc_topology_membind_support} view of the struct pointed to by the {@code membind} field. */
        @NativeType("struct hwloc_topology_membind_support *")
        public hwloc_topology_membind_support membind() { return hwloc_topology_support.nmembind(address()); }
        /** @return a {@link hwloc_topology_misc_support} view of the struct pointed to by the {@code misc} field. */
        @NativeType("struct hwloc_topology_misc_support *")
        public hwloc_topology_misc_support misc() { return hwloc_topology_support.nmisc(address()); }

    }

}
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
 * struct hwloc_topology_discovery_support {
 *     unsigned char pu;
 *     unsigned char numa;
 *     unsigned char numa_memory;
 *     unsigned char disallowed_pu;
 *     unsigned char disallowed_numa;
 *     unsigned char cpukind_efficiency;
 * }</code></pre>
 */
@NativeType("struct hwloc_topology_discovery_support")
public class hwloc_topology_discovery_support extends Struct<hwloc_topology_discovery_support> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PU,
        NUMA,
        NUMA_MEMORY,
        DISALLOWED_PU,
        DISALLOWED_NUMA,
        CPUKIND_EFFICIENCY;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PU = layout.offsetof(0);
        NUMA = layout.offsetof(1);
        NUMA_MEMORY = layout.offsetof(2);
        DISALLOWED_PU = layout.offsetof(3);
        DISALLOWED_NUMA = layout.offsetof(4);
        CPUKIND_EFFICIENCY = layout.offsetof(5);
    }

    protected hwloc_topology_discovery_support(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_topology_discovery_support create(long address, @Nullable ByteBuffer container) {
        return new hwloc_topology_discovery_support(address, container);
    }

    /**
     * Creates a {@code hwloc_topology_discovery_support} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_topology_discovery_support(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pu} field. */
    @NativeType("unsigned char")
    public boolean pu() { return npu(address()); }
    /** @return the value of the {@code numa} field. */
    @NativeType("unsigned char")
    public boolean numa() { return nnuma(address()); }
    /** @return the value of the {@code numa_memory} field. */
    @NativeType("unsigned char")
    public boolean numa_memory() { return nnuma_memory(address()); }
    /** @return the value of the {@code disallowed_pu} field. */
    @NativeType("unsigned char")
    public boolean disallowed_pu() { return ndisallowed_pu(address()); }
    /** @return the value of the {@code disallowed_numa} field. */
    @NativeType("unsigned char")
    public boolean disallowed_numa() { return ndisallowed_numa(address()); }
    /** @return the value of the {@code cpukind_efficiency} field. */
    @NativeType("unsigned char")
    public boolean cpukind_efficiency() { return ncpukind_efficiency(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_topology_discovery_support} instance for the specified memory address. */
    public static hwloc_topology_discovery_support create(long address) {
        return new hwloc_topology_discovery_support(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_discovery_support createSafe(long address) {
        return address == NULL ? null : new hwloc_topology_discovery_support(address, null);
    }

    /**
     * Create a {@link hwloc_topology_discovery_support.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_topology_discovery_support.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_topology_discovery_support.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pu}. */
    public static boolean npu(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_discovery_support.PU) != 0; }
    /** Unsafe version of {@link #numa}. */
    public static boolean nnuma(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_discovery_support.NUMA) != 0; }
    /** Unsafe version of {@link #numa_memory}. */
    public static boolean nnuma_memory(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_discovery_support.NUMA_MEMORY) != 0; }
    /** Unsafe version of {@link #disallowed_pu}. */
    public static boolean ndisallowed_pu(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_discovery_support.DISALLOWED_PU) != 0; }
    /** Unsafe version of {@link #disallowed_numa}. */
    public static boolean ndisallowed_numa(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_discovery_support.DISALLOWED_NUMA) != 0; }
    /** Unsafe version of {@link #cpukind_efficiency}. */
    public static boolean ncpukind_efficiency(long struct) { return UNSAFE.getByte(null, struct + hwloc_topology_discovery_support.CPUKIND_EFFICIENCY) != 0; }

    // -----------------------------------

    /** An array of {@link hwloc_topology_discovery_support} structs. */
    public static class Buffer extends StructBuffer<hwloc_topology_discovery_support, Buffer> {

        private static final hwloc_topology_discovery_support ELEMENT_FACTORY = hwloc_topology_discovery_support.create(-1L);

        /**
         * Creates a new {@code hwloc_topology_discovery_support.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_topology_discovery_support#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_topology_discovery_support getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pu} field. */
        @NativeType("unsigned char")
        public boolean pu() { return hwloc_topology_discovery_support.npu(address()); }
        /** @return the value of the {@code numa} field. */
        @NativeType("unsigned char")
        public boolean numa() { return hwloc_topology_discovery_support.nnuma(address()); }
        /** @return the value of the {@code numa_memory} field. */
        @NativeType("unsigned char")
        public boolean numa_memory() { return hwloc_topology_discovery_support.nnuma_memory(address()); }
        /** @return the value of the {@code disallowed_pu} field. */
        @NativeType("unsigned char")
        public boolean disallowed_pu() { return hwloc_topology_discovery_support.ndisallowed_pu(address()); }
        /** @return the value of the {@code disallowed_numa} field. */
        @NativeType("unsigned char")
        public boolean disallowed_numa() { return hwloc_topology_discovery_support.ndisallowed_numa(address()); }
        /** @return the value of the {@code cpukind_efficiency} field. */
        @NativeType("unsigned char")
        public boolean cpukind_efficiency() { return hwloc_topology_discovery_support.ncpukind_efficiency(address()); }

    }

}
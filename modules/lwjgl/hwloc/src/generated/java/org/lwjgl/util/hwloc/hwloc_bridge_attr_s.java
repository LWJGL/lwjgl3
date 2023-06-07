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
 * struct hwloc_bridge_attr_s {
 *     union {
 *         {@link hwloc_pcidev_attr_s hwloc_pcidev_attr_s} pci;
 *     } upstream;
 *     hwloc_obj_bridge_type_t upstream_type;
 *     union {
 *         struct {
 *             unsigned int domain;
 *             unsigned char secondary_bus;
 *             unsigned char subordinate_bus;
 *         } pci;
 *     } downstream;
 *     hwloc_obj_bridge_type_t downstream_type;
 *     unsigned depth;
 * }</code></pre>
 */
public class hwloc_bridge_attr_s extends Struct<hwloc_bridge_attr_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UPSTREAM,
            UPSTREAM_PCI,
        UPSTREAM_TYPE,
        DOWNSTREAM,
            DOWNSTREAM_PCI,
                DOWNSTREAM_PCI_DOMAIN,
                DOWNSTREAM_PCI_SECONDARY_BUS,
                DOWNSTREAM_PCI_SUBORDINATE_BUS,
        DOWNSTREAM_TYPE,
        DEPTH;

    static {
        Layout layout = __struct(
            __union(
                __member(hwloc_pcidev_attr_s.SIZEOF, hwloc_pcidev_attr_s.ALIGNOF)
            ),
            __member(4),
            __union(
                __struct(
                    __member(4),
                    __member(1),
                    __member(1)
                )
            ),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UPSTREAM = layout.offsetof(0);
            UPSTREAM_PCI = layout.offsetof(1);
        UPSTREAM_TYPE = layout.offsetof(2);
        DOWNSTREAM = layout.offsetof(3);
            DOWNSTREAM_PCI = layout.offsetof(4);
                DOWNSTREAM_PCI_DOMAIN = layout.offsetof(5);
                DOWNSTREAM_PCI_SECONDARY_BUS = layout.offsetof(6);
                DOWNSTREAM_PCI_SUBORDINATE_BUS = layout.offsetof(7);
        DOWNSTREAM_TYPE = layout.offsetof(8);
        DEPTH = layout.offsetof(9);
    }

    protected hwloc_bridge_attr_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_bridge_attr_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_bridge_attr_s(address, container);
    }

    /**
     * Creates a {@code hwloc_bridge_attr_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_bridge_attr_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link hwloc_pcidev_attr_s} view of the {@code upstream.pci} field. */
    public hwloc_pcidev_attr_s upstream_pci() { return nupstream_pci(address()); }
    /** @return the value of the {@code upstream_type} field. */
    @NativeType("hwloc_obj_bridge_type_t")
    public int upstream_type() { return nupstream_type(address()); }
    /** @return the value of the {@code downstream.pci.domain} field. */
    @NativeType("unsigned int")
    public int downstream_pci_domain() { return ndownstream_pci_domain(address()); }
    /** @return the value of the {@code downstream.pci.secondary_bus} field. */
    @NativeType("unsigned char")
    public byte downstream_pci_secondary_bus() { return ndownstream_pci_secondary_bus(address()); }
    /** @return the value of the {@code downstream.pci.subordinate_bus} field. */
    @NativeType("unsigned char")
    public byte downstream_pci_subordinate_bus() { return ndownstream_pci_subordinate_bus(address()); }
    /** @return the value of the {@code downstream_type} field. */
    @NativeType("hwloc_obj_bridge_type_t")
    public int downstream_type() { return ndownstream_type(address()); }
    /** @return the value of the {@code depth} field. */
    @NativeType("unsigned")
    public int depth() { return ndepth(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_bridge_attr_s} instance for the specified memory address. */
    public static hwloc_bridge_attr_s create(long address) {
        return new hwloc_bridge_attr_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_bridge_attr_s createSafe(long address) {
        return address == NULL ? null : new hwloc_bridge_attr_s(address, null);
    }

    /**
     * Create a {@link hwloc_bridge_attr_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_bridge_attr_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_bridge_attr_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #upstream_pci}. */
    public static hwloc_pcidev_attr_s nupstream_pci(long struct) { return hwloc_pcidev_attr_s.create(struct + hwloc_bridge_attr_s.UPSTREAM_PCI); }
    /** Unsafe version of {@link #upstream_type}. */
    public static int nupstream_type(long struct) { return UNSAFE.getInt(null, struct + hwloc_bridge_attr_s.UPSTREAM_TYPE); }
    /** Unsafe version of {@link #downstream_pci_domain}. */
    public static int ndownstream_pci_domain(long struct) { return UNSAFE.getInt(null, struct + hwloc_bridge_attr_s.DOWNSTREAM_PCI_DOMAIN); }
    /** Unsafe version of {@link #downstream_pci_secondary_bus}. */
    public static byte ndownstream_pci_secondary_bus(long struct) { return UNSAFE.getByte(null, struct + hwloc_bridge_attr_s.DOWNSTREAM_PCI_SECONDARY_BUS); }
    /** Unsafe version of {@link #downstream_pci_subordinate_bus}. */
    public static byte ndownstream_pci_subordinate_bus(long struct) { return UNSAFE.getByte(null, struct + hwloc_bridge_attr_s.DOWNSTREAM_PCI_SUBORDINATE_BUS); }
    /** Unsafe version of {@link #downstream_type}. */
    public static int ndownstream_type(long struct) { return UNSAFE.getInt(null, struct + hwloc_bridge_attr_s.DOWNSTREAM_TYPE); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return UNSAFE.getInt(null, struct + hwloc_bridge_attr_s.DEPTH); }

    // -----------------------------------

    /** An array of {@link hwloc_bridge_attr_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_bridge_attr_s, Buffer> {

        private static final hwloc_bridge_attr_s ELEMENT_FACTORY = hwloc_bridge_attr_s.create(-1L);

        /**
         * Creates a new {@code hwloc_bridge_attr_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_bridge_attr_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_bridge_attr_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link hwloc_pcidev_attr_s} view of the {@code upstream.pci} field. */
        public hwloc_pcidev_attr_s upstream_pci() { return hwloc_bridge_attr_s.nupstream_pci(address()); }
        /** @return the value of the {@code upstream_type} field. */
        @NativeType("hwloc_obj_bridge_type_t")
        public int upstream_type() { return hwloc_bridge_attr_s.nupstream_type(address()); }
        /** @return the value of the {@code downstream.pci.domain} field. */
        @NativeType("unsigned int")
        public int downstream_pci_domain() { return hwloc_bridge_attr_s.ndownstream_pci_domain(address()); }
        /** @return the value of the {@code downstream.pci.secondary_bus} field. */
        @NativeType("unsigned char")
        public byte downstream_pci_secondary_bus() { return hwloc_bridge_attr_s.ndownstream_pci_secondary_bus(address()); }
        /** @return the value of the {@code downstream.pci.subordinate_bus} field. */
        @NativeType("unsigned char")
        public byte downstream_pci_subordinate_bus() { return hwloc_bridge_attr_s.ndownstream_pci_subordinate_bus(address()); }
        /** @return the value of the {@code downstream_type} field. */
        @NativeType("hwloc_obj_bridge_type_t")
        public int downstream_type() { return hwloc_bridge_attr_s.ndownstream_type(address()); }
        /** @return the value of the {@code depth} field. */
        @NativeType("unsigned")
        public int depth() { return hwloc_bridge_attr_s.ndepth(address()); }

    }

}
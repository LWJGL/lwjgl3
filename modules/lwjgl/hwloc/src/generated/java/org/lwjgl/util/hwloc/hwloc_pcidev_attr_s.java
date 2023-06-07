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
 * struct hwloc_pcidev_attr_s {
 *     unsigned int domain;
 *     unsigned char bus;
 *     unsigned char dev;
 *     unsigned char func;
 *     unsigned char prog_if;
 *     unsigned short class_id;
 *     unsigned short vendor_id;
 *     unsigned short device_id;
 *     unsigned short subvendor_id;
 *     unsigned short subdevice_id;
 *     unsigned char revision;
 *     float linkspeed;
 * }</code></pre>
 */
public class hwloc_pcidev_attr_s extends Struct<hwloc_pcidev_attr_s> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DOMAIN,
        BUS,
        DEV,
        FUNC,
        PROG_IF,
        CLASS_ID,
        VENDOR_ID,
        DEVICE_ID,
        SUBVENDOR_ID,
        SUBDEVICE_ID,
        REVISION,
        LINKSPEED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(1),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DOMAIN = layout.offsetof(0);
        BUS = layout.offsetof(1);
        DEV = layout.offsetof(2);
        FUNC = layout.offsetof(3);
        PROG_IF = layout.offsetof(4);
        CLASS_ID = layout.offsetof(5);
        VENDOR_ID = layout.offsetof(6);
        DEVICE_ID = layout.offsetof(7);
        SUBVENDOR_ID = layout.offsetof(8);
        SUBDEVICE_ID = layout.offsetof(9);
        REVISION = layout.offsetof(10);
        LINKSPEED = layout.offsetof(11);
    }

    protected hwloc_pcidev_attr_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_pcidev_attr_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_pcidev_attr_s(address, container);
    }

    /**
     * Creates a {@code hwloc_pcidev_attr_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_pcidev_attr_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code domain} field. */
    @NativeType("unsigned int")
    public int domain() { return ndomain(address()); }
    /** @return the value of the {@code bus} field. */
    @NativeType("unsigned char")
    public byte bus() { return nbus(address()); }
    /** @return the value of the {@code dev} field. */
    @NativeType("unsigned char")
    public byte dev() { return ndev(address()); }
    /** @return the value of the {@code func} field. */
    @NativeType("unsigned char")
    public byte func() { return nfunc(address()); }
    /** @return the value of the {@code prog_if} field. */
    @NativeType("unsigned char")
    public byte prog_if() { return nprog_if(address()); }
    /** @return the value of the {@code class_id} field. */
    @NativeType("unsigned short")
    public short class_id() { return nclass_id(address()); }
    /** @return the value of the {@code vendor_id} field. */
    @NativeType("unsigned short")
    public short vendor_id() { return nvendor_id(address()); }
    /** @return the value of the {@code device_id} field. */
    @NativeType("unsigned short")
    public short device_id() { return ndevice_id(address()); }
    /** @return the value of the {@code subvendor_id} field. */
    @NativeType("unsigned short")
    public short subvendor_id() { return nsubvendor_id(address()); }
    /** @return the value of the {@code subdevice_id} field. */
    @NativeType("unsigned short")
    public short subdevice_id() { return nsubdevice_id(address()); }
    /** @return the value of the {@code revision} field. */
    @NativeType("unsigned char")
    public byte revision() { return nrevision(address()); }
    /** @return the value of the {@code linkspeed} field. */
    public float linkspeed() { return nlinkspeed(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_pcidev_attr_s} instance for the specified memory address. */
    public static hwloc_pcidev_attr_s create(long address) {
        return new hwloc_pcidev_attr_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_pcidev_attr_s createSafe(long address) {
        return address == NULL ? null : new hwloc_pcidev_attr_s(address, null);
    }

    /**
     * Create a {@link hwloc_pcidev_attr_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_pcidev_attr_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_pcidev_attr_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #domain}. */
    public static int ndomain(long struct) { return UNSAFE.getInt(null, struct + hwloc_pcidev_attr_s.DOMAIN); }
    /** Unsafe version of {@link #bus}. */
    public static byte nbus(long struct) { return UNSAFE.getByte(null, struct + hwloc_pcidev_attr_s.BUS); }
    /** Unsafe version of {@link #dev}. */
    public static byte ndev(long struct) { return UNSAFE.getByte(null, struct + hwloc_pcidev_attr_s.DEV); }
    /** Unsafe version of {@link #func}. */
    public static byte nfunc(long struct) { return UNSAFE.getByte(null, struct + hwloc_pcidev_attr_s.FUNC); }
    /** Unsafe version of {@link #prog_if}. */
    public static byte nprog_if(long struct) { return UNSAFE.getByte(null, struct + hwloc_pcidev_attr_s.PROG_IF); }
    /** Unsafe version of {@link #class_id}. */
    public static short nclass_id(long struct) { return UNSAFE.getShort(null, struct + hwloc_pcidev_attr_s.CLASS_ID); }
    /** Unsafe version of {@link #vendor_id}. */
    public static short nvendor_id(long struct) { return UNSAFE.getShort(null, struct + hwloc_pcidev_attr_s.VENDOR_ID); }
    /** Unsafe version of {@link #device_id}. */
    public static short ndevice_id(long struct) { return UNSAFE.getShort(null, struct + hwloc_pcidev_attr_s.DEVICE_ID); }
    /** Unsafe version of {@link #subvendor_id}. */
    public static short nsubvendor_id(long struct) { return UNSAFE.getShort(null, struct + hwloc_pcidev_attr_s.SUBVENDOR_ID); }
    /** Unsafe version of {@link #subdevice_id}. */
    public static short nsubdevice_id(long struct) { return UNSAFE.getShort(null, struct + hwloc_pcidev_attr_s.SUBDEVICE_ID); }
    /** Unsafe version of {@link #revision}. */
    public static byte nrevision(long struct) { return UNSAFE.getByte(null, struct + hwloc_pcidev_attr_s.REVISION); }
    /** Unsafe version of {@link #linkspeed}. */
    public static float nlinkspeed(long struct) { return UNSAFE.getFloat(null, struct + hwloc_pcidev_attr_s.LINKSPEED); }

    // -----------------------------------

    /** An array of {@link hwloc_pcidev_attr_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_pcidev_attr_s, Buffer> {

        private static final hwloc_pcidev_attr_s ELEMENT_FACTORY = hwloc_pcidev_attr_s.create(-1L);

        /**
         * Creates a new {@code hwloc_pcidev_attr_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_pcidev_attr_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_pcidev_attr_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code domain} field. */
        @NativeType("unsigned int")
        public int domain() { return hwloc_pcidev_attr_s.ndomain(address()); }
        /** @return the value of the {@code bus} field. */
        @NativeType("unsigned char")
        public byte bus() { return hwloc_pcidev_attr_s.nbus(address()); }
        /** @return the value of the {@code dev} field. */
        @NativeType("unsigned char")
        public byte dev() { return hwloc_pcidev_attr_s.ndev(address()); }
        /** @return the value of the {@code func} field. */
        @NativeType("unsigned char")
        public byte func() { return hwloc_pcidev_attr_s.nfunc(address()); }
        /** @return the value of the {@code prog_if} field. */
        @NativeType("unsigned char")
        public byte prog_if() { return hwloc_pcidev_attr_s.nprog_if(address()); }
        /** @return the value of the {@code class_id} field. */
        @NativeType("unsigned short")
        public short class_id() { return hwloc_pcidev_attr_s.nclass_id(address()); }
        /** @return the value of the {@code vendor_id} field. */
        @NativeType("unsigned short")
        public short vendor_id() { return hwloc_pcidev_attr_s.nvendor_id(address()); }
        /** @return the value of the {@code device_id} field. */
        @NativeType("unsigned short")
        public short device_id() { return hwloc_pcidev_attr_s.ndevice_id(address()); }
        /** @return the value of the {@code subvendor_id} field. */
        @NativeType("unsigned short")
        public short subvendor_id() { return hwloc_pcidev_attr_s.nsubvendor_id(address()); }
        /** @return the value of the {@code subdevice_id} field. */
        @NativeType("unsigned short")
        public short subdevice_id() { return hwloc_pcidev_attr_s.nsubdevice_id(address()); }
        /** @return the value of the {@code revision} field. */
        @NativeType("unsigned char")
        public byte revision() { return hwloc_pcidev_attr_s.nrevision(address()); }
        /** @return the value of the {@code linkspeed} field. */
        public float linkspeed() { return hwloc_pcidev_attr_s.nlinkspeed(address()); }

    }

}
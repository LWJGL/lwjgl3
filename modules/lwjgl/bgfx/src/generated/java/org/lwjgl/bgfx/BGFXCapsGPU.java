/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * GPU info.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_caps_gpu_t {
 *     uint16_t {@link #vendorId};
 *     uint16_t {@link #deviceId};
 * }</code></pre>
 */
@NativeType("struct bgfx_caps_gpu_t")
public class BGFXCapsGPU extends Struct<BGFXCapsGPU> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VENDORID,
        DEVICEID;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VENDORID = layout.offsetof(0);
        DEVICEID = layout.offsetof(1);
    }

    protected BGFXCapsGPU(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXCapsGPU create(long address, @Nullable ByteBuffer container) {
        return new BGFXCapsGPU(address, container);
    }

    /**
     * Creates a {@code BGFXCapsGPU} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXCapsGPU(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** vendor PCI id. One of:<br><table><tr><td>{@link BGFX#BGFX_PCI_ID_NONE PCI_ID_NONE}</td><td>{@link BGFX#BGFX_PCI_ID_SOFTWARE_RASTERIZER PCI_ID_SOFTWARE_RASTERIZER}</td><td>{@link BGFX#BGFX_PCI_ID_AMD PCI_ID_AMD}</td><td>{@link BGFX#BGFX_PCI_ID_APPLE PCI_ID_APPLE}</td><td>{@link BGFX#BGFX_PCI_ID_INTEL PCI_ID_INTEL}</td></tr><tr><td>{@link BGFX#BGFX_PCI_ID_NVIDIA PCI_ID_NVIDIA}</td><td>{@link BGFX#BGFX_PCI_ID_MICROSOFT PCI_ID_MICROSOFT}</td><td>{@link BGFX#BGFX_PCI_ID_ARM PCI_ID_ARM}</td></tr></table> */
    @NativeType("uint16_t")
    public short vendorId() { return nvendorId(address()); }
    /** device id */
    @NativeType("uint16_t")
    public short deviceId() { return ndeviceId(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXCapsGPU} instance for the specified memory address. */
    public static BGFXCapsGPU create(long address) {
        return new BGFXCapsGPU(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXCapsGPU createSafe(long address) {
        return address == NULL ? null : new BGFXCapsGPU(address, null);
    }

    /**
     * Create a {@link BGFXCapsGPU.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXCapsGPU.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BGFXCapsGPU.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vendorId}. */
    public static short nvendorId(long struct) { return memGetShort(struct + BGFXCapsGPU.VENDORID); }
    /** Unsafe version of {@link #deviceId}. */
    public static short ndeviceId(long struct) { return memGetShort(struct + BGFXCapsGPU.DEVICEID); }

    // -----------------------------------

    /** An array of {@link BGFXCapsGPU} structs. */
    public static class Buffer extends StructBuffer<BGFXCapsGPU, Buffer> {

        private static final BGFXCapsGPU ELEMENT_FACTORY = BGFXCapsGPU.create(-1L);

        /**
         * Creates a new {@code BGFXCapsGPU.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXCapsGPU#SIZEOF}, and its mark will be undefined.</p>
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
        protected BGFXCapsGPU getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link BGFXCapsGPU#vendorId} field. */
        @NativeType("uint16_t")
        public short vendorId() { return BGFXCapsGPU.nvendorId(address()); }
        /** @return the value of the {@link BGFXCapsGPU#deviceId} field. */
        @NativeType("uint16_t")
        public short deviceId() { return BGFXCapsGPU.ndeviceId(address()); }

    }

}
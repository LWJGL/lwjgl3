/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * GPU info.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code vendorId} &ndash; vendor PCI id. One of:<br><table><tr><td>{@link BGFX#BGFX_PCI_ID_NONE PCI_ID_NONE}</td><td>{@link BGFX#BGFX_PCI_ID_SOFTWARE_RASTERIZER PCI_ID_SOFTWARE_RASTERIZER}</td><td>{@link BGFX#BGFX_PCI_ID_AMD PCI_ID_AMD}</td><td>{@link BGFX#BGFX_PCI_ID_INTEL PCI_ID_INTEL}</td><td>{@link BGFX#BGFX_PCI_ID_NVIDIA PCI_ID_NVIDIA}</td></tr></table></li>
 * <li>{@code deviceId} &ndash; device id</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_caps_gpu_t {
 *     uint16_t vendorId;
 *     uint16_t deviceId;
 * }</pre></code>
 */
@NativeType("struct bgfx_caps_gpu_t")
public class BGFXCapsGPU extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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

    BGFXCapsGPU(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXCapsGPU} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXCapsGPU(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code vendorId} field. */
    @NativeType("uint16_t")
    public short vendorId() { return nvendorId(address()); }
    /** Returns the value of the {@code deviceId} field. */
    @NativeType("uint16_t")
    public short deviceId() { return ndeviceId(address()); }

    // -----------------------------------

    /** Returns a new {@link BGFXCapsGPU} instance for the specified memory address. */
    public static BGFXCapsGPU create(long address) {
        return new BGFXCapsGPU(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXCapsGPU createSafe(long address) {
        return address == NULL ? null : create(address);
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
    @Nullable
    public static BGFXCapsGPU.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vendorId}. */
    public static short nvendorId(long struct) { return memGetShort(struct + BGFXCapsGPU.VENDORID); }
    /** Unsafe version of {@link #deviceId}. */
    public static short ndeviceId(long struct) { return memGetShort(struct + BGFXCapsGPU.DEVICEID); }

    // -----------------------------------

    /** An array of {@link BGFXCapsGPU} structs. */
    public static class Buffer extends StructBuffer<BGFXCapsGPU, Buffer> {

        /**
         * Creates a new {@link BGFXCapsGPU.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXCapsGPU#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected BGFXCapsGPU newInstance(long address) {
            return new BGFXCapsGPU(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code vendorId} field. */
        @NativeType("uint16_t")
        public short vendorId() { return BGFXCapsGPU.nvendorId(address()); }
        /** Returns the value of the {@code deviceId} field. */
        @NativeType("uint16_t")
        public short deviceId() { return BGFXCapsGPU.ndeviceId(address()); }

    }

}
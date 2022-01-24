/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure describing the layout of the pipeline cache header.
 * 
 * <h5>Description</h5>
 * 
 * <p>Unlike most structures declared by the Vulkan API, all fields of this structure are written with the least significant byte first, regardless of host byte-order.</p>
 * 
 * <p>The C language specification does not define the packing of structure members. This layout assumes tight structure member packing, with members laid out in the order listed in the structure, and the intended size of the structure is 32 bytes. If a compiler produces code that diverges from that pattern, applications <b>must</b> employ another method to set values at the correct offsets.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code headerSize} <b>must</b> be 32</li>
 * <li>{@code headerVersion} <b>must</b> be {@link VK10#VK_PIPELINE_CACHE_HEADER_VERSION_ONE PIPELINE_CACHE_HEADER_VERSION_ONE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code headerVersion} <b>must</b> be a valid {@code VkPipelineCacheHeaderVersion} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCacheHeaderVersionOne {
 *     uint32_t {@link #headerSize};
 *     VkPipelineCacheHeaderVersion {@link #headerVersion};
 *     uint32_t {@link #vendorID};
 *     uint32_t {@link #deviceID};
 *     uint8_t {@link #pipelineCacheUUID}[VK_UUID_SIZE];
 * }</code></pre>
 */
public class VkPipelineCacheHeaderVersionOne extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADERSIZE,
        HEADERVERSION,
        VENDORID,
        DEVICEID,
        PIPELINECACHEUUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(1, VK_UUID_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADERSIZE = layout.offsetof(0);
        HEADERVERSION = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        PIPELINECACHEUUID = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineCacheHeaderVersionOne} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCacheHeaderVersionOne(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the length in bytes of the pipeline cache header. */
    @NativeType("uint32_t")
    public int headerSize() { return nheaderSize(address()); }
    /** a {@code VkPipelineCacheHeaderVersion} enum value specifying the version of the header. A consumer of the pipeline cache <b>should</b> use the cache version to interpret the remainder of the cache header. */
    @NativeType("VkPipelineCacheHeaderVersion")
    public int headerVersion() { return nheaderVersion(address()); }
    /** the {@link VkPhysicalDeviceProperties}{@code ::vendorID} of the implementation. */
    @NativeType("uint32_t")
    public int vendorID() { return nvendorID(address()); }
    /** the {@link VkPhysicalDeviceProperties}{@code ::deviceID} of the implementation. */
    @NativeType("uint32_t")
    public int deviceID() { return ndeviceID(address()); }
    /** the {@link VkPhysicalDeviceProperties}{@code ::pipelineCacheUUID} of the implementation. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineCacheUUID() { return npipelineCacheUUID(address()); }
    /** the {@link VkPhysicalDeviceProperties}{@code ::pipelineCacheUUID} of the implementation. */
    @NativeType("uint8_t")
    public byte pipelineCacheUUID(int index) { return npipelineCacheUUID(address(), index); }

    /** Sets the specified value to the {@link #headerSize} field. */
    public VkPipelineCacheHeaderVersionOne headerSize(@NativeType("uint32_t") int value) { nheaderSize(address(), value); return this; }
    /** Sets the specified value to the {@link #headerVersion} field. */
    public VkPipelineCacheHeaderVersionOne headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) { nheaderVersion(address(), value); return this; }
    /** Sets the specified value to the {@link #vendorID} field. */
    public VkPipelineCacheHeaderVersionOne vendorID(@NativeType("uint32_t") int value) { nvendorID(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceID} field. */
    public VkPipelineCacheHeaderVersionOne deviceID(@NativeType("uint32_t") int value) { ndeviceID(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #pipelineCacheUUID} field. */
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { npipelineCacheUUID(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #pipelineCacheUUID} field. */
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) { npipelineCacheUUID(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCacheHeaderVersionOne set(
        int headerSize,
        int headerVersion,
        int vendorID,
        int deviceID,
        ByteBuffer pipelineCacheUUID
    ) {
        headerSize(headerSize);
        headerVersion(headerVersion);
        vendorID(vendorID);
        deviceID(deviceID);
        pipelineCacheUUID(pipelineCacheUUID);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCacheHeaderVersionOne set(VkPipelineCacheHeaderVersionOne src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCacheHeaderVersionOne malloc() {
        return wrap(VkPipelineCacheHeaderVersionOne.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCacheHeaderVersionOne calloc() {
        return wrap(VkPipelineCacheHeaderVersionOne.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCacheHeaderVersionOne create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineCacheHeaderVersionOne.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionOne} instance for the specified memory address. */
    public static VkPipelineCacheHeaderVersionOne create(long address) {
        return wrap(VkPipelineCacheHeaderVersionOne.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCacheHeaderVersionOne createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCacheHeaderVersionOne.class, address);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineCacheHeaderVersionOne.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCacheHeaderVersionOne.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCacheHeaderVersionOne malloc(MemoryStack stack) {
        return wrap(VkPipelineCacheHeaderVersionOne.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCacheHeaderVersionOne calloc(MemoryStack stack) {
        return wrap(VkPipelineCacheHeaderVersionOne.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #headerSize}. */
    public static int nheaderSize(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCacheHeaderVersionOne.HEADERSIZE); }
    /** Unsafe version of {@link #headerVersion}. */
    public static int nheaderVersion(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCacheHeaderVersionOne.HEADERVERSION); }
    /** Unsafe version of {@link #vendorID}. */
    public static int nvendorID(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCacheHeaderVersionOne.VENDORID); }
    /** Unsafe version of {@link #deviceID}. */
    public static int ndeviceID(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCacheHeaderVersionOne.DEVICEID); }
    /** Unsafe version of {@link #pipelineCacheUUID}. */
    public static ByteBuffer npipelineCacheUUID(long struct) { return memByteBuffer(struct + VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #pipelineCacheUUID(int) pipelineCacheUUID}. */
    public static byte npipelineCacheUUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID + check(index, VK_UUID_SIZE) * 1);
    }

    /** Unsafe version of {@link #headerSize(int) headerSize}. */
    public static void nheaderSize(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCacheHeaderVersionOne.HEADERSIZE, value); }
    /** Unsafe version of {@link #headerVersion(int) headerVersion}. */
    public static void nheaderVersion(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCacheHeaderVersionOne.HEADERVERSION, value); }
    /** Unsafe version of {@link #vendorID(int) vendorID}. */
    public static void nvendorID(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCacheHeaderVersionOne.VENDORID, value); }
    /** Unsafe version of {@link #deviceID(int) deviceID}. */
    public static void ndeviceID(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCacheHeaderVersionOne.DEVICEID, value); }
    /** Unsafe version of {@link #pipelineCacheUUID(ByteBuffer) pipelineCacheUUID}. */
    public static void npipelineCacheUUID(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, VK_UUID_SIZE); }
        memCopy(memAddress(value), struct + VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID, value.remaining() * 1);
    }
    /** Unsafe version of {@link #pipelineCacheUUID(int, byte) pipelineCacheUUID}. */
    public static void npipelineCacheUUID(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID + check(index, VK_UUID_SIZE) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineCacheHeaderVersionOne} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCacheHeaderVersionOne, Buffer> implements NativeResource {

        private static final VkPipelineCacheHeaderVersionOne ELEMENT_FACTORY = VkPipelineCacheHeaderVersionOne.create(-1L);

        /**
         * Creates a new {@code VkPipelineCacheHeaderVersionOne.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCacheHeaderVersionOne#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCacheHeaderVersionOne getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineCacheHeaderVersionOne#headerSize} field. */
        @NativeType("uint32_t")
        public int headerSize() { return VkPipelineCacheHeaderVersionOne.nheaderSize(address()); }
        /** @return the value of the {@link VkPipelineCacheHeaderVersionOne#headerVersion} field. */
        @NativeType("VkPipelineCacheHeaderVersion")
        public int headerVersion() { return VkPipelineCacheHeaderVersionOne.nheaderVersion(address()); }
        /** @return the value of the {@link VkPipelineCacheHeaderVersionOne#vendorID} field. */
        @NativeType("uint32_t")
        public int vendorID() { return VkPipelineCacheHeaderVersionOne.nvendorID(address()); }
        /** @return the value of the {@link VkPipelineCacheHeaderVersionOne#deviceID} field. */
        @NativeType("uint32_t")
        public int deviceID() { return VkPipelineCacheHeaderVersionOne.ndeviceID(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPipelineCacheHeaderVersionOne#pipelineCacheUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineCacheUUID() { return VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address()); }
        /** @return the value at the specified index of the {@link VkPipelineCacheHeaderVersionOne#pipelineCacheUUID} field. */
        @NativeType("uint8_t")
        public byte pipelineCacheUUID(int index) { return VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), index); }

        /** Sets the specified value to the {@link VkPipelineCacheHeaderVersionOne#headerSize} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer headerSize(@NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.nheaderSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCacheHeaderVersionOne#headerVersion} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) { VkPipelineCacheHeaderVersionOne.nheaderVersion(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCacheHeaderVersionOne#vendorID} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer vendorID(@NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.nvendorID(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCacheHeaderVersionOne#deviceID} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer deviceID(@NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.ndeviceID(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link VkPipelineCacheHeaderVersionOne#pipelineCacheUUID} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkPipelineCacheHeaderVersionOne#pipelineCacheUUID} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) { VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), index, value); return this; }

    }

}
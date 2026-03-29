/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkDeviceFaultVendorBinaryHeaderVersionOneKHR {
 *     uint32_t headerSize;
 *     VkDeviceFaultVendorBinaryHeaderVersionKHR headerVersion;
 *     uint32_t vendorID;
 *     uint32_t deviceID;
 *     uint32_t driverVersion;
 *     uint8_t pipelineCacheUUID[VK_UUID_SIZE];
 *     uint32_t applicationNameOffset;
 *     uint32_t applicationVersion;
 *     uint32_t engineNameOffset;
 *     uint32_t engineVersion;
 *     uint32_t apiVersion;
 * }}</pre>
 */
public class VkDeviceFaultVendorBinaryHeaderVersionOneKHR extends Struct<VkDeviceFaultVendorBinaryHeaderVersionOneKHR> implements NativeResource {

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
        DRIVERVERSION,
        PIPELINECACHEUUID,
        APPLICATIONNAMEOFFSET,
        APPLICATIONVERSION,
        ENGINENAMEOFFSET,
        ENGINEVERSION,
        APIVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(1, VK_UUID_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADERSIZE = layout.offsetof(0);
        HEADERVERSION = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        DRIVERVERSION = layout.offsetof(4);
        PIPELINECACHEUUID = layout.offsetof(5);
        APPLICATIONNAMEOFFSET = layout.offsetof(6);
        APPLICATIONVERSION = layout.offsetof(7);
        ENGINENAMEOFFSET = layout.offsetof(8);
        ENGINEVERSION = layout.offsetof(9);
        APIVERSION = layout.offsetof(10);
    }

    protected VkDeviceFaultVendorBinaryHeaderVersionOneKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultVendorBinaryHeaderVersionOneKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultVendorBinaryHeaderVersionOneKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code headerSize} field. */
    @NativeType("uint32_t")
    public int headerSize() { return nheaderSize(address()); }
    /** @return the value of the {@code headerVersion} field. */
    @NativeType("VkDeviceFaultVendorBinaryHeaderVersionKHR")
    public int headerVersion() { return nheaderVersion(address()); }
    /** @return the value of the {@code vendorID} field. */
    @NativeType("uint32_t")
    public int vendorID() { return nvendorID(address()); }
    /** @return the value of the {@code deviceID} field. */
    @NativeType("uint32_t")
    public int deviceID() { return ndeviceID(address()); }
    /** @return the value of the {@code driverVersion} field. */
    @NativeType("uint32_t")
    public int driverVersion() { return ndriverVersion(address()); }
    /** @return a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineCacheUUID() { return npipelineCacheUUID(address()); }
    /** @return the value at the specified index of the {@code pipelineCacheUUID} field. */
    @NativeType("uint8_t")
    public byte pipelineCacheUUID(int index) { return npipelineCacheUUID(address(), index); }
    /** @return the value of the {@code applicationNameOffset} field. */
    @NativeType("uint32_t")
    public int applicationNameOffset() { return napplicationNameOffset(address()); }
    /** @return the value of the {@code applicationVersion} field. */
    @NativeType("uint32_t")
    public int applicationVersion() { return napplicationVersion(address()); }
    /** @return the value of the {@code engineNameOffset} field. */
    @NativeType("uint32_t")
    public int engineNameOffset() { return nengineNameOffset(address()); }
    /** @return the value of the {@code engineVersion} field. */
    @NativeType("uint32_t")
    public int engineVersion() { return nengineVersion(address()); }
    /** @return the value of the {@code apiVersion} field. */
    @NativeType("uint32_t")
    public int apiVersion() { return napiVersion(address()); }

    /** Sets the specified value to the {@code headerSize} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR headerSize(@NativeType("uint32_t") int value) { nheaderSize(address(), value); return this; }
    /** Sets the specified value to the {@code headerVersion} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR headerVersion(@NativeType("VkDeviceFaultVendorBinaryHeaderVersionKHR") int value) { nheaderVersion(address(), value); return this; }
    /** Sets the specified value to the {@code vendorID} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR vendorID(@NativeType("uint32_t") int value) { nvendorID(address(), value); return this; }
    /** Sets the specified value to the {@code deviceID} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR deviceID(@NativeType("uint32_t") int value) { ndeviceID(address(), value); return this; }
    /** Sets the specified value to the {@code driverVersion} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR driverVersion(@NativeType("uint32_t") int value) { ndriverVersion(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code pipelineCacheUUID} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { npipelineCacheUUID(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code pipelineCacheUUID} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) { npipelineCacheUUID(address(), index, value); return this; }
    /** Sets the specified value to the {@code applicationNameOffset} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR applicationNameOffset(@NativeType("uint32_t") int value) { napplicationNameOffset(address(), value); return this; }
    /** Sets the specified value to the {@code applicationVersion} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR applicationVersion(@NativeType("uint32_t") int value) { napplicationVersion(address(), value); return this; }
    /** Sets the specified value to the {@code engineNameOffset} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR engineNameOffset(@NativeType("uint32_t") int value) { nengineNameOffset(address(), value); return this; }
    /** Sets the specified value to the {@code engineVersion} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR engineVersion(@NativeType("uint32_t") int value) { nengineVersion(address(), value); return this; }
    /** Sets the specified value to the {@code apiVersion} field. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR apiVersion(@NativeType("uint32_t") int value) { napiVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR set(
        int headerSize,
        int headerVersion,
        int vendorID,
        int deviceID,
        int driverVersion,
        ByteBuffer pipelineCacheUUID,
        int applicationNameOffset,
        int applicationVersion,
        int engineNameOffset,
        int engineVersion,
        int apiVersion
    ) {
        headerSize(headerSize);
        headerVersion(headerVersion);
        vendorID(vendorID);
        deviceID(deviceID);
        driverVersion(driverVersion);
        pipelineCacheUUID(pipelineCacheUUID);
        applicationNameOffset(applicationNameOffset);
        applicationVersion(applicationVersion);
        engineNameOffset(engineNameOffset);
        engineVersion(engineVersion);
        apiVersion(apiVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceFaultVendorBinaryHeaderVersionOneKHR set(VkDeviceFaultVendorBinaryHeaderVersionOneKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR malloc() {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR calloc() {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneKHR} instance for the specified memory address. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR create(long address) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceFaultVendorBinaryHeaderVersionOneKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR malloc(MemoryStack stack) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR calloc(MemoryStack stack) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #headerSize}. */
    public static int nheaderSize(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.HEADERSIZE); }
    /** Unsafe version of {@link #headerVersion}. */
    public static int nheaderVersion(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.HEADERVERSION); }
    /** Unsafe version of {@link #vendorID}. */
    public static int nvendorID(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.VENDORID); }
    /** Unsafe version of {@link #deviceID}. */
    public static int ndeviceID(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.DEVICEID); }
    /** Unsafe version of {@link #driverVersion}. */
    public static int ndriverVersion(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.DRIVERVERSION); }
    /** Unsafe version of {@link #pipelineCacheUUID}. */
    public static ByteBuffer npipelineCacheUUID(long struct) { return memByteBuffer(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.PIPELINECACHEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #pipelineCacheUUID(int) pipelineCacheUUID}. */
    public static byte npipelineCacheUUID(long struct, int index) {
        return memGetByte(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.PIPELINECACHEUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #applicationNameOffset}. */
    public static int napplicationNameOffset(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.APPLICATIONNAMEOFFSET); }
    /** Unsafe version of {@link #applicationVersion}. */
    public static int napplicationVersion(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.APPLICATIONVERSION); }
    /** Unsafe version of {@link #engineNameOffset}. */
    public static int nengineNameOffset(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.ENGINENAMEOFFSET); }
    /** Unsafe version of {@link #engineVersion}. */
    public static int nengineVersion(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.ENGINEVERSION); }
    /** Unsafe version of {@link #apiVersion}. */
    public static int napiVersion(long struct) { return memGetInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.APIVERSION); }

    /** Unsafe version of {@link #headerSize(int) headerSize}. */
    public static void nheaderSize(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.HEADERSIZE, value); }
    /** Unsafe version of {@link #headerVersion(int) headerVersion}. */
    public static void nheaderVersion(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.HEADERVERSION, value); }
    /** Unsafe version of {@link #vendorID(int) vendorID}. */
    public static void nvendorID(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.VENDORID, value); }
    /** Unsafe version of {@link #deviceID(int) deviceID}. */
    public static void ndeviceID(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.DEVICEID, value); }
    /** Unsafe version of {@link #driverVersion(int) driverVersion}. */
    public static void ndriverVersion(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.DRIVERVERSION, value); }
    /** Unsafe version of {@link #pipelineCacheUUID(ByteBuffer) pipelineCacheUUID}. */
    public static void npipelineCacheUUID(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, VK_UUID_SIZE); }
        memCopy(memAddress(value), struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.PIPELINECACHEUUID, value.remaining() * 1);
    }
    /** Unsafe version of {@link #pipelineCacheUUID(int, byte) pipelineCacheUUID}. */
    public static void npipelineCacheUUID(long struct, int index, byte value) {
        memPutByte(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.PIPELINECACHEUUID + check(index, VK_UUID_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #applicationNameOffset(int) applicationNameOffset}. */
    public static void napplicationNameOffset(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.APPLICATIONNAMEOFFSET, value); }
    /** Unsafe version of {@link #applicationVersion(int) applicationVersion}. */
    public static void napplicationVersion(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.APPLICATIONVERSION, value); }
    /** Unsafe version of {@link #engineNameOffset(int) engineNameOffset}. */
    public static void nengineNameOffset(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.ENGINENAMEOFFSET, value); }
    /** Unsafe version of {@link #engineVersion(int) engineVersion}. */
    public static void nengineVersion(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.ENGINEVERSION, value); }
    /** Unsafe version of {@link #apiVersion(int) apiVersion}. */
    public static void napiVersion(long struct, int value) { memPutInt(struct + VkDeviceFaultVendorBinaryHeaderVersionOneKHR.APIVERSION, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultVendorBinaryHeaderVersionOneKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultVendorBinaryHeaderVersionOneKHR, Buffer> implements NativeResource {

        private static final VkDeviceFaultVendorBinaryHeaderVersionOneKHR ELEMENT_FACTORY = VkDeviceFaultVendorBinaryHeaderVersionOneKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultVendorBinaryHeaderVersionOneKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultVendorBinaryHeaderVersionOneKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code headerSize} field. */
        @NativeType("uint32_t")
        public int headerSize() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nheaderSize(address()); }
        /** @return the value of the {@code headerVersion} field. */
        @NativeType("VkDeviceFaultVendorBinaryHeaderVersionKHR")
        public int headerVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nheaderVersion(address()); }
        /** @return the value of the {@code vendorID} field. */
        @NativeType("uint32_t")
        public int vendorID() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nvendorID(address()); }
        /** @return the value of the {@code deviceID} field. */
        @NativeType("uint32_t")
        public int deviceID() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.ndeviceID(address()); }
        /** @return the value of the {@code driverVersion} field. */
        @NativeType("uint32_t")
        public int driverVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.ndriverVersion(address()); }
        /** @return a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineCacheUUID() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.npipelineCacheUUID(address()); }
        /** @return the value at the specified index of the {@code pipelineCacheUUID} field. */
        @NativeType("uint8_t")
        public byte pipelineCacheUUID(int index) { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.npipelineCacheUUID(address(), index); }
        /** @return the value of the {@code applicationNameOffset} field. */
        @NativeType("uint32_t")
        public int applicationNameOffset() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.napplicationNameOffset(address()); }
        /** @return the value of the {@code applicationVersion} field. */
        @NativeType("uint32_t")
        public int applicationVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.napplicationVersion(address()); }
        /** @return the value of the {@code engineNameOffset} field. */
        @NativeType("uint32_t")
        public int engineNameOffset() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nengineNameOffset(address()); }
        /** @return the value of the {@code engineVersion} field. */
        @NativeType("uint32_t")
        public int engineVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nengineVersion(address()); }
        /** @return the value of the {@code apiVersion} field. */
        @NativeType("uint32_t")
        public int apiVersion() { return VkDeviceFaultVendorBinaryHeaderVersionOneKHR.napiVersion(address()); }

        /** Sets the specified value to the {@code headerSize} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer headerSize(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nheaderSize(address(), value); return this; }
        /** Sets the specified value to the {@code headerVersion} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer headerVersion(@NativeType("VkDeviceFaultVendorBinaryHeaderVersionKHR") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nheaderVersion(address(), value); return this; }
        /** Sets the specified value to the {@code vendorID} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer vendorID(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nvendorID(address(), value); return this; }
        /** Sets the specified value to the {@code deviceID} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer deviceID(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.ndeviceID(address(), value); return this; }
        /** Sets the specified value to the {@code driverVersion} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer driverVersion(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.ndriverVersion(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code pipelineCacheUUID} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.npipelineCacheUUID(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code pipelineCacheUUID} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.npipelineCacheUUID(address(), index, value); return this; }
        /** Sets the specified value to the {@code applicationNameOffset} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer applicationNameOffset(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.napplicationNameOffset(address(), value); return this; }
        /** Sets the specified value to the {@code applicationVersion} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer applicationVersion(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.napplicationVersion(address(), value); return this; }
        /** Sets the specified value to the {@code engineNameOffset} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer engineNameOffset(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nengineNameOffset(address(), value); return this; }
        /** Sets the specified value to the {@code engineVersion} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer engineVersion(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.nengineVersion(address(), value); return this; }
        /** Sets the specified value to the {@code apiVersion} field. */
        public VkDeviceFaultVendorBinaryHeaderVersionOneKHR.Buffer apiVersion(@NativeType("uint32_t") int value) { VkDeviceFaultVendorBinaryHeaderVersionOneKHR.napiVersion(address(), value); return this; }

    }

}
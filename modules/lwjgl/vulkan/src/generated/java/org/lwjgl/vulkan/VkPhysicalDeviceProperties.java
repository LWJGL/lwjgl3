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
 * <pre><code>
 * struct VkPhysicalDeviceProperties {
 *     uint32_t apiVersion;
 *     uint32_t driverVersion;
 *     uint32_t vendorID;
 *     uint32_t deviceID;
 *     VkPhysicalDeviceType deviceType;
 *     char deviceName[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
 *     uint8_t pipelineCacheUUID[VK_UUID_SIZE];
 *     {@link VkPhysicalDeviceLimits VkPhysicalDeviceLimits} limits;
 *     {@link VkPhysicalDeviceSparseProperties VkPhysicalDeviceSparseProperties} sparseProperties;
 * }</code></pre>
 */
public class VkPhysicalDeviceProperties extends Struct<VkPhysicalDeviceProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        APIVERSION,
        DRIVERVERSION,
        VENDORID,
        DEVICEID,
        DEVICETYPE,
        DEVICENAME,
        PIPELINECACHEUUID,
        LIMITS,
        SPARSEPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(1, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE),
            __array(1, VK_UUID_SIZE),
            __member(VkPhysicalDeviceLimits.SIZEOF, VkPhysicalDeviceLimits.ALIGNOF),
            __member(VkPhysicalDeviceSparseProperties.SIZEOF, VkPhysicalDeviceSparseProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        APIVERSION = layout.offsetof(0);
        DRIVERVERSION = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        DEVICETYPE = layout.offsetof(4);
        DEVICENAME = layout.offsetof(5);
        PIPELINECACHEUUID = layout.offsetof(6);
        LIMITS = layout.offsetof(7);
        SPARSEPROPERTIES = layout.offsetof(8);
    }

    protected VkPhysicalDeviceProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceProperties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code apiVersion} field. */
    @NativeType("uint32_t")
    public int apiVersion() { return napiVersion(address()); }
    /** @return the value of the {@code driverVersion} field. */
    @NativeType("uint32_t")
    public int driverVersion() { return ndriverVersion(address()); }
    /** @return the value of the {@code vendorID} field. */
    @NativeType("uint32_t")
    public int vendorID() { return nvendorID(address()); }
    /** @return the value of the {@code deviceID} field. */
    @NativeType("uint32_t")
    public int deviceID() { return ndeviceID(address()); }
    /** @return the value of the {@code deviceType} field. */
    @NativeType("VkPhysicalDeviceType")
    public int deviceType() { return ndeviceType(address()); }
    /** @return a {@link ByteBuffer} view of the {@code deviceName} field. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public ByteBuffer deviceName() { return ndeviceName(address()); }
    /** @return the null-terminated string stored in the {@code deviceName} field. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public String deviceNameString() { return ndeviceNameString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineCacheUUID() { return npipelineCacheUUID(address()); }
    /** @return the value at the specified index of the {@code pipelineCacheUUID} field. */
    @NativeType("uint8_t")
    public byte pipelineCacheUUID(int index) { return npipelineCacheUUID(address(), index); }
    /** @return a {@link VkPhysicalDeviceLimits} view of the {@code limits} field. */
    public VkPhysicalDeviceLimits limits() { return nlimits(address()); }
    /** @return a {@link VkPhysicalDeviceSparseProperties} view of the {@code sparseProperties} field. */
    public VkPhysicalDeviceSparseProperties sparseProperties() { return nsparseProperties(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProperties malloc() {
        return new VkPhysicalDeviceProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProperties calloc() {
        return new VkPhysicalDeviceProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceProperties create(long address) {
        return new VkPhysicalDeviceProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceProperties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #apiVersion}. */
    public static int napiVersion(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.APIVERSION); }
    /** Unsafe version of {@link #driverVersion}. */
    public static int ndriverVersion(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.DRIVERVERSION); }
    /** Unsafe version of {@link #vendorID}. */
    public static int nvendorID(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.VENDORID); }
    /** Unsafe version of {@link #deviceID}. */
    public static int ndeviceID(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.DEVICEID); }
    /** Unsafe version of {@link #deviceType}. */
    public static int ndeviceType(long struct) { return memGetInt(struct + VkPhysicalDeviceProperties.DEVICETYPE); }
    /** Unsafe version of {@link #deviceName}. */
    public static ByteBuffer ndeviceName(long struct) { return memByteBuffer(struct + VkPhysicalDeviceProperties.DEVICENAME, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE); }
    /** Unsafe version of {@link #deviceNameString}. */
    public static String ndeviceNameString(long struct) { return memUTF8(struct + VkPhysicalDeviceProperties.DEVICENAME); }
    /** Unsafe version of {@link #pipelineCacheUUID}. */
    public static ByteBuffer npipelineCacheUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceProperties.PIPELINECACHEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #pipelineCacheUUID(int) pipelineCacheUUID}. */
    public static byte npipelineCacheUUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceProperties.PIPELINECACHEUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #limits}. */
    public static VkPhysicalDeviceLimits nlimits(long struct) { return VkPhysicalDeviceLimits.create(struct + VkPhysicalDeviceProperties.LIMITS); }
    /** Unsafe version of {@link #sparseProperties}. */
    public static VkPhysicalDeviceSparseProperties nsparseProperties(long struct) { return VkPhysicalDeviceSparseProperties.create(struct + VkPhysicalDeviceProperties.SPARSEPROPERTIES); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceProperties ELEMENT_FACTORY = VkPhysicalDeviceProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code apiVersion} field. */
        @NativeType("uint32_t")
        public int apiVersion() { return VkPhysicalDeviceProperties.napiVersion(address()); }
        /** @return the value of the {@code driverVersion} field. */
        @NativeType("uint32_t")
        public int driverVersion() { return VkPhysicalDeviceProperties.ndriverVersion(address()); }
        /** @return the value of the {@code vendorID} field. */
        @NativeType("uint32_t")
        public int vendorID() { return VkPhysicalDeviceProperties.nvendorID(address()); }
        /** @return the value of the {@code deviceID} field. */
        @NativeType("uint32_t")
        public int deviceID() { return VkPhysicalDeviceProperties.ndeviceID(address()); }
        /** @return the value of the {@code deviceType} field. */
        @NativeType("VkPhysicalDeviceType")
        public int deviceType() { return VkPhysicalDeviceProperties.ndeviceType(address()); }
        /** @return a {@link ByteBuffer} view of the {@code deviceName} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public ByteBuffer deviceName() { return VkPhysicalDeviceProperties.ndeviceName(address()); }
        /** @return the null-terminated string stored in the {@code deviceName} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public String deviceNameString() { return VkPhysicalDeviceProperties.ndeviceNameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineCacheUUID() { return VkPhysicalDeviceProperties.npipelineCacheUUID(address()); }
        /** @return the value at the specified index of the {@code pipelineCacheUUID} field. */
        @NativeType("uint8_t")
        public byte pipelineCacheUUID(int index) { return VkPhysicalDeviceProperties.npipelineCacheUUID(address(), index); }
        /** @return a {@link VkPhysicalDeviceLimits} view of the {@code limits} field. */
        public VkPhysicalDeviceLimits limits() { return VkPhysicalDeviceProperties.nlimits(address()); }
        /** @return a {@link VkPhysicalDeviceSparseProperties} view of the {@code sparseProperties} field. */
        public VkPhysicalDeviceSparseProperties sparseProperties() { return VkPhysicalDeviceProperties.nsparseProperties(address()); }

    }

}
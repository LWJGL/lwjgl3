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
 * Structure specifying physical device properties.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The value of {@code apiVersion} <b>may</b> be different than the version returned by {@link VK11#vkEnumerateInstanceVersion EnumerateInstanceVersion}; either higher or lower. In such cases, the application <b>must</b> not use functionality that exceeds the version of Vulkan associated with a given object. The {@code pApiVersion} parameter returned by {@link VK11#vkEnumerateInstanceVersion EnumerateInstanceVersion} is the version associated with a {@code VkInstance} and its children, except for a {@code VkPhysicalDevice} and its children. {@link VkPhysicalDeviceProperties}{@code ::apiVersion} is the version associated with a {@code VkPhysicalDevice} and its children.</p>
 * </div>
 * 
 * <p>The {@code vendorID} and {@code deviceID} fields are provided to allow applications to adapt to device characteristics that are not adequately exposed by other Vulkan queries.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>These <b>may</b> include performance profiles, hardware errata, or other characteristics.</p>
 * </div>
 * 
 * <p>The <em>vendor</em> identified by {@code vendorID} is the entity responsible for the most salient characteristics of the underlying implementation of the {@code VkPhysicalDevice} being queried.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>For example, in the case of a discrete GPU implementation, this <b>should</b> be the GPU chipset vendor. In the case of a hardware accelerator integrated into a system-on-chip (SoC), this <b>should</b> be the supplier of the silicon IP used to create the accelerator.</p>
 * </div>
 * 
 * <p>If the vendor has a <a target="_blank" href="https://pcisig.com/membership/member-companies">PCI vendor ID</a>, the low 16 bits of {@code vendorID} <b>must</b> contain that PCI vendor ID, and the remaining bits <b>must</b> be set to zero. Otherwise, the value returned <b>must</b> be a valid Khronos vendor ID, obtained as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#vulkan-styleguide">Vulkan Documentation and Extensions: Procedures and Conventions</a> document in the section "{@code Registering a Vendor ID with Khronos}". Khronos vendor IDs are allocated starting at 0x10000, to distinguish them from the PCI vendor ID namespace. Khronos vendor IDs are symbolically defined in the {@code VkVendorId} type.</p>
 * 
 * <p>The vendor is also responsible for the value returned in {@code deviceID}. If the implementation is driven primarily by a <a target="_blank" href="https://pcisig.com/">PCI device</a> with a <a target="_blank" href="https://pcisig.com/">PCI device ID</a>, the low 16 bits of {@code deviceID} <b>must</b> contain that PCI device ID, and the remaining bits <b>must</b> be set to zero. Otherwise, the choice of what values to return <b>may</b> be dictated by operating system or platform policies - but <b>should</b> uniquely identify both the device version and any major configuration options (for example, core count in the case of multicore devices).</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The same device ID <b>should</b> be used for all physical implementations of that device version and configuration. For example, all uses of a specific silicon IP GPU version and configuration <b>should</b> use the same device ID, even if those uses occur in different SoCs.</p>
 * </div>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceLimits}, {@link VkPhysicalDeviceProperties2}, {@link VkPhysicalDeviceSparseProperties}, {@link VK10#vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code apiVersion} &ndash; the version of Vulkan supported by the device, encoded as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#extendingvulkan-coreversions-versionnumbers">Version Numbers</a>.</li>
 * <li>{@code driverVersion} &ndash; the vendor-specified version of the driver.</li>
 * <li>{@code vendorID} &ndash; a unique identifier for the <em>vendor</em> (see below) of the physical device.</li>
 * <li>{@code deviceID} &ndash; a unique identifier for the physical device among devices available from the vendor.</li>
 * <li>{@code deviceType} &ndash; a {@code VkPhysicalDeviceType} specifying the type of device.</li>
 * <li>{@code deviceName[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]} &ndash; a null-terminated UTF-8 string containing the name of the device.</li>
 * <li>{@code pipelineCacheUUID[VK_UUID_SIZE]} &ndash; an array of size {@link VK10#VK_UUID_SIZE UUID_SIZE}, containing 8-bit values that represent a universally unique identifier for the device.</li>
 * <li>{@code limits} &ndash; the {@link VkPhysicalDeviceLimits} structure which specifies device-specific limits of the physical device. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#limits">Limits</a> for details.</li>
 * <li>{@code sparseProperties} &ndash; the {@link VkPhysicalDeviceSparseProperties} structure which specifies various sparse related properties of the physical device. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#sparsememory-physicalprops">Sparse Properties</a> for details.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
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
public class VkPhysicalDeviceProperties extends Struct implements NativeResource {

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

    /** Returns the value of the {@code apiVersion} field. */
    @NativeType("uint32_t")
    public int apiVersion() { return napiVersion(address()); }
    /** Returns the value of the {@code driverVersion} field. */
    @NativeType("uint32_t")
    public int driverVersion() { return ndriverVersion(address()); }
    /** Returns the value of the {@code vendorID} field. */
    @NativeType("uint32_t")
    public int vendorID() { return nvendorID(address()); }
    /** Returns the value of the {@code deviceID} field. */
    @NativeType("uint32_t")
    public int deviceID() { return ndeviceID(address()); }
    /** Returns the value of the {@code deviceType} field. */
    @NativeType("VkPhysicalDeviceType")
    public int deviceType() { return ndeviceType(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code deviceName} field. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public ByteBuffer deviceName() { return ndeviceName(address()); }
    /** Decodes the null-terminated string stored in the {@code deviceName} field. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public String deviceNameString() { return ndeviceNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineCacheUUID() { return npipelineCacheUUID(address()); }
    /** Returns the value at the specified index of the {@code pipelineCacheUUID} field. */
    @NativeType("uint8_t")
    public byte pipelineCacheUUID(int index) { return npipelineCacheUUID(address(), index); }
    /** Returns a {@link VkPhysicalDeviceLimits} view of the {@code limits} field. */
    public VkPhysicalDeviceLimits limits() { return nlimits(address()); }
    /** Returns a {@link VkPhysicalDeviceSparseProperties} view of the {@code sparseProperties} field. */
    public VkPhysicalDeviceSparseProperties sparseProperties() { return nsparseProperties(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProperties malloc() {
        return wrap(VkPhysicalDeviceProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProperties calloc() {
        return wrap(VkPhysicalDeviceProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceProperties create(long address) {
        return wrap(VkPhysicalDeviceProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProperties mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProperties callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #apiVersion}. */
    public static int napiVersion(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProperties.APIVERSION); }
    /** Unsafe version of {@link #driverVersion}. */
    public static int ndriverVersion(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProperties.DRIVERVERSION); }
    /** Unsafe version of {@link #vendorID}. */
    public static int nvendorID(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProperties.VENDORID); }
    /** Unsafe version of {@link #deviceID}. */
    public static int ndeviceID(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProperties.DEVICEID); }
    /** Unsafe version of {@link #deviceType}. */
    public static int ndeviceType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProperties.DEVICETYPE); }
    /** Unsafe version of {@link #deviceName}. */
    public static ByteBuffer ndeviceName(long struct) { return memByteBuffer(struct + VkPhysicalDeviceProperties.DEVICENAME, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE); }
    /** Unsafe version of {@link #deviceNameString}. */
    public static String ndeviceNameString(long struct) { return memUTF8(struct + VkPhysicalDeviceProperties.DEVICENAME); }
    /** Unsafe version of {@link #pipelineCacheUUID}. */
    public static ByteBuffer npipelineCacheUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceProperties.PIPELINECACHEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #pipelineCacheUUID(int) pipelineCacheUUID}. */
    public static byte npipelineCacheUUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceProperties.PIPELINECACHEUUID + check(index, VK_UUID_SIZE) * 1);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code apiVersion} field. */
        @NativeType("uint32_t")
        public int apiVersion() { return VkPhysicalDeviceProperties.napiVersion(address()); }
        /** Returns the value of the {@code driverVersion} field. */
        @NativeType("uint32_t")
        public int driverVersion() { return VkPhysicalDeviceProperties.ndriverVersion(address()); }
        /** Returns the value of the {@code vendorID} field. */
        @NativeType("uint32_t")
        public int vendorID() { return VkPhysicalDeviceProperties.nvendorID(address()); }
        /** Returns the value of the {@code deviceID} field. */
        @NativeType("uint32_t")
        public int deviceID() { return VkPhysicalDeviceProperties.ndeviceID(address()); }
        /** Returns the value of the {@code deviceType} field. */
        @NativeType("VkPhysicalDeviceType")
        public int deviceType() { return VkPhysicalDeviceProperties.ndeviceType(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code deviceName} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public ByteBuffer deviceName() { return VkPhysicalDeviceProperties.ndeviceName(address()); }
        /** Decodes the null-terminated string stored in the {@code deviceName} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public String deviceNameString() { return VkPhysicalDeviceProperties.ndeviceNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineCacheUUID() { return VkPhysicalDeviceProperties.npipelineCacheUUID(address()); }
        /** Returns the value at the specified index of the {@code pipelineCacheUUID} field. */
        @NativeType("uint8_t")
        public byte pipelineCacheUUID(int index) { return VkPhysicalDeviceProperties.npipelineCacheUUID(address(), index); }
        /** Returns a {@link VkPhysicalDeviceLimits} view of the {@code limits} field. */
        public VkPhysicalDeviceLimits limits() { return VkPhysicalDeviceProperties.nlimits(address()); }
        /** Returns a {@link VkPhysicalDeviceSparseProperties} view of the {@code sparseProperties} field. */
        public VkPhysicalDeviceSparseProperties sparseProperties() { return VkPhysicalDeviceProperties.nsparseProperties(address()); }

    }

}
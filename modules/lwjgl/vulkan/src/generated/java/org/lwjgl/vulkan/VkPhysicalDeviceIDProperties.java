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
 * Structure specifying IDs related to the physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceIDProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>{@code deviceUUID} <b>must</b> be immutable for a given device across instances, processes, driver APIs, driver versions, and system reboots.</p>
 * 
 * <p>Applications <b>can</b> compare the {@code driverUUID} value across instance and process boundaries, and <b>can</b> make similar queries in external APIs to determine whether they are capable of sharing memory objects and resources using them with the device.</p>
 * 
 * <p>{@code deviceUUID} and/or {@code driverUUID} <b>must</b> be used to determine whether a particular external object can be shared between driver components, where such a restriction exists as defined in the compatibility table for the particular object type:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#external-memory-handle-types-compatibility">External memory handle types compatibility</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#external-semaphore-handle-types-compatibility">External semaphore handle types compatibility</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#external-fence-handle-types-compatibility">External fence handle types compatibility</a></li>
 * </ul>
 * 
 * <p>If {@code deviceLUIDValid} is {@link VK10#VK_FALSE FALSE}, the values of {@code deviceLUID} and {@code deviceNodeMask} are undefined. If {@code deviceLUIDValid} is {@link VK10#VK_TRUE TRUE} and Vulkan is running on the Windows operating system, the contents of {@code deviceLUID} <b>can</b> be cast to an {@code LUID} object and <b>must</b> be equal to the locally unique identifier of a {@code IDXGIAdapter1} object that corresponds to {@code physicalDevice}. If {@code deviceLUIDValid} is {@link VK10#VK_TRUE TRUE}, {@code deviceNodeMask} <b>must</b> contain exactly one bit. If Vulkan is running on an operating system that supports the Direct3D 12 API and {@code physicalDevice} corresponds to an individual device in a linked device adapter, {@code deviceNodeMask} identifies the Direct3D 12 node corresponding to {@code physicalDevice}. Otherwise, {@code deviceNodeMask} <b>must</b> be 1.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Although they have identical descriptions, {@link VkPhysicalDeviceIDProperties}{@code ::deviceUUID} may differ from {@link VkPhysicalDeviceProperties2}{@code ::pipelineCacheUUID}. The former is intended to identify and correlate devices across API and driver boundaries, while the latter is used to identify a compatible device and driver combination to use when serializing and de-serializing pipeline state.</p>
 * 
 * <p>Implementations <b>should</b> return {@code deviceUUID} values which are likely to be unique even in the presence of multiple Vulkan implementations (such as a GPU driver and a software renderer; two drivers for different GPUs; or the same Vulkan driver running on two logically different devices).</p>
 * 
 * <p>Khronos' conformance testing can not guarantee that {@code deviceUUID} values are actually unique, so implementors should make their own best efforts to ensure this. In particular, hard-coded {@code deviceUUID} values, especially all-0 bits, <b>should</b> never be used.</p>
 * 
 * <p>A combination of values unique to the vendor, the driver, and the hardware environment can be used to provide a {@code deviceUUID} which is unique to a high degree of certainty. Some possible inputs to such a computation are:</p>
 * 
 * <ul>
 * <li>Information reported by {@link VK10#vkGetPhysicalDeviceProperties GetPhysicalDeviceProperties}</li>
 * <li>PCI device ID (if defined)</li>
 * <li>PCI bus ID, or similar system configuration information.</li>
 * <li>Driver binary checksums.</li>
 * </ul>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>While {@link VkPhysicalDeviceIDProperties}{@code ::deviceUUID} is specified to remain consistent across driver versions and system reboots, it is not intended to be usable as a serializable persistent identifier for a device. It may change when a device is physically added to, removed from, or moved to a different connector in a system while that system is powered down. Further, there is no reasonable way to verify with conformance testing that a given device retains the same UUID in a given system across all driver versions supported in that system. While implementations should make every effort to report consistent device UUIDs across driver versions, applications should avoid relying on the persistence of this value for uses other than identifying compatible devices for external object sharing purposes.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceIDProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint8_t {@link #deviceUUID}[VK_UUID_SIZE];
 *     uint8_t {@link #driverUUID}[VK_UUID_SIZE];
 *     uint8_t {@link #deviceLUID}[VK_LUID_SIZE];
 *     uint32_t {@link #deviceNodeMask};
 *     VkBool32 {@link #deviceLUIDValid};
 * }</code></pre>
 */
public class VkPhysicalDeviceIDProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEUUID,
        DRIVERUUID,
        DEVICELUID,
        DEVICENODEMASK,
        DEVICELUIDVALID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_UUID_SIZE),
            __array(1, VK_LUID_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEUUID = layout.offsetof(2);
        DRIVERUUID = layout.offsetof(3);
        DEVICELUID = layout.offsetof(4);
        DEVICENODEMASK = layout.offsetof(5);
        DEVICELUIDVALID = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPhysicalDeviceIDProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceIDProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the device. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer deviceUUID() { return ndeviceUUID(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the device. */
    @NativeType("uint8_t")
    public byte deviceUUID(int index) { return ndeviceUUID(address(), index); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the driver build in use by the device. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer driverUUID() { return ndriverUUID(address()); }
    /** an array of {@link VK10#VK_UUID_SIZE UUID_SIZE} {@code uint8_t} values representing a universally unique identifier for the driver build in use by the device. */
    @NativeType("uint8_t")
    public byte driverUUID(int index) { return ndriverUUID(address(), index); }
    /** an array of {@link VK10#VK_LUID_SIZE LUID_SIZE} {@code uint8_t} values representing a locally unique identifier for the device. */
    @NativeType("uint8_t[VK_LUID_SIZE]")
    public ByteBuffer deviceLUID() { return ndeviceLUID(address()); }
    /** an array of {@link VK10#VK_LUID_SIZE LUID_SIZE} {@code uint8_t} values representing a locally unique identifier for the device. */
    @NativeType("uint8_t")
    public byte deviceLUID(int index) { return ndeviceLUID(address(), index); }
    /** a {@code uint32_t} bitfield identifying the node within a linked device adapter corresponding to the device. */
    @NativeType("uint32_t")
    public int deviceNodeMask() { return ndeviceNodeMask(address()); }
    /** a boolean value that will be {@link VK10#VK_TRUE TRUE} if {@code deviceLUID} contains a valid LUID and {@code deviceNodeMask} contains a valid node mask, and {@link VK10#VK_FALSE FALSE} if they do not. */
    @NativeType("VkBool32")
    public boolean deviceLUIDValid() { return ndeviceLUIDValid(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceIDProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceIDProperties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceIDProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceIDProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceIDProperties set(VkPhysicalDeviceIDProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIDProperties malloc() {
        return wrap(VkPhysicalDeviceIDProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIDProperties calloc() {
        return wrap(VkPhysicalDeviceIDProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceIDProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceIDProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceIDProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceIDProperties create(long address) {
        return wrap(VkPhysicalDeviceIDProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceIDProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceIDProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceIDProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceIDProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceIDProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIDProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceIDProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceIDProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIDProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceIDProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIDProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIDProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceIDProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceIDProperties.PNEXT); }
    /** Unsafe version of {@link #deviceUUID}. */
    public static ByteBuffer ndeviceUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDProperties.DEVICEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #deviceUUID(int) deviceUUID}. */
    public static byte ndeviceUUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceIDProperties.DEVICEUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #driverUUID}. */
    public static ByteBuffer ndriverUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDProperties.DRIVERUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #driverUUID(int) driverUUID}. */
    public static byte ndriverUUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceIDProperties.DRIVERUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #deviceLUID}. */
    public static ByteBuffer ndeviceLUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceIDProperties.DEVICELUID, VK_LUID_SIZE); }
    /** Unsafe version of {@link #deviceLUID(int) deviceLUID}. */
    public static byte ndeviceLUID(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPhysicalDeviceIDProperties.DEVICELUID + check(index, VK_LUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #deviceNodeMask}. */
    public static int ndeviceNodeMask(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceIDProperties.DEVICENODEMASK); }
    /** Unsafe version of {@link #deviceLUIDValid}. */
    public static int ndeviceLUIDValid(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceIDProperties.DEVICELUIDVALID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceIDProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceIDProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceIDProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceIDProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceIDProperties ELEMENT_FACTORY = VkPhysicalDeviceIDProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceIDProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceIDProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceIDProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceIDProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceIDProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceIDProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceIDProperties.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceIDProperties#deviceUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer deviceUUID() { return VkPhysicalDeviceIDProperties.ndeviceUUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceIDProperties#deviceUUID} field. */
        @NativeType("uint8_t")
        public byte deviceUUID(int index) { return VkPhysicalDeviceIDProperties.ndeviceUUID(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceIDProperties#driverUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer driverUUID() { return VkPhysicalDeviceIDProperties.ndriverUUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceIDProperties#driverUUID} field. */
        @NativeType("uint8_t")
        public byte driverUUID(int index) { return VkPhysicalDeviceIDProperties.ndriverUUID(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@link VkPhysicalDeviceIDProperties#deviceLUID} field. */
        @NativeType("uint8_t[VK_LUID_SIZE]")
        public ByteBuffer deviceLUID() { return VkPhysicalDeviceIDProperties.ndeviceLUID(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceIDProperties#deviceLUID} field. */
        @NativeType("uint8_t")
        public byte deviceLUID(int index) { return VkPhysicalDeviceIDProperties.ndeviceLUID(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceIDProperties#deviceNodeMask} field. */
        @NativeType("uint32_t")
        public int deviceNodeMask() { return VkPhysicalDeviceIDProperties.ndeviceNodeMask(address()); }
        /** @return the value of the {@link VkPhysicalDeviceIDProperties#deviceLUIDValid} field. */
        @NativeType("VkBool32")
        public boolean deviceLUIDValid() { return VkPhysicalDeviceIDProperties.ndeviceLUIDValid(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceIDProperties#sType} field. */
        public VkPhysicalDeviceIDProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceIDProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES} value to the {@link VkPhysicalDeviceIDProperties#sType} field. */
        public VkPhysicalDeviceIDProperties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceIDProperties#pNext} field. */
        public VkPhysicalDeviceIDProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceIDProperties.npNext(address(), value); return this; }

    }

}
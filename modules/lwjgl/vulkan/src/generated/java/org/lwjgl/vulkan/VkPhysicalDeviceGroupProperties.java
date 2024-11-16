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
 * Structure specifying physical device group properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkEnumeratePhysicalDeviceGroups EnumeratePhysicalDeviceGroups}, {@link KHRDeviceGroupCreation#vkEnumeratePhysicalDeviceGroupsKHR EnumeratePhysicalDeviceGroupsKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceGroupProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #physicalDeviceCount};
 *     VkPhysicalDevice {@link #physicalDevices}[VK_MAX_DEVICE_GROUP_SIZE];
 *     VkBool32 {@link #subsetAllocation};
 * }</code></pre>
 */
public class VkPhysicalDeviceGroupProperties extends Struct<VkPhysicalDeviceGroupProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PHYSICALDEVICECOUNT,
        PHYSICALDEVICES,
        SUBSETALLOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(POINTER_SIZE, VK_MAX_DEVICE_GROUP_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHYSICALDEVICECOUNT = layout.offsetof(2);
        PHYSICALDEVICES = layout.offsetof(3);
        SUBSETALLOCATION = layout.offsetof(4);
    }

    protected VkPhysicalDeviceGroupProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceGroupProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceGroupProperties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceGroupProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGroupProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the number of physical devices in the group. */
    @NativeType("uint32_t")
    public int physicalDeviceCount() { return nphysicalDeviceCount(address()); }
    /** an array of {@link VK10#VK_MAX_DEVICE_GROUP_SIZE MAX_DEVICE_GROUP_SIZE} {@code VkPhysicalDevice} handles representing all physical devices in the group. The first {@code physicalDeviceCount} elements of the array will be valid. */
    @NativeType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]")
    public PointerBuffer physicalDevices() { return nphysicalDevices(address()); }
    /** an array of {@link VK10#VK_MAX_DEVICE_GROUP_SIZE MAX_DEVICE_GROUP_SIZE} {@code VkPhysicalDevice} handles representing all physical devices in the group. The first {@code physicalDeviceCount} elements of the array will be valid. */
    @NativeType("VkPhysicalDevice")
    public long physicalDevices(int index) { return nphysicalDevices(address(), index); }
    /** specifies whether logical devices created from the group support allocating device memory on a subset of devices, via the {@code deviceMask} member of the {@link VkMemoryAllocateFlagsInfo}. If this is {@link VK10#VK_FALSE FALSE}, then all device memory allocations are made across all physical devices in the group. If {@code physicalDeviceCount} is 1, then {@code subsetAllocation} <b>must</b> be {@link VK10#VK_FALSE FALSE}. */
    @NativeType("VkBool32")
    public boolean subsetAllocation() { return nsubsetAllocation(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceGroupProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceGroupProperties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceGroupProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceGroupProperties set(
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
    public VkPhysicalDeviceGroupProperties set(VkPhysicalDeviceGroupProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGroupProperties malloc() {
        return new VkPhysicalDeviceGroupProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGroupProperties calloc() {
        return new VkPhysicalDeviceGroupProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGroupProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGroupProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceGroupProperties create(long address) {
        return new VkPhysicalDeviceGroupProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceGroupProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceGroupProperties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceGroupProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceGroupProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceGroupProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceGroupProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceGroupProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceGroupProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceGroupProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceGroupProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceGroupProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceGroupProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGroupProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGroupProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGroupProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGroupProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceGroupProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGroupProperties.PNEXT); }
    /** Unsafe version of {@link #physicalDeviceCount}. */
    public static int nphysicalDeviceCount(long struct) { return memGetInt(struct + VkPhysicalDeviceGroupProperties.PHYSICALDEVICECOUNT); }
    /** Unsafe version of {@link #physicalDevices}. */
    public static PointerBuffer nphysicalDevices(long struct) { return memPointerBuffer(struct + VkPhysicalDeviceGroupProperties.PHYSICALDEVICES, nphysicalDeviceCount(struct)); }
    /** Unsafe version of {@link #physicalDevices(int) physicalDevices}. */
    public static long nphysicalDevices(long struct, int index) {
        return memGetAddress(struct + VkPhysicalDeviceGroupProperties.PHYSICALDEVICES + check(index, VK_MAX_DEVICE_GROUP_SIZE) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #subsetAllocation}. */
    public static int nsubsetAllocation(long struct) { return memGetInt(struct + VkPhysicalDeviceGroupProperties.SUBSETALLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceGroupProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceGroupProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGroupProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGroupProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceGroupProperties ELEMENT_FACTORY = VkPhysicalDeviceGroupProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGroupProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGroupProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceGroupProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceGroupProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGroupProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceGroupProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGroupProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceGroupProperties#physicalDeviceCount} field. */
        @NativeType("uint32_t")
        public int physicalDeviceCount() { return VkPhysicalDeviceGroupProperties.nphysicalDeviceCount(address()); }
        /** @return a {@link PointerBuffer} view of the {@link VkPhysicalDeviceGroupProperties#physicalDevices} field. */
        @NativeType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]")
        public PointerBuffer physicalDevices() { return VkPhysicalDeviceGroupProperties.nphysicalDevices(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceGroupProperties#physicalDevices} field. */
        @NativeType("VkPhysicalDevice")
        public long physicalDevices(int index) { return VkPhysicalDeviceGroupProperties.nphysicalDevices(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceGroupProperties#subsetAllocation} field. */
        @NativeType("VkBool32")
        public boolean subsetAllocation() { return VkPhysicalDeviceGroupProperties.nsubsetAllocation(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceGroupProperties#sType} field. */
        public VkPhysicalDeviceGroupProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGroupProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES} value to the {@link VkPhysicalDeviceGroupProperties#sType} field. */
        public VkPhysicalDeviceGroupProperties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceGroupProperties#pNext} field. */
        public VkPhysicalDeviceGroupProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGroupProperties.npNext(address(), value); return this; }

    }

}
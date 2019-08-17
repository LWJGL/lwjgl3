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
import static org.lwjgl.vulkan.VK11.*;

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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code physicalDeviceCount} &ndash; the number of physical devices in the group.</li>
 * <li>{@code physicalDevices[VK_MAX_DEVICE_GROUP_SIZE]} &ndash; an array of physical device handles representing all physical devices in the group. The first {@code physicalDeviceCount} elements of the array will be valid.</li>
 * <li>{@code subsetAllocation} &ndash; specifies whether logical devices created from the group support allocating device memory on a subset of devices, via the {@code deviceMask} member of the {@link VkMemoryAllocateFlagsInfo}. If this is {@link VK10#VK_FALSE FALSE}, then all device memory allocations are made across all physical devices in the group. If {@code physicalDeviceCount} is 1, then {@code subsetAllocation} <b>must</b> be {@link VK10#VK_FALSE FALSE}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceGroupProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t physicalDeviceCount;
 *     VkPhysicalDevice physicalDevices[VK_MAX_DEVICE_GROUP_SIZE];
 *     VkBool32 subsetAllocation;
 * }</code></pre>
 */
public class VkPhysicalDeviceGroupProperties extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code physicalDeviceCount} field. */
    @NativeType("uint32_t")
    public int physicalDeviceCount() { return nphysicalDeviceCount(address()); }
    /** Returns a {@link PointerBuffer} view of the {@code physicalDevices} field. */
    @NativeType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]")
    public PointerBuffer physicalDevices() { return nphysicalDevices(address()); }
    /** Returns the value at the specified index of the {@code physicalDevices} field. */
    @NativeType("VkPhysicalDevice")
    public long physicalDevices(int index) { return nphysicalDevices(address(), index); }
    /** Returns the value of the {@code subsetAllocation} field. */
    @NativeType("VkBool32")
    public boolean subsetAllocation() { return nsubsetAllocation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceGroupProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
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
        return wrap(VkPhysicalDeviceGroupProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGroupProperties calloc() {
        return wrap(VkPhysicalDeviceGroupProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGroupProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceGroupProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceGroupProperties create(long address) {
        return wrap(VkPhysicalDeviceGroupProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGroupProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceGroupProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceGroupProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGroupProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceGroupProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceGroupProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGroupProperties mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceGroupProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGroupProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGroupProperties callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceGroupProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGroupProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGroupProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGroupProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGroupProperties.PNEXT); }
    /** Unsafe version of {@link #physicalDeviceCount}. */
    public static int nphysicalDeviceCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGroupProperties.PHYSICALDEVICECOUNT); }
    /** Unsafe version of {@link #physicalDevices}. */
    public static PointerBuffer nphysicalDevices(long struct) { return memPointerBuffer(struct + VkPhysicalDeviceGroupProperties.PHYSICALDEVICES, VK_MAX_DEVICE_GROUP_SIZE); }
    /** Unsafe version of {@link #physicalDevices(int) physicalDevices}. */
    public static long nphysicalDevices(long struct, int index) {
        return memGetAddress(struct + VkPhysicalDeviceGroupProperties.PHYSICALDEVICES + check(index, VK_MAX_DEVICE_GROUP_SIZE) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #subsetAllocation}. */
    public static int nsubsetAllocation(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGroupProperties.SUBSETALLOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceGroupProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceGroupProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGroupProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGroupProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceGroupProperties ELEMENT_FACTORY = VkPhysicalDeviceGroupProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGroupProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGroupProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceGroupProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGroupProperties.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGroupProperties.npNext(address()); }
        /** Returns the value of the {@code physicalDeviceCount} field. */
        @NativeType("uint32_t")
        public int physicalDeviceCount() { return VkPhysicalDeviceGroupProperties.nphysicalDeviceCount(address()); }
        /** Returns a {@link PointerBuffer} view of the {@code physicalDevices} field. */
        @NativeType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]")
        public PointerBuffer physicalDevices() { return VkPhysicalDeviceGroupProperties.nphysicalDevices(address()); }
        /** Returns the value at the specified index of the {@code physicalDevices} field. */
        @NativeType("VkPhysicalDevice")
        public long physicalDevices(int index) { return VkPhysicalDeviceGroupProperties.nphysicalDevices(address(), index); }
        /** Returns the value of the {@code subsetAllocation} field. */
        @NativeType("VkBool32")
        public boolean subsetAllocation() { return VkPhysicalDeviceGroupProperties.nsubsetAllocation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceGroupProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGroupProperties.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceGroupProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGroupProperties.npNext(address(), value); return this; }

    }

}
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

/**
 * Create a logical device from multiple physical devices.
 * 
 * <h5>Description</h5>
 * 
 * <p>The elements of the {@code pPhysicalDevices} array are an ordered list of the physical devices that the logical device represents. These <b>must</b> be a subset of a single device group, and need not be in the same order as they were enumerated. The order of the physical devices in the {@code pPhysicalDevices} array determines the <em>device index</em> of each physical device, with element <code>i</code> being assigned a device index of <code>i</code>. Certain commands and structures refer to one or more physical devices by using device indices or <em>device masks</em> formed using device indices.</p>
 * 
 * <p>A logical device created without using {@link VkDeviceGroupDeviceCreateInfo}, or with {@code physicalDeviceCount} equal to zero, is equivalent to a {@code physicalDeviceCount} of one and {@code pPhysicalDevices} pointing to the {@code physicalDevice} parameter to {@link VK10#vkCreateDevice CreateDevice}. In particular, the device index of that physical device is zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each element of {@code pPhysicalDevices} <b>must</b> be unique</li>
 * <li>All elements of {@code pPhysicalDevices} <b>must</b> be in the same device group as enumerated by {@link VK11#vkEnumeratePhysicalDeviceGroups EnumeratePhysicalDeviceGroups}</li>
 * <li>If {@code physicalDeviceCount} is not 0, the {@code physicalDevice} parameter of {@link VK10#vkCreateDevice CreateDevice} <b>must</b> be an element of {@code pPhysicalDevices}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO}</li>
 * <li>If {@code physicalDeviceCount} is not 0, {@code pPhysicalDevices} <b>must</b> be a valid pointer to an array of {@code physicalDeviceCount} valid {@code VkPhysicalDevice} handles</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupDeviceCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #physicalDeviceCount};
 *     VkPhysicalDevice const * {@link #pPhysicalDevices};
 * }</code></pre>
 */
public class VkDeviceGroupDeviceCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PHYSICALDEVICECOUNT,
        PPHYSICALDEVICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHYSICALDEVICECOUNT = layout.offsetof(2);
        PPHYSICALDEVICES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDeviceGroupDeviceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupDeviceCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of elements in the {@code pPhysicalDevices} array. */
    @NativeType("uint32_t")
    public int physicalDeviceCount() { return nphysicalDeviceCount(address()); }
    /** a pointer to an array of physical device handles belonging to the same device group. */
    @Nullable
    @NativeType("VkPhysicalDevice const *")
    public PointerBuffer pPhysicalDevices() { return npPhysicalDevices(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceGroupDeviceCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO} value to the {@link #sType} field. */
    public VkDeviceGroupDeviceCreateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceGroupDeviceCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #pPhysicalDevices} field. */
    public VkDeviceGroupDeviceCreateInfo pPhysicalDevices(@Nullable @NativeType("VkPhysicalDevice const *") PointerBuffer value) { npPhysicalDevices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupDeviceCreateInfo set(
        int sType,
        long pNext,
        @Nullable PointerBuffer pPhysicalDevices
    ) {
        sType(sType);
        pNext(pNext);
        pPhysicalDevices(pPhysicalDevices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupDeviceCreateInfo set(VkDeviceGroupDeviceCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupDeviceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupDeviceCreateInfo malloc() {
        return wrap(VkDeviceGroupDeviceCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupDeviceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupDeviceCreateInfo calloc() {
        return wrap(VkDeviceGroupDeviceCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupDeviceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupDeviceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGroupDeviceCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupDeviceCreateInfo} instance for the specified memory address. */
    public static VkDeviceGroupDeviceCreateInfo create(long address) {
        return wrap(VkDeviceGroupDeviceCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupDeviceCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGroupDeviceCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGroupDeviceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupDeviceCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupDeviceCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupDeviceCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupDeviceCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupDeviceCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupDeviceCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupDeviceCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupDeviceCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupDeviceCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupDeviceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupDeviceCreateInfo malloc(MemoryStack stack) {
        return wrap(VkDeviceGroupDeviceCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGroupDeviceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupDeviceCreateInfo calloc(MemoryStack stack) {
        return wrap(VkDeviceGroupDeviceCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupDeviceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupDeviceCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupDeviceCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupDeviceCreateInfo.PNEXT); }
    /** Unsafe version of {@link #physicalDeviceCount}. */
    public static int nphysicalDeviceCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupDeviceCreateInfo.PHYSICALDEVICECOUNT); }
    /** Unsafe version of {@link #pPhysicalDevices() pPhysicalDevices}. */
    @Nullable public static PointerBuffer npPhysicalDevices(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkDeviceGroupDeviceCreateInfo.PPHYSICALDEVICES), nphysicalDeviceCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupDeviceCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupDeviceCreateInfo.PNEXT, value); }
    /** Sets the specified value to the {@code physicalDeviceCount} field of the specified {@code struct}. */
    public static void nphysicalDeviceCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupDeviceCreateInfo.PHYSICALDEVICECOUNT, value); }
    /** Unsafe version of {@link #pPhysicalDevices(PointerBuffer) pPhysicalDevices}. */
    public static void npPhysicalDevices(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkDeviceGroupDeviceCreateInfo.PPHYSICALDEVICES, memAddressSafe(value)); nphysicalDeviceCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nphysicalDeviceCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupDeviceCreateInfo.PPHYSICALDEVICES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupDeviceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupDeviceCreateInfo, Buffer> implements NativeResource {

        private static final VkDeviceGroupDeviceCreateInfo ELEMENT_FACTORY = VkDeviceGroupDeviceCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupDeviceCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupDeviceCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupDeviceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceGroupDeviceCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupDeviceCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkDeviceGroupDeviceCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupDeviceCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkDeviceGroupDeviceCreateInfo#physicalDeviceCount} field. */
        @NativeType("uint32_t")
        public int physicalDeviceCount() { return VkDeviceGroupDeviceCreateInfo.nphysicalDeviceCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkDeviceGroupDeviceCreateInfo#pPhysicalDevices} field. */
        @Nullable
        @NativeType("VkPhysicalDevice const *")
        public PointerBuffer pPhysicalDevices() { return VkDeviceGroupDeviceCreateInfo.npPhysicalDevices(address()); }

        /** Sets the specified value to the {@link VkDeviceGroupDeviceCreateInfo#sType} field. */
        public VkDeviceGroupDeviceCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupDeviceCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO} value to the {@link VkDeviceGroupDeviceCreateInfo#sType} field. */
        public VkDeviceGroupDeviceCreateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkDeviceGroupDeviceCreateInfo#pNext} field. */
        public VkDeviceGroupDeviceCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupDeviceCreateInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkDeviceGroupDeviceCreateInfo#pPhysicalDevices} field. */
        public VkDeviceGroupDeviceCreateInfo.Buffer pPhysicalDevices(@Nullable @NativeType("VkPhysicalDevice const *") PointerBuffer value) { VkDeviceGroupDeviceCreateInfo.npPhysicalDevices(address(), value); return this; }

    }

}
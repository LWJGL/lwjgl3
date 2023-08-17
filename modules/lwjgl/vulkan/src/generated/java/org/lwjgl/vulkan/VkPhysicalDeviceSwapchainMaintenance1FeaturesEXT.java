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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing whether implementation supports swapchain maintenance1 functionality.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #swapchainMaintenance1};
 * }</code></pre>
 */
public class VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT extends Struct<VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINMAINTENANCE1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINMAINTENANCE1 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(ByteBuffer container) {
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
    /**
     * indicates that the implementation supports the following:
     * 
     * <ul>
     * <li>{@link VkSwapchainPresentFenceInfoEXT}, specifying a fence that is signaled when the resources associated with a present operation <b>can</b> be safely destroyed.</li>
     * <li>{@link VkSwapchainPresentModesCreateInfoEXT} and {@link VkSwapchainPresentModeInfoEXT}, allowing the swapchain to switch present modes without a need for recreation.</li>
     * <li>{@link VkSwapchainPresentScalingCreateInfoEXT}, specifying the scaling behavior of the swapchain in presence of window resizing.</li>
     * <li>The {@link EXTSwapchainMaintenance1#VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT} flag, allowing the implementation to defer the allocation of swapchain image memory until first acquisition.</li>
     * <li>{@link EXTSwapchainMaintenance1#vkReleaseSwapchainImagesEXT ReleaseSwapchainImagesEXT}, allowing acquired swapchain images to be released without presenting them.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean swapchainMaintenance1() { return nswapchainMaintenance1(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #swapchainMaintenance1} field. */
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT swapchainMaintenance1(@NativeType("VkBool32") boolean value) { nswapchainMaintenance1(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT set(
        int sType,
        long pNext,
        boolean swapchainMaintenance1
    ) {
        sType(sType);
        pNext(pNext);
        swapchainMaintenance1(swapchainMaintenance1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT set(VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT malloc() {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT calloc() {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT create(long address) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #swapchainMaintenance1}. */
    public static int nswapchainMaintenance1(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.SWAPCHAINMAINTENANCE1); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #swapchainMaintenance1(boolean) swapchainMaintenance1}. */
    public static void nswapchainMaintenance1(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.SWAPCHAINMAINTENANCE1, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT#swapchainMaintenance1} field. */
        @NativeType("VkBool32")
        public boolean swapchainMaintenance1() { return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.nswapchainMaintenance1(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT#sType} field. */
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT} value to the {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT#sType} field. */
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT#pNext} field. */
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT#swapchainMaintenance1} field. */
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer swapchainMaintenance1(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.nswapchainMaintenance1(address(), value ? 1 : 0); return this; }

    }

}
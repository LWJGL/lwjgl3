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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 swapchainMaintenance1;
 * }}</pre>
 */
public class VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT extends VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR {

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
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchainMaintenance1} field. */
    @Override
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT swapchainMaintenance1(@NativeType("VkBool32") boolean value) { nswapchainMaintenance1(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
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
    public static @Nullable VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT createSafe(long address) {
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
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
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

    /** An array of {@link VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR.Buffer {

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
            super(container);
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
        protected VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchainMaintenance1} field. */
        @Override
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.Buffer swapchainMaintenance1(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.nswapchainMaintenance1(address(), value ? 1 : 0); return this; }

    }

}
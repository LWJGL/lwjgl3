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
 * See {@link VkPhysicalDeviceVulkanMemoryModelFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVulkanMemoryModelFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 vulkanMemoryModel;
 *     VkBool32 vulkanMemoryModelDeviceScope;
 *     VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
 * }</code></pre>
 */
public class VkPhysicalDeviceVulkanMemoryModelFeaturesKHR extends VkPhysicalDeviceVulkanMemoryModelFeatures {

    protected VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModel} field. */
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModel(@NativeType("VkBool32") boolean value) { nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModelDeviceScope} field. */
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR set(
        int sType,
        long pNext,
        boolean vulkanMemoryModel,
        boolean vulkanMemoryModelDeviceScope,
        boolean vulkanMemoryModelAvailabilityVisibilityChains
    ) {
        sType(sType);
        pNext(pNext);
        vulkanMemoryModel(vulkanMemoryModel);
        vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
        vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR set(VkPhysicalDeviceVulkanMemoryModelFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR malloc() {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR calloc() {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkanMemoryModelFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkanMemoryModelFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceVulkanMemoryModelFeatures.Buffer {

        private static final VkPhysicalDeviceVulkanMemoryModelFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkanMemoryModelFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkanMemoryModelFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModel} field. */
        @Override
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModelDeviceScope} field. */
        @Override
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
        @Override
        public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.Buffer vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkanMemoryModelFeaturesKHR.nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }

    }

}
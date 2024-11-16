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
 * See {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderZeroInitializeWorkgroupMemory;
 * }</code></pre>
 */
public class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR extends VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures {

    protected VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderZeroInitializeWorkgroupMemory} field. */
    @Override
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderZeroInitializeWorkgroupMemory
    ) {
        sType(sType);
        pNext(pNext);
        shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR set(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR malloc() {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR calloc() {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR create(long address) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer {

        private static final VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderZeroInitializeWorkgroupMemory} field. */
        @Override
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }

    }

}
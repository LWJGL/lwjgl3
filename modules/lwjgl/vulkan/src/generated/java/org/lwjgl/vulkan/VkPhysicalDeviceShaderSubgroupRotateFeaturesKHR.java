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
 * struct VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderSubgroupRotate;
 *     VkBool32 shaderSubgroupRotateClustered;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR extends VkPhysicalDeviceShaderSubgroupRotateFeatures {

    protected VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderSubgroupRotate} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSubgroupRotateClustered} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderSubgroupRotate,
        boolean shaderSubgroupRotateClustered
    ) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupRotate(shaderSubgroupRotate);
        shaderSubgroupRotateClustered(shaderSubgroupRotateClustered);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR set(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceShaderSubgroupRotateFeatures.Buffer {

        private static final VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderSubgroupRotate} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSubgroupRotateClustered} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }

    }

}
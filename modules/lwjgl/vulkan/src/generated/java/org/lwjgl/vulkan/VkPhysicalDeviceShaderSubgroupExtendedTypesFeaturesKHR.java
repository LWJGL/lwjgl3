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
 * See {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderSubgroupExtendedTypes;
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR extends VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures {

    protected VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderSubgroupExtendedTypes} field. */
    @Override
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderSubgroupExtendedTypes
    ) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupExtendedTypes(shaderSubgroupExtendedTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR set(VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer {

        private static final VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderSubgroupExtendedTypes} field. */
        @Override
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.Buffer shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR.nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }

    }

}
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
 * struct VkPhysicalDevicePipelineRobustnessFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineRobustness;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineRobustnessFeaturesEXT extends VkPhysicalDevicePipelineRobustnessFeatures {

    protected VkPhysicalDevicePipelineRobustnessFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineRobustnessFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineRobustness} field. */
    @Override
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT pipelineRobustness(@NativeType("VkBool32") boolean value) { npipelineRobustness(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT set(
        int sType,
        long pNext,
        boolean pipelineRobustness
    ) {
        sType(sType);
        pNext(pNext);
        pipelineRobustness(pipelineRobustness);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT set(VkPhysicalDevicePipelineRobustnessFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT malloc() {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT calloc() {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT create(long address) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineRobustnessFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDevicePipelineRobustnessFeatures.Buffer {

        private static final VkPhysicalDevicePipelineRobustnessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineRobustnessFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineRobustnessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineRobustnessFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineRobustnessFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineRobustness} field. */
        @Override
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer pipelineRobustness(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineRobustnessFeaturesEXT.npipelineRobustness(address(), value ? 1 : 0); return this; }

    }

}
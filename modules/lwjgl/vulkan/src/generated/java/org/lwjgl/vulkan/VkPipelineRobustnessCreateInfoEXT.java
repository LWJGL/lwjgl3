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
 * struct VkPipelineRobustnessCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineRobustnessBufferBehavior storageBuffers;
 *     VkPipelineRobustnessBufferBehavior uniformBuffers;
 *     VkPipelineRobustnessBufferBehavior vertexInputs;
 *     VkPipelineRobustnessImageBehavior images;
 * }}</pre>
 */
public class VkPipelineRobustnessCreateInfoEXT extends VkPipelineRobustnessCreateInfo {

    protected VkPipelineRobustnessCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRobustnessCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRobustnessCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineRobustnessCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRobustnessCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPipelineRobustnessCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkPipelineRobustnessCreateInfoEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPipelineRobustnessCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code storageBuffers} field. */
    @Override
    public VkPipelineRobustnessCreateInfoEXT storageBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { nstorageBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code uniformBuffers} field. */
    @Override
    public VkPipelineRobustnessCreateInfoEXT uniformBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { nuniformBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code vertexInputs} field. */
    @Override
    public VkPipelineRobustnessCreateInfoEXT vertexInputs(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { nvertexInputs(address(), value); return this; }
    /** Sets the specified value to the {@code images} field. */
    @Override
    public VkPipelineRobustnessCreateInfoEXT images(@NativeType("VkPipelineRobustnessImageBehavior") int value) { nimages(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPipelineRobustnessCreateInfoEXT set(
        int sType,
        long pNext,
        int storageBuffers,
        int uniformBuffers,
        int vertexInputs,
        int images
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffers(storageBuffers);
        uniformBuffers(uniformBuffers);
        vertexInputs(vertexInputs);
        images(images);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRobustnessCreateInfoEXT set(VkPipelineRobustnessCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRobustnessCreateInfoEXT malloc() {
        return new VkPipelineRobustnessCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRobustnessCreateInfoEXT calloc() {
        return new VkPipelineRobustnessCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRobustnessCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRobustnessCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRobustnessCreateInfoEXT create(long address) {
        return new VkPipelineRobustnessCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineRobustnessCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineRobustnessCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineRobustnessCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRobustnessCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineRobustnessCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRobustnessCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineRobustnessCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineRobustnessCreateInfoEXT} structs. */
    public static class Buffer extends VkPipelineRobustnessCreateInfo.Buffer {

        private static final VkPipelineRobustnessCreateInfoEXT ELEMENT_FACTORY = VkPipelineRobustnessCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRobustnessCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRobustnessCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineRobustnessCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPipelineRobustnessCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRobustnessCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkPipelineRobustnessCreateInfoEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPipelineRobustnessCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRobustnessCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code storageBuffers} field. */
        @Override
        public VkPipelineRobustnessCreateInfoEXT.Buffer storageBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfoEXT.nstorageBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code uniformBuffers} field. */
        @Override
        public VkPipelineRobustnessCreateInfoEXT.Buffer uniformBuffers(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfoEXT.nuniformBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code vertexInputs} field. */
        @Override
        public VkPipelineRobustnessCreateInfoEXT.Buffer vertexInputs(@NativeType("VkPipelineRobustnessBufferBehavior") int value) { VkPipelineRobustnessCreateInfoEXT.nvertexInputs(address(), value); return this; }
        /** Sets the specified value to the {@code images} field. */
        @Override
        public VkPipelineRobustnessCreateInfoEXT.Buffer images(@NativeType("VkPipelineRobustnessImageBehavior") int value) { VkPipelineRobustnessCreateInfoEXT.nimages(address(), value); return this; }

    }

}
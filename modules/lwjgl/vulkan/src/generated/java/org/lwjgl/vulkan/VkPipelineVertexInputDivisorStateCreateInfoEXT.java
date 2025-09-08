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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkPipelineVertexInputDivisorStateCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t vertexBindingDivisorCount;
 *     {@link VkVertexInputBindingDivisorDescription VkVertexInputBindingDivisorDescription} const * pVertexBindingDivisors;
 * }</code></pre>
 */
public class VkPipelineVertexInputDivisorStateCreateInfoEXT extends VkPipelineVertexInputDivisorStateCreateInfo {

    protected VkPipelineVertexInputDivisorStateCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineVertexInputDivisorStateCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescription.Buffer} to the {@code pVertexBindingDivisors} field. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) { npVertexBindingDivisors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPipelineVertexInputDivisorStateCreateInfoEXT set(
        int sType,
        long pNext,
        VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors
    ) {
        sType(sType);
        pNext(pNext);
        pVertexBindingDivisors(pVertexBindingDivisors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT set(VkPipelineVertexInputDivisorStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT malloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT calloc() {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT create(long address) {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineVertexInputDivisorStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineVertexInputDivisorStateCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineVertexInputDivisorStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineVertexInputDivisorStateCreateInfoEXT} structs. */
    public static class Buffer extends VkPipelineVertexInputDivisorStateCreateInfo.Buffer {

        private static final VkPipelineVertexInputDivisorStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineVertexInputDivisorStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineVertexInputDivisorStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineVertexInputDivisorStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineVertexInputDivisorStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescription.Buffer} to the {@code pVertexBindingDivisors} field. */
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescription const *") VkVertexInputBindingDivisorDescription.Buffer value) { VkPipelineVertexInputDivisorStateCreateInfoEXT.npVertexBindingDivisors(address(), value); return this; }

    }

}
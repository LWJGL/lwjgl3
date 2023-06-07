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
 * See {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkShaderRequiredSubgroupSizeCreateInfoEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t requiredSubgroupSize;
 * }</code></pre>
 */
public class VkShaderRequiredSubgroupSizeCreateInfoEXT extends VkPipelineShaderStageRequiredSubgroupSizeCreateInfo {

    protected VkShaderRequiredSubgroupSizeCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderRequiredSubgroupSizeCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkShaderRequiredSubgroupSizeCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderRequiredSubgroupSizeCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkShaderRequiredSubgroupSizeCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkShaderRequiredSubgroupSizeCreateInfoEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkShaderRequiredSubgroupSizeCreateInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkShaderRequiredSubgroupSizeCreateInfoEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShaderRequiredSubgroupSizeCreateInfoEXT set(VkShaderRequiredSubgroupSizeCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderRequiredSubgroupSizeCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT malloc() {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderRequiredSubgroupSizeCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT calloc() {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderRequiredSubgroupSizeCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderRequiredSubgroupSizeCreateInfoEXT} instance for the specified memory address. */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT create(long address) {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkShaderRequiredSubgroupSizeCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkShaderRequiredSubgroupSizeCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT malloc(MemoryStack stack) {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderRequiredSubgroupSizeCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT calloc(MemoryStack stack) {
        return new VkShaderRequiredSubgroupSizeCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkShaderRequiredSubgroupSizeCreateInfoEXT} structs. */
    public static class Buffer extends VkPipelineShaderStageRequiredSubgroupSizeCreateInfo.Buffer {

        private static final VkShaderRequiredSubgroupSizeCreateInfoEXT ELEMENT_FACTORY = VkShaderRequiredSubgroupSizeCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderRequiredSubgroupSizeCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderRequiredSubgroupSizeCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderRequiredSubgroupSizeCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkShaderRequiredSubgroupSizeCreateInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkShaderRequiredSubgroupSizeCreateInfoEXT.npNext(address(), value); return this; }

    }

}
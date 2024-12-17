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
 * <pre>{@code
 * struct VkBindDescriptorSetsInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderStageFlags stageFlags;
 *     VkPipelineLayout layout;
 *     uint32_t firstSet;
 *     uint32_t descriptorSetCount;
 *     VkDescriptorSet const * pDescriptorSets;
 *     uint32_t dynamicOffsetCount;
 *     uint32_t const * pDynamicOffsets;
 * }}</pre>
 */
public class VkBindDescriptorSetsInfoKHR extends VkBindDescriptorSetsInfo {

    protected VkBindDescriptorSetsInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindDescriptorSetsInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBindDescriptorSetsInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkBindDescriptorSetsInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindDescriptorSetsInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO} value to the {@code sType} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stageFlags} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code firstSet} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR firstSet(@NativeType("uint32_t") int value) { nfirstSet(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pDescriptorSets} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR pDescriptorSets(@NativeType("VkDescriptorSet const *") LongBuffer value) { npDescriptorSets(address(), value); return this; }
    /** Sets the specified value to the {@code dynamicOffsetCount} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR dynamicOffsetCount(@NativeType("uint32_t") int value) { ndynamicOffsetCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDynamicOffsets} field. */
    @Override
    public VkBindDescriptorSetsInfoKHR pDynamicOffsets(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDynamicOffsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBindDescriptorSetsInfoKHR set(
        int sType,
        long pNext,
        int stageFlags,
        long layout,
        int firstSet,
        LongBuffer pDescriptorSets,
        int dynamicOffsetCount,
        @Nullable IntBuffer pDynamicOffsets
    ) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        firstSet(firstSet);
        pDescriptorSets(pDescriptorSets);
        dynamicOffsetCount(dynamicOffsetCount);
        pDynamicOffsets(pDynamicOffsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindDescriptorSetsInfoKHR set(VkBindDescriptorSetsInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindDescriptorSetsInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindDescriptorSetsInfoKHR malloc() {
        return new VkBindDescriptorSetsInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindDescriptorSetsInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindDescriptorSetsInfoKHR calloc() {
        return new VkBindDescriptorSetsInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindDescriptorSetsInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindDescriptorSetsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindDescriptorSetsInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBindDescriptorSetsInfoKHR} instance for the specified memory address. */
    public static VkBindDescriptorSetsInfoKHR create(long address) {
        return new VkBindDescriptorSetsInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindDescriptorSetsInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkBindDescriptorSetsInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindDescriptorSetsInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindDescriptorSetsInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindDescriptorSetsInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindDescriptorSetsInfoKHR malloc(MemoryStack stack) {
        return new VkBindDescriptorSetsInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindDescriptorSetsInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindDescriptorSetsInfoKHR calloc(MemoryStack stack) {
        return new VkBindDescriptorSetsInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindDescriptorSetsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindDescriptorSetsInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindDescriptorSetsInfoKHR} structs. */
    public static class Buffer extends VkBindDescriptorSetsInfo.Buffer {

        private static final VkBindDescriptorSetsInfoKHR ELEMENT_FACTORY = VkBindDescriptorSetsInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindDescriptorSetsInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindDescriptorSetsInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindDescriptorSetsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindDescriptorSetsInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO} value to the {@code sType} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindDescriptorSetsInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stageFlags} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkBindDescriptorSetsInfoKHR.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkBindDescriptorSetsInfoKHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code firstSet} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer firstSet(@NativeType("uint32_t") int value) { VkBindDescriptorSetsInfoKHR.nfirstSet(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pDescriptorSets} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer pDescriptorSets(@NativeType("VkDescriptorSet const *") LongBuffer value) { VkBindDescriptorSetsInfoKHR.npDescriptorSets(address(), value); return this; }
        /** Sets the specified value to the {@code dynamicOffsetCount} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer dynamicOffsetCount(@NativeType("uint32_t") int value) { VkBindDescriptorSetsInfoKHR.ndynamicOffsetCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDynamicOffsets} field. */
        @Override
        public VkBindDescriptorSetsInfoKHR.Buffer pDynamicOffsets(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindDescriptorSetsInfoKHR.npDynamicOffsets(address(), value); return this; }

    }

}
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
 * struct VkPushDescriptorSetInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderStageFlags stageFlags;
 *     VkPipelineLayout layout;
 *     uint32_t set;
 *     uint32_t descriptorWriteCount;
 *     {@link VkWriteDescriptorSet VkWriteDescriptorSet} const * pDescriptorWrites;
 * }}</pre>
 */
public class VkPushDescriptorSetInfoKHR extends VkPushDescriptorSetInfo {

    protected VkPushDescriptorSetInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushDescriptorSetInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPushDescriptorSetInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPushDescriptorSetInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushDescriptorSetInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPushDescriptorSetInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO} value to the {@code sType} field. */
    @Override
    public VkPushDescriptorSetInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPushDescriptorSetInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stageFlags} field. */
    @Override
    public VkPushDescriptorSetInfoKHR stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    @Override
    public VkPushDescriptorSetInfoKHR layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    @Override
    public VkPushDescriptorSetInfoKHR set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }
    /** Sets the address of the specified {@link VkWriteDescriptorSet.Buffer} to the {@code pDescriptorWrites} field. */
    @Override
    public VkPushDescriptorSetInfoKHR pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) { npDescriptorWrites(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPushDescriptorSetInfoKHR set(
        int sType,
        long pNext,
        int stageFlags,
        long layout,
        int set,
        VkWriteDescriptorSet.Buffer pDescriptorWrites
    ) {
        sType(sType);
        pNext(pNext);
        stageFlags(stageFlags);
        layout(layout);
        set(set);
        pDescriptorWrites(pDescriptorWrites);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushDescriptorSetInfoKHR set(VkPushDescriptorSetInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetInfoKHR malloc() {
        return new VkPushDescriptorSetInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetInfoKHR calloc() {
        return new VkPushDescriptorSetInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPushDescriptorSetInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPushDescriptorSetInfoKHR} instance for the specified memory address. */
    public static VkPushDescriptorSetInfoKHR create(long address) {
        return new VkPushDescriptorSetInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushDescriptorSetInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPushDescriptorSetInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushDescriptorSetInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushDescriptorSetInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetInfoKHR malloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetInfoKHR calloc(MemoryStack stack) {
        return new VkPushDescriptorSetInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPushDescriptorSetInfoKHR} structs. */
    public static class Buffer extends VkPushDescriptorSetInfo.Buffer {

        private static final VkPushDescriptorSetInfoKHR ELEMENT_FACTORY = VkPushDescriptorSetInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPushDescriptorSetInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushDescriptorSetInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushDescriptorSetInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPushDescriptorSetInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPushDescriptorSetInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO} value to the {@code sType} field. */
        @Override
        public VkPushDescriptorSetInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPushDescriptorSetInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPushDescriptorSetInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stageFlags} field. */
        @Override
        public VkPushDescriptorSetInfoKHR.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkPushDescriptorSetInfoKHR.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        @Override
        public VkPushDescriptorSetInfoKHR.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkPushDescriptorSetInfoKHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        @Override
        public VkPushDescriptorSetInfoKHR.Buffer set(@NativeType("uint32_t") int value) { VkPushDescriptorSetInfoKHR.nset(address(), value); return this; }
        /** Sets the address of the specified {@link VkWriteDescriptorSet.Buffer} to the {@code pDescriptorWrites} field. */
        @Override
        public VkPushDescriptorSetInfoKHR.Buffer pDescriptorWrites(@NativeType("VkWriteDescriptorSet const *") VkWriteDescriptorSet.Buffer value) { VkPushDescriptorSetInfoKHR.npDescriptorWrites(address(), value); return this; }

    }

}
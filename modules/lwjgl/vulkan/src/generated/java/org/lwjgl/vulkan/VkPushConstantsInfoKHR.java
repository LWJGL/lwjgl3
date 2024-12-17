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
 * struct VkPushConstantsInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineLayout layout;
 *     VkShaderStageFlags stageFlags;
 *     uint32_t offset;
 *     uint32_t size;
 *     void const * pValues;
 * }}</pre>
 */
public class VkPushConstantsInfoKHR extends VkPushConstantsInfo {

    protected VkPushConstantsInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushConstantsInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPushConstantsInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPushConstantsInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushConstantsInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPushConstantsInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO STRUCTURE_TYPE_PUSH_CONSTANTS_INFO} value to the {@code sType} field. */
    @Override
    public VkPushConstantsInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPushConstantsInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    @Override
    public VkPushConstantsInfoKHR layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code stageFlags} field. */
    @Override
    public VkPushConstantsInfoKHR stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    @Override
    public VkPushConstantsInfoKHR offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pValues} field. */
    @Override
    public VkPushConstantsInfoKHR pValues(@NativeType("void const *") ByteBuffer value) { npValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPushConstantsInfoKHR set(
        int sType,
        long pNext,
        long layout,
        int stageFlags,
        int offset,
        ByteBuffer pValues
    ) {
        sType(sType);
        pNext(pNext);
        layout(layout);
        stageFlags(stageFlags);
        offset(offset);
        pValues(pValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushConstantsInfoKHR set(VkPushConstantsInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushConstantsInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushConstantsInfoKHR malloc() {
        return new VkPushConstantsInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantsInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushConstantsInfoKHR calloc() {
        return new VkPushConstantsInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantsInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPushConstantsInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantsInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPushConstantsInfoKHR} instance for the specified memory address. */
    public static VkPushConstantsInfoKHR create(long address) {
        return new VkPushConstantsInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushConstantsInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPushConstantsInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushConstantsInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushConstantsInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushConstantsInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantsInfoKHR malloc(MemoryStack stack) {
        return new VkPushConstantsInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushConstantsInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantsInfoKHR calloc(MemoryStack stack) {
        return new VkPushConstantsInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantsInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantsInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPushConstantsInfoKHR} structs. */
    public static class Buffer extends VkPushConstantsInfo.Buffer {

        private static final VkPushConstantsInfoKHR ELEMENT_FACTORY = VkPushConstantsInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPushConstantsInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushConstantsInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushConstantsInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPushConstantsInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPushConstantsInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO STRUCTURE_TYPE_PUSH_CONSTANTS_INFO} value to the {@code sType} field. */
        @Override
        public VkPushConstantsInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPushConstantsInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPushConstantsInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        @Override
        public VkPushConstantsInfoKHR.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkPushConstantsInfoKHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code stageFlags} field. */
        @Override
        public VkPushConstantsInfoKHR.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkPushConstantsInfoKHR.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        @Override
        public VkPushConstantsInfoKHR.Buffer offset(@NativeType("uint32_t") int value) { VkPushConstantsInfoKHR.noffset(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pValues} field. */
        @Override
        public VkPushConstantsInfoKHR.Buffer pValues(@NativeType("void const *") ByteBuffer value) { VkPushConstantsInfoKHR.npValues(address(), value); return this; }

    }

}
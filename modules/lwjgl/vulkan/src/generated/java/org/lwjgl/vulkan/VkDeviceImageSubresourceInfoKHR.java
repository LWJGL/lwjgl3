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
 * struct VkDeviceImageSubresourceInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkImageCreateInfo VkImageCreateInfo} const * pCreateInfo;
 *     {@link VkImageSubresource2 VkImageSubresource2} const * pSubresource;
 * }}</pre>
 */
public class VkDeviceImageSubresourceInfoKHR extends VkDeviceImageSubresourceInfo {

    protected VkDeviceImageSubresourceInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceImageSubresourceInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceImageSubresourceInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceImageSubresourceInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceImageSubresourceInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDeviceImageSubresourceInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO} value to the {@code sType} field. */
    @Override
    public VkDeviceImageSubresourceInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDeviceImageSubresourceInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCreateInfo} to the {@code pCreateInfo} field. */
    @Override
    public VkDeviceImageSubresourceInfoKHR pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { npCreateInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageSubresource2} to the {@code pSubresource} field. */
    @Override
    public VkDeviceImageSubresourceInfoKHR pSubresource(@NativeType("VkImageSubresource2 const *") VkImageSubresource2 value) { npSubresource(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceImageSubresourceInfoKHR set(
        int sType,
        long pNext,
        VkImageCreateInfo pCreateInfo,
        VkImageSubresource2 pSubresource
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        pSubresource(pSubresource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceImageSubresourceInfoKHR set(VkDeviceImageSubresourceInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceImageSubresourceInfoKHR malloc() {
        return new VkDeviceImageSubresourceInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceImageSubresourceInfoKHR calloc() {
        return new VkDeviceImageSubresourceInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceImageSubresourceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceImageSubresourceInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance for the specified memory address. */
    public static VkDeviceImageSubresourceInfoKHR create(long address) {
        return new VkDeviceImageSubresourceInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceImageSubresourceInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceImageSubresourceInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceImageSubresourceInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageSubresourceInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageSubresourceInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceImageSubresourceInfoKHR} structs. */
    public static class Buffer extends VkDeviceImageSubresourceInfo.Buffer {

        private static final VkDeviceImageSubresourceInfoKHR ELEMENT_FACTORY = VkDeviceImageSubresourceInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceImageSubresourceInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceImageSubresourceInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceImageSubresourceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDeviceImageSubresourceInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceImageSubresourceInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO} value to the {@code sType} field. */
        @Override
        public VkDeviceImageSubresourceInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDeviceImageSubresourceInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceImageSubresourceInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCreateInfo} to the {@code pCreateInfo} field. */
        @Override
        public VkDeviceImageSubresourceInfoKHR.Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { VkDeviceImageSubresourceInfoKHR.npCreateInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageSubresource2} to the {@code pSubresource} field. */
        @Override
        public VkDeviceImageSubresourceInfoKHR.Buffer pSubresource(@NativeType("VkImageSubresource2 const *") VkImageSubresource2 value) { VkDeviceImageSubresourceInfoKHR.npSubresource(address(), value); return this; }

    }

}
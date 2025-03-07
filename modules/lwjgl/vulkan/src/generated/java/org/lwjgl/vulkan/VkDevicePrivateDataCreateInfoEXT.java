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
 * struct VkDevicePrivateDataCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t privateDataSlotRequestCount;
 * }}</pre>
 */
public class VkDevicePrivateDataCreateInfoEXT extends VkDevicePrivateDataCreateInfo {

    protected VkDevicePrivateDataCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDevicePrivateDataCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDevicePrivateDataCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDevicePrivateDataCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDevicePrivateDataCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDevicePrivateDataCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkDevicePrivateDataCreateInfoEXT sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDevicePrivateDataCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code privateDataSlotRequestCount} field. */
    @Override
    public VkDevicePrivateDataCreateInfoEXT privateDataSlotRequestCount(@NativeType("uint32_t") int value) { nprivateDataSlotRequestCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDevicePrivateDataCreateInfoEXT set(
        int sType,
        long pNext,
        int privateDataSlotRequestCount
    ) {
        sType(sType);
        pNext(pNext);
        privateDataSlotRequestCount(privateDataSlotRequestCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDevicePrivateDataCreateInfoEXT set(VkDevicePrivateDataCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDevicePrivateDataCreateInfoEXT malloc() {
        return new VkDevicePrivateDataCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDevicePrivateDataCreateInfoEXT calloc() {
        return new VkDevicePrivateDataCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDevicePrivateDataCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDevicePrivateDataCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance for the specified memory address. */
    public static VkDevicePrivateDataCreateInfoEXT create(long address) {
        return new VkDevicePrivateDataCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDevicePrivateDataCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDevicePrivateDataCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDevicePrivateDataCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDevicePrivateDataCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDevicePrivateDataCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDevicePrivateDataCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDevicePrivateDataCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDevicePrivateDataCreateInfoEXT} structs. */
    public static class Buffer extends VkDevicePrivateDataCreateInfo.Buffer {

        private static final VkDevicePrivateDataCreateInfoEXT ELEMENT_FACTORY = VkDevicePrivateDataCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDevicePrivateDataCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDevicePrivateDataCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDevicePrivateDataCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDevicePrivateDataCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDevicePrivateDataCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkDevicePrivateDataCreateInfoEXT.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDevicePrivateDataCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDevicePrivateDataCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code privateDataSlotRequestCount} field. */
        @Override
        public VkDevicePrivateDataCreateInfoEXT.Buffer privateDataSlotRequestCount(@NativeType("uint32_t") int value) { VkDevicePrivateDataCreateInfoEXT.nprivateDataSlotRequestCount(address(), value); return this; }

    }

}
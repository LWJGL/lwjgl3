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
 * See {@link VkDevicePrivateDataCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDevicePrivateDataCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t privateDataSlotRequestCount;
 * }</code></pre>
 */
public class VkDevicePrivateDataCreateInfoEXT extends VkDevicePrivateDataCreateInfo {

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
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDevicePrivateDataCreateInfoEXT calloc() {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDevicePrivateDataCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance for the specified memory address. */
    public static VkDevicePrivateDataCreateInfoEXT create(long address) {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDevicePrivateDataCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDevicePrivateDataCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDevicePrivateDataCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDevicePrivateDataCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDevicePrivateDataCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDevicePrivateDataCreateInfoEXT} structs. */
    public static class Buffer extends VkDevicePrivateDataCreateInfo.Buffer {

        private static final VkDevicePrivateDataCreateInfoEXT ELEMENT_FACTORY = VkDevicePrivateDataCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDevicePrivateDataCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDevicePrivateDataCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
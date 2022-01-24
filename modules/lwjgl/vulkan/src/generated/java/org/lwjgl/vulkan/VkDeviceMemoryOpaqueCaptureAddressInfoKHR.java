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
 * See {@link VkDeviceMemoryOpaqueCaptureAddressInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceMemoryOpaqueCaptureAddressInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceMemory memory;
 * }</code></pre>
 */
public class VkDeviceMemoryOpaqueCaptureAddressInfoKHR extends VkDeviceMemoryOpaqueCaptureAddressInfo {

    /**
     * Creates a {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO} value to the {@code sType} field. */
    @Override
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    @Override
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR set(
        int sType,
        long pNext,
        long memory
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR set(VkDeviceMemoryOpaqueCaptureAddressInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR malloc() {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR calloc() {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance for the specified memory address. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR create(long address) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR} structs. */
    public static class Buffer extends VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer {

        private static final VkDeviceMemoryOpaqueCaptureAddressInfoKHR ELEMENT_FACTORY = VkDeviceMemoryOpaqueCaptureAddressInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceMemoryOpaqueCaptureAddressInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceMemoryOpaqueCaptureAddressInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO} value to the {@code sType} field. */
        @Override
        public VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceMemoryOpaqueCaptureAddressInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        @Override
        public VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkDeviceMemoryOpaqueCaptureAddressInfoKHR.nmemory(address(), value); return this; }

    }

}
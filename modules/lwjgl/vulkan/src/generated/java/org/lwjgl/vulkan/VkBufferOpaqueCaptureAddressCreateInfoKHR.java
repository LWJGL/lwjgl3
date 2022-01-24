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
 * See {@link VkBufferOpaqueCaptureAddressCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferOpaqueCaptureAddressCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t opaqueCaptureAddress;
 * }</code></pre>
 */
public class VkBufferOpaqueCaptureAddressCreateInfoKHR extends VkBufferOpaqueCaptureAddressCreateInfo {

    /**
     * Creates a {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferOpaqueCaptureAddressCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBufferOpaqueCaptureAddressCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkBufferOpaqueCaptureAddressCreateInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBufferOpaqueCaptureAddressCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
    @Override
    public VkBufferOpaqueCaptureAddressCreateInfoKHR opaqueCaptureAddress(@NativeType("uint64_t") long value) { nopaqueCaptureAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBufferOpaqueCaptureAddressCreateInfoKHR set(
        int sType,
        long pNext,
        long opaqueCaptureAddress
    ) {
        sType(sType);
        pNext(pNext);
        opaqueCaptureAddress(opaqueCaptureAddress);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferOpaqueCaptureAddressCreateInfoKHR set(VkBufferOpaqueCaptureAddressCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR malloc() {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR calloc() {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance for the specified memory address. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR create(long address) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBufferOpaqueCaptureAddressCreateInfoKHR} structs. */
    public static class Buffer extends VkBufferOpaqueCaptureAddressCreateInfo.Buffer {

        private static final VkBufferOpaqueCaptureAddressCreateInfoKHR ELEMENT_FACTORY = VkBufferOpaqueCaptureAddressCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferOpaqueCaptureAddressCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferOpaqueCaptureAddressCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferOpaqueCaptureAddressCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferOpaqueCaptureAddressCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
        @Override
        public VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer opaqueCaptureAddress(@NativeType("uint64_t") long value) { VkBufferOpaqueCaptureAddressCreateInfoKHR.nopaqueCaptureAddress(address(), value); return this; }

    }

}
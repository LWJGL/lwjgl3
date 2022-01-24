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
 * See {@link VkMemoryOpaqueCaptureAddressAllocateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryOpaqueCaptureAddressAllocateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t opaqueCaptureAddress;
 * }</code></pre>
 */
public class VkMemoryOpaqueCaptureAddressAllocateInfoKHR extends VkMemoryOpaqueCaptureAddressAllocateInfo {

    /**
     * Creates a {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO} value to the {@code sType} field. */
    @Override
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
    @Override
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR opaqueCaptureAddress(@NativeType("uint64_t") long value) { nopaqueCaptureAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR set(
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
    public VkMemoryOpaqueCaptureAddressAllocateInfoKHR set(VkMemoryOpaqueCaptureAddressAllocateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR malloc() {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR calloc() {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance for the specified memory address. */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR create(long address) {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkMemoryOpaqueCaptureAddressAllocateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR} structs. */
    public static class Buffer extends VkMemoryOpaqueCaptureAddressAllocateInfo.Buffer {

        private static final VkMemoryOpaqueCaptureAddressAllocateInfoKHR ELEMENT_FACTORY = VkMemoryOpaqueCaptureAddressAllocateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryOpaqueCaptureAddressAllocateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryOpaqueCaptureAddressAllocateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryOpaqueCaptureAddressAllocateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO} value to the {@code sType} field. */
        @Override
        public VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryOpaqueCaptureAddressAllocateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
        @Override
        public VkMemoryOpaqueCaptureAddressAllocateInfoKHR.Buffer opaqueCaptureAddress(@NativeType("uint64_t") long value) { VkMemoryOpaqueCaptureAddressAllocateInfoKHR.nopaqueCaptureAddress(address(), value); return this; }

    }

}
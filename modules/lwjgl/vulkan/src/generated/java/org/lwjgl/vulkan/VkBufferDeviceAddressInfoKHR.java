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
 * See {@link VkBufferDeviceAddressInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferDeviceAddressInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer buffer;
 * }</code></pre>
 */
public class VkBufferDeviceAddressInfoKHR extends VkBufferDeviceAddressInfo {

    protected VkBufferDeviceAddressInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBufferDeviceAddressInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBufferDeviceAddressInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkBufferDeviceAddressInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferDeviceAddressInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBufferDeviceAddressInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO} value to the {@code sType} field. */
    @Override
    public VkBufferDeviceAddressInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBufferDeviceAddressInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    @Override
    public VkBufferDeviceAddressInfoKHR buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBufferDeviceAddressInfoKHR set(
        int sType,
        long pNext,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferDeviceAddressInfoKHR set(VkBufferDeviceAddressInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferDeviceAddressInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfoKHR malloc() {
        return new VkBufferDeviceAddressInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfoKHR calloc() {
        return new VkBufferDeviceAddressInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferDeviceAddressInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferDeviceAddressInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfoKHR} instance for the specified memory address. */
    public static VkBufferDeviceAddressInfoKHR create(long address) {
        return new VkBufferDeviceAddressInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBufferDeviceAddressInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkBufferDeviceAddressInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBufferDeviceAddressInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBufferDeviceAddressInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfoKHR malloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfoKHR calloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBufferDeviceAddressInfoKHR} structs. */
    public static class Buffer extends VkBufferDeviceAddressInfo.Buffer {

        private static final VkBufferDeviceAddressInfoKHR ELEMENT_FACTORY = VkBufferDeviceAddressInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBufferDeviceAddressInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferDeviceAddressInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBufferDeviceAddressInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBufferDeviceAddressInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferDeviceAddressInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO} value to the {@code sType} field. */
        @Override
        public VkBufferDeviceAddressInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBufferDeviceAddressInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferDeviceAddressInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        @Override
        public VkBufferDeviceAddressInfoKHR.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferDeviceAddressInfoKHR.nbuffer(address(), value); return this; }

    }

}
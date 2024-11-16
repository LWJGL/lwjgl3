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
 * See {@link VkBindBufferMemoryDeviceGroupInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindBufferMemoryDeviceGroupInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 * }</code></pre>
 */
public class VkBindBufferMemoryDeviceGroupInfoKHR extends VkBindBufferMemoryDeviceGroupInfo {

    protected VkBindBufferMemoryDeviceGroupInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindBufferMemoryDeviceGroupInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindBufferMemoryDeviceGroupInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO} value to the {@code sType} field. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBindBufferMemoryDeviceGroupInfoKHR set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindBufferMemoryDeviceGroupInfoKHR set(VkBindBufferMemoryDeviceGroupInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR malloc() {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR calloc() {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindBufferMemoryDeviceGroupInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance for the specified memory address. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR create(long address) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindBufferMemoryDeviceGroupInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkBindBufferMemoryDeviceGroupInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryDeviceGroupInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryDeviceGroupInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryDeviceGroupInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryDeviceGroupInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR malloc(MemoryStack stack) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR calloc(MemoryStack stack) {
        return new VkBindBufferMemoryDeviceGroupInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindBufferMemoryDeviceGroupInfoKHR} structs. */
    public static class Buffer extends VkBindBufferMemoryDeviceGroupInfo.Buffer {

        private static final VkBindBufferMemoryDeviceGroupInfoKHR ELEMENT_FACTORY = VkBindBufferMemoryDeviceGroupInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindBufferMemoryDeviceGroupInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindBufferMemoryDeviceGroupInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBindBufferMemoryDeviceGroupInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindBufferMemoryDeviceGroupInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO} value to the {@code sType} field. */
        @Override
        public VkBindBufferMemoryDeviceGroupInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBindBufferMemoryDeviceGroupInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindBufferMemoryDeviceGroupInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        @Override
        public VkBindBufferMemoryDeviceGroupInfoKHR.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindBufferMemoryDeviceGroupInfoKHR.npDeviceIndices(address(), value); return this; }

    }

}
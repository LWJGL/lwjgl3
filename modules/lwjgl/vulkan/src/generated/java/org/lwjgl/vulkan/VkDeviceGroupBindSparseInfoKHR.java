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
 * See {@link VkDeviceGroupBindSparseInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupBindSparseInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t resourceDeviceIndex;
 *     uint32_t memoryDeviceIndex;
 * }</code></pre>
 */
public class VkDeviceGroupBindSparseInfoKHR extends VkDeviceGroupBindSparseInfo {

    /**
     * Creates a {@code VkDeviceGroupBindSparseInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupBindSparseInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDeviceGroupBindSparseInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO} value to the {@code sType} field. */
    @Override
    public VkDeviceGroupBindSparseInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDeviceGroupBindSparseInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code resourceDeviceIndex} field. */
    @Override
    public VkDeviceGroupBindSparseInfoKHR resourceDeviceIndex(@NativeType("uint32_t") int value) { nresourceDeviceIndex(address(), value); return this; }
    /** Sets the specified value to the {@code memoryDeviceIndex} field. */
    @Override
    public VkDeviceGroupBindSparseInfoKHR memoryDeviceIndex(@NativeType("uint32_t") int value) { nmemoryDeviceIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceGroupBindSparseInfoKHR set(
        int sType,
        long pNext,
        int resourceDeviceIndex,
        int memoryDeviceIndex
    ) {
        sType(sType);
        pNext(pNext);
        resourceDeviceIndex(resourceDeviceIndex);
        memoryDeviceIndex(memoryDeviceIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupBindSparseInfoKHR set(VkDeviceGroupBindSparseInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupBindSparseInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupBindSparseInfoKHR malloc() {
        return wrap(VkDeviceGroupBindSparseInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupBindSparseInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupBindSparseInfoKHR calloc() {
        return wrap(VkDeviceGroupBindSparseInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupBindSparseInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupBindSparseInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGroupBindSparseInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupBindSparseInfoKHR} instance for the specified memory address. */
    public static VkDeviceGroupBindSparseInfoKHR create(long address) {
        return wrap(VkDeviceGroupBindSparseInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupBindSparseInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGroupBindSparseInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupBindSparseInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupBindSparseInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupBindSparseInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGroupBindSparseInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupBindSparseInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupBindSparseInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupBindSparseInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupBindSparseInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupBindSparseInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupBindSparseInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupBindSparseInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupBindSparseInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupBindSparseInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupBindSparseInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupBindSparseInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupBindSparseInfoKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceGroupBindSparseInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGroupBindSparseInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupBindSparseInfoKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceGroupBindSparseInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupBindSparseInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupBindSparseInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupBindSparseInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupBindSparseInfoKHR} structs. */
    public static class Buffer extends VkDeviceGroupBindSparseInfo.Buffer {

        private static final VkDeviceGroupBindSparseInfoKHR ELEMENT_FACTORY = VkDeviceGroupBindSparseInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupBindSparseInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupBindSparseInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupBindSparseInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDeviceGroupBindSparseInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupBindSparseInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO} value to the {@code sType} field. */
        @Override
        public VkDeviceGroupBindSparseInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDeviceGroupBindSparseInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupBindSparseInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code resourceDeviceIndex} field. */
        @Override
        public VkDeviceGroupBindSparseInfoKHR.Buffer resourceDeviceIndex(@NativeType("uint32_t") int value) { VkDeviceGroupBindSparseInfoKHR.nresourceDeviceIndex(address(), value); return this; }
        /** Sets the specified value to the {@code memoryDeviceIndex} field. */
        @Override
        public VkDeviceGroupBindSparseInfoKHR.Buffer memoryDeviceIndex(@NativeType("uint32_t") int value) { VkDeviceGroupBindSparseInfoKHR.nmemoryDeviceIndex(address(), value); return this; }

    }

}
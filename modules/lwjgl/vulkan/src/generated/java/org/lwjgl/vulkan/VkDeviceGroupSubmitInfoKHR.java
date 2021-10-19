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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkDeviceGroupSubmitInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupSubmitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreCount;
 *     uint32_t const * pWaitSemaphoreDeviceIndices;
 *     uint32_t commandBufferCount;
 *     uint32_t const * pCommandBufferDeviceMasks;
 *     uint32_t signalSemaphoreCount;
 *     uint32_t const * pSignalSemaphoreDeviceIndices;
 * }</code></pre>
 */
public class VkDeviceGroupSubmitInfoKHR extends VkDeviceGroupSubmitInfo {

    /**
     * Creates a {@code VkDeviceGroupSubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupSubmitInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDeviceGroupSubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO} value to the {@code sType} field. */
    @Override
    public VkDeviceGroupSubmitInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDeviceGroupSubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pWaitSemaphoreDeviceIndices} field. */
    @Override
    public VkDeviceGroupSubmitInfoKHR pWaitSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npWaitSemaphoreDeviceIndices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCommandBufferDeviceMasks} field. */
    @Override
    public VkDeviceGroupSubmitInfoKHR pCommandBufferDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCommandBufferDeviceMasks(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pSignalSemaphoreDeviceIndices} field. */
    @Override
    public VkDeviceGroupSubmitInfoKHR pSignalSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npSignalSemaphoreDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceGroupSubmitInfoKHR set(
        int sType,
        long pNext,
        @Nullable IntBuffer pWaitSemaphoreDeviceIndices,
        @Nullable IntBuffer pCommandBufferDeviceMasks,
        @Nullable IntBuffer pSignalSemaphoreDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphoreDeviceIndices(pWaitSemaphoreDeviceIndices);
        pCommandBufferDeviceMasks(pCommandBufferDeviceMasks);
        pSignalSemaphoreDeviceIndices(pSignalSemaphoreDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupSubmitInfoKHR set(VkDeviceGroupSubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupSubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSubmitInfoKHR malloc() {
        return wrap(VkDeviceGroupSubmitInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSubmitInfoKHR calloc() {
        return wrap(VkDeviceGroupSubmitInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGroupSubmitInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfoKHR} instance for the specified memory address. */
    public static VkDeviceGroupSubmitInfoKHR create(long address) {
        return wrap(VkDeviceGroupSubmitInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupSubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGroupSubmitInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGroupSubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupSubmitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupSubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSubmitInfoKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceGroupSubmitInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGroupSubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSubmitInfoKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceGroupSubmitInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupSubmitInfoKHR} structs. */
    public static class Buffer extends VkDeviceGroupSubmitInfo.Buffer {

        private static final VkDeviceGroupSubmitInfoKHR ELEMENT_FACTORY = VkDeviceGroupSubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupSubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupSubmitInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDeviceGroupSubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupSubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO} value to the {@code sType} field. */
        @Override
        public VkDeviceGroupSubmitInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDeviceGroupSubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupSubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pWaitSemaphoreDeviceIndices} field. */
        @Override
        public VkDeviceGroupSubmitInfoKHR.Buffer pWaitSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfoKHR.npWaitSemaphoreDeviceIndices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCommandBufferDeviceMasks} field. */
        @Override
        public VkDeviceGroupSubmitInfoKHR.Buffer pCommandBufferDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfoKHR.npCommandBufferDeviceMasks(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pSignalSemaphoreDeviceIndices} field. */
        @Override
        public VkDeviceGroupSubmitInfoKHR.Buffer pSignalSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfoKHR.npSignalSemaphoreDeviceIndices(address(), value); return this; }

    }

}
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
        return wrap(VkBindBufferMemoryDeviceGroupInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR calloc() {
        return wrap(VkBindBufferMemoryDeviceGroupInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindBufferMemoryDeviceGroupInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance for the specified memory address. */
    public static VkBindBufferMemoryDeviceGroupInfoKHR create(long address) {
        return wrap(VkBindBufferMemoryDeviceGroupInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryDeviceGroupInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBindBufferMemoryDeviceGroupInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkBindBufferMemoryDeviceGroupInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindBufferMemoryDeviceGroupInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR calloc(MemoryStack stack) {
        return wrap(VkBindBufferMemoryDeviceGroupInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryDeviceGroupInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindBufferMemoryDeviceGroupInfoKHR} structs. */
    public static class Buffer extends VkBindBufferMemoryDeviceGroupInfo.Buffer {

        private static final VkBindBufferMemoryDeviceGroupInfoKHR ELEMENT_FACTORY = VkBindBufferMemoryDeviceGroupInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindBufferMemoryDeviceGroupInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindBufferMemoryDeviceGroupInfoKHR#SIZEOF}, and its mark will be undefined.
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
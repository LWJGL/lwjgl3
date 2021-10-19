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
 * See {@link VkBindImageMemoryDeviceGroupInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindImageMemoryDeviceGroupInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 *     uint32_t splitInstanceBindRegionCount;
 *     {@link VkRect2D VkRect2D} const * pSplitInstanceBindRegions;
 * }</code></pre>
 */
public class VkBindImageMemoryDeviceGroupInfoKHR extends VkBindImageMemoryDeviceGroupInfo {

    /**
     * Creates a {@code VkBindImageMemoryDeviceGroupInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImageMemoryDeviceGroupInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBindImageMemoryDeviceGroupInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO} value to the {@code sType} field. */
    @Override
    public VkBindImageMemoryDeviceGroupInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBindImageMemoryDeviceGroupInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    @Override
    public VkBindImageMemoryDeviceGroupInfoKHR pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSplitInstanceBindRegions} field. */
    @Override
    public VkBindImageMemoryDeviceGroupInfoKHR pSplitInstanceBindRegions(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { npSplitInstanceBindRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBindImageMemoryDeviceGroupInfoKHR set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDeviceIndices,
        @Nullable VkRect2D.Buffer pSplitInstanceBindRegions
    ) {
        sType(sType);
        pNext(pNext);
        pDeviceIndices(pDeviceIndices);
        pSplitInstanceBindRegions(pSplitInstanceBindRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindImageMemoryDeviceGroupInfoKHR set(VkBindImageMemoryDeviceGroupInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryDeviceGroupInfoKHR malloc() {
        return wrap(VkBindImageMemoryDeviceGroupInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryDeviceGroupInfoKHR calloc() {
        return wrap(VkBindImageMemoryDeviceGroupInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindImageMemoryDeviceGroupInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindImageMemoryDeviceGroupInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindImageMemoryDeviceGroupInfoKHR} instance for the specified memory address. */
    public static VkBindImageMemoryDeviceGroupInfoKHR create(long address) {
        return wrap(VkBindImageMemoryDeviceGroupInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryDeviceGroupInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBindImageMemoryDeviceGroupInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindImageMemoryDeviceGroupInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindImageMemoryDeviceGroupInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryDeviceGroupInfoKHR malloc(MemoryStack stack) {
        return wrap(VkBindImageMemoryDeviceGroupInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindImageMemoryDeviceGroupInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryDeviceGroupInfoKHR calloc(MemoryStack stack) {
        return wrap(VkBindImageMemoryDeviceGroupInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryDeviceGroupInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryDeviceGroupInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBindImageMemoryDeviceGroupInfoKHR} structs. */
    public static class Buffer extends VkBindImageMemoryDeviceGroupInfo.Buffer {

        private static final VkBindImageMemoryDeviceGroupInfoKHR ELEMENT_FACTORY = VkBindImageMemoryDeviceGroupInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindImageMemoryDeviceGroupInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImageMemoryDeviceGroupInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImageMemoryDeviceGroupInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBindImageMemoryDeviceGroupInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImageMemoryDeviceGroupInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO} value to the {@code sType} field. */
        @Override
        public VkBindImageMemoryDeviceGroupInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBindImageMemoryDeviceGroupInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindImageMemoryDeviceGroupInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        @Override
        public VkBindImageMemoryDeviceGroupInfoKHR.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindImageMemoryDeviceGroupInfoKHR.npDeviceIndices(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pSplitInstanceBindRegions} field. */
        @Override
        public VkBindImageMemoryDeviceGroupInfoKHR.Buffer pSplitInstanceBindRegions(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { VkBindImageMemoryDeviceGroupInfoKHR.npSplitInstanceBindRegions(address(), value); return this; }

    }

}
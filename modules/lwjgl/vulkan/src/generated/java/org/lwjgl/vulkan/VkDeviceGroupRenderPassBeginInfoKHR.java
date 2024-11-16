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
 * See {@link VkDeviceGroupRenderPassBeginInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupRenderPassBeginInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t deviceMask;
 *     uint32_t deviceRenderAreaCount;
 *     {@link VkRect2D VkRect2D} const * pDeviceRenderAreas;
 * }</code></pre>
 */
public class VkDeviceGroupRenderPassBeginInfoKHR extends VkDeviceGroupRenderPassBeginInfo {

    protected VkDeviceGroupRenderPassBeginInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceGroupRenderPassBeginInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceGroupRenderPassBeginInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceGroupRenderPassBeginInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupRenderPassBeginInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDeviceGroupRenderPassBeginInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO} value to the {@code sType} field. */
    @Override
    public VkDeviceGroupRenderPassBeginInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDeviceGroupRenderPassBeginInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    @Override
    public VkDeviceGroupRenderPassBeginInfoKHR deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDeviceRenderAreas} field. */
    @Override
    public VkDeviceGroupRenderPassBeginInfoKHR pDeviceRenderAreas(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { npDeviceRenderAreas(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceGroupRenderPassBeginInfoKHR set(
        int sType,
        long pNext,
        int deviceMask,
        VkRect2D.@Nullable Buffer pDeviceRenderAreas
    ) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);
        pDeviceRenderAreas(pDeviceRenderAreas);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupRenderPassBeginInfoKHR set(VkDeviceGroupRenderPassBeginInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupRenderPassBeginInfoKHR malloc() {
        return new VkDeviceGroupRenderPassBeginInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupRenderPassBeginInfoKHR calloc() {
        return new VkDeviceGroupRenderPassBeginInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupRenderPassBeginInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupRenderPassBeginInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupRenderPassBeginInfoKHR} instance for the specified memory address. */
    public static VkDeviceGroupRenderPassBeginInfoKHR create(long address) {
        return new VkDeviceGroupRenderPassBeginInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceGroupRenderPassBeginInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceGroupRenderPassBeginInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceGroupRenderPassBeginInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceGroupRenderPassBeginInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupRenderPassBeginInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupRenderPassBeginInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceGroupRenderPassBeginInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceGroupRenderPassBeginInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupRenderPassBeginInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupRenderPassBeginInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupRenderPassBeginInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupRenderPassBeginInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupRenderPassBeginInfoKHR} structs. */
    public static class Buffer extends VkDeviceGroupRenderPassBeginInfo.Buffer {

        private static final VkDeviceGroupRenderPassBeginInfoKHR ELEMENT_FACTORY = VkDeviceGroupRenderPassBeginInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupRenderPassBeginInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupRenderPassBeginInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceGroupRenderPassBeginInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDeviceGroupRenderPassBeginInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO} value to the {@code sType} field. */
        @Override
        public VkDeviceGroupRenderPassBeginInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDeviceGroupRenderPassBeginInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupRenderPassBeginInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        @Override
        public VkDeviceGroupRenderPassBeginInfoKHR.Buffer deviceMask(@NativeType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfoKHR.ndeviceMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pDeviceRenderAreas} field. */
        @Override
        public VkDeviceGroupRenderPassBeginInfoKHR.Buffer pDeviceRenderAreas(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { VkDeviceGroupRenderPassBeginInfoKHR.npDeviceRenderAreas(address(), value); return this; }

    }

}
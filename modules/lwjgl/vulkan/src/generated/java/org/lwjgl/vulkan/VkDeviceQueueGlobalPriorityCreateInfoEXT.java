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
 * See {@link VkDeviceQueueGlobalPriorityCreateInfoKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceQueueGlobalPriorityCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkQueueGlobalPriorityKHR globalPriority;
 * }</code></pre>
 */
public class VkDeviceQueueGlobalPriorityCreateInfoEXT extends VkDeviceQueueGlobalPriorityCreateInfoKHR {

    protected VkDeviceQueueGlobalPriorityCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceQueueGlobalPriorityCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceQueueGlobalPriorityCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceQueueGlobalPriorityCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDeviceQueueGlobalPriorityCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR} value to the {@code sType} field. */
    @Override
    public VkDeviceQueueGlobalPriorityCreateInfoEXT sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDeviceQueueGlobalPriorityCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code globalPriority} field. */
    @Override
    public VkDeviceQueueGlobalPriorityCreateInfoEXT globalPriority(@NativeType("VkQueueGlobalPriorityKHR") int value) { nglobalPriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDeviceQueueGlobalPriorityCreateInfoEXT set(
        int sType,
        long pNext,
        int globalPriority
    ) {
        sType(sType);
        pNext(pNext);
        globalPriority(globalPriority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceQueueGlobalPriorityCreateInfoEXT set(VkDeviceQueueGlobalPriorityCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT malloc() {
        return new VkDeviceQueueGlobalPriorityCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT calloc() {
        return new VkDeviceQueueGlobalPriorityCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceQueueGlobalPriorityCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance for the specified memory address. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT create(long address) {
        return new VkDeviceQueueGlobalPriorityCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceQueueGlobalPriorityCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceQueueGlobalPriorityCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueGlobalPriorityCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueGlobalPriorityCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueGlobalPriorityCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueGlobalPriorityCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceQueueGlobalPriorityCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceQueueGlobalPriorityCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDeviceQueueGlobalPriorityCreateInfoEXT} structs. */
    public static class Buffer extends VkDeviceQueueGlobalPriorityCreateInfoKHR.Buffer {

        private static final VkDeviceQueueGlobalPriorityCreateInfoEXT ELEMENT_FACTORY = VkDeviceQueueGlobalPriorityCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceQueueGlobalPriorityCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceQueueGlobalPriorityCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceQueueGlobalPriorityCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR} value to the {@code sType} field. */
        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDeviceQueueGlobalPriorityCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code globalPriority} field. */
        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Buffer globalPriority(@NativeType("VkQueueGlobalPriorityKHR") int value) { VkDeviceQueueGlobalPriorityCreateInfoEXT.nglobalPriority(address(), value); return this; }

    }

}
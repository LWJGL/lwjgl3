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

import static org.lwjgl.vulkan.KHRGlobalPriority.*;

/**
 * See {@link VkQueueFamilyGlobalPriorityPropertiesKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyGlobalPriorityPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t priorityCount;
 *     VkQueueGlobalPriorityKHR priorities[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR];
 * }</code></pre>
 */
public class VkQueueFamilyGlobalPriorityPropertiesEXT extends VkQueueFamilyGlobalPriorityPropertiesKHR {

    protected VkQueueFamilyGlobalPriorityPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyGlobalPriorityPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyGlobalPriorityPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyGlobalPriorityPropertiesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkQueueFamilyGlobalPriorityPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR} value to the {@code sType} field. */
    @Override
    public VkQueueFamilyGlobalPriorityPropertiesEXT sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkQueueFamilyGlobalPriorityPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code priorityCount} field. */
    @Override
    public VkQueueFamilyGlobalPriorityPropertiesEXT priorityCount(@NativeType("uint32_t") int value) { npriorityCount(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code priorities} field. */
    @Override
    public VkQueueFamilyGlobalPriorityPropertiesEXT priorities(@NativeType("VkQueueGlobalPriorityKHR[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR]") IntBuffer value) { npriorities(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code priorities} field. */
    @Override
    public VkQueueFamilyGlobalPriorityPropertiesEXT priorities(int index, @NativeType("VkQueueGlobalPriorityKHR") int value) { npriorities(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkQueueFamilyGlobalPriorityPropertiesEXT set(
        int sType,
        long pNext,
        int priorityCount,
        IntBuffer priorities
    ) {
        sType(sType);
        pNext(pNext);
        priorityCount(priorityCount);
        priorities(priorities);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueueFamilyGlobalPriorityPropertiesEXT set(VkQueueFamilyGlobalPriorityPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT malloc() {
        return new VkQueueFamilyGlobalPriorityPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT calloc() {
        return new VkQueueFamilyGlobalPriorityPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyGlobalPriorityPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance for the specified memory address. */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT create(long address) {
        return new VkQueueFamilyGlobalPriorityPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyGlobalPriorityPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyGlobalPriorityPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT malloc(MemoryStack stack) {
        return new VkQueueFamilyGlobalPriorityPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT calloc(MemoryStack stack) {
        return new VkQueueFamilyGlobalPriorityPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyGlobalPriorityPropertiesEXT} structs. */
    public static class Buffer extends VkQueueFamilyGlobalPriorityPropertiesKHR.Buffer {

        private static final VkQueueFamilyGlobalPriorityPropertiesEXT ELEMENT_FACTORY = VkQueueFamilyGlobalPriorityPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyGlobalPriorityPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyGlobalPriorityPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyGlobalPriorityPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR} value to the {@code sType} field. */
        @Override
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyGlobalPriorityPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code priorityCount} field. */
        @Override
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorityCount(@NativeType("uint32_t") int value) { VkQueueFamilyGlobalPriorityPropertiesEXT.npriorityCount(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code priorities} field. */
        @Override
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorities(@NativeType("VkQueueGlobalPriorityKHR[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR]") IntBuffer value) { VkQueueFamilyGlobalPriorityPropertiesEXT.npriorities(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code priorities} field. */
        @Override
        public VkQueueFamilyGlobalPriorityPropertiesEXT.Buffer priorities(int index, @NativeType("VkQueueGlobalPriorityKHR") int value) { VkQueueFamilyGlobalPriorityPropertiesEXT.npriorities(address(), index, value); return this; }

    }

}
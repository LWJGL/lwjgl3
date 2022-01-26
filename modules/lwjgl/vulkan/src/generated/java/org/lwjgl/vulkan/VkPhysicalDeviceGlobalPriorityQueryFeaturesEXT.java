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
 * See {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 globalPriorityQuery;
 * }</code></pre>
 */
public class VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT extends VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR {

    /**
     * Creates a {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code globalPriorityQuery} field. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT globalPriorityQuery(@NativeType("VkBool32") boolean value) { nglobalPriorityQuery(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT set(
        int sType,
        long pNext,
        boolean globalPriorityQuery
    ) {
        sType(sType);
        pNext(pNext);
        globalPriorityQuery(globalPriorityQuery);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT set(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT} structs. */
    public static class Buffer extends VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer {

        private static final VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRGlobalPriority#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer sType$Default() { return sType(KHRGlobalPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code globalPriorityQuery} field. */
        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.Buffer globalPriorityQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT.nglobalPriorityQuery(address(), value ? 1 : 0); return this; }

    }

}
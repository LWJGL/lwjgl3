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
 * <pre>{@code
 * struct VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 globalPriorityQuery;
 * }}</pre>
 */
public class VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR extends VkPhysicalDeviceGlobalPriorityQueryFeatures {

    protected VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code globalPriorityQuery} field. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR globalPriorityQuery(@NativeType("VkBool32") boolean value) { nglobalPriorityQuery(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR set(
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
    public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR set(VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR malloc() {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR calloc() {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR create(long address) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceGlobalPriorityQueryFeatures.Buffer {

        private static final VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code globalPriorityQuery} field. */
        @Override
        public VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.Buffer globalPriorityQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR.nglobalPriorityQuery(address(), value ? 1 : 0); return this; }

    }

}
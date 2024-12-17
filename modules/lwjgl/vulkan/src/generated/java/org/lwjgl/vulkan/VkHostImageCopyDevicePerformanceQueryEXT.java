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
 * struct VkHostImageCopyDevicePerformanceQueryEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 optimalDeviceAccess;
 *     VkBool32 identicalMemoryLayout;
 * }}</pre>
 */
public class VkHostImageCopyDevicePerformanceQueryEXT extends VkHostImageCopyDevicePerformanceQuery {

    protected VkHostImageCopyDevicePerformanceQueryEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHostImageCopyDevicePerformanceQueryEXT create(long address, @Nullable ByteBuffer container) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(address, container);
    }

    /**
     * Creates a {@code VkHostImageCopyDevicePerformanceQueryEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHostImageCopyDevicePerformanceQueryEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkHostImageCopyDevicePerformanceQueryEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY} value to the {@code sType} field. */
    @Override
    public VkHostImageCopyDevicePerformanceQueryEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkHostImageCopyDevicePerformanceQueryEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkHostImageCopyDevicePerformanceQueryEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHostImageCopyDevicePerformanceQueryEXT set(VkHostImageCopyDevicePerformanceQueryEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHostImageCopyDevicePerformanceQueryEXT malloc() {
        return new VkHostImageCopyDevicePerformanceQueryEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHostImageCopyDevicePerformanceQueryEXT calloc() {
        return new VkHostImageCopyDevicePerformanceQueryEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated with {@link BufferUtils}. */
    public static VkHostImageCopyDevicePerformanceQueryEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageCopyDevicePerformanceQueryEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance for the specified memory address. */
    public static VkHostImageCopyDevicePerformanceQueryEXT create(long address) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkHostImageCopyDevicePerformanceQueryEXT createSafe(long address) {
        return address == NULL ? null : new VkHostImageCopyDevicePerformanceQueryEXT(address, null);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkHostImageCopyDevicePerformanceQueryEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT malloc(MemoryStack stack) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHostImageCopyDevicePerformanceQueryEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT calloc(MemoryStack stack) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageCopyDevicePerformanceQueryEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkHostImageCopyDevicePerformanceQueryEXT} structs. */
    public static class Buffer extends VkHostImageCopyDevicePerformanceQuery.Buffer {

        private static final VkHostImageCopyDevicePerformanceQueryEXT ELEMENT_FACTORY = VkHostImageCopyDevicePerformanceQueryEXT.create(-1L);

        /**
         * Creates a new {@code VkHostImageCopyDevicePerformanceQueryEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHostImageCopyDevicePerformanceQueryEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHostImageCopyDevicePerformanceQueryEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkHostImageCopyDevicePerformanceQueryEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkHostImageCopyDevicePerformanceQueryEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY} value to the {@code sType} field. */
        @Override
        public VkHostImageCopyDevicePerformanceQueryEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkHostImageCopyDevicePerformanceQueryEXT.Buffer pNext(@NativeType("void *") long value) { VkHostImageCopyDevicePerformanceQueryEXT.npNext(address(), value); return this; }

    }

}
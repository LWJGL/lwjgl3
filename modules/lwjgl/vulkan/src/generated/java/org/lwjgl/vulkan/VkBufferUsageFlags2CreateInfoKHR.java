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
 * struct VkBufferUsageFlags2CreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBufferUsageFlags2 usage;
 * }}</pre>
 */
public class VkBufferUsageFlags2CreateInfoKHR extends VkBufferUsageFlags2CreateInfo {

    protected VkBufferUsageFlags2CreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBufferUsageFlags2CreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBufferUsageFlags2CreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkBufferUsageFlags2CreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferUsageFlags2CreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBufferUsageFlags2CreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkBufferUsageFlags2CreateInfoKHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBufferUsageFlags2CreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    @Override
    public VkBufferUsageFlags2CreateInfoKHR usage(@NativeType("VkBufferUsageFlags2") long value) { nusage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBufferUsageFlags2CreateInfoKHR set(
        int sType,
        long pNext,
        long usage
    ) {
        sType(sType);
        pNext(pNext);
        usage(usage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferUsageFlags2CreateInfoKHR set(VkBufferUsageFlags2CreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferUsageFlags2CreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferUsageFlags2CreateInfoKHR malloc() {
        return new VkBufferUsageFlags2CreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBufferUsageFlags2CreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferUsageFlags2CreateInfoKHR calloc() {
        return new VkBufferUsageFlags2CreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBufferUsageFlags2CreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferUsageFlags2CreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferUsageFlags2CreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBufferUsageFlags2CreateInfoKHR} instance for the specified memory address. */
    public static VkBufferUsageFlags2CreateInfoKHR create(long address) {
        return new VkBufferUsageFlags2CreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBufferUsageFlags2CreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkBufferUsageFlags2CreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkBufferUsageFlags2CreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferUsageFlags2CreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferUsageFlags2CreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferUsageFlags2CreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferUsageFlags2CreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferUsageFlags2CreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBufferUsageFlags2CreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferUsageFlags2CreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBufferUsageFlags2CreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBufferUsageFlags2CreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferUsageFlags2CreateInfoKHR malloc(MemoryStack stack) {
        return new VkBufferUsageFlags2CreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBufferUsageFlags2CreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferUsageFlags2CreateInfoKHR calloc(MemoryStack stack) {
        return new VkBufferUsageFlags2CreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBufferUsageFlags2CreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferUsageFlags2CreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferUsageFlags2CreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferUsageFlags2CreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBufferUsageFlags2CreateInfoKHR} structs. */
    public static class Buffer extends VkBufferUsageFlags2CreateInfo.Buffer {

        private static final VkBufferUsageFlags2CreateInfoKHR ELEMENT_FACTORY = VkBufferUsageFlags2CreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBufferUsageFlags2CreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferUsageFlags2CreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBufferUsageFlags2CreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBufferUsageFlags2CreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferUsageFlags2CreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkBufferUsageFlags2CreateInfoKHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBufferUsageFlags2CreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferUsageFlags2CreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        @Override
        public VkBufferUsageFlags2CreateInfoKHR.Buffer usage(@NativeType("VkBufferUsageFlags2") long value) { VkBufferUsageFlags2CreateInfoKHR.nusage(address(), value); return this; }

    }

}
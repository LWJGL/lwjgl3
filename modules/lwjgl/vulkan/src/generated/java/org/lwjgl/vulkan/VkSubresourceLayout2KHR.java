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
 * struct VkSubresourceLayout2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkSubresourceLayout VkSubresourceLayout} subresourceLayout;
 * }}</pre>
 */
public class VkSubresourceLayout2KHR extends VkSubresourceLayout2 {

    protected VkSubresourceLayout2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubresourceLayout2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkSubresourceLayout2KHR(address, container);
    }

    /**
     * Creates a {@code VkSubresourceLayout2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceLayout2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSubresourceLayout2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2} value to the {@code sType} field. */
    @Override
    public VkSubresourceLayout2KHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSubresourceLayout2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSubresourceLayout2KHR set(
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
    public VkSubresourceLayout2KHR set(VkSubresourceLayout2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceLayout2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2KHR malloc() {
        return new VkSubresourceLayout2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2KHR calloc() {
        return new VkSubresourceLayout2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceLayout2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceLayout2KHR} instance for the specified memory address. */
    public static VkSubresourceLayout2KHR create(long address) {
        return new VkSubresourceLayout2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubresourceLayout2KHR createSafe(long address) {
        return address == NULL ? null : new VkSubresourceLayout2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubresourceLayout2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubresourceLayout2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2KHR malloc(MemoryStack stack) {
        return new VkSubresourceLayout2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2KHR calloc(MemoryStack stack) {
        return new VkSubresourceLayout2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSubresourceLayout2KHR} structs. */
    public static class Buffer extends VkSubresourceLayout2.Buffer {

        private static final VkSubresourceLayout2KHR ELEMENT_FACTORY = VkSubresourceLayout2KHR.create(-1L);

        /**
         * Creates a new {@code VkSubresourceLayout2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceLayout2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubresourceLayout2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSubresourceLayout2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubresourceLayout2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2} value to the {@code sType} field. */
        @Override
        public VkSubresourceLayout2KHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSubresourceLayout2KHR.Buffer pNext(@NativeType("void *") long value) { VkSubresourceLayout2KHR.npNext(address(), value); return this; }

    }

}
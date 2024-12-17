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
 * struct VkImageSubresource2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkImageSubresource VkImageSubresource} imageSubresource;
 * }}</pre>
 */
public class VkImageSubresource2KHR extends VkImageSubresource2 {

    protected VkImageSubresource2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageSubresource2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkImageSubresource2KHR(address, container);
    }

    /**
     * Creates a {@code VkImageSubresource2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSubresource2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImageSubresource2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2} value to the {@code sType} field. */
    @Override
    public VkImageSubresource2KHR sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImageSubresource2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresource} to the {@code imageSubresource} field. */
    @Override
    public VkImageSubresource2KHR imageSubresource(VkImageSubresource value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageSubresource2KHR imageSubresource(java.util.function.Consumer<VkImageSubresource> consumer) { consumer.accept(imageSubresource()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkImageSubresource2KHR set(
        int sType,
        long pNext,
        VkImageSubresource imageSubresource
    ) {
        sType(sType);
        pNext(pNext);
        imageSubresource(imageSubresource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSubresource2KHR set(VkImageSubresource2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSubresource2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSubresource2KHR malloc() {
        return new VkImageSubresource2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageSubresource2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSubresource2KHR calloc() {
        return new VkImageSubresource2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageSubresource2KHR} instance allocated with {@link BufferUtils}. */
    public static VkImageSubresource2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresource2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkImageSubresource2KHR} instance for the specified memory address. */
    public static VkImageSubresource2KHR create(long address) {
        return new VkImageSubresource2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageSubresource2KHR createSafe(long address) {
        return address == NULL ? null : new VkImageSubresource2KHR(address, null);
    }

    /**
     * Returns a new {@link VkImageSubresource2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageSubresource2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageSubresource2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageSubresource2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource2KHR malloc(MemoryStack stack) {
        return new VkImageSubresource2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageSubresource2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource2KHR calloc(MemoryStack stack) {
        return new VkImageSubresource2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageSubresource2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkImageSubresource2KHR} structs. */
    public static class Buffer extends VkImageSubresource2.Buffer {

        private static final VkImageSubresource2KHR ELEMENT_FACTORY = VkImageSubresource2KHR.create(-1L);

        /**
         * Creates a new {@code VkImageSubresource2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSubresource2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageSubresource2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImageSubresource2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageSubresource2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2} value to the {@code sType} field. */
        @Override
        public VkImageSubresource2KHR.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImageSubresource2KHR.Buffer pNext(@NativeType("void *") long value) { VkImageSubresource2KHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresource} to the {@code imageSubresource} field. */
        @Override
        public VkImageSubresource2KHR.Buffer imageSubresource(VkImageSubresource value) { VkImageSubresource2KHR.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageSubresource2KHR.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresource> consumer) { consumer.accept(imageSubresource()); return this; }

    }

}
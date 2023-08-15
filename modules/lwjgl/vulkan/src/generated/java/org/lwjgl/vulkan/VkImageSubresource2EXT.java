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
 * See {@link VkImageSubresource2KHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageSubresource2EXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkImageSubresource VkImageSubresource} imageSubresource;
 * }</code></pre>
 */
public class VkImageSubresource2EXT extends VkImageSubresource2KHR {

    protected VkImageSubresource2EXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageSubresource2EXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageSubresource2EXT(address, container);
    }

    /**
     * Creates a {@code VkImageSubresource2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSubresource2EXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImageSubresource2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR} value to the {@code sType} field. */
    @Override
    public VkImageSubresource2EXT sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImageSubresource2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresource} to the {@code imageSubresource} field. */
    @Override
    public VkImageSubresource2EXT imageSubresource(VkImageSubresource value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageSubresource2EXT imageSubresource(java.util.function.Consumer<VkImageSubresource> consumer) { consumer.accept(imageSubresource()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkImageSubresource2EXT set(
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
    public VkImageSubresource2EXT set(VkImageSubresource2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSubresource2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSubresource2EXT malloc() {
        return new VkImageSubresource2EXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageSubresource2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSubresource2EXT calloc() {
        return new VkImageSubresource2EXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageSubresource2EXT} instance allocated with {@link BufferUtils}. */
    public static VkImageSubresource2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageSubresource2EXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageSubresource2EXT} instance for the specified memory address. */
    public static VkImageSubresource2EXT create(long address) {
        return new VkImageSubresource2EXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSubresource2EXT createSafe(long address) {
        return address == NULL ? null : new VkImageSubresource2EXT(address, null);
    }

    /**
     * Returns a new {@link VkImageSubresource2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2EXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2EXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageSubresource2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2EXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSubresource2EXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageSubresource2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource2EXT malloc(MemoryStack stack) {
        return new VkImageSubresource2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageSubresource2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresource2EXT calloc(MemoryStack stack) {
        return new VkImageSubresource2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageSubresource2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresource2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresource2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkImageSubresource2EXT} structs. */
    public static class Buffer extends VkImageSubresource2KHR.Buffer {

        private static final VkImageSubresource2EXT ELEMENT_FACTORY = VkImageSubresource2EXT.create(-1L);

        /**
         * Creates a new {@code VkImageSubresource2EXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSubresource2EXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageSubresource2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImageSubresource2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageSubresource2EXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR} value to the {@code sType} field. */
        @Override
        public VkImageSubresource2EXT.Buffer sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImageSubresource2EXT.Buffer pNext(@NativeType("void *") long value) { VkImageSubresource2EXT.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresource} to the {@code imageSubresource} field. */
        @Override
        public VkImageSubresource2EXT.Buffer imageSubresource(VkImageSubresource value) { VkImageSubresource2EXT.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageSubresource2EXT.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresource> consumer) { consumer.accept(imageSubresource()); return this; }

    }

}
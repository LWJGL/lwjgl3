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
 * See {@link VkSubresourceLayout2KHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubresourceLayout2EXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkSubresourceLayout VkSubresourceLayout} subresourceLayout;
 * }</code></pre>
 */
public class VkSubresourceLayout2EXT extends VkSubresourceLayout2KHR {

    protected VkSubresourceLayout2EXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubresourceLayout2EXT create(long address, @Nullable ByteBuffer container) {
        return new VkSubresourceLayout2EXT(address, container);
    }

    /**
     * Creates a {@code VkSubresourceLayout2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceLayout2EXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSubresourceLayout2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR} value to the {@code sType} field. */
    @Override
    public VkSubresourceLayout2EXT sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSubresourceLayout2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSubresourceLayout2EXT set(
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
    public VkSubresourceLayout2EXT set(VkSubresourceLayout2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceLayout2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2EXT malloc() {
        return new VkSubresourceLayout2EXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout2EXT calloc() {
        return new VkSubresourceLayout2EXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout2EXT} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceLayout2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout2EXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceLayout2EXT} instance for the specified memory address. */
    public static VkSubresourceLayout2EXT create(long address) {
        return new VkSubresourceLayout2EXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceLayout2EXT createSafe(long address) {
        return address == NULL ? null : new VkSubresourceLayout2EXT(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubresourceLayout2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceLayout2EXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2EXT malloc(MemoryStack stack) {
        return new VkSubresourceLayout2EXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubresourceLayout2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout2EXT calloc(MemoryStack stack) {
        return new VkSubresourceLayout2EXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSubresourceLayout2EXT} structs. */
    public static class Buffer extends VkSubresourceLayout2KHR.Buffer {

        private static final VkSubresourceLayout2EXT ELEMENT_FACTORY = VkSubresourceLayout2EXT.create(-1L);

        /**
         * Creates a new {@code VkSubresourceLayout2EXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceLayout2EXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubresourceLayout2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSubresourceLayout2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSubresourceLayout2EXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR} value to the {@code sType} field. */
        @Override
        public VkSubresourceLayout2EXT.Buffer sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSubresourceLayout2EXT.Buffer pNext(@NativeType("void *") long value) { VkSubresourceLayout2EXT.npNext(address(), value); return this; }

    }

}
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
 * struct VkHostImageLayoutTransitionInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage image;
 *     VkImageLayout oldLayout;
 *     VkImageLayout newLayout;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }}</pre>
 */
public class VkHostImageLayoutTransitionInfoEXT extends VkHostImageLayoutTransitionInfo {

    protected VkHostImageLayoutTransitionInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHostImageLayoutTransitionInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkHostImageLayoutTransitionInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkHostImageLayoutTransitionInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHostImageLayoutTransitionInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO} value to the {@code sType} field. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code oldLayout} field. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@code newLayout} field. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkHostImageLayoutTransitionInfoEXT set(
        int sType,
        long pNext,
        long image,
        int oldLayout,
        int newLayout,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        oldLayout(oldLayout);
        newLayout(newLayout);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHostImageLayoutTransitionInfoEXT set(VkHostImageLayoutTransitionInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHostImageLayoutTransitionInfoEXT malloc() {
        return new VkHostImageLayoutTransitionInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHostImageLayoutTransitionInfoEXT calloc() {
        return new VkHostImageLayoutTransitionInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkHostImageLayoutTransitionInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageLayoutTransitionInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance for the specified memory address. */
    public static VkHostImageLayoutTransitionInfoEXT create(long address) {
        return new VkHostImageLayoutTransitionInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkHostImageLayoutTransitionInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkHostImageLayoutTransitionInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkHostImageLayoutTransitionInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageLayoutTransitionInfoEXT malloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageLayoutTransitionInfoEXT calloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkHostImageLayoutTransitionInfoEXT} structs. */
    public static class Buffer extends VkHostImageLayoutTransitionInfo.Buffer {

        private static final VkHostImageLayoutTransitionInfoEXT ELEMENT_FACTORY = VkHostImageLayoutTransitionInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkHostImageLayoutTransitionInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHostImageLayoutTransitionInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHostImageLayoutTransitionInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkHostImageLayoutTransitionInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkHostImageLayoutTransitionInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO} value to the {@code sType} field. */
        @Override
        public VkHostImageLayoutTransitionInfoEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkHostImageLayoutTransitionInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkHostImageLayoutTransitionInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        @Override
        public VkHostImageLayoutTransitionInfoEXT.Buffer image(@NativeType("VkImage") long value) { VkHostImageLayoutTransitionInfoEXT.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code oldLayout} field. */
        @Override
        public VkHostImageLayoutTransitionInfoEXT.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfoEXT.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@code newLayout} field. */
        @Override
        public VkHostImageLayoutTransitionInfoEXT.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfoEXT.nnewLayout(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        @Override
        public VkHostImageLayoutTransitionInfoEXT.Buffer subresourceRange(VkImageSubresourceRange value) { VkHostImageLayoutTransitionInfoEXT.nsubresourceRange(address(), value); return this; }
        /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkHostImageLayoutTransitionInfoEXT.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}
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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkCopyBufferToImageInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyBufferToImageInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer srcBuffer;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     {@link VkBufferImageCopy2 VkBufferImageCopy2} const * pRegions;
 * }</code></pre>
 */
public class VkCopyBufferToImageInfo2KHR extends VkCopyBufferToImageInfo2 {

    protected VkCopyBufferToImageInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyBufferToImageInfo2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyBufferToImageInfo2KHR(address, container);
    }

    /**
     * Creates a {@code VkCopyBufferToImageInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyBufferToImageInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkCopyBufferToImageInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2} value to the {@code sType} field. */
    @Override
    public VkCopyBufferToImageInfo2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkCopyBufferToImageInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcBuffer} field. */
    @Override
    public VkCopyBufferToImageInfo2KHR srcBuffer(@NativeType("VkBuffer") long value) { nsrcBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    @Override
    public VkCopyBufferToImageInfo2KHR dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    @Override
    public VkCopyBufferToImageInfo2KHR dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferImageCopy2.Buffer} to the {@code pRegions} field. */
    @Override
    public VkCopyBufferToImageInfo2KHR pRegions(@NativeType("VkBufferImageCopy2 const *") VkBufferImageCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCopyBufferToImageInfo2KHR set(
        int sType,
        long pNext,
        long srcBuffer,
        long dstImage,
        int dstImageLayout,
        VkBufferImageCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcBuffer(srcBuffer);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyBufferToImageInfo2KHR set(VkCopyBufferToImageInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyBufferToImageInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyBufferToImageInfo2KHR malloc() {
        return new VkCopyBufferToImageInfo2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyBufferToImageInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyBufferToImageInfo2KHR calloc() {
        return new VkCopyBufferToImageInfo2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyBufferToImageInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyBufferToImageInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyBufferToImageInfo2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyBufferToImageInfo2KHR} instance for the specified memory address. */
    public static VkCopyBufferToImageInfo2KHR create(long address) {
        return new VkCopyBufferToImageInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyBufferToImageInfo2KHR createSafe(long address) {
        return address == NULL ? null : new VkCopyBufferToImageInfo2KHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyBufferToImageInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyBufferToImageInfo2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyBufferToImageInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferToImageInfo2KHR malloc(MemoryStack stack) {
        return new VkCopyBufferToImageInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyBufferToImageInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferToImageInfo2KHR calloc(MemoryStack stack) {
        return new VkCopyBufferToImageInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCopyBufferToImageInfo2KHR} structs. */
    public static class Buffer extends VkCopyBufferToImageInfo2.Buffer {

        private static final VkCopyBufferToImageInfo2KHR ELEMENT_FACTORY = VkCopyBufferToImageInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkCopyBufferToImageInfo2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyBufferToImageInfo2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyBufferToImageInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkCopyBufferToImageInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyBufferToImageInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2} value to the {@code sType} field. */
        @Override
        public VkCopyBufferToImageInfo2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkCopyBufferToImageInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyBufferToImageInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcBuffer} field. */
        @Override
        public VkCopyBufferToImageInfo2KHR.Buffer srcBuffer(@NativeType("VkBuffer") long value) { VkCopyBufferToImageInfo2KHR.nsrcBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        @Override
        public VkCopyBufferToImageInfo2KHR.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyBufferToImageInfo2KHR.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        @Override
        public VkCopyBufferToImageInfo2KHR.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyBufferToImageInfo2KHR.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferImageCopy2.Buffer} to the {@code pRegions} field. */
        @Override
        public VkCopyBufferToImageInfo2KHR.Buffer pRegions(@NativeType("VkBufferImageCopy2 const *") VkBufferImageCopy2.Buffer value) { VkCopyBufferToImageInfo2KHR.npRegions(address(), value); return this; }

    }

}
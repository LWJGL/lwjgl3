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
 * <pre>{@code
 * struct VkCopyImageToImageInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkHostImageCopyFlags flags;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     {@link VkImageCopy2 VkImageCopy2} const * pRegions;
 * }}</pre>
 */
public class VkCopyImageToImageInfoEXT extends VkCopyImageToImageInfo {

    protected VkCopyImageToImageInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyImageToImageInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCopyImageToImageInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCopyImageToImageInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageToImageInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkCopyImageToImageInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO} value to the {@code sType} field. */
    @Override
    public VkCopyImageToImageInfoEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkCopyImageToImageInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkCopyImageToImageInfoEXT flags(@NativeType("VkHostImageCopyFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code srcImage} field. */
    @Override
    public VkCopyImageToImageInfoEXT srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@code srcImageLayout} field. */
    @Override
    public VkCopyImageToImageInfoEXT srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    @Override
    public VkCopyImageToImageInfoEXT dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    @Override
    public VkCopyImageToImageInfoEXT dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCopy2.Buffer} to the {@code pRegions} field. */
    @Override
    public VkCopyImageToImageInfoEXT pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCopyImageToImageInfoEXT set(
        int sType,
        long pNext,
        int flags,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
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
    public VkCopyImageToImageInfoEXT set(VkCopyImageToImageInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageToImageInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageToImageInfoEXT malloc() {
        return new VkCopyImageToImageInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToImageInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageToImageInfoEXT calloc() {
        return new VkCopyImageToImageInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToImageInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageToImageInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToImageInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageToImageInfoEXT} instance for the specified memory address. */
    public static VkCopyImageToImageInfoEXT create(long address) {
        return new VkCopyImageToImageInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyImageToImageInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCopyImageToImageInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyImageToImageInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyImageToImageInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyImageToImageInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToImageInfoEXT malloc(MemoryStack stack) {
        return new VkCopyImageToImageInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyImageToImageInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToImageInfoEXT calloc(MemoryStack stack) {
        return new VkCopyImageToImageInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToImageInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToImageInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageToImageInfoEXT} structs. */
    public static class Buffer extends VkCopyImageToImageInfo.Buffer {

        private static final VkCopyImageToImageInfoEXT ELEMENT_FACTORY = VkCopyImageToImageInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCopyImageToImageInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageToImageInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyImageToImageInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageToImageInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO} value to the {@code sType} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageToImageInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer flags(@NativeType("VkHostImageCopyFlags") int value) { VkCopyImageToImageInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code srcImage} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageToImageInfoEXT.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@code srcImageLayout} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToImageInfoEXT.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyImageToImageInfoEXT.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToImageInfoEXT.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCopy2.Buffer} to the {@code pRegions} field. */
        @Override
        public VkCopyImageToImageInfoEXT.Buffer pRegions(@NativeType("VkImageCopy2 const *") VkImageCopy2.Buffer value) { VkCopyImageToImageInfoEXT.npRegions(address(), value); return this; }

    }

}
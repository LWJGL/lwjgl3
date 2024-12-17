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
 * struct VkCopyImageToMemoryInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkHostImageCopyFlags flags;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     uint32_t regionCount;
 *     {@link VkImageToMemoryCopy VkImageToMemoryCopy} const * pRegions;
 * }}</pre>
 */
public class VkCopyImageToMemoryInfoEXT extends VkCopyImageToMemoryInfo {

    protected VkCopyImageToMemoryInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyImageToMemoryInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCopyImageToMemoryInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCopyImageToMemoryInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageToMemoryInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkCopyImageToMemoryInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO} value to the {@code sType} field. */
    @Override
    public VkCopyImageToMemoryInfoEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkCopyImageToMemoryInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkCopyImageToMemoryInfoEXT flags(@NativeType("VkHostImageCopyFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code srcImage} field. */
    @Override
    public VkCopyImageToMemoryInfoEXT srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@code srcImageLayout} field. */
    @Override
    public VkCopyImageToMemoryInfoEXT srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageToMemoryCopy.Buffer} to the {@code pRegions} field. */
    @Override
    public VkCopyImageToMemoryInfoEXT pRegions(@NativeType("VkImageToMemoryCopy const *") VkImageToMemoryCopy.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCopyImageToMemoryInfoEXT set(
        int sType,
        long pNext,
        int flags,
        long srcImage,
        int srcImageLayout,
        VkImageToMemoryCopy.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
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
    public VkCopyImageToMemoryInfoEXT set(VkCopyImageToMemoryInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageToMemoryInfoEXT malloc() {
        return new VkCopyImageToMemoryInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageToMemoryInfoEXT calloc() {
        return new VkCopyImageToMemoryInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageToMemoryInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToMemoryInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfoEXT} instance for the specified memory address. */
    public static VkCopyImageToMemoryInfoEXT create(long address) {
        return new VkCopyImageToMemoryInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyImageToMemoryInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCopyImageToMemoryInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyImageToMemoryInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyImageToMemoryInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToMemoryInfoEXT malloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToMemoryInfoEXT calloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageToMemoryInfoEXT} structs. */
    public static class Buffer extends VkCopyImageToMemoryInfo.Buffer {

        private static final VkCopyImageToMemoryInfoEXT ELEMENT_FACTORY = VkCopyImageToMemoryInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCopyImageToMemoryInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageToMemoryInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyImageToMemoryInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkCopyImageToMemoryInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageToMemoryInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO} value to the {@code sType} field. */
        @Override
        public VkCopyImageToMemoryInfoEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkCopyImageToMemoryInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageToMemoryInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkCopyImageToMemoryInfoEXT.Buffer flags(@NativeType("VkHostImageCopyFlags") int value) { VkCopyImageToMemoryInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code srcImage} field. */
        @Override
        public VkCopyImageToMemoryInfoEXT.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageToMemoryInfoEXT.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@code srcImageLayout} field. */
        @Override
        public VkCopyImageToMemoryInfoEXT.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToMemoryInfoEXT.nsrcImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageToMemoryCopy.Buffer} to the {@code pRegions} field. */
        @Override
        public VkCopyImageToMemoryInfoEXT.Buffer pRegions(@NativeType("VkImageToMemoryCopy const *") VkImageToMemoryCopy.Buffer value) { VkCopyImageToMemoryInfoEXT.npRegions(address(), value); return this; }

    }

}
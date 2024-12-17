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
 * struct VkCopyMemoryToImageInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkHostImageCopyFlags flags;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     {@link VkMemoryToImageCopy VkMemoryToImageCopy} const * pRegions;
 * }}</pre>
 */
public class VkCopyMemoryToImageInfoEXT extends VkCopyMemoryToImageInfo {

    protected VkCopyMemoryToImageInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToImageInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToImageInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToImageInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToImageInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkCopyMemoryToImageInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO} value to the {@code sType} field. */
    @Override
    public VkCopyMemoryToImageInfoEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkCopyMemoryToImageInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkCopyMemoryToImageInfoEXT flags(@NativeType("VkHostImageCopyFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    @Override
    public VkCopyMemoryToImageInfoEXT dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    @Override
    public VkCopyMemoryToImageInfoEXT dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryToImageCopy.Buffer} to the {@code pRegions} field. */
    @Override
    public VkCopyMemoryToImageInfoEXT pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCopyMemoryToImageInfoEXT set(
        int sType,
        long pNext,
        int flags,
        long dstImage,
        int dstImageLayout,
        VkMemoryToImageCopy.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
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
    public VkCopyMemoryToImageInfoEXT set(VkCopyMemoryToImageInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToImageInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageInfoEXT malloc() {
        return new VkCopyMemoryToImageInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageInfoEXT calloc() {
        return new VkCopyMemoryToImageInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToImageInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfoEXT} instance for the specified memory address. */
    public static VkCopyMemoryToImageInfoEXT create(long address) {
        return new VkCopyMemoryToImageInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryToImageInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToImageInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToImageInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryToImageInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageInfoEXT malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageInfoEXT calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToImageInfoEXT} structs. */
    public static class Buffer extends VkCopyMemoryToImageInfo.Buffer {

        private static final VkCopyMemoryToImageInfoEXT ELEMENT_FACTORY = VkCopyMemoryToImageInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToImageInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToImageInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToImageInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkCopyMemoryToImageInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMemoryToImageInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO} value to the {@code sType} field. */
        @Override
        public VkCopyMemoryToImageInfoEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkCopyMemoryToImageInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCopyMemoryToImageInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkCopyMemoryToImageInfoEXT.Buffer flags(@NativeType("VkHostImageCopyFlags") int value) { VkCopyMemoryToImageInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        @Override
        public VkCopyMemoryToImageInfoEXT.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyMemoryToImageInfoEXT.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        @Override
        public VkCopyMemoryToImageInfoEXT.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyMemoryToImageInfoEXT.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryToImageCopy.Buffer} to the {@code pRegions} field. */
        @Override
        public VkCopyMemoryToImageInfoEXT.Buffer pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) { VkCopyMemoryToImageInfoEXT.npRegions(address(), value); return this; }

    }

}
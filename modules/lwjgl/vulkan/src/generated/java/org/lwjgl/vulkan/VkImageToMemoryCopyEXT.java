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
 * struct VkImageToMemoryCopyEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     void * pHostPointer;
 *     uint32_t memoryRowLength;
 *     uint32_t memoryImageHeight;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
 *     {@link VkOffset3D VkOffset3D} imageOffset;
 *     {@link VkExtent3D VkExtent3D} imageExtent;
 * }}</pre>
 */
public class VkImageToMemoryCopyEXT extends VkImageToMemoryCopy {

    protected VkImageToMemoryCopyEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageToMemoryCopyEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageToMemoryCopyEXT(address, container);
    }

    /**
     * Creates a {@code VkImageToMemoryCopyEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageToMemoryCopyEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImageToMemoryCopyEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY} value to the {@code sType} field. */
    @Override
    public VkImageToMemoryCopyEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImageToMemoryCopyEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pHostPointer} field. */
    @Override
    public VkImageToMemoryCopyEXT pHostPointer(@NativeType("void *") long value) { npHostPointer(address(), value); return this; }
    /** Sets the specified value to the {@code memoryRowLength} field. */
    @Override
    public VkImageToMemoryCopyEXT memoryRowLength(@NativeType("uint32_t") int value) { nmemoryRowLength(address(), value); return this; }
    /** Sets the specified value to the {@code memoryImageHeight} field. */
    @Override
    public VkImageToMemoryCopyEXT memoryImageHeight(@NativeType("uint32_t") int value) { nmemoryImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
    @Override
    public VkImageToMemoryCopyEXT imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageToMemoryCopyEXT imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
    @Override
    public VkImageToMemoryCopyEXT imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageToMemoryCopyEXT imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
    @Override
    public VkImageToMemoryCopyEXT imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkImageToMemoryCopyEXT imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkImageToMemoryCopyEXT set(
        int sType,
        long pNext,
        long pHostPointer,
        int memoryRowLength,
        int memoryImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        sType(sType);
        pNext(pNext);
        pHostPointer(pHostPointer);
        memoryRowLength(memoryRowLength);
        memoryImageHeight(memoryImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageToMemoryCopyEXT set(VkImageToMemoryCopyEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageToMemoryCopyEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageToMemoryCopyEXT malloc() {
        return new VkImageToMemoryCopyEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageToMemoryCopyEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageToMemoryCopyEXT calloc() {
        return new VkImageToMemoryCopyEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageToMemoryCopyEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageToMemoryCopyEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageToMemoryCopyEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageToMemoryCopyEXT} instance for the specified memory address. */
    public static VkImageToMemoryCopyEXT create(long address) {
        return new VkImageToMemoryCopyEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageToMemoryCopyEXT createSafe(long address) {
        return address == NULL ? null : new VkImageToMemoryCopyEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopyEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopyEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopyEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopyEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopyEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopyEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageToMemoryCopyEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopyEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageToMemoryCopyEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageToMemoryCopyEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageToMemoryCopyEXT malloc(MemoryStack stack) {
        return new VkImageToMemoryCopyEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageToMemoryCopyEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageToMemoryCopyEXT calloc(MemoryStack stack) {
        return new VkImageToMemoryCopyEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopyEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopyEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageToMemoryCopyEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageToMemoryCopyEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkImageToMemoryCopyEXT} structs. */
    public static class Buffer extends VkImageToMemoryCopy.Buffer {

        private static final VkImageToMemoryCopyEXT ELEMENT_FACTORY = VkImageToMemoryCopyEXT.create(-1L);

        /**
         * Creates a new {@code VkImageToMemoryCopyEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageToMemoryCopyEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageToMemoryCopyEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageToMemoryCopyEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY} value to the {@code sType} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageToMemoryCopyEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pHostPointer} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer pHostPointer(@NativeType("void *") long value) { VkImageToMemoryCopyEXT.npHostPointer(address(), value); return this; }
        /** Sets the specified value to the {@code memoryRowLength} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer memoryRowLength(@NativeType("uint32_t") int value) { VkImageToMemoryCopyEXT.nmemoryRowLength(address(), value); return this; }
        /** Sets the specified value to the {@code memoryImageHeight} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer memoryImageHeight(@NativeType("uint32_t") int value) { VkImageToMemoryCopyEXT.nmemoryImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer imageSubresource(VkImageSubresourceLayers value) { VkImageToMemoryCopyEXT.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer imageOffset(VkOffset3D value) { VkImageToMemoryCopyEXT.nimageOffset(address(), value); return this; }
        /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer imageExtent(VkExtent3D value) { VkImageToMemoryCopyEXT.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkImageToMemoryCopyEXT.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}
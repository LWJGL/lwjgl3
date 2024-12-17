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
 * struct VkMemoryToImageCopyEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     void const * pHostPointer;
 *     uint32_t memoryRowLength;
 *     uint32_t memoryImageHeight;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
 *     {@link VkOffset3D VkOffset3D} imageOffset;
 *     {@link VkExtent3D VkExtent3D} imageExtent;
 * }}</pre>
 */
public class VkMemoryToImageCopyEXT extends VkMemoryToImageCopy {

    protected VkMemoryToImageCopyEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryToImageCopyEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryToImageCopyEXT(address, container);
    }

    /**
     * Creates a {@code VkMemoryToImageCopyEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryToImageCopyEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkMemoryToImageCopyEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY} value to the {@code sType} field. */
    @Override
    public VkMemoryToImageCopyEXT sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkMemoryToImageCopyEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pHostPointer} field. */
    @Override
    public VkMemoryToImageCopyEXT pHostPointer(@NativeType("void const *") long value) { npHostPointer(address(), value); return this; }
    /** Sets the specified value to the {@code memoryRowLength} field. */
    @Override
    public VkMemoryToImageCopyEXT memoryRowLength(@NativeType("uint32_t") int value) { nmemoryRowLength(address(), value); return this; }
    /** Sets the specified value to the {@code memoryImageHeight} field. */
    @Override
    public VkMemoryToImageCopyEXT memoryImageHeight(@NativeType("uint32_t") int value) { nmemoryImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
    @Override
    public VkMemoryToImageCopyEXT imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkMemoryToImageCopyEXT imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
    @Override
    public VkMemoryToImageCopyEXT imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkMemoryToImageCopyEXT imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
    @Override
    public VkMemoryToImageCopyEXT imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkMemoryToImageCopyEXT imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkMemoryToImageCopyEXT set(
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
    public VkMemoryToImageCopyEXT set(VkMemoryToImageCopyEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryToImageCopyEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryToImageCopyEXT malloc() {
        return new VkMemoryToImageCopyEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryToImageCopyEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryToImageCopyEXT calloc() {
        return new VkMemoryToImageCopyEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryToImageCopyEXT} instance allocated with {@link BufferUtils}. */
    public static VkMemoryToImageCopyEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryToImageCopyEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryToImageCopyEXT} instance for the specified memory address. */
    public static VkMemoryToImageCopyEXT create(long address) {
        return new VkMemoryToImageCopyEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryToImageCopyEXT createSafe(long address) {
        return address == NULL ? null : new VkMemoryToImageCopyEXT(address, null);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryToImageCopyEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryToImageCopyEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryToImageCopyEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryToImageCopyEXT malloc(MemoryStack stack) {
        return new VkMemoryToImageCopyEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryToImageCopyEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryToImageCopyEXT calloc(MemoryStack stack) {
        return new VkMemoryToImageCopyEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkMemoryToImageCopyEXT} structs. */
    public static class Buffer extends VkMemoryToImageCopy.Buffer {

        private static final VkMemoryToImageCopyEXT ELEMENT_FACTORY = VkMemoryToImageCopyEXT.create(-1L);

        /**
         * Creates a new {@code VkMemoryToImageCopyEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryToImageCopyEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryToImageCopyEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryToImageCopyEXT.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY} value to the {@code sType} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer pNext(@NativeType("void const *") long value) { VkMemoryToImageCopyEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pHostPointer} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer pHostPointer(@NativeType("void const *") long value) { VkMemoryToImageCopyEXT.npHostPointer(address(), value); return this; }
        /** Sets the specified value to the {@code memoryRowLength} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer memoryRowLength(@NativeType("uint32_t") int value) { VkMemoryToImageCopyEXT.nmemoryRowLength(address(), value); return this; }
        /** Sets the specified value to the {@code memoryImageHeight} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer memoryImageHeight(@NativeType("uint32_t") int value) { VkMemoryToImageCopyEXT.nmemoryImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer imageSubresource(VkImageSubresourceLayers value) { VkMemoryToImageCopyEXT.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer imageOffset(VkOffset3D value) { VkMemoryToImageCopyEXT.nimageOffset(address(), value); return this; }
        /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer imageExtent(VkExtent3D value) { VkMemoryToImageCopyEXT.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkMemoryToImageCopyEXT.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}
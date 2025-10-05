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
 * <pre><code>
 * struct VkCopyMemoryToImageIndirectCommandNV {
 *     VkDeviceAddress srcAddress;
 *     uint32_t bufferRowLength;
 *     uint32_t bufferImageHeight;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
 *     {@link VkOffset3D VkOffset3D} imageOffset;
 *     {@link VkExtent3D VkExtent3D} imageExtent;
 * }</code></pre>
 */
public class VkCopyMemoryToImageIndirectCommandNV extends VkCopyMemoryToImageIndirectCommandKHR {

    protected VkCopyMemoryToImageIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToImageIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToImageIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToImageIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToImageIndirectCommandNV(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code srcAddress} field. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV srcAddress(@NativeType("VkDeviceAddress") long value) { nsrcAddress(address(), value); return this; }
    /** Sets the specified value to the {@code bufferRowLength} field. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV bufferRowLength(@NativeType("uint32_t") int value) { nbufferRowLength(address(), value); return this; }
    /** Sets the specified value to the {@code bufferImageHeight} field. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV bufferImageHeight(@NativeType("uint32_t") int value) { nbufferImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCopyMemoryToImageIndirectCommandNV set(
        long srcAddress,
        int bufferRowLength,
        int bufferImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        srcAddress(srcAddress);
        bufferRowLength(bufferRowLength);
        bufferImageHeight(bufferImageHeight);
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
    public VkCopyMemoryToImageIndirectCommandNV set(VkCopyMemoryToImageIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageIndirectCommandNV malloc() {
        return new VkCopyMemoryToImageIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageIndirectCommandNV calloc() {
        return new VkCopyMemoryToImageIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToImageIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance for the specified memory address. */
    public static VkCopyMemoryToImageIndirectCommandNV create(long address) {
        return new VkCopyMemoryToImageIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryToImageIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToImageIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryToImageIndirectCommandNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageIndirectCommandNV malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageIndirectCommandNV calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToImageIndirectCommandNV} structs. */
    public static class Buffer extends VkCopyMemoryToImageIndirectCommandKHR.Buffer {

        private static final VkCopyMemoryToImageIndirectCommandNV ELEMENT_FACTORY = VkCopyMemoryToImageIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToImageIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToImageIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToImageIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code srcAddress} field. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer srcAddress(@NativeType("VkDeviceAddress") long value) { VkCopyMemoryToImageIndirectCommandNV.nsrcAddress(address(), value); return this; }
        /** Sets the specified value to the {@code bufferRowLength} field. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer bufferRowLength(@NativeType("uint32_t") int value) { VkCopyMemoryToImageIndirectCommandNV.nbufferRowLength(address(), value); return this; }
        /** Sets the specified value to the {@code bufferImageHeight} field. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer bufferImageHeight(@NativeType("uint32_t") int value) { VkCopyMemoryToImageIndirectCommandNV.nbufferImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageSubresource(VkImageSubresourceLayers value) { VkCopyMemoryToImageIndirectCommandNV.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageOffset(VkOffset3D value) { VkCopyMemoryToImageIndirectCommandNV.nimageOffset(address(), value); return this; }
        /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageExtent(VkExtent3D value) { VkCopyMemoryToImageIndirectCommandNV.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}
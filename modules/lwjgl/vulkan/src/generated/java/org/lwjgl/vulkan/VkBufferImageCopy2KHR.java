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
 * See {@link VkBufferImageCopy2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferImageCopy2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceSize bufferOffset;
 *     uint32_t bufferRowLength;
 *     uint32_t bufferImageHeight;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
 *     {@link VkOffset3D VkOffset3D} imageOffset;
 *     {@link VkExtent3D VkExtent3D} imageExtent;
 * }</code></pre>
 */
public class VkBufferImageCopy2KHR extends VkBufferImageCopy2 {

    /**
     * Creates a {@code VkBufferImageCopy2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferImageCopy2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBufferImageCopy2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2 STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2} value to the {@code sType} field. */
    @Override
    public VkBufferImageCopy2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBufferImageCopy2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code bufferOffset} field. */
    @Override
    public VkBufferImageCopy2KHR bufferOffset(@NativeType("VkDeviceSize") long value) { nbufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@code bufferRowLength} field. */
    @Override
    public VkBufferImageCopy2KHR bufferRowLength(@NativeType("uint32_t") int value) { nbufferRowLength(address(), value); return this; }
    /** Sets the specified value to the {@code bufferImageHeight} field. */
    @Override
    public VkBufferImageCopy2KHR bufferImageHeight(@NativeType("uint32_t") int value) { nbufferImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
    @Override
    public VkBufferImageCopy2KHR imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkBufferImageCopy2KHR imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
    @Override
    public VkBufferImageCopy2KHR imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkBufferImageCopy2KHR imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
    @Override
    public VkBufferImageCopy2KHR imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkBufferImageCopy2KHR imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBufferImageCopy2KHR set(
        int sType,
        long pNext,
        long bufferOffset,
        int bufferRowLength,
        int bufferImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        sType(sType);
        pNext(pNext);
        bufferOffset(bufferOffset);
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
    public VkBufferImageCopy2KHR set(VkBufferImageCopy2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferImageCopy2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferImageCopy2KHR malloc() {
        return wrap(VkBufferImageCopy2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferImageCopy2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferImageCopy2KHR calloc() {
        return wrap(VkBufferImageCopy2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferImageCopy2KHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferImageCopy2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferImageCopy2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferImageCopy2KHR} instance for the specified memory address. */
    public static VkBufferImageCopy2KHR create(long address) {
        return wrap(VkBufferImageCopy2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferImageCopy2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferImageCopy2KHR.class, address);
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferImageCopy2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferImageCopy2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBufferImageCopy2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferImageCopy2KHR malloc(MemoryStack stack) {
        return wrap(VkBufferImageCopy2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferImageCopy2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferImageCopy2KHR calloc(MemoryStack stack) {
        return wrap(VkBufferImageCopy2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBufferImageCopy2KHR} structs. */
    public static class Buffer extends VkBufferImageCopy2.Buffer {

        private static final VkBufferImageCopy2KHR ELEMENT_FACTORY = VkBufferImageCopy2KHR.create(-1L);

        /**
         * Creates a new {@code VkBufferImageCopy2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferImageCopy2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferImageCopy2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferImageCopy2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2 STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2} value to the {@code sType} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferImageCopy2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code bufferOffset} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer bufferOffset(@NativeType("VkDeviceSize") long value) { VkBufferImageCopy2KHR.nbufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@code bufferRowLength} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer bufferRowLength(@NativeType("uint32_t") int value) { VkBufferImageCopy2KHR.nbufferRowLength(address(), value); return this; }
        /** Sets the specified value to the {@code bufferImageHeight} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer bufferImageHeight(@NativeType("uint32_t") int value) { VkBufferImageCopy2KHR.nbufferImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer imageSubresource(VkImageSubresourceLayers value) { VkBufferImageCopy2KHR.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkBufferImageCopy2KHR.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer imageOffset(VkOffset3D value) { VkBufferImageCopy2KHR.nimageOffset(address(), value); return this; }
        /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkBufferImageCopy2KHR.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
        @Override
        public VkBufferImageCopy2KHR.Buffer imageExtent(VkExtent3D value) { VkBufferImageCopy2KHR.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkBufferImageCopy2KHR.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}
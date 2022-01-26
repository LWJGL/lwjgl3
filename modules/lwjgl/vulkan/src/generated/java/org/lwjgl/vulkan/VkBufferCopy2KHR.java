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
 * See {@link VkBufferCopy2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferCopy2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceSize srcOffset;
 *     VkDeviceSize dstOffset;
 *     VkDeviceSize size;
 * }</code></pre>
 */
public class VkBufferCopy2KHR extends VkBufferCopy2 {

    /**
     * Creates a {@code VkBufferCopy2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferCopy2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkBufferCopy2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_COPY_2 STRUCTURE_TYPE_BUFFER_COPY_2} value to the {@code sType} field. */
    @Override
    public VkBufferCopy2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_COPY_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkBufferCopy2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcOffset} field. */
    @Override
    public VkBufferCopy2KHR srcOffset(@NativeType("VkDeviceSize") long value) { nsrcOffset(address(), value); return this; }
    /** Sets the specified value to the {@code dstOffset} field. */
    @Override
    public VkBufferCopy2KHR dstOffset(@NativeType("VkDeviceSize") long value) { ndstOffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    @Override
    public VkBufferCopy2KHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkBufferCopy2KHR set(
        int sType,
        long pNext,
        long srcOffset,
        long dstOffset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        srcOffset(srcOffset);
        dstOffset(dstOffset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferCopy2KHR set(VkBufferCopy2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferCopy2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferCopy2KHR malloc() {
        return wrap(VkBufferCopy2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferCopy2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferCopy2KHR calloc() {
        return wrap(VkBufferCopy2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferCopy2KHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferCopy2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferCopy2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferCopy2KHR} instance for the specified memory address. */
    public static VkBufferCopy2KHR create(long address) {
        return wrap(VkBufferCopy2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCopy2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferCopy2KHR.class, address);
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferCopy2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCopy2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBufferCopy2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCopy2KHR malloc(MemoryStack stack) {
        return wrap(VkBufferCopy2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferCopy2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCopy2KHR calloc(MemoryStack stack) {
        return wrap(VkBufferCopy2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkBufferCopy2KHR} structs. */
    public static class Buffer extends VkBufferCopy2.Buffer {

        private static final VkBufferCopy2KHR ELEMENT_FACTORY = VkBufferCopy2KHR.create(-1L);

        /**
         * Creates a new {@code VkBufferCopy2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferCopy2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferCopy2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkBufferCopy2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferCopy2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_COPY_2 STRUCTURE_TYPE_BUFFER_COPY_2} value to the {@code sType} field. */
        @Override
        public VkBufferCopy2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_COPY_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkBufferCopy2KHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferCopy2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcOffset} field. */
        @Override
        public VkBufferCopy2KHR.Buffer srcOffset(@NativeType("VkDeviceSize") long value) { VkBufferCopy2KHR.nsrcOffset(address(), value); return this; }
        /** Sets the specified value to the {@code dstOffset} field. */
        @Override
        public VkBufferCopy2KHR.Buffer dstOffset(@NativeType("VkDeviceSize") long value) { VkBufferCopy2KHR.ndstOffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        @Override
        public VkBufferCopy2KHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferCopy2KHR.nsize(address(), value); return this; }

    }

}
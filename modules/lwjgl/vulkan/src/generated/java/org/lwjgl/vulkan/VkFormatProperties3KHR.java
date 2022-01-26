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
 * See {@link VkFormatProperties3}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFormatProperties3KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkFormatFeatureFlags2 linearTilingFeatures;
 *     VkFormatFeatureFlags2 optimalTilingFeatures;
 *     VkFormatFeatureFlags2 bufferFeatures;
 * }</code></pre>
 */
public class VkFormatProperties3KHR extends VkFormatProperties3 {

    /**
     * Creates a {@code VkFormatProperties3KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFormatProperties3KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkFormatProperties3KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 STRUCTURE_TYPE_FORMAT_PROPERTIES_3} value to the {@code sType} field. */
    @Override
    public VkFormatProperties3KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkFormatProperties3KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkFormatProperties3KHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFormatProperties3KHR set(VkFormatProperties3KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFormatProperties3KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFormatProperties3KHR malloc() {
        return wrap(VkFormatProperties3KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFormatProperties3KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFormatProperties3KHR calloc() {
        return wrap(VkFormatProperties3KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFormatProperties3KHR} instance allocated with {@link BufferUtils}. */
    public static VkFormatProperties3KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFormatProperties3KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFormatProperties3KHR} instance for the specified memory address. */
    public static VkFormatProperties3KHR create(long address) {
        return wrap(VkFormatProperties3KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties3KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkFormatProperties3KHR.class, address);
    }

    /**
     * Returns a new {@link VkFormatProperties3KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties3KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties3KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFormatProperties3KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFormatProperties3KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkFormatProperties3KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties3KHR malloc(MemoryStack stack) {
        return wrap(VkFormatProperties3KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFormatProperties3KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFormatProperties3KHR calloc(MemoryStack stack) {
        return wrap(VkFormatProperties3KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFormatProperties3KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFormatProperties3KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFormatProperties3KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkFormatProperties3KHR} structs. */
    public static class Buffer extends VkFormatProperties3.Buffer {

        private static final VkFormatProperties3KHR ELEMENT_FACTORY = VkFormatProperties3KHR.create(-1L);

        /**
         * Creates a new {@code VkFormatProperties3KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFormatProperties3KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkFormatProperties3KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkFormatProperties3KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFormatProperties3KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3 STRUCTURE_TYPE_FORMAT_PROPERTIES_3} value to the {@code sType} field. */
        @Override
        public VkFormatProperties3KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_3); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkFormatProperties3KHR.Buffer pNext(@NativeType("void *") long value) { VkFormatProperties3KHR.npNext(address(), value); return this; }

    }

}
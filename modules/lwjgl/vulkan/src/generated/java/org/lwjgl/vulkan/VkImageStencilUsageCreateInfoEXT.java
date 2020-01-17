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
 * See {@link VkImageStencilUsageCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageStencilUsageCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageUsageFlags stencilUsage;
 * }</code></pre>
 */
public class VkImageStencilUsageCreateInfoEXT extends VkImageStencilUsageCreateInfo {

    /**
     * Creates a {@code VkImageStencilUsageCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageStencilUsageCreateInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImageStencilUsageCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImageStencilUsageCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stencilUsage} field. */
    @Override
    public VkImageStencilUsageCreateInfoEXT stencilUsage(@NativeType("VkImageUsageFlags") int value) { nstencilUsage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkImageStencilUsageCreateInfoEXT set(
        int sType,
        long pNext,
        int stencilUsage
    ) {
        sType(sType);
        pNext(pNext);
        stencilUsage(stencilUsage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageStencilUsageCreateInfoEXT set(VkImageStencilUsageCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageStencilUsageCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageStencilUsageCreateInfoEXT malloc() {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageStencilUsageCreateInfoEXT calloc() {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageStencilUsageCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageStencilUsageCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfoEXT} instance for the specified memory address. */
    public static VkImageStencilUsageCreateInfoEXT create(long address) {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageStencilUsageCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkImageStencilUsageCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageStencilUsageCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImageStencilUsageCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageStencilUsageCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageStencilUsageCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImageStencilUsageCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageStencilUsageCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageStencilUsageCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageStencilUsageCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkImageStencilUsageCreateInfoEXT} structs. */
    public static class Buffer extends VkImageStencilUsageCreateInfo.Buffer {

        private static final VkImageStencilUsageCreateInfoEXT ELEMENT_FACTORY = VkImageStencilUsageCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageStencilUsageCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageStencilUsageCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkImageStencilUsageCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImageStencilUsageCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageStencilUsageCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImageStencilUsageCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageStencilUsageCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stencilUsage} field. */
        @Override
        public VkImageStencilUsageCreateInfoEXT.Buffer stencilUsage(@NativeType("VkImageUsageFlags") int value) { VkImageStencilUsageCreateInfoEXT.nstencilUsage(address(), value); return this; }

    }

}
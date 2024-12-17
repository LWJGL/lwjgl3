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
 * <pre>{@code
 * struct VkVertexInputBindingDivisorDescriptionEXT {
 *     uint32_t binding;
 *     uint32_t divisor;
 * }}</pre>
 */
public class VkVertexInputBindingDivisorDescriptionEXT extends VkVertexInputBindingDivisorDescription {

    protected VkVertexInputBindingDivisorDescriptionEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVertexInputBindingDivisorDescriptionEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVertexInputBindingDivisorDescriptionEXT(address, container);
    }

    /**
     * Creates a {@code VkVertexInputBindingDivisorDescriptionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputBindingDivisorDescriptionEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code binding} field. */
    @Override
    public VkVertexInputBindingDivisorDescriptionEXT binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code divisor} field. */
    @Override
    public VkVertexInputBindingDivisorDescriptionEXT divisor(@NativeType("uint32_t") int value) { ndivisor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkVertexInputBindingDivisorDescriptionEXT set(
        int binding,
        int divisor
    ) {
        binding(binding);
        divisor(divisor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVertexInputBindingDivisorDescriptionEXT set(VkVertexInputBindingDivisorDescriptionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDivisorDescriptionEXT malloc() {
        return new VkVertexInputBindingDivisorDescriptionEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDivisorDescriptionEXT calloc() {
        return new VkVertexInputBindingDivisorDescriptionEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputBindingDivisorDescriptionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVertexInputBindingDivisorDescriptionEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance for the specified memory address. */
    public static VkVertexInputBindingDivisorDescriptionEXT create(long address) {
        return new VkVertexInputBindingDivisorDescriptionEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVertexInputBindingDivisorDescriptionEXT createSafe(long address) {
        return address == NULL ? null : new VkVertexInputBindingDivisorDescriptionEXT(address, null);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVertexInputBindingDivisorDescriptionEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDivisorDescriptionEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDivisorDescriptionEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDivisorDescriptionEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDivisorDescriptionEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDivisorDescriptionEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDivisorDescriptionEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDivisorDescriptionEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkVertexInputBindingDivisorDescriptionEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDivisorDescriptionEXT malloc(MemoryStack stack) {
        return new VkVertexInputBindingDivisorDescriptionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVertexInputBindingDivisorDescriptionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDivisorDescriptionEXT calloc(MemoryStack stack) {
        return new VkVertexInputBindingDivisorDescriptionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkVertexInputBindingDivisorDescriptionEXT} structs. */
    public static class Buffer extends VkVertexInputBindingDivisorDescription.Buffer {

        private static final VkVertexInputBindingDivisorDescriptionEXT ELEMENT_FACTORY = VkVertexInputBindingDivisorDescriptionEXT.create(-1L);

        /**
         * Creates a new {@code VkVertexInputBindingDivisorDescriptionEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputBindingDivisorDescriptionEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVertexInputBindingDivisorDescriptionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code binding} field. */
        @Override
        public VkVertexInputBindingDivisorDescriptionEXT.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputBindingDivisorDescriptionEXT.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code divisor} field. */
        @Override
        public VkVertexInputBindingDivisorDescriptionEXT.Buffer divisor(@NativeType("uint32_t") int value) { VkVertexInputBindingDivisorDescriptionEXT.ndivisor(address(), value); return this; }

    }

}
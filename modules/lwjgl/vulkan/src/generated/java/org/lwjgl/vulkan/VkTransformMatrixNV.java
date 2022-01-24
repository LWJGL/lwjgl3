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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkTransformMatrixKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkTransformMatrixNV {
 *     float matrix[3][4];
 * }</code></pre>
 */
public class VkTransformMatrixNV extends VkTransformMatrixKHR {

    /**
     * Creates a {@code VkTransformMatrixNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTransformMatrixNV(ByteBuffer container) {
        super(container);
    }

    /** Copies the specified {@link FloatBuffer} to the {@code matrix} field. */
    @Override
    public VkTransformMatrixNV matrix(@NativeType("float[3][4]") FloatBuffer value) { nmatrix(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code matrix} field. */
    @Override
    public VkTransformMatrixNV matrix(int index, float value) { nmatrix(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTransformMatrixNV set(VkTransformMatrixNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTransformMatrixNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTransformMatrixNV malloc() {
        return wrap(VkTransformMatrixNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkTransformMatrixNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTransformMatrixNV calloc() {
        return wrap(VkTransformMatrixNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkTransformMatrixNV} instance allocated with {@link BufferUtils}. */
    public static VkTransformMatrixNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkTransformMatrixNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkTransformMatrixNV} instance for the specified memory address. */
    public static VkTransformMatrixNV create(long address) {
        return wrap(VkTransformMatrixNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTransformMatrixNV createSafe(long address) {
        return address == NULL ? null : wrap(VkTransformMatrixNV.class, address);
    }

    /**
     * Returns a new {@link VkTransformMatrixNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTransformMatrixNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTransformMatrixNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkTransformMatrixNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTransformMatrixNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkTransformMatrixNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTransformMatrixNV malloc(MemoryStack stack) {
        return wrap(VkTransformMatrixNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkTransformMatrixNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTransformMatrixNV calloc(MemoryStack stack) {
        return wrap(VkTransformMatrixNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkTransformMatrixNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTransformMatrixNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkTransformMatrixNV} structs. */
    public static class Buffer extends VkTransformMatrixKHR.Buffer {

        private static final VkTransformMatrixNV ELEMENT_FACTORY = VkTransformMatrixNV.create(-1L);

        /**
         * Creates a new {@code VkTransformMatrixNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTransformMatrixNV#SIZEOF}, and its mark will be undefined.
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
        protected VkTransformMatrixNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Copies the specified {@link FloatBuffer} to the {@code matrix} field. */
        @Override
        public VkTransformMatrixNV.Buffer matrix(@NativeType("float[3][4]") FloatBuffer value) { VkTransformMatrixNV.nmatrix(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code matrix} field. */
        @Override
        public VkTransformMatrixNV.Buffer matrix(int index, float value) { VkTransformMatrixNV.nmatrix(address(), index, value); return this; }

    }

}
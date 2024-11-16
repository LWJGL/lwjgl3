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
 * See {@link VkAabbPositionsKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAabbPositionsNV {
 *     float minX;
 *     float minY;
 *     float minZ;
 *     float maxX;
 *     float maxY;
 *     float maxZ;
 * }</code></pre>
 */
public class VkAabbPositionsNV extends VkAabbPositionsKHR {

    protected VkAabbPositionsNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAabbPositionsNV create(long address, @Nullable ByteBuffer container) {
        return new VkAabbPositionsNV(address, container);
    }

    /**
     * Creates a {@code VkAabbPositionsNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAabbPositionsNV(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code minX} field. */
    @Override
    public VkAabbPositionsNV minX(float value) { nminX(address(), value); return this; }
    /** Sets the specified value to the {@code minY} field. */
    @Override
    public VkAabbPositionsNV minY(float value) { nminY(address(), value); return this; }
    /** Sets the specified value to the {@code minZ} field. */
    @Override
    public VkAabbPositionsNV minZ(float value) { nminZ(address(), value); return this; }
    /** Sets the specified value to the {@code maxX} field. */
    @Override
    public VkAabbPositionsNV maxX(float value) { nmaxX(address(), value); return this; }
    /** Sets the specified value to the {@code maxY} field. */
    @Override
    public VkAabbPositionsNV maxY(float value) { nmaxY(address(), value); return this; }
    /** Sets the specified value to the {@code maxZ} field. */
    @Override
    public VkAabbPositionsNV maxZ(float value) { nmaxZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkAabbPositionsNV set(
        float minX,
        float minY,
        float minZ,
        float maxX,
        float maxY,
        float maxZ
    ) {
        minX(minX);
        minY(minY);
        minZ(minZ);
        maxX(maxX);
        maxY(maxY);
        maxZ(maxZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAabbPositionsNV set(VkAabbPositionsNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAabbPositionsNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAabbPositionsNV malloc() {
        return new VkAabbPositionsNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAabbPositionsNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAabbPositionsNV calloc() {
        return new VkAabbPositionsNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAabbPositionsNV} instance allocated with {@link BufferUtils}. */
    public static VkAabbPositionsNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAabbPositionsNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAabbPositionsNV} instance for the specified memory address. */
    public static VkAabbPositionsNV create(long address) {
        return new VkAabbPositionsNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAabbPositionsNV createSafe(long address) {
        return address == NULL ? null : new VkAabbPositionsNV(address, null);
    }

    /**
     * Returns a new {@link VkAabbPositionsNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAabbPositionsNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAabbPositionsNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAabbPositionsNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAabbPositionsNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAabbPositionsNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAabbPositionsNV malloc(MemoryStack stack) {
        return new VkAabbPositionsNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAabbPositionsNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAabbPositionsNV calloc(MemoryStack stack) {
        return new VkAabbPositionsNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAabbPositionsNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAabbPositionsNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkAabbPositionsNV} structs. */
    public static class Buffer extends VkAabbPositionsKHR.Buffer {

        private static final VkAabbPositionsNV ELEMENT_FACTORY = VkAabbPositionsNV.create(-1L);

        /**
         * Creates a new {@code VkAabbPositionsNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAabbPositionsNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAabbPositionsNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code minX} field. */
        @Override
        public VkAabbPositionsNV.Buffer minX(float value) { VkAabbPositionsNV.nminX(address(), value); return this; }
        /** Sets the specified value to the {@code minY} field. */
        @Override
        public VkAabbPositionsNV.Buffer minY(float value) { VkAabbPositionsNV.nminY(address(), value); return this; }
        /** Sets the specified value to the {@code minZ} field. */
        @Override
        public VkAabbPositionsNV.Buffer minZ(float value) { VkAabbPositionsNV.nminZ(address(), value); return this; }
        /** Sets the specified value to the {@code maxX} field. */
        @Override
        public VkAabbPositionsNV.Buffer maxX(float value) { VkAabbPositionsNV.nmaxX(address(), value); return this; }
        /** Sets the specified value to the {@code maxY} field. */
        @Override
        public VkAabbPositionsNV.Buffer maxY(float value) { VkAabbPositionsNV.nmaxY(address(), value); return this; }
        /** Sets the specified value to the {@code maxZ} field. */
        @Override
        public VkAabbPositionsNV.Buffer maxZ(float value) { VkAabbPositionsNV.nmaxZ(address(), value); return this; }

    }

}
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
 * struct VkDepthClampRangeEXT {
 *     float minDepthClamp;
 *     float maxDepthClamp;
 * }}</pre>
 */
public class VkDepthClampRangeEXT extends Struct<VkDepthClampRangeEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MINDEPTHCLAMP,
        MAXDEPTHCLAMP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MINDEPTHCLAMP = layout.offsetof(0);
        MAXDEPTHCLAMP = layout.offsetof(1);
    }

    protected VkDepthClampRangeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDepthClampRangeEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDepthClampRangeEXT(address, container);
    }

    /**
     * Creates a {@code VkDepthClampRangeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDepthClampRangeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code minDepthClamp} field. */
    public float minDepthClamp() { return nminDepthClamp(address()); }
    /** @return the value of the {@code maxDepthClamp} field. */
    public float maxDepthClamp() { return nmaxDepthClamp(address()); }

    /** Sets the specified value to the {@code minDepthClamp} field. */
    public VkDepthClampRangeEXT minDepthClamp(float value) { nminDepthClamp(address(), value); return this; }
    /** Sets the specified value to the {@code maxDepthClamp} field. */
    public VkDepthClampRangeEXT maxDepthClamp(float value) { nmaxDepthClamp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDepthClampRangeEXT set(
        float minDepthClamp,
        float maxDepthClamp
    ) {
        minDepthClamp(minDepthClamp);
        maxDepthClamp(maxDepthClamp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDepthClampRangeEXT set(VkDepthClampRangeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDepthClampRangeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDepthClampRangeEXT malloc() {
        return new VkDepthClampRangeEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDepthClampRangeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDepthClampRangeEXT calloc() {
        return new VkDepthClampRangeEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDepthClampRangeEXT} instance allocated with {@link BufferUtils}. */
    public static VkDepthClampRangeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDepthClampRangeEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDepthClampRangeEXT} instance for the specified memory address. */
    public static VkDepthClampRangeEXT create(long address) {
        return new VkDepthClampRangeEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDepthClampRangeEXT createSafe(long address) {
        return address == NULL ? null : new VkDepthClampRangeEXT(address, null);
    }

    /**
     * Returns a new {@link VkDepthClampRangeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthClampRangeEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDepthClampRangeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthClampRangeEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDepthClampRangeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDepthClampRangeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDepthClampRangeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDepthClampRangeEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDepthClampRangeEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDepthClampRangeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDepthClampRangeEXT malloc(MemoryStack stack) {
        return new VkDepthClampRangeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDepthClampRangeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDepthClampRangeEXT calloc(MemoryStack stack) {
        return new VkDepthClampRangeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDepthClampRangeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDepthClampRangeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDepthClampRangeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDepthClampRangeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #minDepthClamp}. */
    public static float nminDepthClamp(long struct) { return memGetFloat(struct + VkDepthClampRangeEXT.MINDEPTHCLAMP); }
    /** Unsafe version of {@link #maxDepthClamp}. */
    public static float nmaxDepthClamp(long struct) { return memGetFloat(struct + VkDepthClampRangeEXT.MAXDEPTHCLAMP); }

    /** Unsafe version of {@link #minDepthClamp(float) minDepthClamp}. */
    public static void nminDepthClamp(long struct, float value) { memPutFloat(struct + VkDepthClampRangeEXT.MINDEPTHCLAMP, value); }
    /** Unsafe version of {@link #maxDepthClamp(float) maxDepthClamp}. */
    public static void nmaxDepthClamp(long struct, float value) { memPutFloat(struct + VkDepthClampRangeEXT.MAXDEPTHCLAMP, value); }

    // -----------------------------------

    /** An array of {@link VkDepthClampRangeEXT} structs. */
    public static class Buffer extends StructBuffer<VkDepthClampRangeEXT, Buffer> implements NativeResource {

        private static final VkDepthClampRangeEXT ELEMENT_FACTORY = VkDepthClampRangeEXT.create(-1L);

        /**
         * Creates a new {@code VkDepthClampRangeEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDepthClampRangeEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected VkDepthClampRangeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code minDepthClamp} field. */
        public float minDepthClamp() { return VkDepthClampRangeEXT.nminDepthClamp(address()); }
        /** @return the value of the {@code maxDepthClamp} field. */
        public float maxDepthClamp() { return VkDepthClampRangeEXT.nmaxDepthClamp(address()); }

        /** Sets the specified value to the {@code minDepthClamp} field. */
        public VkDepthClampRangeEXT.Buffer minDepthClamp(float value) { VkDepthClampRangeEXT.nminDepthClamp(address(), value); return this; }
        /** Sets the specified value to the {@code maxDepthClamp} field. */
        public VkDepthClampRangeEXT.Buffer maxDepthClamp(float value) { VkDepthClampRangeEXT.nmaxDepthClamp(address(), value); return this; }

    }

}
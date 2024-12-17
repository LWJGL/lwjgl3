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
 * struct VkViewport {
 *     float x;
 *     float y;
 *     float width;
 *     float height;
 *     float minDepth;
 *     float maxDepth;
 * }}</pre>
 */
public class VkViewport extends Struct<VkViewport> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        WIDTH,
        HEIGHT,
        MINDEPTH,
        MAXDEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        MINDEPTH = layout.offsetof(4);
        MAXDEPTH = layout.offsetof(5);
    }

    protected VkViewport(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkViewport create(long address, @Nullable ByteBuffer container) {
        return new VkViewport(address, container);
    }

    /**
     * Creates a {@code VkViewport} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkViewport(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code width} field. */
    public float width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public float height() { return nheight(address()); }
    /** @return the value of the {@code minDepth} field. */
    public float minDepth() { return nminDepth(address()); }
    /** @return the value of the {@code maxDepth} field. */
    public float maxDepth() { return nmaxDepth(address()); }

    /** Sets the specified value to the {@code x} field. */
    public VkViewport x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public VkViewport y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public VkViewport width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkViewport height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code minDepth} field. */
    public VkViewport minDepth(float value) { nminDepth(address(), value); return this; }
    /** Sets the specified value to the {@code maxDepth} field. */
    public VkViewport maxDepth(float value) { nmaxDepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkViewport set(
        float x,
        float y,
        float width,
        float height,
        float minDepth,
        float maxDepth
    ) {
        x(x);
        y(y);
        width(width);
        height(height);
        minDepth(minDepth);
        maxDepth(maxDepth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkViewport set(VkViewport src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkViewport} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkViewport malloc() {
        return new VkViewport(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkViewport} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkViewport calloc() {
        return new VkViewport(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkViewport} instance allocated with {@link BufferUtils}. */
    public static VkViewport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkViewport(memAddress(container), container);
    }

    /** Returns a new {@code VkViewport} instance for the specified memory address. */
    public static VkViewport create(long address) {
        return new VkViewport(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkViewport createSafe(long address) {
        return address == NULL ? null : new VkViewport(address, null);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkViewport.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkViewport.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkViewport mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkViewport callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkViewport mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkViewport callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewport.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewport.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewport.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkViewport.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkViewport} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewport malloc(MemoryStack stack) {
        return new VkViewport(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkViewport} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkViewport calloc(MemoryStack stack) {
        return new VkViewport(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkViewport.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkViewport.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + VkViewport.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + VkViewport.Y); }
    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return memGetFloat(struct + VkViewport.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return memGetFloat(struct + VkViewport.HEIGHT); }
    /** Unsafe version of {@link #minDepth}. */
    public static float nminDepth(long struct) { return memGetFloat(struct + VkViewport.MINDEPTH); }
    /** Unsafe version of {@link #maxDepth}. */
    public static float nmaxDepth(long struct) { return memGetFloat(struct + VkViewport.MAXDEPTH); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + VkViewport.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + VkViewport.Y, value); }
    /** Unsafe version of {@link #width(float) width}. */
    public static void nwidth(long struct, float value) { memPutFloat(struct + VkViewport.WIDTH, value); }
    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { memPutFloat(struct + VkViewport.HEIGHT, value); }
    /** Unsafe version of {@link #minDepth(float) minDepth}. */
    public static void nminDepth(long struct, float value) { memPutFloat(struct + VkViewport.MINDEPTH, value); }
    /** Unsafe version of {@link #maxDepth(float) maxDepth}. */
    public static void nmaxDepth(long struct, float value) { memPutFloat(struct + VkViewport.MAXDEPTH, value); }

    // -----------------------------------

    /** An array of {@link VkViewport} structs. */
    public static class Buffer extends StructBuffer<VkViewport, Buffer> implements NativeResource {

        private static final VkViewport ELEMENT_FACTORY = VkViewport.create(-1L);

        /**
         * Creates a new {@code VkViewport.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkViewport#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkViewport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        public float x() { return VkViewport.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return VkViewport.ny(address()); }
        /** @return the value of the {@code width} field. */
        public float width() { return VkViewport.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public float height() { return VkViewport.nheight(address()); }
        /** @return the value of the {@code minDepth} field. */
        public float minDepth() { return VkViewport.nminDepth(address()); }
        /** @return the value of the {@code maxDepth} field. */
        public float maxDepth() { return VkViewport.nmaxDepth(address()); }

        /** Sets the specified value to the {@code x} field. */
        public VkViewport.Buffer x(float value) { VkViewport.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public VkViewport.Buffer y(float value) { VkViewport.ny(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public VkViewport.Buffer width(float value) { VkViewport.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkViewport.Buffer height(float value) { VkViewport.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code minDepth} field. */
        public VkViewport.Buffer minDepth(float value) { VkViewport.nminDepth(address(), value); return this; }
        /** Sets the specified value to the {@code maxDepth} field. */
        public VkViewport.Buffer maxDepth(float value) { VkViewport.nmaxDepth(address(), value); return this; }

    }

}
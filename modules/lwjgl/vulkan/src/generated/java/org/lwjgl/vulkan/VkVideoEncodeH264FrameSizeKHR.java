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
 * struct VkVideoEncodeH264FrameSizeKHR {
 *     uint32_t frameISize;
 *     uint32_t framePSize;
 *     uint32_t frameBSize;
 * }}</pre>
 */
public class VkVideoEncodeH264FrameSizeKHR extends Struct<VkVideoEncodeH264FrameSizeKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAMEISIZE,
        FRAMEPSIZE,
        FRAMEBSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRAMEISIZE = layout.offsetof(0);
        FRAMEPSIZE = layout.offsetof(1);
        FRAMEBSIZE = layout.offsetof(2);
    }

    protected VkVideoEncodeH264FrameSizeKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH264FrameSizeKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264FrameSizeKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH264FrameSizeKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH264FrameSizeKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code frameISize} field. */
    @NativeType("uint32_t")
    public int frameISize() { return nframeISize(address()); }
    /** @return the value of the {@code framePSize} field. */
    @NativeType("uint32_t")
    public int framePSize() { return nframePSize(address()); }
    /** @return the value of the {@code frameBSize} field. */
    @NativeType("uint32_t")
    public int frameBSize() { return nframeBSize(address()); }

    /** Sets the specified value to the {@code frameISize} field. */
    public VkVideoEncodeH264FrameSizeKHR frameISize(@NativeType("uint32_t") int value) { nframeISize(address(), value); return this; }
    /** Sets the specified value to the {@code framePSize} field. */
    public VkVideoEncodeH264FrameSizeKHR framePSize(@NativeType("uint32_t") int value) { nframePSize(address(), value); return this; }
    /** Sets the specified value to the {@code frameBSize} field. */
    public VkVideoEncodeH264FrameSizeKHR frameBSize(@NativeType("uint32_t") int value) { nframeBSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH264FrameSizeKHR set(
        int frameISize,
        int framePSize,
        int frameBSize
    ) {
        frameISize(frameISize);
        framePSize(framePSize);
        frameBSize(frameBSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH264FrameSizeKHR set(VkVideoEncodeH264FrameSizeKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH264FrameSizeKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264FrameSizeKHR malloc() {
        return new VkVideoEncodeH264FrameSizeKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264FrameSizeKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH264FrameSizeKHR calloc() {
        return new VkVideoEncodeH264FrameSizeKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH264FrameSizeKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH264FrameSizeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264FrameSizeKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH264FrameSizeKHR} instance for the specified memory address. */
    public static VkVideoEncodeH264FrameSizeKHR create(long address) {
        return new VkVideoEncodeH264FrameSizeKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH264FrameSizeKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH264FrameSizeKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264FrameSizeKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264FrameSizeKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264FrameSizeKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264FrameSizeKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264FrameSizeKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264FrameSizeKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH264FrameSizeKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264FrameSizeKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH264FrameSizeKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264FrameSizeKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264FrameSizeKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264FrameSizeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH264FrameSizeKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH264FrameSizeKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264FrameSizeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264FrameSizeKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264FrameSizeKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH264FrameSizeKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH264FrameSizeKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #frameISize}. */
    public static int nframeISize(long struct) { return memGetInt(struct + VkVideoEncodeH264FrameSizeKHR.FRAMEISIZE); }
    /** Unsafe version of {@link #framePSize}. */
    public static int nframePSize(long struct) { return memGetInt(struct + VkVideoEncodeH264FrameSizeKHR.FRAMEPSIZE); }
    /** Unsafe version of {@link #frameBSize}. */
    public static int nframeBSize(long struct) { return memGetInt(struct + VkVideoEncodeH264FrameSizeKHR.FRAMEBSIZE); }

    /** Unsafe version of {@link #frameISize(int) frameISize}. */
    public static void nframeISize(long struct, int value) { memPutInt(struct + VkVideoEncodeH264FrameSizeKHR.FRAMEISIZE, value); }
    /** Unsafe version of {@link #framePSize(int) framePSize}. */
    public static void nframePSize(long struct, int value) { memPutInt(struct + VkVideoEncodeH264FrameSizeKHR.FRAMEPSIZE, value); }
    /** Unsafe version of {@link #frameBSize(int) frameBSize}. */
    public static void nframeBSize(long struct, int value) { memPutInt(struct + VkVideoEncodeH264FrameSizeKHR.FRAMEBSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH264FrameSizeKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264FrameSizeKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH264FrameSizeKHR ELEMENT_FACTORY = VkVideoEncodeH264FrameSizeKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH264FrameSizeKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH264FrameSizeKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH264FrameSizeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code frameISize} field. */
        @NativeType("uint32_t")
        public int frameISize() { return VkVideoEncodeH264FrameSizeKHR.nframeISize(address()); }
        /** @return the value of the {@code framePSize} field. */
        @NativeType("uint32_t")
        public int framePSize() { return VkVideoEncodeH264FrameSizeKHR.nframePSize(address()); }
        /** @return the value of the {@code frameBSize} field. */
        @NativeType("uint32_t")
        public int frameBSize() { return VkVideoEncodeH264FrameSizeKHR.nframeBSize(address()); }

        /** Sets the specified value to the {@code frameISize} field. */
        public VkVideoEncodeH264FrameSizeKHR.Buffer frameISize(@NativeType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.nframeISize(address(), value); return this; }
        /** Sets the specified value to the {@code framePSize} field. */
        public VkVideoEncodeH264FrameSizeKHR.Buffer framePSize(@NativeType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.nframePSize(address(), value); return this; }
        /** Sets the specified value to the {@code frameBSize} field. */
        public VkVideoEncodeH264FrameSizeKHR.Buffer frameBSize(@NativeType("uint32_t") int value) { VkVideoEncodeH264FrameSizeKHR.nframeBSize(address(), value); return this; }

    }

}
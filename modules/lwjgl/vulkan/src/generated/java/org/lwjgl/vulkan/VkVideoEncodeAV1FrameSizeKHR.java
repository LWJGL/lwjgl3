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
 * struct VkVideoEncodeAV1FrameSizeKHR {
 *     uint32_t intraFrameSize;
 *     uint32_t predictiveFrameSize;
 *     uint32_t bipredictiveFrameSize;
 * }}</pre>
 */
public class VkVideoEncodeAV1FrameSizeKHR extends Struct<VkVideoEncodeAV1FrameSizeKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INTRAFRAMESIZE,
        PREDICTIVEFRAMESIZE,
        BIPREDICTIVEFRAMESIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INTRAFRAMESIZE = layout.offsetof(0);
        PREDICTIVEFRAMESIZE = layout.offsetof(1);
        BIPREDICTIVEFRAMESIZE = layout.offsetof(2);
    }

    protected VkVideoEncodeAV1FrameSizeKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeAV1FrameSizeKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeAV1FrameSizeKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeAV1FrameSizeKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeAV1FrameSizeKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code intraFrameSize} field. */
    @NativeType("uint32_t")
    public int intraFrameSize() { return nintraFrameSize(address()); }
    /** @return the value of the {@code predictiveFrameSize} field. */
    @NativeType("uint32_t")
    public int predictiveFrameSize() { return npredictiveFrameSize(address()); }
    /** @return the value of the {@code bipredictiveFrameSize} field. */
    @NativeType("uint32_t")
    public int bipredictiveFrameSize() { return nbipredictiveFrameSize(address()); }

    /** Sets the specified value to the {@code intraFrameSize} field. */
    public VkVideoEncodeAV1FrameSizeKHR intraFrameSize(@NativeType("uint32_t") int value) { nintraFrameSize(address(), value); return this; }
    /** Sets the specified value to the {@code predictiveFrameSize} field. */
    public VkVideoEncodeAV1FrameSizeKHR predictiveFrameSize(@NativeType("uint32_t") int value) { npredictiveFrameSize(address(), value); return this; }
    /** Sets the specified value to the {@code bipredictiveFrameSize} field. */
    public VkVideoEncodeAV1FrameSizeKHR bipredictiveFrameSize(@NativeType("uint32_t") int value) { nbipredictiveFrameSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeAV1FrameSizeKHR set(
        int intraFrameSize,
        int predictiveFrameSize,
        int bipredictiveFrameSize
    ) {
        intraFrameSize(intraFrameSize);
        predictiveFrameSize(predictiveFrameSize);
        bipredictiveFrameSize(bipredictiveFrameSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeAV1FrameSizeKHR set(VkVideoEncodeAV1FrameSizeKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeAV1FrameSizeKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1FrameSizeKHR malloc() {
        return new VkVideoEncodeAV1FrameSizeKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1FrameSizeKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeAV1FrameSizeKHR calloc() {
        return new VkVideoEncodeAV1FrameSizeKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeAV1FrameSizeKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeAV1FrameSizeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1FrameSizeKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeAV1FrameSizeKHR} instance for the specified memory address. */
    public static VkVideoEncodeAV1FrameSizeKHR create(long address) {
        return new VkVideoEncodeAV1FrameSizeKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeAV1FrameSizeKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeAV1FrameSizeKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1FrameSizeKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1FrameSizeKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1FrameSizeKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1FrameSizeKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1FrameSizeKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1FrameSizeKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeAV1FrameSizeKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1FrameSizeKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeAV1FrameSizeKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1FrameSizeKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1FrameSizeKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1FrameSizeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeAV1FrameSizeKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeAV1FrameSizeKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1FrameSizeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1FrameSizeKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1FrameSizeKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeAV1FrameSizeKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeAV1FrameSizeKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #intraFrameSize}. */
    public static int nintraFrameSize(long struct) { return memGetInt(struct + VkVideoEncodeAV1FrameSizeKHR.INTRAFRAMESIZE); }
    /** Unsafe version of {@link #predictiveFrameSize}. */
    public static int npredictiveFrameSize(long struct) { return memGetInt(struct + VkVideoEncodeAV1FrameSizeKHR.PREDICTIVEFRAMESIZE); }
    /** Unsafe version of {@link #bipredictiveFrameSize}. */
    public static int nbipredictiveFrameSize(long struct) { return memGetInt(struct + VkVideoEncodeAV1FrameSizeKHR.BIPREDICTIVEFRAMESIZE); }

    /** Unsafe version of {@link #intraFrameSize(int) intraFrameSize}. */
    public static void nintraFrameSize(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1FrameSizeKHR.INTRAFRAMESIZE, value); }
    /** Unsafe version of {@link #predictiveFrameSize(int) predictiveFrameSize}. */
    public static void npredictiveFrameSize(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1FrameSizeKHR.PREDICTIVEFRAMESIZE, value); }
    /** Unsafe version of {@link #bipredictiveFrameSize(int) bipredictiveFrameSize}. */
    public static void nbipredictiveFrameSize(long struct, int value) { memPutInt(struct + VkVideoEncodeAV1FrameSizeKHR.BIPREDICTIVEFRAMESIZE, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeAV1FrameSizeKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1FrameSizeKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeAV1FrameSizeKHR ELEMENT_FACTORY = VkVideoEncodeAV1FrameSizeKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeAV1FrameSizeKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeAV1FrameSizeKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeAV1FrameSizeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code intraFrameSize} field. */
        @NativeType("uint32_t")
        public int intraFrameSize() { return VkVideoEncodeAV1FrameSizeKHR.nintraFrameSize(address()); }
        /** @return the value of the {@code predictiveFrameSize} field. */
        @NativeType("uint32_t")
        public int predictiveFrameSize() { return VkVideoEncodeAV1FrameSizeKHR.npredictiveFrameSize(address()); }
        /** @return the value of the {@code bipredictiveFrameSize} field. */
        @NativeType("uint32_t")
        public int bipredictiveFrameSize() { return VkVideoEncodeAV1FrameSizeKHR.nbipredictiveFrameSize(address()); }

        /** Sets the specified value to the {@code intraFrameSize} field. */
        public VkVideoEncodeAV1FrameSizeKHR.Buffer intraFrameSize(@NativeType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.nintraFrameSize(address(), value); return this; }
        /** Sets the specified value to the {@code predictiveFrameSize} field. */
        public VkVideoEncodeAV1FrameSizeKHR.Buffer predictiveFrameSize(@NativeType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.npredictiveFrameSize(address(), value); return this; }
        /** Sets the specified value to the {@code bipredictiveFrameSize} field. */
        public VkVideoEncodeAV1FrameSizeKHR.Buffer bipredictiveFrameSize(@NativeType("uint32_t") int value) { VkVideoEncodeAV1FrameSizeKHR.nbipredictiveFrameSize(address(), value); return this; }

    }

}
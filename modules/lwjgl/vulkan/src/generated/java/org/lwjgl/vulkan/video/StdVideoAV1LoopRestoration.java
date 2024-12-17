/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*;

/**
 * <pre>{@code
 * struct StdVideoAV1LoopRestoration {
 *     StdVideoAV1FrameRestorationType FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES];
 *     uint16_t LoopRestorationSize[STD_VIDEO_AV1_MAX_NUM_PLANES];
 * }}</pre>
 */
public class StdVideoAV1LoopRestoration extends Struct<StdVideoAV1LoopRestoration> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAMERESTORATIONTYPE,
        LOOPRESTORATIONSIZE;

    static {
        Layout layout = __struct(
            __array(4, STD_VIDEO_AV1_MAX_NUM_PLANES),
            __array(2, STD_VIDEO_AV1_MAX_NUM_PLANES)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FRAMERESTORATIONTYPE = layout.offsetof(0);
        LOOPRESTORATIONSIZE = layout.offsetof(1);
    }

    protected StdVideoAV1LoopRestoration(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1LoopRestoration create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1LoopRestoration(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1LoopRestoration} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1LoopRestoration(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the {@code FrameRestorationType} field. */
    @NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]")
    public IntBuffer FrameRestorationType() { return nFrameRestorationType(address()); }
    /** @return the value at the specified index of the {@code FrameRestorationType} field. */
    @NativeType("StdVideoAV1FrameRestorationType")
    public int FrameRestorationType(int index) { return nFrameRestorationType(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code LoopRestorationSize} field. */
    @NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]")
    public ShortBuffer LoopRestorationSize() { return nLoopRestorationSize(address()); }
    /** @return the value at the specified index of the {@code LoopRestorationSize} field. */
    @NativeType("uint16_t")
    public short LoopRestorationSize(int index) { return nLoopRestorationSize(address(), index); }

    /** Copies the specified {@link IntBuffer} to the {@code FrameRestorationType} field. */
    public StdVideoAV1LoopRestoration FrameRestorationType(@NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]") IntBuffer value) { nFrameRestorationType(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code FrameRestorationType} field. */
    public StdVideoAV1LoopRestoration FrameRestorationType(int index, @NativeType("StdVideoAV1FrameRestorationType") int value) { nFrameRestorationType(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code LoopRestorationSize} field. */
    public StdVideoAV1LoopRestoration LoopRestorationSize(@NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]") ShortBuffer value) { nLoopRestorationSize(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code LoopRestorationSize} field. */
    public StdVideoAV1LoopRestoration LoopRestorationSize(int index, @NativeType("uint16_t") short value) { nLoopRestorationSize(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1LoopRestoration set(
        IntBuffer FrameRestorationType,
        ShortBuffer LoopRestorationSize
    ) {
        FrameRestorationType(FrameRestorationType);
        LoopRestorationSize(LoopRestorationSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1LoopRestoration set(StdVideoAV1LoopRestoration src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1LoopRestoration} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1LoopRestoration malloc() {
        return new StdVideoAV1LoopRestoration(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1LoopRestoration} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1LoopRestoration calloc() {
        return new StdVideoAV1LoopRestoration(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1LoopRestoration} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1LoopRestoration create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1LoopRestoration(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1LoopRestoration} instance for the specified memory address. */
    public static StdVideoAV1LoopRestoration create(long address) {
        return new StdVideoAV1LoopRestoration(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1LoopRestoration createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1LoopRestoration(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopRestoration.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopRestoration.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopRestoration.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopRestoration.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopRestoration.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopRestoration.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1LoopRestoration.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopRestoration.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1LoopRestoration.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1LoopRestoration} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1LoopRestoration malloc(MemoryStack stack) {
        return new StdVideoAV1LoopRestoration(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1LoopRestoration} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1LoopRestoration calloc(MemoryStack stack) {
        return new StdVideoAV1LoopRestoration(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopRestoration.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopRestoration.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1LoopRestoration.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1LoopRestoration.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #FrameRestorationType}. */
    public static IntBuffer nFrameRestorationType(long struct) { return memIntBuffer(struct + StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE, STD_VIDEO_AV1_MAX_NUM_PLANES); }
    /** Unsafe version of {@link #FrameRestorationType(int) FrameRestorationType}. */
    public static int nFrameRestorationType(long struct, int index) {
        return memGetInt(struct + StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE + check(index, STD_VIDEO_AV1_MAX_NUM_PLANES) * 4);
    }
    /** Unsafe version of {@link #LoopRestorationSize}. */
    public static ShortBuffer nLoopRestorationSize(long struct) { return memShortBuffer(struct + StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE, STD_VIDEO_AV1_MAX_NUM_PLANES); }
    /** Unsafe version of {@link #LoopRestorationSize(int) LoopRestorationSize}. */
    public static short nLoopRestorationSize(long struct, int index) {
        return memGetShort(struct + StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE + check(index, STD_VIDEO_AV1_MAX_NUM_PLANES) * 2);
    }

    /** Unsafe version of {@link #FrameRestorationType(IntBuffer) FrameRestorationType}. */
    public static void nFrameRestorationType(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_PLANES); }
        memCopy(memAddress(value), struct + StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #FrameRestorationType(int, int) FrameRestorationType}. */
    public static void nFrameRestorationType(long struct, int index, int value) {
        memPutInt(struct + StdVideoAV1LoopRestoration.FRAMERESTORATIONTYPE + check(index, STD_VIDEO_AV1_MAX_NUM_PLANES) * 4, value);
    }
    /** Unsafe version of {@link #LoopRestorationSize(ShortBuffer) LoopRestorationSize}. */
    public static void nLoopRestorationSize(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_MAX_NUM_PLANES); }
        memCopy(memAddress(value), struct + StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE, value.remaining() * 2);
    }
    /** Unsafe version of {@link #LoopRestorationSize(int, short) LoopRestorationSize}. */
    public static void nLoopRestorationSize(long struct, int index, short value) {
        memPutShort(struct + StdVideoAV1LoopRestoration.LOOPRESTORATIONSIZE + check(index, STD_VIDEO_AV1_MAX_NUM_PLANES) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoAV1LoopRestoration} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1LoopRestoration, Buffer> implements NativeResource {

        private static final StdVideoAV1LoopRestoration ELEMENT_FACTORY = StdVideoAV1LoopRestoration.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1LoopRestoration.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1LoopRestoration#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1LoopRestoration getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@code FrameRestorationType} field. */
        @NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]")
        public IntBuffer FrameRestorationType() { return StdVideoAV1LoopRestoration.nFrameRestorationType(address()); }
        /** @return the value at the specified index of the {@code FrameRestorationType} field. */
        @NativeType("StdVideoAV1FrameRestorationType")
        public int FrameRestorationType(int index) { return StdVideoAV1LoopRestoration.nFrameRestorationType(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code LoopRestorationSize} field. */
        @NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]")
        public ShortBuffer LoopRestorationSize() { return StdVideoAV1LoopRestoration.nLoopRestorationSize(address()); }
        /** @return the value at the specified index of the {@code LoopRestorationSize} field. */
        @NativeType("uint16_t")
        public short LoopRestorationSize(int index) { return StdVideoAV1LoopRestoration.nLoopRestorationSize(address(), index); }

        /** Copies the specified {@link IntBuffer} to the {@code FrameRestorationType} field. */
        public StdVideoAV1LoopRestoration.Buffer FrameRestorationType(@NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]") IntBuffer value) { StdVideoAV1LoopRestoration.nFrameRestorationType(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code FrameRestorationType} field. */
        public StdVideoAV1LoopRestoration.Buffer FrameRestorationType(int index, @NativeType("StdVideoAV1FrameRestorationType") int value) { StdVideoAV1LoopRestoration.nFrameRestorationType(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code LoopRestorationSize} field. */
        public StdVideoAV1LoopRestoration.Buffer LoopRestorationSize(@NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]") ShortBuffer value) { StdVideoAV1LoopRestoration.nLoopRestorationSize(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code LoopRestorationSize} field. */
        public StdVideoAV1LoopRestoration.Buffer LoopRestorationSize(int index, @NativeType("uint16_t") short value) { StdVideoAV1LoopRestoration.nLoopRestorationSize(address(), index, value); return this; }

    }

}
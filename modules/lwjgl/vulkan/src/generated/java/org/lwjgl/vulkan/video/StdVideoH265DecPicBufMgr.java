/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265DecPicBufMgr {
 *     uint32_t max_latency_increase_plus1[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE];
 *     uint8_t max_dec_pic_buffering_minus1[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE];
 *     uint8_t max_num_reorder_pics[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE];
 * }</code></pre>
 */
public class StdVideoH265DecPicBufMgr extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAX_LATENCY_INCREASE_PLUS1,
        MAX_DEC_PIC_BUFFERING_MINUS1,
        MAX_NUM_REORDER_PICS;

    static {
        Layout layout = __struct(
            __array(4, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE),
            __array(1, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE),
            __array(1, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAX_LATENCY_INCREASE_PLUS1 = layout.offsetof(0);
        MAX_DEC_PIC_BUFFERING_MINUS1 = layout.offsetof(1);
        MAX_NUM_REORDER_PICS = layout.offsetof(2);
    }

    /**
     * Creates a {@code StdVideoH265DecPicBufMgr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265DecPicBufMgr(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the {@code max_latency_increase_plus1} field. */
    @NativeType("uint32_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
    public IntBuffer max_latency_increase_plus1() { return nmax_latency_increase_plus1(address()); }
    /** @return the value at the specified index of the {@code max_latency_increase_plus1} field. */
    @NativeType("uint32_t")
    public int max_latency_increase_plus1(int index) { return nmax_latency_increase_plus1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code max_dec_pic_buffering_minus1} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
    public ByteBuffer max_dec_pic_buffering_minus1() { return nmax_dec_pic_buffering_minus1(address()); }
    /** @return the value at the specified index of the {@code max_dec_pic_buffering_minus1} field. */
    @NativeType("uint8_t")
    public byte max_dec_pic_buffering_minus1(int index) { return nmax_dec_pic_buffering_minus1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code max_num_reorder_pics} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
    public ByteBuffer max_num_reorder_pics() { return nmax_num_reorder_pics(address()); }
    /** @return the value at the specified index of the {@code max_num_reorder_pics} field. */
    @NativeType("uint8_t")
    public byte max_num_reorder_pics(int index) { return nmax_num_reorder_pics(address(), index); }

    /** Copies the specified {@link IntBuffer} to the {@code max_latency_increase_plus1} field. */
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(@NativeType("uint32_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") IntBuffer value) { nmax_latency_increase_plus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code max_latency_increase_plus1} field. */
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(int index, @NativeType("uint32_t") int value) { nmax_latency_increase_plus1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code max_dec_pic_buffering_minus1} field. */
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") ByteBuffer value) { nmax_dec_pic_buffering_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code max_dec_pic_buffering_minus1} field. */
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(int index, @NativeType("uint8_t") byte value) { nmax_dec_pic_buffering_minus1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code max_num_reorder_pics} field. */
    public StdVideoH265DecPicBufMgr max_num_reorder_pics(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") ByteBuffer value) { nmax_num_reorder_pics(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code max_num_reorder_pics} field. */
    public StdVideoH265DecPicBufMgr max_num_reorder_pics(int index, @NativeType("uint8_t") byte value) { nmax_num_reorder_pics(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265DecPicBufMgr set(
        IntBuffer max_latency_increase_plus1,
        ByteBuffer max_dec_pic_buffering_minus1,
        ByteBuffer max_num_reorder_pics
    ) {
        max_latency_increase_plus1(max_latency_increase_plus1);
        max_dec_pic_buffering_minus1(max_dec_pic_buffering_minus1);
        max_num_reorder_pics(max_num_reorder_pics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265DecPicBufMgr set(StdVideoH265DecPicBufMgr src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265DecPicBufMgr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265DecPicBufMgr malloc() {
        return wrap(StdVideoH265DecPicBufMgr.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265DecPicBufMgr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265DecPicBufMgr calloc() {
        return wrap(StdVideoH265DecPicBufMgr.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265DecPicBufMgr} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265DecPicBufMgr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265DecPicBufMgr.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265DecPicBufMgr} instance for the specified memory address. */
    public static StdVideoH265DecPicBufMgr create(long address) {
        return wrap(StdVideoH265DecPicBufMgr.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265DecPicBufMgr createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265DecPicBufMgr.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265DecPicBufMgr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265DecPicBufMgr.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265DecPicBufMgr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265DecPicBufMgr.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265DecPicBufMgr.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265DecPicBufMgr.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265DecPicBufMgr.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265DecPicBufMgr.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265DecPicBufMgr.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265DecPicBufMgr} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265DecPicBufMgr malloc(MemoryStack stack) {
        return wrap(StdVideoH265DecPicBufMgr.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265DecPicBufMgr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265DecPicBufMgr calloc(MemoryStack stack) {
        return wrap(StdVideoH265DecPicBufMgr.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265DecPicBufMgr.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265DecPicBufMgr.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265DecPicBufMgr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265DecPicBufMgr.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #max_latency_increase_plus1}. */
    public static IntBuffer nmax_latency_increase_plus1(long struct) { return memIntBuffer(struct + StdVideoH265DecPicBufMgr.MAX_LATENCY_INCREASE_PLUS1, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
    /** Unsafe version of {@link #max_latency_increase_plus1(int) max_latency_increase_plus1}. */
    public static int nmax_latency_increase_plus1(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoH265DecPicBufMgr.MAX_LATENCY_INCREASE_PLUS1 + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 4);
    }
    /** Unsafe version of {@link #max_dec_pic_buffering_minus1}. */
    public static ByteBuffer nmax_dec_pic_buffering_minus1(long struct) { return memByteBuffer(struct + StdVideoH265DecPicBufMgr.MAX_DEC_PIC_BUFFERING_MINUS1, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
    /** Unsafe version of {@link #max_dec_pic_buffering_minus1(int) max_dec_pic_buffering_minus1}. */
    public static byte nmax_dec_pic_buffering_minus1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265DecPicBufMgr.MAX_DEC_PIC_BUFFERING_MINUS1 + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #max_num_reorder_pics}. */
    public static ByteBuffer nmax_num_reorder_pics(long struct) { return memByteBuffer(struct + StdVideoH265DecPicBufMgr.MAX_NUM_REORDER_PICS, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
    /** Unsafe version of {@link #max_num_reorder_pics(int) max_num_reorder_pics}. */
    public static byte nmax_num_reorder_pics(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265DecPicBufMgr.MAX_NUM_REORDER_PICS + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 1);
    }

    /** Unsafe version of {@link #max_latency_increase_plus1(IntBuffer) max_latency_increase_plus1}. */
    public static void nmax_latency_increase_plus1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265DecPicBufMgr.MAX_LATENCY_INCREASE_PLUS1, value.remaining() * 4);
    }
    /** Unsafe version of {@link #max_latency_increase_plus1(int, int) max_latency_increase_plus1}. */
    public static void nmax_latency_increase_plus1(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoH265DecPicBufMgr.MAX_LATENCY_INCREASE_PLUS1 + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 4, value);
    }
    /** Unsafe version of {@link #max_dec_pic_buffering_minus1(ByteBuffer) max_dec_pic_buffering_minus1}. */
    public static void nmax_dec_pic_buffering_minus1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265DecPicBufMgr.MAX_DEC_PIC_BUFFERING_MINUS1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #max_dec_pic_buffering_minus1(int, byte) max_dec_pic_buffering_minus1}. */
    public static void nmax_dec_pic_buffering_minus1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265DecPicBufMgr.MAX_DEC_PIC_BUFFERING_MINUS1 + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #max_num_reorder_pics(ByteBuffer) max_num_reorder_pics}. */
    public static void nmax_num_reorder_pics(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265DecPicBufMgr.MAX_NUM_REORDER_PICS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #max_num_reorder_pics(int, byte) max_num_reorder_pics}. */
    public static void nmax_num_reorder_pics(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265DecPicBufMgr.MAX_NUM_REORDER_PICS + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265DecPicBufMgr} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265DecPicBufMgr, Buffer> implements NativeResource {

        private static final StdVideoH265DecPicBufMgr ELEMENT_FACTORY = StdVideoH265DecPicBufMgr.create(-1L);

        /**
         * Creates a new {@code StdVideoH265DecPicBufMgr.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265DecPicBufMgr#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265DecPicBufMgr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@code max_latency_increase_plus1} field. */
        @NativeType("uint32_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
        public IntBuffer max_latency_increase_plus1() { return StdVideoH265DecPicBufMgr.nmax_latency_increase_plus1(address()); }
        /** @return the value at the specified index of the {@code max_latency_increase_plus1} field. */
        @NativeType("uint32_t")
        public int max_latency_increase_plus1(int index) { return StdVideoH265DecPicBufMgr.nmax_latency_increase_plus1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code max_dec_pic_buffering_minus1} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
        public ByteBuffer max_dec_pic_buffering_minus1() { return StdVideoH265DecPicBufMgr.nmax_dec_pic_buffering_minus1(address()); }
        /** @return the value at the specified index of the {@code max_dec_pic_buffering_minus1} field. */
        @NativeType("uint8_t")
        public byte max_dec_pic_buffering_minus1(int index) { return StdVideoH265DecPicBufMgr.nmax_dec_pic_buffering_minus1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code max_num_reorder_pics} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
        public ByteBuffer max_num_reorder_pics() { return StdVideoH265DecPicBufMgr.nmax_num_reorder_pics(address()); }
        /** @return the value at the specified index of the {@code max_num_reorder_pics} field. */
        @NativeType("uint8_t")
        public byte max_num_reorder_pics(int index) { return StdVideoH265DecPicBufMgr.nmax_num_reorder_pics(address(), index); }

        /** Copies the specified {@link IntBuffer} to the {@code max_latency_increase_plus1} field. */
        public StdVideoH265DecPicBufMgr.Buffer max_latency_increase_plus1(@NativeType("uint32_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") IntBuffer value) { StdVideoH265DecPicBufMgr.nmax_latency_increase_plus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code max_latency_increase_plus1} field. */
        public StdVideoH265DecPicBufMgr.Buffer max_latency_increase_plus1(int index, @NativeType("uint32_t") int value) { StdVideoH265DecPicBufMgr.nmax_latency_increase_plus1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code max_dec_pic_buffering_minus1} field. */
        public StdVideoH265DecPicBufMgr.Buffer max_dec_pic_buffering_minus1(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") ByteBuffer value) { StdVideoH265DecPicBufMgr.nmax_dec_pic_buffering_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code max_dec_pic_buffering_minus1} field. */
        public StdVideoH265DecPicBufMgr.Buffer max_dec_pic_buffering_minus1(int index, @NativeType("uint8_t") byte value) { StdVideoH265DecPicBufMgr.nmax_dec_pic_buffering_minus1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code max_num_reorder_pics} field. */
        public StdVideoH265DecPicBufMgr.Buffer max_num_reorder_pics(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") ByteBuffer value) { StdVideoH265DecPicBufMgr.nmax_num_reorder_pics(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code max_num_reorder_pics} field. */
        public StdVideoH265DecPicBufMgr.Buffer max_num_reorder_pics(int index, @NativeType("uint8_t") byte value) { StdVideoH265DecPicBufMgr.nmax_num_reorder_pics(address(), index, value); return this; }

    }

}
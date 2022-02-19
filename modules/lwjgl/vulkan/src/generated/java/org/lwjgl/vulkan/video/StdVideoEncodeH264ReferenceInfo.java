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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoEncodeH264ReferenceInfo {
 *     {@link StdVideoEncodeH264ReferenceInfoFlags StdVideoEncodeH264ReferenceInfoFlags} flags;
 *     uint32_t FrameNum;
 *     int32_t PicOrderCnt;
 *     uint16_t long_term_pic_num;
 *     uint16_t long_term_frame_idx;
 * }</code></pre>
 */
public class StdVideoEncodeH264ReferenceInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        FRAMENUM,
        PICORDERCNT,
        LONG_TERM_PIC_NUM,
        LONG_TERM_FRAME_IDX;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264ReferenceInfoFlags.SIZEOF, StdVideoEncodeH264ReferenceInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        FRAMENUM = layout.offsetof(1);
        PICORDERCNT = layout.offsetof(2);
        LONG_TERM_PIC_NUM = layout.offsetof(3);
        LONG_TERM_FRAME_IDX = layout.offsetof(4);
    }

    /**
     * Creates a {@code StdVideoEncodeH264ReferenceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264ReferenceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264ReferenceInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264ReferenceInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code FrameNum} field. */
    @NativeType("uint32_t")
    public int FrameNum() { return nFrameNum(address()); }
    /** @return the value of the {@code PicOrderCnt} field. */
    @NativeType("int32_t")
    public int PicOrderCnt() { return nPicOrderCnt(address()); }
    /** @return the value of the {@code long_term_pic_num} field. */
    @NativeType("uint16_t")
    public short long_term_pic_num() { return nlong_term_pic_num(address()); }
    /** @return the value of the {@code long_term_frame_idx} field. */
    @NativeType("uint16_t")
    public short long_term_frame_idx() { return nlong_term_frame_idx(address()); }

    /** Copies the specified {@link StdVideoEncodeH264ReferenceInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH264ReferenceInfo flags(StdVideoEncodeH264ReferenceInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264ReferenceInfo flags(java.util.function.Consumer<StdVideoEncodeH264ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code FrameNum} field. */
    public StdVideoEncodeH264ReferenceInfo FrameNum(@NativeType("uint32_t") int value) { nFrameNum(address(), value); return this; }
    /** Sets the specified value to the {@code PicOrderCnt} field. */
    public StdVideoEncodeH264ReferenceInfo PicOrderCnt(@NativeType("int32_t") int value) { nPicOrderCnt(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_pic_num} field. */
    public StdVideoEncodeH264ReferenceInfo long_term_pic_num(@NativeType("uint16_t") short value) { nlong_term_pic_num(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_frame_idx} field. */
    public StdVideoEncodeH264ReferenceInfo long_term_frame_idx(@NativeType("uint16_t") short value) { nlong_term_frame_idx(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264ReferenceInfo set(
        StdVideoEncodeH264ReferenceInfoFlags flags,
        int FrameNum,
        int PicOrderCnt,
        short long_term_pic_num,
        short long_term_frame_idx
    ) {
        flags(flags);
        FrameNum(FrameNum);
        PicOrderCnt(PicOrderCnt);
        long_term_pic_num(long_term_pic_num);
        long_term_frame_idx(long_term_frame_idx);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264ReferenceInfo set(StdVideoEncodeH264ReferenceInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceInfo malloc() {
        return wrap(StdVideoEncodeH264ReferenceInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264ReferenceInfo calloc() {
        return wrap(StdVideoEncodeH264ReferenceInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH264ReferenceInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance for the specified memory address. */
    public static StdVideoEncodeH264ReferenceInfo create(long address) {
        return wrap(StdVideoEncodeH264ReferenceInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264ReferenceInfo createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH264ReferenceInfo.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264ReferenceInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceInfo malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264ReferenceInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH264ReferenceInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264ReferenceInfo calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264ReferenceInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264ReferenceInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264ReferenceInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264ReferenceInfoFlags nflags(long struct) { return StdVideoEncodeH264ReferenceInfoFlags.create(struct + StdVideoEncodeH264ReferenceInfo.FLAGS); }
    /** Unsafe version of {@link #FrameNum}. */
    public static int nFrameNum(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264ReferenceInfo.FRAMENUM); }
    /** Unsafe version of {@link #PicOrderCnt}. */
    public static int nPicOrderCnt(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264ReferenceInfo.PICORDERCNT); }
    /** Unsafe version of {@link #long_term_pic_num}. */
    public static short nlong_term_pic_num(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264ReferenceInfo.LONG_TERM_PIC_NUM); }
    /** Unsafe version of {@link #long_term_frame_idx}. */
    public static short nlong_term_frame_idx(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264ReferenceInfo.LONG_TERM_FRAME_IDX); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264ReferenceInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264ReferenceInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264ReferenceInfo.FLAGS, StdVideoEncodeH264ReferenceInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #FrameNum(int) FrameNum}. */
    public static void nFrameNum(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264ReferenceInfo.FRAMENUM, value); }
    /** Unsafe version of {@link #PicOrderCnt(int) PicOrderCnt}. */
    public static void nPicOrderCnt(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264ReferenceInfo.PICORDERCNT, value); }
    /** Unsafe version of {@link #long_term_pic_num(short) long_term_pic_num}. */
    public static void nlong_term_pic_num(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264ReferenceInfo.LONG_TERM_PIC_NUM, value); }
    /** Unsafe version of {@link #long_term_frame_idx(short) long_term_frame_idx}. */
    public static void nlong_term_frame_idx(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264ReferenceInfo.LONG_TERM_FRAME_IDX, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264ReferenceInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264ReferenceInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264ReferenceInfo ELEMENT_FACTORY = StdVideoEncodeH264ReferenceInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264ReferenceInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264ReferenceInfo#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH264ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264ReferenceInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264ReferenceInfoFlags flags() { return StdVideoEncodeH264ReferenceInfo.nflags(address()); }
        /** @return the value of the {@code FrameNum} field. */
        @NativeType("uint32_t")
        public int FrameNum() { return StdVideoEncodeH264ReferenceInfo.nFrameNum(address()); }
        /** @return the value of the {@code PicOrderCnt} field. */
        @NativeType("int32_t")
        public int PicOrderCnt() { return StdVideoEncodeH264ReferenceInfo.nPicOrderCnt(address()); }
        /** @return the value of the {@code long_term_pic_num} field. */
        @NativeType("uint16_t")
        public short long_term_pic_num() { return StdVideoEncodeH264ReferenceInfo.nlong_term_pic_num(address()); }
        /** @return the value of the {@code long_term_frame_idx} field. */
        @NativeType("uint16_t")
        public short long_term_frame_idx() { return StdVideoEncodeH264ReferenceInfo.nlong_term_frame_idx(address()); }

        /** Copies the specified {@link StdVideoEncodeH264ReferenceInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer flags(StdVideoEncodeH264ReferenceInfoFlags value) { StdVideoEncodeH264ReferenceInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264ReferenceInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264ReferenceInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code FrameNum} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer FrameNum(@NativeType("uint32_t") int value) { StdVideoEncodeH264ReferenceInfo.nFrameNum(address(), value); return this; }
        /** Sets the specified value to the {@code PicOrderCnt} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer PicOrderCnt(@NativeType("int32_t") int value) { StdVideoEncodeH264ReferenceInfo.nPicOrderCnt(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_pic_num} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer long_term_pic_num(@NativeType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.nlong_term_pic_num(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_frame_idx} field. */
        public StdVideoEncodeH264ReferenceInfo.Buffer long_term_frame_idx(@NativeType("uint16_t") short value) { StdVideoEncodeH264ReferenceInfo.nlong_term_frame_idx(address(), value); return this; }

    }

}
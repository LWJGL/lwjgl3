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
 * struct StdVideoEncodeH264PictureInfo {
 *     {@link StdVideoEncodeH264PictureInfoFlags StdVideoEncodeH264PictureInfoFlags} flags;
 *     StdVideoH264PictureType pictureType;
 *     uint32_t frameNum;
 *     uint32_t pictureOrderCount;
 *     uint16_t long_term_pic_num;
 *     uint16_t long_term_frame_idx;
 * }</code></pre>
 */
public class StdVideoEncodeH264PictureInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PICTURETYPE,
        FRAMENUM,
        PICTUREORDERCOUNT,
        LONG_TERM_PIC_NUM,
        LONG_TERM_FRAME_IDX;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264PictureInfoFlags.SIZEOF, StdVideoEncodeH264PictureInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PICTURETYPE = layout.offsetof(1);
        FRAMENUM = layout.offsetof(2);
        PICTUREORDERCOUNT = layout.offsetof(3);
        LONG_TERM_PIC_NUM = layout.offsetof(4);
        LONG_TERM_FRAME_IDX = layout.offsetof(5);
    }

    /**
     * Creates a {@code StdVideoEncodeH264PictureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264PictureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264PictureInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code pictureType} field. */
    @NativeType("StdVideoH264PictureType")
    public int pictureType() { return npictureType(address()); }
    /** @return the value of the {@code frameNum} field. */
    @NativeType("uint32_t")
    public int frameNum() { return nframeNum(address()); }
    /** @return the value of the {@code pictureOrderCount} field. */
    @NativeType("uint32_t")
    public int pictureOrderCount() { return npictureOrderCount(address()); }
    /** @return the value of the {@code long_term_pic_num} field. */
    @NativeType("uint16_t")
    public short long_term_pic_num() { return nlong_term_pic_num(address()); }
    /** @return the value of the {@code long_term_frame_idx} field. */
    @NativeType("uint16_t")
    public short long_term_frame_idx() { return nlong_term_frame_idx(address()); }

    /** Copies the specified {@link StdVideoEncodeH264PictureInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeH264PictureInfo flags(StdVideoEncodeH264PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264PictureInfo flags(java.util.function.Consumer<StdVideoEncodeH264PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code pictureType} field. */
    public StdVideoEncodeH264PictureInfo pictureType(@NativeType("StdVideoH264PictureType") int value) { npictureType(address(), value); return this; }
    /** Sets the specified value to the {@code frameNum} field. */
    public StdVideoEncodeH264PictureInfo frameNum(@NativeType("uint32_t") int value) { nframeNum(address(), value); return this; }
    /** Sets the specified value to the {@code pictureOrderCount} field. */
    public StdVideoEncodeH264PictureInfo pictureOrderCount(@NativeType("uint32_t") int value) { npictureOrderCount(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_pic_num} field. */
    public StdVideoEncodeH264PictureInfo long_term_pic_num(@NativeType("uint16_t") short value) { nlong_term_pic_num(address(), value); return this; }
    /** Sets the specified value to the {@code long_term_frame_idx} field. */
    public StdVideoEncodeH264PictureInfo long_term_frame_idx(@NativeType("uint16_t") short value) { nlong_term_frame_idx(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264PictureInfo set(
        StdVideoEncodeH264PictureInfoFlags flags,
        int pictureType,
        int frameNum,
        int pictureOrderCount,
        short long_term_pic_num,
        short long_term_frame_idx
    ) {
        flags(flags);
        pictureType(pictureType);
        frameNum(frameNum);
        pictureOrderCount(pictureOrderCount);
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
    public StdVideoEncodeH264PictureInfo set(StdVideoEncodeH264PictureInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264PictureInfo malloc() {
        return wrap(StdVideoEncodeH264PictureInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264PictureInfo calloc() {
        return wrap(StdVideoEncodeH264PictureInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoEncodeH264PictureInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264PictureInfo} instance for the specified memory address. */
    public static StdVideoEncodeH264PictureInfo create(long address) {
        return wrap(StdVideoEncodeH264PictureInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264PictureInfo createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoEncodeH264PictureInfo.class, address);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoEncodeH264PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264PictureInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264PictureInfo malloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264PictureInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoEncodeH264PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264PictureInfo calloc(MemoryStack stack) {
        return wrap(StdVideoEncodeH264PictureInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264PictureInfoFlags nflags(long struct) { return StdVideoEncodeH264PictureInfoFlags.create(struct + StdVideoEncodeH264PictureInfo.FLAGS); }
    /** Unsafe version of {@link #pictureType}. */
    public static int npictureType(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264PictureInfo.PICTURETYPE); }
    /** Unsafe version of {@link #frameNum}. */
    public static int nframeNum(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264PictureInfo.FRAMENUM); }
    /** Unsafe version of {@link #pictureOrderCount}. */
    public static int npictureOrderCount(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264PictureInfo.PICTUREORDERCOUNT); }
    /** Unsafe version of {@link #long_term_pic_num}. */
    public static short nlong_term_pic_num(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264PictureInfo.LONG_TERM_PIC_NUM); }
    /** Unsafe version of {@link #long_term_frame_idx}. */
    public static short nlong_term_frame_idx(long struct) { return UNSAFE.getShort(null, struct + StdVideoEncodeH264PictureInfo.LONG_TERM_FRAME_IDX); }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264PictureInfo.FLAGS, StdVideoEncodeH264PictureInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #pictureType(int) pictureType}. */
    public static void npictureType(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264PictureInfo.PICTURETYPE, value); }
    /** Unsafe version of {@link #frameNum(int) frameNum}. */
    public static void nframeNum(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264PictureInfo.FRAMENUM, value); }
    /** Unsafe version of {@link #pictureOrderCount(int) pictureOrderCount}. */
    public static void npictureOrderCount(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264PictureInfo.PICTUREORDERCOUNT, value); }
    /** Unsafe version of {@link #long_term_pic_num(short) long_term_pic_num}. */
    public static void nlong_term_pic_num(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264PictureInfo.LONG_TERM_PIC_NUM, value); }
    /** Unsafe version of {@link #long_term_frame_idx(short) long_term_frame_idx}. */
    public static void nlong_term_frame_idx(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoEncodeH264PictureInfo.LONG_TERM_FRAME_IDX, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264PictureInfo ELEMENT_FACTORY = StdVideoEncodeH264PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264PictureInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264PictureInfo#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoEncodeH264PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264PictureInfoFlags flags() { return StdVideoEncodeH264PictureInfo.nflags(address()); }
        /** @return the value of the {@code pictureType} field. */
        @NativeType("StdVideoH264PictureType")
        public int pictureType() { return StdVideoEncodeH264PictureInfo.npictureType(address()); }
        /** @return the value of the {@code frameNum} field. */
        @NativeType("uint32_t")
        public int frameNum() { return StdVideoEncodeH264PictureInfo.nframeNum(address()); }
        /** @return the value of the {@code pictureOrderCount} field. */
        @NativeType("uint32_t")
        public int pictureOrderCount() { return StdVideoEncodeH264PictureInfo.npictureOrderCount(address()); }
        /** @return the value of the {@code long_term_pic_num} field. */
        @NativeType("uint16_t")
        public short long_term_pic_num() { return StdVideoEncodeH264PictureInfo.nlong_term_pic_num(address()); }
        /** @return the value of the {@code long_term_frame_idx} field. */
        @NativeType("uint16_t")
        public short long_term_frame_idx() { return StdVideoEncodeH264PictureInfo.nlong_term_frame_idx(address()); }

        /** Copies the specified {@link StdVideoEncodeH264PictureInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeH264PictureInfo.Buffer flags(StdVideoEncodeH264PictureInfoFlags value) { StdVideoEncodeH264PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code pictureType} field. */
        public StdVideoEncodeH264PictureInfo.Buffer pictureType(@NativeType("StdVideoH264PictureType") int value) { StdVideoEncodeH264PictureInfo.npictureType(address(), value); return this; }
        /** Sets the specified value to the {@code frameNum} field. */
        public StdVideoEncodeH264PictureInfo.Buffer frameNum(@NativeType("uint32_t") int value) { StdVideoEncodeH264PictureInfo.nframeNum(address(), value); return this; }
        /** Sets the specified value to the {@code pictureOrderCount} field. */
        public StdVideoEncodeH264PictureInfo.Buffer pictureOrderCount(@NativeType("uint32_t") int value) { StdVideoEncodeH264PictureInfo.npictureOrderCount(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_pic_num} field. */
        public StdVideoEncodeH264PictureInfo.Buffer long_term_pic_num(@NativeType("uint16_t") short value) { StdVideoEncodeH264PictureInfo.nlong_term_pic_num(address(), value); return this; }
        /** Sets the specified value to the {@code long_term_frame_idx} field. */
        public StdVideoEncodeH264PictureInfo.Buffer long_term_frame_idx(@NativeType("uint16_t") short value) { StdVideoEncodeH264PictureInfo.nlong_term_frame_idx(address(), value); return this; }

    }

}
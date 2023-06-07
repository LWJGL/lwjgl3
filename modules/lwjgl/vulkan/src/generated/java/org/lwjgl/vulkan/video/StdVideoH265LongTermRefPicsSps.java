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
 * struct StdVideoH265LongTermRefPicsSps {
 *     uint32_t used_by_curr_pic_lt_sps_flag;
 *     uint32_t lt_ref_pic_poc_lsb_sps[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS];
 * }</code></pre>
 */
public class StdVideoH265LongTermRefPicsSps extends Struct<StdVideoH265LongTermRefPicsSps> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USED_BY_CURR_PIC_LT_SPS_FLAG,
        LT_REF_PIC_POC_LSB_SPS;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USED_BY_CURR_PIC_LT_SPS_FLAG = layout.offsetof(0);
        LT_REF_PIC_POC_LSB_SPS = layout.offsetof(1);
    }

    protected StdVideoH265LongTermRefPicsSps(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265LongTermRefPicsSps create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265LongTermRefPicsSps(address, container);
    }

    /**
     * Creates a {@code StdVideoH265LongTermRefPicsSps} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265LongTermRefPicsSps(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code used_by_curr_pic_lt_sps_flag} field. */
    @NativeType("uint32_t")
    public int used_by_curr_pic_lt_sps_flag() { return nused_by_curr_pic_lt_sps_flag(address()); }
    /** @return a {@link IntBuffer} view of the {@code lt_ref_pic_poc_lsb_sps} field. */
    @NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
    public IntBuffer lt_ref_pic_poc_lsb_sps() { return nlt_ref_pic_poc_lsb_sps(address()); }
    /** @return the value at the specified index of the {@code lt_ref_pic_poc_lsb_sps} field. */
    @NativeType("uint32_t")
    public int lt_ref_pic_poc_lsb_sps(int index) { return nlt_ref_pic_poc_lsb_sps(address(), index); }

    /** Sets the specified value to the {@code used_by_curr_pic_lt_sps_flag} field. */
    public StdVideoH265LongTermRefPicsSps used_by_curr_pic_lt_sps_flag(@NativeType("uint32_t") int value) { nused_by_curr_pic_lt_sps_flag(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code lt_ref_pic_poc_lsb_sps} field. */
    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(@NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") IntBuffer value) { nlt_ref_pic_poc_lsb_sps(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code lt_ref_pic_poc_lsb_sps} field. */
    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(int index, @NativeType("uint32_t") int value) { nlt_ref_pic_poc_lsb_sps(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265LongTermRefPicsSps set(
        int used_by_curr_pic_lt_sps_flag,
        IntBuffer lt_ref_pic_poc_lsb_sps
    ) {
        used_by_curr_pic_lt_sps_flag(used_by_curr_pic_lt_sps_flag);
        lt_ref_pic_poc_lsb_sps(lt_ref_pic_poc_lsb_sps);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265LongTermRefPicsSps set(StdVideoH265LongTermRefPicsSps src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265LongTermRefPicsSps} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265LongTermRefPicsSps malloc() {
        return new StdVideoH265LongTermRefPicsSps(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265LongTermRefPicsSps} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265LongTermRefPicsSps calloc() {
        return new StdVideoH265LongTermRefPicsSps(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265LongTermRefPicsSps} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265LongTermRefPicsSps create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265LongTermRefPicsSps(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265LongTermRefPicsSps} instance for the specified memory address. */
    public static StdVideoH265LongTermRefPicsSps create(long address) {
        return new StdVideoH265LongTermRefPicsSps(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265LongTermRefPicsSps createSafe(long address) {
        return address == NULL ? null : new StdVideoH265LongTermRefPicsSps(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265LongTermRefPicsSps.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265LongTermRefPicsSps.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265LongTermRefPicsSps.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265LongTermRefPicsSps.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265LongTermRefPicsSps.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265LongTermRefPicsSps.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265LongTermRefPicsSps.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265LongTermRefPicsSps.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265LongTermRefPicsSps.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265LongTermRefPicsSps} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265LongTermRefPicsSps malloc(MemoryStack stack) {
        return new StdVideoH265LongTermRefPicsSps(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265LongTermRefPicsSps} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265LongTermRefPicsSps calloc(MemoryStack stack) {
        return new StdVideoH265LongTermRefPicsSps(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265LongTermRefPicsSps.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265LongTermRefPicsSps.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265LongTermRefPicsSps.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265LongTermRefPicsSps.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #used_by_curr_pic_lt_sps_flag}. */
    public static int nused_by_curr_pic_lt_sps_flag(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265LongTermRefPicsSps.USED_BY_CURR_PIC_LT_SPS_FLAG); }
    /** Unsafe version of {@link #lt_ref_pic_poc_lsb_sps}. */
    public static IntBuffer nlt_ref_pic_poc_lsb_sps(long struct) { return memIntBuffer(struct + StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS); }
    /** Unsafe version of {@link #lt_ref_pic_poc_lsb_sps(int) lt_ref_pic_poc_lsb_sps}. */
    public static int nlt_ref_pic_poc_lsb_sps(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS + check(index, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS) * 4);
    }

    /** Unsafe version of {@link #used_by_curr_pic_lt_sps_flag(int) used_by_curr_pic_lt_sps_flag}. */
    public static void nused_by_curr_pic_lt_sps_flag(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265LongTermRefPicsSps.USED_BY_CURR_PIC_LT_SPS_FLAG, value); }
    /** Unsafe version of {@link #lt_ref_pic_poc_lsb_sps(IntBuffer) lt_ref_pic_poc_lsb_sps}. */
    public static void nlt_ref_pic_poc_lsb_sps(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS); }
        memCopy(memAddress(value), struct + StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #lt_ref_pic_poc_lsb_sps(int, int) lt_ref_pic_poc_lsb_sps}. */
    public static void nlt_ref_pic_poc_lsb_sps(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoH265LongTermRefPicsSps.LT_REF_PIC_POC_LSB_SPS + check(index, STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265LongTermRefPicsSps} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265LongTermRefPicsSps, Buffer> implements NativeResource {

        private static final StdVideoH265LongTermRefPicsSps ELEMENT_FACTORY = StdVideoH265LongTermRefPicsSps.create(-1L);

        /**
         * Creates a new {@code StdVideoH265LongTermRefPicsSps.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265LongTermRefPicsSps#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoH265LongTermRefPicsSps getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code used_by_curr_pic_lt_sps_flag} field. */
        @NativeType("uint32_t")
        public int used_by_curr_pic_lt_sps_flag() { return StdVideoH265LongTermRefPicsSps.nused_by_curr_pic_lt_sps_flag(address()); }
        /** @return a {@link IntBuffer} view of the {@code lt_ref_pic_poc_lsb_sps} field. */
        @NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]")
        public IntBuffer lt_ref_pic_poc_lsb_sps() { return StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(address()); }
        /** @return the value at the specified index of the {@code lt_ref_pic_poc_lsb_sps} field. */
        @NativeType("uint32_t")
        public int lt_ref_pic_poc_lsb_sps(int index) { return StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(address(), index); }

        /** Sets the specified value to the {@code used_by_curr_pic_lt_sps_flag} field. */
        public StdVideoH265LongTermRefPicsSps.Buffer used_by_curr_pic_lt_sps_flag(@NativeType("uint32_t") int value) { StdVideoH265LongTermRefPicsSps.nused_by_curr_pic_lt_sps_flag(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code lt_ref_pic_poc_lsb_sps} field. */
        public StdVideoH265LongTermRefPicsSps.Buffer lt_ref_pic_poc_lsb_sps(@NativeType("uint32_t[STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS]") IntBuffer value) { StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code lt_ref_pic_poc_lsb_sps} field. */
        public StdVideoH265LongTermRefPicsSps.Buffer lt_ref_pic_poc_lsb_sps(int index, @NativeType("uint32_t") int value) { StdVideoH265LongTermRefPicsSps.nlt_ref_pic_poc_lsb_sps(address(), index, value); return this; }

    }

}
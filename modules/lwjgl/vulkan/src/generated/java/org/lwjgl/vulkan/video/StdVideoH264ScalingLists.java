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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH264ScalingLists {
 *     uint8_t {@link #scaling_list_present_mask};
 *     uint8_t {@link #use_default_scaling_matrix_mask};
 *     uint8_t ScalingList4x4[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS];
 *     uint8_t ScalingList8x8[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS];
 * }</code></pre>
 */
public class StdVideoH264ScalingLists extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SCALING_LIST_PRESENT_MASK,
        USE_DEFAULT_SCALING_MATRIX_MASK,
        SCALINGLIST4X4,
        SCALINGLIST8X8;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS),
            __array(1, STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SCALING_LIST_PRESENT_MASK = layout.offsetof(0);
        USE_DEFAULT_SCALING_MATRIX_MASK = layout.offsetof(1);
        SCALINGLIST4X4 = layout.offsetof(2);
        SCALINGLIST8X8 = layout.offsetof(3);
    }

    /**
     * Creates a {@code StdVideoH264ScalingLists} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH264ScalingLists(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * scaling_list_present_mask has one bit for each seq_scaling_list_present_flag[i] for SPS OR pic_scaling_list_present_flag[i] for PPS, bit 0 - 5 are for
     * each entry of ScalingList4x4 bit 6 - 7 are for each entry plus 6 for ScalingList8x8
     */
    @NativeType("uint8_t")
    public byte scaling_list_present_mask() { return nscaling_list_present_mask(address()); }
    /**
     * use_default_scaling_matrix_mask has one bit for each UseDefaultScalingMatrix4x4Flag[ i ] and UseDefaultScalingMatrix8x8Flag[ i - 6 ] for SPS OR PPS bit
     * 0 - 5 are for each entry of ScalingList4x4 bit 6 - 7 are for each entry plus 6 for ScalingList8x8
     */
    @NativeType("uint8_t")
    public byte use_default_scaling_matrix_mask() { return nuse_default_scaling_matrix_mask(address()); }
    /** @return a {@link ByteBuffer} view of the {@code ScalingList4x4} field. */
    @NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS]")
    public ByteBuffer ScalingList4x4() { return nScalingList4x4(address()); }
    /** @return the value at the specified index of the {@code ScalingList4x4} field. */
    @NativeType("uint8_t")
    public byte ScalingList4x4(int index) { return nScalingList4x4(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code ScalingList8x8} field. */
    @NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS]")
    public ByteBuffer ScalingList8x8() { return nScalingList8x8(address()); }
    /** @return the value at the specified index of the {@code ScalingList8x8} field. */
    @NativeType("uint8_t")
    public byte ScalingList8x8(int index) { return nScalingList8x8(address(), index); }

    /** Sets the specified value to the {@link #scaling_list_present_mask} field. */
    public StdVideoH264ScalingLists scaling_list_present_mask(@NativeType("uint8_t") byte value) { nscaling_list_present_mask(address(), value); return this; }
    /** Sets the specified value to the {@link #use_default_scaling_matrix_mask} field. */
    public StdVideoH264ScalingLists use_default_scaling_matrix_mask(@NativeType("uint8_t") byte value) { nuse_default_scaling_matrix_mask(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code ScalingList4x4} field. */
    public StdVideoH264ScalingLists ScalingList4x4(@NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS]") ByteBuffer value) { nScalingList4x4(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ScalingList4x4} field. */
    public StdVideoH264ScalingLists ScalingList4x4(int index, @NativeType("uint8_t") byte value) { nScalingList4x4(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code ScalingList8x8} field. */
    public StdVideoH264ScalingLists ScalingList8x8(@NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS]") ByteBuffer value) { nScalingList8x8(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ScalingList8x8} field. */
    public StdVideoH264ScalingLists ScalingList8x8(int index, @NativeType("uint8_t") byte value) { nScalingList8x8(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH264ScalingLists set(
        byte scaling_list_present_mask,
        byte use_default_scaling_matrix_mask,
        ByteBuffer ScalingList4x4,
        ByteBuffer ScalingList8x8
    ) {
        scaling_list_present_mask(scaling_list_present_mask);
        use_default_scaling_matrix_mask(use_default_scaling_matrix_mask);
        ScalingList4x4(ScalingList4x4);
        ScalingList8x8(ScalingList8x8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH264ScalingLists set(StdVideoH264ScalingLists src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH264ScalingLists} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH264ScalingLists malloc() {
        return wrap(StdVideoH264ScalingLists.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH264ScalingLists} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH264ScalingLists calloc() {
        return wrap(StdVideoH264ScalingLists.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH264ScalingLists} instance allocated with {@link BufferUtils}. */
    public static StdVideoH264ScalingLists create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH264ScalingLists.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH264ScalingLists} instance for the specified memory address. */
    public static StdVideoH264ScalingLists create(long address) {
        return wrap(StdVideoH264ScalingLists.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264ScalingLists createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH264ScalingLists.class, address);
    }

    /**
     * Returns a new {@link StdVideoH264ScalingLists.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264ScalingLists.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264ScalingLists.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264ScalingLists.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264ScalingLists.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264ScalingLists.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH264ScalingLists.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH264ScalingLists.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264ScalingLists.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH264ScalingLists} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264ScalingLists malloc(MemoryStack stack) {
        return wrap(StdVideoH264ScalingLists.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH264ScalingLists} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264ScalingLists calloc(MemoryStack stack) {
        return wrap(StdVideoH264ScalingLists.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH264ScalingLists.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264ScalingLists.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264ScalingLists.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264ScalingLists.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #scaling_list_present_mask}. */
    public static byte nscaling_list_present_mask(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264ScalingLists.SCALING_LIST_PRESENT_MASK); }
    /** Unsafe version of {@link #use_default_scaling_matrix_mask}. */
    public static byte nuse_default_scaling_matrix_mask(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264ScalingLists.USE_DEFAULT_SCALING_MATRIX_MASK); }
    /** Unsafe version of {@link #ScalingList4x4}. */
    public static ByteBuffer nScalingList4x4(long struct) { return memByteBuffer(struct + StdVideoH264ScalingLists.SCALINGLIST4X4, STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS); }
    /** Unsafe version of {@link #ScalingList4x4(int) ScalingList4x4}. */
    public static byte nScalingList4x4(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH264ScalingLists.SCALINGLIST4X4 + check(index, STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS) * 1);
    }
    /** Unsafe version of {@link #ScalingList8x8}. */
    public static ByteBuffer nScalingList8x8(long struct) { return memByteBuffer(struct + StdVideoH264ScalingLists.SCALINGLIST8X8, STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS); }
    /** Unsafe version of {@link #ScalingList8x8(int) ScalingList8x8}. */
    public static byte nScalingList8x8(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH264ScalingLists.SCALINGLIST8X8 + check(index, STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS) * 1);
    }

    /** Unsafe version of {@link #scaling_list_present_mask(byte) scaling_list_present_mask}. */
    public static void nscaling_list_present_mask(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264ScalingLists.SCALING_LIST_PRESENT_MASK, value); }
    /** Unsafe version of {@link #use_default_scaling_matrix_mask(byte) use_default_scaling_matrix_mask}. */
    public static void nuse_default_scaling_matrix_mask(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264ScalingLists.USE_DEFAULT_SCALING_MATRIX_MASK, value); }
    /** Unsafe version of {@link #ScalingList4x4(ByteBuffer) ScalingList4x4}. */
    public static void nScalingList4x4(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS); }
        memCopy(memAddress(value), struct + StdVideoH264ScalingLists.SCALINGLIST4X4, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ScalingList4x4(int, byte) ScalingList4x4}. */
    public static void nScalingList4x4(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH264ScalingLists.SCALINGLIST4X4 + check(index, STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS) * 1, value);
    }
    /** Unsafe version of {@link #ScalingList8x8(ByteBuffer) ScalingList8x8}. */
    public static void nScalingList8x8(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS); }
        memCopy(memAddress(value), struct + StdVideoH264ScalingLists.SCALINGLIST8X8, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ScalingList8x8(int, byte) ScalingList8x8}. */
    public static void nScalingList8x8(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH264ScalingLists.SCALINGLIST8X8 + check(index, STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoH264ScalingLists} structs. */
    public static class Buffer extends StructBuffer<StdVideoH264ScalingLists, Buffer> implements NativeResource {

        private static final StdVideoH264ScalingLists ELEMENT_FACTORY = StdVideoH264ScalingLists.create(-1L);

        /**
         * Creates a new {@code StdVideoH264ScalingLists.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH264ScalingLists#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH264ScalingLists getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link StdVideoH264ScalingLists#scaling_list_present_mask} field. */
        @NativeType("uint8_t")
        public byte scaling_list_present_mask() { return StdVideoH264ScalingLists.nscaling_list_present_mask(address()); }
        /** @return the value of the {@link StdVideoH264ScalingLists#use_default_scaling_matrix_mask} field. */
        @NativeType("uint8_t")
        public byte use_default_scaling_matrix_mask() { return StdVideoH264ScalingLists.nuse_default_scaling_matrix_mask(address()); }
        /** @return a {@link ByteBuffer} view of the {@code ScalingList4x4} field. */
        @NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS]")
        public ByteBuffer ScalingList4x4() { return StdVideoH264ScalingLists.nScalingList4x4(address()); }
        /** @return the value at the specified index of the {@code ScalingList4x4} field. */
        @NativeType("uint8_t")
        public byte ScalingList4x4(int index) { return StdVideoH264ScalingLists.nScalingList4x4(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code ScalingList8x8} field. */
        @NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS]")
        public ByteBuffer ScalingList8x8() { return StdVideoH264ScalingLists.nScalingList8x8(address()); }
        /** @return the value at the specified index of the {@code ScalingList8x8} field. */
        @NativeType("uint8_t")
        public byte ScalingList8x8(int index) { return StdVideoH264ScalingLists.nScalingList8x8(address(), index); }

        /** Sets the specified value to the {@link StdVideoH264ScalingLists#scaling_list_present_mask} field. */
        public StdVideoH264ScalingLists.Buffer scaling_list_present_mask(@NativeType("uint8_t") byte value) { StdVideoH264ScalingLists.nscaling_list_present_mask(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoH264ScalingLists#use_default_scaling_matrix_mask} field. */
        public StdVideoH264ScalingLists.Buffer use_default_scaling_matrix_mask(@NativeType("uint8_t") byte value) { StdVideoH264ScalingLists.nuse_default_scaling_matrix_mask(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code ScalingList4x4} field. */
        public StdVideoH264ScalingLists.Buffer ScalingList4x4(@NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS]") ByteBuffer value) { StdVideoH264ScalingLists.nScalingList4x4(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ScalingList4x4} field. */
        public StdVideoH264ScalingLists.Buffer ScalingList4x4(int index, @NativeType("uint8_t") byte value) { StdVideoH264ScalingLists.nScalingList4x4(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code ScalingList8x8} field. */
        public StdVideoH264ScalingLists.Buffer ScalingList8x8(@NativeType("uint8_t[STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS]") ByteBuffer value) { StdVideoH264ScalingLists.nScalingList8x8(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ScalingList8x8} field. */
        public StdVideoH264ScalingLists.Buffer ScalingList8x8(int index, @NativeType("uint8_t") byte value) { StdVideoH264ScalingLists.nScalingList8x8(address(), index, value); return this; }

    }

}
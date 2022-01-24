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
 * struct StdVideoH264SpsVuiFlags {
 *     uint32_t aspect_ratio_info_present_flag : 1;
 *     uint32_t overscan_info_present_flag : 1;
 *     uint32_t overscan_appropriate_flag : 1;
 *     uint32_t video_signal_type_present_flag : 1;
 *     uint32_t video_full_range_flag : 1;
 *     uint32_t color_description_present_flag : 1;
 *     uint32_t chroma_loc_info_present_flag : 1;
 *     uint32_t timing_info_present_flag : 1;
 *     uint32_t fixed_frame_rate_flag : 1;
 *     uint32_t bitstream_restriction_flag : 1;
 *     uint32_t nal_hrd_parameters_present_flag : 1;
 *     uint32_t vcl_hrd_parameters_present_flag : 1;
 * }</code></pre>
 */
public class StdVideoH264SpsVuiFlags extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
    }

    /**
     * Creates a {@code StdVideoH264SpsVuiFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH264SpsVuiFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aspect_ratio_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean aspect_ratio_info_present_flag() { return naspect_ratio_info_present_flag(address()) != 0; }
    /** @return the value of the {@code overscan_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean overscan_info_present_flag() { return noverscan_info_present_flag(address()) != 0; }
    /** @return the value of the {@code overscan_appropriate_flag} field. */
    @NativeType("uint32_t")
    public boolean overscan_appropriate_flag() { return noverscan_appropriate_flag(address()) != 0; }
    /** @return the value of the {@code video_signal_type_present_flag} field. */
    @NativeType("uint32_t")
    public boolean video_signal_type_present_flag() { return nvideo_signal_type_present_flag(address()) != 0; }
    /** @return the value of the {@code video_full_range_flag} field. */
    @NativeType("uint32_t")
    public boolean video_full_range_flag() { return nvideo_full_range_flag(address()) != 0; }
    /** @return the value of the {@code color_description_present_flag} field. */
    @NativeType("uint32_t")
    public boolean color_description_present_flag() { return ncolor_description_present_flag(address()) != 0; }
    /** @return the value of the {@code chroma_loc_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean chroma_loc_info_present_flag() { return nchroma_loc_info_present_flag(address()) != 0; }
    /** @return the value of the {@code timing_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean timing_info_present_flag() { return ntiming_info_present_flag(address()) != 0; }
    /** @return the value of the {@code fixed_frame_rate_flag} field. */
    @NativeType("uint32_t")
    public boolean fixed_frame_rate_flag() { return nfixed_frame_rate_flag(address()) != 0; }
    /** @return the value of the {@code bitstream_restriction_flag} field. */
    @NativeType("uint32_t")
    public boolean bitstream_restriction_flag() { return nbitstream_restriction_flag(address()) != 0; }
    /** @return the value of the {@code nal_hrd_parameters_present_flag} field. */
    @NativeType("uint32_t")
    public boolean nal_hrd_parameters_present_flag() { return nnal_hrd_parameters_present_flag(address()) != 0; }
    /** @return the value of the {@code vcl_hrd_parameters_present_flag} field. */
    @NativeType("uint32_t")
    public boolean vcl_hrd_parameters_present_flag() { return nvcl_hrd_parameters_present_flag(address()) != 0; }

    /** Sets the specified value to the {@code aspect_ratio_info_present_flag} field. */
    public StdVideoH264SpsVuiFlags aspect_ratio_info_present_flag(@NativeType("uint32_t") boolean value) { naspect_ratio_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code overscan_info_present_flag} field. */
    public StdVideoH264SpsVuiFlags overscan_info_present_flag(@NativeType("uint32_t") boolean value) { noverscan_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code overscan_appropriate_flag} field. */
    public StdVideoH264SpsVuiFlags overscan_appropriate_flag(@NativeType("uint32_t") boolean value) { noverscan_appropriate_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code video_signal_type_present_flag} field. */
    public StdVideoH264SpsVuiFlags video_signal_type_present_flag(@NativeType("uint32_t") boolean value) { nvideo_signal_type_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code video_full_range_flag} field. */
    public StdVideoH264SpsVuiFlags video_full_range_flag(@NativeType("uint32_t") boolean value) { nvideo_full_range_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code color_description_present_flag} field. */
    public StdVideoH264SpsVuiFlags color_description_present_flag(@NativeType("uint32_t") boolean value) { ncolor_description_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code chroma_loc_info_present_flag} field. */
    public StdVideoH264SpsVuiFlags chroma_loc_info_present_flag(@NativeType("uint32_t") boolean value) { nchroma_loc_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code timing_info_present_flag} field. */
    public StdVideoH264SpsVuiFlags timing_info_present_flag(@NativeType("uint32_t") boolean value) { ntiming_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fixed_frame_rate_flag} field. */
    public StdVideoH264SpsVuiFlags fixed_frame_rate_flag(@NativeType("uint32_t") boolean value) { nfixed_frame_rate_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bitstream_restriction_flag} field. */
    public StdVideoH264SpsVuiFlags bitstream_restriction_flag(@NativeType("uint32_t") boolean value) { nbitstream_restriction_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code nal_hrd_parameters_present_flag} field. */
    public StdVideoH264SpsVuiFlags nal_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { nnal_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vcl_hrd_parameters_present_flag} field. */
    public StdVideoH264SpsVuiFlags vcl_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { nvcl_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH264SpsVuiFlags set(
        boolean aspect_ratio_info_present_flag,
        boolean overscan_info_present_flag,
        boolean overscan_appropriate_flag,
        boolean video_signal_type_present_flag,
        boolean video_full_range_flag,
        boolean color_description_present_flag,
        boolean chroma_loc_info_present_flag,
        boolean timing_info_present_flag,
        boolean fixed_frame_rate_flag,
        boolean bitstream_restriction_flag,
        boolean nal_hrd_parameters_present_flag,
        boolean vcl_hrd_parameters_present_flag
    ) {
        aspect_ratio_info_present_flag(aspect_ratio_info_present_flag);
        overscan_info_present_flag(overscan_info_present_flag);
        overscan_appropriate_flag(overscan_appropriate_flag);
        video_signal_type_present_flag(video_signal_type_present_flag);
        video_full_range_flag(video_full_range_flag);
        color_description_present_flag(color_description_present_flag);
        chroma_loc_info_present_flag(chroma_loc_info_present_flag);
        timing_info_present_flag(timing_info_present_flag);
        fixed_frame_rate_flag(fixed_frame_rate_flag);
        bitstream_restriction_flag(bitstream_restriction_flag);
        nal_hrd_parameters_present_flag(nal_hrd_parameters_present_flag);
        vcl_hrd_parameters_present_flag(vcl_hrd_parameters_present_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH264SpsVuiFlags set(StdVideoH264SpsVuiFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH264SpsVuiFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH264SpsVuiFlags malloc() {
        return wrap(StdVideoH264SpsVuiFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH264SpsVuiFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH264SpsVuiFlags calloc() {
        return wrap(StdVideoH264SpsVuiFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH264SpsVuiFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH264SpsVuiFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH264SpsVuiFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH264SpsVuiFlags} instance for the specified memory address. */
    public static StdVideoH264SpsVuiFlags create(long address) {
        return wrap(StdVideoH264SpsVuiFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264SpsVuiFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH264SpsVuiFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoH264SpsVuiFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsVuiFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SpsVuiFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsVuiFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SpsVuiFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsVuiFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH264SpsVuiFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsVuiFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264SpsVuiFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH264SpsVuiFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264SpsVuiFlags malloc(MemoryStack stack) {
        return wrap(StdVideoH264SpsVuiFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH264SpsVuiFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264SpsVuiFlags calloc(MemoryStack stack) {
        return wrap(StdVideoH264SpsVuiFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH264SpsVuiFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsVuiFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SpsVuiFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SpsVuiFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SpsVuiFlags.BITFIELD0); }
    /** Unsafe version of {@link #aspect_ratio_info_present_flag}. */
    public static int naspect_ratio_info_present_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #overscan_info_present_flag}. */
    public static int noverscan_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #overscan_appropriate_flag}. */
    public static int noverscan_appropriate_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #video_signal_type_present_flag}. */
    public static int nvideo_signal_type_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #video_full_range_flag}. */
    public static int nvideo_full_range_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #color_description_present_flag}. */
    public static int ncolor_description_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #chroma_loc_info_present_flag}. */
    public static int nchroma_loc_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #timing_info_present_flag}. */
    public static int ntiming_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #fixed_frame_rate_flag}. */
    public static int nfixed_frame_rate_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #bitstream_restriction_flag}. */
    public static int nbitstream_restriction_flag(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #nal_hrd_parameters_present_flag}. */
    public static int nnal_hrd_parameters_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #vcl_hrd_parameters_present_flag}. */
    public static int nvcl_hrd_parameters_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SpsVuiFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #aspect_ratio_info_present_flag(boolean) aspect_ratio_info_present_flag}. */
    public static void naspect_ratio_info_present_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #overscan_info_present_flag(boolean) overscan_info_present_flag}. */
    public static void noverscan_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #overscan_appropriate_flag(boolean) overscan_appropriate_flag}. */
    public static void noverscan_appropriate_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #video_signal_type_present_flag(boolean) video_signal_type_present_flag}. */
    public static void nvideo_signal_type_present_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #video_full_range_flag(boolean) video_full_range_flag}. */
    public static void nvideo_full_range_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #color_description_present_flag(boolean) color_description_present_flag}. */
    public static void ncolor_description_present_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #chroma_loc_info_present_flag(boolean) chroma_loc_info_present_flag}. */
    public static void nchroma_loc_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #timing_info_present_flag(boolean) timing_info_present_flag}. */
    public static void ntiming_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #fixed_frame_rate_flag(boolean) fixed_frame_rate_flag}. */
    public static void nfixed_frame_rate_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #bitstream_restriction_flag(boolean) bitstream_restriction_flag}. */
    public static void nbitstream_restriction_flag(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #nal_hrd_parameters_present_flag(boolean) nal_hrd_parameters_present_flag}. */
    public static void nnal_hrd_parameters_present_flag(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #vcl_hrd_parameters_present_flag(boolean) vcl_hrd_parameters_present_flag}. */
    public static void nvcl_hrd_parameters_present_flag(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoH264SpsVuiFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH264SpsVuiFlags, Buffer> implements NativeResource {

        private static final StdVideoH264SpsVuiFlags ELEMENT_FACTORY = StdVideoH264SpsVuiFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH264SpsVuiFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH264SpsVuiFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH264SpsVuiFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aspect_ratio_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean aspect_ratio_info_present_flag() { return StdVideoH264SpsVuiFlags.naspect_ratio_info_present_flag(address()) != 0; }
        /** @return the value of the {@code overscan_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean overscan_info_present_flag() { return StdVideoH264SpsVuiFlags.noverscan_info_present_flag(address()) != 0; }
        /** @return the value of the {@code overscan_appropriate_flag} field. */
        @NativeType("uint32_t")
        public boolean overscan_appropriate_flag() { return StdVideoH264SpsVuiFlags.noverscan_appropriate_flag(address()) != 0; }
        /** @return the value of the {@code video_signal_type_present_flag} field. */
        @NativeType("uint32_t")
        public boolean video_signal_type_present_flag() { return StdVideoH264SpsVuiFlags.nvideo_signal_type_present_flag(address()) != 0; }
        /** @return the value of the {@code video_full_range_flag} field. */
        @NativeType("uint32_t")
        public boolean video_full_range_flag() { return StdVideoH264SpsVuiFlags.nvideo_full_range_flag(address()) != 0; }
        /** @return the value of the {@code color_description_present_flag} field. */
        @NativeType("uint32_t")
        public boolean color_description_present_flag() { return StdVideoH264SpsVuiFlags.ncolor_description_present_flag(address()) != 0; }
        /** @return the value of the {@code chroma_loc_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean chroma_loc_info_present_flag() { return StdVideoH264SpsVuiFlags.nchroma_loc_info_present_flag(address()) != 0; }
        /** @return the value of the {@code timing_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean timing_info_present_flag() { return StdVideoH264SpsVuiFlags.ntiming_info_present_flag(address()) != 0; }
        /** @return the value of the {@code fixed_frame_rate_flag} field. */
        @NativeType("uint32_t")
        public boolean fixed_frame_rate_flag() { return StdVideoH264SpsVuiFlags.nfixed_frame_rate_flag(address()) != 0; }
        /** @return the value of the {@code bitstream_restriction_flag} field. */
        @NativeType("uint32_t")
        public boolean bitstream_restriction_flag() { return StdVideoH264SpsVuiFlags.nbitstream_restriction_flag(address()) != 0; }
        /** @return the value of the {@code nal_hrd_parameters_present_flag} field. */
        @NativeType("uint32_t")
        public boolean nal_hrd_parameters_present_flag() { return StdVideoH264SpsVuiFlags.nnal_hrd_parameters_present_flag(address()) != 0; }
        /** @return the value of the {@code vcl_hrd_parameters_present_flag} field. */
        @NativeType("uint32_t")
        public boolean vcl_hrd_parameters_present_flag() { return StdVideoH264SpsVuiFlags.nvcl_hrd_parameters_present_flag(address()) != 0; }

        /** Sets the specified value to the {@code aspect_ratio_info_present_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer aspect_ratio_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.naspect_ratio_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code overscan_info_present_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer overscan_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.noverscan_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code overscan_appropriate_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer overscan_appropriate_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.noverscan_appropriate_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code video_signal_type_present_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer video_signal_type_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.nvideo_signal_type_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code video_full_range_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer video_full_range_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.nvideo_full_range_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code color_description_present_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer color_description_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.ncolor_description_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code chroma_loc_info_present_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer chroma_loc_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.nchroma_loc_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code timing_info_present_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer timing_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.ntiming_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fixed_frame_rate_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer fixed_frame_rate_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.nfixed_frame_rate_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bitstream_restriction_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer bitstream_restriction_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.nbitstream_restriction_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code nal_hrd_parameters_present_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer nal_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.nnal_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vcl_hrd_parameters_present_flag} field. */
        public StdVideoH264SpsVuiFlags.Buffer vcl_hrd_parameters_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH264SpsVuiFlags.nvcl_hrd_parameters_present_flag(address(), value ? 1 : 0); return this; }

    }

}
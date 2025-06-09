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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoDecodeVP9PictureInfoFlags {
 *     uint32_t error_resilient_mode : 1;
 *     uint32_t intra_only : 1;
 *     uint32_t allow_high_precision_mv : 1;
 *     uint32_t refresh_frame_context : 1;
 *     uint32_t frame_parallel_decoding_mode : 1;
 *     uint32_t segmentation_enabled : 1;
 *     uint32_t show_frame : 1;
 *     uint32_t UsePrevFrameMvs : 1;
 *     uint32_t reserved : 24;
 * }}</pre>
 */
public class StdVideoDecodeVP9PictureInfoFlags extends Struct<StdVideoDecodeVP9PictureInfoFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0,
        BITFIELD1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoDecodeVP9PictureInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoDecodeVP9PictureInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoDecodeVP9PictureInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoDecodeVP9PictureInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeVP9PictureInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code error_resilient_mode} field. */
    @NativeType("uint32_t")
    public boolean error_resilient_mode() { return nerror_resilient_mode(address()) != 0; }
    /** @return the value of the {@code intra_only} field. */
    @NativeType("uint32_t")
    public boolean intra_only() { return nintra_only(address()) != 0; }
    /** @return the value of the {@code allow_high_precision_mv} field. */
    @NativeType("uint32_t")
    public boolean allow_high_precision_mv() { return nallow_high_precision_mv(address()) != 0; }
    /** @return the value of the {@code refresh_frame_context} field. */
    @NativeType("uint32_t")
    public boolean refresh_frame_context() { return nrefresh_frame_context(address()) != 0; }
    /** @return the value of the {@code frame_parallel_decoding_mode} field. */
    @NativeType("uint32_t")
    public boolean frame_parallel_decoding_mode() { return nframe_parallel_decoding_mode(address()) != 0; }
    /** @return the value of the {@code segmentation_enabled} field. */
    @NativeType("uint32_t")
    public boolean segmentation_enabled() { return nsegmentation_enabled(address()) != 0; }
    /** @return the value of the {@code show_frame} field. */
    @NativeType("uint32_t")
    public boolean show_frame() { return nshow_frame(address()) != 0; }
    /** @return the value of the {@code UsePrevFrameMvs} field. */
    @NativeType("uint32_t")
    public boolean UsePrevFrameMvs() { return nUsePrevFrameMvs(address()) != 0; }

    /** Sets the specified value to the {@code error_resilient_mode} field. */
    public StdVideoDecodeVP9PictureInfoFlags error_resilient_mode(@NativeType("uint32_t") boolean value) { nerror_resilient_mode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code intra_only} field. */
    public StdVideoDecodeVP9PictureInfoFlags intra_only(@NativeType("uint32_t") boolean value) { nintra_only(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code allow_high_precision_mv} field. */
    public StdVideoDecodeVP9PictureInfoFlags allow_high_precision_mv(@NativeType("uint32_t") boolean value) { nallow_high_precision_mv(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code refresh_frame_context} field. */
    public StdVideoDecodeVP9PictureInfoFlags refresh_frame_context(@NativeType("uint32_t") boolean value) { nrefresh_frame_context(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code frame_parallel_decoding_mode} field. */
    public StdVideoDecodeVP9PictureInfoFlags frame_parallel_decoding_mode(@NativeType("uint32_t") boolean value) { nframe_parallel_decoding_mode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_enabled} field. */
    public StdVideoDecodeVP9PictureInfoFlags segmentation_enabled(@NativeType("uint32_t") boolean value) { nsegmentation_enabled(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code show_frame} field. */
    public StdVideoDecodeVP9PictureInfoFlags show_frame(@NativeType("uint32_t") boolean value) { nshow_frame(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code UsePrevFrameMvs} field. */
    public StdVideoDecodeVP9PictureInfoFlags UsePrevFrameMvs(@NativeType("uint32_t") boolean value) { nUsePrevFrameMvs(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeVP9PictureInfoFlags set(
        boolean error_resilient_mode,
        boolean intra_only,
        boolean allow_high_precision_mv,
        boolean refresh_frame_context,
        boolean frame_parallel_decoding_mode,
        boolean segmentation_enabled,
        boolean show_frame,
        boolean UsePrevFrameMvs
    ) {
        error_resilient_mode(error_resilient_mode);
        intra_only(intra_only);
        allow_high_precision_mv(allow_high_precision_mv);
        refresh_frame_context(refresh_frame_context);
        frame_parallel_decoding_mode(frame_parallel_decoding_mode);
        segmentation_enabled(segmentation_enabled);
        show_frame(show_frame);
        UsePrevFrameMvs(UsePrevFrameMvs);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeVP9PictureInfoFlags set(StdVideoDecodeVP9PictureInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeVP9PictureInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeVP9PictureInfoFlags malloc() {
        return new StdVideoDecodeVP9PictureInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeVP9PictureInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeVP9PictureInfoFlags calloc() {
        return new StdVideoDecodeVP9PictureInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeVP9PictureInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeVP9PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeVP9PictureInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeVP9PictureInfoFlags} instance for the specified memory address. */
    public static StdVideoDecodeVP9PictureInfoFlags create(long address) {
        return new StdVideoDecodeVP9PictureInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoDecodeVP9PictureInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoDecodeVP9PictureInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoDecodeVP9PictureInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoDecodeVP9PictureInfoFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeVP9PictureInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeVP9PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeVP9PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoDecodeVP9PictureInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeVP9PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeVP9PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoDecodeVP9PictureInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #error_resilient_mode}. */
    public static int nerror_resilient_mode(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #intra_only}. */
    public static int nintra_only(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #allow_high_precision_mv}. */
    public static int nallow_high_precision_mv(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #refresh_frame_context}. */
    public static int nrefresh_frame_context(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #frame_parallel_decoding_mode}. */
    public static int nframe_parallel_decoding_mode(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #segmentation_enabled}. */
    public static int nsegmentation_enabled(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #show_frame}. */
    public static int nshow_frame(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #UsePrevFrameMvs}. */
    public static int nUsePrevFrameMvs(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoDecodeVP9PictureInfoFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x00_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoDecodeVP9PictureInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #error_resilient_mode(boolean) error_resilient_mode}. */
    public static void nerror_resilient_mode(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #intra_only(boolean) intra_only}. */
    public static void nintra_only(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #allow_high_precision_mv(boolean) allow_high_precision_mv}. */
    public static void nallow_high_precision_mv(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #refresh_frame_context(boolean) refresh_frame_context}. */
    public static void nrefresh_frame_context(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #frame_parallel_decoding_mode(boolean) frame_parallel_decoding_mode}. */
    public static void nframe_parallel_decoding_mode(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #segmentation_enabled(boolean) segmentation_enabled}. */
    public static void nsegmentation_enabled(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #show_frame(boolean) show_frame}. */
    public static void nshow_frame(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #UsePrevFrameMvs(boolean) UsePrevFrameMvs}. */
    public static void nUsePrevFrameMvs(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoDecodeVP9PictureInfoFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xFF_00_00_00) | (value & 0x00_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeVP9PictureInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeVP9PictureInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoDecodeVP9PictureInfoFlags ELEMENT_FACTORY = StdVideoDecodeVP9PictureInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeVP9PictureInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeVP9PictureInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoDecodeVP9PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code error_resilient_mode} field. */
        @NativeType("uint32_t")
        public boolean error_resilient_mode() { return StdVideoDecodeVP9PictureInfoFlags.nerror_resilient_mode(address()) != 0; }
        /** @return the value of the {@code intra_only} field. */
        @NativeType("uint32_t")
        public boolean intra_only() { return StdVideoDecodeVP9PictureInfoFlags.nintra_only(address()) != 0; }
        /** @return the value of the {@code allow_high_precision_mv} field. */
        @NativeType("uint32_t")
        public boolean allow_high_precision_mv() { return StdVideoDecodeVP9PictureInfoFlags.nallow_high_precision_mv(address()) != 0; }
        /** @return the value of the {@code refresh_frame_context} field. */
        @NativeType("uint32_t")
        public boolean refresh_frame_context() { return StdVideoDecodeVP9PictureInfoFlags.nrefresh_frame_context(address()) != 0; }
        /** @return the value of the {@code frame_parallel_decoding_mode} field. */
        @NativeType("uint32_t")
        public boolean frame_parallel_decoding_mode() { return StdVideoDecodeVP9PictureInfoFlags.nframe_parallel_decoding_mode(address()) != 0; }
        /** @return the value of the {@code segmentation_enabled} field. */
        @NativeType("uint32_t")
        public boolean segmentation_enabled() { return StdVideoDecodeVP9PictureInfoFlags.nsegmentation_enabled(address()) != 0; }
        /** @return the value of the {@code show_frame} field. */
        @NativeType("uint32_t")
        public boolean show_frame() { return StdVideoDecodeVP9PictureInfoFlags.nshow_frame(address()) != 0; }
        /** @return the value of the {@code UsePrevFrameMvs} field. */
        @NativeType("uint32_t")
        public boolean UsePrevFrameMvs() { return StdVideoDecodeVP9PictureInfoFlags.nUsePrevFrameMvs(address()) != 0; }

        /** Sets the specified value to the {@code error_resilient_mode} field. */
        public StdVideoDecodeVP9PictureInfoFlags.Buffer error_resilient_mode(@NativeType("uint32_t") boolean value) { StdVideoDecodeVP9PictureInfoFlags.nerror_resilient_mode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code intra_only} field. */
        public StdVideoDecodeVP9PictureInfoFlags.Buffer intra_only(@NativeType("uint32_t") boolean value) { StdVideoDecodeVP9PictureInfoFlags.nintra_only(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code allow_high_precision_mv} field. */
        public StdVideoDecodeVP9PictureInfoFlags.Buffer allow_high_precision_mv(@NativeType("uint32_t") boolean value) { StdVideoDecodeVP9PictureInfoFlags.nallow_high_precision_mv(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code refresh_frame_context} field. */
        public StdVideoDecodeVP9PictureInfoFlags.Buffer refresh_frame_context(@NativeType("uint32_t") boolean value) { StdVideoDecodeVP9PictureInfoFlags.nrefresh_frame_context(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code frame_parallel_decoding_mode} field. */
        public StdVideoDecodeVP9PictureInfoFlags.Buffer frame_parallel_decoding_mode(@NativeType("uint32_t") boolean value) { StdVideoDecodeVP9PictureInfoFlags.nframe_parallel_decoding_mode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_enabled} field. */
        public StdVideoDecodeVP9PictureInfoFlags.Buffer segmentation_enabled(@NativeType("uint32_t") boolean value) { StdVideoDecodeVP9PictureInfoFlags.nsegmentation_enabled(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code show_frame} field. */
        public StdVideoDecodeVP9PictureInfoFlags.Buffer show_frame(@NativeType("uint32_t") boolean value) { StdVideoDecodeVP9PictureInfoFlags.nshow_frame(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code UsePrevFrameMvs} field. */
        public StdVideoDecodeVP9PictureInfoFlags.Buffer UsePrevFrameMvs(@NativeType("uint32_t") boolean value) { StdVideoDecodeVP9PictureInfoFlags.nUsePrevFrameMvs(address(), value ? 1 : 0); return this; }

    }

}
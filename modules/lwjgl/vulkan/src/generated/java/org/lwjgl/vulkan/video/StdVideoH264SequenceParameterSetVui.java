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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH264SequenceParameterSetVui {
 *     StdVideoH264AspectRatioIdc aspect_ratio_idc;
 *     uint16_t sar_width;
 *     uint16_t sar_height;
 *     uint8_t video_format;
 *     uint8_t color_primaries;
 *     uint8_t transfer_characteristics;
 *     uint8_t matrix_coefficients;
 *     uint32_t num_units_in_tick;
 *     uint32_t time_scale;
 *     {@link StdVideoH264HrdParameters StdVideoH264HrdParameters} * {@link #pHrdParameters};
 *     uint8_t max_num_reorder_frames;
 *     uint8_t max_dec_frame_buffering;
 *     {@link StdVideoH264SpsVuiFlags StdVideoH264SpsVuiFlags} flags;
 * }</code></pre>
 */
public class StdVideoH264SequenceParameterSetVui extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECT_RATIO_IDC,
        SAR_WIDTH,
        SAR_HEIGHT,
        VIDEO_FORMAT,
        COLOR_PRIMARIES,
        TRANSFER_CHARACTERISTICS,
        MATRIX_COEFFICIENTS,
        NUM_UNITS_IN_TICK,
        TIME_SCALE,
        PHRDPARAMETERS,
        MAX_NUM_REORDER_FRAMES,
        MAX_DEC_FRAME_BUFFERING,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(1),
            __member(1),
            __member(StdVideoH264SpsVuiFlags.SIZEOF, StdVideoH264SpsVuiFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECT_RATIO_IDC = layout.offsetof(0);
        SAR_WIDTH = layout.offsetof(1);
        SAR_HEIGHT = layout.offsetof(2);
        VIDEO_FORMAT = layout.offsetof(3);
        COLOR_PRIMARIES = layout.offsetof(4);
        TRANSFER_CHARACTERISTICS = layout.offsetof(5);
        MATRIX_COEFFICIENTS = layout.offsetof(6);
        NUM_UNITS_IN_TICK = layout.offsetof(7);
        TIME_SCALE = layout.offsetof(8);
        PHRDPARAMETERS = layout.offsetof(9);
        MAX_NUM_REORDER_FRAMES = layout.offsetof(10);
        MAX_DEC_FRAME_BUFFERING = layout.offsetof(11);
        FLAGS = layout.offsetof(12);
    }

    /**
     * Creates a {@code StdVideoH264SequenceParameterSetVui} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH264SequenceParameterSetVui(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aspect_ratio_idc} field. */
    @NativeType("StdVideoH264AspectRatioIdc")
    public int aspect_ratio_idc() { return naspect_ratio_idc(address()); }
    /** @return the value of the {@code sar_width} field. */
    @NativeType("uint16_t")
    public short sar_width() { return nsar_width(address()); }
    /** @return the value of the {@code sar_height} field. */
    @NativeType("uint16_t")
    public short sar_height() { return nsar_height(address()); }
    /** @return the value of the {@code video_format} field. */
    @NativeType("uint8_t")
    public byte video_format() { return nvideo_format(address()); }
    /** @return the value of the {@code color_primaries} field. */
    @NativeType("uint8_t")
    public byte color_primaries() { return ncolor_primaries(address()); }
    /** @return the value of the {@code transfer_characteristics} field. */
    @NativeType("uint8_t")
    public byte transfer_characteristics() { return ntransfer_characteristics(address()); }
    /** @return the value of the {@code matrix_coefficients} field. */
    @NativeType("uint8_t")
    public byte matrix_coefficients() { return nmatrix_coefficients(address()); }
    /** @return the value of the {@code num_units_in_tick} field. */
    @NativeType("uint32_t")
    public int num_units_in_tick() { return nnum_units_in_tick(address()); }
    /** @return the value of the {@code time_scale} field. */
    @NativeType("uint32_t")
    public int time_scale() { return ntime_scale(address()); }
    /** must be a valid {@code ptr} to {@code hrd_parameters}, if {@code nal_hrd_parameters_present_flag} or {@code vcl_hrd_parameters_present_flag} are set */
    @NativeType("StdVideoH264HrdParameters *")
    public StdVideoH264HrdParameters pHrdParameters() { return npHrdParameters(address()); }
    /** @return the value of the {@code max_num_reorder_frames} field. */
    @NativeType("uint8_t")
    public byte max_num_reorder_frames() { return nmax_num_reorder_frames(address()); }
    /** @return the value of the {@code max_dec_frame_buffering} field. */
    @NativeType("uint8_t")
    public byte max_dec_frame_buffering() { return nmax_dec_frame_buffering(address()); }
    /** @return a {@link StdVideoH264SpsVuiFlags} view of the {@code flags} field. */
    public StdVideoH264SpsVuiFlags flags() { return nflags(address()); }

    /** Sets the specified value to the {@code aspect_ratio_idc} field. */
    public StdVideoH264SequenceParameterSetVui aspect_ratio_idc(@NativeType("StdVideoH264AspectRatioIdc") int value) { naspect_ratio_idc(address(), value); return this; }
    /** Sets the specified value to the {@code sar_width} field. */
    public StdVideoH264SequenceParameterSetVui sar_width(@NativeType("uint16_t") short value) { nsar_width(address(), value); return this; }
    /** Sets the specified value to the {@code sar_height} field. */
    public StdVideoH264SequenceParameterSetVui sar_height(@NativeType("uint16_t") short value) { nsar_height(address(), value); return this; }
    /** Sets the specified value to the {@code video_format} field. */
    public StdVideoH264SequenceParameterSetVui video_format(@NativeType("uint8_t") byte value) { nvideo_format(address(), value); return this; }
    /** Sets the specified value to the {@code color_primaries} field. */
    public StdVideoH264SequenceParameterSetVui color_primaries(@NativeType("uint8_t") byte value) { ncolor_primaries(address(), value); return this; }
    /** Sets the specified value to the {@code transfer_characteristics} field. */
    public StdVideoH264SequenceParameterSetVui transfer_characteristics(@NativeType("uint8_t") byte value) { ntransfer_characteristics(address(), value); return this; }
    /** Sets the specified value to the {@code matrix_coefficients} field. */
    public StdVideoH264SequenceParameterSetVui matrix_coefficients(@NativeType("uint8_t") byte value) { nmatrix_coefficients(address(), value); return this; }
    /** Sets the specified value to the {@code num_units_in_tick} field. */
    public StdVideoH264SequenceParameterSetVui num_units_in_tick(@NativeType("uint32_t") int value) { nnum_units_in_tick(address(), value); return this; }
    /** Sets the specified value to the {@code time_scale} field. */
    public StdVideoH264SequenceParameterSetVui time_scale(@NativeType("uint32_t") int value) { ntime_scale(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH264HrdParameters} to the {@link #pHrdParameters} field. */
    public StdVideoH264SequenceParameterSetVui pHrdParameters(@NativeType("StdVideoH264HrdParameters *") StdVideoH264HrdParameters value) { npHrdParameters(address(), value); return this; }
    /** Sets the specified value to the {@code max_num_reorder_frames} field. */
    public StdVideoH264SequenceParameterSetVui max_num_reorder_frames(@NativeType("uint8_t") byte value) { nmax_num_reorder_frames(address(), value); return this; }
    /** Sets the specified value to the {@code max_dec_frame_buffering} field. */
    public StdVideoH264SequenceParameterSetVui max_dec_frame_buffering(@NativeType("uint8_t") byte value) { nmax_dec_frame_buffering(address(), value); return this; }
    /** Copies the specified {@link StdVideoH264SpsVuiFlags} to the {@code flags} field. */
    public StdVideoH264SequenceParameterSetVui flags(StdVideoH264SpsVuiFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH264SequenceParameterSetVui flags(java.util.function.Consumer<StdVideoH264SpsVuiFlags> consumer) { consumer.accept(flags()); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH264SequenceParameterSetVui set(
        int aspect_ratio_idc,
        short sar_width,
        short sar_height,
        byte video_format,
        byte color_primaries,
        byte transfer_characteristics,
        byte matrix_coefficients,
        int num_units_in_tick,
        int time_scale,
        StdVideoH264HrdParameters pHrdParameters,
        byte max_num_reorder_frames,
        byte max_dec_frame_buffering,
        StdVideoH264SpsVuiFlags flags
    ) {
        aspect_ratio_idc(aspect_ratio_idc);
        sar_width(sar_width);
        sar_height(sar_height);
        video_format(video_format);
        color_primaries(color_primaries);
        transfer_characteristics(transfer_characteristics);
        matrix_coefficients(matrix_coefficients);
        num_units_in_tick(num_units_in_tick);
        time_scale(time_scale);
        pHrdParameters(pHrdParameters);
        max_num_reorder_frames(max_num_reorder_frames);
        max_dec_frame_buffering(max_dec_frame_buffering);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH264SequenceParameterSetVui set(StdVideoH264SequenceParameterSetVui src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH264SequenceParameterSetVui} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH264SequenceParameterSetVui malloc() {
        return wrap(StdVideoH264SequenceParameterSetVui.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH264SequenceParameterSetVui} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH264SequenceParameterSetVui calloc() {
        return wrap(StdVideoH264SequenceParameterSetVui.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH264SequenceParameterSetVui} instance allocated with {@link BufferUtils}. */
    public static StdVideoH264SequenceParameterSetVui create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH264SequenceParameterSetVui.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH264SequenceParameterSetVui} instance for the specified memory address. */
    public static StdVideoH264SequenceParameterSetVui create(long address) {
        return wrap(StdVideoH264SequenceParameterSetVui.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264SequenceParameterSetVui createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH264SequenceParameterSetVui.class, address);
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSetVui.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSetVui.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSetVui.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSetVui.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSetVui.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSetVui.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH264SequenceParameterSetVui.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSetVui.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264SequenceParameterSetVui.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH264SequenceParameterSetVui} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264SequenceParameterSetVui malloc(MemoryStack stack) {
        return wrap(StdVideoH264SequenceParameterSetVui.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH264SequenceParameterSetVui} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264SequenceParameterSetVui calloc(MemoryStack stack) {
        return wrap(StdVideoH264SequenceParameterSetVui.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSetVui.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSetVui.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264SequenceParameterSetVui.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264SequenceParameterSetVui.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspect_ratio_idc}. */
    public static int naspect_ratio_idc(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSetVui.ASPECT_RATIO_IDC); }
    /** Unsafe version of {@link #sar_width}. */
    public static short nsar_width(long struct) { return UNSAFE.getShort(null, struct + StdVideoH264SequenceParameterSetVui.SAR_WIDTH); }
    /** Unsafe version of {@link #sar_height}. */
    public static short nsar_height(long struct) { return UNSAFE.getShort(null, struct + StdVideoH264SequenceParameterSetVui.SAR_HEIGHT); }
    /** Unsafe version of {@link #video_format}. */
    public static byte nvideo_format(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSetVui.VIDEO_FORMAT); }
    /** Unsafe version of {@link #color_primaries}. */
    public static byte ncolor_primaries(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSetVui.COLOR_PRIMARIES); }
    /** Unsafe version of {@link #transfer_characteristics}. */
    public static byte ntransfer_characteristics(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSetVui.TRANSFER_CHARACTERISTICS); }
    /** Unsafe version of {@link #matrix_coefficients}. */
    public static byte nmatrix_coefficients(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSetVui.MATRIX_COEFFICIENTS); }
    /** Unsafe version of {@link #num_units_in_tick}. */
    public static int nnum_units_in_tick(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSetVui.NUM_UNITS_IN_TICK); }
    /** Unsafe version of {@link #time_scale}. */
    public static int ntime_scale(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264SequenceParameterSetVui.TIME_SCALE); }
    /** Unsafe version of {@link #pHrdParameters}. */
    public static StdVideoH264HrdParameters npHrdParameters(long struct) { return StdVideoH264HrdParameters.create(memGetAddress(struct + StdVideoH264SequenceParameterSetVui.PHRDPARAMETERS)); }
    /** Unsafe version of {@link #max_num_reorder_frames}. */
    public static byte nmax_num_reorder_frames(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSetVui.MAX_NUM_REORDER_FRAMES); }
    /** Unsafe version of {@link #max_dec_frame_buffering}. */
    public static byte nmax_dec_frame_buffering(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264SequenceParameterSetVui.MAX_DEC_FRAME_BUFFERING); }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoH264SpsVuiFlags nflags(long struct) { return StdVideoH264SpsVuiFlags.create(struct + StdVideoH264SequenceParameterSetVui.FLAGS); }

    /** Unsafe version of {@link #aspect_ratio_idc(int) aspect_ratio_idc}. */
    public static void naspect_ratio_idc(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSetVui.ASPECT_RATIO_IDC, value); }
    /** Unsafe version of {@link #sar_width(short) sar_width}. */
    public static void nsar_width(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH264SequenceParameterSetVui.SAR_WIDTH, value); }
    /** Unsafe version of {@link #sar_height(short) sar_height}. */
    public static void nsar_height(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH264SequenceParameterSetVui.SAR_HEIGHT, value); }
    /** Unsafe version of {@link #video_format(byte) video_format}. */
    public static void nvideo_format(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSetVui.VIDEO_FORMAT, value); }
    /** Unsafe version of {@link #color_primaries(byte) color_primaries}. */
    public static void ncolor_primaries(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSetVui.COLOR_PRIMARIES, value); }
    /** Unsafe version of {@link #transfer_characteristics(byte) transfer_characteristics}. */
    public static void ntransfer_characteristics(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSetVui.TRANSFER_CHARACTERISTICS, value); }
    /** Unsafe version of {@link #matrix_coefficients(byte) matrix_coefficients}. */
    public static void nmatrix_coefficients(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSetVui.MATRIX_COEFFICIENTS, value); }
    /** Unsafe version of {@link #num_units_in_tick(int) num_units_in_tick}. */
    public static void nnum_units_in_tick(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSetVui.NUM_UNITS_IN_TICK, value); }
    /** Unsafe version of {@link #time_scale(int) time_scale}. */
    public static void ntime_scale(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264SequenceParameterSetVui.TIME_SCALE, value); }
    /** Unsafe version of {@link #pHrdParameters(StdVideoH264HrdParameters) pHrdParameters}. */
    public static void npHrdParameters(long struct, StdVideoH264HrdParameters value) { memPutAddress(struct + StdVideoH264SequenceParameterSetVui.PHRDPARAMETERS, value.address()); }
    /** Unsafe version of {@link #max_num_reorder_frames(byte) max_num_reorder_frames}. */
    public static void nmax_num_reorder_frames(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSetVui.MAX_NUM_REORDER_FRAMES, value); }
    /** Unsafe version of {@link #max_dec_frame_buffering(byte) max_dec_frame_buffering}. */
    public static void nmax_dec_frame_buffering(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264SequenceParameterSetVui.MAX_DEC_FRAME_BUFFERING, value); }
    /** Unsafe version of {@link #flags(StdVideoH264SpsVuiFlags) flags}. */
    public static void nflags(long struct, StdVideoH264SpsVuiFlags value) { memCopy(value.address(), struct + StdVideoH264SequenceParameterSetVui.FLAGS, StdVideoH264SpsVuiFlags.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoH264SequenceParameterSetVui.PHRDPARAMETERS));
    }

    // -----------------------------------

    /** An array of {@link StdVideoH264SequenceParameterSetVui} structs. */
    public static class Buffer extends StructBuffer<StdVideoH264SequenceParameterSetVui, Buffer> implements NativeResource {

        private static final StdVideoH264SequenceParameterSetVui ELEMENT_FACTORY = StdVideoH264SequenceParameterSetVui.create(-1L);

        /**
         * Creates a new {@code StdVideoH264SequenceParameterSetVui.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH264SequenceParameterSetVui#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH264SequenceParameterSetVui getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aspect_ratio_idc} field. */
        @NativeType("StdVideoH264AspectRatioIdc")
        public int aspect_ratio_idc() { return StdVideoH264SequenceParameterSetVui.naspect_ratio_idc(address()); }
        /** @return the value of the {@code sar_width} field. */
        @NativeType("uint16_t")
        public short sar_width() { return StdVideoH264SequenceParameterSetVui.nsar_width(address()); }
        /** @return the value of the {@code sar_height} field. */
        @NativeType("uint16_t")
        public short sar_height() { return StdVideoH264SequenceParameterSetVui.nsar_height(address()); }
        /** @return the value of the {@code video_format} field. */
        @NativeType("uint8_t")
        public byte video_format() { return StdVideoH264SequenceParameterSetVui.nvideo_format(address()); }
        /** @return the value of the {@code color_primaries} field. */
        @NativeType("uint8_t")
        public byte color_primaries() { return StdVideoH264SequenceParameterSetVui.ncolor_primaries(address()); }
        /** @return the value of the {@code transfer_characteristics} field. */
        @NativeType("uint8_t")
        public byte transfer_characteristics() { return StdVideoH264SequenceParameterSetVui.ntransfer_characteristics(address()); }
        /** @return the value of the {@code matrix_coefficients} field. */
        @NativeType("uint8_t")
        public byte matrix_coefficients() { return StdVideoH264SequenceParameterSetVui.nmatrix_coefficients(address()); }
        /** @return the value of the {@code num_units_in_tick} field. */
        @NativeType("uint32_t")
        public int num_units_in_tick() { return StdVideoH264SequenceParameterSetVui.nnum_units_in_tick(address()); }
        /** @return the value of the {@code time_scale} field. */
        @NativeType("uint32_t")
        public int time_scale() { return StdVideoH264SequenceParameterSetVui.ntime_scale(address()); }
        /** @return a {@link StdVideoH264HrdParameters} view of the struct pointed to by the {@link StdVideoH264SequenceParameterSetVui#pHrdParameters} field. */
        @NativeType("StdVideoH264HrdParameters *")
        public StdVideoH264HrdParameters pHrdParameters() { return StdVideoH264SequenceParameterSetVui.npHrdParameters(address()); }
        /** @return the value of the {@code max_num_reorder_frames} field. */
        @NativeType("uint8_t")
        public byte max_num_reorder_frames() { return StdVideoH264SequenceParameterSetVui.nmax_num_reorder_frames(address()); }
        /** @return the value of the {@code max_dec_frame_buffering} field. */
        @NativeType("uint8_t")
        public byte max_dec_frame_buffering() { return StdVideoH264SequenceParameterSetVui.nmax_dec_frame_buffering(address()); }
        /** @return a {@link StdVideoH264SpsVuiFlags} view of the {@code flags} field. */
        public StdVideoH264SpsVuiFlags flags() { return StdVideoH264SequenceParameterSetVui.nflags(address()); }

        /** Sets the specified value to the {@code aspect_ratio_idc} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer aspect_ratio_idc(@NativeType("StdVideoH264AspectRatioIdc") int value) { StdVideoH264SequenceParameterSetVui.naspect_ratio_idc(address(), value); return this; }
        /** Sets the specified value to the {@code sar_width} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer sar_width(@NativeType("uint16_t") short value) { StdVideoH264SequenceParameterSetVui.nsar_width(address(), value); return this; }
        /** Sets the specified value to the {@code sar_height} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer sar_height(@NativeType("uint16_t") short value) { StdVideoH264SequenceParameterSetVui.nsar_height(address(), value); return this; }
        /** Sets the specified value to the {@code video_format} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer video_format(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.nvideo_format(address(), value); return this; }
        /** Sets the specified value to the {@code color_primaries} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer color_primaries(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.ncolor_primaries(address(), value); return this; }
        /** Sets the specified value to the {@code transfer_characteristics} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer transfer_characteristics(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.ntransfer_characteristics(address(), value); return this; }
        /** Sets the specified value to the {@code matrix_coefficients} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer matrix_coefficients(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.nmatrix_coefficients(address(), value); return this; }
        /** Sets the specified value to the {@code num_units_in_tick} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer num_units_in_tick(@NativeType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.nnum_units_in_tick(address(), value); return this; }
        /** Sets the specified value to the {@code time_scale} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer time_scale(@NativeType("uint32_t") int value) { StdVideoH264SequenceParameterSetVui.ntime_scale(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH264HrdParameters} to the {@link StdVideoH264SequenceParameterSetVui#pHrdParameters} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer pHrdParameters(@NativeType("StdVideoH264HrdParameters *") StdVideoH264HrdParameters value) { StdVideoH264SequenceParameterSetVui.npHrdParameters(address(), value); return this; }
        /** Sets the specified value to the {@code max_num_reorder_frames} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer max_num_reorder_frames(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.nmax_num_reorder_frames(address(), value); return this; }
        /** Sets the specified value to the {@code max_dec_frame_buffering} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer max_dec_frame_buffering(@NativeType("uint8_t") byte value) { StdVideoH264SequenceParameterSetVui.nmax_dec_frame_buffering(address(), value); return this; }
        /** Copies the specified {@link StdVideoH264SpsVuiFlags} to the {@code flags} field. */
        public StdVideoH264SequenceParameterSetVui.Buffer flags(StdVideoH264SpsVuiFlags value) { StdVideoH264SequenceParameterSetVui.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH264SequenceParameterSetVui.Buffer flags(java.util.function.Consumer<StdVideoH264SpsVuiFlags> consumer) { consumer.accept(flags()); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct STBIR_RESIZE {
 *     void * user_data;
 *     void const * input_pixels;
 *     int input_w;
 *     int input_h;
 *     double input_s0;
 *     double input_t0;
 *     double input_s1;
 *     double input_t1;
 *     {@link STBIRInputCallbackI stbir_input_callback *}* input_cb;
 *     void * output_pixels;
 *     int output_w;
 *     int output_h;
 *     int output_subx;
 *     int output_suby;
 *     int output_subw;
 *     int output_subh;
 *     {@link STBIROutputCallbackI stbir_output_callback *}* output_cb;
 *     int input_stride_in_bytes;
 *     int output_stride_in_bytes;
 *     int splits;
 *     int fast_alpha;
 *     int needs_rebuild;
 *     int called_alloc;
 *     stbir_pixel_layout input_pixel_layout_public;
 *     stbir_pixel_layout output_pixel_layout_public;
 *     stbir_datatype input_data_type;
 *     stbir_datatype output_data_type;
 *     stbir_filter horizontal_filter;
 *     stbir_filter vertical_filter;
 *     stbir_edge horizontal_edge;
 *     stbir_edge vertical_edge;
 *     {@link STBIRKernelCallbackI stbir__kernel_callback *}* horizontal_filter_kernel;
 *     {@link STBIRSupportCallbackI stbir__support_callback *}* horizontal_filter_support;
 *     {@link STBIRKernelCallbackI stbir__kernel_callback *}* vertical_filter_kernel;
 *     {@link STBIRSupportCallbackI stbir__support_callback *}* vertical_filter_support;
 *     stbir__info * samplers;
 * }}</pre>
 */
public class STBIR_RESIZE extends Struct<STBIR_RESIZE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USER_DATA,
        INPUT_PIXELS,
        INPUT_W,
        INPUT_H,
        INPUT_S0,
        INPUT_T0,
        INPUT_S1,
        INPUT_T1,
        INPUT_CB,
        OUTPUT_PIXELS,
        OUTPUT_W,
        OUTPUT_H,
        OUTPUT_SUBX,
        OUTPUT_SUBY,
        OUTPUT_SUBW,
        OUTPUT_SUBH,
        OUTPUT_CB,
        INPUT_STRIDE_IN_BYTES,
        OUTPUT_STRIDE_IN_BYTES,
        SPLITS,
        FAST_ALPHA,
        NEEDS_REBUILD,
        CALLED_ALLOC,
        INPUT_PIXEL_LAYOUT_PUBLIC,
        OUTPUT_PIXEL_LAYOUT_PUBLIC,
        INPUT_DATA_TYPE,
        OUTPUT_DATA_TYPE,
        HORIZONTAL_FILTER,
        VERTICAL_FILTER,
        HORIZONTAL_EDGE,
        VERTICAL_EDGE,
        HORIZONTAL_FILTER_KERNEL,
        HORIZONTAL_FILTER_SUPPORT,
        VERTICAL_FILTER_KERNEL,
        VERTICAL_FILTER_SUPPORT,
        SAMPLERS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USER_DATA = layout.offsetof(0);
        INPUT_PIXELS = layout.offsetof(1);
        INPUT_W = layout.offsetof(2);
        INPUT_H = layout.offsetof(3);
        INPUT_S0 = layout.offsetof(4);
        INPUT_T0 = layout.offsetof(5);
        INPUT_S1 = layout.offsetof(6);
        INPUT_T1 = layout.offsetof(7);
        INPUT_CB = layout.offsetof(8);
        OUTPUT_PIXELS = layout.offsetof(9);
        OUTPUT_W = layout.offsetof(10);
        OUTPUT_H = layout.offsetof(11);
        OUTPUT_SUBX = layout.offsetof(12);
        OUTPUT_SUBY = layout.offsetof(13);
        OUTPUT_SUBW = layout.offsetof(14);
        OUTPUT_SUBH = layout.offsetof(15);
        OUTPUT_CB = layout.offsetof(16);
        INPUT_STRIDE_IN_BYTES = layout.offsetof(17);
        OUTPUT_STRIDE_IN_BYTES = layout.offsetof(18);
        SPLITS = layout.offsetof(19);
        FAST_ALPHA = layout.offsetof(20);
        NEEDS_REBUILD = layout.offsetof(21);
        CALLED_ALLOC = layout.offsetof(22);
        INPUT_PIXEL_LAYOUT_PUBLIC = layout.offsetof(23);
        OUTPUT_PIXEL_LAYOUT_PUBLIC = layout.offsetof(24);
        INPUT_DATA_TYPE = layout.offsetof(25);
        OUTPUT_DATA_TYPE = layout.offsetof(26);
        HORIZONTAL_FILTER = layout.offsetof(27);
        VERTICAL_FILTER = layout.offsetof(28);
        HORIZONTAL_EDGE = layout.offsetof(29);
        VERTICAL_EDGE = layout.offsetof(30);
        HORIZONTAL_FILTER_KERNEL = layout.offsetof(31);
        HORIZONTAL_FILTER_SUPPORT = layout.offsetof(32);
        VERTICAL_FILTER_KERNEL = layout.offsetof(33);
        VERTICAL_FILTER_SUPPORT = layout.offsetof(34);
        SAMPLERS = layout.offsetof(35);
    }

    protected STBIR_RESIZE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected STBIR_RESIZE create(long address, @Nullable ByteBuffer container) {
        return new STBIR_RESIZE(address, container);
    }

    /**
     * Creates a {@code STBIR_RESIZE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBIR_RESIZE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code user_data} field. */
    @NativeType("void *")
    public long user_data() { return nuser_data(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code input_pixels} field. */
    @NativeType("void const *")
    public ByteBuffer input_pixels(int capacity) { return ninput_pixels(address(), capacity); }
    /** @return the value of the {@code input_w} field. */
    public int input_w() { return ninput_w(address()); }
    /** @return the value of the {@code input_h} field. */
    public int input_h() { return ninput_h(address()); }
    /** @return the value of the {@code input_s0} field. */
    public double input_s0() { return ninput_s0(address()); }
    /** @return the value of the {@code input_t0} field. */
    public double input_t0() { return ninput_t0(address()); }
    /** @return the value of the {@code input_s1} field. */
    public double input_s1() { return ninput_s1(address()); }
    /** @return the value of the {@code input_t1} field. */
    public double input_t1() { return ninput_t1(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code input_cb} field. */
    @NativeType("stbir_input_callback **")
    public @Nullable PointerBuffer input_cb(int capacity) { return ninput_cb(address(), capacity); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code output_pixels} field. */
    @NativeType("void *")
    public @Nullable ByteBuffer output_pixels(int capacity) { return noutput_pixels(address(), capacity); }
    /** @return the value of the {@code output_w} field. */
    public int output_w() { return noutput_w(address()); }
    /** @return the value of the {@code output_h} field. */
    public int output_h() { return noutput_h(address()); }
    /** @return the value of the {@code output_subx} field. */
    public int output_subx() { return noutput_subx(address()); }
    /** @return the value of the {@code output_suby} field. */
    public int output_suby() { return noutput_suby(address()); }
    /** @return the value of the {@code output_subw} field. */
    public int output_subw() { return noutput_subw(address()); }
    /** @return the value of the {@code output_subh} field. */
    public int output_subh() { return noutput_subh(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code output_cb} field. */
    @NativeType("stbir_output_callback **")
    public @Nullable PointerBuffer output_cb(int capacity) { return noutput_cb(address(), capacity); }
    /** @return the value of the {@code input_stride_in_bytes} field. */
    public int input_stride_in_bytes() { return ninput_stride_in_bytes(address()); }
    /** @return the value of the {@code output_stride_in_bytes} field. */
    public int output_stride_in_bytes() { return noutput_stride_in_bytes(address()); }
    /** @return the value of the {@code splits} field. */
    public int splits() { return nsplits(address()); }
    /** @return the value of the {@code fast_alpha} field. */
    @NativeType("int")
    public boolean fast_alpha() { return nfast_alpha(address()) != 0; }
    /** @return the value of the {@code needs_rebuild} field. */
    @NativeType("int")
    public boolean needs_rebuild() { return nneeds_rebuild(address()) != 0; }
    /** @return the value of the {@code called_alloc} field. */
    @NativeType("int")
    public boolean called_alloc() { return ncalled_alloc(address()) != 0; }
    /** @return the value of the {@code input_pixel_layout_public} field. */
    @NativeType("stbir_pixel_layout")
    public int input_pixel_layout_public() { return ninput_pixel_layout_public(address()); }
    /** @return the value of the {@code output_pixel_layout_public} field. */
    @NativeType("stbir_pixel_layout")
    public int output_pixel_layout_public() { return noutput_pixel_layout_public(address()); }
    /** @return the value of the {@code input_data_type} field. */
    @NativeType("stbir_datatype")
    public int input_data_type() { return ninput_data_type(address()); }
    /** @return the value of the {@code output_data_type} field. */
    @NativeType("stbir_datatype")
    public int output_data_type() { return noutput_data_type(address()); }
    /** @return the value of the {@code horizontal_filter} field. */
    @NativeType("stbir_filter")
    public int horizontal_filter() { return nhorizontal_filter(address()); }
    /** @return the value of the {@code vertical_filter} field. */
    @NativeType("stbir_filter")
    public int vertical_filter() { return nvertical_filter(address()); }
    /** @return the value of the {@code horizontal_edge} field. */
    @NativeType("stbir_edge")
    public int horizontal_edge() { return nhorizontal_edge(address()); }
    /** @return the value of the {@code vertical_edge} field. */
    @NativeType("stbir_edge")
    public int vertical_edge() { return nvertical_edge(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code horizontal_filter_kernel} field. */
    @NativeType("stbir__kernel_callback **")
    public @Nullable PointerBuffer horizontal_filter_kernel(int capacity) { return nhorizontal_filter_kernel(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code horizontal_filter_support} field. */
    @NativeType("stbir__support_callback **")
    public @Nullable PointerBuffer horizontal_filter_support(int capacity) { return nhorizontal_filter_support(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code vertical_filter_kernel} field. */
    @NativeType("stbir__kernel_callback **")
    public @Nullable PointerBuffer vertical_filter_kernel(int capacity) { return nvertical_filter_kernel(address(), capacity); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code vertical_filter_support} field. */
    @NativeType("stbir__support_callback **")
    public @Nullable PointerBuffer vertical_filter_support(int capacity) { return nvertical_filter_support(address(), capacity); }
    /** @return the value of the {@code samplers} field. */
    @NativeType("stbir__info *")
    public long samplers() { return nsamplers(address()); }

    /** Sets the specified value to the {@code user_data} field. */
    public STBIR_RESIZE user_data(@NativeType("void *") long value) { nuser_data(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code input_pixels} field. */
    public STBIR_RESIZE input_pixels(@NativeType("void const *") ByteBuffer value) { ninput_pixels(address(), value); return this; }
    /** Sets the specified value to the {@code input_w} field. */
    public STBIR_RESIZE input_w(int value) { ninput_w(address(), value); return this; }
    /** Sets the specified value to the {@code input_h} field. */
    public STBIR_RESIZE input_h(int value) { ninput_h(address(), value); return this; }
    /** Sets the specified value to the {@code input_s0} field. */
    public STBIR_RESIZE input_s0(double value) { ninput_s0(address(), value); return this; }
    /** Sets the specified value to the {@code input_t0} field. */
    public STBIR_RESIZE input_t0(double value) { ninput_t0(address(), value); return this; }
    /** Sets the specified value to the {@code input_s1} field. */
    public STBIR_RESIZE input_s1(double value) { ninput_s1(address(), value); return this; }
    /** Sets the specified value to the {@code input_t1} field. */
    public STBIR_RESIZE input_t1(double value) { ninput_t1(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code input_cb} field. */
    public STBIR_RESIZE input_cb(@Nullable @NativeType("stbir_input_callback **") PointerBuffer value) { ninput_cb(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code output_pixels} field. */
    public STBIR_RESIZE output_pixels(@Nullable @NativeType("void *") ByteBuffer value) { noutput_pixels(address(), value); return this; }
    /** Sets the specified value to the {@code output_w} field. */
    public STBIR_RESIZE output_w(int value) { noutput_w(address(), value); return this; }
    /** Sets the specified value to the {@code output_h} field. */
    public STBIR_RESIZE output_h(int value) { noutput_h(address(), value); return this; }
    /** Sets the specified value to the {@code output_subx} field. */
    public STBIR_RESIZE output_subx(int value) { noutput_subx(address(), value); return this; }
    /** Sets the specified value to the {@code output_suby} field. */
    public STBIR_RESIZE output_suby(int value) { noutput_suby(address(), value); return this; }
    /** Sets the specified value to the {@code output_subw} field. */
    public STBIR_RESIZE output_subw(int value) { noutput_subw(address(), value); return this; }
    /** Sets the specified value to the {@code output_subh} field. */
    public STBIR_RESIZE output_subh(int value) { noutput_subh(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code output_cb} field. */
    public STBIR_RESIZE output_cb(@Nullable @NativeType("stbir_output_callback **") PointerBuffer value) { noutput_cb(address(), value); return this; }
    /** Sets the specified value to the {@code input_stride_in_bytes} field. */
    public STBIR_RESIZE input_stride_in_bytes(int value) { ninput_stride_in_bytes(address(), value); return this; }
    /** Sets the specified value to the {@code output_stride_in_bytes} field. */
    public STBIR_RESIZE output_stride_in_bytes(int value) { noutput_stride_in_bytes(address(), value); return this; }
    /** Sets the specified value to the {@code splits} field. */
    public STBIR_RESIZE splits(int value) { nsplits(address(), value); return this; }
    /** Sets the specified value to the {@code fast_alpha} field. */
    public STBIR_RESIZE fast_alpha(@NativeType("int") boolean value) { nfast_alpha(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code needs_rebuild} field. */
    public STBIR_RESIZE needs_rebuild(@NativeType("int") boolean value) { nneeds_rebuild(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code called_alloc} field. */
    public STBIR_RESIZE called_alloc(@NativeType("int") boolean value) { ncalled_alloc(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code input_pixel_layout_public} field. */
    public STBIR_RESIZE input_pixel_layout_public(@NativeType("stbir_pixel_layout") int value) { ninput_pixel_layout_public(address(), value); return this; }
    /** Sets the specified value to the {@code output_pixel_layout_public} field. */
    public STBIR_RESIZE output_pixel_layout_public(@NativeType("stbir_pixel_layout") int value) { noutput_pixel_layout_public(address(), value); return this; }
    /** Sets the specified value to the {@code input_data_type} field. */
    public STBIR_RESIZE input_data_type(@NativeType("stbir_datatype") int value) { ninput_data_type(address(), value); return this; }
    /** Sets the specified value to the {@code output_data_type} field. */
    public STBIR_RESIZE output_data_type(@NativeType("stbir_datatype") int value) { noutput_data_type(address(), value); return this; }
    /** Sets the specified value to the {@code horizontal_filter} field. */
    public STBIR_RESIZE horizontal_filter(@NativeType("stbir_filter") int value) { nhorizontal_filter(address(), value); return this; }
    /** Sets the specified value to the {@code vertical_filter} field. */
    public STBIR_RESIZE vertical_filter(@NativeType("stbir_filter") int value) { nvertical_filter(address(), value); return this; }
    /** Sets the specified value to the {@code horizontal_edge} field. */
    public STBIR_RESIZE horizontal_edge(@NativeType("stbir_edge") int value) { nhorizontal_edge(address(), value); return this; }
    /** Sets the specified value to the {@code vertical_edge} field. */
    public STBIR_RESIZE vertical_edge(@NativeType("stbir_edge") int value) { nvertical_edge(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code horizontal_filter_kernel} field. */
    public STBIR_RESIZE horizontal_filter_kernel(@Nullable @NativeType("stbir__kernel_callback **") PointerBuffer value) { nhorizontal_filter_kernel(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code horizontal_filter_support} field. */
    public STBIR_RESIZE horizontal_filter_support(@Nullable @NativeType("stbir__support_callback **") PointerBuffer value) { nhorizontal_filter_support(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code vertical_filter_kernel} field. */
    public STBIR_RESIZE vertical_filter_kernel(@Nullable @NativeType("stbir__kernel_callback **") PointerBuffer value) { nvertical_filter_kernel(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code vertical_filter_support} field. */
    public STBIR_RESIZE vertical_filter_support(@Nullable @NativeType("stbir__support_callback **") PointerBuffer value) { nvertical_filter_support(address(), value); return this; }
    /** Sets the specified value to the {@code samplers} field. */
    public STBIR_RESIZE samplers(@NativeType("stbir__info *") long value) { nsamplers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public STBIR_RESIZE set(
        long user_data,
        ByteBuffer input_pixels,
        int input_w,
        int input_h,
        double input_s0,
        double input_t0,
        double input_s1,
        double input_t1,
        @Nullable PointerBuffer input_cb,
        @Nullable ByteBuffer output_pixels,
        int output_w,
        int output_h,
        int output_subx,
        int output_suby,
        int output_subw,
        int output_subh,
        @Nullable PointerBuffer output_cb,
        int input_stride_in_bytes,
        int output_stride_in_bytes,
        int splits,
        boolean fast_alpha,
        boolean needs_rebuild,
        boolean called_alloc,
        int input_pixel_layout_public,
        int output_pixel_layout_public,
        int input_data_type,
        int output_data_type,
        int horizontal_filter,
        int vertical_filter,
        int horizontal_edge,
        int vertical_edge,
        @Nullable PointerBuffer horizontal_filter_kernel,
        @Nullable PointerBuffer horizontal_filter_support,
        @Nullable PointerBuffer vertical_filter_kernel,
        @Nullable PointerBuffer vertical_filter_support,
        long samplers
    ) {
        user_data(user_data);
        input_pixels(input_pixels);
        input_w(input_w);
        input_h(input_h);
        input_s0(input_s0);
        input_t0(input_t0);
        input_s1(input_s1);
        input_t1(input_t1);
        input_cb(input_cb);
        output_pixels(output_pixels);
        output_w(output_w);
        output_h(output_h);
        output_subx(output_subx);
        output_suby(output_suby);
        output_subw(output_subw);
        output_subh(output_subh);
        output_cb(output_cb);
        input_stride_in_bytes(input_stride_in_bytes);
        output_stride_in_bytes(output_stride_in_bytes);
        splits(splits);
        fast_alpha(fast_alpha);
        needs_rebuild(needs_rebuild);
        called_alloc(called_alloc);
        input_pixel_layout_public(input_pixel_layout_public);
        output_pixel_layout_public(output_pixel_layout_public);
        input_data_type(input_data_type);
        output_data_type(output_data_type);
        horizontal_filter(horizontal_filter);
        vertical_filter(vertical_filter);
        horizontal_edge(horizontal_edge);
        vertical_edge(vertical_edge);
        horizontal_filter_kernel(horizontal_filter_kernel);
        horizontal_filter_support(horizontal_filter_support);
        vertical_filter_kernel(vertical_filter_kernel);
        vertical_filter_support(vertical_filter_support);
        samplers(samplers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBIR_RESIZE set(STBIR_RESIZE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code STBIR_RESIZE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBIR_RESIZE malloc() {
        return new STBIR_RESIZE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code STBIR_RESIZE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBIR_RESIZE calloc() {
        return new STBIR_RESIZE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code STBIR_RESIZE} instance allocated with {@link BufferUtils}. */
    public static STBIR_RESIZE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBIR_RESIZE(memAddress(container), container);
    }

    /** Returns a new {@code STBIR_RESIZE} instance for the specified memory address. */
    public static STBIR_RESIZE create(long address) {
        return new STBIR_RESIZE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable STBIR_RESIZE createSafe(long address) {
        return address == NULL ? null : new STBIR_RESIZE(address, null);
    }

    /**
     * Returns a new {@link STBIR_RESIZE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBIR_RESIZE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBIR_RESIZE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBIR_RESIZE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBIR_RESIZE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBIR_RESIZE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link STBIR_RESIZE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBIR_RESIZE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static STBIR_RESIZE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code STBIR_RESIZE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBIR_RESIZE malloc(MemoryStack stack) {
        return new STBIR_RESIZE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code STBIR_RESIZE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBIR_RESIZE calloc(MemoryStack stack) {
        return new STBIR_RESIZE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link STBIR_RESIZE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBIR_RESIZE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBIR_RESIZE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBIR_RESIZE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #user_data}. */
    public static long nuser_data(long struct) { return memGetAddress(struct + STBIR_RESIZE.USER_DATA); }
    /** Unsafe version of {@link #input_pixels(int) input_pixels}. */
    public static ByteBuffer ninput_pixels(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + STBIR_RESIZE.INPUT_PIXELS), capacity); }
    /** Unsafe version of {@link #input_w}. */
    public static int ninput_w(long struct) { return memGetInt(struct + STBIR_RESIZE.INPUT_W); }
    /** Unsafe version of {@link #input_h}. */
    public static int ninput_h(long struct) { return memGetInt(struct + STBIR_RESIZE.INPUT_H); }
    /** Unsafe version of {@link #input_s0}. */
    public static double ninput_s0(long struct) { return memGetDouble(struct + STBIR_RESIZE.INPUT_S0); }
    /** Unsafe version of {@link #input_t0}. */
    public static double ninput_t0(long struct) { return memGetDouble(struct + STBIR_RESIZE.INPUT_T0); }
    /** Unsafe version of {@link #input_s1}. */
    public static double ninput_s1(long struct) { return memGetDouble(struct + STBIR_RESIZE.INPUT_S1); }
    /** Unsafe version of {@link #input_t1}. */
    public static double ninput_t1(long struct) { return memGetDouble(struct + STBIR_RESIZE.INPUT_T1); }
    /** Unsafe version of {@link #input_cb(int) input_cb}. */
    public static @Nullable PointerBuffer ninput_cb(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + STBIR_RESIZE.INPUT_CB), capacity); }
    /** Unsafe version of {@link #output_pixels(int) output_pixels}. */
    public static @Nullable ByteBuffer noutput_pixels(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + STBIR_RESIZE.OUTPUT_PIXELS), capacity); }
    /** Unsafe version of {@link #output_w}. */
    public static int noutput_w(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_W); }
    /** Unsafe version of {@link #output_h}. */
    public static int noutput_h(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_H); }
    /** Unsafe version of {@link #output_subx}. */
    public static int noutput_subx(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_SUBX); }
    /** Unsafe version of {@link #output_suby}. */
    public static int noutput_suby(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_SUBY); }
    /** Unsafe version of {@link #output_subw}. */
    public static int noutput_subw(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_SUBW); }
    /** Unsafe version of {@link #output_subh}. */
    public static int noutput_subh(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_SUBH); }
    /** Unsafe version of {@link #output_cb(int) output_cb}. */
    public static @Nullable PointerBuffer noutput_cb(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + STBIR_RESIZE.OUTPUT_CB), capacity); }
    /** Unsafe version of {@link #input_stride_in_bytes}. */
    public static int ninput_stride_in_bytes(long struct) { return memGetInt(struct + STBIR_RESIZE.INPUT_STRIDE_IN_BYTES); }
    /** Unsafe version of {@link #output_stride_in_bytes}. */
    public static int noutput_stride_in_bytes(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_STRIDE_IN_BYTES); }
    /** Unsafe version of {@link #splits}. */
    public static int nsplits(long struct) { return memGetInt(struct + STBIR_RESIZE.SPLITS); }
    /** Unsafe version of {@link #fast_alpha}. */
    public static int nfast_alpha(long struct) { return memGetInt(struct + STBIR_RESIZE.FAST_ALPHA); }
    /** Unsafe version of {@link #needs_rebuild}. */
    public static int nneeds_rebuild(long struct) { return memGetInt(struct + STBIR_RESIZE.NEEDS_REBUILD); }
    /** Unsafe version of {@link #called_alloc}. */
    public static int ncalled_alloc(long struct) { return memGetInt(struct + STBIR_RESIZE.CALLED_ALLOC); }
    /** Unsafe version of {@link #input_pixel_layout_public}. */
    public static int ninput_pixel_layout_public(long struct) { return memGetInt(struct + STBIR_RESIZE.INPUT_PIXEL_LAYOUT_PUBLIC); }
    /** Unsafe version of {@link #output_pixel_layout_public}. */
    public static int noutput_pixel_layout_public(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_PIXEL_LAYOUT_PUBLIC); }
    /** Unsafe version of {@link #input_data_type}. */
    public static int ninput_data_type(long struct) { return memGetInt(struct + STBIR_RESIZE.INPUT_DATA_TYPE); }
    /** Unsafe version of {@link #output_data_type}. */
    public static int noutput_data_type(long struct) { return memGetInt(struct + STBIR_RESIZE.OUTPUT_DATA_TYPE); }
    /** Unsafe version of {@link #horizontal_filter}. */
    public static int nhorizontal_filter(long struct) { return memGetInt(struct + STBIR_RESIZE.HORIZONTAL_FILTER); }
    /** Unsafe version of {@link #vertical_filter}. */
    public static int nvertical_filter(long struct) { return memGetInt(struct + STBIR_RESIZE.VERTICAL_FILTER); }
    /** Unsafe version of {@link #horizontal_edge}. */
    public static int nhorizontal_edge(long struct) { return memGetInt(struct + STBIR_RESIZE.HORIZONTAL_EDGE); }
    /** Unsafe version of {@link #vertical_edge}. */
    public static int nvertical_edge(long struct) { return memGetInt(struct + STBIR_RESIZE.VERTICAL_EDGE); }
    /** Unsafe version of {@link #horizontal_filter_kernel(int) horizontal_filter_kernel}. */
    public static @Nullable PointerBuffer nhorizontal_filter_kernel(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + STBIR_RESIZE.HORIZONTAL_FILTER_KERNEL), capacity); }
    /** Unsafe version of {@link #horizontal_filter_support(int) horizontal_filter_support}. */
    public static @Nullable PointerBuffer nhorizontal_filter_support(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + STBIR_RESIZE.HORIZONTAL_FILTER_SUPPORT), capacity); }
    /** Unsafe version of {@link #vertical_filter_kernel(int) vertical_filter_kernel}. */
    public static @Nullable PointerBuffer nvertical_filter_kernel(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + STBIR_RESIZE.VERTICAL_FILTER_KERNEL), capacity); }
    /** Unsafe version of {@link #vertical_filter_support(int) vertical_filter_support}. */
    public static @Nullable PointerBuffer nvertical_filter_support(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + STBIR_RESIZE.VERTICAL_FILTER_SUPPORT), capacity); }
    /** Unsafe version of {@link #samplers}. */
    public static long nsamplers(long struct) { return memGetAddress(struct + STBIR_RESIZE.SAMPLERS); }

    /** Unsafe version of {@link #user_data(long) user_data}. */
    public static void nuser_data(long struct, long value) { memPutAddress(struct + STBIR_RESIZE.USER_DATA, value); }
    /** Unsafe version of {@link #input_pixels(ByteBuffer) input_pixels}. */
    public static void ninput_pixels(long struct, ByteBuffer value) { memPutAddress(struct + STBIR_RESIZE.INPUT_PIXELS, memAddress(value)); }
    /** Unsafe version of {@link #input_w(int) input_w}. */
    public static void ninput_w(long struct, int value) { memPutInt(struct + STBIR_RESIZE.INPUT_W, value); }
    /** Unsafe version of {@link #input_h(int) input_h}. */
    public static void ninput_h(long struct, int value) { memPutInt(struct + STBIR_RESIZE.INPUT_H, value); }
    /** Unsafe version of {@link #input_s0(double) input_s0}. */
    public static void ninput_s0(long struct, double value) { memPutDouble(struct + STBIR_RESIZE.INPUT_S0, value); }
    /** Unsafe version of {@link #input_t0(double) input_t0}. */
    public static void ninput_t0(long struct, double value) { memPutDouble(struct + STBIR_RESIZE.INPUT_T0, value); }
    /** Unsafe version of {@link #input_s1(double) input_s1}. */
    public static void ninput_s1(long struct, double value) { memPutDouble(struct + STBIR_RESIZE.INPUT_S1, value); }
    /** Unsafe version of {@link #input_t1(double) input_t1}. */
    public static void ninput_t1(long struct, double value) { memPutDouble(struct + STBIR_RESIZE.INPUT_T1, value); }
    /** Unsafe version of {@link #input_cb(PointerBuffer) input_cb}. */
    public static void ninput_cb(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + STBIR_RESIZE.INPUT_CB, memAddressSafe(value)); }
    /** Unsafe version of {@link #output_pixels(ByteBuffer) output_pixels}. */
    public static void noutput_pixels(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + STBIR_RESIZE.OUTPUT_PIXELS, memAddressSafe(value)); }
    /** Unsafe version of {@link #output_w(int) output_w}. */
    public static void noutput_w(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_W, value); }
    /** Unsafe version of {@link #output_h(int) output_h}. */
    public static void noutput_h(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_H, value); }
    /** Unsafe version of {@link #output_subx(int) output_subx}. */
    public static void noutput_subx(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_SUBX, value); }
    /** Unsafe version of {@link #output_suby(int) output_suby}. */
    public static void noutput_suby(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_SUBY, value); }
    /** Unsafe version of {@link #output_subw(int) output_subw}. */
    public static void noutput_subw(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_SUBW, value); }
    /** Unsafe version of {@link #output_subh(int) output_subh}. */
    public static void noutput_subh(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_SUBH, value); }
    /** Unsafe version of {@link #output_cb(PointerBuffer) output_cb}. */
    public static void noutput_cb(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + STBIR_RESIZE.OUTPUT_CB, memAddressSafe(value)); }
    /** Unsafe version of {@link #input_stride_in_bytes(int) input_stride_in_bytes}. */
    public static void ninput_stride_in_bytes(long struct, int value) { memPutInt(struct + STBIR_RESIZE.INPUT_STRIDE_IN_BYTES, value); }
    /** Unsafe version of {@link #output_stride_in_bytes(int) output_stride_in_bytes}. */
    public static void noutput_stride_in_bytes(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_STRIDE_IN_BYTES, value); }
    /** Unsafe version of {@link #splits(int) splits}. */
    public static void nsplits(long struct, int value) { memPutInt(struct + STBIR_RESIZE.SPLITS, value); }
    /** Unsafe version of {@link #fast_alpha(boolean) fast_alpha}. */
    public static void nfast_alpha(long struct, int value) { memPutInt(struct + STBIR_RESIZE.FAST_ALPHA, value); }
    /** Unsafe version of {@link #needs_rebuild(boolean) needs_rebuild}. */
    public static void nneeds_rebuild(long struct, int value) { memPutInt(struct + STBIR_RESIZE.NEEDS_REBUILD, value); }
    /** Unsafe version of {@link #called_alloc(boolean) called_alloc}. */
    public static void ncalled_alloc(long struct, int value) { memPutInt(struct + STBIR_RESIZE.CALLED_ALLOC, value); }
    /** Unsafe version of {@link #input_pixel_layout_public(int) input_pixel_layout_public}. */
    public static void ninput_pixel_layout_public(long struct, int value) { memPutInt(struct + STBIR_RESIZE.INPUT_PIXEL_LAYOUT_PUBLIC, value); }
    /** Unsafe version of {@link #output_pixel_layout_public(int) output_pixel_layout_public}. */
    public static void noutput_pixel_layout_public(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_PIXEL_LAYOUT_PUBLIC, value); }
    /** Unsafe version of {@link #input_data_type(int) input_data_type}. */
    public static void ninput_data_type(long struct, int value) { memPutInt(struct + STBIR_RESIZE.INPUT_DATA_TYPE, value); }
    /** Unsafe version of {@link #output_data_type(int) output_data_type}. */
    public static void noutput_data_type(long struct, int value) { memPutInt(struct + STBIR_RESIZE.OUTPUT_DATA_TYPE, value); }
    /** Unsafe version of {@link #horizontal_filter(int) horizontal_filter}. */
    public static void nhorizontal_filter(long struct, int value) { memPutInt(struct + STBIR_RESIZE.HORIZONTAL_FILTER, value); }
    /** Unsafe version of {@link #vertical_filter(int) vertical_filter}. */
    public static void nvertical_filter(long struct, int value) { memPutInt(struct + STBIR_RESIZE.VERTICAL_FILTER, value); }
    /** Unsafe version of {@link #horizontal_edge(int) horizontal_edge}. */
    public static void nhorizontal_edge(long struct, int value) { memPutInt(struct + STBIR_RESIZE.HORIZONTAL_EDGE, value); }
    /** Unsafe version of {@link #vertical_edge(int) vertical_edge}. */
    public static void nvertical_edge(long struct, int value) { memPutInt(struct + STBIR_RESIZE.VERTICAL_EDGE, value); }
    /** Unsafe version of {@link #horizontal_filter_kernel(PointerBuffer) horizontal_filter_kernel}. */
    public static void nhorizontal_filter_kernel(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + STBIR_RESIZE.HORIZONTAL_FILTER_KERNEL, memAddressSafe(value)); }
    /** Unsafe version of {@link #horizontal_filter_support(PointerBuffer) horizontal_filter_support}. */
    public static void nhorizontal_filter_support(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + STBIR_RESIZE.HORIZONTAL_FILTER_SUPPORT, memAddressSafe(value)); }
    /** Unsafe version of {@link #vertical_filter_kernel(PointerBuffer) vertical_filter_kernel}. */
    public static void nvertical_filter_kernel(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + STBIR_RESIZE.VERTICAL_FILTER_KERNEL, memAddressSafe(value)); }
    /** Unsafe version of {@link #vertical_filter_support(PointerBuffer) vertical_filter_support}. */
    public static void nvertical_filter_support(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + STBIR_RESIZE.VERTICAL_FILTER_SUPPORT, memAddressSafe(value)); }
    /** Unsafe version of {@link #samplers(long) samplers}. */
    public static void nsamplers(long struct, long value) { memPutAddress(struct + STBIR_RESIZE.SAMPLERS, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + STBIR_RESIZE.INPUT_PIXELS));
        check(memGetAddress(struct + STBIR_RESIZE.SAMPLERS));
    }

    // -----------------------------------

    /** An array of {@link STBIR_RESIZE} structs. */
    public static class Buffer extends StructBuffer<STBIR_RESIZE, Buffer> implements NativeResource {

        private static final STBIR_RESIZE ELEMENT_FACTORY = STBIR_RESIZE.create(-1L);

        /**
         * Creates a new {@code STBIR_RESIZE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBIR_RESIZE#SIZEOF}, and its mark will be undefined.</p>
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
        protected STBIR_RESIZE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code user_data} field. */
        @NativeType("void *")
        public long user_data() { return STBIR_RESIZE.nuser_data(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code input_pixels} field. */
        @NativeType("void const *")
        public ByteBuffer input_pixels(int capacity) { return STBIR_RESIZE.ninput_pixels(address(), capacity); }
        /** @return the value of the {@code input_w} field. */
        public int input_w() { return STBIR_RESIZE.ninput_w(address()); }
        /** @return the value of the {@code input_h} field. */
        public int input_h() { return STBIR_RESIZE.ninput_h(address()); }
        /** @return the value of the {@code input_s0} field. */
        public double input_s0() { return STBIR_RESIZE.ninput_s0(address()); }
        /** @return the value of the {@code input_t0} field. */
        public double input_t0() { return STBIR_RESIZE.ninput_t0(address()); }
        /** @return the value of the {@code input_s1} field. */
        public double input_s1() { return STBIR_RESIZE.ninput_s1(address()); }
        /** @return the value of the {@code input_t1} field. */
        public double input_t1() { return STBIR_RESIZE.ninput_t1(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code input_cb} field. */
        @NativeType("stbir_input_callback **")
        public @Nullable PointerBuffer input_cb(int capacity) { return STBIR_RESIZE.ninput_cb(address(), capacity); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code output_pixels} field. */
        @NativeType("void *")
        public @Nullable ByteBuffer output_pixels(int capacity) { return STBIR_RESIZE.noutput_pixels(address(), capacity); }
        /** @return the value of the {@code output_w} field. */
        public int output_w() { return STBIR_RESIZE.noutput_w(address()); }
        /** @return the value of the {@code output_h} field. */
        public int output_h() { return STBIR_RESIZE.noutput_h(address()); }
        /** @return the value of the {@code output_subx} field. */
        public int output_subx() { return STBIR_RESIZE.noutput_subx(address()); }
        /** @return the value of the {@code output_suby} field. */
        public int output_suby() { return STBIR_RESIZE.noutput_suby(address()); }
        /** @return the value of the {@code output_subw} field. */
        public int output_subw() { return STBIR_RESIZE.noutput_subw(address()); }
        /** @return the value of the {@code output_subh} field. */
        public int output_subh() { return STBIR_RESIZE.noutput_subh(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code output_cb} field. */
        @NativeType("stbir_output_callback **")
        public @Nullable PointerBuffer output_cb(int capacity) { return STBIR_RESIZE.noutput_cb(address(), capacity); }
        /** @return the value of the {@code input_stride_in_bytes} field. */
        public int input_stride_in_bytes() { return STBIR_RESIZE.ninput_stride_in_bytes(address()); }
        /** @return the value of the {@code output_stride_in_bytes} field. */
        public int output_stride_in_bytes() { return STBIR_RESIZE.noutput_stride_in_bytes(address()); }
        /** @return the value of the {@code splits} field. */
        public int splits() { return STBIR_RESIZE.nsplits(address()); }
        /** @return the value of the {@code fast_alpha} field. */
        @NativeType("int")
        public boolean fast_alpha() { return STBIR_RESIZE.nfast_alpha(address()) != 0; }
        /** @return the value of the {@code needs_rebuild} field. */
        @NativeType("int")
        public boolean needs_rebuild() { return STBIR_RESIZE.nneeds_rebuild(address()) != 0; }
        /** @return the value of the {@code called_alloc} field. */
        @NativeType("int")
        public boolean called_alloc() { return STBIR_RESIZE.ncalled_alloc(address()) != 0; }
        /** @return the value of the {@code input_pixel_layout_public} field. */
        @NativeType("stbir_pixel_layout")
        public int input_pixel_layout_public() { return STBIR_RESIZE.ninput_pixel_layout_public(address()); }
        /** @return the value of the {@code output_pixel_layout_public} field. */
        @NativeType("stbir_pixel_layout")
        public int output_pixel_layout_public() { return STBIR_RESIZE.noutput_pixel_layout_public(address()); }
        /** @return the value of the {@code input_data_type} field. */
        @NativeType("stbir_datatype")
        public int input_data_type() { return STBIR_RESIZE.ninput_data_type(address()); }
        /** @return the value of the {@code output_data_type} field. */
        @NativeType("stbir_datatype")
        public int output_data_type() { return STBIR_RESIZE.noutput_data_type(address()); }
        /** @return the value of the {@code horizontal_filter} field. */
        @NativeType("stbir_filter")
        public int horizontal_filter() { return STBIR_RESIZE.nhorizontal_filter(address()); }
        /** @return the value of the {@code vertical_filter} field. */
        @NativeType("stbir_filter")
        public int vertical_filter() { return STBIR_RESIZE.nvertical_filter(address()); }
        /** @return the value of the {@code horizontal_edge} field. */
        @NativeType("stbir_edge")
        public int horizontal_edge() { return STBIR_RESIZE.nhorizontal_edge(address()); }
        /** @return the value of the {@code vertical_edge} field. */
        @NativeType("stbir_edge")
        public int vertical_edge() { return STBIR_RESIZE.nvertical_edge(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code horizontal_filter_kernel} field. */
        @NativeType("stbir__kernel_callback **")
        public @Nullable PointerBuffer horizontal_filter_kernel(int capacity) { return STBIR_RESIZE.nhorizontal_filter_kernel(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code horizontal_filter_support} field. */
        @NativeType("stbir__support_callback **")
        public @Nullable PointerBuffer horizontal_filter_support(int capacity) { return STBIR_RESIZE.nhorizontal_filter_support(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code vertical_filter_kernel} field. */
        @NativeType("stbir__kernel_callback **")
        public @Nullable PointerBuffer vertical_filter_kernel(int capacity) { return STBIR_RESIZE.nvertical_filter_kernel(address(), capacity); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code vertical_filter_support} field. */
        @NativeType("stbir__support_callback **")
        public @Nullable PointerBuffer vertical_filter_support(int capacity) { return STBIR_RESIZE.nvertical_filter_support(address(), capacity); }
        /** @return the value of the {@code samplers} field. */
        @NativeType("stbir__info *")
        public long samplers() { return STBIR_RESIZE.nsamplers(address()); }

        /** Sets the specified value to the {@code user_data} field. */
        public STBIR_RESIZE.Buffer user_data(@NativeType("void *") long value) { STBIR_RESIZE.nuser_data(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code input_pixels} field. */
        public STBIR_RESIZE.Buffer input_pixels(@NativeType("void const *") ByteBuffer value) { STBIR_RESIZE.ninput_pixels(address(), value); return this; }
        /** Sets the specified value to the {@code input_w} field. */
        public STBIR_RESIZE.Buffer input_w(int value) { STBIR_RESIZE.ninput_w(address(), value); return this; }
        /** Sets the specified value to the {@code input_h} field. */
        public STBIR_RESIZE.Buffer input_h(int value) { STBIR_RESIZE.ninput_h(address(), value); return this; }
        /** Sets the specified value to the {@code input_s0} field. */
        public STBIR_RESIZE.Buffer input_s0(double value) { STBIR_RESIZE.ninput_s0(address(), value); return this; }
        /** Sets the specified value to the {@code input_t0} field. */
        public STBIR_RESIZE.Buffer input_t0(double value) { STBIR_RESIZE.ninput_t0(address(), value); return this; }
        /** Sets the specified value to the {@code input_s1} field. */
        public STBIR_RESIZE.Buffer input_s1(double value) { STBIR_RESIZE.ninput_s1(address(), value); return this; }
        /** Sets the specified value to the {@code input_t1} field. */
        public STBIR_RESIZE.Buffer input_t1(double value) { STBIR_RESIZE.ninput_t1(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code input_cb} field. */
        public STBIR_RESIZE.Buffer input_cb(@Nullable @NativeType("stbir_input_callback **") PointerBuffer value) { STBIR_RESIZE.ninput_cb(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code output_pixels} field. */
        public STBIR_RESIZE.Buffer output_pixels(@Nullable @NativeType("void *") ByteBuffer value) { STBIR_RESIZE.noutput_pixels(address(), value); return this; }
        /** Sets the specified value to the {@code output_w} field. */
        public STBIR_RESIZE.Buffer output_w(int value) { STBIR_RESIZE.noutput_w(address(), value); return this; }
        /** Sets the specified value to the {@code output_h} field. */
        public STBIR_RESIZE.Buffer output_h(int value) { STBIR_RESIZE.noutput_h(address(), value); return this; }
        /** Sets the specified value to the {@code output_subx} field. */
        public STBIR_RESIZE.Buffer output_subx(int value) { STBIR_RESIZE.noutput_subx(address(), value); return this; }
        /** Sets the specified value to the {@code output_suby} field. */
        public STBIR_RESIZE.Buffer output_suby(int value) { STBIR_RESIZE.noutput_suby(address(), value); return this; }
        /** Sets the specified value to the {@code output_subw} field. */
        public STBIR_RESIZE.Buffer output_subw(int value) { STBIR_RESIZE.noutput_subw(address(), value); return this; }
        /** Sets the specified value to the {@code output_subh} field. */
        public STBIR_RESIZE.Buffer output_subh(int value) { STBIR_RESIZE.noutput_subh(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code output_cb} field. */
        public STBIR_RESIZE.Buffer output_cb(@Nullable @NativeType("stbir_output_callback **") PointerBuffer value) { STBIR_RESIZE.noutput_cb(address(), value); return this; }
        /** Sets the specified value to the {@code input_stride_in_bytes} field. */
        public STBIR_RESIZE.Buffer input_stride_in_bytes(int value) { STBIR_RESIZE.ninput_stride_in_bytes(address(), value); return this; }
        /** Sets the specified value to the {@code output_stride_in_bytes} field. */
        public STBIR_RESIZE.Buffer output_stride_in_bytes(int value) { STBIR_RESIZE.noutput_stride_in_bytes(address(), value); return this; }
        /** Sets the specified value to the {@code splits} field. */
        public STBIR_RESIZE.Buffer splits(int value) { STBIR_RESIZE.nsplits(address(), value); return this; }
        /** Sets the specified value to the {@code fast_alpha} field. */
        public STBIR_RESIZE.Buffer fast_alpha(@NativeType("int") boolean value) { STBIR_RESIZE.nfast_alpha(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code needs_rebuild} field. */
        public STBIR_RESIZE.Buffer needs_rebuild(@NativeType("int") boolean value) { STBIR_RESIZE.nneeds_rebuild(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code called_alloc} field. */
        public STBIR_RESIZE.Buffer called_alloc(@NativeType("int") boolean value) { STBIR_RESIZE.ncalled_alloc(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code input_pixel_layout_public} field. */
        public STBIR_RESIZE.Buffer input_pixel_layout_public(@NativeType("stbir_pixel_layout") int value) { STBIR_RESIZE.ninput_pixel_layout_public(address(), value); return this; }
        /** Sets the specified value to the {@code output_pixel_layout_public} field. */
        public STBIR_RESIZE.Buffer output_pixel_layout_public(@NativeType("stbir_pixel_layout") int value) { STBIR_RESIZE.noutput_pixel_layout_public(address(), value); return this; }
        /** Sets the specified value to the {@code input_data_type} field. */
        public STBIR_RESIZE.Buffer input_data_type(@NativeType("stbir_datatype") int value) { STBIR_RESIZE.ninput_data_type(address(), value); return this; }
        /** Sets the specified value to the {@code output_data_type} field. */
        public STBIR_RESIZE.Buffer output_data_type(@NativeType("stbir_datatype") int value) { STBIR_RESIZE.noutput_data_type(address(), value); return this; }
        /** Sets the specified value to the {@code horizontal_filter} field. */
        public STBIR_RESIZE.Buffer horizontal_filter(@NativeType("stbir_filter") int value) { STBIR_RESIZE.nhorizontal_filter(address(), value); return this; }
        /** Sets the specified value to the {@code vertical_filter} field. */
        public STBIR_RESIZE.Buffer vertical_filter(@NativeType("stbir_filter") int value) { STBIR_RESIZE.nvertical_filter(address(), value); return this; }
        /** Sets the specified value to the {@code horizontal_edge} field. */
        public STBIR_RESIZE.Buffer horizontal_edge(@NativeType("stbir_edge") int value) { STBIR_RESIZE.nhorizontal_edge(address(), value); return this; }
        /** Sets the specified value to the {@code vertical_edge} field. */
        public STBIR_RESIZE.Buffer vertical_edge(@NativeType("stbir_edge") int value) { STBIR_RESIZE.nvertical_edge(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code horizontal_filter_kernel} field. */
        public STBIR_RESIZE.Buffer horizontal_filter_kernel(@Nullable @NativeType("stbir__kernel_callback **") PointerBuffer value) { STBIR_RESIZE.nhorizontal_filter_kernel(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code horizontal_filter_support} field. */
        public STBIR_RESIZE.Buffer horizontal_filter_support(@Nullable @NativeType("stbir__support_callback **") PointerBuffer value) { STBIR_RESIZE.nhorizontal_filter_support(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code vertical_filter_kernel} field. */
        public STBIR_RESIZE.Buffer vertical_filter_kernel(@Nullable @NativeType("stbir__kernel_callback **") PointerBuffer value) { STBIR_RESIZE.nvertical_filter_kernel(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code vertical_filter_support} field. */
        public STBIR_RESIZE.Buffer vertical_filter_support(@Nullable @NativeType("stbir__support_callback **") PointerBuffer value) { STBIR_RESIZE.nvertical_filter_support(address(), value); return this; }
        /** Sets the specified value to the {@code samplers} field. */
        public STBIR_RESIZE.Buffer samplers(@NativeType("stbir__info *") long value) { STBIR_RESIZE.nsamplers(address(), value); return this; }

    }

}
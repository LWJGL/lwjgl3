/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vpx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code fmt} &ndash; Image Format</li>
 * <li>{@code cs} &ndash; Color Space</li>
 * <li>{@code range} &ndash; Color Range</li>
 * <li>{@code w} &ndash; Stored image width</li>
 * <li>{@code h} &ndash; Stored image height</li>
 * <li>{@code bit_depth} &ndash; Stored image bit-depth</li>
 * <li>{@code d_w} &ndash; Displayed image width</li>
 * <li>{@code d_h} &ndash; Displayed image height</li>
 * <li>{@code r_w} &ndash; Intended rendering image width</li>
 * <li>{@code r_h} &ndash; Intended rendering image height</li>
 * <li>{@code x_chroma_shift} &ndash; subsampling order, X</li>
 * <li>{@code y_chroma_shift} &ndash; subsampling order, Y</li>
 * <li>{@code planes[4]} &ndash; pointer to the top left pixel for each plane</li>
 * <li>{@code stride[4]} &ndash; stride between rows for each plane</li>
 * <li>{@code bps} &ndash; bits per sample (for packed formats)</li>
 * <li>{@code user_priv} &ndash; The following member may be set by the application to associate data with this image.</li>
 * <li>{@code img_data} &ndash; private</li>
 * <li>{@code img_data_owner} &ndash; private</li>
 * <li>{@code self_allocd} &ndash; private</li>
 * <li>{@code fb_priv} &ndash; Frame buffer data associated with the image.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct vpx_image_t {
 *     vpx_img_fmt_t fmt;
 *     vpx_color_space_t cs;
 *     vpx_color_range_t range;
 *     unsigned int w;
 *     unsigned int h;
 *     unsigned int bit_depth;
 *     unsigned int d_w;
 *     unsigned int d_h;
 *     unsigned int r_w;
 *     unsigned int r_h;
 *     unsigned int x_chroma_shift;
 *     unsigned int y_chroma_shift;
 *     unsigned char * planes[4];
 *     int stride[4];
 *     int bps;
 *     void * user_priv;
 *     unsigned char * img_data;
 *     int img_data_owner;
 *     int self_allocd;
 *     void * fb_priv;
 * }</code></pre>
 */
public class vpx_image_t extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FMT,
        CS,
        RANGE,
        W,
        H,
        BIT_DEPTH,
        D_W,
        D_H,
        R_W,
        R_H,
        X_CHROMA_SHIFT,
        Y_CHROMA_SHIFT,
        PLANES,
        STRIDE,
        BPS,
        USER_PRIV,
        IMG_DATA,
        IMG_DATA_OWNER,
        SELF_ALLOCD,
        FB_PRIV;

    static {
        Layout layout = __struct(
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
            __array(POINTER_SIZE, 4),
            __array(4, 4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FMT = layout.offsetof(0);
        CS = layout.offsetof(1);
        RANGE = layout.offsetof(2);
        W = layout.offsetof(3);
        H = layout.offsetof(4);
        BIT_DEPTH = layout.offsetof(5);
        D_W = layout.offsetof(6);
        D_H = layout.offsetof(7);
        R_W = layout.offsetof(8);
        R_H = layout.offsetof(9);
        X_CHROMA_SHIFT = layout.offsetof(10);
        Y_CHROMA_SHIFT = layout.offsetof(11);
        PLANES = layout.offsetof(12);
        STRIDE = layout.offsetof(13);
        BPS = layout.offsetof(14);
        USER_PRIV = layout.offsetof(15);
        IMG_DATA = layout.offsetof(16);
        IMG_DATA_OWNER = layout.offsetof(17);
        SELF_ALLOCD = layout.offsetof(18);
        FB_PRIV = layout.offsetof(19);
    }

    /**
     * Creates a {@code vpx_image_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public vpx_image_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code fmt} field. */
    @NativeType("vpx_img_fmt_t")
    public int fmt() { return nfmt(address()); }
    /** Returns the value of the {@code cs} field. */
    @NativeType("vpx_color_space_t")
    public int cs() { return ncs(address()); }
    /** Returns the value of the {@code range} field. */
    @NativeType("vpx_color_range_t")
    public int range() { return nrange(address()); }
    /** Returns the value of the {@code w} field. */
    @NativeType("unsigned int")
    public int w() { return nw(address()); }
    /** Returns the value of the {@code h} field. */
    @NativeType("unsigned int")
    public int h() { return nh(address()); }
    /** Returns the value of the {@code bit_depth} field. */
    @NativeType("unsigned int")
    public int bit_depth() { return nbit_depth(address()); }
    /** Returns the value of the {@code d_w} field. */
    @NativeType("unsigned int")
    public int d_w() { return nd_w(address()); }
    /** Returns the value of the {@code d_h} field. */
    @NativeType("unsigned int")
    public int d_h() { return nd_h(address()); }
    /** Returns the value of the {@code r_w} field. */
    @NativeType("unsigned int")
    public int r_w() { return nr_w(address()); }
    /** Returns the value of the {@code r_h} field. */
    @NativeType("unsigned int")
    public int r_h() { return nr_h(address()); }
    /** Returns the value of the {@code x_chroma_shift} field. */
    @NativeType("unsigned int")
    public int x_chroma_shift() { return nx_chroma_shift(address()); }
    /** Returns the value of the {@code y_chroma_shift} field. */
    @NativeType("unsigned int")
    public int y_chroma_shift() { return ny_chroma_shift(address()); }
    /** Returns a {@link PointerBuffer} view of the {@code planes} field. */
    @NativeType("unsigned char *[4]")
    public PointerBuffer planes() { return nplanes(address()); }
    /** Returns the value at the specified index of the {@code planes} field. */
    @NativeType("unsigned char *")
    public long planes(int index) { return nplanes(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code stride} field. */
    @NativeType("int[4]")
    public IntBuffer stride() { return nstride(address()); }
    /** Returns the value at the specified index of the {@code stride} field. */
    public int stride(int index) { return nstride(address(), index); }
    /** Returns the value of the {@code bps} field. */
    public int bps() { return nbps(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code user_priv} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer user_priv(int capacity) { return nuser_priv(address(), capacity); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code img_data} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned char *")
    public ByteBuffer img_data(int capacity) { return nimg_data(address(), capacity); }
    /** Returns the value of the {@code img_data_owner} field. */
    public int img_data_owner() { return nimg_data_owner(address()); }
    /** Returns the value of the {@code self_allocd} field. */
    public int self_allocd() { return nself_allocd(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code fb_priv} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer fb_priv(int capacity) { return nfb_priv(address(), capacity); }

    /** Sets the specified value to the {@code fmt} field. */
    public vpx_image_t fmt(@NativeType("vpx_img_fmt_t") int value) { nfmt(address(), value); return this; }
    /** Sets the specified value to the {@code cs} field. */
    public vpx_image_t cs(@NativeType("vpx_color_space_t") int value) { ncs(address(), value); return this; }
    /** Sets the specified value to the {@code range} field. */
    public vpx_image_t range(@NativeType("vpx_color_range_t") int value) { nrange(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public vpx_image_t w(@NativeType("unsigned int") int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public vpx_image_t h(@NativeType("unsigned int") int value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code bit_depth} field. */
    public vpx_image_t bit_depth(@NativeType("unsigned int") int value) { nbit_depth(address(), value); return this; }
    /** Sets the specified value to the {@code d_w} field. */
    public vpx_image_t d_w(@NativeType("unsigned int") int value) { nd_w(address(), value); return this; }
    /** Sets the specified value to the {@code d_h} field. */
    public vpx_image_t d_h(@NativeType("unsigned int") int value) { nd_h(address(), value); return this; }
    /** Sets the specified value to the {@code r_w} field. */
    public vpx_image_t r_w(@NativeType("unsigned int") int value) { nr_w(address(), value); return this; }
    /** Sets the specified value to the {@code r_h} field. */
    public vpx_image_t r_h(@NativeType("unsigned int") int value) { nr_h(address(), value); return this; }
    /** Sets the specified value to the {@code x_chroma_shift} field. */
    public vpx_image_t x_chroma_shift(@NativeType("unsigned int") int value) { nx_chroma_shift(address(), value); return this; }
    /** Sets the specified value to the {@code y_chroma_shift} field. */
    public vpx_image_t y_chroma_shift(@NativeType("unsigned int") int value) { ny_chroma_shift(address(), value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code planes} field. */
    public vpx_image_t planes(@NativeType("unsigned char *[4]") PointerBuffer value) { nplanes(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code planes} field. */
    public vpx_image_t planes(int index, @NativeType("unsigned char *") ByteBuffer value) { nplanes(address(), index, memAddress(value)); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code stride} field. */
    public vpx_image_t stride(@NativeType("int[4]") IntBuffer value) { nstride(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code stride} field. */
    public vpx_image_t stride(int index, int value) { nstride(address(), index, value); return this; }
    /** Sets the specified value to the {@code bps} field. */
    public vpx_image_t bps(int value) { nbps(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code user_priv} field. */
    public vpx_image_t user_priv(@NativeType("void *") ByteBuffer value) { nuser_priv(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code img_data} field. */
    public vpx_image_t img_data(@NativeType("unsigned char *") ByteBuffer value) { nimg_data(address(), value); return this; }
    /** Sets the specified value to the {@code img_data_owner} field. */
    public vpx_image_t img_data_owner(int value) { nimg_data_owner(address(), value); return this; }
    /** Sets the specified value to the {@code self_allocd} field. */
    public vpx_image_t self_allocd(int value) { nself_allocd(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code fb_priv} field. */
    public vpx_image_t fb_priv(@NativeType("void *") ByteBuffer value) { nfb_priv(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public vpx_image_t set(
        int fmt,
        int cs,
        int range,
        int w,
        int h,
        int bit_depth,
        int d_w,
        int d_h,
        int r_w,
        int r_h,
        int x_chroma_shift,
        int y_chroma_shift,
        PointerBuffer planes,
        IntBuffer stride,
        int bps,
        ByteBuffer user_priv,
        ByteBuffer img_data,
        int img_data_owner,
        int self_allocd,
        ByteBuffer fb_priv
    ) {
        fmt(fmt);
        cs(cs);
        range(range);
        w(w);
        h(h);
        bit_depth(bit_depth);
        d_w(d_w);
        d_h(d_h);
        r_w(r_w);
        r_h(r_h);
        x_chroma_shift(x_chroma_shift);
        y_chroma_shift(y_chroma_shift);
        planes(planes);
        stride(stride);
        bps(bps);
        user_priv(user_priv);
        img_data(img_data);
        img_data_owner(img_data_owner);
        self_allocd(self_allocd);
        fb_priv(fb_priv);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public vpx_image_t set(vpx_image_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code vpx_image_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static vpx_image_t malloc() {
        return wrap(vpx_image_t.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code vpx_image_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static vpx_image_t calloc() {
        return wrap(vpx_image_t.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code vpx_image_t} instance allocated with {@link BufferUtils}. */
    public static vpx_image_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(vpx_image_t.class, memAddress(container), container);
    }

    /** Returns a new {@code vpx_image_t} instance for the specified memory address. */
    public static vpx_image_t create(long address) {
        return wrap(vpx_image_t.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_image_t createSafe(long address) {
        return address == NULL ? null : wrap(vpx_image_t.class, address);
    }

    /**
     * Returns a new {@link vpx_image_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_image_t.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link vpx_image_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_image_t.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_image_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_image_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link vpx_image_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static vpx_image_t.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_image_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code vpx_image_t} instance allocated on the thread-local {@link MemoryStack}. */
    public static vpx_image_t mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code vpx_image_t} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static vpx_image_t callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code vpx_image_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_image_t mallocStack(MemoryStack stack) {
        return wrap(vpx_image_t.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code vpx_image_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_image_t callocStack(MemoryStack stack) {
        return wrap(vpx_image_t.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link vpx_image_t.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_image_t.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_image_t.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_image_t.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_image_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_image_t.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_image_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_image_t.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fmt}. */
    public static int nfmt(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.FMT); }
    /** Unsafe version of {@link #cs}. */
    public static int ncs(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.CS); }
    /** Unsafe version of {@link #range}. */
    public static int nrange(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.RANGE); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.H); }
    /** Unsafe version of {@link #bit_depth}. */
    public static int nbit_depth(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.BIT_DEPTH); }
    /** Unsafe version of {@link #d_w}. */
    public static int nd_w(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.D_W); }
    /** Unsafe version of {@link #d_h}. */
    public static int nd_h(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.D_H); }
    /** Unsafe version of {@link #r_w}. */
    public static int nr_w(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.R_W); }
    /** Unsafe version of {@link #r_h}. */
    public static int nr_h(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.R_H); }
    /** Unsafe version of {@link #x_chroma_shift}. */
    public static int nx_chroma_shift(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.X_CHROMA_SHIFT); }
    /** Unsafe version of {@link #y_chroma_shift}. */
    public static int ny_chroma_shift(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.Y_CHROMA_SHIFT); }
    /** Unsafe version of {@link #planes}. */
    public static PointerBuffer nplanes(long struct) { return memPointerBuffer(struct + vpx_image_t.PLANES, 4); }
    /** Unsafe version of {@link #planes(int) planes}. */
    public static long nplanes(long struct, int index) {
        return memGetAddress(struct + vpx_image_t.PLANES + check(index, 4) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #stride}. */
    public static IntBuffer nstride(long struct) { return memIntBuffer(struct + vpx_image_t.STRIDE, 4); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static int nstride(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_image_t.STRIDE + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #bps}. */
    public static int nbps(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.BPS); }
    /** Unsafe version of {@link #user_priv(int) user_priv}. */
    public static ByteBuffer nuser_priv(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + vpx_image_t.USER_PRIV), capacity); }
    /** Unsafe version of {@link #img_data(int) img_data}. */
    public static ByteBuffer nimg_data(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + vpx_image_t.IMG_DATA), capacity); }
    /** Unsafe version of {@link #img_data_owner}. */
    public static int nimg_data_owner(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.IMG_DATA_OWNER); }
    /** Unsafe version of {@link #self_allocd}. */
    public static int nself_allocd(long struct) { return UNSAFE.getInt(null, struct + vpx_image_t.SELF_ALLOCD); }
    /** Unsafe version of {@link #fb_priv(int) fb_priv}. */
    public static ByteBuffer nfb_priv(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + vpx_image_t.FB_PRIV), capacity); }

    /** Unsafe version of {@link #fmt(int) fmt}. */
    public static void nfmt(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.FMT, value); }
    /** Unsafe version of {@link #cs(int) cs}. */
    public static void ncs(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.CS, value); }
    /** Unsafe version of {@link #range(int) range}. */
    public static void nrange(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.RANGE, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.H, value); }
    /** Unsafe version of {@link #bit_depth(int) bit_depth}. */
    public static void nbit_depth(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.BIT_DEPTH, value); }
    /** Unsafe version of {@link #d_w(int) d_w}. */
    public static void nd_w(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.D_W, value); }
    /** Unsafe version of {@link #d_h(int) d_h}. */
    public static void nd_h(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.D_H, value); }
    /** Unsafe version of {@link #r_w(int) r_w}. */
    public static void nr_w(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.R_W, value); }
    /** Unsafe version of {@link #r_h(int) r_h}. */
    public static void nr_h(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.R_H, value); }
    /** Unsafe version of {@link #x_chroma_shift(int) x_chroma_shift}. */
    public static void nx_chroma_shift(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.X_CHROMA_SHIFT, value); }
    /** Unsafe version of {@link #y_chroma_shift(int) y_chroma_shift}. */
    public static void ny_chroma_shift(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.Y_CHROMA_SHIFT, value); }
    /** Unsafe version of {@link #planes(PointerBuffer) planes}. */
    public static void nplanes(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + vpx_image_t.PLANES, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #planes(int, long) planes}. */
    public static void nplanes(long struct, int index, long value) {
        memPutAddress(struct + vpx_image_t.PLANES + check(index, 4) * POINTER_SIZE, value);
    }
    /** Unsafe version of {@link #stride(IntBuffer) stride}. */
    public static void nstride(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + vpx_image_t.STRIDE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #stride(int, int) stride}. */
    public static void nstride(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_image_t.STRIDE + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #bps(int) bps}. */
    public static void nbps(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.BPS, value); }
    /** Unsafe version of {@link #user_priv(ByteBuffer) user_priv}. */
    public static void nuser_priv(long struct, ByteBuffer value) { memPutAddress(struct + vpx_image_t.USER_PRIV, memAddress(value)); }
    /** Unsafe version of {@link #img_data(ByteBuffer) img_data}. */
    public static void nimg_data(long struct, ByteBuffer value) { memPutAddress(struct + vpx_image_t.IMG_DATA, memAddress(value)); }
    /** Unsafe version of {@link #img_data_owner(int) img_data_owner}. */
    public static void nimg_data_owner(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.IMG_DATA_OWNER, value); }
    /** Unsafe version of {@link #self_allocd(int) self_allocd}. */
    public static void nself_allocd(long struct, int value) { UNSAFE.putInt(null, struct + vpx_image_t.SELF_ALLOCD, value); }
    /** Unsafe version of {@link #fb_priv(ByteBuffer) fb_priv}. */
    public static void nfb_priv(long struct, ByteBuffer value) { memPutAddress(struct + vpx_image_t.FB_PRIV, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + vpx_image_t.PLANES));
        check(memGetAddress(struct + vpx_image_t.USER_PRIV));
        check(memGetAddress(struct + vpx_image_t.IMG_DATA));
        check(memGetAddress(struct + vpx_image_t.FB_PRIV));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link vpx_image_t} structs. */
    public static class Buffer extends StructBuffer<vpx_image_t, Buffer> implements NativeResource {

        private static final vpx_image_t ELEMENT_FACTORY = vpx_image_t.create(-1L);

        /**
         * Creates a new {@code vpx_image_t.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link vpx_image_t#SIZEOF}, and its mark will be undefined.
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
        protected vpx_image_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code fmt} field. */
        @NativeType("vpx_img_fmt_t")
        public int fmt() { return vpx_image_t.nfmt(address()); }
        /** Returns the value of the {@code cs} field. */
        @NativeType("vpx_color_space_t")
        public int cs() { return vpx_image_t.ncs(address()); }
        /** Returns the value of the {@code range} field. */
        @NativeType("vpx_color_range_t")
        public int range() { return vpx_image_t.nrange(address()); }
        /** Returns the value of the {@code w} field. */
        @NativeType("unsigned int")
        public int w() { return vpx_image_t.nw(address()); }
        /** Returns the value of the {@code h} field. */
        @NativeType("unsigned int")
        public int h() { return vpx_image_t.nh(address()); }
        /** Returns the value of the {@code bit_depth} field. */
        @NativeType("unsigned int")
        public int bit_depth() { return vpx_image_t.nbit_depth(address()); }
        /** Returns the value of the {@code d_w} field. */
        @NativeType("unsigned int")
        public int d_w() { return vpx_image_t.nd_w(address()); }
        /** Returns the value of the {@code d_h} field. */
        @NativeType("unsigned int")
        public int d_h() { return vpx_image_t.nd_h(address()); }
        /** Returns the value of the {@code r_w} field. */
        @NativeType("unsigned int")
        public int r_w() { return vpx_image_t.nr_w(address()); }
        /** Returns the value of the {@code r_h} field. */
        @NativeType("unsigned int")
        public int r_h() { return vpx_image_t.nr_h(address()); }
        /** Returns the value of the {@code x_chroma_shift} field. */
        @NativeType("unsigned int")
        public int x_chroma_shift() { return vpx_image_t.nx_chroma_shift(address()); }
        /** Returns the value of the {@code y_chroma_shift} field. */
        @NativeType("unsigned int")
        public int y_chroma_shift() { return vpx_image_t.ny_chroma_shift(address()); }
        /** Returns a {@link PointerBuffer} view of the {@code planes} field. */
        @NativeType("unsigned char *[4]")
        public PointerBuffer planes() { return vpx_image_t.nplanes(address()); }
        /** Returns the value at the specified index of the {@code planes} field. */
        @NativeType("unsigned char *")
        public long planes(int index) { return vpx_image_t.nplanes(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code stride} field. */
        @NativeType("int[4]")
        public IntBuffer stride() { return vpx_image_t.nstride(address()); }
        /** Returns the value at the specified index of the {@code stride} field. */
        public int stride(int index) { return vpx_image_t.nstride(address(), index); }
        /** Returns the value of the {@code bps} field. */
        public int bps() { return vpx_image_t.nbps(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code user_priv} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer user_priv(int capacity) { return vpx_image_t.nuser_priv(address(), capacity); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code img_data} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned char *")
        public ByteBuffer img_data(int capacity) { return vpx_image_t.nimg_data(address(), capacity); }
        /** Returns the value of the {@code img_data_owner} field. */
        public int img_data_owner() { return vpx_image_t.nimg_data_owner(address()); }
        /** Returns the value of the {@code self_allocd} field. */
        public int self_allocd() { return vpx_image_t.nself_allocd(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code fb_priv} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer fb_priv(int capacity) { return vpx_image_t.nfb_priv(address(), capacity); }

        /** Sets the specified value to the {@code fmt} field. */
        public vpx_image_t.Buffer fmt(@NativeType("vpx_img_fmt_t") int value) { vpx_image_t.nfmt(address(), value); return this; }
        /** Sets the specified value to the {@code cs} field. */
        public vpx_image_t.Buffer cs(@NativeType("vpx_color_space_t") int value) { vpx_image_t.ncs(address(), value); return this; }
        /** Sets the specified value to the {@code range} field. */
        public vpx_image_t.Buffer range(@NativeType("vpx_color_range_t") int value) { vpx_image_t.nrange(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public vpx_image_t.Buffer w(@NativeType("unsigned int") int value) { vpx_image_t.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public vpx_image_t.Buffer h(@NativeType("unsigned int") int value) { vpx_image_t.nh(address(), value); return this; }
        /** Sets the specified value to the {@code bit_depth} field. */
        public vpx_image_t.Buffer bit_depth(@NativeType("unsigned int") int value) { vpx_image_t.nbit_depth(address(), value); return this; }
        /** Sets the specified value to the {@code d_w} field. */
        public vpx_image_t.Buffer d_w(@NativeType("unsigned int") int value) { vpx_image_t.nd_w(address(), value); return this; }
        /** Sets the specified value to the {@code d_h} field. */
        public vpx_image_t.Buffer d_h(@NativeType("unsigned int") int value) { vpx_image_t.nd_h(address(), value); return this; }
        /** Sets the specified value to the {@code r_w} field. */
        public vpx_image_t.Buffer r_w(@NativeType("unsigned int") int value) { vpx_image_t.nr_w(address(), value); return this; }
        /** Sets the specified value to the {@code r_h} field. */
        public vpx_image_t.Buffer r_h(@NativeType("unsigned int") int value) { vpx_image_t.nr_h(address(), value); return this; }
        /** Sets the specified value to the {@code x_chroma_shift} field. */
        public vpx_image_t.Buffer x_chroma_shift(@NativeType("unsigned int") int value) { vpx_image_t.nx_chroma_shift(address(), value); return this; }
        /** Sets the specified value to the {@code y_chroma_shift} field. */
        public vpx_image_t.Buffer y_chroma_shift(@NativeType("unsigned int") int value) { vpx_image_t.ny_chroma_shift(address(), value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code planes} field. */
        public vpx_image_t.Buffer planes(@NativeType("unsigned char *[4]") PointerBuffer value) { vpx_image_t.nplanes(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code planes} field. */
        public vpx_image_t.Buffer planes(int index, @NativeType("unsigned char *") ByteBuffer value) { vpx_image_t.nplanes(address(), index, memAddress(value)); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code stride} field. */
        public vpx_image_t.Buffer stride(@NativeType("int[4]") IntBuffer value) { vpx_image_t.nstride(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code stride} field. */
        public vpx_image_t.Buffer stride(int index, int value) { vpx_image_t.nstride(address(), index, value); return this; }
        /** Sets the specified value to the {@code bps} field. */
        public vpx_image_t.Buffer bps(int value) { vpx_image_t.nbps(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code user_priv} field. */
        public vpx_image_t.Buffer user_priv(@NativeType("void *") ByteBuffer value) { vpx_image_t.nuser_priv(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code img_data} field. */
        public vpx_image_t.Buffer img_data(@NativeType("unsigned char *") ByteBuffer value) { vpx_image_t.nimg_data(address(), value); return this; }
        /** Sets the specified value to the {@code img_data_owner} field. */
        public vpx_image_t.Buffer img_data_owner(int value) { vpx_image_t.nimg_data_owner(address(), value); return this; }
        /** Sets the specified value to the {@code self_allocd} field. */
        public vpx_image_t.Buffer self_allocd(int value) { vpx_image_t.nself_allocd(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code fb_priv} field. */
        public vpx_image_t.Buffer fb_priv(@NativeType("void *") ByteBuffer value) { vpx_image_t.nfb_priv(address(), value); return this; }

    }

}
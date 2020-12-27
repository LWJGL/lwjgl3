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
 * Encoder output packet
 *
 * This structure contains the different kinds of output data the encoder
 * may produce while compressing a frame.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code kind} &ndash; packet variant</li>
 * <li><em>&lt;union&gt;</em>
 * 
 * <ul>
 * <li><em>&lt;struct&gt;</em>
 * 
 * <ul>
 * <li>{@code buf} &ndash; compressed data buffer</li>
 * <li>{@code sz} &ndash; length of compressed data</li>
 * <li>{@code pts} &ndash; time stamp to show frame (in timebase units)</li>
 * <li>{@code duration} &ndash; brief duration to show frame (in timebase units)</li>
 * <li>{@code flags} &ndash; flags for this frame</li>
 * <li>{@code partition_id} &ndash; 
 * the partition id defines the decoding order of the partitions.
       * Only applicable when "output partition" mode is enabled. First
       * partition has id 0.</li>
 * <li>{@code width[5]} &ndash; frame width. Width and height of frames in this packet. VP8 will only use the first one.</li>
 * <li>{@code height[5]} &ndash; frame height</li>
 * <li>{@code spatial_layer_encoded[5]} &ndash; 
 * Flag to indicate if spatial layer frame in this packet is
       * encoded or dropped. VP8 will always be set to 1.</li>
 * </ul></li>
 * <li>{@code twopass_stats} &ndash; data for two-pass packet</li>
 * <li>{@code firstpass_mb_stats} &ndash; first pass mb packet</li>
 * <li>{@code raw} &ndash; data for arbitrary packets</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct vpx_codec_cx_pkt_t {
 *     vpx_codec_cx_pkt_kind kind;
 *     union {
 *         struct {
 *             void * buf;
 *             size_t sz;
 *             vpx_codec_pts_t pts;
 *             unsigned long duration;
 *             vpx_codec_frame_flags_t flags;
 *             int partition_id;
 *             unsigned int width[5];
 *             unsigned int height[5];
 *             uint8_t spatial_layer_encoded[5];
 *         };
 *         {@link vpx_fixed_buf_t vpx_fixed_buf_t} twopass_stats;
 *         {@link vpx_fixed_buf_t vpx_fixed_buf_t} firstpass_mb_stats;
 *         {@link vpx_fixed_buf_t vpx_fixed_buf_t} raw;
 *     };
 * }</code></pre>
 */
public class vpx_codec_cx_pkt_t extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KIND,
        BUF,
        SZ,
        PTS,
        DURATION,
        FLAGS,
        PARTITION_ID,
        WIDTH,
        HEIGHT,
        SPATIAL_LAYER_ENCODED,
        TWOPASS_STATS,
        FIRSTPASS_MB_STATS,
        RAW;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __struct(
                    __member(POINTER_SIZE),
                    __member(POINTER_SIZE),
                    __member(8),
                    __member(CLONG_SIZE),
                    __member(4),
                    __member(4),
                    __array(4, 5),
                    __array(4, 5),
                    __array(1, 5)
                ),
                __member(vpx_fixed_buf_t.SIZEOF, vpx_fixed_buf_t.ALIGNOF),
                __member(vpx_fixed_buf_t.SIZEOF, vpx_fixed_buf_t.ALIGNOF),
                __member(vpx_fixed_buf_t.SIZEOF, vpx_fixed_buf_t.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KIND = layout.offsetof(0);
        BUF = layout.offsetof(3);
        SZ = layout.offsetof(4);
        PTS = layout.offsetof(5);
        DURATION = layout.offsetof(6);
        FLAGS = layout.offsetof(7);
        PARTITION_ID = layout.offsetof(8);
        WIDTH = layout.offsetof(9);
        HEIGHT = layout.offsetof(10);
        SPATIAL_LAYER_ENCODED = layout.offsetof(11);
        TWOPASS_STATS = layout.offsetof(12);
        FIRSTPASS_MB_STATS = layout.offsetof(13);
        RAW = layout.offsetof(14);
    }

    /**
     * Creates a {@code vpx_codec_cx_pkt_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public vpx_codec_cx_pkt_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code kind} field. */
    @NativeType("vpx_codec_cx_pkt_kind")
    public int kind() { return nkind(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code buf} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer buf(int capacity) { return nbuf(address(), capacity); }
    /** Returns the value of the {@code sz} field. */
    @NativeType("size_t")
    public long sz() { return nsz(address()); }
    /** Returns the value of the {@code pts} field. */
    @NativeType("vpx_codec_pts_t")
    public long pts() { return npts(address()); }
    /** Returns the value of the {@code duration} field. */
    @NativeType("unsigned long")
    public long duration() { return nduration(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("vpx_codec_frame_flags_t")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code partition_id} field. */
    public int partition_id() { return npartition_id(address()); }
    /** Returns a {@link IntBuffer} view of the {@code width} field. */
    @NativeType("unsigned int[5]")
    public IntBuffer width() { return nwidth(address()); }
    /** Returns the value at the specified index of the {@code width} field. */
    @NativeType("unsigned int")
    public int width(int index) { return nwidth(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code height} field. */
    @NativeType("unsigned int[5]")
    public IntBuffer height() { return nheight(address()); }
    /** Returns the value at the specified index of the {@code height} field. */
    @NativeType("unsigned int")
    public int height(int index) { return nheight(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code spatial_layer_encoded} field. */
    @NativeType("uint8_t[5]")
    public ByteBuffer spatial_layer_encoded() { return nspatial_layer_encoded(address()); }
    /** Returns the value at the specified index of the {@code spatial_layer_encoded} field. */
    @NativeType("uint8_t")
    public byte spatial_layer_encoded(int index) { return nspatial_layer_encoded(address(), index); }
    /** Returns a {@link vpx_fixed_buf_t} view of the {@code twopass_stats} field. */
    public vpx_fixed_buf_t twopass_stats() { return ntwopass_stats(address()); }
    /** Returns a {@link vpx_fixed_buf_t} view of the {@code firstpass_mb_stats} field. */
    public vpx_fixed_buf_t firstpass_mb_stats() { return nfirstpass_mb_stats(address()); }
    /** Returns a {@link vpx_fixed_buf_t} view of the {@code raw} field. */
    public vpx_fixed_buf_t raw() { return nraw(address()); }

    /** Sets the specified value to the {@code kind} field. */
    public vpx_codec_cx_pkt_t kind(@NativeType("vpx_codec_cx_pkt_kind") int value) { nkind(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code buf} field. */
    public vpx_codec_cx_pkt_t buf(@NativeType("void *") ByteBuffer value) { nbuf(address(), value); return this; }
    /** Sets the specified value to the {@code sz} field. */
    public vpx_codec_cx_pkt_t sz(@NativeType("size_t") long value) { nsz(address(), value); return this; }
    /** Sets the specified value to the {@code pts} field. */
    public vpx_codec_cx_pkt_t pts(@NativeType("vpx_codec_pts_t") long value) { npts(address(), value); return this; }
    /** Sets the specified value to the {@code duration} field. */
    public vpx_codec_cx_pkt_t duration(@NativeType("unsigned long") long value) { nduration(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public vpx_codec_cx_pkt_t flags(@NativeType("vpx_codec_frame_flags_t") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code partition_id} field. */
    public vpx_codec_cx_pkt_t partition_id(int value) { npartition_id(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code width} field. */
    public vpx_codec_cx_pkt_t width(@NativeType("unsigned int[5]") IntBuffer value) { nwidth(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code width} field. */
    public vpx_codec_cx_pkt_t width(int index, @NativeType("unsigned int") int value) { nwidth(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code height} field. */
    public vpx_codec_cx_pkt_t height(@NativeType("unsigned int[5]") IntBuffer value) { nheight(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code height} field. */
    public vpx_codec_cx_pkt_t height(int index, @NativeType("unsigned int") int value) { nheight(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code spatial_layer_encoded} field. */
    public vpx_codec_cx_pkt_t spatial_layer_encoded(@NativeType("uint8_t[5]") ByteBuffer value) { nspatial_layer_encoded(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code spatial_layer_encoded} field. */
    public vpx_codec_cx_pkt_t spatial_layer_encoded(int index, @NativeType("uint8_t") byte value) { nspatial_layer_encoded(address(), index, value); return this; }
    /** Copies the specified {@link vpx_fixed_buf_t} to the {@code twopass_stats} field. */
    public vpx_codec_cx_pkt_t twopass_stats(vpx_fixed_buf_t value) { ntwopass_stats(address(), value); return this; }
    /** Passes the {@code twopass_stats} field to the specified {@link java.util.function.Consumer Consumer}. */
    public vpx_codec_cx_pkt_t twopass_stats(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(twopass_stats()); return this; }
    /** Copies the specified {@link vpx_fixed_buf_t} to the {@code firstpass_mb_stats} field. */
    public vpx_codec_cx_pkt_t firstpass_mb_stats(vpx_fixed_buf_t value) { nfirstpass_mb_stats(address(), value); return this; }
    /** Passes the {@code firstpass_mb_stats} field to the specified {@link java.util.function.Consumer Consumer}. */
    public vpx_codec_cx_pkt_t firstpass_mb_stats(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(firstpass_mb_stats()); return this; }
    /** Copies the specified {@link vpx_fixed_buf_t} to the {@code raw} field. */
    public vpx_codec_cx_pkt_t raw(vpx_fixed_buf_t value) { nraw(address(), value); return this; }
    /** Passes the {@code raw} field to the specified {@link java.util.function.Consumer Consumer}. */
    public vpx_codec_cx_pkt_t raw(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(raw()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public vpx_codec_cx_pkt_t set(vpx_codec_cx_pkt_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code vpx_codec_cx_pkt_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static vpx_codec_cx_pkt_t malloc() {
        return wrap(vpx_codec_cx_pkt_t.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code vpx_codec_cx_pkt_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static vpx_codec_cx_pkt_t calloc() {
        return wrap(vpx_codec_cx_pkt_t.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code vpx_codec_cx_pkt_t} instance allocated with {@link BufferUtils}. */
    public static vpx_codec_cx_pkt_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(vpx_codec_cx_pkt_t.class, memAddress(container), container);
    }

    /** Returns a new {@code vpx_codec_cx_pkt_t} instance for the specified memory address. */
    public static vpx_codec_cx_pkt_t create(long address) {
        return wrap(vpx_codec_cx_pkt_t.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_codec_cx_pkt_t createSafe(long address) {
        return address == NULL ? null : wrap(vpx_codec_cx_pkt_t.class, address);
    }

    /**
     * Returns a new {@link vpx_codec_cx_pkt_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_cx_pkt_t.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_cx_pkt_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_cx_pkt_t.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_cx_pkt_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_cx_pkt_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link vpx_codec_cx_pkt_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static vpx_codec_cx_pkt_t.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_codec_cx_pkt_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code vpx_codec_cx_pkt_t} instance allocated on the thread-local {@link MemoryStack}. */
    public static vpx_codec_cx_pkt_t mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code vpx_codec_cx_pkt_t} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static vpx_codec_cx_pkt_t callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code vpx_codec_cx_pkt_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_codec_cx_pkt_t mallocStack(MemoryStack stack) {
        return wrap(vpx_codec_cx_pkt_t.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code vpx_codec_cx_pkt_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_codec_cx_pkt_t callocStack(MemoryStack stack) {
        return wrap(vpx_codec_cx_pkt_t.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link vpx_codec_cx_pkt_t.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_cx_pkt_t.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_codec_cx_pkt_t.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_cx_pkt_t.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_codec_cx_pkt_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_codec_cx_pkt_t.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_cx_pkt_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_codec_cx_pkt_t.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_cx_pkt_t.KIND); }
    /** Unsafe version of {@link #buf(int) buf}. */
    public static ByteBuffer nbuf(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + vpx_codec_cx_pkt_t.BUF), capacity); }
    /** Unsafe version of {@link #sz}. */
    public static long nsz(long struct) { return memGetAddress(struct + vpx_codec_cx_pkt_t.SZ); }
    /** Unsafe version of {@link #pts}. */
    public static long npts(long struct) { return UNSAFE.getLong(null, struct + vpx_codec_cx_pkt_t.PTS); }
    /** Unsafe version of {@link #duration}. */
    public static long nduration(long struct) { return memGetCLong(struct + vpx_codec_cx_pkt_t.DURATION); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_cx_pkt_t.FLAGS); }
    /** Unsafe version of {@link #partition_id}. */
    public static int npartition_id(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_cx_pkt_t.PARTITION_ID); }
    /** Unsafe version of {@link #width}. */
    public static IntBuffer nwidth(long struct) { return memIntBuffer(struct + vpx_codec_cx_pkt_t.WIDTH, 5); }
    /** Unsafe version of {@link #width(int) width}. */
    public static int nwidth(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_codec_cx_pkt_t.WIDTH + check(index, 5) * 4);
    }
    /** Unsafe version of {@link #height}. */
    public static IntBuffer nheight(long struct) { return memIntBuffer(struct + vpx_codec_cx_pkt_t.HEIGHT, 5); }
    /** Unsafe version of {@link #height(int) height}. */
    public static int nheight(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_codec_cx_pkt_t.HEIGHT + check(index, 5) * 4);
    }
    /** Unsafe version of {@link #spatial_layer_encoded}. */
    public static ByteBuffer nspatial_layer_encoded(long struct) { return memByteBuffer(struct + vpx_codec_cx_pkt_t.SPATIAL_LAYER_ENCODED, 5); }
    /** Unsafe version of {@link #spatial_layer_encoded(int) spatial_layer_encoded}. */
    public static byte nspatial_layer_encoded(long struct, int index) {
        return UNSAFE.getByte(null, struct + vpx_codec_cx_pkt_t.SPATIAL_LAYER_ENCODED + check(index, 5) * 1);
    }
    /** Unsafe version of {@link #twopass_stats}. */
    public static vpx_fixed_buf_t ntwopass_stats(long struct) { return vpx_fixed_buf_t.create(struct + vpx_codec_cx_pkt_t.TWOPASS_STATS); }
    /** Unsafe version of {@link #firstpass_mb_stats}. */
    public static vpx_fixed_buf_t nfirstpass_mb_stats(long struct) { return vpx_fixed_buf_t.create(struct + vpx_codec_cx_pkt_t.FIRSTPASS_MB_STATS); }
    /** Unsafe version of {@link #raw}. */
    public static vpx_fixed_buf_t nraw(long struct) { return vpx_fixed_buf_t.create(struct + vpx_codec_cx_pkt_t.RAW); }

    /** Unsafe version of {@link #kind(int) kind}. */
    public static void nkind(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_cx_pkt_t.KIND, value); }
    /** Unsafe version of {@link #buf(ByteBuffer) buf}. */
    public static void nbuf(long struct, ByteBuffer value) { memPutAddress(struct + vpx_codec_cx_pkt_t.BUF, memAddress(value)); }
    /** Unsafe version of {@link #sz(long) sz}. */
    public static void nsz(long struct, long value) { memPutAddress(struct + vpx_codec_cx_pkt_t.SZ, value); }
    /** Unsafe version of {@link #pts(long) pts}. */
    public static void npts(long struct, long value) { UNSAFE.putLong(null, struct + vpx_codec_cx_pkt_t.PTS, value); }
    /** Unsafe version of {@link #duration(long) duration}. */
    public static void nduration(long struct, long value) { memPutCLong(struct + vpx_codec_cx_pkt_t.DURATION, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_cx_pkt_t.FLAGS, value); }
    /** Unsafe version of {@link #partition_id(int) partition_id}. */
    public static void npartition_id(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_cx_pkt_t.PARTITION_ID, value); }
    /** Unsafe version of {@link #width(IntBuffer) width}. */
    public static void nwidth(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + vpx_codec_cx_pkt_t.WIDTH, value.remaining() * 4);
    }
    /** Unsafe version of {@link #width(int, int) width}. */
    public static void nwidth(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_codec_cx_pkt_t.WIDTH + check(index, 5) * 4, value);
    }
    /** Unsafe version of {@link #height(IntBuffer) height}. */
    public static void nheight(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + vpx_codec_cx_pkt_t.HEIGHT, value.remaining() * 4);
    }
    /** Unsafe version of {@link #height(int, int) height}. */
    public static void nheight(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_codec_cx_pkt_t.HEIGHT + check(index, 5) * 4, value);
    }
    /** Unsafe version of {@link #spatial_layer_encoded(ByteBuffer) spatial_layer_encoded}. */
    public static void nspatial_layer_encoded(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + vpx_codec_cx_pkt_t.SPATIAL_LAYER_ENCODED, value.remaining() * 1);
    }
    /** Unsafe version of {@link #spatial_layer_encoded(int, byte) spatial_layer_encoded}. */
    public static void nspatial_layer_encoded(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + vpx_codec_cx_pkt_t.SPATIAL_LAYER_ENCODED + check(index, 5) * 1, value);
    }
    /** Unsafe version of {@link #twopass_stats(vpx_fixed_buf_t) twopass_stats}. */
    public static void ntwopass_stats(long struct, vpx_fixed_buf_t value) { memCopy(value.address(), struct + vpx_codec_cx_pkt_t.TWOPASS_STATS, vpx_fixed_buf_t.SIZEOF); }
    /** Unsafe version of {@link #firstpass_mb_stats(vpx_fixed_buf_t) firstpass_mb_stats}. */
    public static void nfirstpass_mb_stats(long struct, vpx_fixed_buf_t value) { memCopy(value.address(), struct + vpx_codec_cx_pkt_t.FIRSTPASS_MB_STATS, vpx_fixed_buf_t.SIZEOF); }
    /** Unsafe version of {@link #raw(vpx_fixed_buf_t) raw}. */
    public static void nraw(long struct, vpx_fixed_buf_t value) { memCopy(value.address(), struct + vpx_codec_cx_pkt_t.RAW, vpx_fixed_buf_t.SIZEOF); }

    // -----------------------------------

    /** An array of {@link vpx_codec_cx_pkt_t} structs. */
    public static class Buffer extends StructBuffer<vpx_codec_cx_pkt_t, Buffer> implements NativeResource {

        private static final vpx_codec_cx_pkt_t ELEMENT_FACTORY = vpx_codec_cx_pkt_t.create(-1L);

        /**
         * Creates a new {@code vpx_codec_cx_pkt_t.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link vpx_codec_cx_pkt_t#SIZEOF}, and its mark will be undefined.
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
        protected vpx_codec_cx_pkt_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code kind} field. */
        @NativeType("vpx_codec_cx_pkt_kind")
        public int kind() { return vpx_codec_cx_pkt_t.nkind(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code buf} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer buf(int capacity) { return vpx_codec_cx_pkt_t.nbuf(address(), capacity); }
        /** Returns the value of the {@code sz} field. */
        @NativeType("size_t")
        public long sz() { return vpx_codec_cx_pkt_t.nsz(address()); }
        /** Returns the value of the {@code pts} field. */
        @NativeType("vpx_codec_pts_t")
        public long pts() { return vpx_codec_cx_pkt_t.npts(address()); }
        /** Returns the value of the {@code duration} field. */
        @NativeType("unsigned long")
        public long duration() { return vpx_codec_cx_pkt_t.nduration(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("vpx_codec_frame_flags_t")
        public int flags() { return vpx_codec_cx_pkt_t.nflags(address()); }
        /** Returns the value of the {@code partition_id} field. */
        public int partition_id() { return vpx_codec_cx_pkt_t.npartition_id(address()); }
        /** Returns a {@link IntBuffer} view of the {@code width} field. */
        @NativeType("unsigned int[5]")
        public IntBuffer width() { return vpx_codec_cx_pkt_t.nwidth(address()); }
        /** Returns the value at the specified index of the {@code width} field. */
        @NativeType("unsigned int")
        public int width(int index) { return vpx_codec_cx_pkt_t.nwidth(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code height} field. */
        @NativeType("unsigned int[5]")
        public IntBuffer height() { return vpx_codec_cx_pkt_t.nheight(address()); }
        /** Returns the value at the specified index of the {@code height} field. */
        @NativeType("unsigned int")
        public int height(int index) { return vpx_codec_cx_pkt_t.nheight(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code spatial_layer_encoded} field. */
        @NativeType("uint8_t[5]")
        public ByteBuffer spatial_layer_encoded() { return vpx_codec_cx_pkt_t.nspatial_layer_encoded(address()); }
        /** Returns the value at the specified index of the {@code spatial_layer_encoded} field. */
        @NativeType("uint8_t")
        public byte spatial_layer_encoded(int index) { return vpx_codec_cx_pkt_t.nspatial_layer_encoded(address(), index); }
        /** Returns a {@link vpx_fixed_buf_t} view of the {@code twopass_stats} field. */
        public vpx_fixed_buf_t twopass_stats() { return vpx_codec_cx_pkt_t.ntwopass_stats(address()); }
        /** Returns a {@link vpx_fixed_buf_t} view of the {@code firstpass_mb_stats} field. */
        public vpx_fixed_buf_t firstpass_mb_stats() { return vpx_codec_cx_pkt_t.nfirstpass_mb_stats(address()); }
        /** Returns a {@link vpx_fixed_buf_t} view of the {@code raw} field. */
        public vpx_fixed_buf_t raw() { return vpx_codec_cx_pkt_t.nraw(address()); }

        /** Sets the specified value to the {@code kind} field. */
        public vpx_codec_cx_pkt_t.Buffer kind(@NativeType("vpx_codec_cx_pkt_kind") int value) { vpx_codec_cx_pkt_t.nkind(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code buf} field. */
        public vpx_codec_cx_pkt_t.Buffer buf(@NativeType("void *") ByteBuffer value) { vpx_codec_cx_pkt_t.nbuf(address(), value); return this; }
        /** Sets the specified value to the {@code sz} field. */
        public vpx_codec_cx_pkt_t.Buffer sz(@NativeType("size_t") long value) { vpx_codec_cx_pkt_t.nsz(address(), value); return this; }
        /** Sets the specified value to the {@code pts} field. */
        public vpx_codec_cx_pkt_t.Buffer pts(@NativeType("vpx_codec_pts_t") long value) { vpx_codec_cx_pkt_t.npts(address(), value); return this; }
        /** Sets the specified value to the {@code duration} field. */
        public vpx_codec_cx_pkt_t.Buffer duration(@NativeType("unsigned long") long value) { vpx_codec_cx_pkt_t.nduration(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public vpx_codec_cx_pkt_t.Buffer flags(@NativeType("vpx_codec_frame_flags_t") int value) { vpx_codec_cx_pkt_t.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code partition_id} field. */
        public vpx_codec_cx_pkt_t.Buffer partition_id(int value) { vpx_codec_cx_pkt_t.npartition_id(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code width} field. */
        public vpx_codec_cx_pkt_t.Buffer width(@NativeType("unsigned int[5]") IntBuffer value) { vpx_codec_cx_pkt_t.nwidth(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code width} field. */
        public vpx_codec_cx_pkt_t.Buffer width(int index, @NativeType("unsigned int") int value) { vpx_codec_cx_pkt_t.nwidth(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code height} field. */
        public vpx_codec_cx_pkt_t.Buffer height(@NativeType("unsigned int[5]") IntBuffer value) { vpx_codec_cx_pkt_t.nheight(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code height} field. */
        public vpx_codec_cx_pkt_t.Buffer height(int index, @NativeType("unsigned int") int value) { vpx_codec_cx_pkt_t.nheight(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code spatial_layer_encoded} field. */
        public vpx_codec_cx_pkt_t.Buffer spatial_layer_encoded(@NativeType("uint8_t[5]") ByteBuffer value) { vpx_codec_cx_pkt_t.nspatial_layer_encoded(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code spatial_layer_encoded} field. */
        public vpx_codec_cx_pkt_t.Buffer spatial_layer_encoded(int index, @NativeType("uint8_t") byte value) { vpx_codec_cx_pkt_t.nspatial_layer_encoded(address(), index, value); return this; }
        /** Copies the specified {@link vpx_fixed_buf_t} to the {@code twopass_stats} field. */
        public vpx_codec_cx_pkt_t.Buffer twopass_stats(vpx_fixed_buf_t value) { vpx_codec_cx_pkt_t.ntwopass_stats(address(), value); return this; }
        /** Passes the {@code twopass_stats} field to the specified {@link java.util.function.Consumer Consumer}. */
        public vpx_codec_cx_pkt_t.Buffer twopass_stats(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(twopass_stats()); return this; }
        /** Copies the specified {@link vpx_fixed_buf_t} to the {@code firstpass_mb_stats} field. */
        public vpx_codec_cx_pkt_t.Buffer firstpass_mb_stats(vpx_fixed_buf_t value) { vpx_codec_cx_pkt_t.nfirstpass_mb_stats(address(), value); return this; }
        /** Passes the {@code firstpass_mb_stats} field to the specified {@link java.util.function.Consumer Consumer}. */
        public vpx_codec_cx_pkt_t.Buffer firstpass_mb_stats(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(firstpass_mb_stats()); return this; }
        /** Copies the specified {@link vpx_fixed_buf_t} to the {@code raw} field. */
        public vpx_codec_cx_pkt_t.Buffer raw(vpx_fixed_buf_t value) { vpx_codec_cx_pkt_t.nraw(address(), value); return this; }
        /** Passes the {@code raw} field to the specified {@link java.util.function.Consumer Consumer}. */
        public vpx_codec_cx_pkt_t.Buffer raw(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(raw()); return this; }

    }

}
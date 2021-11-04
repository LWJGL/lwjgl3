/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.util.tinyexr.TinyEXR.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct EXRHeader {
 *     float pixel_aspect_ratio;
 *     int line_order;
 *     {@link EXRBox2i EXRBox2i} data_window;
 *     {@link EXRBox2i EXRBox2i} display_window;
 *     float screen_window_center[2];
 *     float screen_window_width;
 *     int chunk_count;
 *     int tiled;
 *     int tile_size_x;
 *     int tile_size_y;
 *     int tile_level_mode;
 *     int tile_rounding_mode;
 *     int long_name;
 *     int {@link #non_image};
 *     int multipart;
 *     unsigned int header_len;
 *     int {@link #num_custom_attributes};
 *     {@link EXRAttribute EXRAttribute} * {@link #custom_attributes};
 *     {@link EXRChannelInfo EXRChannelInfo} * channels;
 *     int * {@link #pixel_types};
 *     int num_channels;
 *     int {@link #compression_type};
 *     int * {@link #requested_pixel_types};
 *     char {@link #name}[256];
 * }</code></pre>
 */
public class EXRHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PIXEL_ASPECT_RATIO,
        LINE_ORDER,
        DATA_WINDOW,
        DISPLAY_WINDOW,
        SCREEN_WINDOW_CENTER,
        SCREEN_WINDOW_WIDTH,
        CHUNK_COUNT,
        TILED,
        TILE_SIZE_X,
        TILE_SIZE_Y,
        TILE_LEVEL_MODE,
        TILE_ROUNDING_MODE,
        LONG_NAME,
        NON_IMAGE,
        MULTIPART,
        HEADER_LEN,
        NUM_CUSTOM_ATTRIBUTES,
        CUSTOM_ATTRIBUTES,
        CHANNELS,
        PIXEL_TYPES,
        NUM_CHANNELS,
        COMPRESSION_TYPE,
        REQUESTED_PIXEL_TYPES,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(EXRBox2i.SIZEOF, EXRBox2i.ALIGNOF),
            __member(EXRBox2i.SIZEOF, EXRBox2i.ALIGNOF),
            __array(4, 2),
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
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __array(1, 256)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PIXEL_ASPECT_RATIO = layout.offsetof(0);
        LINE_ORDER = layout.offsetof(1);
        DATA_WINDOW = layout.offsetof(2);
        DISPLAY_WINDOW = layout.offsetof(3);
        SCREEN_WINDOW_CENTER = layout.offsetof(4);
        SCREEN_WINDOW_WIDTH = layout.offsetof(5);
        CHUNK_COUNT = layout.offsetof(6);
        TILED = layout.offsetof(7);
        TILE_SIZE_X = layout.offsetof(8);
        TILE_SIZE_Y = layout.offsetof(9);
        TILE_LEVEL_MODE = layout.offsetof(10);
        TILE_ROUNDING_MODE = layout.offsetof(11);
        LONG_NAME = layout.offsetof(12);
        NON_IMAGE = layout.offsetof(13);
        MULTIPART = layout.offsetof(14);
        HEADER_LEN = layout.offsetof(15);
        NUM_CUSTOM_ATTRIBUTES = layout.offsetof(16);
        CUSTOM_ATTRIBUTES = layout.offsetof(17);
        CHANNELS = layout.offsetof(18);
        PIXEL_TYPES = layout.offsetof(19);
        NUM_CHANNELS = layout.offsetof(20);
        COMPRESSION_TYPE = layout.offsetof(21);
        REQUESTED_PIXEL_TYPES = layout.offsetof(22);
        NAME = layout.offsetof(23);
    }

    /**
     * Creates a {@code EXRHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pixel_aspect_ratio} field. */
    public float pixel_aspect_ratio() { return npixel_aspect_ratio(address()); }
    /** @return the value of the {@code line_order} field. */
    public int line_order() { return nline_order(address()); }
    /** @return a {@link EXRBox2i} view of the {@code data_window} field. */
    public EXRBox2i data_window() { return ndata_window(address()); }
    /** @return a {@link EXRBox2i} view of the {@code display_window} field. */
    public EXRBox2i display_window() { return ndisplay_window(address()); }
    /** @return a {@link FloatBuffer} view of the {@code screen_window_center} field. */
    @NativeType("float[2]")
    public FloatBuffer screen_window_center() { return nscreen_window_center(address()); }
    /** @return the value at the specified index of the {@code screen_window_center} field. */
    public float screen_window_center(int index) { return nscreen_window_center(address(), index); }
    /** @return the value of the {@code screen_window_width} field. */
    public float screen_window_width() { return nscreen_window_width(address()); }
    /** @return the value of the {@code chunk_count} field. */
    public int chunk_count() { return nchunk_count(address()); }
    /** @return the value of the {@code tiled} field. */
    @NativeType("int")
    public boolean tiled() { return ntiled(address()) != 0; }
    /** @return the value of the {@code tile_size_x} field. */
    public int tile_size_x() { return ntile_size_x(address()); }
    /** @return the value of the {@code tile_size_y} field. */
    public int tile_size_y() { return ntile_size_y(address()); }
    /** @return the value of the {@code tile_level_mode} field. */
    public int tile_level_mode() { return ntile_level_mode(address()); }
    /** @return the value of the {@code tile_rounding_mode} field. */
    public int tile_rounding_mode() { return ntile_rounding_mode(address()); }
    /** @return the value of the {@code long_name} field. */
    @NativeType("int")
    public boolean long_name() { return nlong_name(address()) != 0; }
    /** For a single-part file, agree with the version field bit 11. For a multi-part file, it is consistent with the type of part. */
    @NativeType("int")
    public boolean non_image() { return nnon_image(address()) != 0; }
    /** @return the value of the {@code multipart} field. */
    @NativeType("int")
    public boolean multipart() { return nmultipart(address()) != 0; }
    /** @return the value of the {@code header_len} field. */
    @NativeType("unsigned int")
    public int header_len() { return nheader_len(address()); }
    /** number of {@code EXRAttribute} in the {@code custom_attributes} array */
    public int num_custom_attributes() { return nnum_custom_attributes(address()); }
    /** custom attributes (excludes required attributes, e.g. `channels`, `compression`, etc) */
    @Nullable
    @NativeType("EXRAttribute *")
    public EXRAttribute.Buffer custom_attributes() { return ncustom_attributes(address()); }
    /** @return a {@link EXRChannelInfo.Buffer} view of the struct array pointed to by the {@code channels} field. */
    @NativeType("EXRChannelInfo *")
    public EXRChannelInfo.Buffer channels() { return nchannels(address()); }
    /** loaded pixel type (TINYEXR_PIXELTYPE_*) of {@code images} for each channel. This is overwritten with {@code requested_pixel_types} when loading. */
    @NativeType("int *")
    public IntBuffer pixel_types() { return npixel_types(address()); }
    /** @return the value of the {@code num_channels} field. */
    public int num_channels() { return nnum_channels(address()); }
    /** compression type (TINYEXR_COMPRESSIONTYPE_*) */
    public int compression_type() { return ncompression_type(address()); }
    /** filled initially by {@code ParseEXRHeaderFrom(Memory|File)}, then users can edit it (only valid for HALF pixel type channel) */
    @NativeType("int *")
    public IntBuffer requested_pixel_types() { return nrequested_pixel_types(address()); }
    /**
     * Name attribute required for multipart files.
     * 
     * <p>Must be unique and non empty (according to spec.). Use {@link TinyEXR#EXRSetNameAttr} for setting value. Max 255 characters allowed - excluding terminating zero.</p>
     */
    @NativeType("char[256]")
    public ByteBuffer name() { return nname(address()); }
    /**
     * Name attribute required for multipart files.
     * 
     * <p>Must be unique and non empty (according to spec.). Use {@link TinyEXR#EXRSetNameAttr} for setting value. Max 255 characters allowed - excluding terminating zero.</p>
     */
    @NativeType("char[256]")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@code pixel_aspect_ratio} field. */
    public EXRHeader pixel_aspect_ratio(float value) { npixel_aspect_ratio(address(), value); return this; }
    /** Sets the specified value to the {@code line_order} field. */
    public EXRHeader line_order(int value) { nline_order(address(), value); return this; }
    /** Copies the specified {@link EXRBox2i} to the {@code data_window} field. */
    public EXRHeader data_window(EXRBox2i value) { ndata_window(address(), value); return this; }
    /** Passes the {@code data_window} field to the specified {@link java.util.function.Consumer Consumer}. */
    public EXRHeader data_window(java.util.function.Consumer<EXRBox2i> consumer) { consumer.accept(data_window()); return this; }
    /** Copies the specified {@link EXRBox2i} to the {@code display_window} field. */
    public EXRHeader display_window(EXRBox2i value) { ndisplay_window(address(), value); return this; }
    /** Passes the {@code display_window} field to the specified {@link java.util.function.Consumer Consumer}. */
    public EXRHeader display_window(java.util.function.Consumer<EXRBox2i> consumer) { consumer.accept(display_window()); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code screen_window_center} field. */
    public EXRHeader screen_window_center(@NativeType("float[2]") FloatBuffer value) { nscreen_window_center(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code screen_window_center} field. */
    public EXRHeader screen_window_center(int index, float value) { nscreen_window_center(address(), index, value); return this; }
    /** Sets the specified value to the {@code screen_window_width} field. */
    public EXRHeader screen_window_width(float value) { nscreen_window_width(address(), value); return this; }
    /** Sets the specified value to the {@code chunk_count} field. */
    public EXRHeader chunk_count(int value) { nchunk_count(address(), value); return this; }
    /** Sets the specified value to the {@code tiled} field. */
    public EXRHeader tiled(@NativeType("int") boolean value) { ntiled(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tile_size_x} field. */
    public EXRHeader tile_size_x(int value) { ntile_size_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_size_y} field. */
    public EXRHeader tile_size_y(int value) { ntile_size_y(address(), value); return this; }
    /** Sets the specified value to the {@code tile_level_mode} field. */
    public EXRHeader tile_level_mode(int value) { ntile_level_mode(address(), value); return this; }
    /** Sets the specified value to the {@code tile_rounding_mode} field. */
    public EXRHeader tile_rounding_mode(int value) { ntile_rounding_mode(address(), value); return this; }
    /** Sets the specified value to the {@code long_name} field. */
    public EXRHeader long_name(@NativeType("int") boolean value) { nlong_name(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #non_image} field. */
    public EXRHeader non_image(@NativeType("int") boolean value) { nnon_image(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code multipart} field. */
    public EXRHeader multipart(@NativeType("int") boolean value) { nmultipart(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code header_len} field. */
    public EXRHeader header_len(@NativeType("unsigned int") int value) { nheader_len(address(), value); return this; }
    /** Sets the specified value to the {@link #num_custom_attributes} field. */
    public EXRHeader num_custom_attributes(int value) { nnum_custom_attributes(address(), value); return this; }
    /** Sets the address of the specified {@link EXRAttribute.Buffer} to the {@link #custom_attributes} field. */
    public EXRHeader custom_attributes(@Nullable @NativeType("EXRAttribute *") EXRAttribute.Buffer value) { ncustom_attributes(address(), value); return this; }
    /** Sets the address of the specified {@link EXRChannelInfo.Buffer} to the {@code channels} field. */
    public EXRHeader channels(@NativeType("EXRChannelInfo *") EXRChannelInfo.Buffer value) { nchannels(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pixel_types} field. */
    public EXRHeader pixel_types(@NativeType("int *") IntBuffer value) { npixel_types(address(), value); return this; }
    /** Sets the specified value to the {@code num_channels} field. */
    public EXRHeader num_channels(int value) { nnum_channels(address(), value); return this; }
    /** Sets the specified value to the {@link #compression_type} field. */
    public EXRHeader compression_type(int value) { ncompression_type(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #requested_pixel_types} field. */
    public EXRHeader requested_pixel_types(@NativeType("int *") IntBuffer value) { nrequested_pixel_types(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #name} field. */
    public EXRHeader name(@NativeType("char[256]") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public EXRHeader set(
        float pixel_aspect_ratio,
        int line_order,
        EXRBox2i data_window,
        EXRBox2i display_window,
        FloatBuffer screen_window_center,
        float screen_window_width,
        int chunk_count,
        boolean tiled,
        int tile_size_x,
        int tile_size_y,
        int tile_level_mode,
        int tile_rounding_mode,
        boolean long_name,
        boolean non_image,
        boolean multipart,
        int header_len,
        int num_custom_attributes,
        @Nullable EXRAttribute.Buffer custom_attributes,
        EXRChannelInfo.Buffer channels,
        IntBuffer pixel_types,
        int num_channels,
        int compression_type,
        IntBuffer requested_pixel_types,
        ByteBuffer name
    ) {
        pixel_aspect_ratio(pixel_aspect_ratio);
        line_order(line_order);
        data_window(data_window);
        display_window(display_window);
        screen_window_center(screen_window_center);
        screen_window_width(screen_window_width);
        chunk_count(chunk_count);
        tiled(tiled);
        tile_size_x(tile_size_x);
        tile_size_y(tile_size_y);
        tile_level_mode(tile_level_mode);
        tile_rounding_mode(tile_rounding_mode);
        long_name(long_name);
        non_image(non_image);
        multipart(multipart);
        header_len(header_len);
        num_custom_attributes(num_custom_attributes);
        custom_attributes(custom_attributes);
        channels(channels);
        pixel_types(pixel_types);
        num_channels(num_channels);
        compression_type(compression_type);
        requested_pixel_types(requested_pixel_types);
        name(name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EXRHeader set(EXRHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EXRHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRHeader malloc() {
        return wrap(EXRHeader.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code EXRHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRHeader calloc() {
        return wrap(EXRHeader.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code EXRHeader} instance allocated with {@link BufferUtils}. */
    public static EXRHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(EXRHeader.class, memAddress(container), container);
    }

    /** Returns a new {@code EXRHeader} instance for the specified memory address. */
    public static EXRHeader create(long address) {
        return wrap(EXRHeader.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRHeader createSafe(long address) {
        return address == NULL ? null : wrap(EXRHeader.class, address);
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link EXRHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EXRHeader mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EXRHeader callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EXRHeader mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EXRHeader callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRHeader.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRHeader.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRHeader.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRHeader.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code EXRHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRHeader malloc(MemoryStack stack) {
        return wrap(EXRHeader.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code EXRHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRHeader calloc(MemoryStack stack) {
        return wrap(EXRHeader.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pixel_aspect_ratio}. */
    public static float npixel_aspect_ratio(long struct) { return UNSAFE.getFloat(null, struct + EXRHeader.PIXEL_ASPECT_RATIO); }
    /** Unsafe version of {@link #line_order}. */
    public static int nline_order(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.LINE_ORDER); }
    /** Unsafe version of {@link #data_window}. */
    public static EXRBox2i ndata_window(long struct) { return EXRBox2i.create(struct + EXRHeader.DATA_WINDOW); }
    /** Unsafe version of {@link #display_window}. */
    public static EXRBox2i ndisplay_window(long struct) { return EXRBox2i.create(struct + EXRHeader.DISPLAY_WINDOW); }
    /** Unsafe version of {@link #screen_window_center}. */
    public static FloatBuffer nscreen_window_center(long struct) { return memFloatBuffer(struct + EXRHeader.SCREEN_WINDOW_CENTER, 2); }
    /** Unsafe version of {@link #screen_window_center(int) screen_window_center}. */
    public static float nscreen_window_center(long struct, int index) {
        return UNSAFE.getFloat(null, struct + EXRHeader.SCREEN_WINDOW_CENTER + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #screen_window_width}. */
    public static float nscreen_window_width(long struct) { return UNSAFE.getFloat(null, struct + EXRHeader.SCREEN_WINDOW_WIDTH); }
    /** Unsafe version of {@link #chunk_count}. */
    public static int nchunk_count(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.CHUNK_COUNT); }
    /** Unsafe version of {@link #tiled}. */
    public static int ntiled(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.TILED); }
    /** Unsafe version of {@link #tile_size_x}. */
    public static int ntile_size_x(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.TILE_SIZE_X); }
    /** Unsafe version of {@link #tile_size_y}. */
    public static int ntile_size_y(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.TILE_SIZE_Y); }
    /** Unsafe version of {@link #tile_level_mode}. */
    public static int ntile_level_mode(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.TILE_LEVEL_MODE); }
    /** Unsafe version of {@link #tile_rounding_mode}. */
    public static int ntile_rounding_mode(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.TILE_ROUNDING_MODE); }
    /** Unsafe version of {@link #long_name}. */
    public static int nlong_name(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.LONG_NAME); }
    /** Unsafe version of {@link #non_image}. */
    public static int nnon_image(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.NON_IMAGE); }
    /** Unsafe version of {@link #multipart}. */
    public static int nmultipart(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.MULTIPART); }
    /** Unsafe version of {@link #header_len}. */
    public static int nheader_len(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.HEADER_LEN); }
    /** Unsafe version of {@link #num_custom_attributes}. */
    public static int nnum_custom_attributes(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.NUM_CUSTOM_ATTRIBUTES); }
    /** Unsafe version of {@link #custom_attributes}. */
    @Nullable public static EXRAttribute.Buffer ncustom_attributes(long struct) { return EXRAttribute.createSafe(memGetAddress(struct + EXRHeader.CUSTOM_ATTRIBUTES), nnum_custom_attributes(struct)); }
    /** Unsafe version of {@link #channels}. */
    public static EXRChannelInfo.Buffer nchannels(long struct) { return EXRChannelInfo.create(memGetAddress(struct + EXRHeader.CHANNELS), nnum_channels(struct)); }
    /** Unsafe version of {@link #pixel_types() pixel_types}. */
    public static IntBuffer npixel_types(long struct) { return memIntBuffer(memGetAddress(struct + EXRHeader.PIXEL_TYPES), nnum_channels(struct)); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.NUM_CHANNELS); }
    /** Unsafe version of {@link #compression_type}. */
    public static int ncompression_type(long struct) { return UNSAFE.getInt(null, struct + EXRHeader.COMPRESSION_TYPE); }
    /** Unsafe version of {@link #requested_pixel_types() requested_pixel_types}. */
    public static IntBuffer nrequested_pixel_types(long struct) { return memIntBuffer(memGetAddress(struct + EXRHeader.REQUESTED_PIXEL_TYPES), nnum_channels(struct)); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + EXRHeader.NAME, 256); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + EXRHeader.NAME); }

    /** Unsafe version of {@link #pixel_aspect_ratio(float) pixel_aspect_ratio}. */
    public static void npixel_aspect_ratio(long struct, float value) { UNSAFE.putFloat(null, struct + EXRHeader.PIXEL_ASPECT_RATIO, value); }
    /** Unsafe version of {@link #line_order(int) line_order}. */
    public static void nline_order(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.LINE_ORDER, value); }
    /** Unsafe version of {@link #data_window(EXRBox2i) data_window}. */
    public static void ndata_window(long struct, EXRBox2i value) { memCopy(value.address(), struct + EXRHeader.DATA_WINDOW, EXRBox2i.SIZEOF); }
    /** Unsafe version of {@link #display_window(EXRBox2i) display_window}. */
    public static void ndisplay_window(long struct, EXRBox2i value) { memCopy(value.address(), struct + EXRHeader.DISPLAY_WINDOW, EXRBox2i.SIZEOF); }
    /** Unsafe version of {@link #screen_window_center(FloatBuffer) screen_window_center}. */
    public static void nscreen_window_center(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + EXRHeader.SCREEN_WINDOW_CENTER, value.remaining() * 4);
    }
    /** Unsafe version of {@link #screen_window_center(int, float) screen_window_center}. */
    public static void nscreen_window_center(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + EXRHeader.SCREEN_WINDOW_CENTER + check(index, 2) * 4, value);
    }
    /** Unsafe version of {@link #screen_window_width(float) screen_window_width}. */
    public static void nscreen_window_width(long struct, float value) { UNSAFE.putFloat(null, struct + EXRHeader.SCREEN_WINDOW_WIDTH, value); }
    /** Unsafe version of {@link #chunk_count(int) chunk_count}. */
    public static void nchunk_count(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.CHUNK_COUNT, value); }
    /** Unsafe version of {@link #tiled(boolean) tiled}. */
    public static void ntiled(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.TILED, value); }
    /** Unsafe version of {@link #tile_size_x(int) tile_size_x}. */
    public static void ntile_size_x(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.TILE_SIZE_X, value); }
    /** Unsafe version of {@link #tile_size_y(int) tile_size_y}. */
    public static void ntile_size_y(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.TILE_SIZE_Y, value); }
    /** Unsafe version of {@link #tile_level_mode(int) tile_level_mode}. */
    public static void ntile_level_mode(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.TILE_LEVEL_MODE, value); }
    /** Unsafe version of {@link #tile_rounding_mode(int) tile_rounding_mode}. */
    public static void ntile_rounding_mode(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.TILE_ROUNDING_MODE, value); }
    /** Unsafe version of {@link #long_name(boolean) long_name}. */
    public static void nlong_name(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.LONG_NAME, value); }
    /** Unsafe version of {@link #non_image(boolean) non_image}. */
    public static void nnon_image(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.NON_IMAGE, value); }
    /** Unsafe version of {@link #multipart(boolean) multipart}. */
    public static void nmultipart(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.MULTIPART, value); }
    /** Unsafe version of {@link #header_len(int) header_len}. */
    public static void nheader_len(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.HEADER_LEN, value); }
    /** Sets the specified value to the {@code num_custom_attributes} field of the specified {@code struct}. */
    public static void nnum_custom_attributes(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.NUM_CUSTOM_ATTRIBUTES, value); }
    /** Unsafe version of {@link #custom_attributes(EXRAttribute.Buffer) custom_attributes}. */
    public static void ncustom_attributes(long struct, @Nullable EXRAttribute.Buffer value) { memPutAddress(struct + EXRHeader.CUSTOM_ATTRIBUTES, memAddressSafe(value)); nnum_custom_attributes(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #channels(EXRChannelInfo.Buffer) channels}. */
    public static void nchannels(long struct, EXRChannelInfo.Buffer value) { memPutAddress(struct + EXRHeader.CHANNELS, value.address()); }
    /** Unsafe version of {@link #pixel_types(IntBuffer) pixel_types}. */
    public static void npixel_types(long struct, IntBuffer value) { memPutAddress(struct + EXRHeader.PIXEL_TYPES, memAddress(value)); }
    /** Sets the specified value to the {@code num_channels} field of the specified {@code struct}. */
    public static void nnum_channels(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.NUM_CHANNELS, value); }
    /** Unsafe version of {@link #compression_type(int) compression_type}. */
    public static void ncompression_type(long struct, int value) { UNSAFE.putInt(null, struct + EXRHeader.COMPRESSION_TYPE, value); }
    /** Unsafe version of {@link #requested_pixel_types(IntBuffer) requested_pixel_types}. */
    public static void nrequested_pixel_types(long struct, IntBuffer value) { memPutAddress(struct + EXRHeader.REQUESTED_PIXEL_TYPES, memAddress(value)); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 256);
        }
        memCopy(memAddress(value), struct + EXRHeader.NAME, value.remaining());
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int num_custom_attributes = nnum_custom_attributes(struct);
        long custom_attributes = memGetAddress(struct + EXRHeader.CUSTOM_ATTRIBUTES);
        if (custom_attributes != NULL) {
            validate(custom_attributes, num_custom_attributes, EXRAttribute.SIZEOF, EXRAttribute::validate);
        }
        check(memGetAddress(struct + EXRHeader.CHANNELS));
        check(memGetAddress(struct + EXRHeader.PIXEL_TYPES));
        check(memGetAddress(struct + EXRHeader.REQUESTED_PIXEL_TYPES));
    }

    // -----------------------------------

    /** An array of {@link EXRHeader} structs. */
    public static class Buffer extends StructBuffer<EXRHeader, Buffer> implements NativeResource {

        private static final EXRHeader ELEMENT_FACTORY = EXRHeader.create(-1L);

        /**
         * Creates a new {@code EXRHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRHeader#SIZEOF}, and its mark will be undefined.
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
        protected EXRHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pixel_aspect_ratio} field. */
        public float pixel_aspect_ratio() { return EXRHeader.npixel_aspect_ratio(address()); }
        /** @return the value of the {@code line_order} field. */
        public int line_order() { return EXRHeader.nline_order(address()); }
        /** @return a {@link EXRBox2i} view of the {@code data_window} field. */
        public EXRBox2i data_window() { return EXRHeader.ndata_window(address()); }
        /** @return a {@link EXRBox2i} view of the {@code display_window} field. */
        public EXRBox2i display_window() { return EXRHeader.ndisplay_window(address()); }
        /** @return a {@link FloatBuffer} view of the {@code screen_window_center} field. */
        @NativeType("float[2]")
        public FloatBuffer screen_window_center() { return EXRHeader.nscreen_window_center(address()); }
        /** @return the value at the specified index of the {@code screen_window_center} field. */
        public float screen_window_center(int index) { return EXRHeader.nscreen_window_center(address(), index); }
        /** @return the value of the {@code screen_window_width} field. */
        public float screen_window_width() { return EXRHeader.nscreen_window_width(address()); }
        /** @return the value of the {@code chunk_count} field. */
        public int chunk_count() { return EXRHeader.nchunk_count(address()); }
        /** @return the value of the {@code tiled} field. */
        @NativeType("int")
        public boolean tiled() { return EXRHeader.ntiled(address()) != 0; }
        /** @return the value of the {@code tile_size_x} field. */
        public int tile_size_x() { return EXRHeader.ntile_size_x(address()); }
        /** @return the value of the {@code tile_size_y} field. */
        public int tile_size_y() { return EXRHeader.ntile_size_y(address()); }
        /** @return the value of the {@code tile_level_mode} field. */
        public int tile_level_mode() { return EXRHeader.ntile_level_mode(address()); }
        /** @return the value of the {@code tile_rounding_mode} field. */
        public int tile_rounding_mode() { return EXRHeader.ntile_rounding_mode(address()); }
        /** @return the value of the {@code long_name} field. */
        @NativeType("int")
        public boolean long_name() { return EXRHeader.nlong_name(address()) != 0; }
        /** @return the value of the {@link EXRHeader#non_image} field. */
        @NativeType("int")
        public boolean non_image() { return EXRHeader.nnon_image(address()) != 0; }
        /** @return the value of the {@code multipart} field. */
        @NativeType("int")
        public boolean multipart() { return EXRHeader.nmultipart(address()) != 0; }
        /** @return the value of the {@code header_len} field. */
        @NativeType("unsigned int")
        public int header_len() { return EXRHeader.nheader_len(address()); }
        /** @return the value of the {@link EXRHeader#num_custom_attributes} field. */
        public int num_custom_attributes() { return EXRHeader.nnum_custom_attributes(address()); }
        /** @return a {@link EXRAttribute.Buffer} view of the struct array pointed to by the {@link EXRHeader#custom_attributes} field. */
        @Nullable
        @NativeType("EXRAttribute *")
        public EXRAttribute.Buffer custom_attributes() { return EXRHeader.ncustom_attributes(address()); }
        /** @return a {@link EXRChannelInfo.Buffer} view of the struct array pointed to by the {@code channels} field. */
        @NativeType("EXRChannelInfo *")
        public EXRChannelInfo.Buffer channels() { return EXRHeader.nchannels(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link EXRHeader#pixel_types} field. */
        @NativeType("int *")
        public IntBuffer pixel_types() { return EXRHeader.npixel_types(address()); }
        /** @return the value of the {@code num_channels} field. */
        public int num_channels() { return EXRHeader.nnum_channels(address()); }
        /** @return the value of the {@link EXRHeader#compression_type} field. */
        public int compression_type() { return EXRHeader.ncompression_type(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link EXRHeader#requested_pixel_types} field. */
        @NativeType("int *")
        public IntBuffer requested_pixel_types() { return EXRHeader.nrequested_pixel_types(address()); }
        /** @return a {@link ByteBuffer} view of the {@link EXRHeader#name} field. */
        @NativeType("char[256]")
        public ByteBuffer name() { return EXRHeader.nname(address()); }
        /** @return the null-terminated string stored in the {@link EXRHeader#name} field. */
        @NativeType("char[256]")
        public String nameString() { return EXRHeader.nnameString(address()); }

        /** Sets the specified value to the {@code pixel_aspect_ratio} field. */
        public EXRHeader.Buffer pixel_aspect_ratio(float value) { EXRHeader.npixel_aspect_ratio(address(), value); return this; }
        /** Sets the specified value to the {@code line_order} field. */
        public EXRHeader.Buffer line_order(int value) { EXRHeader.nline_order(address(), value); return this; }
        /** Copies the specified {@link EXRBox2i} to the {@code data_window} field. */
        public EXRHeader.Buffer data_window(EXRBox2i value) { EXRHeader.ndata_window(address(), value); return this; }
        /** Passes the {@code data_window} field to the specified {@link java.util.function.Consumer Consumer}. */
        public EXRHeader.Buffer data_window(java.util.function.Consumer<EXRBox2i> consumer) { consumer.accept(data_window()); return this; }
        /** Copies the specified {@link EXRBox2i} to the {@code display_window} field. */
        public EXRHeader.Buffer display_window(EXRBox2i value) { EXRHeader.ndisplay_window(address(), value); return this; }
        /** Passes the {@code display_window} field to the specified {@link java.util.function.Consumer Consumer}. */
        public EXRHeader.Buffer display_window(java.util.function.Consumer<EXRBox2i> consumer) { consumer.accept(display_window()); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code screen_window_center} field. */
        public EXRHeader.Buffer screen_window_center(@NativeType("float[2]") FloatBuffer value) { EXRHeader.nscreen_window_center(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code screen_window_center} field. */
        public EXRHeader.Buffer screen_window_center(int index, float value) { EXRHeader.nscreen_window_center(address(), index, value); return this; }
        /** Sets the specified value to the {@code screen_window_width} field. */
        public EXRHeader.Buffer screen_window_width(float value) { EXRHeader.nscreen_window_width(address(), value); return this; }
        /** Sets the specified value to the {@code chunk_count} field. */
        public EXRHeader.Buffer chunk_count(int value) { EXRHeader.nchunk_count(address(), value); return this; }
        /** Sets the specified value to the {@code tiled} field. */
        public EXRHeader.Buffer tiled(@NativeType("int") boolean value) { EXRHeader.ntiled(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tile_size_x} field. */
        public EXRHeader.Buffer tile_size_x(int value) { EXRHeader.ntile_size_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_size_y} field. */
        public EXRHeader.Buffer tile_size_y(int value) { EXRHeader.ntile_size_y(address(), value); return this; }
        /** Sets the specified value to the {@code tile_level_mode} field. */
        public EXRHeader.Buffer tile_level_mode(int value) { EXRHeader.ntile_level_mode(address(), value); return this; }
        /** Sets the specified value to the {@code tile_rounding_mode} field. */
        public EXRHeader.Buffer tile_rounding_mode(int value) { EXRHeader.ntile_rounding_mode(address(), value); return this; }
        /** Sets the specified value to the {@code long_name} field. */
        public EXRHeader.Buffer long_name(@NativeType("int") boolean value) { EXRHeader.nlong_name(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link EXRHeader#non_image} field. */
        public EXRHeader.Buffer non_image(@NativeType("int") boolean value) { EXRHeader.nnon_image(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code multipart} field. */
        public EXRHeader.Buffer multipart(@NativeType("int") boolean value) { EXRHeader.nmultipart(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code header_len} field. */
        public EXRHeader.Buffer header_len(@NativeType("unsigned int") int value) { EXRHeader.nheader_len(address(), value); return this; }
        /** Sets the specified value to the {@link EXRHeader#num_custom_attributes} field. */
        public EXRHeader.Buffer num_custom_attributes(int value) { EXRHeader.nnum_custom_attributes(address(), value); return this; }
        /** Sets the address of the specified {@link EXRAttribute.Buffer} to the {@link EXRHeader#custom_attributes} field. */
        public EXRHeader.Buffer custom_attributes(@Nullable @NativeType("EXRAttribute *") EXRAttribute.Buffer value) { EXRHeader.ncustom_attributes(address(), value); return this; }
        /** Sets the address of the specified {@link EXRChannelInfo.Buffer} to the {@code channels} field. */
        public EXRHeader.Buffer channels(@NativeType("EXRChannelInfo *") EXRChannelInfo.Buffer value) { EXRHeader.nchannels(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link EXRHeader#pixel_types} field. */
        public EXRHeader.Buffer pixel_types(@NativeType("int *") IntBuffer value) { EXRHeader.npixel_types(address(), value); return this; }
        /** Sets the specified value to the {@code num_channels} field. */
        public EXRHeader.Buffer num_channels(int value) { EXRHeader.nnum_channels(address(), value); return this; }
        /** Sets the specified value to the {@link EXRHeader#compression_type} field. */
        public EXRHeader.Buffer compression_type(int value) { EXRHeader.ncompression_type(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link EXRHeader#requested_pixel_types} field. */
        public EXRHeader.Buffer requested_pixel_types(@NativeType("int *") IntBuffer value) { EXRHeader.nrequested_pixel_types(address(), value); return this; }
        /** Copies the specified encoded string to the {@link EXRHeader#name} field. */
        public EXRHeader.Buffer name(@NativeType("char[256]") ByteBuffer value) { EXRHeader.nname(address(), value); return this; }

    }

}
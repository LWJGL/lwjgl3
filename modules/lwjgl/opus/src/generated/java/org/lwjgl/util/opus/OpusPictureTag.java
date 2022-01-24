/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The contents of a {@code METADATA_BLOCK_PICTURE} tag.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct OpusPictureTag {
 *     opus_int32 {@link #type};
 *     char * {@link #mime_type};
 *     char * {@link #description};
 *     opus_uint32 {@link #width};
 *     opus_uint32 {@link #height};
 *     opus_uint32 {@link #depth};
 *     opus_uint32 {@link #colors};
 *     opus_uint32 {@link #data_length};
 *     unsigned char * {@link #data};
 *     int {@link #format};
 * }</code></pre>
 */
public class OpusPictureTag extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        MIME_TYPE,
        DESCRIPTION,
        WIDTH,
        HEIGHT,
        DEPTH,
        COLORS,
        DATA_LENGTH,
        DATA,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        MIME_TYPE = layout.offsetof(1);
        DESCRIPTION = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        HEIGHT = layout.offsetof(4);
        DEPTH = layout.offsetof(5);
        COLORS = layout.offsetof(6);
        DATA_LENGTH = layout.offsetof(7);
        DATA = layout.offsetof(8);
        FORMAT = layout.offsetof(9);
    }

    /**
     * Creates a {@code OpusPictureTag} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OpusPictureTag(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * the picture type according to the ID3v2 APIC frame:
     * 
     * <ol>
     * <li>Other</li>
     * <li>32x32 pixels 'file icon' (PNG only)</li>
     * <li>Other file icon</li>
     * <li>Cover (front)</li>
     * <li>Cover (back)</li>
     * <li>Leaflet page</li>
     * <li>Media (e.g. label side of CD)</li>
     * <li>Lead artist/lead performer/soloist</li>
     * <li>Artist/performer</li>
     * <li>Conductor</li>
     * <li>Band/Orchestra</li>
     * <li>Composer</li>
     * <li>Lyricist/text writer</li>
     * <li>Recording Location</li>
     * <li>During recording</li>
     * <li>During performance</li>
     * <li>Movie/video screen capture</li>
     * <li>A bright colored fish</li>
     * <li>Illustration</li>
     * <li>Band/artist logotype</li>
     * <li>Publisher/Studio logotype</li>
     * </ol>
     * 
     * <p>Others are reserved and should not be used. There may only be one each of picture type 1 and 2 in a file.</p>
     */
    @NativeType("opus_int32")
    public int type() { return ntype(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return the MIME type of the picture, in printable ASCII characters {@code 0x20-0x7E}.
     *         
     *         <p>The MIME type may also be {@code "-->"} to signify that the data part is a URL pointing to the picture instead of the picture data itself. In this
     *         case, a terminating {@code NUL} is appended to the URL string in {@code #data}, but {@code #data_length} is set to the length of the string excluding
     *         that terminating {@code NUL}.</p>
     */
    @NativeType("char *")
    public ByteBuffer mime_type(int capacity) { return nmime_type(address(), capacity); }
    /** the description of the picture, in UTF-8 */
    @NativeType("char *")
    public ByteBuffer description() { return ndescription(address()); }
    /** the description of the picture, in UTF-8 */
    @NativeType("char *")
    public String descriptionString() { return ndescriptionString(address()); }
    /** the width of the picture in pixels */
    @NativeType("opus_uint32")
    public int width() { return nwidth(address()); }
    /** the height of the picture in pixels */
    @NativeType("opus_uint32")
    public int height() { return nheight(address()); }
    /** the color depth of the picture in bits-per-pixel (<em> not</em> bits-per-channel) */
    @NativeType("opus_uint32")
    public int depth() { return ndepth(address()); }
    /** for indexed-color pictures (e.g., GIF), the number of colors used, or 0 for non-indexed pictures. */
    @NativeType("opus_uint32")
    public int colors() { return ncolors(address()); }
    /** the length of the picture data in bytes */
    @NativeType("opus_uint32")
    public int data_length() { return ndata_length(address()); }
    /** the binary picture data */
    @NativeType("unsigned char *")
    public ByteBuffer data() { return ndata(address()); }
    /** the format of the picture data, if known. One of:<br><table><tr><td>{@link OpusFile#OP_PIC_FORMAT_UNKNOWN PIC_FORMAT_UNKNOWN}</td><td>{@link OpusFile#OP_PIC_FORMAT_URL PIC_FORMAT_URL}</td><td>{@link OpusFile#OP_PIC_FORMAT_JPEG PIC_FORMAT_JPEG}</td><td>{@link OpusFile#OP_PIC_FORMAT_PNG PIC_FORMAT_PNG}</td><td>{@link OpusFile#OP_PIC_FORMAT_GIF PIC_FORMAT_GIF}</td></tr></table> */
    public int format() { return nformat(address()); }

    // -----------------------------------

    /** Returns a new {@code OpusPictureTag} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpusPictureTag malloc() {
        return wrap(OpusPictureTag.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OpusPictureTag} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpusPictureTag calloc() {
        return wrap(OpusPictureTag.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OpusPictureTag} instance allocated with {@link BufferUtils}. */
    public static OpusPictureTag create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OpusPictureTag.class, memAddress(container), container);
    }

    /** Returns a new {@code OpusPictureTag} instance for the specified memory address. */
    public static OpusPictureTag create(long address) {
        return wrap(OpusPictureTag.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusPictureTag createSafe(long address) {
        return address == NULL ? null : wrap(OpusPictureTag.class, address);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OpusPictureTag.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusPictureTag.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code OpusPictureTag} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusPictureTag malloc(MemoryStack stack) {
        return wrap(OpusPictureTag.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OpusPictureTag} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusPictureTag calloc(MemoryStack stack) {
        return wrap(OpusPictureTag.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + OpusPictureTag.TYPE); }
    /** Unsafe version of {@link #mime_type(int) mime_type}. */
    public static ByteBuffer nmime_type(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + OpusPictureTag.MIME_TYPE), capacity); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBufferNT1(memGetAddress(struct + OpusPictureTag.DESCRIPTION)); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(memGetAddress(struct + OpusPictureTag.DESCRIPTION)); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + OpusPictureTag.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + OpusPictureTag.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return UNSAFE.getInt(null, struct + OpusPictureTag.DEPTH); }
    /** Unsafe version of {@link #colors}. */
    public static int ncolors(long struct) { return UNSAFE.getInt(null, struct + OpusPictureTag.COLORS); }
    /** Unsafe version of {@link #data_length}. */
    public static int ndata_length(long struct) { return UNSAFE.getInt(null, struct + OpusPictureTag.DATA_LENGTH); }
    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + OpusPictureTag.DATA), ndata_length(struct)); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + OpusPictureTag.FORMAT); }

    // -----------------------------------

    /** An array of {@link OpusPictureTag} structs. */
    public static class Buffer extends StructBuffer<OpusPictureTag, Buffer> implements NativeResource {

        private static final OpusPictureTag ELEMENT_FACTORY = OpusPictureTag.create(-1L);

        /**
         * Creates a new {@code OpusPictureTag.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpusPictureTag#SIZEOF}, and its mark will be undefined.
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
        protected OpusPictureTag getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OpusPictureTag#type} field. */
        @NativeType("opus_int32")
        public int type() { return OpusPictureTag.ntype(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link OpusPictureTag#mime_type} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("char *")
        public ByteBuffer mime_type(int capacity) { return OpusPictureTag.nmime_type(address(), capacity); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link OpusPictureTag#description} field. */
        @NativeType("char *")
        public ByteBuffer description() { return OpusPictureTag.ndescription(address()); }
        /** @return the null-terminated string pointed to by the {@link OpusPictureTag#description} field. */
        @NativeType("char *")
        public String descriptionString() { return OpusPictureTag.ndescriptionString(address()); }
        /** @return the value of the {@link OpusPictureTag#width} field. */
        @NativeType("opus_uint32")
        public int width() { return OpusPictureTag.nwidth(address()); }
        /** @return the value of the {@link OpusPictureTag#height} field. */
        @NativeType("opus_uint32")
        public int height() { return OpusPictureTag.nheight(address()); }
        /** @return the value of the {@link OpusPictureTag#depth} field. */
        @NativeType("opus_uint32")
        public int depth() { return OpusPictureTag.ndepth(address()); }
        /** @return the value of the {@link OpusPictureTag#colors} field. */
        @NativeType("opus_uint32")
        public int colors() { return OpusPictureTag.ncolors(address()); }
        /** @return the value of the {@link OpusPictureTag#data_length} field. */
        @NativeType("opus_uint32")
        public int data_length() { return OpusPictureTag.ndata_length(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link OpusPictureTag#data} field. */
        @NativeType("unsigned char *")
        public ByteBuffer data() { return OpusPictureTag.ndata(address()); }
        /** @return the value of the {@link OpusPictureTag#format} field. */
        public int format() { return OpusPictureTag.nformat(address()); }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct OpusPictureTag {
 *     opus_int32 type;
 *     char * mime_type;
 *     char * description;
 *     opus_uint32 width;
 *     opus_uint32 height;
 *     opus_uint32 depth;
 *     opus_uint32 colors;
 *     opus_uint32 data_length;
 *     unsigned char * data;
 *     int format;
 * }}</pre>
 */
public class OpusPictureTag extends Struct<OpusPictureTag> implements NativeResource {

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

    protected OpusPictureTag(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OpusPictureTag create(long address, @Nullable ByteBuffer container) {
        return new OpusPictureTag(address, container);
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

    /** @return the value of the {@code type} field. */
    @NativeType("opus_int32")
    public int type() { return ntype(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code mime_type} field. */
    @NativeType("char *")
    public ByteBuffer mime_type(int capacity) { return nmime_type(address(), capacity); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code description} field. */
    @NativeType("char *")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string pointed to by the {@code description} field. */
    @NativeType("char *")
    public String descriptionString() { return ndescriptionString(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("opus_uint32")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("opus_uint32")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    @NativeType("opus_uint32")
    public int depth() { return ndepth(address()); }
    /** @return the value of the {@code colors} field. */
    @NativeType("opus_uint32")
    public int colors() { return ncolors(address()); }
    /** @return the value of the {@code data_length} field. */
    @NativeType("opus_uint32")
    public int data_length() { return ndata_length(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
    @NativeType("unsigned char *")
    public ByteBuffer data() { return ndata(address()); }
    /** @return the value of the {@code format} field. */
    public int format() { return nformat(address()); }

    // -----------------------------------

    /** Returns a new {@code OpusPictureTag} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpusPictureTag malloc() {
        return new OpusPictureTag(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OpusPictureTag} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpusPictureTag calloc() {
        return new OpusPictureTag(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OpusPictureTag} instance allocated with {@link BufferUtils}. */
    public static OpusPictureTag create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OpusPictureTag(memAddress(container), container);
    }

    /** Returns a new {@code OpusPictureTag} instance for the specified memory address. */
    public static OpusPictureTag create(long address) {
        return new OpusPictureTag(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OpusPictureTag createSafe(long address) {
        return address == NULL ? null : new OpusPictureTag(address, null);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OpusPictureTag.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OpusPictureTag.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code OpusPictureTag} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusPictureTag malloc(MemoryStack stack) {
        return new OpusPictureTag(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OpusPictureTag} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusPictureTag calloc(MemoryStack stack) {
        return new OpusPictureTag(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusPictureTag.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusPictureTag.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + OpusPictureTag.TYPE); }
    /** Unsafe version of {@link #mime_type(int) mime_type}. */
    public static ByteBuffer nmime_type(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + OpusPictureTag.MIME_TYPE), capacity); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBufferNT1(memGetAddress(struct + OpusPictureTag.DESCRIPTION)); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(memGetAddress(struct + OpusPictureTag.DESCRIPTION)); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + OpusPictureTag.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + OpusPictureTag.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return memGetInt(struct + OpusPictureTag.DEPTH); }
    /** Unsafe version of {@link #colors}. */
    public static int ncolors(long struct) { return memGetInt(struct + OpusPictureTag.COLORS); }
    /** Unsafe version of {@link #data_length}. */
    public static int ndata_length(long struct) { return memGetInt(struct + OpusPictureTag.DATA_LENGTH); }
    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + OpusPictureTag.DATA), ndata_length(struct)); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + OpusPictureTag.FORMAT); }

    // -----------------------------------

    /** An array of {@link OpusPictureTag} structs. */
    public static class Buffer extends StructBuffer<OpusPictureTag, Buffer> implements NativeResource {

        private static final OpusPictureTag ELEMENT_FACTORY = OpusPictureTag.create(-1L);

        /**
         * Creates a new {@code OpusPictureTag.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpusPictureTag#SIZEOF}, and its mark will be undefined.</p>
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
        protected OpusPictureTag getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("opus_int32")
        public int type() { return OpusPictureTag.ntype(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code mime_type} field. */
        @NativeType("char *")
        public ByteBuffer mime_type(int capacity) { return OpusPictureTag.nmime_type(address(), capacity); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code description} field. */
        @NativeType("char *")
        public ByteBuffer description() { return OpusPictureTag.ndescription(address()); }
        /** @return the null-terminated string pointed to by the {@code description} field. */
        @NativeType("char *")
        public String descriptionString() { return OpusPictureTag.ndescriptionString(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("opus_uint32")
        public int width() { return OpusPictureTag.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("opus_uint32")
        public int height() { return OpusPictureTag.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        @NativeType("opus_uint32")
        public int depth() { return OpusPictureTag.ndepth(address()); }
        /** @return the value of the {@code colors} field. */
        @NativeType("opus_uint32")
        public int colors() { return OpusPictureTag.ncolors(address()); }
        /** @return the value of the {@code data_length} field. */
        @NativeType("opus_uint32")
        public int data_length() { return OpusPictureTag.ndata_length(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code data} field. */
        @NativeType("unsigned char *")
        public ByteBuffer data() { return OpusPictureTag.ndata(address()); }
        /** @return the value of the {@code format} field. */
        public int format() { return OpusPictureTag.nformat(address()); }

    }

}
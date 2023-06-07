/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A structure used to describe a bitmap or pixmap to the raster. Note that we now manage pixmaps of various depths through the {@code pixel_mode} field.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Bitmap {
 *     unsigned int rows;
 *     unsigned int width;
 *     int pitch;
 *     unsigned char * buffer;
 *     unsigned short num_grays;
 *     unsigned char pixel_mode;
 *     unsigned char palette_mode;
 *     void * palette;
 * }</code></pre>
 */
public class FT_Bitmap extends Struct<FT_Bitmap> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ROWS,
        WIDTH,
        PITCH,
        BUFFER,
        NUM_GRAYS,
        PIXEL_MODE,
        PALETTE_MODE,
        PALETTE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(2),
            __member(1),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ROWS = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        PITCH = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        NUM_GRAYS = layout.offsetof(4);
        PIXEL_MODE = layout.offsetof(5);
        PALETTE_MODE = layout.offsetof(6);
        PALETTE = layout.offsetof(7);
    }

    protected FT_Bitmap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Bitmap create(long address, @Nullable ByteBuffer container) {
        return new FT_Bitmap(address, container);
    }

    /**
     * Creates a {@code FT_Bitmap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Bitmap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code rows} field. */
    @NativeType("unsigned int")
    public int rows() { return nrows(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("unsigned int")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code pitch} field. */
    public int pitch() { return npitch(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("unsigned char *")
    public ByteBuffer buffer(int capacity) { return nbuffer(address(), capacity); }
    /** @return the value of the {@code num_grays} field. */
    @NativeType("unsigned short")
    public short num_grays() { return nnum_grays(address()); }
    /** @return the value of the {@code pixel_mode} field. */
    @NativeType("unsigned char")
    public byte pixel_mode() { return npixel_mode(address()); }
    /** @return the value of the {@code palette_mode} field. */
    @NativeType("unsigned char")
    public byte palette_mode() { return npalette_mode(address()); }
    /** @return the value of the {@code palette} field. */
    @NativeType("void *")
    public long palette() { return npalette(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Bitmap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Bitmap malloc() {
        return new FT_Bitmap(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Bitmap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Bitmap calloc() {
        return new FT_Bitmap(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Bitmap} instance allocated with {@link BufferUtils}. */
    public static FT_Bitmap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Bitmap(memAddress(container), container);
    }

    /** Returns a new {@code FT_Bitmap} instance for the specified memory address. */
    public static FT_Bitmap create(long address) {
        return new FT_Bitmap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Bitmap createSafe(long address) {
        return address == NULL ? null : new FT_Bitmap(address, null);
    }

    /**
     * Returns a new {@link FT_Bitmap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Bitmap.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Bitmap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Bitmap.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Bitmap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Bitmap.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Bitmap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Bitmap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Bitmap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Bitmap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Bitmap malloc(MemoryStack stack) {
        return new FT_Bitmap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Bitmap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Bitmap calloc(MemoryStack stack) {
        return new FT_Bitmap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Bitmap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Bitmap.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Bitmap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Bitmap.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rows}. */
    public static int nrows(long struct) { return UNSAFE.getInt(null, struct + FT_Bitmap.ROWS); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + FT_Bitmap.WIDTH); }
    /** Unsafe version of {@link #pitch}. */
    public static int npitch(long struct) { return UNSAFE.getInt(null, struct + FT_Bitmap.PITCH); }
    /** Unsafe version of {@link #buffer(int) buffer}. */
    @Nullable public static ByteBuffer nbuffer(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + FT_Bitmap.BUFFER), capacity); }
    /** Unsafe version of {@link #num_grays}. */
    public static short nnum_grays(long struct) { return UNSAFE.getShort(null, struct + FT_Bitmap.NUM_GRAYS); }
    /** Unsafe version of {@link #pixel_mode}. */
    public static byte npixel_mode(long struct) { return UNSAFE.getByte(null, struct + FT_Bitmap.PIXEL_MODE); }
    /** Unsafe version of {@link #palette_mode}. */
    public static byte npalette_mode(long struct) { return UNSAFE.getByte(null, struct + FT_Bitmap.PALETTE_MODE); }
    /** Unsafe version of {@link #palette}. */
    public static long npalette(long struct) { return memGetAddress(struct + FT_Bitmap.PALETTE); }

    // -----------------------------------

    /** An array of {@link FT_Bitmap} structs. */
    public static class Buffer extends StructBuffer<FT_Bitmap, Buffer> implements NativeResource {

        private static final FT_Bitmap ELEMENT_FACTORY = FT_Bitmap.create(-1L);

        /**
         * Creates a new {@code FT_Bitmap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Bitmap#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Bitmap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code rows} field. */
        @NativeType("unsigned int")
        public int rows() { return FT_Bitmap.nrows(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("unsigned int")
        public int width() { return FT_Bitmap.nwidth(address()); }
        /** @return the value of the {@code pitch} field. */
        public int pitch() { return FT_Bitmap.npitch(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("unsigned char *")
        public ByteBuffer buffer(int capacity) { return FT_Bitmap.nbuffer(address(), capacity); }
        /** @return the value of the {@code num_grays} field. */
        @NativeType("unsigned short")
        public short num_grays() { return FT_Bitmap.nnum_grays(address()); }
        /** @return the value of the {@code pixel_mode} field. */
        @NativeType("unsigned char")
        public byte pixel_mode() { return FT_Bitmap.npixel_mode(address()); }
        /** @return the value of the {@code palette_mode} field. */
        @NativeType("unsigned char")
        public byte palette_mode() { return FT_Bitmap.npalette_mode(address()); }
        /** @return the value of the {@code palette} field. */
        @NativeType("void *")
        public long palette() { return FT_Bitmap.npalette(address()); }

    }

}
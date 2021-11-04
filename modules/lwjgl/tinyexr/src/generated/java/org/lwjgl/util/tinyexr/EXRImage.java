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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct EXRImage {
 *     {@link EXRTile EXRTile} * {@link #tiles};
 *     {@link EXRImage struct _EXRImage} * {@link #next_level};
 *     int {@link #level_x};
 *     int {@link #level_y};
 *     unsigned char ** {@link #images};
 *     int width;
 *     int height;
 *     int num_channels;
 *     int num_tiles;
 * }</code></pre>
 */
public class EXRImage extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TILES,
        NEXT_LEVEL,
        LEVEL_X,
        LEVEL_Y,
        IMAGES,
        WIDTH,
        HEIGHT,
        NUM_CHANNELS,
        NUM_TILES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TILES = layout.offsetof(0);
        NEXT_LEVEL = layout.offsetof(1);
        LEVEL_X = layout.offsetof(2);
        LEVEL_Y = layout.offsetof(3);
        IMAGES = layout.offsetof(4);
        WIDTH = layout.offsetof(5);
        HEIGHT = layout.offsetof(6);
        NUM_CHANNELS = layout.offsetof(7);
        NUM_TILES = layout.offsetof(8);
    }

    /**
     * Creates a {@code EXRImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRImage(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** tiled pixel data. The application must reconstruct image from tiles manually. {@code NULL} if scanline format. */
    @Nullable
    @NativeType("EXRTile *")
    public EXRTile.Buffer tiles() { return ntiles(address()); }
    /** {@code NULL} if scanline format or image is the last level. */
    @Nullable
    @NativeType("struct _EXRImage *")
    public EXRImage next_level() { return nnext_level(address()); }
    /** x level index */
    public int level_x() { return nlevel_x(address()); }
    /** y level index */
    public int level_y() { return nlevel_y(address()); }
    /** {@code image[channels][pixels]}. {@code NULL} if tiled format. */
    @Nullable
    @NativeType("unsigned char **")
    public PointerBuffer images() { return nimages(address()); }
    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** @return the value of the {@code num_channels} field. */
    public int num_channels() { return nnum_channels(address()); }
    /** @return the value of the {@code num_tiles} field. */
    public int num_tiles() { return nnum_tiles(address()); }

    /** Sets the address of the specified {@link EXRTile.Buffer} to the {@link #tiles} field. */
    public EXRImage tiles(@Nullable @NativeType("EXRTile *") EXRTile.Buffer value) { ntiles(address(), value); return this; }
    /** Sets the address of the specified {@link EXRImage} to the {@link #next_level} field. */
    public EXRImage next_level(@Nullable @NativeType("struct _EXRImage *") EXRImage value) { nnext_level(address(), value); return this; }
    /** Sets the specified value to the {@link #level_x} field. */
    public EXRImage level_x(int value) { nlevel_x(address(), value); return this; }
    /** Sets the specified value to the {@link #level_y} field. */
    public EXRImage level_y(int value) { nlevel_y(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #images} field. */
    public EXRImage images(@Nullable @NativeType("unsigned char **") PointerBuffer value) { nimages(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public EXRImage width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public EXRImage height(int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code num_channels} field. */
    public EXRImage num_channels(int value) { nnum_channels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public EXRImage set(
        @Nullable EXRTile.Buffer tiles,
        @Nullable EXRImage next_level,
        int level_x,
        int level_y,
        @Nullable PointerBuffer images,
        int width,
        int height,
        int num_channels
    ) {
        tiles(tiles);
        next_level(next_level);
        level_x(level_x);
        level_y(level_y);
        images(images);
        width(width);
        height(height);
        num_channels(num_channels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EXRImage set(EXRImage src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EXRImage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRImage malloc() {
        return wrap(EXRImage.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code EXRImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRImage calloc() {
        return wrap(EXRImage.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code EXRImage} instance allocated with {@link BufferUtils}. */
    public static EXRImage create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(EXRImage.class, memAddress(container), container);
    }

    /** Returns a new {@code EXRImage} instance for the specified memory address. */
    public static EXRImage create(long address) {
        return wrap(EXRImage.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRImage createSafe(long address) {
        return address == NULL ? null : wrap(EXRImage.class, address);
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link EXRImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRImage.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EXRImage mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EXRImage callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EXRImage mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EXRImage callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRImage.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRImage.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRImage.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRImage.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code EXRImage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRImage malloc(MemoryStack stack) {
        return wrap(EXRImage.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code EXRImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRImage calloc(MemoryStack stack) {
        return wrap(EXRImage.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tiles}. */
    @Nullable public static EXRTile.Buffer ntiles(long struct) { return EXRTile.createSafe(memGetAddress(struct + EXRImage.TILES), nnum_tiles(struct)); }
    /** Unsafe version of {@link #next_level}. */
    @Nullable public static EXRImage nnext_level(long struct) { return EXRImage.createSafe(memGetAddress(struct + EXRImage.NEXT_LEVEL)); }
    /** Unsafe version of {@link #level_x}. */
    public static int nlevel_x(long struct) { return UNSAFE.getInt(null, struct + EXRImage.LEVEL_X); }
    /** Unsafe version of {@link #level_y}. */
    public static int nlevel_y(long struct) { return UNSAFE.getInt(null, struct + EXRImage.LEVEL_Y); }
    /** Unsafe version of {@link #images() images}. */
    @Nullable public static PointerBuffer nimages(long struct) { return memPointerBufferSafe(memGetAddress(struct + EXRImage.IMAGES), nnum_channels(struct)); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + EXRImage.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + EXRImage.HEIGHT); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return UNSAFE.getInt(null, struct + EXRImage.NUM_CHANNELS); }
    /** Unsafe version of {@link #num_tiles}. */
    public static int nnum_tiles(long struct) { return UNSAFE.getInt(null, struct + EXRImage.NUM_TILES); }

    /** Unsafe version of {@link #tiles(EXRTile.Buffer) tiles}. */
    public static void ntiles(long struct, @Nullable EXRTile.Buffer value) { memPutAddress(struct + EXRImage.TILES, memAddressSafe(value)); nnum_tiles(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #next_level(EXRImage) next_level}. */
    public static void nnext_level(long struct, @Nullable EXRImage value) { memPutAddress(struct + EXRImage.NEXT_LEVEL, memAddressSafe(value)); }
    /** Unsafe version of {@link #level_x(int) level_x}. */
    public static void nlevel_x(long struct, int value) { UNSAFE.putInt(null, struct + EXRImage.LEVEL_X, value); }
    /** Unsafe version of {@link #level_y(int) level_y}. */
    public static void nlevel_y(long struct, int value) { UNSAFE.putInt(null, struct + EXRImage.LEVEL_Y, value); }
    /** Unsafe version of {@link #images(PointerBuffer) images}. */
    public static void nimages(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + EXRImage.IMAGES, memAddressSafe(value)); nnum_channels(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + EXRImage.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + EXRImage.HEIGHT, value); }
    /** Sets the specified value to the {@code num_channels} field of the specified {@code struct}. */
    public static void nnum_channels(long struct, int value) { UNSAFE.putInt(null, struct + EXRImage.NUM_CHANNELS, value); }
    /** Sets the specified value to the {@code num_tiles} field of the specified {@code struct}. */
    public static void nnum_tiles(long struct, int value) { UNSAFE.putInt(null, struct + EXRImage.NUM_TILES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int num_tiles = nnum_tiles(struct);
        if (num_tiles != 0) {
            long tiles = memGetAddress(struct + EXRImage.TILES);
            check(tiles);
            validate(tiles, num_tiles, EXRTile.SIZEOF, EXRTile::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link EXRImage} structs. */
    public static class Buffer extends StructBuffer<EXRImage, Buffer> implements NativeResource {

        private static final EXRImage ELEMENT_FACTORY = EXRImage.create(-1L);

        /**
         * Creates a new {@code EXRImage.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRImage#SIZEOF}, and its mark will be undefined.
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
        protected EXRImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link EXRTile.Buffer} view of the struct array pointed to by the {@link EXRImage#tiles} field. */
        @Nullable
        @NativeType("EXRTile *")
        public EXRTile.Buffer tiles() { return EXRImage.ntiles(address()); }
        /** @return a {@link EXRImage} view of the struct pointed to by the {@link EXRImage#next_level} field. */
        @Nullable
        @NativeType("struct _EXRImage *")
        public EXRImage next_level() { return EXRImage.nnext_level(address()); }
        /** @return the value of the {@link EXRImage#level_x} field. */
        public int level_x() { return EXRImage.nlevel_x(address()); }
        /** @return the value of the {@link EXRImage#level_y} field. */
        public int level_y() { return EXRImage.nlevel_y(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link EXRImage#images} field. */
        @Nullable
        @NativeType("unsigned char **")
        public PointerBuffer images() { return EXRImage.nimages(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return EXRImage.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return EXRImage.nheight(address()); }
        /** @return the value of the {@code num_channels} field. */
        public int num_channels() { return EXRImage.nnum_channels(address()); }
        /** @return the value of the {@code num_tiles} field. */
        public int num_tiles() { return EXRImage.nnum_tiles(address()); }

        /** Sets the address of the specified {@link EXRTile.Buffer} to the {@link EXRImage#tiles} field. */
        public EXRImage.Buffer tiles(@Nullable @NativeType("EXRTile *") EXRTile.Buffer value) { EXRImage.ntiles(address(), value); return this; }
        /** Sets the address of the specified {@link EXRImage} to the {@link EXRImage#next_level} field. */
        public EXRImage.Buffer next_level(@Nullable @NativeType("struct _EXRImage *") EXRImage value) { EXRImage.nnext_level(address(), value); return this; }
        /** Sets the specified value to the {@link EXRImage#level_x} field. */
        public EXRImage.Buffer level_x(int value) { EXRImage.nlevel_x(address(), value); return this; }
        /** Sets the specified value to the {@link EXRImage#level_y} field. */
        public EXRImage.Buffer level_y(int value) { EXRImage.nlevel_y(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link EXRImage#images} field. */
        public EXRImage.Buffer images(@Nullable @NativeType("unsigned char **") PointerBuffer value) { EXRImage.nimages(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public EXRImage.Buffer width(int value) { EXRImage.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public EXRImage.Buffer height(int value) { EXRImage.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code num_channels} field. */
        public EXRImage.Buffer num_channels(int value) { EXRImage.nnum_channels(address(), value); return this; }

    }

}
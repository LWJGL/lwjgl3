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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code tiles} &ndash; tiled pixel data. The application must reconstruct image from tiles manually. {@code NULL} if scanline format.</li>
 * <li>{@code images} &ndash; {@code image[channels][pixels]}. {@code NULL} if tiled format.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct EXRImage {
 *     {@link EXRTile EXRTile} * tiles;
 *     unsigned char ** images;
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
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TILES = layout.offsetof(0);
        IMAGES = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        NUM_CHANNELS = layout.offsetof(4);
        NUM_TILES = layout.offsetof(5);
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

    /** Returns a {@link EXRTile.Buffer} view of the struct array pointed to by the {@code tiles} field. */
    @Nullable
    @NativeType("EXRTile *")
    public EXRTile.Buffer tiles() { return ntiles(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code images} field. */
    @Nullable
    @NativeType("unsigned char **")
    public PointerBuffer images() { return nimages(address()); }
    /** Returns the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** Returns the value of the {@code num_channels} field. */
    public int num_channels() { return nnum_channels(address()); }
    /** Returns the value of the {@code num_tiles} field. */
    public int num_tiles() { return nnum_tiles(address()); }

    /** Sets the address of the specified {@link EXRTile.Buffer} to the {@code tiles} field. */
    public EXRImage tiles(@Nullable @NativeType("EXRTile *") EXRTile.Buffer value) { ntiles(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code images} field. */
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
        @Nullable PointerBuffer images,
        int width,
        int height,
        int num_channels
    ) {
        tiles(tiles);
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

    /** Returns a new {@code EXRImage} instance allocated on the thread-local {@link MemoryStack}. */
    public static EXRImage mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code EXRImage} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static EXRImage callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code EXRImage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRImage mallocStack(MemoryStack stack) {
        return wrap(EXRImage.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code EXRImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRImage callocStack(MemoryStack stack) {
        return wrap(EXRImage.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRImage.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tiles}. */
    @Nullable public static EXRTile.Buffer ntiles(long struct) { return EXRTile.createSafe(memGetAddress(struct + EXRImage.TILES), nnum_tiles(struct)); }
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
            EXRTile.validate(tiles, num_tiles);
        }
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

        /** Returns a {@link EXRTile.Buffer} view of the struct array pointed to by the {@code tiles} field. */
        @Nullable
        @NativeType("EXRTile *")
        public EXRTile.Buffer tiles() { return EXRImage.ntiles(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code images} field. */
        @Nullable
        @NativeType("unsigned char **")
        public PointerBuffer images() { return EXRImage.nimages(address()); }
        /** Returns the value of the {@code width} field. */
        public int width() { return EXRImage.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        public int height() { return EXRImage.nheight(address()); }
        /** Returns the value of the {@code num_channels} field. */
        public int num_channels() { return EXRImage.nnum_channels(address()); }
        /** Returns the value of the {@code num_tiles} field. */
        public int num_tiles() { return EXRImage.nnum_tiles(address()); }

        /** Sets the address of the specified {@link EXRTile.Buffer} to the {@code tiles} field. */
        public EXRImage.Buffer tiles(@Nullable @NativeType("EXRTile *") EXRTile.Buffer value) { EXRImage.ntiles(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code images} field. */
        public EXRImage.Buffer images(@Nullable @NativeType("unsigned char **") PointerBuffer value) { EXRImage.nimages(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public EXRImage.Buffer width(int value) { EXRImage.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public EXRImage.Buffer height(int value) { EXRImage.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code num_channels} field. */
        public EXRImage.Buffer num_channels(int value) { EXRImage.nnum_channels(address(), value); return this; }

    }

}
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
 * struct DeepImage {
 *     char const ** channel_names;
 *     float *** {@link #image};
 *     int ** {@link #offset_table};
 *     int num_channels;
 *     int width;
 *     int height;
 *     char[4];
 * }</code></pre>
 */
public class DeepImage extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CHANNEL_NAMES,
        IMAGE,
        OFFSET_TABLE,
        NUM_CHANNELS,
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __padding(4, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CHANNEL_NAMES = layout.offsetof(0);
        IMAGE = layout.offsetof(1);
        OFFSET_TABLE = layout.offsetof(2);
        NUM_CHANNELS = layout.offsetof(3);
        WIDTH = layout.offsetof(4);
        HEIGHT = layout.offsetof(5);
    }

    /**
     * Creates a {@code DeepImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DeepImage(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code channel_names} field. */
    @NativeType("char const **")
    public PointerBuffer channel_names() { return nchannel_names(address()); }
    /** image[channels][scanlines][samples] */
    @NativeType("float ***")
    public PointerBuffer image() { return nimage(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return offset_table[scanline][offsets]
     */
    @NativeType("int **")
    public PointerBuffer offset_table(int capacity) { return noffset_table(address(), capacity); }
    /** @return the value of the {@code num_channels} field. */
    public int num_channels() { return nnum_channels(address()); }
    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }

    /** Sets the address of the specified {@link PointerBuffer} to the {@code channel_names} field. */
    public DeepImage channel_names(@NativeType("char const **") PointerBuffer value) { nchannel_names(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #image} field. */
    public DeepImage image(@NativeType("float ***") PointerBuffer value) { nimage(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #offset_table} field. */
    public DeepImage offset_table(@NativeType("int **") PointerBuffer value) { noffset_table(address(), value); return this; }
    /** Sets the specified value to the {@code num_channels} field. */
    public DeepImage num_channels(int value) { nnum_channels(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public DeepImage width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public DeepImage height(int value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public DeepImage set(
        PointerBuffer channel_names,
        PointerBuffer image,
        PointerBuffer offset_table,
        int num_channels,
        int width,
        int height
    ) {
        channel_names(channel_names);
        image(image);
        offset_table(offset_table);
        num_channels(num_channels);
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DeepImage set(DeepImage src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code DeepImage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DeepImage malloc() {
        return wrap(DeepImage.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code DeepImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DeepImage calloc() {
        return wrap(DeepImage.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code DeepImage} instance allocated with {@link BufferUtils}. */
    public static DeepImage create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(DeepImage.class, memAddress(container), container);
    }

    /** Returns a new {@code DeepImage} instance for the specified memory address. */
    public static DeepImage create(long address) {
        return wrap(DeepImage.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DeepImage createSafe(long address) {
        return address == NULL ? null : wrap(DeepImage.class, address);
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DeepImage.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static DeepImage.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static DeepImage.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link DeepImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static DeepImage.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static DeepImage.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DeepImage mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DeepImage callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static DeepImage mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static DeepImage callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DeepImage.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DeepImage.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static DeepImage.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static DeepImage.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code DeepImage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DeepImage malloc(MemoryStack stack) {
        return wrap(DeepImage.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code DeepImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DeepImage calloc(MemoryStack stack) {
        return wrap(DeepImage.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DeepImage.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DeepImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static DeepImage.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #channel_names() channel_names}. */
    public static PointerBuffer nchannel_names(long struct) { return memPointerBuffer(memGetAddress(struct + DeepImage.CHANNEL_NAMES), nnum_channels(struct)); }
    /** Unsafe version of {@link #image() image}. */
    public static PointerBuffer nimage(long struct) { return memPointerBuffer(memGetAddress(struct + DeepImage.IMAGE), nnum_channels(struct)); }
    /** Unsafe version of {@link #offset_table(int) offset_table}. */
    public static PointerBuffer noffset_table(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + DeepImage.OFFSET_TABLE), capacity); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return UNSAFE.getInt(null, struct + DeepImage.NUM_CHANNELS); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + DeepImage.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + DeepImage.HEIGHT); }

    /** Unsafe version of {@link #channel_names(PointerBuffer) channel_names}. */
    public static void nchannel_names(long struct, PointerBuffer value) { memPutAddress(struct + DeepImage.CHANNEL_NAMES, memAddress(value)); }
    /** Unsafe version of {@link #image(PointerBuffer) image}. */
    public static void nimage(long struct, PointerBuffer value) { memPutAddress(struct + DeepImage.IMAGE, memAddress(value)); }
    /** Unsafe version of {@link #offset_table(PointerBuffer) offset_table}. */
    public static void noffset_table(long struct, PointerBuffer value) { memPutAddress(struct + DeepImage.OFFSET_TABLE, memAddress(value)); }
    /** Sets the specified value to the {@code num_channels} field of the specified {@code struct}. */
    public static void nnum_channels(long struct, int value) { UNSAFE.putInt(null, struct + DeepImage.NUM_CHANNELS, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + DeepImage.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + DeepImage.HEIGHT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + DeepImage.CHANNEL_NAMES));
        check(memGetAddress(struct + DeepImage.IMAGE));
        check(memGetAddress(struct + DeepImage.OFFSET_TABLE));
    }

    // -----------------------------------

    /** An array of {@link DeepImage} structs. */
    public static class Buffer extends StructBuffer<DeepImage, Buffer> implements NativeResource {

        private static final DeepImage ELEMENT_FACTORY = DeepImage.create(-1L);

        /**
         * Creates a new {@code DeepImage.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DeepImage#SIZEOF}, and its mark will be undefined.
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
        protected DeepImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code channel_names} field. */
        @NativeType("char const **")
        public PointerBuffer channel_names() { return DeepImage.nchannel_names(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link DeepImage#image} field. */
        @NativeType("float ***")
        public PointerBuffer image() { return DeepImage.nimage(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@link DeepImage#offset_table} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("int **")
        public PointerBuffer offset_table(int capacity) { return DeepImage.noffset_table(address(), capacity); }
        /** @return the value of the {@code num_channels} field. */
        public int num_channels() { return DeepImage.nnum_channels(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return DeepImage.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return DeepImage.nheight(address()); }

        /** Sets the address of the specified {@link PointerBuffer} to the {@code channel_names} field. */
        public DeepImage.Buffer channel_names(@NativeType("char const **") PointerBuffer value) { DeepImage.nchannel_names(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link DeepImage#image} field. */
        public DeepImage.Buffer image(@NativeType("float ***") PointerBuffer value) { DeepImage.nimage(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link DeepImage#offset_table} field. */
        public DeepImage.Buffer offset_table(@NativeType("int **") PointerBuffer value) { DeepImage.noffset_table(address(), value); return this; }
        /** Sets the specified value to the {@code num_channels} field. */
        public DeepImage.Buffer num_channels(int value) { DeepImage.nnum_channels(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public DeepImage.Buffer width(int value) { DeepImage.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public DeepImage.Buffer height(int value) { DeepImage.nheight(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_GPUTextureTransferInfo {
 *     SDL_GPUTransferBuffer * transfer_buffer;
 *     Uint32 offset;
 *     Uint32 pixels_per_row;
 *     Uint32 rows_per_layer;
 * }}</pre>
 */
public class SDL_GPUTextureTransferInfo extends Struct<SDL_GPUTextureTransferInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TRANSFER_BUFFER,
        OFFSET,
        PIXELS_PER_ROW,
        ROWS_PER_LAYER;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRANSFER_BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        PIXELS_PER_ROW = layout.offsetof(2);
        ROWS_PER_LAYER = layout.offsetof(3);
    }

    protected SDL_GPUTextureTransferInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUTextureTransferInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUTextureTransferInfo(address, container);
    }

    /**
     * Creates a {@code SDL_GPUTextureTransferInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUTextureTransferInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code transfer_buffer} field. */
    @NativeType("SDL_GPUTransferBuffer *")
    public long transfer_buffer() { return ntransfer_buffer(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("Uint32")
    public int offset() { return noffset(address()); }
    /** @return the value of the {@code pixels_per_row} field. */
    @NativeType("Uint32")
    public int pixels_per_row() { return npixels_per_row(address()); }
    /** @return the value of the {@code rows_per_layer} field. */
    @NativeType("Uint32")
    public int rows_per_layer() { return nrows_per_layer(address()); }

    /** Sets the specified value to the {@code transfer_buffer} field. */
    public SDL_GPUTextureTransferInfo transfer_buffer(@NativeType("SDL_GPUTransferBuffer *") long value) { ntransfer_buffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public SDL_GPUTextureTransferInfo offset(@NativeType("Uint32") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code pixels_per_row} field. */
    public SDL_GPUTextureTransferInfo pixels_per_row(@NativeType("Uint32") int value) { npixels_per_row(address(), value); return this; }
    /** Sets the specified value to the {@code rows_per_layer} field. */
    public SDL_GPUTextureTransferInfo rows_per_layer(@NativeType("Uint32") int value) { nrows_per_layer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUTextureTransferInfo set(
        long transfer_buffer,
        int offset,
        int pixels_per_row,
        int rows_per_layer
    ) {
        transfer_buffer(transfer_buffer);
        offset(offset);
        pixels_per_row(pixels_per_row);
        rows_per_layer(rows_per_layer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUTextureTransferInfo set(SDL_GPUTextureTransferInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUTextureTransferInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureTransferInfo malloc() {
        return new SDL_GPUTextureTransferInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureTransferInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureTransferInfo calloc() {
        return new SDL_GPUTextureTransferInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureTransferInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUTextureTransferInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureTransferInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUTextureTransferInfo} instance for the specified memory address. */
    public static SDL_GPUTextureTransferInfo create(long address) {
        return new SDL_GPUTextureTransferInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUTextureTransferInfo createSafe(long address) {
        return address == NULL ? null : new SDL_GPUTextureTransferInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureTransferInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureTransferInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureTransferInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureTransferInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureTransferInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureTransferInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUTextureTransferInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureTransferInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUTextureTransferInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUTextureTransferInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureTransferInfo malloc(MemoryStack stack) {
        return new SDL_GPUTextureTransferInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUTextureTransferInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureTransferInfo calloc(MemoryStack stack) {
        return new SDL_GPUTextureTransferInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureTransferInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureTransferInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureTransferInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureTransferInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #transfer_buffer}. */
    public static long ntransfer_buffer(long struct) { return memGetAddress(struct + SDL_GPUTextureTransferInfo.TRANSFER_BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + SDL_GPUTextureTransferInfo.OFFSET); }
    /** Unsafe version of {@link #pixels_per_row}. */
    public static int npixels_per_row(long struct) { return memGetInt(struct + SDL_GPUTextureTransferInfo.PIXELS_PER_ROW); }
    /** Unsafe version of {@link #rows_per_layer}. */
    public static int nrows_per_layer(long struct) { return memGetInt(struct + SDL_GPUTextureTransferInfo.ROWS_PER_LAYER); }

    /** Unsafe version of {@link #transfer_buffer(long) transfer_buffer}. */
    public static void ntransfer_buffer(long struct, long value) { memPutAddress(struct + SDL_GPUTextureTransferInfo.TRANSFER_BUFFER, check(value)); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + SDL_GPUTextureTransferInfo.OFFSET, value); }
    /** Unsafe version of {@link #pixels_per_row(int) pixels_per_row}. */
    public static void npixels_per_row(long struct, int value) { memPutInt(struct + SDL_GPUTextureTransferInfo.PIXELS_PER_ROW, value); }
    /** Unsafe version of {@link #rows_per_layer(int) rows_per_layer}. */
    public static void nrows_per_layer(long struct, int value) { memPutInt(struct + SDL_GPUTextureTransferInfo.ROWS_PER_LAYER, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUTextureTransferInfo.TRANSFER_BUFFER));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUTextureTransferInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUTextureTransferInfo, Buffer> implements NativeResource {

        private static final SDL_GPUTextureTransferInfo ELEMENT_FACTORY = SDL_GPUTextureTransferInfo.create(-1L);

        /**
         * Creates a new {@code SDL_GPUTextureTransferInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUTextureTransferInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUTextureTransferInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code transfer_buffer} field. */
        @NativeType("SDL_GPUTransferBuffer *")
        public long transfer_buffer() { return SDL_GPUTextureTransferInfo.ntransfer_buffer(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("Uint32")
        public int offset() { return SDL_GPUTextureTransferInfo.noffset(address()); }
        /** @return the value of the {@code pixels_per_row} field. */
        @NativeType("Uint32")
        public int pixels_per_row() { return SDL_GPUTextureTransferInfo.npixels_per_row(address()); }
        /** @return the value of the {@code rows_per_layer} field. */
        @NativeType("Uint32")
        public int rows_per_layer() { return SDL_GPUTextureTransferInfo.nrows_per_layer(address()); }

        /** Sets the specified value to the {@code transfer_buffer} field. */
        public SDL_GPUTextureTransferInfo.Buffer transfer_buffer(@NativeType("SDL_GPUTransferBuffer *") long value) { SDL_GPUTextureTransferInfo.ntransfer_buffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public SDL_GPUTextureTransferInfo.Buffer offset(@NativeType("Uint32") int value) { SDL_GPUTextureTransferInfo.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code pixels_per_row} field. */
        public SDL_GPUTextureTransferInfo.Buffer pixels_per_row(@NativeType("Uint32") int value) { SDL_GPUTextureTransferInfo.npixels_per_row(address(), value); return this; }
        /** Sets the specified value to the {@code rows_per_layer} field. */
        public SDL_GPUTextureTransferInfo.Buffer rows_per_layer(@NativeType("Uint32") int value) { SDL_GPUTextureTransferInfo.nrows_per_layer(address(), value); return this; }

    }

}
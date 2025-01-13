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
 * struct SDL_PixelFormatDetails {
 *     SDL_PixelFormat format;
 *     Uint8 bits_per_pixel;
 *     Uint8 bytes_per_pixel;
 *     Uint8 padding[2];
 *     Uint32 Rmask;
 *     Uint32 Gmask;
 *     Uint32 Bmask;
 *     Uint32 Amask;
 *     Uint8 Rbits;
 *     Uint8 Gbits;
 *     Uint8 Bbits;
 *     Uint8 Abits;
 *     Uint8 Rshift;
 *     Uint8 Gshift;
 *     Uint8 Bshift;
 *     Uint8 Ashift;
 * }}</pre>
 */
public class SDL_PixelFormatDetails extends Struct<SDL_PixelFormatDetails> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        BITS_PER_PIXEL,
        BYTES_PER_PIXEL,
        PADDING,
        RMASK,
        GMASK,
        BMASK,
        AMASK,
        RBITS,
        GBITS,
        BBITS,
        ABITS,
        RSHIFT,
        GSHIFT,
        BSHIFT,
        ASHIFT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(1),
            __array(1, 2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        BITS_PER_PIXEL = layout.offsetof(1);
        BYTES_PER_PIXEL = layout.offsetof(2);
        PADDING = layout.offsetof(3);
        RMASK = layout.offsetof(4);
        GMASK = layout.offsetof(5);
        BMASK = layout.offsetof(6);
        AMASK = layout.offsetof(7);
        RBITS = layout.offsetof(8);
        GBITS = layout.offsetof(9);
        BBITS = layout.offsetof(10);
        ABITS = layout.offsetof(11);
        RSHIFT = layout.offsetof(12);
        GSHIFT = layout.offsetof(13);
        BSHIFT = layout.offsetof(14);
        ASHIFT = layout.offsetof(15);
    }

    protected SDL_PixelFormatDetails(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_PixelFormatDetails create(long address, @Nullable ByteBuffer container) {
        return new SDL_PixelFormatDetails(address, container);
    }

    /**
     * Creates a {@code SDL_PixelFormatDetails} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_PixelFormatDetails(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code format} field. */
    @NativeType("SDL_PixelFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code bits_per_pixel} field. */
    @NativeType("Uint8")
    public byte bits_per_pixel() { return nbits_per_pixel(address()); }
    /** @return the value of the {@code bytes_per_pixel} field. */
    @NativeType("Uint8")
    public byte bytes_per_pixel() { return nbytes_per_pixel(address()); }
    /** @return a {@link ByteBuffer} view of the {@code padding} field. */
    @NativeType("Uint8[2]")
    public ByteBuffer padding() { return npadding(address()); }
    /** @return the value at the specified index of the {@code padding} field. */
    @NativeType("Uint8")
    public byte padding(int index) { return npadding(address(), index); }
    /** @return the value of the {@code Rmask} field. */
    @NativeType("Uint32")
    public int Rmask() { return nRmask(address()); }
    /** @return the value of the {@code Gmask} field. */
    @NativeType("Uint32")
    public int Gmask() { return nGmask(address()); }
    /** @return the value of the {@code Bmask} field. */
    @NativeType("Uint32")
    public int Bmask() { return nBmask(address()); }
    /** @return the value of the {@code Amask} field. */
    @NativeType("Uint32")
    public int Amask() { return nAmask(address()); }
    /** @return the value of the {@code Rbits} field. */
    @NativeType("Uint8")
    public byte Rbits() { return nRbits(address()); }
    /** @return the value of the {@code Gbits} field. */
    @NativeType("Uint8")
    public byte Gbits() { return nGbits(address()); }
    /** @return the value of the {@code Bbits} field. */
    @NativeType("Uint8")
    public byte Bbits() { return nBbits(address()); }
    /** @return the value of the {@code Abits} field. */
    @NativeType("Uint8")
    public byte Abits() { return nAbits(address()); }
    /** @return the value of the {@code Rshift} field. */
    @NativeType("Uint8")
    public byte Rshift() { return nRshift(address()); }
    /** @return the value of the {@code Gshift} field. */
    @NativeType("Uint8")
    public byte Gshift() { return nGshift(address()); }
    /** @return the value of the {@code Bshift} field. */
    @NativeType("Uint8")
    public byte Bshift() { return nBshift(address()); }
    /** @return the value of the {@code Ashift} field. */
    @NativeType("Uint8")
    public byte Ashift() { return nAshift(address()); }

    /** Sets the specified value to the {@code format} field. */
    public SDL_PixelFormatDetails format(@NativeType("SDL_PixelFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code bits_per_pixel} field. */
    public SDL_PixelFormatDetails bits_per_pixel(@NativeType("Uint8") byte value) { nbits_per_pixel(address(), value); return this; }
    /** Sets the specified value to the {@code bytes_per_pixel} field. */
    public SDL_PixelFormatDetails bytes_per_pixel(@NativeType("Uint8") byte value) { nbytes_per_pixel(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code padding} field. */
    public SDL_PixelFormatDetails padding(@NativeType("Uint8[2]") ByteBuffer value) { npadding(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code padding} field. */
    public SDL_PixelFormatDetails padding(int index, @NativeType("Uint8") byte value) { npadding(address(), index, value); return this; }
    /** Sets the specified value to the {@code Rmask} field. */
    public SDL_PixelFormatDetails Rmask(@NativeType("Uint32") int value) { nRmask(address(), value); return this; }
    /** Sets the specified value to the {@code Gmask} field. */
    public SDL_PixelFormatDetails Gmask(@NativeType("Uint32") int value) { nGmask(address(), value); return this; }
    /** Sets the specified value to the {@code Bmask} field. */
    public SDL_PixelFormatDetails Bmask(@NativeType("Uint32") int value) { nBmask(address(), value); return this; }
    /** Sets the specified value to the {@code Amask} field. */
    public SDL_PixelFormatDetails Amask(@NativeType("Uint32") int value) { nAmask(address(), value); return this; }
    /** Sets the specified value to the {@code Rbits} field. */
    public SDL_PixelFormatDetails Rbits(@NativeType("Uint8") byte value) { nRbits(address(), value); return this; }
    /** Sets the specified value to the {@code Gbits} field. */
    public SDL_PixelFormatDetails Gbits(@NativeType("Uint8") byte value) { nGbits(address(), value); return this; }
    /** Sets the specified value to the {@code Bbits} field. */
    public SDL_PixelFormatDetails Bbits(@NativeType("Uint8") byte value) { nBbits(address(), value); return this; }
    /** Sets the specified value to the {@code Abits} field. */
    public SDL_PixelFormatDetails Abits(@NativeType("Uint8") byte value) { nAbits(address(), value); return this; }
    /** Sets the specified value to the {@code Rshift} field. */
    public SDL_PixelFormatDetails Rshift(@NativeType("Uint8") byte value) { nRshift(address(), value); return this; }
    /** Sets the specified value to the {@code Gshift} field. */
    public SDL_PixelFormatDetails Gshift(@NativeType("Uint8") byte value) { nGshift(address(), value); return this; }
    /** Sets the specified value to the {@code Bshift} field. */
    public SDL_PixelFormatDetails Bshift(@NativeType("Uint8") byte value) { nBshift(address(), value); return this; }
    /** Sets the specified value to the {@code Ashift} field. */
    public SDL_PixelFormatDetails Ashift(@NativeType("Uint8") byte value) { nAshift(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_PixelFormatDetails set(
        int format,
        byte bits_per_pixel,
        byte bytes_per_pixel,
        ByteBuffer padding,
        int Rmask,
        int Gmask,
        int Bmask,
        int Amask,
        byte Rbits,
        byte Gbits,
        byte Bbits,
        byte Abits,
        byte Rshift,
        byte Gshift,
        byte Bshift,
        byte Ashift
    ) {
        format(format);
        bits_per_pixel(bits_per_pixel);
        bytes_per_pixel(bytes_per_pixel);
        padding(padding);
        Rmask(Rmask);
        Gmask(Gmask);
        Bmask(Bmask);
        Amask(Amask);
        Rbits(Rbits);
        Gbits(Gbits);
        Bbits(Bbits);
        Abits(Abits);
        Rshift(Rshift);
        Gshift(Gshift);
        Bshift(Bshift);
        Ashift(Ashift);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_PixelFormatDetails set(SDL_PixelFormatDetails src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_PixelFormatDetails} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_PixelFormatDetails malloc() {
        return new SDL_PixelFormatDetails(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_PixelFormatDetails} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_PixelFormatDetails calloc() {
        return new SDL_PixelFormatDetails(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_PixelFormatDetails} instance allocated with {@link BufferUtils}. */
    public static SDL_PixelFormatDetails create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_PixelFormatDetails(memAddress(container), container);
    }

    /** Returns a new {@code SDL_PixelFormatDetails} instance for the specified memory address. */
    public static SDL_PixelFormatDetails create(long address) {
        return new SDL_PixelFormatDetails(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_PixelFormatDetails createSafe(long address) {
        return address == NULL ? null : new SDL_PixelFormatDetails(address, null);
    }

    /**
     * Returns a new {@link SDL_PixelFormatDetails.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PixelFormatDetails.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_PixelFormatDetails.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PixelFormatDetails.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PixelFormatDetails.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PixelFormatDetails.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_PixelFormatDetails.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_PixelFormatDetails.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_PixelFormatDetails.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_PixelFormatDetails} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PixelFormatDetails malloc(MemoryStack stack) {
        return new SDL_PixelFormatDetails(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_PixelFormatDetails} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PixelFormatDetails calloc(MemoryStack stack) {
        return new SDL_PixelFormatDetails(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_PixelFormatDetails.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PixelFormatDetails.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PixelFormatDetails.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PixelFormatDetails.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_PixelFormatDetails.FORMAT); }
    /** Unsafe version of {@link #bits_per_pixel}. */
    public static byte nbits_per_pixel(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.BITS_PER_PIXEL); }
    /** Unsafe version of {@link #bytes_per_pixel}. */
    public static byte nbytes_per_pixel(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.BYTES_PER_PIXEL); }
    /** Unsafe version of {@link #padding}. */
    public static ByteBuffer npadding(long struct) { return memByteBuffer(struct + SDL_PixelFormatDetails.PADDING, 2); }
    /** Unsafe version of {@link #padding(int) padding}. */
    public static byte npadding(long struct, int index) {
        return memGetByte(struct + SDL_PixelFormatDetails.PADDING + check(index, 2) * 1);
    }
    /** Unsafe version of {@link #Rmask}. */
    public static int nRmask(long struct) { return memGetInt(struct + SDL_PixelFormatDetails.RMASK); }
    /** Unsafe version of {@link #Gmask}. */
    public static int nGmask(long struct) { return memGetInt(struct + SDL_PixelFormatDetails.GMASK); }
    /** Unsafe version of {@link #Bmask}. */
    public static int nBmask(long struct) { return memGetInt(struct + SDL_PixelFormatDetails.BMASK); }
    /** Unsafe version of {@link #Amask}. */
    public static int nAmask(long struct) { return memGetInt(struct + SDL_PixelFormatDetails.AMASK); }
    /** Unsafe version of {@link #Rbits}. */
    public static byte nRbits(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.RBITS); }
    /** Unsafe version of {@link #Gbits}. */
    public static byte nGbits(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.GBITS); }
    /** Unsafe version of {@link #Bbits}. */
    public static byte nBbits(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.BBITS); }
    /** Unsafe version of {@link #Abits}. */
    public static byte nAbits(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.ABITS); }
    /** Unsafe version of {@link #Rshift}. */
    public static byte nRshift(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.RSHIFT); }
    /** Unsafe version of {@link #Gshift}. */
    public static byte nGshift(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.GSHIFT); }
    /** Unsafe version of {@link #Bshift}. */
    public static byte nBshift(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.BSHIFT); }
    /** Unsafe version of {@link #Ashift}. */
    public static byte nAshift(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.ASHIFT); }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_PixelFormatDetails.FORMAT, value); }
    /** Unsafe version of {@link #bits_per_pixel(byte) bits_per_pixel}. */
    public static void nbits_per_pixel(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.BITS_PER_PIXEL, value); }
    /** Unsafe version of {@link #bytes_per_pixel(byte) bytes_per_pixel}. */
    public static void nbytes_per_pixel(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.BYTES_PER_PIXEL, value); }
    /** Unsafe version of {@link #padding(ByteBuffer) padding}. */
    public static void npadding(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + SDL_PixelFormatDetails.PADDING, value.remaining() * 1);
    }
    /** Unsafe version of {@link #padding(int, byte) padding}. */
    public static void npadding(long struct, int index, byte value) {
        memPutByte(struct + SDL_PixelFormatDetails.PADDING + check(index, 2) * 1, value);
    }
    /** Unsafe version of {@link #Rmask(int) Rmask}. */
    public static void nRmask(long struct, int value) { memPutInt(struct + SDL_PixelFormatDetails.RMASK, value); }
    /** Unsafe version of {@link #Gmask(int) Gmask}. */
    public static void nGmask(long struct, int value) { memPutInt(struct + SDL_PixelFormatDetails.GMASK, value); }
    /** Unsafe version of {@link #Bmask(int) Bmask}. */
    public static void nBmask(long struct, int value) { memPutInt(struct + SDL_PixelFormatDetails.BMASK, value); }
    /** Unsafe version of {@link #Amask(int) Amask}. */
    public static void nAmask(long struct, int value) { memPutInt(struct + SDL_PixelFormatDetails.AMASK, value); }
    /** Unsafe version of {@link #Rbits(byte) Rbits}. */
    public static void nRbits(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.RBITS, value); }
    /** Unsafe version of {@link #Gbits(byte) Gbits}. */
    public static void nGbits(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.GBITS, value); }
    /** Unsafe version of {@link #Bbits(byte) Bbits}. */
    public static void nBbits(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.BBITS, value); }
    /** Unsafe version of {@link #Abits(byte) Abits}. */
    public static void nAbits(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.ABITS, value); }
    /** Unsafe version of {@link #Rshift(byte) Rshift}. */
    public static void nRshift(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.RSHIFT, value); }
    /** Unsafe version of {@link #Gshift(byte) Gshift}. */
    public static void nGshift(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.GSHIFT, value); }
    /** Unsafe version of {@link #Bshift(byte) Bshift}. */
    public static void nBshift(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.BSHIFT, value); }
    /** Unsafe version of {@link #Ashift(byte) Ashift}. */
    public static void nAshift(long struct, byte value) { memPutByte(struct + SDL_PixelFormatDetails.ASHIFT, value); }

    // -----------------------------------

    /** An array of {@link SDL_PixelFormatDetails} structs. */
    public static class Buffer extends StructBuffer<SDL_PixelFormatDetails, Buffer> implements NativeResource {

        private static final SDL_PixelFormatDetails ELEMENT_FACTORY = SDL_PixelFormatDetails.create(-1L);

        /**
         * Creates a new {@code SDL_PixelFormatDetails.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_PixelFormatDetails#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_PixelFormatDetails getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code format} field. */
        @NativeType("SDL_PixelFormat")
        public int format() { return SDL_PixelFormatDetails.nformat(address()); }
        /** @return the value of the {@code bits_per_pixel} field. */
        @NativeType("Uint8")
        public byte bits_per_pixel() { return SDL_PixelFormatDetails.nbits_per_pixel(address()); }
        /** @return the value of the {@code bytes_per_pixel} field. */
        @NativeType("Uint8")
        public byte bytes_per_pixel() { return SDL_PixelFormatDetails.nbytes_per_pixel(address()); }
        /** @return a {@link ByteBuffer} view of the {@code padding} field. */
        @NativeType("Uint8[2]")
        public ByteBuffer padding() { return SDL_PixelFormatDetails.npadding(address()); }
        /** @return the value at the specified index of the {@code padding} field. */
        @NativeType("Uint8")
        public byte padding(int index) { return SDL_PixelFormatDetails.npadding(address(), index); }
        /** @return the value of the {@code Rmask} field. */
        @NativeType("Uint32")
        public int Rmask() { return SDL_PixelFormatDetails.nRmask(address()); }
        /** @return the value of the {@code Gmask} field. */
        @NativeType("Uint32")
        public int Gmask() { return SDL_PixelFormatDetails.nGmask(address()); }
        /** @return the value of the {@code Bmask} field. */
        @NativeType("Uint32")
        public int Bmask() { return SDL_PixelFormatDetails.nBmask(address()); }
        /** @return the value of the {@code Amask} field. */
        @NativeType("Uint32")
        public int Amask() { return SDL_PixelFormatDetails.nAmask(address()); }
        /** @return the value of the {@code Rbits} field. */
        @NativeType("Uint8")
        public byte Rbits() { return SDL_PixelFormatDetails.nRbits(address()); }
        /** @return the value of the {@code Gbits} field. */
        @NativeType("Uint8")
        public byte Gbits() { return SDL_PixelFormatDetails.nGbits(address()); }
        /** @return the value of the {@code Bbits} field. */
        @NativeType("Uint8")
        public byte Bbits() { return SDL_PixelFormatDetails.nBbits(address()); }
        /** @return the value of the {@code Abits} field. */
        @NativeType("Uint8")
        public byte Abits() { return SDL_PixelFormatDetails.nAbits(address()); }
        /** @return the value of the {@code Rshift} field. */
        @NativeType("Uint8")
        public byte Rshift() { return SDL_PixelFormatDetails.nRshift(address()); }
        /** @return the value of the {@code Gshift} field. */
        @NativeType("Uint8")
        public byte Gshift() { return SDL_PixelFormatDetails.nGshift(address()); }
        /** @return the value of the {@code Bshift} field. */
        @NativeType("Uint8")
        public byte Bshift() { return SDL_PixelFormatDetails.nBshift(address()); }
        /** @return the value of the {@code Ashift} field. */
        @NativeType("Uint8")
        public byte Ashift() { return SDL_PixelFormatDetails.nAshift(address()); }

        /** Sets the specified value to the {@code format} field. */
        public SDL_PixelFormatDetails.Buffer format(@NativeType("SDL_PixelFormat") int value) { SDL_PixelFormatDetails.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code bits_per_pixel} field. */
        public SDL_PixelFormatDetails.Buffer bits_per_pixel(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nbits_per_pixel(address(), value); return this; }
        /** Sets the specified value to the {@code bytes_per_pixel} field. */
        public SDL_PixelFormatDetails.Buffer bytes_per_pixel(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nbytes_per_pixel(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code padding} field. */
        public SDL_PixelFormatDetails.Buffer padding(@NativeType("Uint8[2]") ByteBuffer value) { SDL_PixelFormatDetails.npadding(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code padding} field. */
        public SDL_PixelFormatDetails.Buffer padding(int index, @NativeType("Uint8") byte value) { SDL_PixelFormatDetails.npadding(address(), index, value); return this; }
        /** Sets the specified value to the {@code Rmask} field. */
        public SDL_PixelFormatDetails.Buffer Rmask(@NativeType("Uint32") int value) { SDL_PixelFormatDetails.nRmask(address(), value); return this; }
        /** Sets the specified value to the {@code Gmask} field. */
        public SDL_PixelFormatDetails.Buffer Gmask(@NativeType("Uint32") int value) { SDL_PixelFormatDetails.nGmask(address(), value); return this; }
        /** Sets the specified value to the {@code Bmask} field. */
        public SDL_PixelFormatDetails.Buffer Bmask(@NativeType("Uint32") int value) { SDL_PixelFormatDetails.nBmask(address(), value); return this; }
        /** Sets the specified value to the {@code Amask} field. */
        public SDL_PixelFormatDetails.Buffer Amask(@NativeType("Uint32") int value) { SDL_PixelFormatDetails.nAmask(address(), value); return this; }
        /** Sets the specified value to the {@code Rbits} field. */
        public SDL_PixelFormatDetails.Buffer Rbits(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nRbits(address(), value); return this; }
        /** Sets the specified value to the {@code Gbits} field. */
        public SDL_PixelFormatDetails.Buffer Gbits(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nGbits(address(), value); return this; }
        /** Sets the specified value to the {@code Bbits} field. */
        public SDL_PixelFormatDetails.Buffer Bbits(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nBbits(address(), value); return this; }
        /** Sets the specified value to the {@code Abits} field. */
        public SDL_PixelFormatDetails.Buffer Abits(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nAbits(address(), value); return this; }
        /** Sets the specified value to the {@code Rshift} field. */
        public SDL_PixelFormatDetails.Buffer Rshift(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nRshift(address(), value); return this; }
        /** Sets the specified value to the {@code Gshift} field. */
        public SDL_PixelFormatDetails.Buffer Gshift(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nGshift(address(), value); return this; }
        /** Sets the specified value to the {@code Bshift} field. */
        public SDL_PixelFormatDetails.Buffer Bshift(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nBshift(address(), value); return this; }
        /** Sets the specified value to the {@code Ashift} field. */
        public SDL_PixelFormatDetails.Buffer Ashift(@NativeType("Uint8") byte value) { SDL_PixelFormatDetails.nAshift(address(), value); return this; }

    }

}
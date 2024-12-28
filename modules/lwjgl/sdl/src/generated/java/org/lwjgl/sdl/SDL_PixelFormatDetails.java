/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

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
public class SDL_PixelFormatDetails extends Struct<SDL_PixelFormatDetails> {

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

    // -----------------------------------

    /** Returns a new {@code SDL_PixelFormatDetails} instance for the specified memory address. */
    public static SDL_PixelFormatDetails create(long address) {
        return new SDL_PixelFormatDetails(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_PixelFormatDetails createSafe(long address) {
        return address == NULL ? null : new SDL_PixelFormatDetails(address, null);
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

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_PixelFormatDetails.FORMAT); }
    /** Unsafe version of {@link #bits_per_pixel}. */
    public static byte nbits_per_pixel(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.BITS_PER_PIXEL); }
    /** Unsafe version of {@link #bytes_per_pixel}. */
    public static byte nbytes_per_pixel(long struct) { return memGetByte(struct + SDL_PixelFormatDetails.BYTES_PER_PIXEL); }
    public static ByteBuffer npadding(long struct) { return memByteBuffer(struct + SDL_PixelFormatDetails.PADDING, 2); }
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

    // -----------------------------------

    /** An array of {@link SDL_PixelFormatDetails} structs. */
    public static class Buffer extends StructBuffer<SDL_PixelFormatDetails, Buffer> {

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

    }

}
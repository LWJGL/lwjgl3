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
 * struct SDL_DisplayMode {
 *     SDL_DisplayID displayID;
 *     SDL_PixelFormat format;
 *     int w;
 *     int h;
 *     float pixel_density;
 *     float refresh_rate;
 *     int refresh_rate_numerator;
 *     int refresh_rate_denominator;
 *     SDL_DisplayModeData * internal;
 * }}</pre>
 */
public class SDL_DisplayMode extends Struct<SDL_DisplayMode> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DISPLAYID,
        FORMAT,
        W,
        H,
        PIXEL_DENSITY,
        REFRESH_RATE,
        REFRESH_RATE_NUMERATOR,
        REFRESH_RATE_DENOMINATOR,
        INTERNAL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DISPLAYID = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
        PIXEL_DENSITY = layout.offsetof(4);
        REFRESH_RATE = layout.offsetof(5);
        REFRESH_RATE_NUMERATOR = layout.offsetof(6);
        REFRESH_RATE_DENOMINATOR = layout.offsetof(7);
        INTERNAL = layout.offsetof(8);
    }

    protected SDL_DisplayMode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_DisplayMode create(long address, @Nullable ByteBuffer container) {
        return new SDL_DisplayMode(address, container);
    }

    /**
     * Creates a {@code SDL_DisplayMode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_DisplayMode(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code displayID} field. */
    @NativeType("SDL_DisplayID")
    public int displayID() { return ndisplayID(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("SDL_PixelFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code w} field. */
    public int w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public int h() { return nh(address()); }
    /** @return the value of the {@code pixel_density} field. */
    public float pixel_density() { return npixel_density(address()); }
    /** @return the value of the {@code refresh_rate} field. */
    public float refresh_rate() { return nrefresh_rate(address()); }
    /** @return the value of the {@code refresh_rate_numerator} field. */
    public int refresh_rate_numerator() { return nrefresh_rate_numerator(address()); }
    /** @return the value of the {@code refresh_rate_denominator} field. */
    public int refresh_rate_denominator() { return nrefresh_rate_denominator(address()); }
    /** @return the value of the {@code internal} field. */
    @NativeType("SDL_DisplayModeData *")
    public long internal() { return ninternal(address()); }

    /** Sets the specified value to the {@code displayID} field. */
    public SDL_DisplayMode displayID(@NativeType("SDL_DisplayID") int value) { ndisplayID(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SDL_DisplayMode format(@NativeType("SDL_PixelFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public SDL_DisplayMode w(int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public SDL_DisplayMode h(int value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code pixel_density} field. */
    public SDL_DisplayMode pixel_density(float value) { npixel_density(address(), value); return this; }
    /** Sets the specified value to the {@code refresh_rate} field. */
    public SDL_DisplayMode refresh_rate(float value) { nrefresh_rate(address(), value); return this; }
    /** Sets the specified value to the {@code refresh_rate_numerator} field. */
    public SDL_DisplayMode refresh_rate_numerator(int value) { nrefresh_rate_numerator(address(), value); return this; }
    /** Sets the specified value to the {@code refresh_rate_denominator} field. */
    public SDL_DisplayMode refresh_rate_denominator(int value) { nrefresh_rate_denominator(address(), value); return this; }
    /** Sets the specified value to the {@code internal} field. */
    public SDL_DisplayMode internal(@NativeType("SDL_DisplayModeData *") long value) { ninternal(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_DisplayMode set(
        int displayID,
        int format,
        int w,
        int h,
        float pixel_density,
        float refresh_rate,
        int refresh_rate_numerator,
        int refresh_rate_denominator,
        long internal
    ) {
        displayID(displayID);
        format(format);
        w(w);
        h(h);
        pixel_density(pixel_density);
        refresh_rate(refresh_rate);
        refresh_rate_numerator(refresh_rate_numerator);
        refresh_rate_denominator(refresh_rate_denominator);
        internal(internal);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_DisplayMode set(SDL_DisplayMode src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_DisplayMode} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_DisplayMode malloc() {
        return new SDL_DisplayMode(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_DisplayMode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_DisplayMode calloc() {
        return new SDL_DisplayMode(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_DisplayMode} instance allocated with {@link BufferUtils}. */
    public static SDL_DisplayMode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DisplayMode(memAddress(container), container);
    }

    /** Returns a new {@code SDL_DisplayMode} instance for the specified memory address. */
    public static SDL_DisplayMode create(long address) {
        return new SDL_DisplayMode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_DisplayMode createSafe(long address) {
        return address == NULL ? null : new SDL_DisplayMode(address, null);
    }

    /**
     * Returns a new {@link SDL_DisplayMode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayMode.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_DisplayMode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayMode.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DisplayMode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayMode.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_DisplayMode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayMode.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_DisplayMode.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_DisplayMode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DisplayMode malloc(MemoryStack stack) {
        return new SDL_DisplayMode(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_DisplayMode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DisplayMode calloc(MemoryStack stack) {
        return new SDL_DisplayMode(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_DisplayMode.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayMode.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DisplayMode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayMode.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #displayID}. */
    public static int ndisplayID(long struct) { return memGetInt(struct + SDL_DisplayMode.DISPLAYID); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_DisplayMode.FORMAT); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + SDL_DisplayMode.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return memGetInt(struct + SDL_DisplayMode.H); }
    /** Unsafe version of {@link #pixel_density}. */
    public static float npixel_density(long struct) { return memGetFloat(struct + SDL_DisplayMode.PIXEL_DENSITY); }
    /** Unsafe version of {@link #refresh_rate}. */
    public static float nrefresh_rate(long struct) { return memGetFloat(struct + SDL_DisplayMode.REFRESH_RATE); }
    /** Unsafe version of {@link #refresh_rate_numerator}. */
    public static int nrefresh_rate_numerator(long struct) { return memGetInt(struct + SDL_DisplayMode.REFRESH_RATE_NUMERATOR); }
    /** Unsafe version of {@link #refresh_rate_denominator}. */
    public static int nrefresh_rate_denominator(long struct) { return memGetInt(struct + SDL_DisplayMode.REFRESH_RATE_DENOMINATOR); }
    /** Unsafe version of {@link #internal}. */
    public static long ninternal(long struct) { return memGetAddress(struct + SDL_DisplayMode.INTERNAL); }

    /** Unsafe version of {@link #displayID(int) displayID}. */
    public static void ndisplayID(long struct, int value) { memPutInt(struct + SDL_DisplayMode.DISPLAYID, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_DisplayMode.FORMAT, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + SDL_DisplayMode.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { memPutInt(struct + SDL_DisplayMode.H, value); }
    /** Unsafe version of {@link #pixel_density(float) pixel_density}. */
    public static void npixel_density(long struct, float value) { memPutFloat(struct + SDL_DisplayMode.PIXEL_DENSITY, value); }
    /** Unsafe version of {@link #refresh_rate(float) refresh_rate}. */
    public static void nrefresh_rate(long struct, float value) { memPutFloat(struct + SDL_DisplayMode.REFRESH_RATE, value); }
    /** Unsafe version of {@link #refresh_rate_numerator(int) refresh_rate_numerator}. */
    public static void nrefresh_rate_numerator(long struct, int value) { memPutInt(struct + SDL_DisplayMode.REFRESH_RATE_NUMERATOR, value); }
    /** Unsafe version of {@link #refresh_rate_denominator(int) refresh_rate_denominator}. */
    public static void nrefresh_rate_denominator(long struct, int value) { memPutInt(struct + SDL_DisplayMode.REFRESH_RATE_DENOMINATOR, value); }
    /** Unsafe version of {@link #internal(long) internal}. */
    public static void ninternal(long struct, long value) { memPutAddress(struct + SDL_DisplayMode.INTERNAL, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_DisplayMode.INTERNAL));
    }

    // -----------------------------------

    /** An array of {@link SDL_DisplayMode} structs. */
    public static class Buffer extends StructBuffer<SDL_DisplayMode, Buffer> implements NativeResource {

        private static final SDL_DisplayMode ELEMENT_FACTORY = SDL_DisplayMode.create(-1L);

        /**
         * Creates a new {@code SDL_DisplayMode.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_DisplayMode#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_DisplayMode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code displayID} field. */
        @NativeType("SDL_DisplayID")
        public int displayID() { return SDL_DisplayMode.ndisplayID(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("SDL_PixelFormat")
        public int format() { return SDL_DisplayMode.nformat(address()); }
        /** @return the value of the {@code w} field. */
        public int w() { return SDL_DisplayMode.nw(address()); }
        /** @return the value of the {@code h} field. */
        public int h() { return SDL_DisplayMode.nh(address()); }
        /** @return the value of the {@code pixel_density} field. */
        public float pixel_density() { return SDL_DisplayMode.npixel_density(address()); }
        /** @return the value of the {@code refresh_rate} field. */
        public float refresh_rate() { return SDL_DisplayMode.nrefresh_rate(address()); }
        /** @return the value of the {@code refresh_rate_numerator} field. */
        public int refresh_rate_numerator() { return SDL_DisplayMode.nrefresh_rate_numerator(address()); }
        /** @return the value of the {@code refresh_rate_denominator} field. */
        public int refresh_rate_denominator() { return SDL_DisplayMode.nrefresh_rate_denominator(address()); }
        /** @return the value of the {@code internal} field. */
        @NativeType("SDL_DisplayModeData *")
        public long internal() { return SDL_DisplayMode.ninternal(address()); }

        /** Sets the specified value to the {@code displayID} field. */
        public SDL_DisplayMode.Buffer displayID(@NativeType("SDL_DisplayID") int value) { SDL_DisplayMode.ndisplayID(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SDL_DisplayMode.Buffer format(@NativeType("SDL_PixelFormat") int value) { SDL_DisplayMode.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public SDL_DisplayMode.Buffer w(int value) { SDL_DisplayMode.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public SDL_DisplayMode.Buffer h(int value) { SDL_DisplayMode.nh(address(), value); return this; }
        /** Sets the specified value to the {@code pixel_density} field. */
        public SDL_DisplayMode.Buffer pixel_density(float value) { SDL_DisplayMode.npixel_density(address(), value); return this; }
        /** Sets the specified value to the {@code refresh_rate} field. */
        public SDL_DisplayMode.Buffer refresh_rate(float value) { SDL_DisplayMode.nrefresh_rate(address(), value); return this; }
        /** Sets the specified value to the {@code refresh_rate_numerator} field. */
        public SDL_DisplayMode.Buffer refresh_rate_numerator(int value) { SDL_DisplayMode.nrefresh_rate_numerator(address(), value); return this; }
        /** Sets the specified value to the {@code refresh_rate_denominator} field. */
        public SDL_DisplayMode.Buffer refresh_rate_denominator(int value) { SDL_DisplayMode.nrefresh_rate_denominator(address(), value); return this; }
        /** Sets the specified value to the {@code internal} field. */
        public SDL_DisplayMode.Buffer internal(@NativeType("SDL_DisplayModeData *") long value) { SDL_DisplayMode.ninternal(address(), value); return this; }

    }

}
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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_CameraSpec {
 *     SDL_PixelFormat format;
 *     SDL_Colorspace colorspace;
 *     int width;
 *     int height;
 *     int framerate_numerator;
 *     int framerate_denominator;
 * }}</pre>
 */
public class SDL_CameraSpec extends Struct<SDL_CameraSpec> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        COLORSPACE,
        WIDTH,
        HEIGHT,
        FRAMERATE_NUMERATOR,
        FRAMERATE_DENOMINATOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        COLORSPACE = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        FRAMERATE_NUMERATOR = layout.offsetof(4);
        FRAMERATE_DENOMINATOR = layout.offsetof(5);
    }

    protected SDL_CameraSpec(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_CameraSpec create(long address, @Nullable ByteBuffer container) {
        return new SDL_CameraSpec(address, container);
    }

    /**
     * Creates a {@code SDL_CameraSpec} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_CameraSpec(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code format} field. */
    @NativeType("SDL_PixelFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code colorspace} field. */
    @NativeType("SDL_Colorspace")
    public int colorspace() { return ncolorspace(address()); }
    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** @return the value of the {@code framerate_numerator} field. */
    public int framerate_numerator() { return nframerate_numerator(address()); }
    /** @return the value of the {@code framerate_denominator} field. */
    public int framerate_denominator() { return nframerate_denominator(address()); }

    /** Sets the specified value to the {@code format} field. */
    public SDL_CameraSpec format(@NativeType("SDL_PixelFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code colorspace} field. */
    public SDL_CameraSpec colorspace(@NativeType("SDL_Colorspace") int value) { ncolorspace(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public SDL_CameraSpec width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public SDL_CameraSpec height(int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code framerate_numerator} field. */
    public SDL_CameraSpec framerate_numerator(int value) { nframerate_numerator(address(), value); return this; }
    /** Sets the specified value to the {@code framerate_denominator} field. */
    public SDL_CameraSpec framerate_denominator(int value) { nframerate_denominator(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_CameraSpec set(
        int format,
        int colorspace,
        int width,
        int height,
        int framerate_numerator,
        int framerate_denominator
    ) {
        format(format);
        colorspace(colorspace);
        width(width);
        height(height);
        framerate_numerator(framerate_numerator);
        framerate_denominator(framerate_denominator);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_CameraSpec set(SDL_CameraSpec src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_CameraSpec} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_CameraSpec malloc() {
        return new SDL_CameraSpec(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_CameraSpec} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_CameraSpec calloc() {
        return new SDL_CameraSpec(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_CameraSpec} instance allocated with {@link BufferUtils}. */
    public static SDL_CameraSpec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_CameraSpec(memAddress(container), container);
    }

    /** Returns a new {@code SDL_CameraSpec} instance for the specified memory address. */
    public static SDL_CameraSpec create(long address) {
        return new SDL_CameraSpec(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_CameraSpec createSafe(long address) {
        return address == NULL ? null : new SDL_CameraSpec(address, null);
    }

    /**
     * Returns a new {@link SDL_CameraSpec.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_CameraSpec.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_CameraSpec.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_CameraSpec.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_CameraSpec.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_CameraSpec.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_CameraSpec.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_CameraSpec.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_CameraSpec.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_CameraSpec} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_CameraSpec malloc(MemoryStack stack) {
        return new SDL_CameraSpec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_CameraSpec} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_CameraSpec calloc(MemoryStack stack) {
        return new SDL_CameraSpec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_CameraSpec.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_CameraSpec.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_CameraSpec.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_CameraSpec.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_CameraSpec.FORMAT); }
    /** Unsafe version of {@link #colorspace}. */
    public static int ncolorspace(long struct) { return memGetInt(struct + SDL_CameraSpec.COLORSPACE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + SDL_CameraSpec.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + SDL_CameraSpec.HEIGHT); }
    /** Unsafe version of {@link #framerate_numerator}. */
    public static int nframerate_numerator(long struct) { return memGetInt(struct + SDL_CameraSpec.FRAMERATE_NUMERATOR); }
    /** Unsafe version of {@link #framerate_denominator}. */
    public static int nframerate_denominator(long struct) { return memGetInt(struct + SDL_CameraSpec.FRAMERATE_DENOMINATOR); }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_CameraSpec.FORMAT, value); }
    /** Unsafe version of {@link #colorspace(int) colorspace}. */
    public static void ncolorspace(long struct, int value) { memPutInt(struct + SDL_CameraSpec.COLORSPACE, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + SDL_CameraSpec.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + SDL_CameraSpec.HEIGHT, value); }
    /** Unsafe version of {@link #framerate_numerator(int) framerate_numerator}. */
    public static void nframerate_numerator(long struct, int value) { memPutInt(struct + SDL_CameraSpec.FRAMERATE_NUMERATOR, value); }
    /** Unsafe version of {@link #framerate_denominator(int) framerate_denominator}. */
    public static void nframerate_denominator(long struct, int value) { memPutInt(struct + SDL_CameraSpec.FRAMERATE_DENOMINATOR, value); }

    // -----------------------------------

    /** An array of {@link SDL_CameraSpec} structs. */
    public static class Buffer extends StructBuffer<SDL_CameraSpec, Buffer> implements NativeResource {

        private static final SDL_CameraSpec ELEMENT_FACTORY = SDL_CameraSpec.create(-1L);

        /**
         * Creates a new {@code SDL_CameraSpec.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_CameraSpec#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_CameraSpec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code format} field. */
        @NativeType("SDL_PixelFormat")
        public int format() { return SDL_CameraSpec.nformat(address()); }
        /** @return the value of the {@code colorspace} field. */
        @NativeType("SDL_Colorspace")
        public int colorspace() { return SDL_CameraSpec.ncolorspace(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return SDL_CameraSpec.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return SDL_CameraSpec.nheight(address()); }
        /** @return the value of the {@code framerate_numerator} field. */
        public int framerate_numerator() { return SDL_CameraSpec.nframerate_numerator(address()); }
        /** @return the value of the {@code framerate_denominator} field. */
        public int framerate_denominator() { return SDL_CameraSpec.nframerate_denominator(address()); }

        /** Sets the specified value to the {@code format} field. */
        public SDL_CameraSpec.Buffer format(@NativeType("SDL_PixelFormat") int value) { SDL_CameraSpec.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code colorspace} field. */
        public SDL_CameraSpec.Buffer colorspace(@NativeType("SDL_Colorspace") int value) { SDL_CameraSpec.ncolorspace(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public SDL_CameraSpec.Buffer width(int value) { SDL_CameraSpec.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public SDL_CameraSpec.Buffer height(int value) { SDL_CameraSpec.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code framerate_numerator} field. */
        public SDL_CameraSpec.Buffer framerate_numerator(int value) { SDL_CameraSpec.nframerate_numerator(address(), value); return this; }
        /** Sets the specified value to the {@code framerate_denominator} field. */
        public SDL_CameraSpec.Buffer framerate_denominator(int value) { SDL_CameraSpec.nframerate_denominator(address(), value); return this; }

    }

}
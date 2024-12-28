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
 * struct SDL_Surface {
 *     SDL_SurfaceFlags flags;
 *     SDL_PixelFormat format;
 *     int w;
 *     int h;
 *     int pitch;
 *     void * pixels;
 *     int refcount;
 *     void * reserved;
 * }}</pre>
 */
public class SDL_Surface extends Struct<SDL_Surface> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        FORMAT,
        W,
        H,
        PITCH,
        PIXELS,
        REFCOUNT,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
        PITCH = layout.offsetof(4);
        PIXELS = layout.offsetof(5);
        REFCOUNT = layout.offsetof(6);
        RESERVED = layout.offsetof(7);
    }

    protected SDL_Surface(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Surface create(long address, @Nullable ByteBuffer container) {
        return new SDL_Surface(address, container);
    }

    /**
     * Creates a {@code SDL_Surface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Surface(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("SDL_SurfaceFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("SDL_PixelFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code w} field. */
    public int w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public int h() { return nh(address()); }
    /** @return the value of the {@code pitch} field. */
    public int pitch() { return npitch(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field. */
    @NativeType("void *")
    public @Nullable ByteBuffer pixels() { return npixels(address()); }
    /** @return the value of the {@code refcount} field. */
    public int refcount() { return nrefcount(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public SDL_Surface flags(@NativeType("SDL_SurfaceFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public SDL_Surface format(@NativeType("SDL_PixelFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public SDL_Surface w(int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public SDL_Surface h(int value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code pitch} field. */
    public SDL_Surface pitch(int value) { npitch(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pixels} field. */
    public SDL_Surface pixels(@Nullable @NativeType("void *") ByteBuffer value) { npixels(address(), value); return this; }
    /** Sets the specified value to the {@code refcount} field. */
    public SDL_Surface refcount(int value) { nrefcount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_Surface set(
        int flags,
        int format,
        int w,
        int h,
        int pitch,
        @Nullable ByteBuffer pixels,
        int refcount
    ) {
        flags(flags);
        format(format);
        w(w);
        h(h);
        pitch(pitch);
        pixels(pixels);
        refcount(refcount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_Surface set(SDL_Surface src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_Surface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Surface malloc() {
        return new SDL_Surface(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Surface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Surface calloc() {
        return new SDL_Surface(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Surface} instance allocated with {@link BufferUtils}. */
    public static SDL_Surface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Surface(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Surface} instance for the specified memory address. */
    public static SDL_Surface create(long address) {
        return new SDL_Surface(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Surface createSafe(long address) {
        return address == NULL ? null : new SDL_Surface(address, null);
    }

    /**
     * Returns a new {@link SDL_Surface.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Surface.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Surface.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Surface.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Surface.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Surface.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Surface.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Surface.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Surface.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Surface} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Surface malloc(MemoryStack stack) {
        return new SDL_Surface(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Surface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Surface calloc(MemoryStack stack) {
        return new SDL_Surface(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Surface.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Surface.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Surface.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Surface.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + SDL_Surface.FLAGS); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_Surface.FORMAT); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + SDL_Surface.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return memGetInt(struct + SDL_Surface.H); }
    /** Unsafe version of {@link #pitch}. */
    public static int npitch(long struct) { return memGetInt(struct + SDL_Surface.PITCH); }
    /** Unsafe version of {@link #pixels() pixels}. */
    public static @Nullable ByteBuffer npixels(long struct) { return memByteBufferSafe(memGetAddress(struct + SDL_Surface.PIXELS), npitch(struct) * nh(struct)); }
    /** Unsafe version of {@link #refcount}. */
    public static int nrefcount(long struct) { return memGetInt(struct + SDL_Surface.REFCOUNT); }
    public static long nreserved(long struct) { return memGetAddress(struct + SDL_Surface.RESERVED); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + SDL_Surface.FLAGS, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_Surface.FORMAT, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + SDL_Surface.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { memPutInt(struct + SDL_Surface.H, value); }
    /** Unsafe version of {@link #pitch(int) pitch}. */
    public static void npitch(long struct, int value) { memPutInt(struct + SDL_Surface.PITCH, value); }
    /** Unsafe version of {@link #pixels(ByteBuffer) pixels}. */
    public static void npixels(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + SDL_Surface.PIXELS, memAddressSafe(value)); }
    /** Unsafe version of {@link #refcount(int) refcount}. */
    public static void nrefcount(long struct, int value) { memPutInt(struct + SDL_Surface.REFCOUNT, value); }
    public static void nreserved(long struct, long value) { memPutAddress(struct + SDL_Surface.RESERVED, value); }

    // -----------------------------------

    /** An array of {@link SDL_Surface} structs. */
    public static class Buffer extends StructBuffer<SDL_Surface, Buffer> implements NativeResource {

        private static final SDL_Surface ELEMENT_FACTORY = SDL_Surface.create(-1L);

        /**
         * Creates a new {@code SDL_Surface.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Surface#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_Surface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("SDL_SurfaceFlags")
        public int flags() { return SDL_Surface.nflags(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("SDL_PixelFormat")
        public int format() { return SDL_Surface.nformat(address()); }
        /** @return the value of the {@code w} field. */
        public int w() { return SDL_Surface.nw(address()); }
        /** @return the value of the {@code h} field. */
        public int h() { return SDL_Surface.nh(address()); }
        /** @return the value of the {@code pitch} field. */
        public int pitch() { return SDL_Surface.npitch(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field. */
        @NativeType("void *")
        public @Nullable ByteBuffer pixels() { return SDL_Surface.npixels(address()); }
        /** @return the value of the {@code refcount} field. */
        public int refcount() { return SDL_Surface.nrefcount(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public SDL_Surface.Buffer flags(@NativeType("SDL_SurfaceFlags") int value) { SDL_Surface.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public SDL_Surface.Buffer format(@NativeType("SDL_PixelFormat") int value) { SDL_Surface.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public SDL_Surface.Buffer w(int value) { SDL_Surface.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public SDL_Surface.Buffer h(int value) { SDL_Surface.nh(address(), value); return this; }
        /** Sets the specified value to the {@code pitch} field. */
        public SDL_Surface.Buffer pitch(int value) { SDL_Surface.npitch(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pixels} field. */
        public SDL_Surface.Buffer pixels(@Nullable @NativeType("void *") ByteBuffer value) { SDL_Surface.npixels(address(), value); return this; }
        /** Sets the specified value to the {@code refcount} field. */
        public SDL_Surface.Buffer refcount(int value) { SDL_Surface.nrefcount(address(), value); return this; }

    }

}
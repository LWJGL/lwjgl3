/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vpx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Initialization Configurations
 *
 * This structure is used to pass init time configuration options to the
 * decoder.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code threads} &ndash; Maximum number of threads to use, default 1</li>
 * <li>{@code w} &ndash; Width</li>
 * <li>{@code h} &ndash; Height</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct vpx_codec_dec_cfg_t {
 *     unsigned int threads;
 *     unsigned int w;
 *     unsigned int h;
 * }</code></pre>
 */
public class vpx_codec_dec_cfg_t extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        THREADS,
        W,
        H;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        THREADS = layout.offsetof(0);
        W = layout.offsetof(1);
        H = layout.offsetof(2);
    }

    /**
     * Creates a {@code vpx_codec_dec_cfg_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public vpx_codec_dec_cfg_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code threads} field. */
    @NativeType("unsigned int")
    public int threads() { return nthreads(address()); }
    /** Returns the value of the {@code w} field. */
    @NativeType("unsigned int")
    public int w() { return nw(address()); }
    /** Returns the value of the {@code h} field. */
    @NativeType("unsigned int")
    public int h() { return nh(address()); }

    /** Sets the specified value to the {@code threads} field. */
    public vpx_codec_dec_cfg_t threads(@NativeType("unsigned int") int value) { nthreads(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public vpx_codec_dec_cfg_t w(@NativeType("unsigned int") int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public vpx_codec_dec_cfg_t h(@NativeType("unsigned int") int value) { nh(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public vpx_codec_dec_cfg_t set(
        int threads,
        int w,
        int h
    ) {
        threads(threads);
        w(w);
        h(h);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public vpx_codec_dec_cfg_t set(vpx_codec_dec_cfg_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code vpx_codec_dec_cfg_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static vpx_codec_dec_cfg_t malloc() {
        return wrap(vpx_codec_dec_cfg_t.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code vpx_codec_dec_cfg_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static vpx_codec_dec_cfg_t calloc() {
        return wrap(vpx_codec_dec_cfg_t.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code vpx_codec_dec_cfg_t} instance allocated with {@link BufferUtils}. */
    public static vpx_codec_dec_cfg_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(vpx_codec_dec_cfg_t.class, memAddress(container), container);
    }

    /** Returns a new {@code vpx_codec_dec_cfg_t} instance for the specified memory address. */
    public static vpx_codec_dec_cfg_t create(long address) {
        return wrap(vpx_codec_dec_cfg_t.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_codec_dec_cfg_t createSafe(long address) {
        return address == NULL ? null : wrap(vpx_codec_dec_cfg_t.class, address);
    }

    /**
     * Returns a new {@link vpx_codec_dec_cfg_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_dec_cfg_t.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_dec_cfg_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_dec_cfg_t.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_dec_cfg_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_dec_cfg_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link vpx_codec_dec_cfg_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static vpx_codec_dec_cfg_t.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_codec_dec_cfg_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code vpx_codec_dec_cfg_t} instance allocated on the thread-local {@link MemoryStack}. */
    public static vpx_codec_dec_cfg_t mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code vpx_codec_dec_cfg_t} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static vpx_codec_dec_cfg_t callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code vpx_codec_dec_cfg_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_codec_dec_cfg_t mallocStack(MemoryStack stack) {
        return wrap(vpx_codec_dec_cfg_t.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code vpx_codec_dec_cfg_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_codec_dec_cfg_t callocStack(MemoryStack stack) {
        return wrap(vpx_codec_dec_cfg_t.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link vpx_codec_dec_cfg_t.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_dec_cfg_t.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_codec_dec_cfg_t.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_dec_cfg_t.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_codec_dec_cfg_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_codec_dec_cfg_t.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_dec_cfg_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_codec_dec_cfg_t.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #threads}. */
    public static int nthreads(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_dec_cfg_t.THREADS); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_dec_cfg_t.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_dec_cfg_t.H); }

    /** Unsafe version of {@link #threads(int) threads}. */
    public static void nthreads(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_dec_cfg_t.THREADS, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_dec_cfg_t.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_dec_cfg_t.H, value); }

    // -----------------------------------

    /** An array of {@link vpx_codec_dec_cfg_t} structs. */
    public static class Buffer extends StructBuffer<vpx_codec_dec_cfg_t, Buffer> implements NativeResource {

        private static final vpx_codec_dec_cfg_t ELEMENT_FACTORY = vpx_codec_dec_cfg_t.create(-1L);

        /**
         * Creates a new {@code vpx_codec_dec_cfg_t.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link vpx_codec_dec_cfg_t#SIZEOF}, and its mark will be undefined.
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
        protected vpx_codec_dec_cfg_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code threads} field. */
        @NativeType("unsigned int")
        public int threads() { return vpx_codec_dec_cfg_t.nthreads(address()); }
        /** Returns the value of the {@code w} field. */
        @NativeType("unsigned int")
        public int w() { return vpx_codec_dec_cfg_t.nw(address()); }
        /** Returns the value of the {@code h} field. */
        @NativeType("unsigned int")
        public int h() { return vpx_codec_dec_cfg_t.nh(address()); }

        /** Sets the specified value to the {@code threads} field. */
        public vpx_codec_dec_cfg_t.Buffer threads(@NativeType("unsigned int") int value) { vpx_codec_dec_cfg_t.nthreads(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public vpx_codec_dec_cfg_t.Buffer w(@NativeType("unsigned int") int value) { vpx_codec_dec_cfg_t.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public vpx_codec_dec_cfg_t.Buffer h(@NativeType("unsigned int") int value) { vpx_codec_dec_cfg_t.nh(address(), value); return this; }

    }

}
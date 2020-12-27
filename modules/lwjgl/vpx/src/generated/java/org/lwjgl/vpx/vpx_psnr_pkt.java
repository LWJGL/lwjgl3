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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code samples[4]} &ndash; Number of samples, total/y/u/v</li>
 * <li>{@code sse[4]} &ndash; sum squared error, total/y/u/v</li>
 * <li>{@code psnr[4]} &ndash; PSNR, total/y/u/v</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct vpx_psnr_pkt {
 *     unsigned int samples[4];
 *     uint64_t sse[4];
 *     double psnr[4];
 * }</code></pre>
 */
public class vpx_psnr_pkt extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SAMPLES,
        SSE,
        PSNR;

    static {
        Layout layout = __struct(
            __array(4, 4),
            __array(8, 4),
            __array(8, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SAMPLES = layout.offsetof(0);
        SSE = layout.offsetof(1);
        PSNR = layout.offsetof(2);
    }

    /**
     * Creates a {@code vpx_psnr_pkt} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public vpx_psnr_pkt(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link IntBuffer} view of the {@code samples} field. */
    @NativeType("unsigned int[4]")
    public IntBuffer samples() { return nsamples(address()); }
    /** Returns the value at the specified index of the {@code samples} field. */
    @NativeType("unsigned int")
    public int samples(int index) { return nsamples(address(), index); }
    /** Returns a {@link LongBuffer} view of the {@code sse} field. */
    @NativeType("uint64_t[4]")
    public LongBuffer sse() { return nsse(address()); }
    /** Returns the value at the specified index of the {@code sse} field. */
    @NativeType("uint64_t")
    public long sse(int index) { return nsse(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code psnr} field. */
    @NativeType("double[4]")
    public DoubleBuffer psnr() { return npsnr(address()); }
    /** Returns the value at the specified index of the {@code psnr} field. */
    public double psnr(int index) { return npsnr(address(), index); }

    /** Copies the specified {@link IntBuffer} to the {@code samples} field. */
    public vpx_psnr_pkt samples(@NativeType("unsigned int[4]") IntBuffer value) { nsamples(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code samples} field. */
    public vpx_psnr_pkt samples(int index, @NativeType("unsigned int") int value) { nsamples(address(), index, value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code sse} field. */
    public vpx_psnr_pkt sse(@NativeType("uint64_t[4]") LongBuffer value) { nsse(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code sse} field. */
    public vpx_psnr_pkt sse(int index, @NativeType("uint64_t") long value) { nsse(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code psnr} field. */
    public vpx_psnr_pkt psnr(@NativeType("double[4]") DoubleBuffer value) { npsnr(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code psnr} field. */
    public vpx_psnr_pkt psnr(int index, double value) { npsnr(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public vpx_psnr_pkt set(
        IntBuffer samples,
        LongBuffer sse,
        DoubleBuffer psnr
    ) {
        samples(samples);
        sse(sse);
        psnr(psnr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public vpx_psnr_pkt set(vpx_psnr_pkt src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code vpx_psnr_pkt} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static vpx_psnr_pkt malloc() {
        return wrap(vpx_psnr_pkt.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code vpx_psnr_pkt} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static vpx_psnr_pkt calloc() {
        return wrap(vpx_psnr_pkt.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code vpx_psnr_pkt} instance allocated with {@link BufferUtils}. */
    public static vpx_psnr_pkt create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(vpx_psnr_pkt.class, memAddress(container), container);
    }

    /** Returns a new {@code vpx_psnr_pkt} instance for the specified memory address. */
    public static vpx_psnr_pkt create(long address) {
        return wrap(vpx_psnr_pkt.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_psnr_pkt createSafe(long address) {
        return address == NULL ? null : wrap(vpx_psnr_pkt.class, address);
    }

    /**
     * Returns a new {@link vpx_psnr_pkt.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_psnr_pkt.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link vpx_psnr_pkt.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_psnr_pkt.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_psnr_pkt.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_psnr_pkt.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link vpx_psnr_pkt.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static vpx_psnr_pkt.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_psnr_pkt.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code vpx_psnr_pkt} instance allocated on the thread-local {@link MemoryStack}. */
    public static vpx_psnr_pkt mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code vpx_psnr_pkt} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static vpx_psnr_pkt callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code vpx_psnr_pkt} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_psnr_pkt mallocStack(MemoryStack stack) {
        return wrap(vpx_psnr_pkt.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code vpx_psnr_pkt} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_psnr_pkt callocStack(MemoryStack stack) {
        return wrap(vpx_psnr_pkt.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link vpx_psnr_pkt.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_psnr_pkt.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_psnr_pkt.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_psnr_pkt.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_psnr_pkt.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_psnr_pkt.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_psnr_pkt.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_psnr_pkt.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #samples}. */
    public static IntBuffer nsamples(long struct) { return memIntBuffer(struct + vpx_psnr_pkt.SAMPLES, 4); }
    /** Unsafe version of {@link #samples(int) samples}. */
    public static int nsamples(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_psnr_pkt.SAMPLES + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #sse}. */
    public static LongBuffer nsse(long struct) { return memLongBuffer(struct + vpx_psnr_pkt.SSE, 4); }
    /** Unsafe version of {@link #sse(int) sse}. */
    public static long nsse(long struct, int index) {
        return UNSAFE.getLong(null, struct + vpx_psnr_pkt.SSE + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #psnr}. */
    public static DoubleBuffer npsnr(long struct) { return memDoubleBuffer(struct + vpx_psnr_pkt.PSNR, 4); }
    /** Unsafe version of {@link #psnr(int) psnr}. */
    public static double npsnr(long struct, int index) {
        return UNSAFE.getDouble(null, struct + vpx_psnr_pkt.PSNR + check(index, 4) * 8);
    }

    /** Unsafe version of {@link #samples(IntBuffer) samples}. */
    public static void nsamples(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + vpx_psnr_pkt.SAMPLES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #samples(int, int) samples}. */
    public static void nsamples(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_psnr_pkt.SAMPLES + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #sse(LongBuffer) sse}. */
    public static void nsse(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + vpx_psnr_pkt.SSE, value.remaining() * 8);
    }
    /** Unsafe version of {@link #sse(int, long) sse}. */
    public static void nsse(long struct, int index, long value) {
        UNSAFE.putLong(null, struct + vpx_psnr_pkt.SSE + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #psnr(DoubleBuffer) psnr}. */
    public static void npsnr(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + vpx_psnr_pkt.PSNR, value.remaining() * 8);
    }
    /** Unsafe version of {@link #psnr(int, double) psnr}. */
    public static void npsnr(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + vpx_psnr_pkt.PSNR + check(index, 4) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link vpx_psnr_pkt} structs. */
    public static class Buffer extends StructBuffer<vpx_psnr_pkt, Buffer> implements NativeResource {

        private static final vpx_psnr_pkt ELEMENT_FACTORY = vpx_psnr_pkt.create(-1L);

        /**
         * Creates a new {@code vpx_psnr_pkt.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link vpx_psnr_pkt#SIZEOF}, and its mark will be undefined.
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
        protected vpx_psnr_pkt getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link IntBuffer} view of the {@code samples} field. */
        @NativeType("unsigned int[4]")
        public IntBuffer samples() { return vpx_psnr_pkt.nsamples(address()); }
        /** Returns the value at the specified index of the {@code samples} field. */
        @NativeType("unsigned int")
        public int samples(int index) { return vpx_psnr_pkt.nsamples(address(), index); }
        /** Returns a {@link LongBuffer} view of the {@code sse} field. */
        @NativeType("uint64_t[4]")
        public LongBuffer sse() { return vpx_psnr_pkt.nsse(address()); }
        /** Returns the value at the specified index of the {@code sse} field. */
        @NativeType("uint64_t")
        public long sse(int index) { return vpx_psnr_pkt.nsse(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code psnr} field. */
        @NativeType("double[4]")
        public DoubleBuffer psnr() { return vpx_psnr_pkt.npsnr(address()); }
        /** Returns the value at the specified index of the {@code psnr} field. */
        public double psnr(int index) { return vpx_psnr_pkt.npsnr(address(), index); }

        /** Copies the specified {@link IntBuffer} to the {@code samples} field. */
        public vpx_psnr_pkt.Buffer samples(@NativeType("unsigned int[4]") IntBuffer value) { vpx_psnr_pkt.nsamples(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code samples} field. */
        public vpx_psnr_pkt.Buffer samples(int index, @NativeType("unsigned int") int value) { vpx_psnr_pkt.nsamples(address(), index, value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code sse} field. */
        public vpx_psnr_pkt.Buffer sse(@NativeType("uint64_t[4]") LongBuffer value) { vpx_psnr_pkt.nsse(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code sse} field. */
        public vpx_psnr_pkt.Buffer sse(int index, @NativeType("uint64_t") long value) { vpx_psnr_pkt.nsse(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code psnr} field. */
        public vpx_psnr_pkt.Buffer psnr(@NativeType("double[4]") DoubleBuffer value) { vpx_psnr_pkt.npsnr(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code psnr} field. */
        public vpx_psnr_pkt.Buffer psnr(int index, double value) { vpx_psnr_pkt.npsnr(address(), index, value); return this; }

    }

}
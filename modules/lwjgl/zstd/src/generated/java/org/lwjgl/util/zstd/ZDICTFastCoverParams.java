/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * {@code k} and {@code d} are the only required parameters. For others, value 0 means default.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ZDICT_fastCover_params_t {
 *     unsigned {@link #k};
 *     unsigned {@link #d};
 *     unsigned {@link #f};
 *     unsigned {@link #steps};
 *     unsigned {@link #nbThreads};
 *     double {@link #splitPoint};
 *     unsigned {@link #accel};
 *     {@link ZDICTParams ZDICT_params_t} zParams;
 * }</code></pre>
 */
@NativeType("struct ZDICT_fastCover_params_t")
public class ZDICTFastCoverParams extends Struct<ZDICTFastCoverParams> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        K,
        D,
        F,
        STEPS,
        NBTHREADS,
        SPLITPOINT,
        ACCEL,
        ZPARAMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(ZDICTParams.SIZEOF, ZDICTParams.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        K = layout.offsetof(0);
        D = layout.offsetof(1);
        F = layout.offsetof(2);
        STEPS = layout.offsetof(3);
        NBTHREADS = layout.offsetof(4);
        SPLITPOINT = layout.offsetof(5);
        ACCEL = layout.offsetof(6);
        ZPARAMS = layout.offsetof(7);
    }

    protected ZDICTFastCoverParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ZDICTFastCoverParams create(long address, @Nullable ByteBuffer container) {
        return new ZDICTFastCoverParams(address, container);
    }

    /**
     * Creates a {@code ZDICTFastCoverParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZDICTFastCoverParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** segment size : constraint: {@code 0 < k} : Reasonable range {@code [16, 2048+]} */
    @NativeType("unsigned")
    public int k() { return nk(address()); }
    /** {@code dmer} size : constraint: {@code 0 < d <= k} : Reasonable range {@code [6, 16]} */
    @NativeType("unsigned")
    public int d() { return nd(address()); }
    /** log of size of frequency array : constraint: {@code 0 < f <= 31} : 1 means default(20) */
    @NativeType("unsigned")
    public int f() { return nf(address()); }
    /** Number of steps : Only used for optimization : 0 means default (40) : Higher means more parameters checked */
    @NativeType("unsigned")
    public int steps() { return nsteps(address()); }
    /**
     * number of threads : constraint: {@code 0 < nbThreads} : 1 means single-threaded : Only used for optimization : Ignored if {@code ZSTD_MULTITHREAD} is
     * not defined.
     */
    @NativeType("unsigned")
    public int nbThreads() { return nnbThreads(address()); }
    /**
     * percentage of samples used for training: Only used for optimization: the first {@code nbSamples * splitPoint} samples will be used to training, the
     * last {@code nbSamples * (1 - splitPoint)} samples will be used for testing, 0 means default (0.75), 1.0 when all samples are used for both training and
     * testing.
     */
    public double splitPoint() { return nsplitPoint(address()); }
    /** acceleration level: constraint: {@code 0 < accel <= 10}, higher means faster and less accurate, 0 means default(1) */
    @NativeType("unsigned")
    public int accel() { return naccel(address()); }
    /** @return a {@link ZDICTParams} view of the {@code zParams} field. */
    @NativeType("ZDICT_params_t")
    public ZDICTParams zParams() { return nzParams(address()); }

    /** Sets the specified value to the {@link #k} field. */
    public ZDICTFastCoverParams k(@NativeType("unsigned") int value) { nk(address(), value); return this; }
    /** Sets the specified value to the {@link #d} field. */
    public ZDICTFastCoverParams d(@NativeType("unsigned") int value) { nd(address(), value); return this; }
    /** Sets the specified value to the {@link #f} field. */
    public ZDICTFastCoverParams f(@NativeType("unsigned") int value) { nf(address(), value); return this; }
    /** Sets the specified value to the {@link #steps} field. */
    public ZDICTFastCoverParams steps(@NativeType("unsigned") int value) { nsteps(address(), value); return this; }
    /** Sets the specified value to the {@link #nbThreads} field. */
    public ZDICTFastCoverParams nbThreads(@NativeType("unsigned") int value) { nnbThreads(address(), value); return this; }
    /** Sets the specified value to the {@link #splitPoint} field. */
    public ZDICTFastCoverParams splitPoint(double value) { nsplitPoint(address(), value); return this; }
    /** Sets the specified value to the {@link #accel} field. */
    public ZDICTFastCoverParams accel(@NativeType("unsigned") int value) { naccel(address(), value); return this; }
    /** Copies the specified {@link ZDICTParams} to the {@code zParams} field. */
    public ZDICTFastCoverParams zParams(@NativeType("ZDICT_params_t") ZDICTParams value) { nzParams(address(), value); return this; }
    /** Passes the {@code zParams} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ZDICTFastCoverParams zParams(java.util.function.Consumer<ZDICTParams> consumer) { consumer.accept(zParams()); return this; }

    /** Initializes this struct with the specified values. */
    public ZDICTFastCoverParams set(
        int k,
        int d,
        int f,
        int steps,
        int nbThreads,
        double splitPoint,
        int accel,
        ZDICTParams zParams
    ) {
        k(k);
        d(d);
        f(f);
        steps(steps);
        nbThreads(nbThreads);
        splitPoint(splitPoint);
        accel(accel);
        zParams(zParams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZDICTFastCoverParams set(ZDICTFastCoverParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ZDICTFastCoverParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZDICTFastCoverParams malloc() {
        return new ZDICTFastCoverParams(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ZDICTFastCoverParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZDICTFastCoverParams calloc() {
        return new ZDICTFastCoverParams(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ZDICTFastCoverParams} instance allocated with {@link BufferUtils}. */
    public static ZDICTFastCoverParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ZDICTFastCoverParams(memAddress(container), container);
    }

    /** Returns a new {@code ZDICTFastCoverParams} instance for the specified memory address. */
    public static ZDICTFastCoverParams create(long address) {
        return new ZDICTFastCoverParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ZDICTFastCoverParams createSafe(long address) {
        return address == NULL ? null : new ZDICTFastCoverParams(address, null);
    }

    /**
     * Returns a new {@link ZDICTFastCoverParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTFastCoverParams.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZDICTFastCoverParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTFastCoverParams.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTFastCoverParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTFastCoverParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ZDICTFastCoverParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZDICTFastCoverParams.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ZDICTFastCoverParams.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZDICTFastCoverParams mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZDICTFastCoverParams callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZDICTFastCoverParams mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZDICTFastCoverParams callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZDICTFastCoverParams.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZDICTFastCoverParams.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZDICTFastCoverParams.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZDICTFastCoverParams.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ZDICTFastCoverParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZDICTFastCoverParams malloc(MemoryStack stack) {
        return new ZDICTFastCoverParams(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ZDICTFastCoverParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZDICTFastCoverParams calloc(MemoryStack stack) {
        return new ZDICTFastCoverParams(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ZDICTFastCoverParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZDICTFastCoverParams.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTFastCoverParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZDICTFastCoverParams.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #k}. */
    public static int nk(long struct) { return memGetInt(struct + ZDICTFastCoverParams.K); }
    /** Unsafe version of {@link #d}. */
    public static int nd(long struct) { return memGetInt(struct + ZDICTFastCoverParams.D); }
    /** Unsafe version of {@link #f}. */
    public static int nf(long struct) { return memGetInt(struct + ZDICTFastCoverParams.F); }
    /** Unsafe version of {@link #steps}. */
    public static int nsteps(long struct) { return memGetInt(struct + ZDICTFastCoverParams.STEPS); }
    /** Unsafe version of {@link #nbThreads}. */
    public static int nnbThreads(long struct) { return memGetInt(struct + ZDICTFastCoverParams.NBTHREADS); }
    /** Unsafe version of {@link #splitPoint}. */
    public static double nsplitPoint(long struct) { return memGetDouble(struct + ZDICTFastCoverParams.SPLITPOINT); }
    /** Unsafe version of {@link #accel}. */
    public static int naccel(long struct) { return memGetInt(struct + ZDICTFastCoverParams.ACCEL); }
    /** Unsafe version of {@link #zParams}. */
    public static ZDICTParams nzParams(long struct) { return ZDICTParams.create(struct + ZDICTFastCoverParams.ZPARAMS); }

    /** Unsafe version of {@link #k(int) k}. */
    public static void nk(long struct, int value) { memPutInt(struct + ZDICTFastCoverParams.K, value); }
    /** Unsafe version of {@link #d(int) d}. */
    public static void nd(long struct, int value) { memPutInt(struct + ZDICTFastCoverParams.D, value); }
    /** Unsafe version of {@link #f(int) f}. */
    public static void nf(long struct, int value) { memPutInt(struct + ZDICTFastCoverParams.F, value); }
    /** Unsafe version of {@link #steps(int) steps}. */
    public static void nsteps(long struct, int value) { memPutInt(struct + ZDICTFastCoverParams.STEPS, value); }
    /** Unsafe version of {@link #nbThreads(int) nbThreads}. */
    public static void nnbThreads(long struct, int value) { memPutInt(struct + ZDICTFastCoverParams.NBTHREADS, value); }
    /** Unsafe version of {@link #splitPoint(double) splitPoint}. */
    public static void nsplitPoint(long struct, double value) { memPutDouble(struct + ZDICTFastCoverParams.SPLITPOINT, value); }
    /** Unsafe version of {@link #accel(int) accel}. */
    public static void naccel(long struct, int value) { memPutInt(struct + ZDICTFastCoverParams.ACCEL, value); }
    /** Unsafe version of {@link #zParams(ZDICTParams) zParams}. */
    public static void nzParams(long struct, ZDICTParams value) { memCopy(value.address(), struct + ZDICTFastCoverParams.ZPARAMS, ZDICTParams.SIZEOF); }

    // -----------------------------------

    /** An array of {@link ZDICTFastCoverParams} structs. */
    public static class Buffer extends StructBuffer<ZDICTFastCoverParams, Buffer> implements NativeResource {

        private static final ZDICTFastCoverParams ELEMENT_FACTORY = ZDICTFastCoverParams.create(-1L);

        /**
         * Creates a new {@code ZDICTFastCoverParams.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZDICTFastCoverParams#SIZEOF}, and its mark will be undefined.</p>
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
        protected ZDICTFastCoverParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ZDICTFastCoverParams#k} field. */
        @NativeType("unsigned")
        public int k() { return ZDICTFastCoverParams.nk(address()); }
        /** @return the value of the {@link ZDICTFastCoverParams#d} field. */
        @NativeType("unsigned")
        public int d() { return ZDICTFastCoverParams.nd(address()); }
        /** @return the value of the {@link ZDICTFastCoverParams#f} field. */
        @NativeType("unsigned")
        public int f() { return ZDICTFastCoverParams.nf(address()); }
        /** @return the value of the {@link ZDICTFastCoverParams#steps} field. */
        @NativeType("unsigned")
        public int steps() { return ZDICTFastCoverParams.nsteps(address()); }
        /** @return the value of the {@link ZDICTFastCoverParams#nbThreads} field. */
        @NativeType("unsigned")
        public int nbThreads() { return ZDICTFastCoverParams.nnbThreads(address()); }
        /** @return the value of the {@link ZDICTFastCoverParams#splitPoint} field. */
        public double splitPoint() { return ZDICTFastCoverParams.nsplitPoint(address()); }
        /** @return the value of the {@link ZDICTFastCoverParams#accel} field. */
        @NativeType("unsigned")
        public int accel() { return ZDICTFastCoverParams.naccel(address()); }
        /** @return a {@link ZDICTParams} view of the {@code zParams} field. */
        @NativeType("ZDICT_params_t")
        public ZDICTParams zParams() { return ZDICTFastCoverParams.nzParams(address()); }

        /** Sets the specified value to the {@link ZDICTFastCoverParams#k} field. */
        public ZDICTFastCoverParams.Buffer k(@NativeType("unsigned") int value) { ZDICTFastCoverParams.nk(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTFastCoverParams#d} field. */
        public ZDICTFastCoverParams.Buffer d(@NativeType("unsigned") int value) { ZDICTFastCoverParams.nd(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTFastCoverParams#f} field. */
        public ZDICTFastCoverParams.Buffer f(@NativeType("unsigned") int value) { ZDICTFastCoverParams.nf(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTFastCoverParams#steps} field. */
        public ZDICTFastCoverParams.Buffer steps(@NativeType("unsigned") int value) { ZDICTFastCoverParams.nsteps(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTFastCoverParams#nbThreads} field. */
        public ZDICTFastCoverParams.Buffer nbThreads(@NativeType("unsigned") int value) { ZDICTFastCoverParams.nnbThreads(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTFastCoverParams#splitPoint} field. */
        public ZDICTFastCoverParams.Buffer splitPoint(double value) { ZDICTFastCoverParams.nsplitPoint(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTFastCoverParams#accel} field. */
        public ZDICTFastCoverParams.Buffer accel(@NativeType("unsigned") int value) { ZDICTFastCoverParams.naccel(address(), value); return this; }
        /** Copies the specified {@link ZDICTParams} to the {@code zParams} field. */
        public ZDICTFastCoverParams.Buffer zParams(@NativeType("ZDICT_params_t") ZDICTParams value) { ZDICTFastCoverParams.nzParams(address(), value); return this; }
        /** Passes the {@code zParams} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ZDICTFastCoverParams.Buffer zParams(java.util.function.Consumer<ZDICTParams> consumer) { consumer.accept(zParams()); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

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
 * struct ZDICT_cover_params_t {
 *     unsigned {@link #k};
 *     unsigned {@link #d};
 *     unsigned {@link #steps};
 *     unsigned {@link #nbThreads};
 *     double {@link #splitPoint};
 *     {@link ZDICTParams ZDICT_params_t} zParams;
 * }</code></pre>
 */
@NativeType("struct ZDICT_cover_params_t")
public class ZDICTCoverParams extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        K,
        D,
        STEPS,
        NBTHREADS,
        SPLITPOINT,
        ZPARAMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(ZDICTParams.SIZEOF, ZDICTParams.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        K = layout.offsetof(0);
        D = layout.offsetof(1);
        STEPS = layout.offsetof(2);
        NBTHREADS = layout.offsetof(3);
        SPLITPOINT = layout.offsetof(4);
        ZPARAMS = layout.offsetof(5);
    }

    /**
     * Creates a {@code ZDICTCoverParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZDICTCoverParams(ByteBuffer container) {
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
     * last {@code nbSamples * (1 - splitPoint)} samples will be used for testing, 0 means default (1.0), 1.0 when all samples are used for both training and
     * testing.
     */
    public double splitPoint() { return nsplitPoint(address()); }
    /** @return a {@link ZDICTParams} view of the {@code zParams} field. */
    @NativeType("ZDICT_params_t")
    public ZDICTParams zParams() { return nzParams(address()); }

    /** Sets the specified value to the {@link #k} field. */
    public ZDICTCoverParams k(@NativeType("unsigned") int value) { nk(address(), value); return this; }
    /** Sets the specified value to the {@link #d} field. */
    public ZDICTCoverParams d(@NativeType("unsigned") int value) { nd(address(), value); return this; }
    /** Sets the specified value to the {@link #steps} field. */
    public ZDICTCoverParams steps(@NativeType("unsigned") int value) { nsteps(address(), value); return this; }
    /** Sets the specified value to the {@link #nbThreads} field. */
    public ZDICTCoverParams nbThreads(@NativeType("unsigned") int value) { nnbThreads(address(), value); return this; }
    /** Sets the specified value to the {@link #splitPoint} field. */
    public ZDICTCoverParams splitPoint(double value) { nsplitPoint(address(), value); return this; }
    /** Copies the specified {@link ZDICTParams} to the {@code zParams} field. */
    public ZDICTCoverParams zParams(@NativeType("ZDICT_params_t") ZDICTParams value) { nzParams(address(), value); return this; }
    /** Passes the {@code zParams} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ZDICTCoverParams zParams(java.util.function.Consumer<ZDICTParams> consumer) { consumer.accept(zParams()); return this; }

    /** Initializes this struct with the specified values. */
    public ZDICTCoverParams set(
        int k,
        int d,
        int steps,
        int nbThreads,
        double splitPoint,
        ZDICTParams zParams
    ) {
        k(k);
        d(d);
        steps(steps);
        nbThreads(nbThreads);
        splitPoint(splitPoint);
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
    public ZDICTCoverParams set(ZDICTCoverParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ZDICTCoverParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZDICTCoverParams malloc() {
        return wrap(ZDICTCoverParams.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZDICTCoverParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZDICTCoverParams calloc() {
        return wrap(ZDICTCoverParams.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZDICTCoverParams} instance allocated with {@link BufferUtils}. */
    public static ZDICTCoverParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZDICTCoverParams.class, memAddress(container), container);
    }

    /** Returns a new {@code ZDICTCoverParams} instance for the specified memory address. */
    public static ZDICTCoverParams create(long address) {
        return wrap(ZDICTCoverParams.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZDICTCoverParams createSafe(long address) {
        return address == NULL ? null : wrap(ZDICTCoverParams.class, address);
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZDICTCoverParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZDICTCoverParams.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZDICTCoverParams mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZDICTCoverParams callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZDICTCoverParams mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZDICTCoverParams callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZDICTCoverParams.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZDICTCoverParams.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZDICTCoverParams.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZDICTCoverParams.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ZDICTCoverParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZDICTCoverParams malloc(MemoryStack stack) {
        return wrap(ZDICTCoverParams.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZDICTCoverParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZDICTCoverParams calloc(MemoryStack stack) {
        return wrap(ZDICTCoverParams.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #k}. */
    public static int nk(long struct) { return UNSAFE.getInt(null, struct + ZDICTCoverParams.K); }
    /** Unsafe version of {@link #d}. */
    public static int nd(long struct) { return UNSAFE.getInt(null, struct + ZDICTCoverParams.D); }
    /** Unsafe version of {@link #steps}. */
    public static int nsteps(long struct) { return UNSAFE.getInt(null, struct + ZDICTCoverParams.STEPS); }
    /** Unsafe version of {@link #nbThreads}. */
    public static int nnbThreads(long struct) { return UNSAFE.getInt(null, struct + ZDICTCoverParams.NBTHREADS); }
    /** Unsafe version of {@link #splitPoint}. */
    public static double nsplitPoint(long struct) { return UNSAFE.getDouble(null, struct + ZDICTCoverParams.SPLITPOINT); }
    /** Unsafe version of {@link #zParams}. */
    public static ZDICTParams nzParams(long struct) { return ZDICTParams.create(struct + ZDICTCoverParams.ZPARAMS); }

    /** Unsafe version of {@link #k(int) k}. */
    public static void nk(long struct, int value) { UNSAFE.putInt(null, struct + ZDICTCoverParams.K, value); }
    /** Unsafe version of {@link #d(int) d}. */
    public static void nd(long struct, int value) { UNSAFE.putInt(null, struct + ZDICTCoverParams.D, value); }
    /** Unsafe version of {@link #steps(int) steps}. */
    public static void nsteps(long struct, int value) { UNSAFE.putInt(null, struct + ZDICTCoverParams.STEPS, value); }
    /** Unsafe version of {@link #nbThreads(int) nbThreads}. */
    public static void nnbThreads(long struct, int value) { UNSAFE.putInt(null, struct + ZDICTCoverParams.NBTHREADS, value); }
    /** Unsafe version of {@link #splitPoint(double) splitPoint}. */
    public static void nsplitPoint(long struct, double value) { UNSAFE.putDouble(null, struct + ZDICTCoverParams.SPLITPOINT, value); }
    /** Unsafe version of {@link #zParams(ZDICTParams) zParams}. */
    public static void nzParams(long struct, ZDICTParams value) { memCopy(value.address(), struct + ZDICTCoverParams.ZPARAMS, ZDICTParams.SIZEOF); }

    // -----------------------------------

    /** An array of {@link ZDICTCoverParams} structs. */
    public static class Buffer extends StructBuffer<ZDICTCoverParams, Buffer> implements NativeResource {

        private static final ZDICTCoverParams ELEMENT_FACTORY = ZDICTCoverParams.create(-1L);

        /**
         * Creates a new {@code ZDICTCoverParams.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZDICTCoverParams#SIZEOF}, and its mark will be undefined.
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
        protected ZDICTCoverParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ZDICTCoverParams#k} field. */
        @NativeType("unsigned")
        public int k() { return ZDICTCoverParams.nk(address()); }
        /** @return the value of the {@link ZDICTCoverParams#d} field. */
        @NativeType("unsigned")
        public int d() { return ZDICTCoverParams.nd(address()); }
        /** @return the value of the {@link ZDICTCoverParams#steps} field. */
        @NativeType("unsigned")
        public int steps() { return ZDICTCoverParams.nsteps(address()); }
        /** @return the value of the {@link ZDICTCoverParams#nbThreads} field. */
        @NativeType("unsigned")
        public int nbThreads() { return ZDICTCoverParams.nnbThreads(address()); }
        /** @return the value of the {@link ZDICTCoverParams#splitPoint} field. */
        public double splitPoint() { return ZDICTCoverParams.nsplitPoint(address()); }
        /** @return a {@link ZDICTParams} view of the {@code zParams} field. */
        @NativeType("ZDICT_params_t")
        public ZDICTParams zParams() { return ZDICTCoverParams.nzParams(address()); }

        /** Sets the specified value to the {@link ZDICTCoverParams#k} field. */
        public ZDICTCoverParams.Buffer k(@NativeType("unsigned") int value) { ZDICTCoverParams.nk(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTCoverParams#d} field. */
        public ZDICTCoverParams.Buffer d(@NativeType("unsigned") int value) { ZDICTCoverParams.nd(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTCoverParams#steps} field. */
        public ZDICTCoverParams.Buffer steps(@NativeType("unsigned") int value) { ZDICTCoverParams.nsteps(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTCoverParams#nbThreads} field. */
        public ZDICTCoverParams.Buffer nbThreads(@NativeType("unsigned") int value) { ZDICTCoverParams.nnbThreads(address(), value); return this; }
        /** Sets the specified value to the {@link ZDICTCoverParams#splitPoint} field. */
        public ZDICTCoverParams.Buffer splitPoint(double value) { ZDICTCoverParams.nsplitPoint(address(), value); return this; }
        /** Copies the specified {@link ZDICTParams} to the {@code zParams} field. */
        public ZDICTCoverParams.Buffer zParams(@NativeType("ZDICT_params_t") ZDICTParams value) { ZDICTCoverParams.nzParams(address(), value); return this; }
        /** Passes the {@code zParams} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ZDICTCoverParams.Buffer zParams(java.util.function.Consumer<ZDICTParams> consumer) { consumer.accept(zParams()); return this; }

    }

}
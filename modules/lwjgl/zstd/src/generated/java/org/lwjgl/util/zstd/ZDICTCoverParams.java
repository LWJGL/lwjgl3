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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code k} &ndash; segment size : constraint: {@code 0 < k} : Reasonable range {@code [16, 2048+]}</li>
 * <li>{@code d} &ndash; {@code dmer} size : constraint: {@code 0 < d <= k} : Reasonable range {@code [6, 16]}</li>
 * <li>{@code steps} &ndash; Number of steps : Only used for optimization : 0 means default (32) : Higher means more parameters checked</li>
 * <li>{@code nbThreads} &ndash; 
 * Number of threads : constraint: {@code 0 < nbThreads} : 1 means single-threaded : Only used for optimization : Ignored if {@code ZSTD_MULTITHREAD} is
 * not defined.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ZDICT_cover_params_t {
 *     unsigned k;
 *     unsigned d;
 *     unsigned steps;
 *     unsigned nbThreads;
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
        ZPARAMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(ZDICTParams.SIZEOF, ZDICTParams.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        K = layout.offsetof(0);
        D = layout.offsetof(1);
        STEPS = layout.offsetof(2);
        NBTHREADS = layout.offsetof(3);
        ZPARAMS = layout.offsetof(4);
    }

    ZDICTCoverParams(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link ZDICTCoverParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZDICTCoverParams(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code k} field. */
    @NativeType("unsigned")
    public int k() { return nk(address()); }
    /** Returns the value of the {@code d} field. */
    @NativeType("unsigned")
    public int d() { return nd(address()); }
    /** Returns the value of the {@code steps} field. */
    @NativeType("unsigned")
    public int steps() { return nsteps(address()); }
    /** Returns the value of the {@code nbThreads} field. */
    @NativeType("unsigned")
    public int nbThreads() { return nnbThreads(address()); }
    /** Returns a {@link ZDICTParams} view of the {@code zParams} field. */
    @NativeType("ZDICT_params_t")
    public ZDICTParams zParams() { return nzParams(address()); }
    /** Passes the {@code zParams} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ZDICTCoverParams zParams(java.util.function.Consumer<ZDICTParams> consumer) { consumer.accept(zParams()); return this; }

    /** Sets the specified value to the {@code k} field. */
    public ZDICTCoverParams k(@NativeType("unsigned") int value) { nk(address(), value); return this; }
    /** Sets the specified value to the {@code d} field. */
    public ZDICTCoverParams d(@NativeType("unsigned") int value) { nd(address(), value); return this; }
    /** Sets the specified value to the {@code steps} field. */
    public ZDICTCoverParams steps(@NativeType("unsigned") int value) { nsteps(address(), value); return this; }
    /** Sets the specified value to the {@code nbThreads} field. */
    public ZDICTCoverParams nbThreads(@NativeType("unsigned") int value) { nnbThreads(address(), value); return this; }
    /** Copies the specified {@link ZDICTParams} to the {@code zParams} field. */
    public ZDICTCoverParams zParams(@NativeType("ZDICT_params_t") ZDICTParams value) { nzParams(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZDICTCoverParams set(
        int k,
        int d,
        int steps,
        int nbThreads,
        ZDICTParams zParams
    ) {
        k(k);
        d(d);
        steps(steps);
        nbThreads(nbThreads);
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

    /** Returns a new {@link ZDICTCoverParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZDICTCoverParams malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link ZDICTCoverParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZDICTCoverParams calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link ZDICTCoverParams} instance allocated with {@link BufferUtils}. */
    public static ZDICTCoverParams create() {
        return new ZDICTCoverParams(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link ZDICTCoverParams} instance for the specified memory address. */
    public static ZDICTCoverParams create(long address) {
        return new ZDICTCoverParams(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZDICTCoverParams createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link ZDICTCoverParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZDICTCoverParams.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link ZDICTCoverParams} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZDICTCoverParams mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link ZDICTCoverParams} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZDICTCoverParams callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link ZDICTCoverParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZDICTCoverParams mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link ZDICTCoverParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZDICTCoverParams callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZDICTCoverParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZDICTCoverParams.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #k}. */
    public static int nk(long struct) { return memGetInt(struct + ZDICTCoverParams.K); }
    /** Unsafe version of {@link #d}. */
    public static int nd(long struct) { return memGetInt(struct + ZDICTCoverParams.D); }
    /** Unsafe version of {@link #steps}. */
    public static int nsteps(long struct) { return memGetInt(struct + ZDICTCoverParams.STEPS); }
    /** Unsafe version of {@link #nbThreads}. */
    public static int nnbThreads(long struct) { return memGetInt(struct + ZDICTCoverParams.NBTHREADS); }
    /** Unsafe version of {@link #zParams}. */
    public static ZDICTParams nzParams(long struct) { return ZDICTParams.create(struct + ZDICTCoverParams.ZPARAMS); }

    /** Unsafe version of {@link #k(int) k}. */
    public static void nk(long struct, int value) { memPutInt(struct + ZDICTCoverParams.K, value); }
    /** Unsafe version of {@link #d(int) d}. */
    public static void nd(long struct, int value) { memPutInt(struct + ZDICTCoverParams.D, value); }
    /** Unsafe version of {@link #steps(int) steps}. */
    public static void nsteps(long struct, int value) { memPutInt(struct + ZDICTCoverParams.STEPS, value); }
    /** Unsafe version of {@link #nbThreads(int) nbThreads}. */
    public static void nnbThreads(long struct, int value) { memPutInt(struct + ZDICTCoverParams.NBTHREADS, value); }
    /** Unsafe version of {@link #zParams(ZDICTParams) zParams}. */
    public static void nzParams(long struct, ZDICTParams value) { memCopy(value.address(), struct + ZDICTCoverParams.ZPARAMS, ZDICTParams.SIZEOF); }

    // -----------------------------------

    /** An array of {@link ZDICTCoverParams} structs. */
    public static class Buffer extends StructBuffer<ZDICTCoverParams, Buffer> implements NativeResource {

        /**
         * Creates a new {@link ZDICTCoverParams.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected ZDICTCoverParams newInstance(long address) {
            return new ZDICTCoverParams(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code k} field. */
        @NativeType("unsigned")
        public int k() { return ZDICTCoverParams.nk(address()); }
        /** Returns the value of the {@code d} field. */
        @NativeType("unsigned")
        public int d() { return ZDICTCoverParams.nd(address()); }
        /** Returns the value of the {@code steps} field. */
        @NativeType("unsigned")
        public int steps() { return ZDICTCoverParams.nsteps(address()); }
        /** Returns the value of the {@code nbThreads} field. */
        @NativeType("unsigned")
        public int nbThreads() { return ZDICTCoverParams.nnbThreads(address()); }
        /** Returns a {@link ZDICTParams} view of the {@code zParams} field. */
        @NativeType("ZDICT_params_t")
        public ZDICTParams zParams() { return ZDICTCoverParams.nzParams(address()); }
        /** Passes the {@code zParams} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ZDICTCoverParams.Buffer zParams(java.util.function.Consumer<ZDICTParams> consumer) { consumer.accept(zParams()); return this; }

        /** Sets the specified value to the {@code k} field. */
        public ZDICTCoverParams.Buffer k(@NativeType("unsigned") int value) { ZDICTCoverParams.nk(address(), value); return this; }
        /** Sets the specified value to the {@code d} field. */
        public ZDICTCoverParams.Buffer d(@NativeType("unsigned") int value) { ZDICTCoverParams.nd(address(), value); return this; }
        /** Sets the specified value to the {@code steps} field. */
        public ZDICTCoverParams.Buffer steps(@NativeType("unsigned") int value) { ZDICTCoverParams.nsteps(address(), value); return this; }
        /** Sets the specified value to the {@code nbThreads} field. */
        public ZDICTCoverParams.Buffer nbThreads(@NativeType("unsigned") int value) { ZDICTCoverParams.nnbThreads(address(), value); return this; }
        /** Copies the specified {@link ZDICTParams} to the {@code zParams} field. */
        public ZDICTCoverParams.Buffer zParams(@NativeType("ZDICT_params_t") ZDICTParams value) { ZDICTCoverParams.nzParams(address(), value); return this; }

    }

}
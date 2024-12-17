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
 * <pre>{@code
 * struct ZSTD_compressionParameters {
 *     unsigned int windowLog;
 *     unsigned int chainLog;
 *     unsigned int hashLog;
 *     unsigned int searchLog;
 *     unsigned int minMatch;
 *     unsigned int targetLength;
 *     ZSTD_strategy strategy;
 * }}</pre>
 */
@NativeType("struct ZSTD_compressionParameters")
public class ZSTDCompressionParameters extends Struct<ZSTDCompressionParameters> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WINDOWLOG,
        CHAINLOG,
        HASHLOG,
        SEARCHLOG,
        MINMATCH,
        TARGETLENGTH,
        STRATEGY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WINDOWLOG = layout.offsetof(0);
        CHAINLOG = layout.offsetof(1);
        HASHLOG = layout.offsetof(2);
        SEARCHLOG = layout.offsetof(3);
        MINMATCH = layout.offsetof(4);
        TARGETLENGTH = layout.offsetof(5);
        STRATEGY = layout.offsetof(6);
    }

    protected ZSTDCompressionParameters(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ZSTDCompressionParameters create(long address, @Nullable ByteBuffer container) {
        return new ZSTDCompressionParameters(address, container);
    }

    /**
     * Creates a {@code ZSTDCompressionParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDCompressionParameters(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code windowLog} field. */
    @NativeType("unsigned int")
    public int windowLog() { return nwindowLog(address()); }
    /** @return the value of the {@code chainLog} field. */
    @NativeType("unsigned int")
    public int chainLog() { return nchainLog(address()); }
    /** @return the value of the {@code hashLog} field. */
    @NativeType("unsigned int")
    public int hashLog() { return nhashLog(address()); }
    /** @return the value of the {@code searchLog} field. */
    @NativeType("unsigned int")
    public int searchLog() { return nsearchLog(address()); }
    /** @return the value of the {@code minMatch} field. */
    @NativeType("unsigned int")
    public int minMatch() { return nminMatch(address()); }
    /** @return the value of the {@code targetLength} field. */
    @NativeType("unsigned int")
    public int targetLength() { return ntargetLength(address()); }
    /** @return the value of the {@code strategy} field. */
    @NativeType("ZSTD_strategy")
    public int strategy() { return nstrategy(address()); }

    /** Sets the specified value to the {@code windowLog} field. */
    public ZSTDCompressionParameters windowLog(@NativeType("unsigned int") int value) { nwindowLog(address(), value); return this; }
    /** Sets the specified value to the {@code chainLog} field. */
    public ZSTDCompressionParameters chainLog(@NativeType("unsigned int") int value) { nchainLog(address(), value); return this; }
    /** Sets the specified value to the {@code hashLog} field. */
    public ZSTDCompressionParameters hashLog(@NativeType("unsigned int") int value) { nhashLog(address(), value); return this; }
    /** Sets the specified value to the {@code searchLog} field. */
    public ZSTDCompressionParameters searchLog(@NativeType("unsigned int") int value) { nsearchLog(address(), value); return this; }
    /** Sets the specified value to the {@code minMatch} field. */
    public ZSTDCompressionParameters minMatch(@NativeType("unsigned int") int value) { nminMatch(address(), value); return this; }
    /** Sets the specified value to the {@code targetLength} field. */
    public ZSTDCompressionParameters targetLength(@NativeType("unsigned int") int value) { ntargetLength(address(), value); return this; }
    /** Sets the specified value to the {@code strategy} field. */
    public ZSTDCompressionParameters strategy(@NativeType("ZSTD_strategy") int value) { nstrategy(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDCompressionParameters set(
        int windowLog,
        int chainLog,
        int hashLog,
        int searchLog,
        int minMatch,
        int targetLength,
        int strategy
    ) {
        windowLog(windowLog);
        chainLog(chainLog);
        hashLog(hashLog);
        searchLog(searchLog);
        minMatch(minMatch);
        targetLength(targetLength);
        strategy(strategy);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDCompressionParameters set(ZSTDCompressionParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ZSTDCompressionParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDCompressionParameters malloc() {
        return new ZSTDCompressionParameters(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ZSTDCompressionParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDCompressionParameters calloc() {
        return new ZSTDCompressionParameters(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ZSTDCompressionParameters} instance allocated with {@link BufferUtils}. */
    public static ZSTDCompressionParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ZSTDCompressionParameters(memAddress(container), container);
    }

    /** Returns a new {@code ZSTDCompressionParameters} instance for the specified memory address. */
    public static ZSTDCompressionParameters create(long address) {
        return new ZSTDCompressionParameters(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ZSTDCompressionParameters createSafe(long address) {
        return address == NULL ? null : new ZSTDCompressionParameters(address, null);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ZSTDCompressionParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ZSTDCompressionParameters.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDCompressionParameters mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDCompressionParameters callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDCompressionParameters mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDCompressionParameters callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDCompressionParameters.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDCompressionParameters.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDCompressionParameters.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDCompressionParameters.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ZSTDCompressionParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCompressionParameters malloc(MemoryStack stack) {
        return new ZSTDCompressionParameters(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ZSTDCompressionParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCompressionParameters calloc(MemoryStack stack) {
        return new ZSTDCompressionParameters(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #windowLog}. */
    public static int nwindowLog(long struct) { return memGetInt(struct + ZSTDCompressionParameters.WINDOWLOG); }
    /** Unsafe version of {@link #chainLog}. */
    public static int nchainLog(long struct) { return memGetInt(struct + ZSTDCompressionParameters.CHAINLOG); }
    /** Unsafe version of {@link #hashLog}. */
    public static int nhashLog(long struct) { return memGetInt(struct + ZSTDCompressionParameters.HASHLOG); }
    /** Unsafe version of {@link #searchLog}. */
    public static int nsearchLog(long struct) { return memGetInt(struct + ZSTDCompressionParameters.SEARCHLOG); }
    /** Unsafe version of {@link #minMatch}. */
    public static int nminMatch(long struct) { return memGetInt(struct + ZSTDCompressionParameters.MINMATCH); }
    /** Unsafe version of {@link #targetLength}. */
    public static int ntargetLength(long struct) { return memGetInt(struct + ZSTDCompressionParameters.TARGETLENGTH); }
    /** Unsafe version of {@link #strategy}. */
    public static int nstrategy(long struct) { return memGetInt(struct + ZSTDCompressionParameters.STRATEGY); }

    /** Unsafe version of {@link #windowLog(int) windowLog}. */
    public static void nwindowLog(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.WINDOWLOG, value); }
    /** Unsafe version of {@link #chainLog(int) chainLog}. */
    public static void nchainLog(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.CHAINLOG, value); }
    /** Unsafe version of {@link #hashLog(int) hashLog}. */
    public static void nhashLog(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.HASHLOG, value); }
    /** Unsafe version of {@link #searchLog(int) searchLog}. */
    public static void nsearchLog(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.SEARCHLOG, value); }
    /** Unsafe version of {@link #minMatch(int) minMatch}. */
    public static void nminMatch(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.MINMATCH, value); }
    /** Unsafe version of {@link #targetLength(int) targetLength}. */
    public static void ntargetLength(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.TARGETLENGTH, value); }
    /** Unsafe version of {@link #strategy(int) strategy}. */
    public static void nstrategy(long struct, int value) { memPutInt(struct + ZSTDCompressionParameters.STRATEGY, value); }

    // -----------------------------------

    /** An array of {@link ZSTDCompressionParameters} structs. */
    public static class Buffer extends StructBuffer<ZSTDCompressionParameters, Buffer> implements NativeResource {

        private static final ZSTDCompressionParameters ELEMENT_FACTORY = ZSTDCompressionParameters.create(-1L);

        /**
         * Creates a new {@code ZSTDCompressionParameters.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDCompressionParameters#SIZEOF}, and its mark will be undefined.</p>
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
        protected ZSTDCompressionParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code windowLog} field. */
        @NativeType("unsigned int")
        public int windowLog() { return ZSTDCompressionParameters.nwindowLog(address()); }
        /** @return the value of the {@code chainLog} field. */
        @NativeType("unsigned int")
        public int chainLog() { return ZSTDCompressionParameters.nchainLog(address()); }
        /** @return the value of the {@code hashLog} field. */
        @NativeType("unsigned int")
        public int hashLog() { return ZSTDCompressionParameters.nhashLog(address()); }
        /** @return the value of the {@code searchLog} field. */
        @NativeType("unsigned int")
        public int searchLog() { return ZSTDCompressionParameters.nsearchLog(address()); }
        /** @return the value of the {@code minMatch} field. */
        @NativeType("unsigned int")
        public int minMatch() { return ZSTDCompressionParameters.nminMatch(address()); }
        /** @return the value of the {@code targetLength} field. */
        @NativeType("unsigned int")
        public int targetLength() { return ZSTDCompressionParameters.ntargetLength(address()); }
        /** @return the value of the {@code strategy} field. */
        @NativeType("ZSTD_strategy")
        public int strategy() { return ZSTDCompressionParameters.nstrategy(address()); }

        /** Sets the specified value to the {@code windowLog} field. */
        public ZSTDCompressionParameters.Buffer windowLog(@NativeType("unsigned int") int value) { ZSTDCompressionParameters.nwindowLog(address(), value); return this; }
        /** Sets the specified value to the {@code chainLog} field. */
        public ZSTDCompressionParameters.Buffer chainLog(@NativeType("unsigned int") int value) { ZSTDCompressionParameters.nchainLog(address(), value); return this; }
        /** Sets the specified value to the {@code hashLog} field. */
        public ZSTDCompressionParameters.Buffer hashLog(@NativeType("unsigned int") int value) { ZSTDCompressionParameters.nhashLog(address(), value); return this; }
        /** Sets the specified value to the {@code searchLog} field. */
        public ZSTDCompressionParameters.Buffer searchLog(@NativeType("unsigned int") int value) { ZSTDCompressionParameters.nsearchLog(address(), value); return this; }
        /** Sets the specified value to the {@code minMatch} field. */
        public ZSTDCompressionParameters.Buffer minMatch(@NativeType("unsigned int") int value) { ZSTDCompressionParameters.nminMatch(address(), value); return this; }
        /** Sets the specified value to the {@code targetLength} field. */
        public ZSTDCompressionParameters.Buffer targetLength(@NativeType("unsigned int") int value) { ZSTDCompressionParameters.ntargetLength(address(), value); return this; }
        /** Sets the specified value to the {@code strategy} field. */
        public ZSTDCompressionParameters.Buffer strategy(@NativeType("ZSTD_strategy") int value) { ZSTDCompressionParameters.nstrategy(address(), value); return this; }

    }

}
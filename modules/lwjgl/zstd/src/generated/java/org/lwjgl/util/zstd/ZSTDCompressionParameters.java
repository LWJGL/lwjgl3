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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code windowLog} &ndash; largest match distance: larger == more compression, more memory needed during decompression</li>
 * <li>{@code chainLog} &ndash; fully searched segment: larger == more compression, slower, more memory (useless for fast)</li>
 * <li>{@code hashLog} &ndash; dispatch table: larger == faster, more memory</li>
 * <li>{@code searchLog} &ndash; nb of searches: larger == more compression, slower</li>
 * <li>{@code minMatch} &ndash; match length searched: larger == faster decompression, sometimes less compression</li>
 * <li>{@code targetLength} &ndash; acceptable match size for optimal parser (only): larger == more compression, slower</li>
 * <li>{@code strategy} &ndash; see {@code ZSTD_strategy} definition</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ZSTD_compressionParameters {
 *     unsigned int windowLog;
 *     unsigned int chainLog;
 *     unsigned int hashLog;
 *     unsigned int searchLog;
 *     unsigned int minMatch;
 *     unsigned int targetLength;
 *     ZSTD_strategy strategy;
 * }</code></pre>
 */
@NativeType("struct ZSTD_compressionParameters")
public class ZSTDCompressionParameters extends Struct implements NativeResource {

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

    /** Returns the value of the {@code windowLog} field. */
    @NativeType("unsigned int")
    public int windowLog() { return nwindowLog(address()); }
    /** Returns the value of the {@code chainLog} field. */
    @NativeType("unsigned int")
    public int chainLog() { return nchainLog(address()); }
    /** Returns the value of the {@code hashLog} field. */
    @NativeType("unsigned int")
    public int hashLog() { return nhashLog(address()); }
    /** Returns the value of the {@code searchLog} field. */
    @NativeType("unsigned int")
    public int searchLog() { return nsearchLog(address()); }
    /** Returns the value of the {@code minMatch} field. */
    @NativeType("unsigned int")
    public int minMatch() { return nminMatch(address()); }
    /** Returns the value of the {@code targetLength} field. */
    @NativeType("unsigned int")
    public int targetLength() { return ntargetLength(address()); }
    /** Returns the value of the {@code strategy} field. */
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
        return wrap(ZSTDCompressionParameters.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZSTDCompressionParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDCompressionParameters calloc() {
        return wrap(ZSTDCompressionParameters.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZSTDCompressionParameters} instance allocated with {@link BufferUtils}. */
    public static ZSTDCompressionParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZSTDCompressionParameters.class, memAddress(container), container);
    }

    /** Returns a new {@code ZSTDCompressionParameters} instance for the specified memory address. */
    public static ZSTDCompressionParameters create(long address) {
        return wrap(ZSTDCompressionParameters.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDCompressionParameters createSafe(long address) {
        return address == NULL ? null : wrap(ZSTDCompressionParameters.class, address);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZSTDCompressionParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDCompressionParameters.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ZSTDCompressionParameters} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDCompressionParameters mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ZSTDCompressionParameters} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDCompressionParameters callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ZSTDCompressionParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCompressionParameters mallocStack(MemoryStack stack) {
        return wrap(ZSTDCompressionParameters.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZSTDCompressionParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDCompressionParameters callocStack(MemoryStack stack) {
        return wrap(ZSTDCompressionParameters.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDCompressionParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDCompressionParameters.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #windowLog}. */
    public static int nwindowLog(long struct) { return UNSAFE.getInt(null, struct + ZSTDCompressionParameters.WINDOWLOG); }
    /** Unsafe version of {@link #chainLog}. */
    public static int nchainLog(long struct) { return UNSAFE.getInt(null, struct + ZSTDCompressionParameters.CHAINLOG); }
    /** Unsafe version of {@link #hashLog}. */
    public static int nhashLog(long struct) { return UNSAFE.getInt(null, struct + ZSTDCompressionParameters.HASHLOG); }
    /** Unsafe version of {@link #searchLog}. */
    public static int nsearchLog(long struct) { return UNSAFE.getInt(null, struct + ZSTDCompressionParameters.SEARCHLOG); }
    /** Unsafe version of {@link #minMatch}. */
    public static int nminMatch(long struct) { return UNSAFE.getInt(null, struct + ZSTDCompressionParameters.MINMATCH); }
    /** Unsafe version of {@link #targetLength}. */
    public static int ntargetLength(long struct) { return UNSAFE.getInt(null, struct + ZSTDCompressionParameters.TARGETLENGTH); }
    /** Unsafe version of {@link #strategy}. */
    public static int nstrategy(long struct) { return UNSAFE.getInt(null, struct + ZSTDCompressionParameters.STRATEGY); }

    /** Unsafe version of {@link #windowLog(int) windowLog}. */
    public static void nwindowLog(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDCompressionParameters.WINDOWLOG, value); }
    /** Unsafe version of {@link #chainLog(int) chainLog}. */
    public static void nchainLog(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDCompressionParameters.CHAINLOG, value); }
    /** Unsafe version of {@link #hashLog(int) hashLog}. */
    public static void nhashLog(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDCompressionParameters.HASHLOG, value); }
    /** Unsafe version of {@link #searchLog(int) searchLog}. */
    public static void nsearchLog(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDCompressionParameters.SEARCHLOG, value); }
    /** Unsafe version of {@link #minMatch(int) minMatch}. */
    public static void nminMatch(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDCompressionParameters.MINMATCH, value); }
    /** Unsafe version of {@link #targetLength(int) targetLength}. */
    public static void ntargetLength(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDCompressionParameters.TARGETLENGTH, value); }
    /** Unsafe version of {@link #strategy(int) strategy}. */
    public static void nstrategy(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDCompressionParameters.STRATEGY, value); }

    // -----------------------------------

    /** An array of {@link ZSTDCompressionParameters} structs. */
    public static class Buffer extends StructBuffer<ZSTDCompressionParameters, Buffer> implements NativeResource {

        private static final ZSTDCompressionParameters ELEMENT_FACTORY = ZSTDCompressionParameters.create(-1L);

        /**
         * Creates a new {@code ZSTDCompressionParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDCompressionParameters#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDCompressionParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code windowLog} field. */
        @NativeType("unsigned int")
        public int windowLog() { return ZSTDCompressionParameters.nwindowLog(address()); }
        /** Returns the value of the {@code chainLog} field. */
        @NativeType("unsigned int")
        public int chainLog() { return ZSTDCompressionParameters.nchainLog(address()); }
        /** Returns the value of the {@code hashLog} field. */
        @NativeType("unsigned int")
        public int hashLog() { return ZSTDCompressionParameters.nhashLog(address()); }
        /** Returns the value of the {@code searchLog} field. */
        @NativeType("unsigned int")
        public int searchLog() { return ZSTDCompressionParameters.nsearchLog(address()); }
        /** Returns the value of the {@code minMatch} field. */
        @NativeType("unsigned int")
        public int minMatch() { return ZSTDCompressionParameters.nminMatch(address()); }
        /** Returns the value of the {@code targetLength} field. */
        @NativeType("unsigned int")
        public int targetLength() { return ZSTDCompressionParameters.ntargetLength(address()); }
        /** Returns the value of the {@code strategy} field. */
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
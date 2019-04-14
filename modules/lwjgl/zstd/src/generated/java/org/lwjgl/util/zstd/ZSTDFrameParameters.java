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
 * <li>{@code contentSizeFlag} &ndash; 1: content size will be in frame header (when known)</li>
 * <li>{@code checksumFlag} &ndash; 1: generate a 32-bits checksum using XXH64 algorithm at end of frame, for error detection</li>
 * <li>{@code noDictIDFlag} &ndash; 1: no {@code dictID} will be saved into frame header ({@code dictID} is only useful for dictionary compression)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ZSTD_frameParameters {
 *     int contentSizeFlag;
 *     int checksumFlag;
 *     int noDictIDFlag;
 * }</code></pre>
 */
@NativeType("struct ZSTD_frameParameters")
public class ZSTDFrameParameters extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTENTSIZEFLAG,
        CHECKSUMFLAG,
        NODICTIDFLAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTENTSIZEFLAG = layout.offsetof(0);
        CHECKSUMFLAG = layout.offsetof(1);
        NODICTIDFLAG = layout.offsetof(2);
    }

    /**
     * Creates a {@code ZSTDFrameParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDFrameParameters(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code contentSizeFlag} field. */
    public int contentSizeFlag() { return ncontentSizeFlag(address()); }
    /** Returns the value of the {@code checksumFlag} field. */
    public int checksumFlag() { return nchecksumFlag(address()); }
    /** Returns the value of the {@code noDictIDFlag} field. */
    public int noDictIDFlag() { return nnoDictIDFlag(address()); }

    /** Sets the specified value to the {@code contentSizeFlag} field. */
    public ZSTDFrameParameters contentSizeFlag(int value) { ncontentSizeFlag(address(), value); return this; }
    /** Sets the specified value to the {@code checksumFlag} field. */
    public ZSTDFrameParameters checksumFlag(int value) { nchecksumFlag(address(), value); return this; }
    /** Sets the specified value to the {@code noDictIDFlag} field. */
    public ZSTDFrameParameters noDictIDFlag(int value) { nnoDictIDFlag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ZSTDFrameParameters set(
        int contentSizeFlag,
        int checksumFlag,
        int noDictIDFlag
    ) {
        contentSizeFlag(contentSizeFlag);
        checksumFlag(checksumFlag);
        noDictIDFlag(noDictIDFlag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ZSTDFrameParameters set(ZSTDFrameParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ZSTDFrameParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDFrameParameters malloc() {
        return wrap(ZSTDFrameParameters.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZSTDFrameParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDFrameParameters calloc() {
        return wrap(ZSTDFrameParameters.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZSTDFrameParameters} instance allocated with {@link BufferUtils}. */
    public static ZSTDFrameParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZSTDFrameParameters.class, memAddress(container), container);
    }

    /** Returns a new {@code ZSTDFrameParameters} instance for the specified memory address. */
    public static ZSTDFrameParameters create(long address) {
        return wrap(ZSTDFrameParameters.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDFrameParameters createSafe(long address) {
        return address == NULL ? null : wrap(ZSTDFrameParameters.class, address);
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameParameters.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameParameters.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameParameters.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZSTDFrameParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameParameters.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDFrameParameters.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ZSTDFrameParameters} instance allocated on the thread-local {@link MemoryStack}. */
    public static ZSTDFrameParameters mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ZSTDFrameParameters} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ZSTDFrameParameters callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ZSTDFrameParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameParameters mallocStack(MemoryStack stack) {
        return wrap(ZSTDFrameParameters.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZSTDFrameParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameParameters callocStack(MemoryStack stack) {
        return wrap(ZSTDFrameParameters.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameParameters.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameParameters.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameParameters.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameParameters.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #contentSizeFlag}. */
    public static int ncontentSizeFlag(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameParameters.CONTENTSIZEFLAG); }
    /** Unsafe version of {@link #checksumFlag}. */
    public static int nchecksumFlag(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameParameters.CHECKSUMFLAG); }
    /** Unsafe version of {@link #noDictIDFlag}. */
    public static int nnoDictIDFlag(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameParameters.NODICTIDFLAG); }

    /** Unsafe version of {@link #contentSizeFlag(int) contentSizeFlag}. */
    public static void ncontentSizeFlag(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDFrameParameters.CONTENTSIZEFLAG, value); }
    /** Unsafe version of {@link #checksumFlag(int) checksumFlag}. */
    public static void nchecksumFlag(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDFrameParameters.CHECKSUMFLAG, value); }
    /** Unsafe version of {@link #noDictIDFlag(int) noDictIDFlag}. */
    public static void nnoDictIDFlag(long struct, int value) { UNSAFE.putInt(null, struct + ZSTDFrameParameters.NODICTIDFLAG, value); }

    // -----------------------------------

    /** An array of {@link ZSTDFrameParameters} structs. */
    public static class Buffer extends StructBuffer<ZSTDFrameParameters, Buffer> implements NativeResource {

        private static final ZSTDFrameParameters ELEMENT_FACTORY = ZSTDFrameParameters.create(-1L);

        /**
         * Creates a new {@code ZSTDFrameParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDFrameParameters#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDFrameParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code contentSizeFlag} field. */
        public int contentSizeFlag() { return ZSTDFrameParameters.ncontentSizeFlag(address()); }
        /** Returns the value of the {@code checksumFlag} field. */
        public int checksumFlag() { return ZSTDFrameParameters.nchecksumFlag(address()); }
        /** Returns the value of the {@code noDictIDFlag} field. */
        public int noDictIDFlag() { return ZSTDFrameParameters.nnoDictIDFlag(address()); }

        /** Sets the specified value to the {@code contentSizeFlag} field. */
        public ZSTDFrameParameters.Buffer contentSizeFlag(int value) { ZSTDFrameParameters.ncontentSizeFlag(address(), value); return this; }
        /** Sets the specified value to the {@code checksumFlag} field. */
        public ZSTDFrameParameters.Buffer checksumFlag(int value) { ZSTDFrameParameters.nchecksumFlag(address(), value); return this; }
        /** Sets the specified value to the {@code noDictIDFlag} field. */
        public ZSTDFrameParameters.Buffer noDictIDFlag(int value) { ZSTDFrameParameters.nnoDictIDFlag(address(), value); return this; }

    }

}
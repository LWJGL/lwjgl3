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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ZSTD_frameHeader {
 *     unsigned long long {@link #frameContentSize};
 *     unsigned long long {@link #windowSize};
 *     unsigned int blockSizeMax;
 *     ZSTD_frameType_e {@link #frameType};
 *     unsigned int headerSize;
 *     unsigned int dictID;
 *     unsigned int checksumFlag;
 *     unsigned _reserved1;
 *     unsigned _reserved2;
 * }</code></pre>
 */
@NativeType("struct ZSTD_frameHeader")
public class ZSTDFrameHeader extends Struct<ZSTDFrameHeader> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FRAMECONTENTSIZE,
        WINDOWSIZE,
        BLOCKSIZEMAX,
        FRAMETYPE,
        HEADERSIZE,
        DICTID,
        CHECKSUMFLAG,
        _RESERVED1,
        _RESERVED2;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
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

        FRAMECONTENTSIZE = layout.offsetof(0);
        WINDOWSIZE = layout.offsetof(1);
        BLOCKSIZEMAX = layout.offsetof(2);
        FRAMETYPE = layout.offsetof(3);
        HEADERSIZE = layout.offsetof(4);
        DICTID = layout.offsetof(5);
        CHECKSUMFLAG = layout.offsetof(6);
        _RESERVED1 = layout.offsetof(7);
        _RESERVED2 = layout.offsetof(8);
    }

    protected ZSTDFrameHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ZSTDFrameHeader create(long address, @Nullable ByteBuffer container) {
        return new ZSTDFrameHeader(address, container);
    }

    /**
     * Creates a {@code ZSTDFrameHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDFrameHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** if == {@link Zstd#ZSTD_CONTENTSIZE_UNKNOWN CONTENTSIZE_UNKNOWN}, it means this field is not available. 0 means "empty" */
    @NativeType("unsigned long long")
    public long frameContentSize() { return nframeContentSize(address()); }
    /** can be very large, up to &le; {@code frameContentSize} */
    @NativeType("unsigned long long")
    public long windowSize() { return nwindowSize(address()); }
    /** @return the value of the {@code blockSizeMax} field. */
    @NativeType("unsigned int")
    public int blockSizeMax() { return nblockSizeMax(address()); }
    /** if == {@link ZstdX#ZSTD_skippableFrame skippableFrame}, {@code frameContentSize} is the size of skippable content */
    @NativeType("ZSTD_frameType_e")
    public int frameType() { return nframeType(address()); }
    /** @return the value of the {@code headerSize} field. */
    @NativeType("unsigned int")
    public int headerSize() { return nheaderSize(address()); }
    /** @return the value of the {@code dictID} field. */
    @NativeType("unsigned int")
    public int dictID() { return ndictID(address()); }
    /** @return the value of the {@code checksumFlag} field. */
    @NativeType("unsigned int")
    public int checksumFlag() { return nchecksumFlag(address()); }

    // -----------------------------------

    /** Returns a new {@code ZSTDFrameHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDFrameHeader malloc() {
        return new ZSTDFrameHeader(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ZSTDFrameHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDFrameHeader calloc() {
        return new ZSTDFrameHeader(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ZSTDFrameHeader} instance allocated with {@link BufferUtils}. */
    public static ZSTDFrameHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ZSTDFrameHeader(memAddress(container), container);
    }

    /** Returns a new {@code ZSTDFrameHeader} instance for the specified memory address. */
    public static ZSTDFrameHeader create(long address) {
        return new ZSTDFrameHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDFrameHeader createSafe(long address) {
        return address == NULL ? null : new ZSTDFrameHeader(address, null);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameHeader.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameHeader.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ZSTDFrameHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDFrameHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameHeader mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameHeader callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameHeader mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameHeader callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameHeader.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameHeader.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameHeader.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ZSTDFrameHeader.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ZSTDFrameHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameHeader malloc(MemoryStack stack) {
        return new ZSTDFrameHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ZSTDFrameHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDFrameHeader calloc(MemoryStack stack) {
        return new ZSTDFrameHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDFrameHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDFrameHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #frameContentSize}. */
    public static long nframeContentSize(long struct) { return UNSAFE.getLong(null, struct + ZSTDFrameHeader.FRAMECONTENTSIZE); }
    /** Unsafe version of {@link #windowSize}. */
    public static long nwindowSize(long struct) { return UNSAFE.getLong(null, struct + ZSTDFrameHeader.WINDOWSIZE); }
    /** Unsafe version of {@link #blockSizeMax}. */
    public static int nblockSizeMax(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameHeader.BLOCKSIZEMAX); }
    /** Unsafe version of {@link #frameType}. */
    public static int nframeType(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameHeader.FRAMETYPE); }
    /** Unsafe version of {@link #headerSize}. */
    public static int nheaderSize(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameHeader.HEADERSIZE); }
    /** Unsafe version of {@link #dictID}. */
    public static int ndictID(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameHeader.DICTID); }
    /** Unsafe version of {@link #checksumFlag}. */
    public static int nchecksumFlag(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameHeader.CHECKSUMFLAG); }
    public static int n_reserved1(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameHeader._RESERVED1); }
    public static int n_reserved2(long struct) { return UNSAFE.getInt(null, struct + ZSTDFrameHeader._RESERVED2); }

    // -----------------------------------

    /** An array of {@link ZSTDFrameHeader} structs. */
    public static class Buffer extends StructBuffer<ZSTDFrameHeader, Buffer> implements NativeResource {

        private static final ZSTDFrameHeader ELEMENT_FACTORY = ZSTDFrameHeader.create(-1L);

        /**
         * Creates a new {@code ZSTDFrameHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDFrameHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected ZSTDFrameHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ZSTDFrameHeader#frameContentSize} field. */
        @NativeType("unsigned long long")
        public long frameContentSize() { return ZSTDFrameHeader.nframeContentSize(address()); }
        /** @return the value of the {@link ZSTDFrameHeader#windowSize} field. */
        @NativeType("unsigned long long")
        public long windowSize() { return ZSTDFrameHeader.nwindowSize(address()); }
        /** @return the value of the {@code blockSizeMax} field. */
        @NativeType("unsigned int")
        public int blockSizeMax() { return ZSTDFrameHeader.nblockSizeMax(address()); }
        /** @return the value of the {@link ZSTDFrameHeader#frameType} field. */
        @NativeType("ZSTD_frameType_e")
        public int frameType() { return ZSTDFrameHeader.nframeType(address()); }
        /** @return the value of the {@code headerSize} field. */
        @NativeType("unsigned int")
        public int headerSize() { return ZSTDFrameHeader.nheaderSize(address()); }
        /** @return the value of the {@code dictID} field. */
        @NativeType("unsigned int")
        public int dictID() { return ZSTDFrameHeader.ndictID(address()); }
        /** @return the value of the {@code checksumFlag} field. */
        @NativeType("unsigned int")
        public int checksumFlag() { return ZSTDFrameHeader.nchecksumFlag(address()); }

    }

}
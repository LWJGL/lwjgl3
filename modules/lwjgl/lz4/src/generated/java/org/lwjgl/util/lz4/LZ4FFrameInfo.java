/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct LZ4F_frameInfo_t {
 *     LZ4F_blockSizeID_t blockSizeID;
 *     LZ4F_blockMode_t blockMode;
 *     LZ4F_contentChecksum_t contentChecksumFlag;
 *     LZ4F_frameType_t frameType;
 *     unsigned long long contentSize;
 *     unsigned dictID;
 *     LZ4F_blockChecksum_t blockChecksumFlag;
 * }}</pre>
 */
@NativeType("struct LZ4F_frameInfo_t")
public class LZ4FFrameInfo extends Struct<LZ4FFrameInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLOCKSIZEID,
        BLOCKMODE,
        CONTENTCHECKSUMFLAG,
        FRAMETYPE,
        CONTENTSIZE,
        DICTID,
        BLOCKCHECKSUMFLAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLOCKSIZEID = layout.offsetof(0);
        BLOCKMODE = layout.offsetof(1);
        CONTENTCHECKSUMFLAG = layout.offsetof(2);
        FRAMETYPE = layout.offsetof(3);
        CONTENTSIZE = layout.offsetof(4);
        DICTID = layout.offsetof(5);
        BLOCKCHECKSUMFLAG = layout.offsetof(6);
    }

    protected LZ4FFrameInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LZ4FFrameInfo create(long address, @Nullable ByteBuffer container) {
        return new LZ4FFrameInfo(address, container);
    }

    /**
     * Creates a {@code LZ4FFrameInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4FFrameInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code blockSizeID} field. */
    @NativeType("LZ4F_blockSizeID_t")
    public int blockSizeID() { return nblockSizeID(address()); }
    /** @return the value of the {@code blockMode} field. */
    @NativeType("LZ4F_blockMode_t")
    public int blockMode() { return nblockMode(address()); }
    /** @return the value of the {@code contentChecksumFlag} field. */
    @NativeType("LZ4F_contentChecksum_t")
    public int contentChecksumFlag() { return ncontentChecksumFlag(address()); }
    /** @return the value of the {@code frameType} field. */
    @NativeType("LZ4F_frameType_t")
    public int frameType() { return nframeType(address()); }
    /** @return the value of the {@code contentSize} field. */
    @NativeType("unsigned long long")
    public long contentSize() { return ncontentSize(address()); }
    /** @return the value of the {@code dictID} field. */
    @NativeType("unsigned")
    public int dictID() { return ndictID(address()); }
    /** @return the value of the {@code blockChecksumFlag} field. */
    @NativeType("LZ4F_blockChecksum_t")
    public int blockChecksumFlag() { return nblockChecksumFlag(address()); }

    /** Sets the specified value to the {@code blockSizeID} field. */
    public LZ4FFrameInfo blockSizeID(@NativeType("LZ4F_blockSizeID_t") int value) { nblockSizeID(address(), value); return this; }
    /** Sets the specified value to the {@code blockMode} field. */
    public LZ4FFrameInfo blockMode(@NativeType("LZ4F_blockMode_t") int value) { nblockMode(address(), value); return this; }
    /** Sets the specified value to the {@code contentChecksumFlag} field. */
    public LZ4FFrameInfo contentChecksumFlag(@NativeType("LZ4F_contentChecksum_t") int value) { ncontentChecksumFlag(address(), value); return this; }
    /** Sets the specified value to the {@code frameType} field. */
    public LZ4FFrameInfo frameType(@NativeType("LZ4F_frameType_t") int value) { nframeType(address(), value); return this; }
    /** Sets the specified value to the {@code contentSize} field. */
    public LZ4FFrameInfo contentSize(@NativeType("unsigned long long") long value) { ncontentSize(address(), value); return this; }
    /** Sets the specified value to the {@code dictID} field. */
    public LZ4FFrameInfo dictID(@NativeType("unsigned") int value) { ndictID(address(), value); return this; }
    /** Sets the specified value to the {@code blockChecksumFlag} field. */
    public LZ4FFrameInfo blockChecksumFlag(@NativeType("LZ4F_blockChecksum_t") int value) { nblockChecksumFlag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LZ4FFrameInfo set(
        int blockSizeID,
        int blockMode,
        int contentChecksumFlag,
        int frameType,
        long contentSize,
        int dictID,
        int blockChecksumFlag
    ) {
        blockSizeID(blockSizeID);
        blockMode(blockMode);
        contentChecksumFlag(contentChecksumFlag);
        frameType(frameType);
        contentSize(contentSize);
        dictID(dictID);
        blockChecksumFlag(blockChecksumFlag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LZ4FFrameInfo set(LZ4FFrameInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LZ4FFrameInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LZ4FFrameInfo malloc() {
        return new LZ4FFrameInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LZ4FFrameInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LZ4FFrameInfo calloc() {
        return new LZ4FFrameInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LZ4FFrameInfo} instance allocated with {@link BufferUtils}. */
    public static LZ4FFrameInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LZ4FFrameInfo(memAddress(container), container);
    }

    /** Returns a new {@code LZ4FFrameInfo} instance for the specified memory address. */
    public static LZ4FFrameInfo create(long address) {
        return new LZ4FFrameInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable LZ4FFrameInfo createSafe(long address) {
        return address == NULL ? null : new LZ4FFrameInfo(address, null);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FFrameInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FFrameInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FFrameInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LZ4FFrameInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4FFrameInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static LZ4FFrameInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FFrameInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FFrameInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FFrameInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FFrameInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FFrameInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FFrameInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FFrameInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FFrameInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code LZ4FFrameInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FFrameInfo malloc(MemoryStack stack) {
        return new LZ4FFrameInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LZ4FFrameInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FFrameInfo calloc(MemoryStack stack) {
        return new LZ4FFrameInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FFrameInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FFrameInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FFrameInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blockSizeID}. */
    public static int nblockSizeID(long struct) { return memGetInt(struct + LZ4FFrameInfo.BLOCKSIZEID); }
    /** Unsafe version of {@link #blockMode}. */
    public static int nblockMode(long struct) { return memGetInt(struct + LZ4FFrameInfo.BLOCKMODE); }
    /** Unsafe version of {@link #contentChecksumFlag}. */
    public static int ncontentChecksumFlag(long struct) { return memGetInt(struct + LZ4FFrameInfo.CONTENTCHECKSUMFLAG); }
    /** Unsafe version of {@link #frameType}. */
    public static int nframeType(long struct) { return memGetInt(struct + LZ4FFrameInfo.FRAMETYPE); }
    /** Unsafe version of {@link #contentSize}. */
    public static long ncontentSize(long struct) { return memGetLong(struct + LZ4FFrameInfo.CONTENTSIZE); }
    /** Unsafe version of {@link #dictID}. */
    public static int ndictID(long struct) { return memGetInt(struct + LZ4FFrameInfo.DICTID); }
    /** Unsafe version of {@link #blockChecksumFlag}. */
    public static int nblockChecksumFlag(long struct) { return memGetInt(struct + LZ4FFrameInfo.BLOCKCHECKSUMFLAG); }

    /** Unsafe version of {@link #blockSizeID(int) blockSizeID}. */
    public static void nblockSizeID(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.BLOCKSIZEID, value); }
    /** Unsafe version of {@link #blockMode(int) blockMode}. */
    public static void nblockMode(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.BLOCKMODE, value); }
    /** Unsafe version of {@link #contentChecksumFlag(int) contentChecksumFlag}. */
    public static void ncontentChecksumFlag(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.CONTENTCHECKSUMFLAG, value); }
    /** Unsafe version of {@link #frameType(int) frameType}. */
    public static void nframeType(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.FRAMETYPE, value); }
    /** Unsafe version of {@link #contentSize(long) contentSize}. */
    public static void ncontentSize(long struct, long value) { memPutLong(struct + LZ4FFrameInfo.CONTENTSIZE, value); }
    /** Unsafe version of {@link #dictID(int) dictID}. */
    public static void ndictID(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.DICTID, value); }
    /** Unsafe version of {@link #blockChecksumFlag(int) blockChecksumFlag}. */
    public static void nblockChecksumFlag(long struct, int value) { memPutInt(struct + LZ4FFrameInfo.BLOCKCHECKSUMFLAG, value); }

    // -----------------------------------

    /** An array of {@link LZ4FFrameInfo} structs. */
    public static class Buffer extends StructBuffer<LZ4FFrameInfo, Buffer> implements NativeResource {

        private static final LZ4FFrameInfo ELEMENT_FACTORY = LZ4FFrameInfo.create(-1L);

        /**
         * Creates a new {@code LZ4FFrameInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4FFrameInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected LZ4FFrameInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code blockSizeID} field. */
        @NativeType("LZ4F_blockSizeID_t")
        public int blockSizeID() { return LZ4FFrameInfo.nblockSizeID(address()); }
        /** @return the value of the {@code blockMode} field. */
        @NativeType("LZ4F_blockMode_t")
        public int blockMode() { return LZ4FFrameInfo.nblockMode(address()); }
        /** @return the value of the {@code contentChecksumFlag} field. */
        @NativeType("LZ4F_contentChecksum_t")
        public int contentChecksumFlag() { return LZ4FFrameInfo.ncontentChecksumFlag(address()); }
        /** @return the value of the {@code frameType} field. */
        @NativeType("LZ4F_frameType_t")
        public int frameType() { return LZ4FFrameInfo.nframeType(address()); }
        /** @return the value of the {@code contentSize} field. */
        @NativeType("unsigned long long")
        public long contentSize() { return LZ4FFrameInfo.ncontentSize(address()); }
        /** @return the value of the {@code dictID} field. */
        @NativeType("unsigned")
        public int dictID() { return LZ4FFrameInfo.ndictID(address()); }
        /** @return the value of the {@code blockChecksumFlag} field. */
        @NativeType("LZ4F_blockChecksum_t")
        public int blockChecksumFlag() { return LZ4FFrameInfo.nblockChecksumFlag(address()); }

        /** Sets the specified value to the {@code blockSizeID} field. */
        public LZ4FFrameInfo.Buffer blockSizeID(@NativeType("LZ4F_blockSizeID_t") int value) { LZ4FFrameInfo.nblockSizeID(address(), value); return this; }
        /** Sets the specified value to the {@code blockMode} field. */
        public LZ4FFrameInfo.Buffer blockMode(@NativeType("LZ4F_blockMode_t") int value) { LZ4FFrameInfo.nblockMode(address(), value); return this; }
        /** Sets the specified value to the {@code contentChecksumFlag} field. */
        public LZ4FFrameInfo.Buffer contentChecksumFlag(@NativeType("LZ4F_contentChecksum_t") int value) { LZ4FFrameInfo.ncontentChecksumFlag(address(), value); return this; }
        /** Sets the specified value to the {@code frameType} field. */
        public LZ4FFrameInfo.Buffer frameType(@NativeType("LZ4F_frameType_t") int value) { LZ4FFrameInfo.nframeType(address(), value); return this; }
        /** Sets the specified value to the {@code contentSize} field. */
        public LZ4FFrameInfo.Buffer contentSize(@NativeType("unsigned long long") long value) { LZ4FFrameInfo.ncontentSize(address(), value); return this; }
        /** Sets the specified value to the {@code dictID} field. */
        public LZ4FFrameInfo.Buffer dictID(@NativeType("unsigned") int value) { LZ4FFrameInfo.ndictID(address(), value); return this; }
        /** Sets the specified value to the {@code blockChecksumFlag} field. */
        public LZ4FFrameInfo.Buffer blockChecksumFlag(@NativeType("LZ4F_blockChecksum_t") int value) { LZ4FFrameInfo.nblockChecksumFlag(address(), value); return this; }

    }

}
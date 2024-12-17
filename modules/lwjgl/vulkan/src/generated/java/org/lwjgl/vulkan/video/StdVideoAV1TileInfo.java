/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoAV1TileInfo {
 *     {@link StdVideoAV1TileInfoFlag StdVideoAV1TileInfoFlag} flags;
 *     uint8_t TileCols;
 *     uint8_t TileRows;
 *     uint16_t context_update_tile_id;
 *     uint8_t tile_size_bytes_minus_1;
 *     uint8_t reserved1[7];
 *     uint16_t const * pMiColStarts;
 *     uint16_t const * pMiRowStarts;
 *     uint16_t const * pWidthInSbsMinus1;
 *     uint16_t const * pHeightInSbsMinus1;
 * }}</pre>
 */
public class StdVideoAV1TileInfo extends Struct<StdVideoAV1TileInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        TILECOLS,
        TILEROWS,
        CONTEXT_UPDATE_TILE_ID,
        TILE_SIZE_BYTES_MINUS_1,
        RESERVED1,
        PMICOLSTARTS,
        PMIROWSTARTS,
        PWIDTHINSBSMINUS1,
        PHEIGHTINSBSMINUS1;

    static {
        Layout layout = __struct(
            __member(StdVideoAV1TileInfoFlag.SIZEOF, StdVideoAV1TileInfoFlag.ALIGNOF),
            __member(1),
            __member(1),
            __member(2),
            __member(1),
            __array(1, 7),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        TILECOLS = layout.offsetof(1);
        TILEROWS = layout.offsetof(2);
        CONTEXT_UPDATE_TILE_ID = layout.offsetof(3);
        TILE_SIZE_BYTES_MINUS_1 = layout.offsetof(4);
        RESERVED1 = layout.offsetof(5);
        PMICOLSTARTS = layout.offsetof(6);
        PMIROWSTARTS = layout.offsetof(7);
        PWIDTHINSBSMINUS1 = layout.offsetof(8);
        PHEIGHTINSBSMINUS1 = layout.offsetof(9);
    }

    protected StdVideoAV1TileInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1TileInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1TileInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1TileInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1TileInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoAV1TileInfoFlag} view of the {@code flags} field. */
    public StdVideoAV1TileInfoFlag flags() { return nflags(address()); }
    /** @return the value of the {@code TileCols} field. */
    @NativeType("uint8_t")
    public byte TileCols() { return nTileCols(address()); }
    /** @return the value of the {@code TileRows} field. */
    @NativeType("uint8_t")
    public byte TileRows() { return nTileRows(address()); }
    /** @return the value of the {@code context_update_tile_id} field. */
    @NativeType("uint16_t")
    public short context_update_tile_id() { return ncontext_update_tile_id(address()); }
    /** @return the value of the {@code tile_size_bytes_minus_1} field. */
    @NativeType("uint8_t")
    public byte tile_size_bytes_minus_1() { return ntile_size_bytes_minus_1(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code pMiColStarts} field. */
    @NativeType("uint16_t const *")
    public ShortBuffer pMiColStarts() { return npMiColStarts(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code pMiRowStarts} field. */
    @NativeType("uint16_t const *")
    public ShortBuffer pMiRowStarts() { return npMiRowStarts(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code pWidthInSbsMinus1} field. */
    @NativeType("uint16_t const *")
    public ShortBuffer pWidthInSbsMinus1() { return npWidthInSbsMinus1(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code pHeightInSbsMinus1} field. */
    @NativeType("uint16_t const *")
    public ShortBuffer pHeightInSbsMinus1() { return npHeightInSbsMinus1(address()); }

    /** Copies the specified {@link StdVideoAV1TileInfoFlag} to the {@code flags} field. */
    public StdVideoAV1TileInfo flags(StdVideoAV1TileInfoFlag value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoAV1TileInfo flags(java.util.function.Consumer<StdVideoAV1TileInfoFlag> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code TileCols} field. */
    public StdVideoAV1TileInfo TileCols(@NativeType("uint8_t") byte value) { nTileCols(address(), value); return this; }
    /** Sets the specified value to the {@code TileRows} field. */
    public StdVideoAV1TileInfo TileRows(@NativeType("uint8_t") byte value) { nTileRows(address(), value); return this; }
    /** Sets the specified value to the {@code context_update_tile_id} field. */
    public StdVideoAV1TileInfo context_update_tile_id(@NativeType("uint16_t") short value) { ncontext_update_tile_id(address(), value); return this; }
    /** Sets the specified value to the {@code tile_size_bytes_minus_1} field. */
    public StdVideoAV1TileInfo tile_size_bytes_minus_1(@NativeType("uint8_t") byte value) { ntile_size_bytes_minus_1(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code pMiColStarts} field. */
    public StdVideoAV1TileInfo pMiColStarts(@NativeType("uint16_t const *") ShortBuffer value) { npMiColStarts(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code pMiRowStarts} field. */
    public StdVideoAV1TileInfo pMiRowStarts(@NativeType("uint16_t const *") ShortBuffer value) { npMiRowStarts(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code pWidthInSbsMinus1} field. */
    public StdVideoAV1TileInfo pWidthInSbsMinus1(@NativeType("uint16_t const *") ShortBuffer value) { npWidthInSbsMinus1(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code pHeightInSbsMinus1} field. */
    public StdVideoAV1TileInfo pHeightInSbsMinus1(@NativeType("uint16_t const *") ShortBuffer value) { npHeightInSbsMinus1(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1TileInfo set(
        StdVideoAV1TileInfoFlag flags,
        byte TileCols,
        byte TileRows,
        short context_update_tile_id,
        byte tile_size_bytes_minus_1,
        ShortBuffer pMiColStarts,
        ShortBuffer pMiRowStarts,
        ShortBuffer pWidthInSbsMinus1,
        ShortBuffer pHeightInSbsMinus1
    ) {
        flags(flags);
        TileCols(TileCols);
        TileRows(TileRows);
        context_update_tile_id(context_update_tile_id);
        tile_size_bytes_minus_1(tile_size_bytes_minus_1);
        pMiColStarts(pMiColStarts);
        pMiRowStarts(pMiRowStarts);
        pWidthInSbsMinus1(pWidthInSbsMinus1);
        pHeightInSbsMinus1(pHeightInSbsMinus1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1TileInfo set(StdVideoAV1TileInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1TileInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1TileInfo malloc() {
        return new StdVideoAV1TileInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1TileInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1TileInfo calloc() {
        return new StdVideoAV1TileInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1TileInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1TileInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1TileInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1TileInfo} instance for the specified memory address. */
    public static StdVideoAV1TileInfo create(long address) {
        return new StdVideoAV1TileInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1TileInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1TileInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1TileInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1TileInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1TileInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1TileInfo malloc(MemoryStack stack) {
        return new StdVideoAV1TileInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1TileInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1TileInfo calloc(MemoryStack stack) {
        return new StdVideoAV1TileInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoAV1TileInfoFlag nflags(long struct) { return StdVideoAV1TileInfoFlag.create(struct + StdVideoAV1TileInfo.FLAGS); }
    /** Unsafe version of {@link #TileCols}. */
    public static byte nTileCols(long struct) { return memGetByte(struct + StdVideoAV1TileInfo.TILECOLS); }
    /** Unsafe version of {@link #TileRows}. */
    public static byte nTileRows(long struct) { return memGetByte(struct + StdVideoAV1TileInfo.TILEROWS); }
    /** Unsafe version of {@link #context_update_tile_id}. */
    public static short ncontext_update_tile_id(long struct) { return memGetShort(struct + StdVideoAV1TileInfo.CONTEXT_UPDATE_TILE_ID); }
    /** Unsafe version of {@link #tile_size_bytes_minus_1}. */
    public static byte ntile_size_bytes_minus_1(long struct) { return memGetByte(struct + StdVideoAV1TileInfo.TILE_SIZE_BYTES_MINUS_1); }
    public static ByteBuffer nreserved1(long struct) { return memByteBuffer(struct + StdVideoAV1TileInfo.RESERVED1, 7); }
    public static byte nreserved1(long struct, int index) {
        return memGetByte(struct + StdVideoAV1TileInfo.RESERVED1 + check(index, 7) * 1);
    }
    /** Unsafe version of {@link #pMiColStarts() pMiColStarts}. */
    public static ShortBuffer npMiColStarts(long struct) { return memShortBuffer(memGetAddress(struct + StdVideoAV1TileInfo.PMICOLSTARTS), Byte.toUnsignedInt(nTileCols(struct))); }
    /** Unsafe version of {@link #pMiRowStarts() pMiRowStarts}. */
    public static ShortBuffer npMiRowStarts(long struct) { return memShortBuffer(memGetAddress(struct + StdVideoAV1TileInfo.PMIROWSTARTS), Byte.toUnsignedInt(nTileRows(struct))); }
    /** Unsafe version of {@link #pWidthInSbsMinus1() pWidthInSbsMinus1}. */
    public static ShortBuffer npWidthInSbsMinus1(long struct) { return memShortBuffer(memGetAddress(struct + StdVideoAV1TileInfo.PWIDTHINSBSMINUS1), Byte.toUnsignedInt(nTileCols(struct))); }
    /** Unsafe version of {@link #pHeightInSbsMinus1() pHeightInSbsMinus1}. */
    public static ShortBuffer npHeightInSbsMinus1(long struct) { return memShortBuffer(memGetAddress(struct + StdVideoAV1TileInfo.PHEIGHTINSBSMINUS1), Byte.toUnsignedInt(nTileRows(struct))); }

    /** Unsafe version of {@link #flags(StdVideoAV1TileInfoFlag) flags}. */
    public static void nflags(long struct, StdVideoAV1TileInfoFlag value) { memCopy(value.address(), struct + StdVideoAV1TileInfo.FLAGS, StdVideoAV1TileInfoFlag.SIZEOF); }
    /** Sets the specified value to the {@code TileCols} field of the specified {@code struct}. */
    public static void nTileCols(long struct, byte value) { memPutByte(struct + StdVideoAV1TileInfo.TILECOLS, value); }
    /** Sets the specified value to the {@code TileRows} field of the specified {@code struct}. */
    public static void nTileRows(long struct, byte value) { memPutByte(struct + StdVideoAV1TileInfo.TILEROWS, value); }
    /** Unsafe version of {@link #context_update_tile_id(short) context_update_tile_id}. */
    public static void ncontext_update_tile_id(long struct, short value) { memPutShort(struct + StdVideoAV1TileInfo.CONTEXT_UPDATE_TILE_ID, value); }
    /** Unsafe version of {@link #tile_size_bytes_minus_1(byte) tile_size_bytes_minus_1}. */
    public static void ntile_size_bytes_minus_1(long struct, byte value) { memPutByte(struct + StdVideoAV1TileInfo.TILE_SIZE_BYTES_MINUS_1, value); }
    public static void nreserved1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + StdVideoAV1TileInfo.RESERVED1, value.remaining() * 1);
    }
    public static void nreserved1(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1TileInfo.RESERVED1 + check(index, 7) * 1, value);
    }
    /** Unsafe version of {@link #pMiColStarts(ShortBuffer) pMiColStarts}. */
    public static void npMiColStarts(long struct, ShortBuffer value) { memPutAddress(struct + StdVideoAV1TileInfo.PMICOLSTARTS, memAddress(value)); }
    /** Unsafe version of {@link #pMiRowStarts(ShortBuffer) pMiRowStarts}. */
    public static void npMiRowStarts(long struct, ShortBuffer value) { memPutAddress(struct + StdVideoAV1TileInfo.PMIROWSTARTS, memAddress(value)); }
    /** Unsafe version of {@link #pWidthInSbsMinus1(ShortBuffer) pWidthInSbsMinus1}. */
    public static void npWidthInSbsMinus1(long struct, ShortBuffer value) { memPutAddress(struct + StdVideoAV1TileInfo.PWIDTHINSBSMINUS1, memAddress(value)); }
    /** Unsafe version of {@link #pHeightInSbsMinus1(ShortBuffer) pHeightInSbsMinus1}. */
    public static void npHeightInSbsMinus1(long struct, ShortBuffer value) { memPutAddress(struct + StdVideoAV1TileInfo.PHEIGHTINSBSMINUS1, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoAV1TileInfo.PMICOLSTARTS));
        check(memGetAddress(struct + StdVideoAV1TileInfo.PMIROWSTARTS));
        check(memGetAddress(struct + StdVideoAV1TileInfo.PWIDTHINSBSMINUS1));
        check(memGetAddress(struct + StdVideoAV1TileInfo.PHEIGHTINSBSMINUS1));
    }

    // -----------------------------------

    /** An array of {@link StdVideoAV1TileInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1TileInfo, Buffer> implements NativeResource {

        private static final StdVideoAV1TileInfo ELEMENT_FACTORY = StdVideoAV1TileInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1TileInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1TileInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1TileInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoAV1TileInfoFlag} view of the {@code flags} field. */
        public StdVideoAV1TileInfoFlag flags() { return StdVideoAV1TileInfo.nflags(address()); }
        /** @return the value of the {@code TileCols} field. */
        @NativeType("uint8_t")
        public byte TileCols() { return StdVideoAV1TileInfo.nTileCols(address()); }
        /** @return the value of the {@code TileRows} field. */
        @NativeType("uint8_t")
        public byte TileRows() { return StdVideoAV1TileInfo.nTileRows(address()); }
        /** @return the value of the {@code context_update_tile_id} field. */
        @NativeType("uint16_t")
        public short context_update_tile_id() { return StdVideoAV1TileInfo.ncontext_update_tile_id(address()); }
        /** @return the value of the {@code tile_size_bytes_minus_1} field. */
        @NativeType("uint8_t")
        public byte tile_size_bytes_minus_1() { return StdVideoAV1TileInfo.ntile_size_bytes_minus_1(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code pMiColStarts} field. */
        @NativeType("uint16_t const *")
        public ShortBuffer pMiColStarts() { return StdVideoAV1TileInfo.npMiColStarts(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code pMiRowStarts} field. */
        @NativeType("uint16_t const *")
        public ShortBuffer pMiRowStarts() { return StdVideoAV1TileInfo.npMiRowStarts(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code pWidthInSbsMinus1} field. */
        @NativeType("uint16_t const *")
        public ShortBuffer pWidthInSbsMinus1() { return StdVideoAV1TileInfo.npWidthInSbsMinus1(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code pHeightInSbsMinus1} field. */
        @NativeType("uint16_t const *")
        public ShortBuffer pHeightInSbsMinus1() { return StdVideoAV1TileInfo.npHeightInSbsMinus1(address()); }

        /** Copies the specified {@link StdVideoAV1TileInfoFlag} to the {@code flags} field. */
        public StdVideoAV1TileInfo.Buffer flags(StdVideoAV1TileInfoFlag value) { StdVideoAV1TileInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoAV1TileInfo.Buffer flags(java.util.function.Consumer<StdVideoAV1TileInfoFlag> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code TileCols} field. */
        public StdVideoAV1TileInfo.Buffer TileCols(@NativeType("uint8_t") byte value) { StdVideoAV1TileInfo.nTileCols(address(), value); return this; }
        /** Sets the specified value to the {@code TileRows} field. */
        public StdVideoAV1TileInfo.Buffer TileRows(@NativeType("uint8_t") byte value) { StdVideoAV1TileInfo.nTileRows(address(), value); return this; }
        /** Sets the specified value to the {@code context_update_tile_id} field. */
        public StdVideoAV1TileInfo.Buffer context_update_tile_id(@NativeType("uint16_t") short value) { StdVideoAV1TileInfo.ncontext_update_tile_id(address(), value); return this; }
        /** Sets the specified value to the {@code tile_size_bytes_minus_1} field. */
        public StdVideoAV1TileInfo.Buffer tile_size_bytes_minus_1(@NativeType("uint8_t") byte value) { StdVideoAV1TileInfo.ntile_size_bytes_minus_1(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code pMiColStarts} field. */
        public StdVideoAV1TileInfo.Buffer pMiColStarts(@NativeType("uint16_t const *") ShortBuffer value) { StdVideoAV1TileInfo.npMiColStarts(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code pMiRowStarts} field. */
        public StdVideoAV1TileInfo.Buffer pMiRowStarts(@NativeType("uint16_t const *") ShortBuffer value) { StdVideoAV1TileInfo.npMiRowStarts(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code pWidthInSbsMinus1} field. */
        public StdVideoAV1TileInfo.Buffer pWidthInSbsMinus1(@NativeType("uint16_t const *") ShortBuffer value) { StdVideoAV1TileInfo.npWidthInSbsMinus1(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code pHeightInSbsMinus1} field. */
        public StdVideoAV1TileInfo.Buffer pHeightInSbsMinus1(@NativeType("uint16_t const *") ShortBuffer value) { StdVideoAV1TileInfo.npHeightInSbsMinus1(address(), value); return this; }

    }

}
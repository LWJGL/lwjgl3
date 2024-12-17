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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoAV1TileInfoFlag {
 *     uint32_t uniform_tile_spacing_flag : 1;
 *     uint32_t reserved : 31;
 * }}</pre>
 */
public class StdVideoAV1TileInfoFlag extends Struct<StdVideoAV1TileInfoFlag> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0,
        BITFIELD1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
        BITFIELD1 = layout.offsetof(1);
    }

    protected StdVideoAV1TileInfoFlag(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1TileInfoFlag create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1TileInfoFlag(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1TileInfoFlag} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1TileInfoFlag(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code uniform_tile_spacing_flag} field. */
    @NativeType("uint32_t")
    public boolean uniform_tile_spacing_flag() { return nuniform_tile_spacing_flag(address()) != 0; }

    /** Sets the specified value to the {@code uniform_tile_spacing_flag} field. */
    public StdVideoAV1TileInfoFlag uniform_tile_spacing_flag(@NativeType("uint32_t") boolean value) { nuniform_tile_spacing_flag(address(), value ? 1 : 0); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1TileInfoFlag set(StdVideoAV1TileInfoFlag src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1TileInfoFlag} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1TileInfoFlag malloc() {
        return new StdVideoAV1TileInfoFlag(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1TileInfoFlag} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1TileInfoFlag calloc() {
        return new StdVideoAV1TileInfoFlag(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1TileInfoFlag} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1TileInfoFlag create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1TileInfoFlag(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1TileInfoFlag} instance for the specified memory address. */
    public static StdVideoAV1TileInfoFlag create(long address) {
        return new StdVideoAV1TileInfoFlag(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1TileInfoFlag createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1TileInfoFlag(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfoFlag.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfoFlag.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfoFlag.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfoFlag.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfoFlag.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfoFlag.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1TileInfoFlag.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfoFlag.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1TileInfoFlag.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1TileInfoFlag} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1TileInfoFlag malloc(MemoryStack stack) {
        return new StdVideoAV1TileInfoFlag(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1TileInfoFlag} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1TileInfoFlag calloc(MemoryStack stack) {
        return new StdVideoAV1TileInfoFlag(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfoFlag.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfoFlag.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1TileInfoFlag.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1TileInfoFlag.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoAV1TileInfoFlag.BITFIELD0); }
    /** Unsafe version of {@link #uniform_tile_spacing_flag}. */
    public static int nuniform_tile_spacing_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoAV1TileInfoFlag.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x7F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoAV1TileInfoFlag.BITFIELD0, value); }
    /** Unsafe version of {@link #uniform_tile_spacing_flag(boolean) uniform_tile_spacing_flag}. */
    public static void nuniform_tile_spacing_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoAV1TileInfoFlag.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0x80_00_00_00) | (value & 0x7F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1TileInfoFlag} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1TileInfoFlag, Buffer> implements NativeResource {

        private static final StdVideoAV1TileInfoFlag ELEMENT_FACTORY = StdVideoAV1TileInfoFlag.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1TileInfoFlag.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1TileInfoFlag#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1TileInfoFlag getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code uniform_tile_spacing_flag} field. */
        @NativeType("uint32_t")
        public boolean uniform_tile_spacing_flag() { return StdVideoAV1TileInfoFlag.nuniform_tile_spacing_flag(address()) != 0; }

        /** Sets the specified value to the {@code uniform_tile_spacing_flag} field. */
        public StdVideoAV1TileInfoFlag.Buffer uniform_tile_spacing_flag(@NativeType("uint32_t") boolean value) { StdVideoAV1TileInfoFlag.nuniform_tile_spacing_flag(address(), value ? 1 : 0); return this; }

    }

}
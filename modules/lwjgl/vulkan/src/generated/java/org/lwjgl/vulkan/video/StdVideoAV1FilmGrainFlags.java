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
 * struct StdVideoAV1FilmGrainFlags {
 *     uint32_t chroma_scaling_from_luma : 1;
 *     uint32_t overlap_flag : 1;
 *     uint32_t clip_to_restricted_range : 1;
 *     uint32_t update_grain : 1;
 *     uint32_t reserved : 28;
 * }}</pre>
 */
public class StdVideoAV1FilmGrainFlags extends Struct<StdVideoAV1FilmGrainFlags> implements NativeResource {

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

    protected StdVideoAV1FilmGrainFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1FilmGrainFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1FilmGrainFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1FilmGrainFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1FilmGrainFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code chroma_scaling_from_luma} field. */
    @NativeType("uint32_t")
    public boolean chroma_scaling_from_luma() { return nchroma_scaling_from_luma(address()) != 0; }
    /** @return the value of the {@code overlap_flag} field. */
    @NativeType("uint32_t")
    public boolean overlap_flag() { return noverlap_flag(address()) != 0; }
    /** @return the value of the {@code clip_to_restricted_range} field. */
    @NativeType("uint32_t")
    public boolean clip_to_restricted_range() { return nclip_to_restricted_range(address()) != 0; }
    /** @return the value of the {@code update_grain} field. */
    @NativeType("uint32_t")
    public boolean update_grain() { return nupdate_grain(address()) != 0; }

    /** Sets the specified value to the {@code chroma_scaling_from_luma} field. */
    public StdVideoAV1FilmGrainFlags chroma_scaling_from_luma(@NativeType("uint32_t") boolean value) { nchroma_scaling_from_luma(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code overlap_flag} field. */
    public StdVideoAV1FilmGrainFlags overlap_flag(@NativeType("uint32_t") boolean value) { noverlap_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code clip_to_restricted_range} field. */
    public StdVideoAV1FilmGrainFlags clip_to_restricted_range(@NativeType("uint32_t") boolean value) { nclip_to_restricted_range(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code update_grain} field. */
    public StdVideoAV1FilmGrainFlags update_grain(@NativeType("uint32_t") boolean value) { nupdate_grain(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1FilmGrainFlags set(
        boolean chroma_scaling_from_luma,
        boolean overlap_flag,
        boolean clip_to_restricted_range,
        boolean update_grain
    ) {
        chroma_scaling_from_luma(chroma_scaling_from_luma);
        overlap_flag(overlap_flag);
        clip_to_restricted_range(clip_to_restricted_range);
        update_grain(update_grain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1FilmGrainFlags set(StdVideoAV1FilmGrainFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1FilmGrainFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1FilmGrainFlags malloc() {
        return new StdVideoAV1FilmGrainFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1FilmGrainFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1FilmGrainFlags calloc() {
        return new StdVideoAV1FilmGrainFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1FilmGrainFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1FilmGrainFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1FilmGrainFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1FilmGrainFlags} instance for the specified memory address. */
    public static StdVideoAV1FilmGrainFlags create(long address) {
        return new StdVideoAV1FilmGrainFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1FilmGrainFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1FilmGrainFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrainFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrainFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrainFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrainFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrainFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrainFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1FilmGrainFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrainFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1FilmGrainFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1FilmGrainFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1FilmGrainFlags malloc(MemoryStack stack) {
        return new StdVideoAV1FilmGrainFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1FilmGrainFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1FilmGrainFlags calloc(MemoryStack stack) {
        return new StdVideoAV1FilmGrainFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrainFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrainFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1FilmGrainFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1FilmGrainFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoAV1FilmGrainFlags.BITFIELD0); }
    /** Unsafe version of {@link #chroma_scaling_from_luma}. */
    public static int nchroma_scaling_from_luma(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #overlap_flag}. */
    public static int noverlap_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #clip_to_restricted_range}. */
    public static int nclip_to_restricted_range(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #update_grain}. */
    public static int nupdate_grain(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoAV1FilmGrainFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x0F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoAV1FilmGrainFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #chroma_scaling_from_luma(boolean) chroma_scaling_from_luma}. */
    public static void nchroma_scaling_from_luma(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #overlap_flag(boolean) overlap_flag}. */
    public static void noverlap_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #clip_to_restricted_range(boolean) clip_to_restricted_range}. */
    public static void nclip_to_restricted_range(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #update_grain(boolean) update_grain}. */
    public static void nupdate_grain(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoAV1FilmGrainFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xF0_00_00_00) | (value & 0x0F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1FilmGrainFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1FilmGrainFlags, Buffer> implements NativeResource {

        private static final StdVideoAV1FilmGrainFlags ELEMENT_FACTORY = StdVideoAV1FilmGrainFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1FilmGrainFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1FilmGrainFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1FilmGrainFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code chroma_scaling_from_luma} field. */
        @NativeType("uint32_t")
        public boolean chroma_scaling_from_luma() { return StdVideoAV1FilmGrainFlags.nchroma_scaling_from_luma(address()) != 0; }
        /** @return the value of the {@code overlap_flag} field. */
        @NativeType("uint32_t")
        public boolean overlap_flag() { return StdVideoAV1FilmGrainFlags.noverlap_flag(address()) != 0; }
        /** @return the value of the {@code clip_to_restricted_range} field. */
        @NativeType("uint32_t")
        public boolean clip_to_restricted_range() { return StdVideoAV1FilmGrainFlags.nclip_to_restricted_range(address()) != 0; }
        /** @return the value of the {@code update_grain} field. */
        @NativeType("uint32_t")
        public boolean update_grain() { return StdVideoAV1FilmGrainFlags.nupdate_grain(address()) != 0; }

        /** Sets the specified value to the {@code chroma_scaling_from_luma} field. */
        public StdVideoAV1FilmGrainFlags.Buffer chroma_scaling_from_luma(@NativeType("uint32_t") boolean value) { StdVideoAV1FilmGrainFlags.nchroma_scaling_from_luma(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code overlap_flag} field. */
        public StdVideoAV1FilmGrainFlags.Buffer overlap_flag(@NativeType("uint32_t") boolean value) { StdVideoAV1FilmGrainFlags.noverlap_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code clip_to_restricted_range} field. */
        public StdVideoAV1FilmGrainFlags.Buffer clip_to_restricted_range(@NativeType("uint32_t") boolean value) { StdVideoAV1FilmGrainFlags.nclip_to_restricted_range(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code update_grain} field. */
        public StdVideoAV1FilmGrainFlags.Buffer update_grain(@NativeType("uint32_t") boolean value) { StdVideoAV1FilmGrainFlags.nupdate_grain(address(), value ? 1 : 0); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

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
 * struct StdVideoEncodeH264SliceHeaderFlags {
 *     uint32_t direct_spatial_mv_pred_flag : 1;
 *     uint32_t num_ref_idx_active_override_flag : 1;
 *     uint32_t reserved : 30;
 * }</code></pre>
 */
public class StdVideoEncodeH264SliceHeaderFlags extends Struct<StdVideoEncodeH264SliceHeaderFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BITFIELD0;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BITFIELD0 = layout.offsetof(0);
    }

    protected StdVideoEncodeH264SliceHeaderFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264SliceHeaderFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264SliceHeaderFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264SliceHeaderFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264SliceHeaderFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code direct_spatial_mv_pred_flag} field. */
    @NativeType("uint32_t")
    public boolean direct_spatial_mv_pred_flag() { return ndirect_spatial_mv_pred_flag(address()) != 0; }
    /** @return the value of the {@code num_ref_idx_active_override_flag} field. */
    @NativeType("uint32_t")
    public boolean num_ref_idx_active_override_flag() { return nnum_ref_idx_active_override_flag(address()) != 0; }

    /** Sets the specified value to the {@code direct_spatial_mv_pred_flag} field. */
    public StdVideoEncodeH264SliceHeaderFlags direct_spatial_mv_pred_flag(@NativeType("uint32_t") boolean value) { ndirect_spatial_mv_pred_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code num_ref_idx_active_override_flag} field. */
    public StdVideoEncodeH264SliceHeaderFlags num_ref_idx_active_override_flag(@NativeType("uint32_t") boolean value) { nnum_ref_idx_active_override_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264SliceHeaderFlags set(
        boolean direct_spatial_mv_pred_flag,
        boolean num_ref_idx_active_override_flag
    ) {
        direct_spatial_mv_pred_flag(direct_spatial_mv_pred_flag);
        num_ref_idx_active_override_flag(num_ref_idx_active_override_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264SliceHeaderFlags set(StdVideoEncodeH264SliceHeaderFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264SliceHeaderFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264SliceHeaderFlags malloc() {
        return new StdVideoEncodeH264SliceHeaderFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264SliceHeaderFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264SliceHeaderFlags calloc() {
        return new StdVideoEncodeH264SliceHeaderFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264SliceHeaderFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264SliceHeaderFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264SliceHeaderFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264SliceHeaderFlags} instance for the specified memory address. */
    public static StdVideoEncodeH264SliceHeaderFlags create(long address) {
        return new StdVideoEncodeH264SliceHeaderFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264SliceHeaderFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264SliceHeaderFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeaderFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeaderFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeaderFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeaderFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeaderFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeaderFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264SliceHeaderFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeaderFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264SliceHeaderFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264SliceHeaderFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264SliceHeaderFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeH264SliceHeaderFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264SliceHeaderFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264SliceHeaderFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeH264SliceHeaderFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeaderFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeaderFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264SliceHeaderFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264SliceHeaderFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoEncodeH264SliceHeaderFlags.BITFIELD0); }
    /** Unsafe version of {@link #direct_spatial_mv_pred_flag}. */
    public static int ndirect_spatial_mv_pred_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #num_ref_idx_active_override_flag}. */
    public static int nnum_ref_idx_active_override_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    public static int nreserved(long struct) { return nbitfield0(struct) >>> 2; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoEncodeH264SliceHeaderFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #direct_spatial_mv_pred_flag(boolean) direct_spatial_mv_pred_flag}. */
    public static void ndirect_spatial_mv_pred_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #num_ref_idx_active_override_flag(boolean) num_ref_idx_active_override_flag}. */
    public static void nnum_ref_idx_active_override_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    public static void nreserved(long struct, int value) { nbitfield0(struct, (value << 2) | (nbitfield0(struct) & 0x00_00_00_03)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264SliceHeaderFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264SliceHeaderFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264SliceHeaderFlags ELEMENT_FACTORY = StdVideoEncodeH264SliceHeaderFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264SliceHeaderFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264SliceHeaderFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264SliceHeaderFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code direct_spatial_mv_pred_flag} field. */
        @NativeType("uint32_t")
        public boolean direct_spatial_mv_pred_flag() { return StdVideoEncodeH264SliceHeaderFlags.ndirect_spatial_mv_pred_flag(address()) != 0; }
        /** @return the value of the {@code num_ref_idx_active_override_flag} field. */
        @NativeType("uint32_t")
        public boolean num_ref_idx_active_override_flag() { return StdVideoEncodeH264SliceHeaderFlags.nnum_ref_idx_active_override_flag(address()) != 0; }

        /** Sets the specified value to the {@code direct_spatial_mv_pred_flag} field. */
        public StdVideoEncodeH264SliceHeaderFlags.Buffer direct_spatial_mv_pred_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264SliceHeaderFlags.ndirect_spatial_mv_pred_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code num_ref_idx_active_override_flag} field. */
        public StdVideoEncodeH264SliceHeaderFlags.Buffer num_ref_idx_active_override_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeH264SliceHeaderFlags.nnum_ref_idx_active_override_flag(address(), value ? 1 : 0); return this; }

    }

}
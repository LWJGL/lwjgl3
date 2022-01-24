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
 * struct StdVideoH265VpsFlags {
 *     uint32_t vps_temporal_id_nesting_flag : 1;
 *     uint32_t vps_sub_layer_ordering_info_present_flag : 1;
 *     uint32_t vps_timing_info_present_flag : 1;
 *     uint32_t vps_poc_proportional_to_timing_flag : 1;
 * }</code></pre>
 */
public class StdVideoH265VpsFlags extends Struct implements NativeResource {

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

    /**
     * Creates a {@code StdVideoH265VpsFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265VpsFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vps_temporal_id_nesting_flag} field. */
    @NativeType("uint32_t")
    public boolean vps_temporal_id_nesting_flag() { return nvps_temporal_id_nesting_flag(address()) != 0; }
    /** @return the value of the {@code vps_sub_layer_ordering_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean vps_sub_layer_ordering_info_present_flag() { return nvps_sub_layer_ordering_info_present_flag(address()) != 0; }
    /** @return the value of the {@code vps_timing_info_present_flag} field. */
    @NativeType("uint32_t")
    public boolean vps_timing_info_present_flag() { return nvps_timing_info_present_flag(address()) != 0; }
    /** @return the value of the {@code vps_poc_proportional_to_timing_flag} field. */
    @NativeType("uint32_t")
    public boolean vps_poc_proportional_to_timing_flag() { return nvps_poc_proportional_to_timing_flag(address()) != 0; }

    /** Sets the specified value to the {@code vps_temporal_id_nesting_flag} field. */
    public StdVideoH265VpsFlags vps_temporal_id_nesting_flag(@NativeType("uint32_t") boolean value) { nvps_temporal_id_nesting_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vps_sub_layer_ordering_info_present_flag} field. */
    public StdVideoH265VpsFlags vps_sub_layer_ordering_info_present_flag(@NativeType("uint32_t") boolean value) { nvps_sub_layer_ordering_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vps_timing_info_present_flag} field. */
    public StdVideoH265VpsFlags vps_timing_info_present_flag(@NativeType("uint32_t") boolean value) { nvps_timing_info_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vps_poc_proportional_to_timing_flag} field. */
    public StdVideoH265VpsFlags vps_poc_proportional_to_timing_flag(@NativeType("uint32_t") boolean value) { nvps_poc_proportional_to_timing_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265VpsFlags set(
        boolean vps_temporal_id_nesting_flag,
        boolean vps_sub_layer_ordering_info_present_flag,
        boolean vps_timing_info_present_flag,
        boolean vps_poc_proportional_to_timing_flag
    ) {
        vps_temporal_id_nesting_flag(vps_temporal_id_nesting_flag);
        vps_sub_layer_ordering_info_present_flag(vps_sub_layer_ordering_info_present_flag);
        vps_timing_info_present_flag(vps_timing_info_present_flag);
        vps_poc_proportional_to_timing_flag(vps_poc_proportional_to_timing_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265VpsFlags set(StdVideoH265VpsFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265VpsFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265VpsFlags malloc() {
        return wrap(StdVideoH265VpsFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265VpsFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265VpsFlags calloc() {
        return wrap(StdVideoH265VpsFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265VpsFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265VpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265VpsFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265VpsFlags} instance for the specified memory address. */
    public static StdVideoH265VpsFlags create(long address) {
        return wrap(StdVideoH265VpsFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265VpsFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265VpsFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265VpsFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VpsFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265VpsFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VpsFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265VpsFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VpsFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265VpsFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VpsFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265VpsFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265VpsFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265VpsFlags malloc(MemoryStack stack) {
        return wrap(StdVideoH265VpsFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265VpsFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265VpsFlags calloc(MemoryStack stack) {
        return wrap(StdVideoH265VpsFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265VpsFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VpsFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265VpsFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VpsFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265VpsFlags.BITFIELD0); }
    /** Unsafe version of {@link #vps_temporal_id_nesting_flag}. */
    public static int nvps_temporal_id_nesting_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #vps_sub_layer_ordering_info_present_flag}. */
    public static int nvps_sub_layer_ordering_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #vps_timing_info_present_flag}. */
    public static int nvps_timing_info_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #vps_poc_proportional_to_timing_flag}. */
    public static int nvps_poc_proportional_to_timing_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265VpsFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #vps_temporal_id_nesting_flag(boolean) vps_temporal_id_nesting_flag}. */
    public static void nvps_temporal_id_nesting_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #vps_sub_layer_ordering_info_present_flag(boolean) vps_sub_layer_ordering_info_present_flag}. */
    public static void nvps_sub_layer_ordering_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #vps_timing_info_present_flag(boolean) vps_timing_info_present_flag}. */
    public static void nvps_timing_info_present_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #vps_poc_proportional_to_timing_flag(boolean) vps_poc_proportional_to_timing_flag}. */
    public static void nvps_poc_proportional_to_timing_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }

    // -----------------------------------

    /** An array of {@link StdVideoH265VpsFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265VpsFlags, Buffer> implements NativeResource {

        private static final StdVideoH265VpsFlags ELEMENT_FACTORY = StdVideoH265VpsFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH265VpsFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265VpsFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265VpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vps_temporal_id_nesting_flag} field. */
        @NativeType("uint32_t")
        public boolean vps_temporal_id_nesting_flag() { return StdVideoH265VpsFlags.nvps_temporal_id_nesting_flag(address()) != 0; }
        /** @return the value of the {@code vps_sub_layer_ordering_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean vps_sub_layer_ordering_info_present_flag() { return StdVideoH265VpsFlags.nvps_sub_layer_ordering_info_present_flag(address()) != 0; }
        /** @return the value of the {@code vps_timing_info_present_flag} field. */
        @NativeType("uint32_t")
        public boolean vps_timing_info_present_flag() { return StdVideoH265VpsFlags.nvps_timing_info_present_flag(address()) != 0; }
        /** @return the value of the {@code vps_poc_proportional_to_timing_flag} field. */
        @NativeType("uint32_t")
        public boolean vps_poc_proportional_to_timing_flag() { return StdVideoH265VpsFlags.nvps_poc_proportional_to_timing_flag(address()) != 0; }

        /** Sets the specified value to the {@code vps_temporal_id_nesting_flag} field. */
        public StdVideoH265VpsFlags.Buffer vps_temporal_id_nesting_flag(@NativeType("uint32_t") boolean value) { StdVideoH265VpsFlags.nvps_temporal_id_nesting_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vps_sub_layer_ordering_info_present_flag} field. */
        public StdVideoH265VpsFlags.Buffer vps_sub_layer_ordering_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265VpsFlags.nvps_sub_layer_ordering_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vps_timing_info_present_flag} field. */
        public StdVideoH265VpsFlags.Buffer vps_timing_info_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265VpsFlags.nvps_timing_info_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vps_poc_proportional_to_timing_flag} field. */
        public StdVideoH265VpsFlags.Buffer vps_poc_proportional_to_timing_flag(@NativeType("uint32_t") boolean value) { StdVideoH265VpsFlags.nvps_poc_proportional_to_timing_flag(address(), value ? 1 : 0); return this; }

    }

}
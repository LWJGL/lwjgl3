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
 * struct StdVideoH265ProfileTierLevelFlags {
 *     uint32_t general_tier_flag : 1;
 *     uint32_t general_progressive_source_flag : 1;
 *     uint32_t general_interlaced_source_flag : 1;
 *     uint32_t general_non_packed_constraint_flag : 1;
 *     uint32_t general_frame_only_constraint_flag : 1;
 * }</code></pre>
 */
public class StdVideoH265ProfileTierLevelFlags extends Struct<StdVideoH265ProfileTierLevelFlags> implements NativeResource {

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

    protected StdVideoH265ProfileTierLevelFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265ProfileTierLevelFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265ProfileTierLevelFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoH265ProfileTierLevelFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265ProfileTierLevelFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code general_tier_flag} field. */
    @NativeType("uint32_t")
    public boolean general_tier_flag() { return ngeneral_tier_flag(address()) != 0; }
    /** @return the value of the {@code general_progressive_source_flag} field. */
    @NativeType("uint32_t")
    public boolean general_progressive_source_flag() { return ngeneral_progressive_source_flag(address()) != 0; }
    /** @return the value of the {@code general_interlaced_source_flag} field. */
    @NativeType("uint32_t")
    public boolean general_interlaced_source_flag() { return ngeneral_interlaced_source_flag(address()) != 0; }
    /** @return the value of the {@code general_non_packed_constraint_flag} field. */
    @NativeType("uint32_t")
    public boolean general_non_packed_constraint_flag() { return ngeneral_non_packed_constraint_flag(address()) != 0; }
    /** @return the value of the {@code general_frame_only_constraint_flag} field. */
    @NativeType("uint32_t")
    public boolean general_frame_only_constraint_flag() { return ngeneral_frame_only_constraint_flag(address()) != 0; }

    /** Sets the specified value to the {@code general_tier_flag} field. */
    public StdVideoH265ProfileTierLevelFlags general_tier_flag(@NativeType("uint32_t") boolean value) { ngeneral_tier_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code general_progressive_source_flag} field. */
    public StdVideoH265ProfileTierLevelFlags general_progressive_source_flag(@NativeType("uint32_t") boolean value) { ngeneral_progressive_source_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code general_interlaced_source_flag} field. */
    public StdVideoH265ProfileTierLevelFlags general_interlaced_source_flag(@NativeType("uint32_t") boolean value) { ngeneral_interlaced_source_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code general_non_packed_constraint_flag} field. */
    public StdVideoH265ProfileTierLevelFlags general_non_packed_constraint_flag(@NativeType("uint32_t") boolean value) { ngeneral_non_packed_constraint_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code general_frame_only_constraint_flag} field. */
    public StdVideoH265ProfileTierLevelFlags general_frame_only_constraint_flag(@NativeType("uint32_t") boolean value) { ngeneral_frame_only_constraint_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265ProfileTierLevelFlags set(
        boolean general_tier_flag,
        boolean general_progressive_source_flag,
        boolean general_interlaced_source_flag,
        boolean general_non_packed_constraint_flag,
        boolean general_frame_only_constraint_flag
    ) {
        general_tier_flag(general_tier_flag);
        general_progressive_source_flag(general_progressive_source_flag);
        general_interlaced_source_flag(general_interlaced_source_flag);
        general_non_packed_constraint_flag(general_non_packed_constraint_flag);
        general_frame_only_constraint_flag(general_frame_only_constraint_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265ProfileTierLevelFlags set(StdVideoH265ProfileTierLevelFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265ProfileTierLevelFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265ProfileTierLevelFlags malloc() {
        return new StdVideoH265ProfileTierLevelFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265ProfileTierLevelFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265ProfileTierLevelFlags calloc() {
        return new StdVideoH265ProfileTierLevelFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265ProfileTierLevelFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265ProfileTierLevelFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ProfileTierLevelFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265ProfileTierLevelFlags} instance for the specified memory address. */
    public static StdVideoH265ProfileTierLevelFlags create(long address) {
        return new StdVideoH265ProfileTierLevelFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ProfileTierLevelFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoH265ProfileTierLevelFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevelFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevelFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevelFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevelFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevelFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevelFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265ProfileTierLevelFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevelFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ProfileTierLevelFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265ProfileTierLevelFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ProfileTierLevelFlags malloc(MemoryStack stack) {
        return new StdVideoH265ProfileTierLevelFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265ProfileTierLevelFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ProfileTierLevelFlags calloc(MemoryStack stack) {
        return new StdVideoH265ProfileTierLevelFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevelFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevelFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ProfileTierLevelFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ProfileTierLevelFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265ProfileTierLevelFlags.BITFIELD0); }
    /** Unsafe version of {@link #general_tier_flag}. */
    public static int ngeneral_tier_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #general_progressive_source_flag}. */
    public static int ngeneral_progressive_source_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #general_interlaced_source_flag}. */
    public static int ngeneral_interlaced_source_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #general_non_packed_constraint_flag}. */
    public static int ngeneral_non_packed_constraint_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #general_frame_only_constraint_flag}. */
    public static int ngeneral_frame_only_constraint_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265ProfileTierLevelFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #general_tier_flag(boolean) general_tier_flag}. */
    public static void ngeneral_tier_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #general_progressive_source_flag(boolean) general_progressive_source_flag}. */
    public static void ngeneral_progressive_source_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #general_interlaced_source_flag(boolean) general_interlaced_source_flag}. */
    public static void ngeneral_interlaced_source_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #general_non_packed_constraint_flag(boolean) general_non_packed_constraint_flag}. */
    public static void ngeneral_non_packed_constraint_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #general_frame_only_constraint_flag(boolean) general_frame_only_constraint_flag}. */
    public static void ngeneral_frame_only_constraint_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }

    // -----------------------------------

    /** An array of {@link StdVideoH265ProfileTierLevelFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265ProfileTierLevelFlags, Buffer> implements NativeResource {

        private static final StdVideoH265ProfileTierLevelFlags ELEMENT_FACTORY = StdVideoH265ProfileTierLevelFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH265ProfileTierLevelFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265ProfileTierLevelFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoH265ProfileTierLevelFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code general_tier_flag} field. */
        @NativeType("uint32_t")
        public boolean general_tier_flag() { return StdVideoH265ProfileTierLevelFlags.ngeneral_tier_flag(address()) != 0; }
        /** @return the value of the {@code general_progressive_source_flag} field. */
        @NativeType("uint32_t")
        public boolean general_progressive_source_flag() { return StdVideoH265ProfileTierLevelFlags.ngeneral_progressive_source_flag(address()) != 0; }
        /** @return the value of the {@code general_interlaced_source_flag} field. */
        @NativeType("uint32_t")
        public boolean general_interlaced_source_flag() { return StdVideoH265ProfileTierLevelFlags.ngeneral_interlaced_source_flag(address()) != 0; }
        /** @return the value of the {@code general_non_packed_constraint_flag} field. */
        @NativeType("uint32_t")
        public boolean general_non_packed_constraint_flag() { return StdVideoH265ProfileTierLevelFlags.ngeneral_non_packed_constraint_flag(address()) != 0; }
        /** @return the value of the {@code general_frame_only_constraint_flag} field. */
        @NativeType("uint32_t")
        public boolean general_frame_only_constraint_flag() { return StdVideoH265ProfileTierLevelFlags.ngeneral_frame_only_constraint_flag(address()) != 0; }

        /** Sets the specified value to the {@code general_tier_flag} field. */
        public StdVideoH265ProfileTierLevelFlags.Buffer general_tier_flag(@NativeType("uint32_t") boolean value) { StdVideoH265ProfileTierLevelFlags.ngeneral_tier_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code general_progressive_source_flag} field. */
        public StdVideoH265ProfileTierLevelFlags.Buffer general_progressive_source_flag(@NativeType("uint32_t") boolean value) { StdVideoH265ProfileTierLevelFlags.ngeneral_progressive_source_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code general_interlaced_source_flag} field. */
        public StdVideoH265ProfileTierLevelFlags.Buffer general_interlaced_source_flag(@NativeType("uint32_t") boolean value) { StdVideoH265ProfileTierLevelFlags.ngeneral_interlaced_source_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code general_non_packed_constraint_flag} field. */
        public StdVideoH265ProfileTierLevelFlags.Buffer general_non_packed_constraint_flag(@NativeType("uint32_t") boolean value) { StdVideoH265ProfileTierLevelFlags.ngeneral_non_packed_constraint_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code general_frame_only_constraint_flag} field. */
        public StdVideoH265ProfileTierLevelFlags.Buffer general_frame_only_constraint_flag(@NativeType("uint32_t") boolean value) { StdVideoH265ProfileTierLevelFlags.ngeneral_frame_only_constraint_flag(address(), value ? 1 : 0); return this; }

    }

}
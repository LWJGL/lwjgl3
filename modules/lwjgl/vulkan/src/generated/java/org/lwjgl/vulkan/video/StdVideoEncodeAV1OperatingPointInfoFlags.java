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
 * struct StdVideoEncodeAV1OperatingPointInfoFlags {
 *     uint32_t decoder_model_present_for_this_op : 1;
 *     uint32_t low_delay_mode_flag : 1;
 *     uint32_t initial_display_delay_present_for_this_op : 1;
 *     uint32_t reserved : 29;
 * }}</pre>
 */
public class StdVideoEncodeAV1OperatingPointInfoFlags extends Struct<StdVideoEncodeAV1OperatingPointInfoFlags> implements NativeResource {

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

    protected StdVideoEncodeAV1OperatingPointInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeAV1OperatingPointInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeAV1OperatingPointInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeAV1OperatingPointInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code decoder_model_present_for_this_op} field. */
    @NativeType("uint32_t")
    public boolean decoder_model_present_for_this_op() { return ndecoder_model_present_for_this_op(address()) != 0; }
    /** @return the value of the {@code low_delay_mode_flag} field. */
    @NativeType("uint32_t")
    public boolean low_delay_mode_flag() { return nlow_delay_mode_flag(address()) != 0; }
    /** @return the value of the {@code initial_display_delay_present_for_this_op} field. */
    @NativeType("uint32_t")
    public boolean initial_display_delay_present_for_this_op() { return ninitial_display_delay_present_for_this_op(address()) != 0; }

    /** Sets the specified value to the {@code decoder_model_present_for_this_op} field. */
    public StdVideoEncodeAV1OperatingPointInfoFlags decoder_model_present_for_this_op(@NativeType("uint32_t") boolean value) { ndecoder_model_present_for_this_op(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code low_delay_mode_flag} field. */
    public StdVideoEncodeAV1OperatingPointInfoFlags low_delay_mode_flag(@NativeType("uint32_t") boolean value) { nlow_delay_mode_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code initial_display_delay_present_for_this_op} field. */
    public StdVideoEncodeAV1OperatingPointInfoFlags initial_display_delay_present_for_this_op(@NativeType("uint32_t") boolean value) { ninitial_display_delay_present_for_this_op(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeAV1OperatingPointInfoFlags set(
        boolean decoder_model_present_for_this_op,
        boolean low_delay_mode_flag,
        boolean initial_display_delay_present_for_this_op
    ) {
        decoder_model_present_for_this_op(decoder_model_present_for_this_op);
        low_delay_mode_flag(low_delay_mode_flag);
        initial_display_delay_present_for_this_op(initial_display_delay_present_for_this_op);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeAV1OperatingPointInfoFlags set(StdVideoEncodeAV1OperatingPointInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeAV1OperatingPointInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1OperatingPointInfoFlags malloc() {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1OperatingPointInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1OperatingPointInfoFlags calloc() {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1OperatingPointInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeAV1OperatingPointInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1OperatingPointInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeAV1OperatingPointInfoFlags} instance for the specified memory address. */
    public static StdVideoEncodeAV1OperatingPointInfoFlags create(long address) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeAV1OperatingPointInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeAV1OperatingPointInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeAV1OperatingPointInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeAV1OperatingPointInfoFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1OperatingPointInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1OperatingPointInfoFlags malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1OperatingPointInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1OperatingPointInfoFlags calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoEncodeAV1OperatingPointInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #decoder_model_present_for_this_op}. */
    public static int ndecoder_model_present_for_this_op(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #low_delay_mode_flag}. */
    public static int nlow_delay_mode_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #initial_display_delay_present_for_this_op}. */
    public static int ninitial_display_delay_present_for_this_op(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoEncodeAV1OperatingPointInfoFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x1F_FF_FF_FF; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1OperatingPointInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #decoder_model_present_for_this_op(boolean) decoder_model_present_for_this_op}. */
    public static void ndecoder_model_present_for_this_op(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #low_delay_mode_flag(boolean) low_delay_mode_flag}. */
    public static void nlow_delay_mode_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #initial_display_delay_present_for_this_op(boolean) initial_display_delay_present_for_this_op}. */
    public static void ninitial_display_delay_present_for_this_op(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1OperatingPointInfoFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xE0_00_00_00) | (value & 0x1F_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeAV1OperatingPointInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1OperatingPointInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoEncodeAV1OperatingPointInfoFlags ELEMENT_FACTORY = StdVideoEncodeAV1OperatingPointInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeAV1OperatingPointInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeAV1OperatingPointInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeAV1OperatingPointInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code decoder_model_present_for_this_op} field. */
        @NativeType("uint32_t")
        public boolean decoder_model_present_for_this_op() { return StdVideoEncodeAV1OperatingPointInfoFlags.ndecoder_model_present_for_this_op(address()) != 0; }
        /** @return the value of the {@code low_delay_mode_flag} field. */
        @NativeType("uint32_t")
        public boolean low_delay_mode_flag() { return StdVideoEncodeAV1OperatingPointInfoFlags.nlow_delay_mode_flag(address()) != 0; }
        /** @return the value of the {@code initial_display_delay_present_for_this_op} field. */
        @NativeType("uint32_t")
        public boolean initial_display_delay_present_for_this_op() { return StdVideoEncodeAV1OperatingPointInfoFlags.ninitial_display_delay_present_for_this_op(address()) != 0; }

        /** Sets the specified value to the {@code decoder_model_present_for_this_op} field. */
        public StdVideoEncodeAV1OperatingPointInfoFlags.Buffer decoder_model_present_for_this_op(@NativeType("uint32_t") boolean value) { StdVideoEncodeAV1OperatingPointInfoFlags.ndecoder_model_present_for_this_op(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code low_delay_mode_flag} field. */
        public StdVideoEncodeAV1OperatingPointInfoFlags.Buffer low_delay_mode_flag(@NativeType("uint32_t") boolean value) { StdVideoEncodeAV1OperatingPointInfoFlags.nlow_delay_mode_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code initial_display_delay_present_for_this_op} field. */
        public StdVideoEncodeAV1OperatingPointInfoFlags.Buffer initial_display_delay_present_for_this_op(@NativeType("uint32_t") boolean value) { StdVideoEncodeAV1OperatingPointInfoFlags.ninitial_display_delay_present_for_this_op(address(), value ? 1 : 0); return this; }

    }

}
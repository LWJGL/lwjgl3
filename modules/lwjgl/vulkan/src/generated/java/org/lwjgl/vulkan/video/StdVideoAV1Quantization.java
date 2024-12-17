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
 * struct StdVideoAV1Quantization {
 *     {@link StdVideoAV1QuantizationFlags StdVideoAV1QuantizationFlags} flags;
 *     uint8_t base_q_idx;
 *     int8_t DeltaQYDc;
 *     int8_t DeltaQUDc;
 *     int8_t DeltaQUAc;
 *     int8_t DeltaQVDc;
 *     int8_t DeltaQVAc;
 *     uint8_t qm_y;
 *     uint8_t qm_u;
 *     uint8_t qm_v;
 * }}</pre>
 */
public class StdVideoAV1Quantization extends Struct<StdVideoAV1Quantization> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        BASE_Q_IDX,
        DELTAQYDC,
        DELTAQUDC,
        DELTAQUAC,
        DELTAQVDC,
        DELTAQVAC,
        QM_Y,
        QM_U,
        QM_V;

    static {
        Layout layout = __struct(
            __member(StdVideoAV1QuantizationFlags.SIZEOF, StdVideoAV1QuantizationFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        BASE_Q_IDX = layout.offsetof(1);
        DELTAQYDC = layout.offsetof(2);
        DELTAQUDC = layout.offsetof(3);
        DELTAQUAC = layout.offsetof(4);
        DELTAQVDC = layout.offsetof(5);
        DELTAQVAC = layout.offsetof(6);
        QM_Y = layout.offsetof(7);
        QM_U = layout.offsetof(8);
        QM_V = layout.offsetof(9);
    }

    protected StdVideoAV1Quantization(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1Quantization create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1Quantization(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1Quantization} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1Quantization(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoAV1QuantizationFlags} view of the {@code flags} field. */
    public StdVideoAV1QuantizationFlags flags() { return nflags(address()); }
    /** @return the value of the {@code base_q_idx} field. */
    @NativeType("uint8_t")
    public byte base_q_idx() { return nbase_q_idx(address()); }
    /** @return the value of the {@code DeltaQYDc} field. */
    @NativeType("int8_t")
    public byte DeltaQYDc() { return nDeltaQYDc(address()); }
    /** @return the value of the {@code DeltaQUDc} field. */
    @NativeType("int8_t")
    public byte DeltaQUDc() { return nDeltaQUDc(address()); }
    /** @return the value of the {@code DeltaQUAc} field. */
    @NativeType("int8_t")
    public byte DeltaQUAc() { return nDeltaQUAc(address()); }
    /** @return the value of the {@code DeltaQVDc} field. */
    @NativeType("int8_t")
    public byte DeltaQVDc() { return nDeltaQVDc(address()); }
    /** @return the value of the {@code DeltaQVAc} field. */
    @NativeType("int8_t")
    public byte DeltaQVAc() { return nDeltaQVAc(address()); }
    /** @return the value of the {@code qm_y} field. */
    @NativeType("uint8_t")
    public byte qm_y() { return nqm_y(address()); }
    /** @return the value of the {@code qm_u} field. */
    @NativeType("uint8_t")
    public byte qm_u() { return nqm_u(address()); }
    /** @return the value of the {@code qm_v} field. */
    @NativeType("uint8_t")
    public byte qm_v() { return nqm_v(address()); }

    /** Copies the specified {@link StdVideoAV1QuantizationFlags} to the {@code flags} field. */
    public StdVideoAV1Quantization flags(StdVideoAV1QuantizationFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoAV1Quantization flags(java.util.function.Consumer<StdVideoAV1QuantizationFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code base_q_idx} field. */
    public StdVideoAV1Quantization base_q_idx(@NativeType("uint8_t") byte value) { nbase_q_idx(address(), value); return this; }
    /** Sets the specified value to the {@code DeltaQYDc} field. */
    public StdVideoAV1Quantization DeltaQYDc(@NativeType("int8_t") byte value) { nDeltaQYDc(address(), value); return this; }
    /** Sets the specified value to the {@code DeltaQUDc} field. */
    public StdVideoAV1Quantization DeltaQUDc(@NativeType("int8_t") byte value) { nDeltaQUDc(address(), value); return this; }
    /** Sets the specified value to the {@code DeltaQUAc} field. */
    public StdVideoAV1Quantization DeltaQUAc(@NativeType("int8_t") byte value) { nDeltaQUAc(address(), value); return this; }
    /** Sets the specified value to the {@code DeltaQVDc} field. */
    public StdVideoAV1Quantization DeltaQVDc(@NativeType("int8_t") byte value) { nDeltaQVDc(address(), value); return this; }
    /** Sets the specified value to the {@code DeltaQVAc} field. */
    public StdVideoAV1Quantization DeltaQVAc(@NativeType("int8_t") byte value) { nDeltaQVAc(address(), value); return this; }
    /** Sets the specified value to the {@code qm_y} field. */
    public StdVideoAV1Quantization qm_y(@NativeType("uint8_t") byte value) { nqm_y(address(), value); return this; }
    /** Sets the specified value to the {@code qm_u} field. */
    public StdVideoAV1Quantization qm_u(@NativeType("uint8_t") byte value) { nqm_u(address(), value); return this; }
    /** Sets the specified value to the {@code qm_v} field. */
    public StdVideoAV1Quantization qm_v(@NativeType("uint8_t") byte value) { nqm_v(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1Quantization set(
        StdVideoAV1QuantizationFlags flags,
        byte base_q_idx,
        byte DeltaQYDc,
        byte DeltaQUDc,
        byte DeltaQUAc,
        byte DeltaQVDc,
        byte DeltaQVAc,
        byte qm_y,
        byte qm_u,
        byte qm_v
    ) {
        flags(flags);
        base_q_idx(base_q_idx);
        DeltaQYDc(DeltaQYDc);
        DeltaQUDc(DeltaQUDc);
        DeltaQUAc(DeltaQUAc);
        DeltaQVDc(DeltaQVDc);
        DeltaQVAc(DeltaQVAc);
        qm_y(qm_y);
        qm_u(qm_u);
        qm_v(qm_v);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1Quantization set(StdVideoAV1Quantization src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1Quantization} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1Quantization malloc() {
        return new StdVideoAV1Quantization(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1Quantization} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1Quantization calloc() {
        return new StdVideoAV1Quantization(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1Quantization} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1Quantization create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1Quantization(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1Quantization} instance for the specified memory address. */
    public static StdVideoAV1Quantization create(long address) {
        return new StdVideoAV1Quantization(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1Quantization createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1Quantization(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1Quantization.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Quantization.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1Quantization.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Quantization.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1Quantization.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Quantization.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1Quantization.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Quantization.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1Quantization.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1Quantization} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1Quantization malloc(MemoryStack stack) {
        return new StdVideoAV1Quantization(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1Quantization} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1Quantization calloc(MemoryStack stack) {
        return new StdVideoAV1Quantization(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1Quantization.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Quantization.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1Quantization.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1Quantization.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoAV1QuantizationFlags nflags(long struct) { return StdVideoAV1QuantizationFlags.create(struct + StdVideoAV1Quantization.FLAGS); }
    /** Unsafe version of {@link #base_q_idx}. */
    public static byte nbase_q_idx(long struct) { return memGetByte(struct + StdVideoAV1Quantization.BASE_Q_IDX); }
    /** Unsafe version of {@link #DeltaQYDc}. */
    public static byte nDeltaQYDc(long struct) { return memGetByte(struct + StdVideoAV1Quantization.DELTAQYDC); }
    /** Unsafe version of {@link #DeltaQUDc}. */
    public static byte nDeltaQUDc(long struct) { return memGetByte(struct + StdVideoAV1Quantization.DELTAQUDC); }
    /** Unsafe version of {@link #DeltaQUAc}. */
    public static byte nDeltaQUAc(long struct) { return memGetByte(struct + StdVideoAV1Quantization.DELTAQUAC); }
    /** Unsafe version of {@link #DeltaQVDc}. */
    public static byte nDeltaQVDc(long struct) { return memGetByte(struct + StdVideoAV1Quantization.DELTAQVDC); }
    /** Unsafe version of {@link #DeltaQVAc}. */
    public static byte nDeltaQVAc(long struct) { return memGetByte(struct + StdVideoAV1Quantization.DELTAQVAC); }
    /** Unsafe version of {@link #qm_y}. */
    public static byte nqm_y(long struct) { return memGetByte(struct + StdVideoAV1Quantization.QM_Y); }
    /** Unsafe version of {@link #qm_u}. */
    public static byte nqm_u(long struct) { return memGetByte(struct + StdVideoAV1Quantization.QM_U); }
    /** Unsafe version of {@link #qm_v}. */
    public static byte nqm_v(long struct) { return memGetByte(struct + StdVideoAV1Quantization.QM_V); }

    /** Unsafe version of {@link #flags(StdVideoAV1QuantizationFlags) flags}. */
    public static void nflags(long struct, StdVideoAV1QuantizationFlags value) { memCopy(value.address(), struct + StdVideoAV1Quantization.FLAGS, StdVideoAV1QuantizationFlags.SIZEOF); }
    /** Unsafe version of {@link #base_q_idx(byte) base_q_idx}. */
    public static void nbase_q_idx(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.BASE_Q_IDX, value); }
    /** Unsafe version of {@link #DeltaQYDc(byte) DeltaQYDc}. */
    public static void nDeltaQYDc(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.DELTAQYDC, value); }
    /** Unsafe version of {@link #DeltaQUDc(byte) DeltaQUDc}. */
    public static void nDeltaQUDc(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.DELTAQUDC, value); }
    /** Unsafe version of {@link #DeltaQUAc(byte) DeltaQUAc}. */
    public static void nDeltaQUAc(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.DELTAQUAC, value); }
    /** Unsafe version of {@link #DeltaQVDc(byte) DeltaQVDc}. */
    public static void nDeltaQVDc(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.DELTAQVDC, value); }
    /** Unsafe version of {@link #DeltaQVAc(byte) DeltaQVAc}. */
    public static void nDeltaQVAc(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.DELTAQVAC, value); }
    /** Unsafe version of {@link #qm_y(byte) qm_y}. */
    public static void nqm_y(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.QM_Y, value); }
    /** Unsafe version of {@link #qm_u(byte) qm_u}. */
    public static void nqm_u(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.QM_U, value); }
    /** Unsafe version of {@link #qm_v(byte) qm_v}. */
    public static void nqm_v(long struct, byte value) { memPutByte(struct + StdVideoAV1Quantization.QM_V, value); }

    // -----------------------------------

    /** An array of {@link StdVideoAV1Quantization} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1Quantization, Buffer> implements NativeResource {

        private static final StdVideoAV1Quantization ELEMENT_FACTORY = StdVideoAV1Quantization.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1Quantization.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1Quantization#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1Quantization getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoAV1QuantizationFlags} view of the {@code flags} field. */
        public StdVideoAV1QuantizationFlags flags() { return StdVideoAV1Quantization.nflags(address()); }
        /** @return the value of the {@code base_q_idx} field. */
        @NativeType("uint8_t")
        public byte base_q_idx() { return StdVideoAV1Quantization.nbase_q_idx(address()); }
        /** @return the value of the {@code DeltaQYDc} field. */
        @NativeType("int8_t")
        public byte DeltaQYDc() { return StdVideoAV1Quantization.nDeltaQYDc(address()); }
        /** @return the value of the {@code DeltaQUDc} field. */
        @NativeType("int8_t")
        public byte DeltaQUDc() { return StdVideoAV1Quantization.nDeltaQUDc(address()); }
        /** @return the value of the {@code DeltaQUAc} field. */
        @NativeType("int8_t")
        public byte DeltaQUAc() { return StdVideoAV1Quantization.nDeltaQUAc(address()); }
        /** @return the value of the {@code DeltaQVDc} field. */
        @NativeType("int8_t")
        public byte DeltaQVDc() { return StdVideoAV1Quantization.nDeltaQVDc(address()); }
        /** @return the value of the {@code DeltaQVAc} field. */
        @NativeType("int8_t")
        public byte DeltaQVAc() { return StdVideoAV1Quantization.nDeltaQVAc(address()); }
        /** @return the value of the {@code qm_y} field. */
        @NativeType("uint8_t")
        public byte qm_y() { return StdVideoAV1Quantization.nqm_y(address()); }
        /** @return the value of the {@code qm_u} field. */
        @NativeType("uint8_t")
        public byte qm_u() { return StdVideoAV1Quantization.nqm_u(address()); }
        /** @return the value of the {@code qm_v} field. */
        @NativeType("uint8_t")
        public byte qm_v() { return StdVideoAV1Quantization.nqm_v(address()); }

        /** Copies the specified {@link StdVideoAV1QuantizationFlags} to the {@code flags} field. */
        public StdVideoAV1Quantization.Buffer flags(StdVideoAV1QuantizationFlags value) { StdVideoAV1Quantization.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoAV1Quantization.Buffer flags(java.util.function.Consumer<StdVideoAV1QuantizationFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code base_q_idx} field. */
        public StdVideoAV1Quantization.Buffer base_q_idx(@NativeType("uint8_t") byte value) { StdVideoAV1Quantization.nbase_q_idx(address(), value); return this; }
        /** Sets the specified value to the {@code DeltaQYDc} field. */
        public StdVideoAV1Quantization.Buffer DeltaQYDc(@NativeType("int8_t") byte value) { StdVideoAV1Quantization.nDeltaQYDc(address(), value); return this; }
        /** Sets the specified value to the {@code DeltaQUDc} field. */
        public StdVideoAV1Quantization.Buffer DeltaQUDc(@NativeType("int8_t") byte value) { StdVideoAV1Quantization.nDeltaQUDc(address(), value); return this; }
        /** Sets the specified value to the {@code DeltaQUAc} field. */
        public StdVideoAV1Quantization.Buffer DeltaQUAc(@NativeType("int8_t") byte value) { StdVideoAV1Quantization.nDeltaQUAc(address(), value); return this; }
        /** Sets the specified value to the {@code DeltaQVDc} field. */
        public StdVideoAV1Quantization.Buffer DeltaQVDc(@NativeType("int8_t") byte value) { StdVideoAV1Quantization.nDeltaQVDc(address(), value); return this; }
        /** Sets the specified value to the {@code DeltaQVAc} field. */
        public StdVideoAV1Quantization.Buffer DeltaQVAc(@NativeType("int8_t") byte value) { StdVideoAV1Quantization.nDeltaQVAc(address(), value); return this; }
        /** Sets the specified value to the {@code qm_y} field. */
        public StdVideoAV1Quantization.Buffer qm_y(@NativeType("uint8_t") byte value) { StdVideoAV1Quantization.nqm_y(address(), value); return this; }
        /** Sets the specified value to the {@code qm_u} field. */
        public StdVideoAV1Quantization.Buffer qm_u(@NativeType("uint8_t") byte value) { StdVideoAV1Quantization.nqm_u(address(), value); return this; }
        /** Sets the specified value to the {@code qm_v} field. */
        public StdVideoAV1Quantization.Buffer qm_v(@NativeType("uint8_t") byte value) { StdVideoAV1Quantization.nqm_v(address(), value); return this; }

    }

}
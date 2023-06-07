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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265SubLayerHrdParameters {
 *     uint32_t bit_rate_value_minus1[STD_VIDEO_H265_CPB_CNT_LIST_SIZE];
 *     uint32_t cpb_size_value_minus1[STD_VIDEO_H265_CPB_CNT_LIST_SIZE];
 *     uint32_t cpb_size_du_value_minus1[STD_VIDEO_H265_CPB_CNT_LIST_SIZE];
 *     uint32_t bit_rate_du_value_minus1[STD_VIDEO_H265_CPB_CNT_LIST_SIZE];
 *     uint32_t {@link #cbr_flag};
 * }</code></pre>
 */
public class StdVideoH265SubLayerHrdParameters extends Struct<StdVideoH265SubLayerHrdParameters> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BIT_RATE_VALUE_MINUS1,
        CPB_SIZE_VALUE_MINUS1,
        CPB_SIZE_DU_VALUE_MINUS1,
        BIT_RATE_DU_VALUE_MINUS1,
        CBR_FLAG;

    static {
        Layout layout = __struct(
            __array(4, STD_VIDEO_H265_CPB_CNT_LIST_SIZE),
            __array(4, STD_VIDEO_H265_CPB_CNT_LIST_SIZE),
            __array(4, STD_VIDEO_H265_CPB_CNT_LIST_SIZE),
            __array(4, STD_VIDEO_H265_CPB_CNT_LIST_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BIT_RATE_VALUE_MINUS1 = layout.offsetof(0);
        CPB_SIZE_VALUE_MINUS1 = layout.offsetof(1);
        CPB_SIZE_DU_VALUE_MINUS1 = layout.offsetof(2);
        BIT_RATE_DU_VALUE_MINUS1 = layout.offsetof(3);
        CBR_FLAG = layout.offsetof(4);
    }

    protected StdVideoH265SubLayerHrdParameters(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265SubLayerHrdParameters create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265SubLayerHrdParameters(address, container);
    }

    /**
     * Creates a {@code StdVideoH265SubLayerHrdParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265SubLayerHrdParameters(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the {@code bit_rate_value_minus1} field. */
    @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
    public IntBuffer bit_rate_value_minus1() { return nbit_rate_value_minus1(address()); }
    /** @return the value at the specified index of the {@code bit_rate_value_minus1} field. */
    @NativeType("uint32_t")
    public int bit_rate_value_minus1(int index) { return nbit_rate_value_minus1(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code cpb_size_value_minus1} field. */
    @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
    public IntBuffer cpb_size_value_minus1() { return ncpb_size_value_minus1(address()); }
    /** @return the value at the specified index of the {@code cpb_size_value_minus1} field. */
    @NativeType("uint32_t")
    public int cpb_size_value_minus1(int index) { return ncpb_size_value_minus1(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code cpb_size_du_value_minus1} field. */
    @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
    public IntBuffer cpb_size_du_value_minus1() { return ncpb_size_du_value_minus1(address()); }
    /** @return the value at the specified index of the {@code cpb_size_du_value_minus1} field. */
    @NativeType("uint32_t")
    public int cpb_size_du_value_minus1(int index) { return ncpb_size_du_value_minus1(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code bit_rate_du_value_minus1} field. */
    @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
    public IntBuffer bit_rate_du_value_minus1() { return nbit_rate_du_value_minus1(address()); }
    /** @return the value at the specified index of the {@code bit_rate_du_value_minus1} field. */
    @NativeType("uint32_t")
    public int bit_rate_du_value_minus1(int index) { return nbit_rate_du_value_minus1(address(), index); }
    /** each bit represents a range of CpbCounts (bit 0 - cpb_cnt_minus1) per sub-layer */
    @NativeType("uint32_t")
    public int cbr_flag() { return ncbr_flag(address()); }

    /** Copies the specified {@link IntBuffer} to the {@code bit_rate_value_minus1} field. */
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) { nbit_rate_value_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code bit_rate_value_minus1} field. */
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(int index, @NativeType("uint32_t") int value) { nbit_rate_value_minus1(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code cpb_size_value_minus1} field. */
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) { ncpb_size_value_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cpb_size_value_minus1} field. */
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(int index, @NativeType("uint32_t") int value) { ncpb_size_value_minus1(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code cpb_size_du_value_minus1} field. */
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) { ncpb_size_du_value_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cpb_size_du_value_minus1} field. */
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(int index, @NativeType("uint32_t") int value) { ncpb_size_du_value_minus1(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code bit_rate_du_value_minus1} field. */
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) { nbit_rate_du_value_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code bit_rate_du_value_minus1} field. */
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(int index, @NativeType("uint32_t") int value) { nbit_rate_du_value_minus1(address(), index, value); return this; }
    /** Sets the specified value to the {@link #cbr_flag} field. */
    public StdVideoH265SubLayerHrdParameters cbr_flag(@NativeType("uint32_t") int value) { ncbr_flag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265SubLayerHrdParameters set(
        IntBuffer bit_rate_value_minus1,
        IntBuffer cpb_size_value_minus1,
        IntBuffer cpb_size_du_value_minus1,
        IntBuffer bit_rate_du_value_minus1,
        int cbr_flag
    ) {
        bit_rate_value_minus1(bit_rate_value_minus1);
        cpb_size_value_minus1(cpb_size_value_minus1);
        cpb_size_du_value_minus1(cpb_size_du_value_minus1);
        bit_rate_du_value_minus1(bit_rate_du_value_minus1);
        cbr_flag(cbr_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265SubLayerHrdParameters set(StdVideoH265SubLayerHrdParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265SubLayerHrdParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265SubLayerHrdParameters malloc() {
        return new StdVideoH265SubLayerHrdParameters(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265SubLayerHrdParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265SubLayerHrdParameters calloc() {
        return new StdVideoH265SubLayerHrdParameters(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265SubLayerHrdParameters} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265SubLayerHrdParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265SubLayerHrdParameters(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265SubLayerHrdParameters} instance for the specified memory address. */
    public static StdVideoH265SubLayerHrdParameters create(long address) {
        return new StdVideoH265SubLayerHrdParameters(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SubLayerHrdParameters createSafe(long address) {
        return address == NULL ? null : new StdVideoH265SubLayerHrdParameters(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265SubLayerHrdParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SubLayerHrdParameters.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SubLayerHrdParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SubLayerHrdParameters.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SubLayerHrdParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SubLayerHrdParameters.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265SubLayerHrdParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SubLayerHrdParameters.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SubLayerHrdParameters.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265SubLayerHrdParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SubLayerHrdParameters malloc(MemoryStack stack) {
        return new StdVideoH265SubLayerHrdParameters(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265SubLayerHrdParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SubLayerHrdParameters calloc(MemoryStack stack) {
        return new StdVideoH265SubLayerHrdParameters(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265SubLayerHrdParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SubLayerHrdParameters.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SubLayerHrdParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SubLayerHrdParameters.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bit_rate_value_minus1}. */
    public static IntBuffer nbit_rate_value_minus1(long struct) { return memIntBuffer(struct + StdVideoH265SubLayerHrdParameters.BIT_RATE_VALUE_MINUS1, STD_VIDEO_H265_CPB_CNT_LIST_SIZE); }
    /** Unsafe version of {@link #bit_rate_value_minus1(int) bit_rate_value_minus1}. */
    public static int nbit_rate_value_minus1(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoH265SubLayerHrdParameters.BIT_RATE_VALUE_MINUS1 + check(index, STD_VIDEO_H265_CPB_CNT_LIST_SIZE) * 4);
    }
    /** Unsafe version of {@link #cpb_size_value_minus1}. */
    public static IntBuffer ncpb_size_value_minus1(long struct) { return memIntBuffer(struct + StdVideoH265SubLayerHrdParameters.CPB_SIZE_VALUE_MINUS1, STD_VIDEO_H265_CPB_CNT_LIST_SIZE); }
    /** Unsafe version of {@link #cpb_size_value_minus1(int) cpb_size_value_minus1}. */
    public static int ncpb_size_value_minus1(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoH265SubLayerHrdParameters.CPB_SIZE_VALUE_MINUS1 + check(index, STD_VIDEO_H265_CPB_CNT_LIST_SIZE) * 4);
    }
    /** Unsafe version of {@link #cpb_size_du_value_minus1}. */
    public static IntBuffer ncpb_size_du_value_minus1(long struct) { return memIntBuffer(struct + StdVideoH265SubLayerHrdParameters.CPB_SIZE_DU_VALUE_MINUS1, STD_VIDEO_H265_CPB_CNT_LIST_SIZE); }
    /** Unsafe version of {@link #cpb_size_du_value_minus1(int) cpb_size_du_value_minus1}. */
    public static int ncpb_size_du_value_minus1(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoH265SubLayerHrdParameters.CPB_SIZE_DU_VALUE_MINUS1 + check(index, STD_VIDEO_H265_CPB_CNT_LIST_SIZE) * 4);
    }
    /** Unsafe version of {@link #bit_rate_du_value_minus1}. */
    public static IntBuffer nbit_rate_du_value_minus1(long struct) { return memIntBuffer(struct + StdVideoH265SubLayerHrdParameters.BIT_RATE_DU_VALUE_MINUS1, STD_VIDEO_H265_CPB_CNT_LIST_SIZE); }
    /** Unsafe version of {@link #bit_rate_du_value_minus1(int) bit_rate_du_value_minus1}. */
    public static int nbit_rate_du_value_minus1(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoH265SubLayerHrdParameters.BIT_RATE_DU_VALUE_MINUS1 + check(index, STD_VIDEO_H265_CPB_CNT_LIST_SIZE) * 4);
    }
    /** Unsafe version of {@link #cbr_flag}. */
    public static int ncbr_flag(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SubLayerHrdParameters.CBR_FLAG); }

    /** Unsafe version of {@link #bit_rate_value_minus1(IntBuffer) bit_rate_value_minus1}. */
    public static void nbit_rate_value_minus1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_CPB_CNT_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265SubLayerHrdParameters.BIT_RATE_VALUE_MINUS1, value.remaining() * 4);
    }
    /** Unsafe version of {@link #bit_rate_value_minus1(int, int) bit_rate_value_minus1}. */
    public static void nbit_rate_value_minus1(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoH265SubLayerHrdParameters.BIT_RATE_VALUE_MINUS1 + check(index, STD_VIDEO_H265_CPB_CNT_LIST_SIZE) * 4, value);
    }
    /** Unsafe version of {@link #cpb_size_value_minus1(IntBuffer) cpb_size_value_minus1}. */
    public static void ncpb_size_value_minus1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_CPB_CNT_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265SubLayerHrdParameters.CPB_SIZE_VALUE_MINUS1, value.remaining() * 4);
    }
    /** Unsafe version of {@link #cpb_size_value_minus1(int, int) cpb_size_value_minus1}. */
    public static void ncpb_size_value_minus1(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoH265SubLayerHrdParameters.CPB_SIZE_VALUE_MINUS1 + check(index, STD_VIDEO_H265_CPB_CNT_LIST_SIZE) * 4, value);
    }
    /** Unsafe version of {@link #cpb_size_du_value_minus1(IntBuffer) cpb_size_du_value_minus1}. */
    public static void ncpb_size_du_value_minus1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_CPB_CNT_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265SubLayerHrdParameters.CPB_SIZE_DU_VALUE_MINUS1, value.remaining() * 4);
    }
    /** Unsafe version of {@link #cpb_size_du_value_minus1(int, int) cpb_size_du_value_minus1}. */
    public static void ncpb_size_du_value_minus1(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoH265SubLayerHrdParameters.CPB_SIZE_DU_VALUE_MINUS1 + check(index, STD_VIDEO_H265_CPB_CNT_LIST_SIZE) * 4, value);
    }
    /** Unsafe version of {@link #bit_rate_du_value_minus1(IntBuffer) bit_rate_du_value_minus1}. */
    public static void nbit_rate_du_value_minus1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_CPB_CNT_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265SubLayerHrdParameters.BIT_RATE_DU_VALUE_MINUS1, value.remaining() * 4);
    }
    /** Unsafe version of {@link #bit_rate_du_value_minus1(int, int) bit_rate_du_value_minus1}. */
    public static void nbit_rate_du_value_minus1(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoH265SubLayerHrdParameters.BIT_RATE_DU_VALUE_MINUS1 + check(index, STD_VIDEO_H265_CPB_CNT_LIST_SIZE) * 4, value);
    }
    /** Unsafe version of {@link #cbr_flag(int) cbr_flag}. */
    public static void ncbr_flag(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SubLayerHrdParameters.CBR_FLAG, value); }

    // -----------------------------------

    /** An array of {@link StdVideoH265SubLayerHrdParameters} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265SubLayerHrdParameters, Buffer> implements NativeResource {

        private static final StdVideoH265SubLayerHrdParameters ELEMENT_FACTORY = StdVideoH265SubLayerHrdParameters.create(-1L);

        /**
         * Creates a new {@code StdVideoH265SubLayerHrdParameters.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265SubLayerHrdParameters#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoH265SubLayerHrdParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@code bit_rate_value_minus1} field. */
        @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
        public IntBuffer bit_rate_value_minus1() { return StdVideoH265SubLayerHrdParameters.nbit_rate_value_minus1(address()); }
        /** @return the value at the specified index of the {@code bit_rate_value_minus1} field. */
        @NativeType("uint32_t")
        public int bit_rate_value_minus1(int index) { return StdVideoH265SubLayerHrdParameters.nbit_rate_value_minus1(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code cpb_size_value_minus1} field. */
        @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
        public IntBuffer cpb_size_value_minus1() { return StdVideoH265SubLayerHrdParameters.ncpb_size_value_minus1(address()); }
        /** @return the value at the specified index of the {@code cpb_size_value_minus1} field. */
        @NativeType("uint32_t")
        public int cpb_size_value_minus1(int index) { return StdVideoH265SubLayerHrdParameters.ncpb_size_value_minus1(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code cpb_size_du_value_minus1} field. */
        @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
        public IntBuffer cpb_size_du_value_minus1() { return StdVideoH265SubLayerHrdParameters.ncpb_size_du_value_minus1(address()); }
        /** @return the value at the specified index of the {@code cpb_size_du_value_minus1} field. */
        @NativeType("uint32_t")
        public int cpb_size_du_value_minus1(int index) { return StdVideoH265SubLayerHrdParameters.ncpb_size_du_value_minus1(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code bit_rate_du_value_minus1} field. */
        @NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]")
        public IntBuffer bit_rate_du_value_minus1() { return StdVideoH265SubLayerHrdParameters.nbit_rate_du_value_minus1(address()); }
        /** @return the value at the specified index of the {@code bit_rate_du_value_minus1} field. */
        @NativeType("uint32_t")
        public int bit_rate_du_value_minus1(int index) { return StdVideoH265SubLayerHrdParameters.nbit_rate_du_value_minus1(address(), index); }
        /** @return the value of the {@link StdVideoH265SubLayerHrdParameters#cbr_flag} field. */
        @NativeType("uint32_t")
        public int cbr_flag() { return StdVideoH265SubLayerHrdParameters.ncbr_flag(address()); }

        /** Copies the specified {@link IntBuffer} to the {@code bit_rate_value_minus1} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer bit_rate_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) { StdVideoH265SubLayerHrdParameters.nbit_rate_value_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code bit_rate_value_minus1} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer bit_rate_value_minus1(int index, @NativeType("uint32_t") int value) { StdVideoH265SubLayerHrdParameters.nbit_rate_value_minus1(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code cpb_size_value_minus1} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer cpb_size_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) { StdVideoH265SubLayerHrdParameters.ncpb_size_value_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cpb_size_value_minus1} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer cpb_size_value_minus1(int index, @NativeType("uint32_t") int value) { StdVideoH265SubLayerHrdParameters.ncpb_size_value_minus1(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code cpb_size_du_value_minus1} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer cpb_size_du_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) { StdVideoH265SubLayerHrdParameters.ncpb_size_du_value_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cpb_size_du_value_minus1} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer cpb_size_du_value_minus1(int index, @NativeType("uint32_t") int value) { StdVideoH265SubLayerHrdParameters.ncpb_size_du_value_minus1(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code bit_rate_du_value_minus1} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer bit_rate_du_value_minus1(@NativeType("uint32_t[STD_VIDEO_H265_CPB_CNT_LIST_SIZE]") IntBuffer value) { StdVideoH265SubLayerHrdParameters.nbit_rate_du_value_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code bit_rate_du_value_minus1} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer bit_rate_du_value_minus1(int index, @NativeType("uint32_t") int value) { StdVideoH265SubLayerHrdParameters.nbit_rate_du_value_minus1(address(), index, value); return this; }
        /** Sets the specified value to the {@link StdVideoH265SubLayerHrdParameters#cbr_flag} field. */
        public StdVideoH265SubLayerHrdParameters.Buffer cbr_flag(@NativeType("uint32_t") int value) { StdVideoH265SubLayerHrdParameters.ncbr_flag(address(), value); return this; }

    }

}
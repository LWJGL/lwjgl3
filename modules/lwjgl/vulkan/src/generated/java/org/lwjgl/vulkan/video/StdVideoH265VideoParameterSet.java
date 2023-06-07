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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265VideoParameterSet {
 *     {@link StdVideoH265VpsFlags StdVideoH265VpsFlags} flags;
 *     uint8_t vps_video_parameter_set_id;
 *     uint8_t vps_max_sub_layers_minus1;
 *     uint8_t reserved1;
 *     uint8_t reserved2;
 *     uint32_t vps_num_units_in_tick;
 *     uint32_t vps_time_scale;
 *     uint32_t vps_num_ticks_poc_diff_one_minus1;
 *     uint32_t reserved3;
 *     {@link StdVideoH265DecPicBufMgr StdVideoH265DecPicBufMgr} const * pDecPicBufMgr;
 *     {@link StdVideoH265HrdParameters StdVideoH265HrdParameters} const * pHrdParameters;
 *     {@link StdVideoH265ProfileTierLevel StdVideoH265ProfileTierLevel} const * pProfileTierLevel;
 * }</code></pre>
 */
public class StdVideoH265VideoParameterSet extends Struct<StdVideoH265VideoParameterSet> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        VPS_VIDEO_PARAMETER_SET_ID,
        VPS_MAX_SUB_LAYERS_MINUS1,
        RESERVED1,
        RESERVED2,
        VPS_NUM_UNITS_IN_TICK,
        VPS_TIME_SCALE,
        VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1,
        RESERVED3,
        PDECPICBUFMGR,
        PHRDPARAMETERS,
        PPROFILETIERLEVEL;

    static {
        Layout layout = __struct(
            __member(StdVideoH265VpsFlags.SIZEOF, StdVideoH265VpsFlags.ALIGNOF),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        VPS_VIDEO_PARAMETER_SET_ID = layout.offsetof(1);
        VPS_MAX_SUB_LAYERS_MINUS1 = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        RESERVED2 = layout.offsetof(4);
        VPS_NUM_UNITS_IN_TICK = layout.offsetof(5);
        VPS_TIME_SCALE = layout.offsetof(6);
        VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1 = layout.offsetof(7);
        RESERVED3 = layout.offsetof(8);
        PDECPICBUFMGR = layout.offsetof(9);
        PHRDPARAMETERS = layout.offsetof(10);
        PPROFILETIERLEVEL = layout.offsetof(11);
    }

    protected StdVideoH265VideoParameterSet(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265VideoParameterSet create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265VideoParameterSet(address, container);
    }

    /**
     * Creates a {@code StdVideoH265VideoParameterSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265VideoParameterSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoH265VpsFlags} view of the {@code flags} field. */
    public StdVideoH265VpsFlags flags() { return nflags(address()); }
    /** @return the value of the {@code vps_video_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte vps_video_parameter_set_id() { return nvps_video_parameter_set_id(address()); }
    /** @return the value of the {@code vps_max_sub_layers_minus1} field. */
    @NativeType("uint8_t")
    public byte vps_max_sub_layers_minus1() { return nvps_max_sub_layers_minus1(address()); }
    /** @return the value of the {@code vps_num_units_in_tick} field. */
    @NativeType("uint32_t")
    public int vps_num_units_in_tick() { return nvps_num_units_in_tick(address()); }
    /** @return the value of the {@code vps_time_scale} field. */
    @NativeType("uint32_t")
    public int vps_time_scale() { return nvps_time_scale(address()); }
    /** @return the value of the {@code vps_num_ticks_poc_diff_one_minus1} field. */
    @NativeType("uint32_t")
    public int vps_num_ticks_poc_diff_one_minus1() { return nvps_num_ticks_poc_diff_one_minus1(address()); }
    /** @return a {@link StdVideoH265DecPicBufMgr} view of the struct pointed to by the {@code pDecPicBufMgr} field. */
    @NativeType("StdVideoH265DecPicBufMgr const *")
    public StdVideoH265DecPicBufMgr pDecPicBufMgr() { return npDecPicBufMgr(address()); }
    /** @return a {@link StdVideoH265HrdParameters} view of the struct pointed to by the {@code pHrdParameters} field. */
    @NativeType("StdVideoH265HrdParameters const *")
    public StdVideoH265HrdParameters pHrdParameters() { return npHrdParameters(address()); }
    /** @return a {@link StdVideoH265ProfileTierLevel} view of the struct pointed to by the {@code pProfileTierLevel} field. */
    @NativeType("StdVideoH265ProfileTierLevel const *")
    public StdVideoH265ProfileTierLevel pProfileTierLevel() { return npProfileTierLevel(address()); }

    /** Copies the specified {@link StdVideoH265VpsFlags} to the {@code flags} field. */
    public StdVideoH265VideoParameterSet flags(StdVideoH265VpsFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265VideoParameterSet flags(java.util.function.Consumer<StdVideoH265VpsFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code vps_video_parameter_set_id} field. */
    public StdVideoH265VideoParameterSet vps_video_parameter_set_id(@NativeType("uint8_t") byte value) { nvps_video_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code vps_max_sub_layers_minus1} field. */
    public StdVideoH265VideoParameterSet vps_max_sub_layers_minus1(@NativeType("uint8_t") byte value) { nvps_max_sub_layers_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code vps_num_units_in_tick} field. */
    public StdVideoH265VideoParameterSet vps_num_units_in_tick(@NativeType("uint32_t") int value) { nvps_num_units_in_tick(address(), value); return this; }
    /** Sets the specified value to the {@code vps_time_scale} field. */
    public StdVideoH265VideoParameterSet vps_time_scale(@NativeType("uint32_t") int value) { nvps_time_scale(address(), value); return this; }
    /** Sets the specified value to the {@code vps_num_ticks_poc_diff_one_minus1} field. */
    public StdVideoH265VideoParameterSet vps_num_ticks_poc_diff_one_minus1(@NativeType("uint32_t") int value) { nvps_num_ticks_poc_diff_one_minus1(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265DecPicBufMgr} to the {@code pDecPicBufMgr} field. */
    public StdVideoH265VideoParameterSet pDecPicBufMgr(@NativeType("StdVideoH265DecPicBufMgr const *") StdVideoH265DecPicBufMgr value) { npDecPicBufMgr(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265HrdParameters} to the {@code pHrdParameters} field. */
    public StdVideoH265VideoParameterSet pHrdParameters(@NativeType("StdVideoH265HrdParameters const *") StdVideoH265HrdParameters value) { npHrdParameters(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265ProfileTierLevel} to the {@code pProfileTierLevel} field. */
    public StdVideoH265VideoParameterSet pProfileTierLevel(@NativeType("StdVideoH265ProfileTierLevel const *") StdVideoH265ProfileTierLevel value) { npProfileTierLevel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265VideoParameterSet set(
        StdVideoH265VpsFlags flags,
        byte vps_video_parameter_set_id,
        byte vps_max_sub_layers_minus1,
        int vps_num_units_in_tick,
        int vps_time_scale,
        int vps_num_ticks_poc_diff_one_minus1,
        StdVideoH265DecPicBufMgr pDecPicBufMgr,
        StdVideoH265HrdParameters pHrdParameters,
        StdVideoH265ProfileTierLevel pProfileTierLevel
    ) {
        flags(flags);
        vps_video_parameter_set_id(vps_video_parameter_set_id);
        vps_max_sub_layers_minus1(vps_max_sub_layers_minus1);
        vps_num_units_in_tick(vps_num_units_in_tick);
        vps_time_scale(vps_time_scale);
        vps_num_ticks_poc_diff_one_minus1(vps_num_ticks_poc_diff_one_minus1);
        pDecPicBufMgr(pDecPicBufMgr);
        pHrdParameters(pHrdParameters);
        pProfileTierLevel(pProfileTierLevel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265VideoParameterSet set(StdVideoH265VideoParameterSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265VideoParameterSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265VideoParameterSet malloc() {
        return new StdVideoH265VideoParameterSet(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265VideoParameterSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265VideoParameterSet calloc() {
        return new StdVideoH265VideoParameterSet(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265VideoParameterSet} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265VideoParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265VideoParameterSet(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265VideoParameterSet} instance for the specified memory address. */
    public static StdVideoH265VideoParameterSet create(long address) {
        return new StdVideoH265VideoParameterSet(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265VideoParameterSet createSafe(long address) {
        return address == NULL ? null : new StdVideoH265VideoParameterSet(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265VideoParameterSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VideoParameterSet.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265VideoParameterSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VideoParameterSet.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265VideoParameterSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VideoParameterSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265VideoParameterSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VideoParameterSet.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265VideoParameterSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265VideoParameterSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265VideoParameterSet malloc(MemoryStack stack) {
        return new StdVideoH265VideoParameterSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265VideoParameterSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265VideoParameterSet calloc(MemoryStack stack) {
        return new StdVideoH265VideoParameterSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265VideoParameterSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VideoParameterSet.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265VideoParameterSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265VideoParameterSet.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoH265VpsFlags nflags(long struct) { return StdVideoH265VpsFlags.create(struct + StdVideoH265VideoParameterSet.FLAGS); }
    /** Unsafe version of {@link #vps_video_parameter_set_id}. */
    public static byte nvps_video_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265VideoParameterSet.VPS_VIDEO_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #vps_max_sub_layers_minus1}. */
    public static byte nvps_max_sub_layers_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265VideoParameterSet.VPS_MAX_SUB_LAYERS_MINUS1); }
    public static byte nreserved1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265VideoParameterSet.RESERVED1); }
    public static byte nreserved2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265VideoParameterSet.RESERVED2); }
    /** Unsafe version of {@link #vps_num_units_in_tick}. */
    public static int nvps_num_units_in_tick(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265VideoParameterSet.VPS_NUM_UNITS_IN_TICK); }
    /** Unsafe version of {@link #vps_time_scale}. */
    public static int nvps_time_scale(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265VideoParameterSet.VPS_TIME_SCALE); }
    /** Unsafe version of {@link #vps_num_ticks_poc_diff_one_minus1}. */
    public static int nvps_num_ticks_poc_diff_one_minus1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265VideoParameterSet.VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1); }
    public static int nreserved3(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265VideoParameterSet.RESERVED3); }
    /** Unsafe version of {@link #pDecPicBufMgr}. */
    public static StdVideoH265DecPicBufMgr npDecPicBufMgr(long struct) { return StdVideoH265DecPicBufMgr.create(memGetAddress(struct + StdVideoH265VideoParameterSet.PDECPICBUFMGR)); }
    /** Unsafe version of {@link #pHrdParameters}. */
    public static StdVideoH265HrdParameters npHrdParameters(long struct) { return StdVideoH265HrdParameters.create(memGetAddress(struct + StdVideoH265VideoParameterSet.PHRDPARAMETERS)); }
    /** Unsafe version of {@link #pProfileTierLevel}. */
    public static StdVideoH265ProfileTierLevel npProfileTierLevel(long struct) { return StdVideoH265ProfileTierLevel.create(memGetAddress(struct + StdVideoH265VideoParameterSet.PPROFILETIERLEVEL)); }

    /** Unsafe version of {@link #flags(StdVideoH265VpsFlags) flags}. */
    public static void nflags(long struct, StdVideoH265VpsFlags value) { memCopy(value.address(), struct + StdVideoH265VideoParameterSet.FLAGS, StdVideoH265VpsFlags.SIZEOF); }
    /** Unsafe version of {@link #vps_video_parameter_set_id(byte) vps_video_parameter_set_id}. */
    public static void nvps_video_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265VideoParameterSet.VPS_VIDEO_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #vps_max_sub_layers_minus1(byte) vps_max_sub_layers_minus1}. */
    public static void nvps_max_sub_layers_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265VideoParameterSet.VPS_MAX_SUB_LAYERS_MINUS1, value); }
    public static void nreserved1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265VideoParameterSet.RESERVED1, value); }
    public static void nreserved2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265VideoParameterSet.RESERVED2, value); }
    /** Unsafe version of {@link #vps_num_units_in_tick(int) vps_num_units_in_tick}. */
    public static void nvps_num_units_in_tick(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265VideoParameterSet.VPS_NUM_UNITS_IN_TICK, value); }
    /** Unsafe version of {@link #vps_time_scale(int) vps_time_scale}. */
    public static void nvps_time_scale(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265VideoParameterSet.VPS_TIME_SCALE, value); }
    /** Unsafe version of {@link #vps_num_ticks_poc_diff_one_minus1(int) vps_num_ticks_poc_diff_one_minus1}. */
    public static void nvps_num_ticks_poc_diff_one_minus1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265VideoParameterSet.VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1, value); }
    public static void nreserved3(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265VideoParameterSet.RESERVED3, value); }
    /** Unsafe version of {@link #pDecPicBufMgr(StdVideoH265DecPicBufMgr) pDecPicBufMgr}. */
    public static void npDecPicBufMgr(long struct, StdVideoH265DecPicBufMgr value) { memPutAddress(struct + StdVideoH265VideoParameterSet.PDECPICBUFMGR, value.address()); }
    /** Unsafe version of {@link #pHrdParameters(StdVideoH265HrdParameters) pHrdParameters}. */
    public static void npHrdParameters(long struct, StdVideoH265HrdParameters value) { memPutAddress(struct + StdVideoH265VideoParameterSet.PHRDPARAMETERS, value.address()); }
    /** Unsafe version of {@link #pProfileTierLevel(StdVideoH265ProfileTierLevel) pProfileTierLevel}. */
    public static void npProfileTierLevel(long struct, StdVideoH265ProfileTierLevel value) { memPutAddress(struct + StdVideoH265VideoParameterSet.PPROFILETIERLEVEL, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoH265VideoParameterSet.PDECPICBUFMGR));
        long pHrdParameters = memGetAddress(struct + StdVideoH265VideoParameterSet.PHRDPARAMETERS);
        check(pHrdParameters);
        StdVideoH265HrdParameters.validate(pHrdParameters);
        check(memGetAddress(struct + StdVideoH265VideoParameterSet.PPROFILETIERLEVEL));
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265VideoParameterSet} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265VideoParameterSet, Buffer> implements NativeResource {

        private static final StdVideoH265VideoParameterSet ELEMENT_FACTORY = StdVideoH265VideoParameterSet.create(-1L);

        /**
         * Creates a new {@code StdVideoH265VideoParameterSet.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265VideoParameterSet#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoH265VideoParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoH265VpsFlags} view of the {@code flags} field. */
        public StdVideoH265VpsFlags flags() { return StdVideoH265VideoParameterSet.nflags(address()); }
        /** @return the value of the {@code vps_video_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte vps_video_parameter_set_id() { return StdVideoH265VideoParameterSet.nvps_video_parameter_set_id(address()); }
        /** @return the value of the {@code vps_max_sub_layers_minus1} field. */
        @NativeType("uint8_t")
        public byte vps_max_sub_layers_minus1() { return StdVideoH265VideoParameterSet.nvps_max_sub_layers_minus1(address()); }
        /** @return the value of the {@code vps_num_units_in_tick} field. */
        @NativeType("uint32_t")
        public int vps_num_units_in_tick() { return StdVideoH265VideoParameterSet.nvps_num_units_in_tick(address()); }
        /** @return the value of the {@code vps_time_scale} field. */
        @NativeType("uint32_t")
        public int vps_time_scale() { return StdVideoH265VideoParameterSet.nvps_time_scale(address()); }
        /** @return the value of the {@code vps_num_ticks_poc_diff_one_minus1} field. */
        @NativeType("uint32_t")
        public int vps_num_ticks_poc_diff_one_minus1() { return StdVideoH265VideoParameterSet.nvps_num_ticks_poc_diff_one_minus1(address()); }
        /** @return a {@link StdVideoH265DecPicBufMgr} view of the struct pointed to by the {@code pDecPicBufMgr} field. */
        @NativeType("StdVideoH265DecPicBufMgr const *")
        public StdVideoH265DecPicBufMgr pDecPicBufMgr() { return StdVideoH265VideoParameterSet.npDecPicBufMgr(address()); }
        /** @return a {@link StdVideoH265HrdParameters} view of the struct pointed to by the {@code pHrdParameters} field. */
        @NativeType("StdVideoH265HrdParameters const *")
        public StdVideoH265HrdParameters pHrdParameters() { return StdVideoH265VideoParameterSet.npHrdParameters(address()); }
        /** @return a {@link StdVideoH265ProfileTierLevel} view of the struct pointed to by the {@code pProfileTierLevel} field. */
        @NativeType("StdVideoH265ProfileTierLevel const *")
        public StdVideoH265ProfileTierLevel pProfileTierLevel() { return StdVideoH265VideoParameterSet.npProfileTierLevel(address()); }

        /** Copies the specified {@link StdVideoH265VpsFlags} to the {@code flags} field. */
        public StdVideoH265VideoParameterSet.Buffer flags(StdVideoH265VpsFlags value) { StdVideoH265VideoParameterSet.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265VideoParameterSet.Buffer flags(java.util.function.Consumer<StdVideoH265VpsFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code vps_video_parameter_set_id} field. */
        public StdVideoH265VideoParameterSet.Buffer vps_video_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoH265VideoParameterSet.nvps_video_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code vps_max_sub_layers_minus1} field. */
        public StdVideoH265VideoParameterSet.Buffer vps_max_sub_layers_minus1(@NativeType("uint8_t") byte value) { StdVideoH265VideoParameterSet.nvps_max_sub_layers_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code vps_num_units_in_tick} field. */
        public StdVideoH265VideoParameterSet.Buffer vps_num_units_in_tick(@NativeType("uint32_t") int value) { StdVideoH265VideoParameterSet.nvps_num_units_in_tick(address(), value); return this; }
        /** Sets the specified value to the {@code vps_time_scale} field. */
        public StdVideoH265VideoParameterSet.Buffer vps_time_scale(@NativeType("uint32_t") int value) { StdVideoH265VideoParameterSet.nvps_time_scale(address(), value); return this; }
        /** Sets the specified value to the {@code vps_num_ticks_poc_diff_one_minus1} field. */
        public StdVideoH265VideoParameterSet.Buffer vps_num_ticks_poc_diff_one_minus1(@NativeType("uint32_t") int value) { StdVideoH265VideoParameterSet.nvps_num_ticks_poc_diff_one_minus1(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265DecPicBufMgr} to the {@code pDecPicBufMgr} field. */
        public StdVideoH265VideoParameterSet.Buffer pDecPicBufMgr(@NativeType("StdVideoH265DecPicBufMgr const *") StdVideoH265DecPicBufMgr value) { StdVideoH265VideoParameterSet.npDecPicBufMgr(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265HrdParameters} to the {@code pHrdParameters} field. */
        public StdVideoH265VideoParameterSet.Buffer pHrdParameters(@NativeType("StdVideoH265HrdParameters const *") StdVideoH265HrdParameters value) { StdVideoH265VideoParameterSet.npHrdParameters(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265ProfileTierLevel} to the {@code pProfileTierLevel} field. */
        public StdVideoH265VideoParameterSet.Buffer pProfileTierLevel(@NativeType("StdVideoH265ProfileTierLevel const *") StdVideoH265ProfileTierLevel value) { StdVideoH265VideoParameterSet.npProfileTierLevel(address(), value); return this; }

    }

}
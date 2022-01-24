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
 * struct StdVideoH265HrdParameters {
 *     uint8_t tick_divisor_minus2;
 *     uint8_t du_cpb_removal_delay_increment_length_minus1;
 *     uint8_t dpb_output_delay_du_length_minus1;
 *     uint8_t bit_rate_scale;
 *     uint8_t cpb_size_scale;
 *     uint8_t cpb_size_du_scale;
 *     uint8_t initial_cpb_removal_delay_length_minus1;
 *     uint8_t au_cpb_removal_delay_length_minus1;
 *     uint8_t dpb_output_delay_length_minus1;
 *     uint8_t cpb_cnt_minus1[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE];
 *     uint16_t elemental_duration_in_tc_minus1[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE];
 *     {@link StdVideoH265SubLayerHrdParameters StdVideoH265SubLayerHrdParameters} * {@link #pSubLayerHrdParametersNal}[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE];
 *     {@link StdVideoH265SubLayerHrdParameters StdVideoH265SubLayerHrdParameters} * {@link #pSubLayerHrdParametersVcl}[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE];
 *     {@link StdVideoH265HrdFlags StdVideoH265HrdFlags} flags;
 * }</code></pre>
 */
public class StdVideoH265HrdParameters extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TICK_DIVISOR_MINUS2,
        DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1,
        DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1,
        BIT_RATE_SCALE,
        CPB_SIZE_SCALE,
        CPB_SIZE_DU_SCALE,
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1,
        AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1,
        DPB_OUTPUT_DELAY_LENGTH_MINUS1,
        CPB_CNT_MINUS1,
        ELEMENTAL_DURATION_IN_TC_MINUS1,
        PSUBLAYERHRDPARAMETERSNAL,
        PSUBLAYERHRDPARAMETERSVCL,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE),
            __array(2, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE),
            __array(POINTER_SIZE, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE),
            __array(POINTER_SIZE, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE),
            __member(StdVideoH265HrdFlags.SIZEOF, StdVideoH265HrdFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TICK_DIVISOR_MINUS2 = layout.offsetof(0);
        DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1 = layout.offsetof(1);
        DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1 = layout.offsetof(2);
        BIT_RATE_SCALE = layout.offsetof(3);
        CPB_SIZE_SCALE = layout.offsetof(4);
        CPB_SIZE_DU_SCALE = layout.offsetof(5);
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = layout.offsetof(6);
        AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = layout.offsetof(7);
        DPB_OUTPUT_DELAY_LENGTH_MINUS1 = layout.offsetof(8);
        CPB_CNT_MINUS1 = layout.offsetof(9);
        ELEMENTAL_DURATION_IN_TC_MINUS1 = layout.offsetof(10);
        PSUBLAYERHRDPARAMETERSNAL = layout.offsetof(11);
        PSUBLAYERHRDPARAMETERSVCL = layout.offsetof(12);
        FLAGS = layout.offsetof(13);
    }

    /**
     * Creates a {@code StdVideoH265HrdParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265HrdParameters(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code tick_divisor_minus2} field. */
    @NativeType("uint8_t")
    public byte tick_divisor_minus2() { return ntick_divisor_minus2(address()); }
    /** @return the value of the {@code du_cpb_removal_delay_increment_length_minus1} field. */
    @NativeType("uint8_t")
    public byte du_cpb_removal_delay_increment_length_minus1() { return ndu_cpb_removal_delay_increment_length_minus1(address()); }
    /** @return the value of the {@code dpb_output_delay_du_length_minus1} field. */
    @NativeType("uint8_t")
    public byte dpb_output_delay_du_length_minus1() { return ndpb_output_delay_du_length_minus1(address()); }
    /** @return the value of the {@code bit_rate_scale} field. */
    @NativeType("uint8_t")
    public byte bit_rate_scale() { return nbit_rate_scale(address()); }
    /** @return the value of the {@code cpb_size_scale} field. */
    @NativeType("uint8_t")
    public byte cpb_size_scale() { return ncpb_size_scale(address()); }
    /** @return the value of the {@code cpb_size_du_scale} field. */
    @NativeType("uint8_t")
    public byte cpb_size_du_scale() { return ncpb_size_du_scale(address()); }
    /** @return the value of the {@code initial_cpb_removal_delay_length_minus1} field. */
    @NativeType("uint8_t")
    public byte initial_cpb_removal_delay_length_minus1() { return ninitial_cpb_removal_delay_length_minus1(address()); }
    /** @return the value of the {@code au_cpb_removal_delay_length_minus1} field. */
    @NativeType("uint8_t")
    public byte au_cpb_removal_delay_length_minus1() { return nau_cpb_removal_delay_length_minus1(address()); }
    /** @return the value of the {@code dpb_output_delay_length_minus1} field. */
    @NativeType("uint8_t")
    public byte dpb_output_delay_length_minus1() { return ndpb_output_delay_length_minus1(address()); }
    /** @return a {@link ByteBuffer} view of the {@code cpb_cnt_minus1} field. */
    @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
    public ByteBuffer cpb_cnt_minus1() { return ncpb_cnt_minus1(address()); }
    /** @return the value at the specified index of the {@code cpb_cnt_minus1} field. */
    @NativeType("uint8_t")
    public byte cpb_cnt_minus1(int index) { return ncpb_cnt_minus1(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code elemental_duration_in_tc_minus1} field. */
    @NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
    public ShortBuffer elemental_duration_in_tc_minus1() { return nelemental_duration_in_tc_minus1(address()); }
    /** @return the value at the specified index of the {@code elemental_duration_in_tc_minus1} field. */
    @NativeType("uint16_t")
    public short elemental_duration_in_tc_minus1(int index) { return nelemental_duration_in_tc_minus1(address(), index); }
    /** NAL per layer {@code ptr} to {@code sub_layer_hrd_parameters} */
    @NativeType("StdVideoH265SubLayerHrdParameters *[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
    public PointerBuffer pSubLayerHrdParametersNal() { return npSubLayerHrdParametersNal(address()); }
    /** NAL per layer {@code ptr} to {@code sub_layer_hrd_parameters} */
    @NativeType("StdVideoH265SubLayerHrdParameters *")
    public StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersNal(int index) { return npSubLayerHrdParametersNal(address(), index); }
    /** VCL per layer {@code ptr} to {@code sub_layer_hrd_parameters} */
    @NativeType("StdVideoH265SubLayerHrdParameters *[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
    public PointerBuffer pSubLayerHrdParametersVcl() { return npSubLayerHrdParametersVcl(address()); }
    /** VCL per layer {@code ptr} to {@code sub_layer_hrd_parameters} */
    @NativeType("StdVideoH265SubLayerHrdParameters *")
    public StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersVcl(int index) { return npSubLayerHrdParametersVcl(address(), index); }
    /** @return a {@link StdVideoH265HrdFlags} view of the {@code flags} field. */
    public StdVideoH265HrdFlags flags() { return nflags(address()); }

    /** Sets the specified value to the {@code tick_divisor_minus2} field. */
    public StdVideoH265HrdParameters tick_divisor_minus2(@NativeType("uint8_t") byte value) { ntick_divisor_minus2(address(), value); return this; }
    /** Sets the specified value to the {@code du_cpb_removal_delay_increment_length_minus1} field. */
    public StdVideoH265HrdParameters du_cpb_removal_delay_increment_length_minus1(@NativeType("uint8_t") byte value) { ndu_cpb_removal_delay_increment_length_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code dpb_output_delay_du_length_minus1} field. */
    public StdVideoH265HrdParameters dpb_output_delay_du_length_minus1(@NativeType("uint8_t") byte value) { ndpb_output_delay_du_length_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code bit_rate_scale} field. */
    public StdVideoH265HrdParameters bit_rate_scale(@NativeType("uint8_t") byte value) { nbit_rate_scale(address(), value); return this; }
    /** Sets the specified value to the {@code cpb_size_scale} field. */
    public StdVideoH265HrdParameters cpb_size_scale(@NativeType("uint8_t") byte value) { ncpb_size_scale(address(), value); return this; }
    /** Sets the specified value to the {@code cpb_size_du_scale} field. */
    public StdVideoH265HrdParameters cpb_size_du_scale(@NativeType("uint8_t") byte value) { ncpb_size_du_scale(address(), value); return this; }
    /** Sets the specified value to the {@code initial_cpb_removal_delay_length_minus1} field. */
    public StdVideoH265HrdParameters initial_cpb_removal_delay_length_minus1(@NativeType("uint8_t") byte value) { ninitial_cpb_removal_delay_length_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code au_cpb_removal_delay_length_minus1} field. */
    public StdVideoH265HrdParameters au_cpb_removal_delay_length_minus1(@NativeType("uint8_t") byte value) { nau_cpb_removal_delay_length_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code dpb_output_delay_length_minus1} field. */
    public StdVideoH265HrdParameters dpb_output_delay_length_minus1(@NativeType("uint8_t") byte value) { ndpb_output_delay_length_minus1(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cpb_cnt_minus1} field. */
    public StdVideoH265HrdParameters cpb_cnt_minus1(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") ByteBuffer value) { ncpb_cnt_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cpb_cnt_minus1} field. */
    public StdVideoH265HrdParameters cpb_cnt_minus1(int index, @NativeType("uint8_t") byte value) { ncpb_cnt_minus1(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code elemental_duration_in_tc_minus1} field. */
    public StdVideoH265HrdParameters elemental_duration_in_tc_minus1(@NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") ShortBuffer value) { nelemental_duration_in_tc_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code elemental_duration_in_tc_minus1} field. */
    public StdVideoH265HrdParameters elemental_duration_in_tc_minus1(int index, @NativeType("uint16_t") short value) { nelemental_duration_in_tc_minus1(address(), index, value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@link #pSubLayerHrdParametersNal} field. */
    public StdVideoH265HrdParameters pSubLayerHrdParametersNal(@NativeType("StdVideoH265SubLayerHrdParameters *[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") PointerBuffer value) { npSubLayerHrdParametersNal(address(), value); return this; }
    /** Copies the address of the specified {@link StdVideoH265SubLayerHrdParameters} at the specified index of the {@link #pSubLayerHrdParametersNal} field. */
    public StdVideoH265HrdParameters pSubLayerHrdParametersNal(int index, @NativeType("StdVideoH265SubLayerHrdParameters *") StdVideoH265SubLayerHrdParameters value) { npSubLayerHrdParametersNal(address(), index, value); return this; }
    /** Passes the element at {@code index} of the {@link #pSubLayerHrdParametersNal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265HrdParameters pSubLayerHrdParametersNal(int index, java.util.function.Consumer<StdVideoH265SubLayerHrdParameters> consumer) { consumer.accept(pSubLayerHrdParametersNal(index)); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@link #pSubLayerHrdParametersVcl} field. */
    public StdVideoH265HrdParameters pSubLayerHrdParametersVcl(@NativeType("StdVideoH265SubLayerHrdParameters *[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") PointerBuffer value) { npSubLayerHrdParametersVcl(address(), value); return this; }
    /** Copies the address of the specified {@link StdVideoH265SubLayerHrdParameters} at the specified index of the {@link #pSubLayerHrdParametersVcl} field. */
    public StdVideoH265HrdParameters pSubLayerHrdParametersVcl(int index, @NativeType("StdVideoH265SubLayerHrdParameters *") StdVideoH265SubLayerHrdParameters value) { npSubLayerHrdParametersVcl(address(), index, value); return this; }
    /** Passes the element at {@code index} of the {@link #pSubLayerHrdParametersVcl} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265HrdParameters pSubLayerHrdParametersVcl(int index, java.util.function.Consumer<StdVideoH265SubLayerHrdParameters> consumer) { consumer.accept(pSubLayerHrdParametersVcl(index)); return this; }
    /** Copies the specified {@link StdVideoH265HrdFlags} to the {@code flags} field. */
    public StdVideoH265HrdParameters flags(StdVideoH265HrdFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265HrdParameters flags(java.util.function.Consumer<StdVideoH265HrdFlags> consumer) { consumer.accept(flags()); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265HrdParameters set(
        byte tick_divisor_minus2,
        byte du_cpb_removal_delay_increment_length_minus1,
        byte dpb_output_delay_du_length_minus1,
        byte bit_rate_scale,
        byte cpb_size_scale,
        byte cpb_size_du_scale,
        byte initial_cpb_removal_delay_length_minus1,
        byte au_cpb_removal_delay_length_minus1,
        byte dpb_output_delay_length_minus1,
        ByteBuffer cpb_cnt_minus1,
        ShortBuffer elemental_duration_in_tc_minus1,
        PointerBuffer pSubLayerHrdParametersNal,
        PointerBuffer pSubLayerHrdParametersVcl,
        StdVideoH265HrdFlags flags
    ) {
        tick_divisor_minus2(tick_divisor_minus2);
        du_cpb_removal_delay_increment_length_minus1(du_cpb_removal_delay_increment_length_minus1);
        dpb_output_delay_du_length_minus1(dpb_output_delay_du_length_minus1);
        bit_rate_scale(bit_rate_scale);
        cpb_size_scale(cpb_size_scale);
        cpb_size_du_scale(cpb_size_du_scale);
        initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1);
        au_cpb_removal_delay_length_minus1(au_cpb_removal_delay_length_minus1);
        dpb_output_delay_length_minus1(dpb_output_delay_length_minus1);
        cpb_cnt_minus1(cpb_cnt_minus1);
        elemental_duration_in_tc_minus1(elemental_duration_in_tc_minus1);
        pSubLayerHrdParametersNal(pSubLayerHrdParametersNal);
        pSubLayerHrdParametersVcl(pSubLayerHrdParametersVcl);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265HrdParameters set(StdVideoH265HrdParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265HrdParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265HrdParameters malloc() {
        return wrap(StdVideoH265HrdParameters.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265HrdParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265HrdParameters calloc() {
        return wrap(StdVideoH265HrdParameters.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265HrdParameters} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265HrdParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265HrdParameters.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265HrdParameters} instance for the specified memory address. */
    public static StdVideoH265HrdParameters create(long address) {
        return wrap(StdVideoH265HrdParameters.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265HrdParameters createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265HrdParameters.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265HrdParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdParameters.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265HrdParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdParameters.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265HrdParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdParameters.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265HrdParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdParameters.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265HrdParameters.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265HrdParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265HrdParameters malloc(MemoryStack stack) {
        return wrap(StdVideoH265HrdParameters.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265HrdParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265HrdParameters calloc(MemoryStack stack) {
        return wrap(StdVideoH265HrdParameters.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265HrdParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdParameters.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265HrdParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265HrdParameters.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tick_divisor_minus2}. */
    public static byte ntick_divisor_minus2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.TICK_DIVISOR_MINUS2); }
    /** Unsafe version of {@link #du_cpb_removal_delay_increment_length_minus1}. */
    public static byte ndu_cpb_removal_delay_increment_length_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1); }
    /** Unsafe version of {@link #dpb_output_delay_du_length_minus1}. */
    public static byte ndpb_output_delay_du_length_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1); }
    /** Unsafe version of {@link #bit_rate_scale}. */
    public static byte nbit_rate_scale(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.BIT_RATE_SCALE); }
    /** Unsafe version of {@link #cpb_size_scale}. */
    public static byte ncpb_size_scale(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.CPB_SIZE_SCALE); }
    /** Unsafe version of {@link #cpb_size_du_scale}. */
    public static byte ncpb_size_du_scale(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.CPB_SIZE_DU_SCALE); }
    /** Unsafe version of {@link #initial_cpb_removal_delay_length_minus1}. */
    public static byte ninitial_cpb_removal_delay_length_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1); }
    /** Unsafe version of {@link #au_cpb_removal_delay_length_minus1}. */
    public static byte nau_cpb_removal_delay_length_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1); }
    /** Unsafe version of {@link #dpb_output_delay_length_minus1}. */
    public static byte ndpb_output_delay_length_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_LENGTH_MINUS1); }
    /** Unsafe version of {@link #cpb_cnt_minus1}. */
    public static ByteBuffer ncpb_cnt_minus1(long struct) { return memByteBuffer(struct + StdVideoH265HrdParameters.CPB_CNT_MINUS1, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
    /** Unsafe version of {@link #cpb_cnt_minus1(int) cpb_cnt_minus1}. */
    public static byte ncpb_cnt_minus1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265HrdParameters.CPB_CNT_MINUS1 + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #elemental_duration_in_tc_minus1}. */
    public static ShortBuffer nelemental_duration_in_tc_minus1(long struct) { return memShortBuffer(struct + StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
    /** Unsafe version of {@link #elemental_duration_in_tc_minus1(int) elemental_duration_in_tc_minus1}. */
    public static short nelemental_duration_in_tc_minus1(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1 + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 2);
    }
    /** Unsafe version of {@link #pSubLayerHrdParametersNal}. */
    public static PointerBuffer npSubLayerHrdParametersNal(long struct) { return memPointerBuffer(struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
    /** Unsafe version of {@link #pSubLayerHrdParametersNal(int) pSubLayerHrdParametersNal}. */
    public static StdVideoH265SubLayerHrdParameters npSubLayerHrdParametersNal(long struct, int index) {
        return StdVideoH265SubLayerHrdParameters.create(memGetAddress(struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * POINTER_SIZE));
    }
    /** Unsafe version of {@link #pSubLayerHrdParametersVcl}. */
    public static PointerBuffer npSubLayerHrdParametersVcl(long struct) { return memPointerBuffer(struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
    /** Unsafe version of {@link #pSubLayerHrdParametersVcl(int) pSubLayerHrdParametersVcl}. */
    public static StdVideoH265SubLayerHrdParameters npSubLayerHrdParametersVcl(long struct, int index) {
        return StdVideoH265SubLayerHrdParameters.create(memGetAddress(struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * POINTER_SIZE));
    }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoH265HrdFlags nflags(long struct) { return StdVideoH265HrdFlags.create(struct + StdVideoH265HrdParameters.FLAGS); }

    /** Unsafe version of {@link #tick_divisor_minus2(byte) tick_divisor_minus2}. */
    public static void ntick_divisor_minus2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.TICK_DIVISOR_MINUS2, value); }
    /** Unsafe version of {@link #du_cpb_removal_delay_increment_length_minus1(byte) du_cpb_removal_delay_increment_length_minus1}. */
    public static void ndu_cpb_removal_delay_increment_length_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1, value); }
    /** Unsafe version of {@link #dpb_output_delay_du_length_minus1(byte) dpb_output_delay_du_length_minus1}. */
    public static void ndpb_output_delay_du_length_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1, value); }
    /** Unsafe version of {@link #bit_rate_scale(byte) bit_rate_scale}. */
    public static void nbit_rate_scale(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.BIT_RATE_SCALE, value); }
    /** Unsafe version of {@link #cpb_size_scale(byte) cpb_size_scale}. */
    public static void ncpb_size_scale(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.CPB_SIZE_SCALE, value); }
    /** Unsafe version of {@link #cpb_size_du_scale(byte) cpb_size_du_scale}. */
    public static void ncpb_size_du_scale(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.CPB_SIZE_DU_SCALE, value); }
    /** Unsafe version of {@link #initial_cpb_removal_delay_length_minus1(byte) initial_cpb_removal_delay_length_minus1}. */
    public static void ninitial_cpb_removal_delay_length_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1, value); }
    /** Unsafe version of {@link #au_cpb_removal_delay_length_minus1(byte) au_cpb_removal_delay_length_minus1}. */
    public static void nau_cpb_removal_delay_length_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1, value); }
    /** Unsafe version of {@link #dpb_output_delay_length_minus1(byte) dpb_output_delay_length_minus1}. */
    public static void ndpb_output_delay_length_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.DPB_OUTPUT_DELAY_LENGTH_MINUS1, value); }
    /** Unsafe version of {@link #cpb_cnt_minus1(ByteBuffer) cpb_cnt_minus1}. */
    public static void ncpb_cnt_minus1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265HrdParameters.CPB_CNT_MINUS1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cpb_cnt_minus1(int, byte) cpb_cnt_minus1}. */
    public static void ncpb_cnt_minus1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265HrdParameters.CPB_CNT_MINUS1 + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #elemental_duration_in_tc_minus1(ShortBuffer) elemental_duration_in_tc_minus1}. */
    public static void nelemental_duration_in_tc_minus1(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1, value.remaining() * 2);
    }
    /** Unsafe version of {@link #elemental_duration_in_tc_minus1(int, short) elemental_duration_in_tc_minus1}. */
    public static void nelemental_duration_in_tc_minus1(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoH265HrdParameters.ELEMENTAL_DURATION_IN_TC_MINUS1 + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * 2, value);
    }
    /** Unsafe version of {@link #pSubLayerHrdParametersNal(PointerBuffer) pSubLayerHrdParametersNal}. */
    public static void npSubLayerHrdParametersNal(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #pSubLayerHrdParametersNal(int, StdVideoH265SubLayerHrdParameters) pSubLayerHrdParametersNal}. */
    public static void npSubLayerHrdParametersNal(long struct, int index, StdVideoH265SubLayerHrdParameters value) {
        memPutAddress(struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * POINTER_SIZE, value.address());
    }
    /** Unsafe version of {@link #pSubLayerHrdParametersVcl(PointerBuffer) pSubLayerHrdParametersVcl}. */
    public static void npSubLayerHrdParametersVcl(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #pSubLayerHrdParametersVcl(int, StdVideoH265SubLayerHrdParameters) pSubLayerHrdParametersVcl}. */
    public static void npSubLayerHrdParametersVcl(long struct, int index, StdVideoH265SubLayerHrdParameters value) {
        memPutAddress(struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL + check(index, STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE) * POINTER_SIZE, value.address());
    }
    /** Unsafe version of {@link #flags(StdVideoH265HrdFlags) flags}. */
    public static void nflags(long struct, StdVideoH265HrdFlags value) { memCopy(value.address(), struct + StdVideoH265HrdParameters.FLAGS, StdVideoH265HrdFlags.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSNAL));
        check(memGetAddress(struct + StdVideoH265HrdParameters.PSUBLAYERHRDPARAMETERSVCL));
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265HrdParameters} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265HrdParameters, Buffer> implements NativeResource {

        private static final StdVideoH265HrdParameters ELEMENT_FACTORY = StdVideoH265HrdParameters.create(-1L);

        /**
         * Creates a new {@code StdVideoH265HrdParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265HrdParameters#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265HrdParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code tick_divisor_minus2} field. */
        @NativeType("uint8_t")
        public byte tick_divisor_minus2() { return StdVideoH265HrdParameters.ntick_divisor_minus2(address()); }
        /** @return the value of the {@code du_cpb_removal_delay_increment_length_minus1} field. */
        @NativeType("uint8_t")
        public byte du_cpb_removal_delay_increment_length_minus1() { return StdVideoH265HrdParameters.ndu_cpb_removal_delay_increment_length_minus1(address()); }
        /** @return the value of the {@code dpb_output_delay_du_length_minus1} field. */
        @NativeType("uint8_t")
        public byte dpb_output_delay_du_length_minus1() { return StdVideoH265HrdParameters.ndpb_output_delay_du_length_minus1(address()); }
        /** @return the value of the {@code bit_rate_scale} field. */
        @NativeType("uint8_t")
        public byte bit_rate_scale() { return StdVideoH265HrdParameters.nbit_rate_scale(address()); }
        /** @return the value of the {@code cpb_size_scale} field. */
        @NativeType("uint8_t")
        public byte cpb_size_scale() { return StdVideoH265HrdParameters.ncpb_size_scale(address()); }
        /** @return the value of the {@code cpb_size_du_scale} field. */
        @NativeType("uint8_t")
        public byte cpb_size_du_scale() { return StdVideoH265HrdParameters.ncpb_size_du_scale(address()); }
        /** @return the value of the {@code initial_cpb_removal_delay_length_minus1} field. */
        @NativeType("uint8_t")
        public byte initial_cpb_removal_delay_length_minus1() { return StdVideoH265HrdParameters.ninitial_cpb_removal_delay_length_minus1(address()); }
        /** @return the value of the {@code au_cpb_removal_delay_length_minus1} field. */
        @NativeType("uint8_t")
        public byte au_cpb_removal_delay_length_minus1() { return StdVideoH265HrdParameters.nau_cpb_removal_delay_length_minus1(address()); }
        /** @return the value of the {@code dpb_output_delay_length_minus1} field. */
        @NativeType("uint8_t")
        public byte dpb_output_delay_length_minus1() { return StdVideoH265HrdParameters.ndpb_output_delay_length_minus1(address()); }
        /** @return a {@link ByteBuffer} view of the {@code cpb_cnt_minus1} field. */
        @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
        public ByteBuffer cpb_cnt_minus1() { return StdVideoH265HrdParameters.ncpb_cnt_minus1(address()); }
        /** @return the value at the specified index of the {@code cpb_cnt_minus1} field. */
        @NativeType("uint8_t")
        public byte cpb_cnt_minus1(int index) { return StdVideoH265HrdParameters.ncpb_cnt_minus1(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code elemental_duration_in_tc_minus1} field. */
        @NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
        public ShortBuffer elemental_duration_in_tc_minus1() { return StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(address()); }
        /** @return the value at the specified index of the {@code elemental_duration_in_tc_minus1} field. */
        @NativeType("uint16_t")
        public short elemental_duration_in_tc_minus1(int index) { return StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(address(), index); }
        /** @return a {@link PointerBuffer} view of the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersNal} field. */
        @NativeType("StdVideoH265SubLayerHrdParameters *[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
        public PointerBuffer pSubLayerHrdParametersNal() { return StdVideoH265HrdParameters.npSubLayerHrdParametersNal(address()); }
        /** @return a {@link StdVideoH265SubLayerHrdParameters} view of the pointer at the specified index of the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersNal} field. */
        @NativeType("StdVideoH265SubLayerHrdParameters *")
        public StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersNal(int index) { return StdVideoH265HrdParameters.npSubLayerHrdParametersNal(address(), index); }
        /** @return a {@link PointerBuffer} view of the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersVcl} field. */
        @NativeType("StdVideoH265SubLayerHrdParameters *[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]")
        public PointerBuffer pSubLayerHrdParametersVcl() { return StdVideoH265HrdParameters.npSubLayerHrdParametersVcl(address()); }
        /** @return a {@link StdVideoH265SubLayerHrdParameters} view of the pointer at the specified index of the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersVcl} field. */
        @NativeType("StdVideoH265SubLayerHrdParameters *")
        public StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersVcl(int index) { return StdVideoH265HrdParameters.npSubLayerHrdParametersVcl(address(), index); }
        /** @return a {@link StdVideoH265HrdFlags} view of the {@code flags} field. */
        public StdVideoH265HrdFlags flags() { return StdVideoH265HrdParameters.nflags(address()); }

        /** Sets the specified value to the {@code tick_divisor_minus2} field. */
        public StdVideoH265HrdParameters.Buffer tick_divisor_minus2(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.ntick_divisor_minus2(address(), value); return this; }
        /** Sets the specified value to the {@code du_cpb_removal_delay_increment_length_minus1} field. */
        public StdVideoH265HrdParameters.Buffer du_cpb_removal_delay_increment_length_minus1(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.ndu_cpb_removal_delay_increment_length_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code dpb_output_delay_du_length_minus1} field. */
        public StdVideoH265HrdParameters.Buffer dpb_output_delay_du_length_minus1(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.ndpb_output_delay_du_length_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code bit_rate_scale} field. */
        public StdVideoH265HrdParameters.Buffer bit_rate_scale(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.nbit_rate_scale(address(), value); return this; }
        /** Sets the specified value to the {@code cpb_size_scale} field. */
        public StdVideoH265HrdParameters.Buffer cpb_size_scale(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.ncpb_size_scale(address(), value); return this; }
        /** Sets the specified value to the {@code cpb_size_du_scale} field. */
        public StdVideoH265HrdParameters.Buffer cpb_size_du_scale(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.ncpb_size_du_scale(address(), value); return this; }
        /** Sets the specified value to the {@code initial_cpb_removal_delay_length_minus1} field. */
        public StdVideoH265HrdParameters.Buffer initial_cpb_removal_delay_length_minus1(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.ninitial_cpb_removal_delay_length_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code au_cpb_removal_delay_length_minus1} field. */
        public StdVideoH265HrdParameters.Buffer au_cpb_removal_delay_length_minus1(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.nau_cpb_removal_delay_length_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code dpb_output_delay_length_minus1} field. */
        public StdVideoH265HrdParameters.Buffer dpb_output_delay_length_minus1(@NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.ndpb_output_delay_length_minus1(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cpb_cnt_minus1} field. */
        public StdVideoH265HrdParameters.Buffer cpb_cnt_minus1(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") ByteBuffer value) { StdVideoH265HrdParameters.ncpb_cnt_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cpb_cnt_minus1} field. */
        public StdVideoH265HrdParameters.Buffer cpb_cnt_minus1(int index, @NativeType("uint8_t") byte value) { StdVideoH265HrdParameters.ncpb_cnt_minus1(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code elemental_duration_in_tc_minus1} field. */
        public StdVideoH265HrdParameters.Buffer elemental_duration_in_tc_minus1(@NativeType("uint16_t[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") ShortBuffer value) { StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code elemental_duration_in_tc_minus1} field. */
        public StdVideoH265HrdParameters.Buffer elemental_duration_in_tc_minus1(int index, @NativeType("uint16_t") short value) { StdVideoH265HrdParameters.nelemental_duration_in_tc_minus1(address(), index, value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersNal} field. */
        public StdVideoH265HrdParameters.Buffer pSubLayerHrdParametersNal(@NativeType("StdVideoH265SubLayerHrdParameters *[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") PointerBuffer value) { StdVideoH265HrdParameters.npSubLayerHrdParametersNal(address(), value); return this; }
        /** Copies the address of the specified {@link StdVideoH265SubLayerHrdParameters} at the specified index of the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersNal} field. */
        public StdVideoH265HrdParameters.Buffer pSubLayerHrdParametersNal(int index, @NativeType("StdVideoH265SubLayerHrdParameters *") StdVideoH265SubLayerHrdParameters value) { StdVideoH265HrdParameters.npSubLayerHrdParametersNal(address(), index, value); return this; }
        /** Passes the element at {@code index} of the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersNal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265HrdParameters.Buffer pSubLayerHrdParametersNal(int index, java.util.function.Consumer<StdVideoH265SubLayerHrdParameters> consumer) { consumer.accept(pSubLayerHrdParametersNal(index)); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersVcl} field. */
        public StdVideoH265HrdParameters.Buffer pSubLayerHrdParametersVcl(@NativeType("StdVideoH265SubLayerHrdParameters *[STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE]") PointerBuffer value) { StdVideoH265HrdParameters.npSubLayerHrdParametersVcl(address(), value); return this; }
        /** Copies the address of the specified {@link StdVideoH265SubLayerHrdParameters} at the specified index of the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersVcl} field. */
        public StdVideoH265HrdParameters.Buffer pSubLayerHrdParametersVcl(int index, @NativeType("StdVideoH265SubLayerHrdParameters *") StdVideoH265SubLayerHrdParameters value) { StdVideoH265HrdParameters.npSubLayerHrdParametersVcl(address(), index, value); return this; }
        /** Passes the element at {@code index} of the {@link StdVideoH265HrdParameters#pSubLayerHrdParametersVcl} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265HrdParameters.Buffer pSubLayerHrdParametersVcl(int index, java.util.function.Consumer<StdVideoH265SubLayerHrdParameters> consumer) { consumer.accept(pSubLayerHrdParametersVcl(index)); return this; }
        /** Copies the specified {@link StdVideoH265HrdFlags} to the {@code flags} field. */
        public StdVideoH265HrdParameters.Buffer flags(StdVideoH265HrdFlags value) { StdVideoH265HrdParameters.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265HrdParameters.Buffer flags(java.util.function.Consumer<StdVideoH265HrdFlags> consumer) { consumer.accept(flags()); return this; }

    }

}
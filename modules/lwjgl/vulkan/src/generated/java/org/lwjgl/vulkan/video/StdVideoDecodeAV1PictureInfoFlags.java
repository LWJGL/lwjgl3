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
 * struct StdVideoDecodeAV1PictureInfoFlags {
 *     uint32_t error_resilient_mode : 1;
 *     uint32_t disable_cdf_update : 1;
 *     uint32_t use_superres : 1;
 *     uint32_t render_and_frame_size_different : 1;
 *     uint32_t allow_screen_content_tools : 1;
 *     uint32_t is_filter_switchable : 1;
 *     uint32_t force_integer_mv : 1;
 *     uint32_t frame_size_override_flag : 1;
 *     uint32_t buffer_removal_time_present_flag : 1;
 *     uint32_t allow_intrabc : 1;
 *     uint32_t frame_refs_short_signaling : 1;
 *     uint32_t allow_high_precision_mv : 1;
 *     uint32_t is_motion_mode_switchable : 1;
 *     uint32_t use_ref_frame_mvs : 1;
 *     uint32_t disable_frame_end_update_cdf : 1;
 *     uint32_t allow_warped_motion : 1;
 *     uint32_t reduced_tx_set : 1;
 *     uint32_t reference_select : 1;
 *     uint32_t skip_mode_present : 1;
 *     uint32_t delta_q_present : 1;
 *     uint32_t delta_lf_present : 1;
 *     uint32_t delta_lf_multi : 1;
 *     uint32_t segmentation_enabled : 1;
 *     uint32_t segmentation_update_map : 1;
 *     uint32_t segmentation_temporal_update : 1;
 *     uint32_t segmentation_update_data : 1;
 *     uint32_t UsesLr : 1;
 *     uint32_t usesChromaLr : 1;
 *     uint32_t apply_grain : 1;
 *     uint32_t reserved : 3;
 * }}</pre>
 */
public class StdVideoDecodeAV1PictureInfoFlags extends Struct<StdVideoDecodeAV1PictureInfoFlags> implements NativeResource {

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

    protected StdVideoDecodeAV1PictureInfoFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoDecodeAV1PictureInfoFlags create(long address, @Nullable ByteBuffer container) {
        return new StdVideoDecodeAV1PictureInfoFlags(address, container);
    }

    /**
     * Creates a {@code StdVideoDecodeAV1PictureInfoFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeAV1PictureInfoFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code error_resilient_mode} field. */
    @NativeType("uint32_t")
    public boolean error_resilient_mode() { return nerror_resilient_mode(address()) != 0; }
    /** @return the value of the {@code disable_cdf_update} field. */
    @NativeType("uint32_t")
    public boolean disable_cdf_update() { return ndisable_cdf_update(address()) != 0; }
    /** @return the value of the {@code use_superres} field. */
    @NativeType("uint32_t")
    public boolean use_superres() { return nuse_superres(address()) != 0; }
    /** @return the value of the {@code render_and_frame_size_different} field. */
    @NativeType("uint32_t")
    public boolean render_and_frame_size_different() { return nrender_and_frame_size_different(address()) != 0; }
    /** @return the value of the {@code allow_screen_content_tools} field. */
    @NativeType("uint32_t")
    public boolean allow_screen_content_tools() { return nallow_screen_content_tools(address()) != 0; }
    /** @return the value of the {@code is_filter_switchable} field. */
    @NativeType("uint32_t")
    public boolean is_filter_switchable() { return nis_filter_switchable(address()) != 0; }
    /** @return the value of the {@code force_integer_mv} field. */
    @NativeType("uint32_t")
    public boolean force_integer_mv() { return nforce_integer_mv(address()) != 0; }
    /** @return the value of the {@code frame_size_override_flag} field. */
    @NativeType("uint32_t")
    public boolean frame_size_override_flag() { return nframe_size_override_flag(address()) != 0; }
    /** @return the value of the {@code buffer_removal_time_present_flag} field. */
    @NativeType("uint32_t")
    public boolean buffer_removal_time_present_flag() { return nbuffer_removal_time_present_flag(address()) != 0; }
    /** @return the value of the {@code allow_intrabc} field. */
    @NativeType("uint32_t")
    public boolean allow_intrabc() { return nallow_intrabc(address()) != 0; }
    /** @return the value of the {@code frame_refs_short_signaling} field. */
    @NativeType("uint32_t")
    public boolean frame_refs_short_signaling() { return nframe_refs_short_signaling(address()) != 0; }
    /** @return the value of the {@code allow_high_precision_mv} field. */
    @NativeType("uint32_t")
    public boolean allow_high_precision_mv() { return nallow_high_precision_mv(address()) != 0; }
    /** @return the value of the {@code is_motion_mode_switchable} field. */
    @NativeType("uint32_t")
    public boolean is_motion_mode_switchable() { return nis_motion_mode_switchable(address()) != 0; }
    /** @return the value of the {@code use_ref_frame_mvs} field. */
    @NativeType("uint32_t")
    public boolean use_ref_frame_mvs() { return nuse_ref_frame_mvs(address()) != 0; }
    /** @return the value of the {@code disable_frame_end_update_cdf} field. */
    @NativeType("uint32_t")
    public boolean disable_frame_end_update_cdf() { return ndisable_frame_end_update_cdf(address()) != 0; }
    /** @return the value of the {@code allow_warped_motion} field. */
    @NativeType("uint32_t")
    public boolean allow_warped_motion() { return nallow_warped_motion(address()) != 0; }
    /** @return the value of the {@code reduced_tx_set} field. */
    @NativeType("uint32_t")
    public boolean reduced_tx_set() { return nreduced_tx_set(address()) != 0; }
    /** @return the value of the {@code reference_select} field. */
    @NativeType("uint32_t")
    public boolean reference_select() { return nreference_select(address()) != 0; }
    /** @return the value of the {@code skip_mode_present} field. */
    @NativeType("uint32_t")
    public boolean skip_mode_present() { return nskip_mode_present(address()) != 0; }
    /** @return the value of the {@code delta_q_present} field. */
    @NativeType("uint32_t")
    public boolean delta_q_present() { return ndelta_q_present(address()) != 0; }
    /** @return the value of the {@code delta_lf_present} field. */
    @NativeType("uint32_t")
    public boolean delta_lf_present() { return ndelta_lf_present(address()) != 0; }
    /** @return the value of the {@code delta_lf_multi} field. */
    @NativeType("uint32_t")
    public boolean delta_lf_multi() { return ndelta_lf_multi(address()) != 0; }
    /** @return the value of the {@code segmentation_enabled} field. */
    @NativeType("uint32_t")
    public boolean segmentation_enabled() { return nsegmentation_enabled(address()) != 0; }
    /** @return the value of the {@code segmentation_update_map} field. */
    @NativeType("uint32_t")
    public boolean segmentation_update_map() { return nsegmentation_update_map(address()) != 0; }
    /** @return the value of the {@code segmentation_temporal_update} field. */
    @NativeType("uint32_t")
    public boolean segmentation_temporal_update() { return nsegmentation_temporal_update(address()) != 0; }
    /** @return the value of the {@code segmentation_update_data} field. */
    @NativeType("uint32_t")
    public boolean segmentation_update_data() { return nsegmentation_update_data(address()) != 0; }
    /** @return the value of the {@code UsesLr} field. */
    @NativeType("uint32_t")
    public boolean UsesLr() { return nUsesLr(address()) != 0; }
    /** @return the value of the {@code usesChromaLr} field. */
    @NativeType("uint32_t")
    public boolean usesChromaLr() { return nusesChromaLr(address()) != 0; }
    /** @return the value of the {@code apply_grain} field. */
    @NativeType("uint32_t")
    public boolean apply_grain() { return napply_grain(address()) != 0; }

    /** Sets the specified value to the {@code error_resilient_mode} field. */
    public StdVideoDecodeAV1PictureInfoFlags error_resilient_mode(@NativeType("uint32_t") boolean value) { nerror_resilient_mode(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code disable_cdf_update} field. */
    public StdVideoDecodeAV1PictureInfoFlags disable_cdf_update(@NativeType("uint32_t") boolean value) { ndisable_cdf_update(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code use_superres} field. */
    public StdVideoDecodeAV1PictureInfoFlags use_superres(@NativeType("uint32_t") boolean value) { nuse_superres(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code render_and_frame_size_different} field. */
    public StdVideoDecodeAV1PictureInfoFlags render_and_frame_size_different(@NativeType("uint32_t") boolean value) { nrender_and_frame_size_different(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code allow_screen_content_tools} field. */
    public StdVideoDecodeAV1PictureInfoFlags allow_screen_content_tools(@NativeType("uint32_t") boolean value) { nallow_screen_content_tools(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code is_filter_switchable} field. */
    public StdVideoDecodeAV1PictureInfoFlags is_filter_switchable(@NativeType("uint32_t") boolean value) { nis_filter_switchable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code force_integer_mv} field. */
    public StdVideoDecodeAV1PictureInfoFlags force_integer_mv(@NativeType("uint32_t") boolean value) { nforce_integer_mv(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code frame_size_override_flag} field. */
    public StdVideoDecodeAV1PictureInfoFlags frame_size_override_flag(@NativeType("uint32_t") boolean value) { nframe_size_override_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code buffer_removal_time_present_flag} field. */
    public StdVideoDecodeAV1PictureInfoFlags buffer_removal_time_present_flag(@NativeType("uint32_t") boolean value) { nbuffer_removal_time_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code allow_intrabc} field. */
    public StdVideoDecodeAV1PictureInfoFlags allow_intrabc(@NativeType("uint32_t") boolean value) { nallow_intrabc(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code frame_refs_short_signaling} field. */
    public StdVideoDecodeAV1PictureInfoFlags frame_refs_short_signaling(@NativeType("uint32_t") boolean value) { nframe_refs_short_signaling(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code allow_high_precision_mv} field. */
    public StdVideoDecodeAV1PictureInfoFlags allow_high_precision_mv(@NativeType("uint32_t") boolean value) { nallow_high_precision_mv(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code is_motion_mode_switchable} field. */
    public StdVideoDecodeAV1PictureInfoFlags is_motion_mode_switchable(@NativeType("uint32_t") boolean value) { nis_motion_mode_switchable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code use_ref_frame_mvs} field. */
    public StdVideoDecodeAV1PictureInfoFlags use_ref_frame_mvs(@NativeType("uint32_t") boolean value) { nuse_ref_frame_mvs(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code disable_frame_end_update_cdf} field. */
    public StdVideoDecodeAV1PictureInfoFlags disable_frame_end_update_cdf(@NativeType("uint32_t") boolean value) { ndisable_frame_end_update_cdf(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code allow_warped_motion} field. */
    public StdVideoDecodeAV1PictureInfoFlags allow_warped_motion(@NativeType("uint32_t") boolean value) { nallow_warped_motion(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code reduced_tx_set} field. */
    public StdVideoDecodeAV1PictureInfoFlags reduced_tx_set(@NativeType("uint32_t") boolean value) { nreduced_tx_set(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code reference_select} field. */
    public StdVideoDecodeAV1PictureInfoFlags reference_select(@NativeType("uint32_t") boolean value) { nreference_select(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code skip_mode_present} field. */
    public StdVideoDecodeAV1PictureInfoFlags skip_mode_present(@NativeType("uint32_t") boolean value) { nskip_mode_present(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code delta_q_present} field. */
    public StdVideoDecodeAV1PictureInfoFlags delta_q_present(@NativeType("uint32_t") boolean value) { ndelta_q_present(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code delta_lf_present} field. */
    public StdVideoDecodeAV1PictureInfoFlags delta_lf_present(@NativeType("uint32_t") boolean value) { ndelta_lf_present(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code delta_lf_multi} field. */
    public StdVideoDecodeAV1PictureInfoFlags delta_lf_multi(@NativeType("uint32_t") boolean value) { ndelta_lf_multi(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_enabled} field. */
    public StdVideoDecodeAV1PictureInfoFlags segmentation_enabled(@NativeType("uint32_t") boolean value) { nsegmentation_enabled(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_update_map} field. */
    public StdVideoDecodeAV1PictureInfoFlags segmentation_update_map(@NativeType("uint32_t") boolean value) { nsegmentation_update_map(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_temporal_update} field. */
    public StdVideoDecodeAV1PictureInfoFlags segmentation_temporal_update(@NativeType("uint32_t") boolean value) { nsegmentation_temporal_update(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code segmentation_update_data} field. */
    public StdVideoDecodeAV1PictureInfoFlags segmentation_update_data(@NativeType("uint32_t") boolean value) { nsegmentation_update_data(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code UsesLr} field. */
    public StdVideoDecodeAV1PictureInfoFlags UsesLr(@NativeType("uint32_t") boolean value) { nUsesLr(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code usesChromaLr} field. */
    public StdVideoDecodeAV1PictureInfoFlags usesChromaLr(@NativeType("uint32_t") boolean value) { nusesChromaLr(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code apply_grain} field. */
    public StdVideoDecodeAV1PictureInfoFlags apply_grain(@NativeType("uint32_t") boolean value) { napply_grain(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeAV1PictureInfoFlags set(
        boolean error_resilient_mode,
        boolean disable_cdf_update,
        boolean use_superres,
        boolean render_and_frame_size_different,
        boolean allow_screen_content_tools,
        boolean is_filter_switchable,
        boolean force_integer_mv,
        boolean frame_size_override_flag,
        boolean buffer_removal_time_present_flag,
        boolean allow_intrabc,
        boolean frame_refs_short_signaling,
        boolean allow_high_precision_mv,
        boolean is_motion_mode_switchable,
        boolean use_ref_frame_mvs,
        boolean disable_frame_end_update_cdf,
        boolean allow_warped_motion,
        boolean reduced_tx_set,
        boolean reference_select,
        boolean skip_mode_present,
        boolean delta_q_present,
        boolean delta_lf_present,
        boolean delta_lf_multi,
        boolean segmentation_enabled,
        boolean segmentation_update_map,
        boolean segmentation_temporal_update,
        boolean segmentation_update_data,
        boolean UsesLr,
        boolean usesChromaLr,
        boolean apply_grain
    ) {
        error_resilient_mode(error_resilient_mode);
        disable_cdf_update(disable_cdf_update);
        use_superres(use_superres);
        render_and_frame_size_different(render_and_frame_size_different);
        allow_screen_content_tools(allow_screen_content_tools);
        is_filter_switchable(is_filter_switchable);
        force_integer_mv(force_integer_mv);
        frame_size_override_flag(frame_size_override_flag);
        buffer_removal_time_present_flag(buffer_removal_time_present_flag);
        allow_intrabc(allow_intrabc);
        frame_refs_short_signaling(frame_refs_short_signaling);
        allow_high_precision_mv(allow_high_precision_mv);
        is_motion_mode_switchable(is_motion_mode_switchable);
        use_ref_frame_mvs(use_ref_frame_mvs);
        disable_frame_end_update_cdf(disable_frame_end_update_cdf);
        allow_warped_motion(allow_warped_motion);
        reduced_tx_set(reduced_tx_set);
        reference_select(reference_select);
        skip_mode_present(skip_mode_present);
        delta_q_present(delta_q_present);
        delta_lf_present(delta_lf_present);
        delta_lf_multi(delta_lf_multi);
        segmentation_enabled(segmentation_enabled);
        segmentation_update_map(segmentation_update_map);
        segmentation_temporal_update(segmentation_temporal_update);
        segmentation_update_data(segmentation_update_data);
        UsesLr(UsesLr);
        usesChromaLr(usesChromaLr);
        apply_grain(apply_grain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeAV1PictureInfoFlags set(StdVideoDecodeAV1PictureInfoFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeAV1PictureInfoFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeAV1PictureInfoFlags malloc() {
        return new StdVideoDecodeAV1PictureInfoFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeAV1PictureInfoFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeAV1PictureInfoFlags calloc() {
        return new StdVideoDecodeAV1PictureInfoFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeAV1PictureInfoFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeAV1PictureInfoFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeAV1PictureInfoFlags(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeAV1PictureInfoFlags} instance for the specified memory address. */
    public static StdVideoDecodeAV1PictureInfoFlags create(long address) {
        return new StdVideoDecodeAV1PictureInfoFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoDecodeAV1PictureInfoFlags createSafe(long address) {
        return address == NULL ? null : new StdVideoDecodeAV1PictureInfoFlags(address, null);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfoFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfoFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfoFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfoFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfoFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoDecodeAV1PictureInfoFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfoFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoDecodeAV1PictureInfoFlags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeAV1PictureInfoFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeAV1PictureInfoFlags malloc(MemoryStack stack) {
        return new StdVideoDecodeAV1PictureInfoFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoDecodeAV1PictureInfoFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeAV1PictureInfoFlags calloc(MemoryStack stack) {
        return new StdVideoDecodeAV1PictureInfoFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfoFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfoFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfoFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return memGetInt(struct + StdVideoDecodeAV1PictureInfoFlags.BITFIELD0); }
    /** Unsafe version of {@link #error_resilient_mode}. */
    public static int nerror_resilient_mode(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #disable_cdf_update}. */
    public static int ndisable_cdf_update(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #use_superres}. */
    public static int nuse_superres(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #render_and_frame_size_different}. */
    public static int nrender_and_frame_size_different(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #allow_screen_content_tools}. */
    public static int nallow_screen_content_tools(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #is_filter_switchable}. */
    public static int nis_filter_switchable(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #force_integer_mv}. */
    public static int nforce_integer_mv(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #frame_size_override_flag}. */
    public static int nframe_size_override_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #buffer_removal_time_present_flag}. */
    public static int nbuffer_removal_time_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #allow_intrabc}. */
    public static int nallow_intrabc(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #frame_refs_short_signaling}. */
    public static int nframe_refs_short_signaling(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #allow_high_precision_mv}. */
    public static int nallow_high_precision_mv(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }
    /** Unsafe version of {@link #is_motion_mode_switchable}. */
    public static int nis_motion_mode_switchable(long struct) { return (nbitfield0(struct) & 0x00_00_10_00) >>> 12; }
    /** Unsafe version of {@link #use_ref_frame_mvs}. */
    public static int nuse_ref_frame_mvs(long struct) { return (nbitfield0(struct) & 0x00_00_20_00) >>> 13; }
    /** Unsafe version of {@link #disable_frame_end_update_cdf}. */
    public static int ndisable_frame_end_update_cdf(long struct) { return (nbitfield0(struct) & 0x00_00_40_00) >>> 14; }
    /** Unsafe version of {@link #allow_warped_motion}. */
    public static int nallow_warped_motion(long struct) { return (nbitfield0(struct) & 0x00_00_80_00) >>> 15; }
    /** Unsafe version of {@link #reduced_tx_set}. */
    public static int nreduced_tx_set(long struct) { return (nbitfield0(struct) & 0x00_01_00_00) >>> 16; }
    /** Unsafe version of {@link #reference_select}. */
    public static int nreference_select(long struct) { return (nbitfield0(struct) & 0x00_02_00_00) >>> 17; }
    /** Unsafe version of {@link #skip_mode_present}. */
    public static int nskip_mode_present(long struct) { return (nbitfield0(struct) & 0x00_04_00_00) >>> 18; }
    /** Unsafe version of {@link #delta_q_present}. */
    public static int ndelta_q_present(long struct) { return (nbitfield0(struct) & 0x00_08_00_00) >>> 19; }
    /** Unsafe version of {@link #delta_lf_present}. */
    public static int ndelta_lf_present(long struct) { return (nbitfield0(struct) & 0x00_10_00_00) >>> 20; }
    /** Unsafe version of {@link #delta_lf_multi}. */
    public static int ndelta_lf_multi(long struct) { return (nbitfield0(struct) & 0x00_20_00_00) >>> 21; }
    /** Unsafe version of {@link #segmentation_enabled}. */
    public static int nsegmentation_enabled(long struct) { return (nbitfield0(struct) & 0x00_40_00_00) >>> 22; }
    /** Unsafe version of {@link #segmentation_update_map}. */
    public static int nsegmentation_update_map(long struct) { return (nbitfield0(struct) & 0x00_80_00_00) >>> 23; }
    /** Unsafe version of {@link #segmentation_temporal_update}. */
    public static int nsegmentation_temporal_update(long struct) { return (nbitfield0(struct) & 0x01_00_00_00) >>> 24; }
    /** Unsafe version of {@link #segmentation_update_data}. */
    public static int nsegmentation_update_data(long struct) { return (nbitfield0(struct) & 0x02_00_00_00) >>> 25; }
    /** Unsafe version of {@link #UsesLr}. */
    public static int nUsesLr(long struct) { return (nbitfield0(struct) & 0x04_00_00_00) >>> 26; }
    /** Unsafe version of {@link #usesChromaLr}. */
    public static int nusesChromaLr(long struct) { return (nbitfield0(struct) & 0x08_00_00_00) >>> 27; }
    /** Unsafe version of {@link #apply_grain}. */
    public static int napply_grain(long struct) { return (nbitfield0(struct) & 0x10_00_00_00) >>> 28; }
    public static int nbitfield1(long struct) { return memGetInt(struct + StdVideoDecodeAV1PictureInfoFlags.BITFIELD1); }
    public static int nreserved(long struct) { return nbitfield1(struct) & 0x00_00_00_07; }

    public static void nbitfield0(long struct, int value) { memPutInt(struct + StdVideoDecodeAV1PictureInfoFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #error_resilient_mode(boolean) error_resilient_mode}. */
    public static void nerror_resilient_mode(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #disable_cdf_update(boolean) disable_cdf_update}. */
    public static void ndisable_cdf_update(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #use_superres(boolean) use_superres}. */
    public static void nuse_superres(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #render_and_frame_size_different(boolean) render_and_frame_size_different}. */
    public static void nrender_and_frame_size_different(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #allow_screen_content_tools(boolean) allow_screen_content_tools}. */
    public static void nallow_screen_content_tools(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #is_filter_switchable(boolean) is_filter_switchable}. */
    public static void nis_filter_switchable(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #force_integer_mv(boolean) force_integer_mv}. */
    public static void nforce_integer_mv(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #frame_size_override_flag(boolean) frame_size_override_flag}. */
    public static void nframe_size_override_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #buffer_removal_time_present_flag(boolean) buffer_removal_time_present_flag}. */
    public static void nbuffer_removal_time_present_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #allow_intrabc(boolean) allow_intrabc}. */
    public static void nallow_intrabc(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #frame_refs_short_signaling(boolean) frame_refs_short_signaling}. */
    public static void nframe_refs_short_signaling(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #allow_high_precision_mv(boolean) allow_high_precision_mv}. */
    public static void nallow_high_precision_mv(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }
    /** Unsafe version of {@link #is_motion_mode_switchable(boolean) is_motion_mode_switchable}. */
    public static void nis_motion_mode_switchable(long struct, int value) { nbitfield0(struct, ((value << 12) & 0x00_00_10_00) | (nbitfield0(struct) & 0xFF_FF_EF_FF)); }
    /** Unsafe version of {@link #use_ref_frame_mvs(boolean) use_ref_frame_mvs}. */
    public static void nuse_ref_frame_mvs(long struct, int value) { nbitfield0(struct, ((value << 13) & 0x00_00_20_00) | (nbitfield0(struct) & 0xFF_FF_DF_FF)); }
    /** Unsafe version of {@link #disable_frame_end_update_cdf(boolean) disable_frame_end_update_cdf}. */
    public static void ndisable_frame_end_update_cdf(long struct, int value) { nbitfield0(struct, ((value << 14) & 0x00_00_40_00) | (nbitfield0(struct) & 0xFF_FF_BF_FF)); }
    /** Unsafe version of {@link #allow_warped_motion(boolean) allow_warped_motion}. */
    public static void nallow_warped_motion(long struct, int value) { nbitfield0(struct, ((value << 15) & 0x00_00_80_00) | (nbitfield0(struct) & 0xFF_FF_7F_FF)); }
    /** Unsafe version of {@link #reduced_tx_set(boolean) reduced_tx_set}. */
    public static void nreduced_tx_set(long struct, int value) { nbitfield0(struct, ((value << 16) & 0x00_01_00_00) | (nbitfield0(struct) & 0xFF_FE_FF_FF)); }
    /** Unsafe version of {@link #reference_select(boolean) reference_select}. */
    public static void nreference_select(long struct, int value) { nbitfield0(struct, ((value << 17) & 0x00_02_00_00) | (nbitfield0(struct) & 0xFF_FD_FF_FF)); }
    /** Unsafe version of {@link #skip_mode_present(boolean) skip_mode_present}. */
    public static void nskip_mode_present(long struct, int value) { nbitfield0(struct, ((value << 18) & 0x00_04_00_00) | (nbitfield0(struct) & 0xFF_FB_FF_FF)); }
    /** Unsafe version of {@link #delta_q_present(boolean) delta_q_present}. */
    public static void ndelta_q_present(long struct, int value) { nbitfield0(struct, ((value << 19) & 0x00_08_00_00) | (nbitfield0(struct) & 0xFF_F7_FF_FF)); }
    /** Unsafe version of {@link #delta_lf_present(boolean) delta_lf_present}. */
    public static void ndelta_lf_present(long struct, int value) { nbitfield0(struct, ((value << 20) & 0x00_10_00_00) | (nbitfield0(struct) & 0xFF_EF_FF_FF)); }
    /** Unsafe version of {@link #delta_lf_multi(boolean) delta_lf_multi}. */
    public static void ndelta_lf_multi(long struct, int value) { nbitfield0(struct, ((value << 21) & 0x00_20_00_00) | (nbitfield0(struct) & 0xFF_DF_FF_FF)); }
    /** Unsafe version of {@link #segmentation_enabled(boolean) segmentation_enabled}. */
    public static void nsegmentation_enabled(long struct, int value) { nbitfield0(struct, ((value << 22) & 0x00_40_00_00) | (nbitfield0(struct) & 0xFF_BF_FF_FF)); }
    /** Unsafe version of {@link #segmentation_update_map(boolean) segmentation_update_map}. */
    public static void nsegmentation_update_map(long struct, int value) { nbitfield0(struct, ((value << 23) & 0x00_80_00_00) | (nbitfield0(struct) & 0xFF_7F_FF_FF)); }
    /** Unsafe version of {@link #segmentation_temporal_update(boolean) segmentation_temporal_update}. */
    public static void nsegmentation_temporal_update(long struct, int value) { nbitfield0(struct, ((value << 24) & 0x01_00_00_00) | (nbitfield0(struct) & 0xFE_FF_FF_FF)); }
    /** Unsafe version of {@link #segmentation_update_data(boolean) segmentation_update_data}. */
    public static void nsegmentation_update_data(long struct, int value) { nbitfield0(struct, ((value << 25) & 0x02_00_00_00) | (nbitfield0(struct) & 0xFD_FF_FF_FF)); }
    /** Unsafe version of {@link #UsesLr(boolean) UsesLr}. */
    public static void nUsesLr(long struct, int value) { nbitfield0(struct, ((value << 26) & 0x04_00_00_00) | (nbitfield0(struct) & 0xFB_FF_FF_FF)); }
    /** Unsafe version of {@link #usesChromaLr(boolean) usesChromaLr}. */
    public static void nusesChromaLr(long struct, int value) { nbitfield0(struct, ((value << 27) & 0x08_00_00_00) | (nbitfield0(struct) & 0xF7_FF_FF_FF)); }
    /** Unsafe version of {@link #apply_grain(boolean) apply_grain}. */
    public static void napply_grain(long struct, int value) { nbitfield0(struct, ((value << 28) & 0x10_00_00_00) | (nbitfield0(struct) & 0xEF_FF_FF_FF)); }
    public static void nbitfield1(long struct, int value) { memPutInt(struct + StdVideoDecodeAV1PictureInfoFlags.BITFIELD1, value); }
    public static void nreserved(long struct, int value) { nbitfield1(struct, (nbitfield1(struct) & 0xFF_FF_FF_F8) | (value & 0x00_00_00_07)); }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeAV1PictureInfoFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeAV1PictureInfoFlags, Buffer> implements NativeResource {

        private static final StdVideoDecodeAV1PictureInfoFlags ELEMENT_FACTORY = StdVideoDecodeAV1PictureInfoFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeAV1PictureInfoFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeAV1PictureInfoFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoDecodeAV1PictureInfoFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code error_resilient_mode} field. */
        @NativeType("uint32_t")
        public boolean error_resilient_mode() { return StdVideoDecodeAV1PictureInfoFlags.nerror_resilient_mode(address()) != 0; }
        /** @return the value of the {@code disable_cdf_update} field. */
        @NativeType("uint32_t")
        public boolean disable_cdf_update() { return StdVideoDecodeAV1PictureInfoFlags.ndisable_cdf_update(address()) != 0; }
        /** @return the value of the {@code use_superres} field. */
        @NativeType("uint32_t")
        public boolean use_superres() { return StdVideoDecodeAV1PictureInfoFlags.nuse_superres(address()) != 0; }
        /** @return the value of the {@code render_and_frame_size_different} field. */
        @NativeType("uint32_t")
        public boolean render_and_frame_size_different() { return StdVideoDecodeAV1PictureInfoFlags.nrender_and_frame_size_different(address()) != 0; }
        /** @return the value of the {@code allow_screen_content_tools} field. */
        @NativeType("uint32_t")
        public boolean allow_screen_content_tools() { return StdVideoDecodeAV1PictureInfoFlags.nallow_screen_content_tools(address()) != 0; }
        /** @return the value of the {@code is_filter_switchable} field. */
        @NativeType("uint32_t")
        public boolean is_filter_switchable() { return StdVideoDecodeAV1PictureInfoFlags.nis_filter_switchable(address()) != 0; }
        /** @return the value of the {@code force_integer_mv} field. */
        @NativeType("uint32_t")
        public boolean force_integer_mv() { return StdVideoDecodeAV1PictureInfoFlags.nforce_integer_mv(address()) != 0; }
        /** @return the value of the {@code frame_size_override_flag} field. */
        @NativeType("uint32_t")
        public boolean frame_size_override_flag() { return StdVideoDecodeAV1PictureInfoFlags.nframe_size_override_flag(address()) != 0; }
        /** @return the value of the {@code buffer_removal_time_present_flag} field. */
        @NativeType("uint32_t")
        public boolean buffer_removal_time_present_flag() { return StdVideoDecodeAV1PictureInfoFlags.nbuffer_removal_time_present_flag(address()) != 0; }
        /** @return the value of the {@code allow_intrabc} field. */
        @NativeType("uint32_t")
        public boolean allow_intrabc() { return StdVideoDecodeAV1PictureInfoFlags.nallow_intrabc(address()) != 0; }
        /** @return the value of the {@code frame_refs_short_signaling} field. */
        @NativeType("uint32_t")
        public boolean frame_refs_short_signaling() { return StdVideoDecodeAV1PictureInfoFlags.nframe_refs_short_signaling(address()) != 0; }
        /** @return the value of the {@code allow_high_precision_mv} field. */
        @NativeType("uint32_t")
        public boolean allow_high_precision_mv() { return StdVideoDecodeAV1PictureInfoFlags.nallow_high_precision_mv(address()) != 0; }
        /** @return the value of the {@code is_motion_mode_switchable} field. */
        @NativeType("uint32_t")
        public boolean is_motion_mode_switchable() { return StdVideoDecodeAV1PictureInfoFlags.nis_motion_mode_switchable(address()) != 0; }
        /** @return the value of the {@code use_ref_frame_mvs} field. */
        @NativeType("uint32_t")
        public boolean use_ref_frame_mvs() { return StdVideoDecodeAV1PictureInfoFlags.nuse_ref_frame_mvs(address()) != 0; }
        /** @return the value of the {@code disable_frame_end_update_cdf} field. */
        @NativeType("uint32_t")
        public boolean disable_frame_end_update_cdf() { return StdVideoDecodeAV1PictureInfoFlags.ndisable_frame_end_update_cdf(address()) != 0; }
        /** @return the value of the {@code allow_warped_motion} field. */
        @NativeType("uint32_t")
        public boolean allow_warped_motion() { return StdVideoDecodeAV1PictureInfoFlags.nallow_warped_motion(address()) != 0; }
        /** @return the value of the {@code reduced_tx_set} field. */
        @NativeType("uint32_t")
        public boolean reduced_tx_set() { return StdVideoDecodeAV1PictureInfoFlags.nreduced_tx_set(address()) != 0; }
        /** @return the value of the {@code reference_select} field. */
        @NativeType("uint32_t")
        public boolean reference_select() { return StdVideoDecodeAV1PictureInfoFlags.nreference_select(address()) != 0; }
        /** @return the value of the {@code skip_mode_present} field. */
        @NativeType("uint32_t")
        public boolean skip_mode_present() { return StdVideoDecodeAV1PictureInfoFlags.nskip_mode_present(address()) != 0; }
        /** @return the value of the {@code delta_q_present} field. */
        @NativeType("uint32_t")
        public boolean delta_q_present() { return StdVideoDecodeAV1PictureInfoFlags.ndelta_q_present(address()) != 0; }
        /** @return the value of the {@code delta_lf_present} field. */
        @NativeType("uint32_t")
        public boolean delta_lf_present() { return StdVideoDecodeAV1PictureInfoFlags.ndelta_lf_present(address()) != 0; }
        /** @return the value of the {@code delta_lf_multi} field. */
        @NativeType("uint32_t")
        public boolean delta_lf_multi() { return StdVideoDecodeAV1PictureInfoFlags.ndelta_lf_multi(address()) != 0; }
        /** @return the value of the {@code segmentation_enabled} field. */
        @NativeType("uint32_t")
        public boolean segmentation_enabled() { return StdVideoDecodeAV1PictureInfoFlags.nsegmentation_enabled(address()) != 0; }
        /** @return the value of the {@code segmentation_update_map} field. */
        @NativeType("uint32_t")
        public boolean segmentation_update_map() { return StdVideoDecodeAV1PictureInfoFlags.nsegmentation_update_map(address()) != 0; }
        /** @return the value of the {@code segmentation_temporal_update} field. */
        @NativeType("uint32_t")
        public boolean segmentation_temporal_update() { return StdVideoDecodeAV1PictureInfoFlags.nsegmentation_temporal_update(address()) != 0; }
        /** @return the value of the {@code segmentation_update_data} field. */
        @NativeType("uint32_t")
        public boolean segmentation_update_data() { return StdVideoDecodeAV1PictureInfoFlags.nsegmentation_update_data(address()) != 0; }
        /** @return the value of the {@code UsesLr} field. */
        @NativeType("uint32_t")
        public boolean UsesLr() { return StdVideoDecodeAV1PictureInfoFlags.nUsesLr(address()) != 0; }
        /** @return the value of the {@code usesChromaLr} field. */
        @NativeType("uint32_t")
        public boolean usesChromaLr() { return StdVideoDecodeAV1PictureInfoFlags.nusesChromaLr(address()) != 0; }
        /** @return the value of the {@code apply_grain} field. */
        @NativeType("uint32_t")
        public boolean apply_grain() { return StdVideoDecodeAV1PictureInfoFlags.napply_grain(address()) != 0; }

        /** Sets the specified value to the {@code error_resilient_mode} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer error_resilient_mode(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nerror_resilient_mode(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code disable_cdf_update} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer disable_cdf_update(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.ndisable_cdf_update(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code use_superres} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer use_superres(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nuse_superres(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code render_and_frame_size_different} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer render_and_frame_size_different(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nrender_and_frame_size_different(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code allow_screen_content_tools} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer allow_screen_content_tools(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nallow_screen_content_tools(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code is_filter_switchable} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer is_filter_switchable(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nis_filter_switchable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code force_integer_mv} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer force_integer_mv(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nforce_integer_mv(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code frame_size_override_flag} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer frame_size_override_flag(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nframe_size_override_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code buffer_removal_time_present_flag} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer buffer_removal_time_present_flag(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nbuffer_removal_time_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code allow_intrabc} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer allow_intrabc(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nallow_intrabc(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code frame_refs_short_signaling} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer frame_refs_short_signaling(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nframe_refs_short_signaling(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code allow_high_precision_mv} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer allow_high_precision_mv(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nallow_high_precision_mv(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code is_motion_mode_switchable} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer is_motion_mode_switchable(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nis_motion_mode_switchable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code use_ref_frame_mvs} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer use_ref_frame_mvs(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nuse_ref_frame_mvs(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code disable_frame_end_update_cdf} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer disable_frame_end_update_cdf(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.ndisable_frame_end_update_cdf(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code allow_warped_motion} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer allow_warped_motion(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nallow_warped_motion(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code reduced_tx_set} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer reduced_tx_set(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nreduced_tx_set(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code reference_select} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer reference_select(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nreference_select(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code skip_mode_present} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer skip_mode_present(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nskip_mode_present(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code delta_q_present} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer delta_q_present(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.ndelta_q_present(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code delta_lf_present} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer delta_lf_present(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.ndelta_lf_present(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code delta_lf_multi} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer delta_lf_multi(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.ndelta_lf_multi(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_enabled} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer segmentation_enabled(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nsegmentation_enabled(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_update_map} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer segmentation_update_map(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nsegmentation_update_map(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_temporal_update} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer segmentation_temporal_update(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nsegmentation_temporal_update(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code segmentation_update_data} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer segmentation_update_data(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nsegmentation_update_data(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code UsesLr} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer UsesLr(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nUsesLr(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code usesChromaLr} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer usesChromaLr(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.nusesChromaLr(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code apply_grain} field. */
        public StdVideoDecodeAV1PictureInfoFlags.Buffer apply_grain(@NativeType("uint32_t") boolean value) { StdVideoDecodeAV1PictureInfoFlags.napply_grain(address(), value ? 1 : 0); return this; }

    }

}
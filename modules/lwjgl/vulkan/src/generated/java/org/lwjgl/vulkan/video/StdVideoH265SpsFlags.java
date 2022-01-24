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
 * struct StdVideoH265SpsFlags {
 *     uint32_t sps_temporal_id_nesting_flag : 1;
 *     uint32_t separate_colour_plane_flag : 1;
 *     uint32_t scaling_list_enabled_flag : 1;
 *     uint32_t sps_scaling_list_data_present_flag : 1;
 *     uint32_t amp_enabled_flag : 1;
 *     uint32_t sample_adaptive_offset_enabled_flag : 1;
 *     uint32_t pcm_enabled_flag : 1;
 *     uint32_t pcm_loop_filter_disabled_flag : 1;
 *     uint32_t long_term_ref_pics_present_flag : 1;
 *     uint32_t sps_temporal_mvp_enabled_flag : 1;
 *     uint32_t strong_intra_smoothing_enabled_flag : 1;
 *     uint32_t vui_parameters_present_flag : 1;
 *     uint32_t sps_extension_present_flag : 1;
 *     uint32_t sps_range_extension_flag : 1;
 *     uint32_t {@link #transform_skip_rotation_enabled_flag} : 1;
 *     uint32_t transform_skip_context_enabled_flag : 1;
 *     uint32_t implicit_rdpcm_enabled_flag : 1;
 *     uint32_t explicit_rdpcm_enabled_flag : 1;
 *     uint32_t extended_precision_processing_flag : 1;
 *     uint32_t intra_smoothing_disabled_flag : 1;
 *     uint32_t high_precision_offsets_enabled_flag : 1;
 *     uint32_t persistent_rice_adaptation_enabled_flag : 1;
 *     uint32_t cabac_bypass_alignment_enabled_flag : 1;
 *     uint32_t {@link #sps_curr_pic_ref_enabled_flag} : 1;
 *     uint32_t palette_mode_enabled_flag : 1;
 *     uint32_t sps_palette_predictor_initializer_present_flag : 1;
 *     uint32_t intra_boundary_filtering_disabled_flag : 1;
 * }</code></pre>
 */
public class StdVideoH265SpsFlags extends Struct implements NativeResource {

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
     * Creates a {@code StdVideoH265SpsFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265SpsFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sps_temporal_id_nesting_flag} field. */
    @NativeType("uint32_t")
    public boolean sps_temporal_id_nesting_flag() { return nsps_temporal_id_nesting_flag(address()) != 0; }
    /** @return the value of the {@code separate_colour_plane_flag} field. */
    @NativeType("uint32_t")
    public boolean separate_colour_plane_flag() { return nseparate_colour_plane_flag(address()) != 0; }
    /** @return the value of the {@code scaling_list_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean scaling_list_enabled_flag() { return nscaling_list_enabled_flag(address()) != 0; }
    /** @return the value of the {@code sps_scaling_list_data_present_flag} field. */
    @NativeType("uint32_t")
    public boolean sps_scaling_list_data_present_flag() { return nsps_scaling_list_data_present_flag(address()) != 0; }
    /** @return the value of the {@code amp_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean amp_enabled_flag() { return namp_enabled_flag(address()) != 0; }
    /** @return the value of the {@code sample_adaptive_offset_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean sample_adaptive_offset_enabled_flag() { return nsample_adaptive_offset_enabled_flag(address()) != 0; }
    /** @return the value of the {@code pcm_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean pcm_enabled_flag() { return npcm_enabled_flag(address()) != 0; }
    /** @return the value of the {@code pcm_loop_filter_disabled_flag} field. */
    @NativeType("uint32_t")
    public boolean pcm_loop_filter_disabled_flag() { return npcm_loop_filter_disabled_flag(address()) != 0; }
    /** @return the value of the {@code long_term_ref_pics_present_flag} field. */
    @NativeType("uint32_t")
    public boolean long_term_ref_pics_present_flag() { return nlong_term_ref_pics_present_flag(address()) != 0; }
    /** @return the value of the {@code sps_temporal_mvp_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean sps_temporal_mvp_enabled_flag() { return nsps_temporal_mvp_enabled_flag(address()) != 0; }
    /** @return the value of the {@code strong_intra_smoothing_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean strong_intra_smoothing_enabled_flag() { return nstrong_intra_smoothing_enabled_flag(address()) != 0; }
    /** @return the value of the {@code vui_parameters_present_flag} field. */
    @NativeType("uint32_t")
    public boolean vui_parameters_present_flag() { return nvui_parameters_present_flag(address()) != 0; }
    /** @return the value of the {@code sps_extension_present_flag} field. */
    @NativeType("uint32_t")
    public boolean sps_extension_present_flag() { return nsps_extension_present_flag(address()) != 0; }
    /** @return the value of the {@code sps_range_extension_flag} field. */
    @NativeType("uint32_t")
    public boolean sps_range_extension_flag() { return nsps_range_extension_flag(address()) != 0; }
    /** extension SPS flags, valid when {@link STDVulkanVideoCodecH265#STD_VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS} is set */
    @NativeType("uint32_t")
    public boolean transform_skip_rotation_enabled_flag() { return ntransform_skip_rotation_enabled_flag(address()) != 0; }
    /** @return the value of the {@code transform_skip_context_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean transform_skip_context_enabled_flag() { return ntransform_skip_context_enabled_flag(address()) != 0; }
    /** @return the value of the {@code implicit_rdpcm_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean implicit_rdpcm_enabled_flag() { return nimplicit_rdpcm_enabled_flag(address()) != 0; }
    /** @return the value of the {@code explicit_rdpcm_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean explicit_rdpcm_enabled_flag() { return nexplicit_rdpcm_enabled_flag(address()) != 0; }
    /** @return the value of the {@code extended_precision_processing_flag} field. */
    @NativeType("uint32_t")
    public boolean extended_precision_processing_flag() { return nextended_precision_processing_flag(address()) != 0; }
    /** @return the value of the {@code intra_smoothing_disabled_flag} field. */
    @NativeType("uint32_t")
    public boolean intra_smoothing_disabled_flag() { return nintra_smoothing_disabled_flag(address()) != 0; }
    /** @return the value of the {@code high_precision_offsets_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean high_precision_offsets_enabled_flag() { return nhigh_precision_offsets_enabled_flag(address()) != 0; }
    /** @return the value of the {@code persistent_rice_adaptation_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean persistent_rice_adaptation_enabled_flag() { return npersistent_rice_adaptation_enabled_flag(address()) != 0; }
    /** @return the value of the {@code cabac_bypass_alignment_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean cabac_bypass_alignment_enabled_flag() { return ncabac_bypass_alignment_enabled_flag(address()) != 0; }
    /** extension SPS flags, valid when {@link STDVulkanVideoCodecH265#STD_VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS} is set */
    @NativeType("uint32_t")
    public boolean sps_curr_pic_ref_enabled_flag() { return nsps_curr_pic_ref_enabled_flag(address()) != 0; }
    /** @return the value of the {@code palette_mode_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean palette_mode_enabled_flag() { return npalette_mode_enabled_flag(address()) != 0; }
    /** @return the value of the {@code sps_palette_predictor_initializer_present_flag} field. */
    @NativeType("uint32_t")
    public boolean sps_palette_predictor_initializer_present_flag() { return nsps_palette_predictor_initializer_present_flag(address()) != 0; }
    /** @return the value of the {@code intra_boundary_filtering_disabled_flag} field. */
    @NativeType("uint32_t")
    public boolean intra_boundary_filtering_disabled_flag() { return nintra_boundary_filtering_disabled_flag(address()) != 0; }

    /** Sets the specified value to the {@code sps_temporal_id_nesting_flag} field. */
    public StdVideoH265SpsFlags sps_temporal_id_nesting_flag(@NativeType("uint32_t") boolean value) { nsps_temporal_id_nesting_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code separate_colour_plane_flag} field. */
    public StdVideoH265SpsFlags separate_colour_plane_flag(@NativeType("uint32_t") boolean value) { nseparate_colour_plane_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code scaling_list_enabled_flag} field. */
    public StdVideoH265SpsFlags scaling_list_enabled_flag(@NativeType("uint32_t") boolean value) { nscaling_list_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sps_scaling_list_data_present_flag} field. */
    public StdVideoH265SpsFlags sps_scaling_list_data_present_flag(@NativeType("uint32_t") boolean value) { nsps_scaling_list_data_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code amp_enabled_flag} field. */
    public StdVideoH265SpsFlags amp_enabled_flag(@NativeType("uint32_t") boolean value) { namp_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sample_adaptive_offset_enabled_flag} field. */
    public StdVideoH265SpsFlags sample_adaptive_offset_enabled_flag(@NativeType("uint32_t") boolean value) { nsample_adaptive_offset_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pcm_enabled_flag} field. */
    public StdVideoH265SpsFlags pcm_enabled_flag(@NativeType("uint32_t") boolean value) { npcm_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pcm_loop_filter_disabled_flag} field. */
    public StdVideoH265SpsFlags pcm_loop_filter_disabled_flag(@NativeType("uint32_t") boolean value) { npcm_loop_filter_disabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code long_term_ref_pics_present_flag} field. */
    public StdVideoH265SpsFlags long_term_ref_pics_present_flag(@NativeType("uint32_t") boolean value) { nlong_term_ref_pics_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sps_temporal_mvp_enabled_flag} field. */
    public StdVideoH265SpsFlags sps_temporal_mvp_enabled_flag(@NativeType("uint32_t") boolean value) { nsps_temporal_mvp_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code strong_intra_smoothing_enabled_flag} field. */
    public StdVideoH265SpsFlags strong_intra_smoothing_enabled_flag(@NativeType("uint32_t") boolean value) { nstrong_intra_smoothing_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vui_parameters_present_flag} field. */
    public StdVideoH265SpsFlags vui_parameters_present_flag(@NativeType("uint32_t") boolean value) { nvui_parameters_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sps_extension_present_flag} field. */
    public StdVideoH265SpsFlags sps_extension_present_flag(@NativeType("uint32_t") boolean value) { nsps_extension_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sps_range_extension_flag} field. */
    public StdVideoH265SpsFlags sps_range_extension_flag(@NativeType("uint32_t") boolean value) { nsps_range_extension_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #transform_skip_rotation_enabled_flag} field. */
    public StdVideoH265SpsFlags transform_skip_rotation_enabled_flag(@NativeType("uint32_t") boolean value) { ntransform_skip_rotation_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code transform_skip_context_enabled_flag} field. */
    public StdVideoH265SpsFlags transform_skip_context_enabled_flag(@NativeType("uint32_t") boolean value) { ntransform_skip_context_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code implicit_rdpcm_enabled_flag} field. */
    public StdVideoH265SpsFlags implicit_rdpcm_enabled_flag(@NativeType("uint32_t") boolean value) { nimplicit_rdpcm_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code explicit_rdpcm_enabled_flag} field. */
    public StdVideoH265SpsFlags explicit_rdpcm_enabled_flag(@NativeType("uint32_t") boolean value) { nexplicit_rdpcm_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code extended_precision_processing_flag} field. */
    public StdVideoH265SpsFlags extended_precision_processing_flag(@NativeType("uint32_t") boolean value) { nextended_precision_processing_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code intra_smoothing_disabled_flag} field. */
    public StdVideoH265SpsFlags intra_smoothing_disabled_flag(@NativeType("uint32_t") boolean value) { nintra_smoothing_disabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code high_precision_offsets_enabled_flag} field. */
    public StdVideoH265SpsFlags high_precision_offsets_enabled_flag(@NativeType("uint32_t") boolean value) { nhigh_precision_offsets_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code persistent_rice_adaptation_enabled_flag} field. */
    public StdVideoH265SpsFlags persistent_rice_adaptation_enabled_flag(@NativeType("uint32_t") boolean value) { npersistent_rice_adaptation_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cabac_bypass_alignment_enabled_flag} field. */
    public StdVideoH265SpsFlags cabac_bypass_alignment_enabled_flag(@NativeType("uint32_t") boolean value) { ncabac_bypass_alignment_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sps_curr_pic_ref_enabled_flag} field. */
    public StdVideoH265SpsFlags sps_curr_pic_ref_enabled_flag(@NativeType("uint32_t") boolean value) { nsps_curr_pic_ref_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code palette_mode_enabled_flag} field. */
    public StdVideoH265SpsFlags palette_mode_enabled_flag(@NativeType("uint32_t") boolean value) { npalette_mode_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sps_palette_predictor_initializer_present_flag} field. */
    public StdVideoH265SpsFlags sps_palette_predictor_initializer_present_flag(@NativeType("uint32_t") boolean value) { nsps_palette_predictor_initializer_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code intra_boundary_filtering_disabled_flag} field. */
    public StdVideoH265SpsFlags intra_boundary_filtering_disabled_flag(@NativeType("uint32_t") boolean value) { nintra_boundary_filtering_disabled_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265SpsFlags set(
        boolean sps_temporal_id_nesting_flag,
        boolean separate_colour_plane_flag,
        boolean scaling_list_enabled_flag,
        boolean sps_scaling_list_data_present_flag,
        boolean amp_enabled_flag,
        boolean sample_adaptive_offset_enabled_flag,
        boolean pcm_enabled_flag,
        boolean pcm_loop_filter_disabled_flag,
        boolean long_term_ref_pics_present_flag,
        boolean sps_temporal_mvp_enabled_flag,
        boolean strong_intra_smoothing_enabled_flag,
        boolean vui_parameters_present_flag,
        boolean sps_extension_present_flag,
        boolean sps_range_extension_flag,
        boolean transform_skip_rotation_enabled_flag,
        boolean transform_skip_context_enabled_flag,
        boolean implicit_rdpcm_enabled_flag,
        boolean explicit_rdpcm_enabled_flag,
        boolean extended_precision_processing_flag,
        boolean intra_smoothing_disabled_flag,
        boolean high_precision_offsets_enabled_flag,
        boolean persistent_rice_adaptation_enabled_flag,
        boolean cabac_bypass_alignment_enabled_flag,
        boolean sps_curr_pic_ref_enabled_flag,
        boolean palette_mode_enabled_flag,
        boolean sps_palette_predictor_initializer_present_flag,
        boolean intra_boundary_filtering_disabled_flag
    ) {
        sps_temporal_id_nesting_flag(sps_temporal_id_nesting_flag);
        separate_colour_plane_flag(separate_colour_plane_flag);
        scaling_list_enabled_flag(scaling_list_enabled_flag);
        sps_scaling_list_data_present_flag(sps_scaling_list_data_present_flag);
        amp_enabled_flag(amp_enabled_flag);
        sample_adaptive_offset_enabled_flag(sample_adaptive_offset_enabled_flag);
        pcm_enabled_flag(pcm_enabled_flag);
        pcm_loop_filter_disabled_flag(pcm_loop_filter_disabled_flag);
        long_term_ref_pics_present_flag(long_term_ref_pics_present_flag);
        sps_temporal_mvp_enabled_flag(sps_temporal_mvp_enabled_flag);
        strong_intra_smoothing_enabled_flag(strong_intra_smoothing_enabled_flag);
        vui_parameters_present_flag(vui_parameters_present_flag);
        sps_extension_present_flag(sps_extension_present_flag);
        sps_range_extension_flag(sps_range_extension_flag);
        transform_skip_rotation_enabled_flag(transform_skip_rotation_enabled_flag);
        transform_skip_context_enabled_flag(transform_skip_context_enabled_flag);
        implicit_rdpcm_enabled_flag(implicit_rdpcm_enabled_flag);
        explicit_rdpcm_enabled_flag(explicit_rdpcm_enabled_flag);
        extended_precision_processing_flag(extended_precision_processing_flag);
        intra_smoothing_disabled_flag(intra_smoothing_disabled_flag);
        high_precision_offsets_enabled_flag(high_precision_offsets_enabled_flag);
        persistent_rice_adaptation_enabled_flag(persistent_rice_adaptation_enabled_flag);
        cabac_bypass_alignment_enabled_flag(cabac_bypass_alignment_enabled_flag);
        sps_curr_pic_ref_enabled_flag(sps_curr_pic_ref_enabled_flag);
        palette_mode_enabled_flag(palette_mode_enabled_flag);
        sps_palette_predictor_initializer_present_flag(sps_palette_predictor_initializer_present_flag);
        intra_boundary_filtering_disabled_flag(intra_boundary_filtering_disabled_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265SpsFlags set(StdVideoH265SpsFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265SpsFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265SpsFlags malloc() {
        return wrap(StdVideoH265SpsFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265SpsFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265SpsFlags calloc() {
        return wrap(StdVideoH265SpsFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265SpsFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265SpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265SpsFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265SpsFlags} instance for the specified memory address. */
    public static StdVideoH265SpsFlags create(long address) {
        return wrap(StdVideoH265SpsFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SpsFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265SpsFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265SpsFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SpsFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SpsFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265SpsFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SpsFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265SpsFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SpsFlags malloc(MemoryStack stack) {
        return wrap(StdVideoH265SpsFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265SpsFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SpsFlags calloc(MemoryStack stack) {
        return wrap(StdVideoH265SpsFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265SpsFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SpsFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SpsFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SpsFlags.BITFIELD0); }
    /** Unsafe version of {@link #sps_temporal_id_nesting_flag}. */
    public static int nsps_temporal_id_nesting_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #separate_colour_plane_flag}. */
    public static int nseparate_colour_plane_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #scaling_list_enabled_flag}. */
    public static int nscaling_list_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #sps_scaling_list_data_present_flag}. */
    public static int nsps_scaling_list_data_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #amp_enabled_flag}. */
    public static int namp_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #sample_adaptive_offset_enabled_flag}. */
    public static int nsample_adaptive_offset_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #pcm_enabled_flag}. */
    public static int npcm_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #pcm_loop_filter_disabled_flag}. */
    public static int npcm_loop_filter_disabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #long_term_ref_pics_present_flag}. */
    public static int nlong_term_ref_pics_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #sps_temporal_mvp_enabled_flag}. */
    public static int nsps_temporal_mvp_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #strong_intra_smoothing_enabled_flag}. */
    public static int nstrong_intra_smoothing_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #vui_parameters_present_flag}. */
    public static int nvui_parameters_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }
    /** Unsafe version of {@link #sps_extension_present_flag}. */
    public static int nsps_extension_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_10_00) >>> 12; }
    /** Unsafe version of {@link #sps_range_extension_flag}. */
    public static int nsps_range_extension_flag(long struct) { return (nbitfield0(struct) & 0x00_00_20_00) >>> 13; }
    /** Unsafe version of {@link #transform_skip_rotation_enabled_flag}. */
    public static int ntransform_skip_rotation_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_40_00) >>> 14; }
    /** Unsafe version of {@link #transform_skip_context_enabled_flag}. */
    public static int ntransform_skip_context_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_80_00) >>> 15; }
    /** Unsafe version of {@link #implicit_rdpcm_enabled_flag}. */
    public static int nimplicit_rdpcm_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_01_00_00) >>> 16; }
    /** Unsafe version of {@link #explicit_rdpcm_enabled_flag}. */
    public static int nexplicit_rdpcm_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_02_00_00) >>> 17; }
    /** Unsafe version of {@link #extended_precision_processing_flag}. */
    public static int nextended_precision_processing_flag(long struct) { return (nbitfield0(struct) & 0x00_04_00_00) >>> 18; }
    /** Unsafe version of {@link #intra_smoothing_disabled_flag}. */
    public static int nintra_smoothing_disabled_flag(long struct) { return (nbitfield0(struct) & 0x00_08_00_00) >>> 19; }
    /** Unsafe version of {@link #high_precision_offsets_enabled_flag}. */
    public static int nhigh_precision_offsets_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_10_00_00) >>> 20; }
    /** Unsafe version of {@link #persistent_rice_adaptation_enabled_flag}. */
    public static int npersistent_rice_adaptation_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_20_00_00) >>> 21; }
    /** Unsafe version of {@link #cabac_bypass_alignment_enabled_flag}. */
    public static int ncabac_bypass_alignment_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_40_00_00) >>> 22; }
    /** Unsafe version of {@link #sps_curr_pic_ref_enabled_flag}. */
    public static int nsps_curr_pic_ref_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_80_00_00) >>> 23; }
    /** Unsafe version of {@link #palette_mode_enabled_flag}. */
    public static int npalette_mode_enabled_flag(long struct) { return (nbitfield0(struct) & 0x01_00_00_00) >>> 24; }
    /** Unsafe version of {@link #sps_palette_predictor_initializer_present_flag}. */
    public static int nsps_palette_predictor_initializer_present_flag(long struct) { return (nbitfield0(struct) & 0x02_00_00_00) >>> 25; }
    /** Unsafe version of {@link #intra_boundary_filtering_disabled_flag}. */
    public static int nintra_boundary_filtering_disabled_flag(long struct) { return (nbitfield0(struct) & 0x04_00_00_00) >>> 26; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SpsFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #sps_temporal_id_nesting_flag(boolean) sps_temporal_id_nesting_flag}. */
    public static void nsps_temporal_id_nesting_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #separate_colour_plane_flag(boolean) separate_colour_plane_flag}. */
    public static void nseparate_colour_plane_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #scaling_list_enabled_flag(boolean) scaling_list_enabled_flag}. */
    public static void nscaling_list_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #sps_scaling_list_data_present_flag(boolean) sps_scaling_list_data_present_flag}. */
    public static void nsps_scaling_list_data_present_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #amp_enabled_flag(boolean) amp_enabled_flag}. */
    public static void namp_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #sample_adaptive_offset_enabled_flag(boolean) sample_adaptive_offset_enabled_flag}. */
    public static void nsample_adaptive_offset_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #pcm_enabled_flag(boolean) pcm_enabled_flag}. */
    public static void npcm_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #pcm_loop_filter_disabled_flag(boolean) pcm_loop_filter_disabled_flag}. */
    public static void npcm_loop_filter_disabled_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #long_term_ref_pics_present_flag(boolean) long_term_ref_pics_present_flag}. */
    public static void nlong_term_ref_pics_present_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #sps_temporal_mvp_enabled_flag(boolean) sps_temporal_mvp_enabled_flag}. */
    public static void nsps_temporal_mvp_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #strong_intra_smoothing_enabled_flag(boolean) strong_intra_smoothing_enabled_flag}. */
    public static void nstrong_intra_smoothing_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #vui_parameters_present_flag(boolean) vui_parameters_present_flag}. */
    public static void nvui_parameters_present_flag(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }
    /** Unsafe version of {@link #sps_extension_present_flag(boolean) sps_extension_present_flag}. */
    public static void nsps_extension_present_flag(long struct, int value) { nbitfield0(struct, ((value << 12) & 0x00_00_10_00) | (nbitfield0(struct) & 0xFF_FF_EF_FF)); }
    /** Unsafe version of {@link #sps_range_extension_flag(boolean) sps_range_extension_flag}. */
    public static void nsps_range_extension_flag(long struct, int value) { nbitfield0(struct, ((value << 13) & 0x00_00_20_00) | (nbitfield0(struct) & 0xFF_FF_DF_FF)); }
    /** Unsafe version of {@link #transform_skip_rotation_enabled_flag(boolean) transform_skip_rotation_enabled_flag}. */
    public static void ntransform_skip_rotation_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 14) & 0x00_00_40_00) | (nbitfield0(struct) & 0xFF_FF_BF_FF)); }
    /** Unsafe version of {@link #transform_skip_context_enabled_flag(boolean) transform_skip_context_enabled_flag}. */
    public static void ntransform_skip_context_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 15) & 0x00_00_80_00) | (nbitfield0(struct) & 0xFF_FF_7F_FF)); }
    /** Unsafe version of {@link #implicit_rdpcm_enabled_flag(boolean) implicit_rdpcm_enabled_flag}. */
    public static void nimplicit_rdpcm_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 16) & 0x00_01_00_00) | (nbitfield0(struct) & 0xFF_FE_FF_FF)); }
    /** Unsafe version of {@link #explicit_rdpcm_enabled_flag(boolean) explicit_rdpcm_enabled_flag}. */
    public static void nexplicit_rdpcm_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 17) & 0x00_02_00_00) | (nbitfield0(struct) & 0xFF_FD_FF_FF)); }
    /** Unsafe version of {@link #extended_precision_processing_flag(boolean) extended_precision_processing_flag}. */
    public static void nextended_precision_processing_flag(long struct, int value) { nbitfield0(struct, ((value << 18) & 0x00_04_00_00) | (nbitfield0(struct) & 0xFF_FB_FF_FF)); }
    /** Unsafe version of {@link #intra_smoothing_disabled_flag(boolean) intra_smoothing_disabled_flag}. */
    public static void nintra_smoothing_disabled_flag(long struct, int value) { nbitfield0(struct, ((value << 19) & 0x00_08_00_00) | (nbitfield0(struct) & 0xFF_F7_FF_FF)); }
    /** Unsafe version of {@link #high_precision_offsets_enabled_flag(boolean) high_precision_offsets_enabled_flag}. */
    public static void nhigh_precision_offsets_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 20) & 0x00_10_00_00) | (nbitfield0(struct) & 0xFF_EF_FF_FF)); }
    /** Unsafe version of {@link #persistent_rice_adaptation_enabled_flag(boolean) persistent_rice_adaptation_enabled_flag}. */
    public static void npersistent_rice_adaptation_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 21) & 0x00_20_00_00) | (nbitfield0(struct) & 0xFF_DF_FF_FF)); }
    /** Unsafe version of {@link #cabac_bypass_alignment_enabled_flag(boolean) cabac_bypass_alignment_enabled_flag}. */
    public static void ncabac_bypass_alignment_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 22) & 0x00_40_00_00) | (nbitfield0(struct) & 0xFF_BF_FF_FF)); }
    /** Unsafe version of {@link #sps_curr_pic_ref_enabled_flag(boolean) sps_curr_pic_ref_enabled_flag}. */
    public static void nsps_curr_pic_ref_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 23) & 0x00_80_00_00) | (nbitfield0(struct) & 0xFF_7F_FF_FF)); }
    /** Unsafe version of {@link #palette_mode_enabled_flag(boolean) palette_mode_enabled_flag}. */
    public static void npalette_mode_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 24) & 0x01_00_00_00) | (nbitfield0(struct) & 0xFE_FF_FF_FF)); }
    /** Unsafe version of {@link #sps_palette_predictor_initializer_present_flag(boolean) sps_palette_predictor_initializer_present_flag}. */
    public static void nsps_palette_predictor_initializer_present_flag(long struct, int value) { nbitfield0(struct, ((value << 25) & 0x02_00_00_00) | (nbitfield0(struct) & 0xFD_FF_FF_FF)); }
    /** Unsafe version of {@link #intra_boundary_filtering_disabled_flag(boolean) intra_boundary_filtering_disabled_flag}. */
    public static void nintra_boundary_filtering_disabled_flag(long struct, int value) { nbitfield0(struct, ((value << 26) & 0x04_00_00_00) | (nbitfield0(struct) & 0xFB_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoH265SpsFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265SpsFlags, Buffer> implements NativeResource {

        private static final StdVideoH265SpsFlags ELEMENT_FACTORY = StdVideoH265SpsFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH265SpsFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265SpsFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265SpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sps_temporal_id_nesting_flag} field. */
        @NativeType("uint32_t")
        public boolean sps_temporal_id_nesting_flag() { return StdVideoH265SpsFlags.nsps_temporal_id_nesting_flag(address()) != 0; }
        /** @return the value of the {@code separate_colour_plane_flag} field. */
        @NativeType("uint32_t")
        public boolean separate_colour_plane_flag() { return StdVideoH265SpsFlags.nseparate_colour_plane_flag(address()) != 0; }
        /** @return the value of the {@code scaling_list_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean scaling_list_enabled_flag() { return StdVideoH265SpsFlags.nscaling_list_enabled_flag(address()) != 0; }
        /** @return the value of the {@code sps_scaling_list_data_present_flag} field. */
        @NativeType("uint32_t")
        public boolean sps_scaling_list_data_present_flag() { return StdVideoH265SpsFlags.nsps_scaling_list_data_present_flag(address()) != 0; }
        /** @return the value of the {@code amp_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean amp_enabled_flag() { return StdVideoH265SpsFlags.namp_enabled_flag(address()) != 0; }
        /** @return the value of the {@code sample_adaptive_offset_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean sample_adaptive_offset_enabled_flag() { return StdVideoH265SpsFlags.nsample_adaptive_offset_enabled_flag(address()) != 0; }
        /** @return the value of the {@code pcm_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean pcm_enabled_flag() { return StdVideoH265SpsFlags.npcm_enabled_flag(address()) != 0; }
        /** @return the value of the {@code pcm_loop_filter_disabled_flag} field. */
        @NativeType("uint32_t")
        public boolean pcm_loop_filter_disabled_flag() { return StdVideoH265SpsFlags.npcm_loop_filter_disabled_flag(address()) != 0; }
        /** @return the value of the {@code long_term_ref_pics_present_flag} field. */
        @NativeType("uint32_t")
        public boolean long_term_ref_pics_present_flag() { return StdVideoH265SpsFlags.nlong_term_ref_pics_present_flag(address()) != 0; }
        /** @return the value of the {@code sps_temporal_mvp_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean sps_temporal_mvp_enabled_flag() { return StdVideoH265SpsFlags.nsps_temporal_mvp_enabled_flag(address()) != 0; }
        /** @return the value of the {@code strong_intra_smoothing_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean strong_intra_smoothing_enabled_flag() { return StdVideoH265SpsFlags.nstrong_intra_smoothing_enabled_flag(address()) != 0; }
        /** @return the value of the {@code vui_parameters_present_flag} field. */
        @NativeType("uint32_t")
        public boolean vui_parameters_present_flag() { return StdVideoH265SpsFlags.nvui_parameters_present_flag(address()) != 0; }
        /** @return the value of the {@code sps_extension_present_flag} field. */
        @NativeType("uint32_t")
        public boolean sps_extension_present_flag() { return StdVideoH265SpsFlags.nsps_extension_present_flag(address()) != 0; }
        /** @return the value of the {@code sps_range_extension_flag} field. */
        @NativeType("uint32_t")
        public boolean sps_range_extension_flag() { return StdVideoH265SpsFlags.nsps_range_extension_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoH265SpsFlags#transform_skip_rotation_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean transform_skip_rotation_enabled_flag() { return StdVideoH265SpsFlags.ntransform_skip_rotation_enabled_flag(address()) != 0; }
        /** @return the value of the {@code transform_skip_context_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean transform_skip_context_enabled_flag() { return StdVideoH265SpsFlags.ntransform_skip_context_enabled_flag(address()) != 0; }
        /** @return the value of the {@code implicit_rdpcm_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean implicit_rdpcm_enabled_flag() { return StdVideoH265SpsFlags.nimplicit_rdpcm_enabled_flag(address()) != 0; }
        /** @return the value of the {@code explicit_rdpcm_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean explicit_rdpcm_enabled_flag() { return StdVideoH265SpsFlags.nexplicit_rdpcm_enabled_flag(address()) != 0; }
        /** @return the value of the {@code extended_precision_processing_flag} field. */
        @NativeType("uint32_t")
        public boolean extended_precision_processing_flag() { return StdVideoH265SpsFlags.nextended_precision_processing_flag(address()) != 0; }
        /** @return the value of the {@code intra_smoothing_disabled_flag} field. */
        @NativeType("uint32_t")
        public boolean intra_smoothing_disabled_flag() { return StdVideoH265SpsFlags.nintra_smoothing_disabled_flag(address()) != 0; }
        /** @return the value of the {@code high_precision_offsets_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean high_precision_offsets_enabled_flag() { return StdVideoH265SpsFlags.nhigh_precision_offsets_enabled_flag(address()) != 0; }
        /** @return the value of the {@code persistent_rice_adaptation_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean persistent_rice_adaptation_enabled_flag() { return StdVideoH265SpsFlags.npersistent_rice_adaptation_enabled_flag(address()) != 0; }
        /** @return the value of the {@code cabac_bypass_alignment_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean cabac_bypass_alignment_enabled_flag() { return StdVideoH265SpsFlags.ncabac_bypass_alignment_enabled_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoH265SpsFlags#sps_curr_pic_ref_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean sps_curr_pic_ref_enabled_flag() { return StdVideoH265SpsFlags.nsps_curr_pic_ref_enabled_flag(address()) != 0; }
        /** @return the value of the {@code palette_mode_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean palette_mode_enabled_flag() { return StdVideoH265SpsFlags.npalette_mode_enabled_flag(address()) != 0; }
        /** @return the value of the {@code sps_palette_predictor_initializer_present_flag} field. */
        @NativeType("uint32_t")
        public boolean sps_palette_predictor_initializer_present_flag() { return StdVideoH265SpsFlags.nsps_palette_predictor_initializer_present_flag(address()) != 0; }
        /** @return the value of the {@code intra_boundary_filtering_disabled_flag} field. */
        @NativeType("uint32_t")
        public boolean intra_boundary_filtering_disabled_flag() { return StdVideoH265SpsFlags.nintra_boundary_filtering_disabled_flag(address()) != 0; }

        /** Sets the specified value to the {@code sps_temporal_id_nesting_flag} field. */
        public StdVideoH265SpsFlags.Buffer sps_temporal_id_nesting_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nsps_temporal_id_nesting_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code separate_colour_plane_flag} field. */
        public StdVideoH265SpsFlags.Buffer separate_colour_plane_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nseparate_colour_plane_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code scaling_list_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer scaling_list_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nscaling_list_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sps_scaling_list_data_present_flag} field. */
        public StdVideoH265SpsFlags.Buffer sps_scaling_list_data_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nsps_scaling_list_data_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code amp_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer amp_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.namp_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sample_adaptive_offset_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer sample_adaptive_offset_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nsample_adaptive_offset_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pcm_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer pcm_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.npcm_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pcm_loop_filter_disabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer pcm_loop_filter_disabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.npcm_loop_filter_disabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code long_term_ref_pics_present_flag} field. */
        public StdVideoH265SpsFlags.Buffer long_term_ref_pics_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nlong_term_ref_pics_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sps_temporal_mvp_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer sps_temporal_mvp_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nsps_temporal_mvp_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code strong_intra_smoothing_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer strong_intra_smoothing_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nstrong_intra_smoothing_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vui_parameters_present_flag} field. */
        public StdVideoH265SpsFlags.Buffer vui_parameters_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nvui_parameters_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sps_extension_present_flag} field. */
        public StdVideoH265SpsFlags.Buffer sps_extension_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nsps_extension_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sps_range_extension_flag} field. */
        public StdVideoH265SpsFlags.Buffer sps_range_extension_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nsps_range_extension_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoH265SpsFlags#transform_skip_rotation_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer transform_skip_rotation_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.ntransform_skip_rotation_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code transform_skip_context_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer transform_skip_context_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.ntransform_skip_context_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code implicit_rdpcm_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer implicit_rdpcm_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nimplicit_rdpcm_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code explicit_rdpcm_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer explicit_rdpcm_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nexplicit_rdpcm_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code extended_precision_processing_flag} field. */
        public StdVideoH265SpsFlags.Buffer extended_precision_processing_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nextended_precision_processing_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code intra_smoothing_disabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer intra_smoothing_disabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nintra_smoothing_disabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code high_precision_offsets_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer high_precision_offsets_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nhigh_precision_offsets_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code persistent_rice_adaptation_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer persistent_rice_adaptation_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.npersistent_rice_adaptation_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cabac_bypass_alignment_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer cabac_bypass_alignment_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.ncabac_bypass_alignment_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoH265SpsFlags#sps_curr_pic_ref_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer sps_curr_pic_ref_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nsps_curr_pic_ref_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code palette_mode_enabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer palette_mode_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.npalette_mode_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sps_palette_predictor_initializer_present_flag} field. */
        public StdVideoH265SpsFlags.Buffer sps_palette_predictor_initializer_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nsps_palette_predictor_initializer_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code intra_boundary_filtering_disabled_flag} field. */
        public StdVideoH265SpsFlags.Buffer intra_boundary_filtering_disabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265SpsFlags.nintra_boundary_filtering_disabled_flag(address(), value ? 1 : 0); return this; }

    }

}
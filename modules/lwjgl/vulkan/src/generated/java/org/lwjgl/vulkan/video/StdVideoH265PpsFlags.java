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
 * struct StdVideoH265PpsFlags {
 *     uint32_t dependent_slice_segments_enabled_flag : 1;
 *     uint32_t output_flag_present_flag : 1;
 *     uint32_t sign_data_hiding_enabled_flag : 1;
 *     uint32_t cabac_init_present_flag : 1;
 *     uint32_t constrained_intra_pred_flag : 1;
 *     uint32_t transform_skip_enabled_flag : 1;
 *     uint32_t cu_qp_delta_enabled_flag : 1;
 *     uint32_t pps_slice_chroma_qp_offsets_present_flag : 1;
 *     uint32_t weighted_pred_flag : 1;
 *     uint32_t weighted_bipred_flag : 1;
 *     uint32_t transquant_bypass_enabled_flag : 1;
 *     uint32_t tiles_enabled_flag : 1;
 *     uint32_t entropy_coding_sync_enabled_flag : 1;
 *     uint32_t uniform_spacing_flag : 1;
 *     uint32_t loop_filter_across_tiles_enabled_flag : 1;
 *     uint32_t pps_loop_filter_across_slices_enabled_flag : 1;
 *     uint32_t deblocking_filter_control_present_flag : 1;
 *     uint32_t deblocking_filter_override_enabled_flag : 1;
 *     uint32_t pps_deblocking_filter_disabled_flag : 1;
 *     uint32_t pps_scaling_list_data_present_flag : 1;
 *     uint32_t lists_modification_present_flag : 1;
 *     uint32_t slice_segment_header_extension_present_flag : 1;
 *     uint32_t pps_extension_present_flag : 1;
 *     uint32_t {@link #cross_component_prediction_enabled_flag} : 1;
 *     uint32_t chroma_qp_offset_list_enabled_flag : 1;
 *     uint32_t {@link #pps_curr_pic_ref_enabled_flag} : 1;
 *     uint32_t residual_adaptive_colour_transform_enabled_flag : 1;
 *     uint32_t pps_slice_act_qp_offsets_present_flag : 1;
 *     uint32_t pps_palette_predictor_initializer_present_flag : 1;
 *     uint32_t monochrome_palette_flag : 1;
 *     uint32_t pps_range_extension_flag : 1;
 * }</code></pre>
 */
public class StdVideoH265PpsFlags extends Struct implements NativeResource {

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
     * Creates a {@code StdVideoH265PpsFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265PpsFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code dependent_slice_segments_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean dependent_slice_segments_enabled_flag() { return ndependent_slice_segments_enabled_flag(address()) != 0; }
    /** @return the value of the {@code output_flag_present_flag} field. */
    @NativeType("uint32_t")
    public boolean output_flag_present_flag() { return noutput_flag_present_flag(address()) != 0; }
    /** @return the value of the {@code sign_data_hiding_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean sign_data_hiding_enabled_flag() { return nsign_data_hiding_enabled_flag(address()) != 0; }
    /** @return the value of the {@code cabac_init_present_flag} field. */
    @NativeType("uint32_t")
    public boolean cabac_init_present_flag() { return ncabac_init_present_flag(address()) != 0; }
    /** @return the value of the {@code constrained_intra_pred_flag} field. */
    @NativeType("uint32_t")
    public boolean constrained_intra_pred_flag() { return nconstrained_intra_pred_flag(address()) != 0; }
    /** @return the value of the {@code transform_skip_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean transform_skip_enabled_flag() { return ntransform_skip_enabled_flag(address()) != 0; }
    /** @return the value of the {@code cu_qp_delta_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean cu_qp_delta_enabled_flag() { return ncu_qp_delta_enabled_flag(address()) != 0; }
    /** @return the value of the {@code pps_slice_chroma_qp_offsets_present_flag} field. */
    @NativeType("uint32_t")
    public boolean pps_slice_chroma_qp_offsets_present_flag() { return npps_slice_chroma_qp_offsets_present_flag(address()) != 0; }
    /** @return the value of the {@code weighted_pred_flag} field. */
    @NativeType("uint32_t")
    public boolean weighted_pred_flag() { return nweighted_pred_flag(address()) != 0; }
    /** @return the value of the {@code weighted_bipred_flag} field. */
    @NativeType("uint32_t")
    public boolean weighted_bipred_flag() { return nweighted_bipred_flag(address()) != 0; }
    /** @return the value of the {@code transquant_bypass_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean transquant_bypass_enabled_flag() { return ntransquant_bypass_enabled_flag(address()) != 0; }
    /** @return the value of the {@code tiles_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean tiles_enabled_flag() { return ntiles_enabled_flag(address()) != 0; }
    /** @return the value of the {@code entropy_coding_sync_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean entropy_coding_sync_enabled_flag() { return nentropy_coding_sync_enabled_flag(address()) != 0; }
    /** @return the value of the {@code uniform_spacing_flag} field. */
    @NativeType("uint32_t")
    public boolean uniform_spacing_flag() { return nuniform_spacing_flag(address()) != 0; }
    /** @return the value of the {@code loop_filter_across_tiles_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean loop_filter_across_tiles_enabled_flag() { return nloop_filter_across_tiles_enabled_flag(address()) != 0; }
    /** @return the value of the {@code pps_loop_filter_across_slices_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean pps_loop_filter_across_slices_enabled_flag() { return npps_loop_filter_across_slices_enabled_flag(address()) != 0; }
    /** @return the value of the {@code deblocking_filter_control_present_flag} field. */
    @NativeType("uint32_t")
    public boolean deblocking_filter_control_present_flag() { return ndeblocking_filter_control_present_flag(address()) != 0; }
    /** @return the value of the {@code deblocking_filter_override_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean deblocking_filter_override_enabled_flag() { return ndeblocking_filter_override_enabled_flag(address()) != 0; }
    /** @return the value of the {@code pps_deblocking_filter_disabled_flag} field. */
    @NativeType("uint32_t")
    public boolean pps_deblocking_filter_disabled_flag() { return npps_deblocking_filter_disabled_flag(address()) != 0; }
    /** @return the value of the {@code pps_scaling_list_data_present_flag} field. */
    @NativeType("uint32_t")
    public boolean pps_scaling_list_data_present_flag() { return npps_scaling_list_data_present_flag(address()) != 0; }
    /** @return the value of the {@code lists_modification_present_flag} field. */
    @NativeType("uint32_t")
    public boolean lists_modification_present_flag() { return nlists_modification_present_flag(address()) != 0; }
    /** @return the value of the {@code slice_segment_header_extension_present_flag} field. */
    @NativeType("uint32_t")
    public boolean slice_segment_header_extension_present_flag() { return nslice_segment_header_extension_present_flag(address()) != 0; }
    /** @return the value of the {@code pps_extension_present_flag} field. */
    @NativeType("uint32_t")
    public boolean pps_extension_present_flag() { return npps_extension_present_flag(address()) != 0; }
    /** extension PPS flags, valid when {@link STDVulkanVideoCodecH265#STD_VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS} is set */
    @NativeType("uint32_t")
    public boolean cross_component_prediction_enabled_flag() { return ncross_component_prediction_enabled_flag(address()) != 0; }
    /** @return the value of the {@code chroma_qp_offset_list_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean chroma_qp_offset_list_enabled_flag() { return nchroma_qp_offset_list_enabled_flag(address()) != 0; }
    /** extension PPS flags, valid when {@link STDVulkanVideoCodecH265#STD_VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS} is set */
    @NativeType("uint32_t")
    public boolean pps_curr_pic_ref_enabled_flag() { return npps_curr_pic_ref_enabled_flag(address()) != 0; }
    /** @return the value of the {@code residual_adaptive_colour_transform_enabled_flag} field. */
    @NativeType("uint32_t")
    public boolean residual_adaptive_colour_transform_enabled_flag() { return nresidual_adaptive_colour_transform_enabled_flag(address()) != 0; }
    /** @return the value of the {@code pps_slice_act_qp_offsets_present_flag} field. */
    @NativeType("uint32_t")
    public boolean pps_slice_act_qp_offsets_present_flag() { return npps_slice_act_qp_offsets_present_flag(address()) != 0; }
    /** @return the value of the {@code pps_palette_predictor_initializer_present_flag} field. */
    @NativeType("uint32_t")
    public boolean pps_palette_predictor_initializer_present_flag() { return npps_palette_predictor_initializer_present_flag(address()) != 0; }
    /** @return the value of the {@code monochrome_palette_flag} field. */
    @NativeType("uint32_t")
    public boolean monochrome_palette_flag() { return nmonochrome_palette_flag(address()) != 0; }
    /** @return the value of the {@code pps_range_extension_flag} field. */
    @NativeType("uint32_t")
    public boolean pps_range_extension_flag() { return npps_range_extension_flag(address()) != 0; }

    /** Sets the specified value to the {@code dependent_slice_segments_enabled_flag} field. */
    public StdVideoH265PpsFlags dependent_slice_segments_enabled_flag(@NativeType("uint32_t") boolean value) { ndependent_slice_segments_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code output_flag_present_flag} field. */
    public StdVideoH265PpsFlags output_flag_present_flag(@NativeType("uint32_t") boolean value) { noutput_flag_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code sign_data_hiding_enabled_flag} field. */
    public StdVideoH265PpsFlags sign_data_hiding_enabled_flag(@NativeType("uint32_t") boolean value) { nsign_data_hiding_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cabac_init_present_flag} field. */
    public StdVideoH265PpsFlags cabac_init_present_flag(@NativeType("uint32_t") boolean value) { ncabac_init_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code constrained_intra_pred_flag} field. */
    public StdVideoH265PpsFlags constrained_intra_pred_flag(@NativeType("uint32_t") boolean value) { nconstrained_intra_pred_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code transform_skip_enabled_flag} field. */
    public StdVideoH265PpsFlags transform_skip_enabled_flag(@NativeType("uint32_t") boolean value) { ntransform_skip_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cu_qp_delta_enabled_flag} field. */
    public StdVideoH265PpsFlags cu_qp_delta_enabled_flag(@NativeType("uint32_t") boolean value) { ncu_qp_delta_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pps_slice_chroma_qp_offsets_present_flag} field. */
    public StdVideoH265PpsFlags pps_slice_chroma_qp_offsets_present_flag(@NativeType("uint32_t") boolean value) { npps_slice_chroma_qp_offsets_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code weighted_pred_flag} field. */
    public StdVideoH265PpsFlags weighted_pred_flag(@NativeType("uint32_t") boolean value) { nweighted_pred_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code weighted_bipred_flag} field. */
    public StdVideoH265PpsFlags weighted_bipred_flag(@NativeType("uint32_t") boolean value) { nweighted_bipred_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code transquant_bypass_enabled_flag} field. */
    public StdVideoH265PpsFlags transquant_bypass_enabled_flag(@NativeType("uint32_t") boolean value) { ntransquant_bypass_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tiles_enabled_flag} field. */
    public StdVideoH265PpsFlags tiles_enabled_flag(@NativeType("uint32_t") boolean value) { ntiles_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code entropy_coding_sync_enabled_flag} field. */
    public StdVideoH265PpsFlags entropy_coding_sync_enabled_flag(@NativeType("uint32_t") boolean value) { nentropy_coding_sync_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code uniform_spacing_flag} field. */
    public StdVideoH265PpsFlags uniform_spacing_flag(@NativeType("uint32_t") boolean value) { nuniform_spacing_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code loop_filter_across_tiles_enabled_flag} field. */
    public StdVideoH265PpsFlags loop_filter_across_tiles_enabled_flag(@NativeType("uint32_t") boolean value) { nloop_filter_across_tiles_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pps_loop_filter_across_slices_enabled_flag} field. */
    public StdVideoH265PpsFlags pps_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") boolean value) { npps_loop_filter_across_slices_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code deblocking_filter_control_present_flag} field. */
    public StdVideoH265PpsFlags deblocking_filter_control_present_flag(@NativeType("uint32_t") boolean value) { ndeblocking_filter_control_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code deblocking_filter_override_enabled_flag} field. */
    public StdVideoH265PpsFlags deblocking_filter_override_enabled_flag(@NativeType("uint32_t") boolean value) { ndeblocking_filter_override_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pps_deblocking_filter_disabled_flag} field. */
    public StdVideoH265PpsFlags pps_deblocking_filter_disabled_flag(@NativeType("uint32_t") boolean value) { npps_deblocking_filter_disabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pps_scaling_list_data_present_flag} field. */
    public StdVideoH265PpsFlags pps_scaling_list_data_present_flag(@NativeType("uint32_t") boolean value) { npps_scaling_list_data_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code lists_modification_present_flag} field. */
    public StdVideoH265PpsFlags lists_modification_present_flag(@NativeType("uint32_t") boolean value) { nlists_modification_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code slice_segment_header_extension_present_flag} field. */
    public StdVideoH265PpsFlags slice_segment_header_extension_present_flag(@NativeType("uint32_t") boolean value) { nslice_segment_header_extension_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pps_extension_present_flag} field. */
    public StdVideoH265PpsFlags pps_extension_present_flag(@NativeType("uint32_t") boolean value) { npps_extension_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #cross_component_prediction_enabled_flag} field. */
    public StdVideoH265PpsFlags cross_component_prediction_enabled_flag(@NativeType("uint32_t") boolean value) { ncross_component_prediction_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code chroma_qp_offset_list_enabled_flag} field. */
    public StdVideoH265PpsFlags chroma_qp_offset_list_enabled_flag(@NativeType("uint32_t") boolean value) { nchroma_qp_offset_list_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #pps_curr_pic_ref_enabled_flag} field. */
    public StdVideoH265PpsFlags pps_curr_pic_ref_enabled_flag(@NativeType("uint32_t") boolean value) { npps_curr_pic_ref_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code residual_adaptive_colour_transform_enabled_flag} field. */
    public StdVideoH265PpsFlags residual_adaptive_colour_transform_enabled_flag(@NativeType("uint32_t") boolean value) { nresidual_adaptive_colour_transform_enabled_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pps_slice_act_qp_offsets_present_flag} field. */
    public StdVideoH265PpsFlags pps_slice_act_qp_offsets_present_flag(@NativeType("uint32_t") boolean value) { npps_slice_act_qp_offsets_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pps_palette_predictor_initializer_present_flag} field. */
    public StdVideoH265PpsFlags pps_palette_predictor_initializer_present_flag(@NativeType("uint32_t") boolean value) { npps_palette_predictor_initializer_present_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code monochrome_palette_flag} field. */
    public StdVideoH265PpsFlags monochrome_palette_flag(@NativeType("uint32_t") boolean value) { nmonochrome_palette_flag(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code pps_range_extension_flag} field. */
    public StdVideoH265PpsFlags pps_range_extension_flag(@NativeType("uint32_t") boolean value) { npps_range_extension_flag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265PpsFlags set(
        boolean dependent_slice_segments_enabled_flag,
        boolean output_flag_present_flag,
        boolean sign_data_hiding_enabled_flag,
        boolean cabac_init_present_flag,
        boolean constrained_intra_pred_flag,
        boolean transform_skip_enabled_flag,
        boolean cu_qp_delta_enabled_flag,
        boolean pps_slice_chroma_qp_offsets_present_flag,
        boolean weighted_pred_flag,
        boolean weighted_bipred_flag,
        boolean transquant_bypass_enabled_flag,
        boolean tiles_enabled_flag,
        boolean entropy_coding_sync_enabled_flag,
        boolean uniform_spacing_flag,
        boolean loop_filter_across_tiles_enabled_flag,
        boolean pps_loop_filter_across_slices_enabled_flag,
        boolean deblocking_filter_control_present_flag,
        boolean deblocking_filter_override_enabled_flag,
        boolean pps_deblocking_filter_disabled_flag,
        boolean pps_scaling_list_data_present_flag,
        boolean lists_modification_present_flag,
        boolean slice_segment_header_extension_present_flag,
        boolean pps_extension_present_flag,
        boolean cross_component_prediction_enabled_flag,
        boolean chroma_qp_offset_list_enabled_flag,
        boolean pps_curr_pic_ref_enabled_flag,
        boolean residual_adaptive_colour_transform_enabled_flag,
        boolean pps_slice_act_qp_offsets_present_flag,
        boolean pps_palette_predictor_initializer_present_flag,
        boolean monochrome_palette_flag,
        boolean pps_range_extension_flag
    ) {
        dependent_slice_segments_enabled_flag(dependent_slice_segments_enabled_flag);
        output_flag_present_flag(output_flag_present_flag);
        sign_data_hiding_enabled_flag(sign_data_hiding_enabled_flag);
        cabac_init_present_flag(cabac_init_present_flag);
        constrained_intra_pred_flag(constrained_intra_pred_flag);
        transform_skip_enabled_flag(transform_skip_enabled_flag);
        cu_qp_delta_enabled_flag(cu_qp_delta_enabled_flag);
        pps_slice_chroma_qp_offsets_present_flag(pps_slice_chroma_qp_offsets_present_flag);
        weighted_pred_flag(weighted_pred_flag);
        weighted_bipred_flag(weighted_bipred_flag);
        transquant_bypass_enabled_flag(transquant_bypass_enabled_flag);
        tiles_enabled_flag(tiles_enabled_flag);
        entropy_coding_sync_enabled_flag(entropy_coding_sync_enabled_flag);
        uniform_spacing_flag(uniform_spacing_flag);
        loop_filter_across_tiles_enabled_flag(loop_filter_across_tiles_enabled_flag);
        pps_loop_filter_across_slices_enabled_flag(pps_loop_filter_across_slices_enabled_flag);
        deblocking_filter_control_present_flag(deblocking_filter_control_present_flag);
        deblocking_filter_override_enabled_flag(deblocking_filter_override_enabled_flag);
        pps_deblocking_filter_disabled_flag(pps_deblocking_filter_disabled_flag);
        pps_scaling_list_data_present_flag(pps_scaling_list_data_present_flag);
        lists_modification_present_flag(lists_modification_present_flag);
        slice_segment_header_extension_present_flag(slice_segment_header_extension_present_flag);
        pps_extension_present_flag(pps_extension_present_flag);
        cross_component_prediction_enabled_flag(cross_component_prediction_enabled_flag);
        chroma_qp_offset_list_enabled_flag(chroma_qp_offset_list_enabled_flag);
        pps_curr_pic_ref_enabled_flag(pps_curr_pic_ref_enabled_flag);
        residual_adaptive_colour_transform_enabled_flag(residual_adaptive_colour_transform_enabled_flag);
        pps_slice_act_qp_offsets_present_flag(pps_slice_act_qp_offsets_present_flag);
        pps_palette_predictor_initializer_present_flag(pps_palette_predictor_initializer_present_flag);
        monochrome_palette_flag(monochrome_palette_flag);
        pps_range_extension_flag(pps_range_extension_flag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265PpsFlags set(StdVideoH265PpsFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265PpsFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265PpsFlags malloc() {
        return wrap(StdVideoH265PpsFlags.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265PpsFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265PpsFlags calloc() {
        return wrap(StdVideoH265PpsFlags.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265PpsFlags} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265PpsFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265PpsFlags.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265PpsFlags} instance for the specified memory address. */
    public static StdVideoH265PpsFlags create(long address) {
        return wrap(StdVideoH265PpsFlags.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265PpsFlags createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265PpsFlags.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265PpsFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PpsFlags.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PpsFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PpsFlags.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PpsFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PpsFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265PpsFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PpsFlags.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265PpsFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265PpsFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265PpsFlags malloc(MemoryStack stack) {
        return wrap(StdVideoH265PpsFlags.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265PpsFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265PpsFlags calloc(MemoryStack stack) {
        return wrap(StdVideoH265PpsFlags.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265PpsFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PpsFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PpsFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PpsFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static int nbitfield0(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265PpsFlags.BITFIELD0); }
    /** Unsafe version of {@link #dependent_slice_segments_enabled_flag}. */
    public static int ndependent_slice_segments_enabled_flag(long struct) { return nbitfield0(struct) & 0x00_00_00_01; }
    /** Unsafe version of {@link #output_flag_present_flag}. */
    public static int noutput_flag_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_02) >>> 1; }
    /** Unsafe version of {@link #sign_data_hiding_enabled_flag}. */
    public static int nsign_data_hiding_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_04) >>> 2; }
    /** Unsafe version of {@link #cabac_init_present_flag}. */
    public static int ncabac_init_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_08) >>> 3; }
    /** Unsafe version of {@link #constrained_intra_pred_flag}. */
    public static int nconstrained_intra_pred_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_10) >>> 4; }
    /** Unsafe version of {@link #transform_skip_enabled_flag}. */
    public static int ntransform_skip_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_20) >>> 5; }
    /** Unsafe version of {@link #cu_qp_delta_enabled_flag}. */
    public static int ncu_qp_delta_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_40) >>> 6; }
    /** Unsafe version of {@link #pps_slice_chroma_qp_offsets_present_flag}. */
    public static int npps_slice_chroma_qp_offsets_present_flag(long struct) { return (nbitfield0(struct) & 0x00_00_00_80) >>> 7; }
    /** Unsafe version of {@link #weighted_pred_flag}. */
    public static int nweighted_pred_flag(long struct) { return (nbitfield0(struct) & 0x00_00_01_00) >>> 8; }
    /** Unsafe version of {@link #weighted_bipred_flag}. */
    public static int nweighted_bipred_flag(long struct) { return (nbitfield0(struct) & 0x00_00_02_00) >>> 9; }
    /** Unsafe version of {@link #transquant_bypass_enabled_flag}. */
    public static int ntransquant_bypass_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_04_00) >>> 10; }
    /** Unsafe version of {@link #tiles_enabled_flag}. */
    public static int ntiles_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_08_00) >>> 11; }
    /** Unsafe version of {@link #entropy_coding_sync_enabled_flag}. */
    public static int nentropy_coding_sync_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_10_00) >>> 12; }
    /** Unsafe version of {@link #uniform_spacing_flag}. */
    public static int nuniform_spacing_flag(long struct) { return (nbitfield0(struct) & 0x00_00_20_00) >>> 13; }
    /** Unsafe version of {@link #loop_filter_across_tiles_enabled_flag}. */
    public static int nloop_filter_across_tiles_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_40_00) >>> 14; }
    /** Unsafe version of {@link #pps_loop_filter_across_slices_enabled_flag}. */
    public static int npps_loop_filter_across_slices_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_00_80_00) >>> 15; }
    /** Unsafe version of {@link #deblocking_filter_control_present_flag}. */
    public static int ndeblocking_filter_control_present_flag(long struct) { return (nbitfield0(struct) & 0x00_01_00_00) >>> 16; }
    /** Unsafe version of {@link #deblocking_filter_override_enabled_flag}. */
    public static int ndeblocking_filter_override_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_02_00_00) >>> 17; }
    /** Unsafe version of {@link #pps_deblocking_filter_disabled_flag}. */
    public static int npps_deblocking_filter_disabled_flag(long struct) { return (nbitfield0(struct) & 0x00_04_00_00) >>> 18; }
    /** Unsafe version of {@link #pps_scaling_list_data_present_flag}. */
    public static int npps_scaling_list_data_present_flag(long struct) { return (nbitfield0(struct) & 0x00_08_00_00) >>> 19; }
    /** Unsafe version of {@link #lists_modification_present_flag}. */
    public static int nlists_modification_present_flag(long struct) { return (nbitfield0(struct) & 0x00_10_00_00) >>> 20; }
    /** Unsafe version of {@link #slice_segment_header_extension_present_flag}. */
    public static int nslice_segment_header_extension_present_flag(long struct) { return (nbitfield0(struct) & 0x00_20_00_00) >>> 21; }
    /** Unsafe version of {@link #pps_extension_present_flag}. */
    public static int npps_extension_present_flag(long struct) { return (nbitfield0(struct) & 0x00_40_00_00) >>> 22; }
    /** Unsafe version of {@link #cross_component_prediction_enabled_flag}. */
    public static int ncross_component_prediction_enabled_flag(long struct) { return (nbitfield0(struct) & 0x00_80_00_00) >>> 23; }
    /** Unsafe version of {@link #chroma_qp_offset_list_enabled_flag}. */
    public static int nchroma_qp_offset_list_enabled_flag(long struct) { return (nbitfield0(struct) & 0x01_00_00_00) >>> 24; }
    /** Unsafe version of {@link #pps_curr_pic_ref_enabled_flag}. */
    public static int npps_curr_pic_ref_enabled_flag(long struct) { return (nbitfield0(struct) & 0x02_00_00_00) >>> 25; }
    /** Unsafe version of {@link #residual_adaptive_colour_transform_enabled_flag}. */
    public static int nresidual_adaptive_colour_transform_enabled_flag(long struct) { return (nbitfield0(struct) & 0x04_00_00_00) >>> 26; }
    /** Unsafe version of {@link #pps_slice_act_qp_offsets_present_flag}. */
    public static int npps_slice_act_qp_offsets_present_flag(long struct) { return (nbitfield0(struct) & 0x08_00_00_00) >>> 27; }
    /** Unsafe version of {@link #pps_palette_predictor_initializer_present_flag}. */
    public static int npps_palette_predictor_initializer_present_flag(long struct) { return (nbitfield0(struct) & 0x10_00_00_00) >>> 28; }
    /** Unsafe version of {@link #monochrome_palette_flag}. */
    public static int nmonochrome_palette_flag(long struct) { return (nbitfield0(struct) & 0x20_00_00_00) >>> 29; }
    /** Unsafe version of {@link #pps_range_extension_flag}. */
    public static int npps_range_extension_flag(long struct) { return (nbitfield0(struct) & 0x40_00_00_00) >>> 30; }

    public static void nbitfield0(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265PpsFlags.BITFIELD0, value); }
    /** Unsafe version of {@link #dependent_slice_segments_enabled_flag(boolean) dependent_slice_segments_enabled_flag}. */
    public static void ndependent_slice_segments_enabled_flag(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FF_FE) | (value & 0x00_00_00_01)); }
    /** Unsafe version of {@link #output_flag_present_flag(boolean) output_flag_present_flag}. */
    public static void noutput_flag_present_flag(long struct, int value) { nbitfield0(struct, ((value << 1) & 0x00_00_00_02) | (nbitfield0(struct) & 0xFF_FF_FF_FD)); }
    /** Unsafe version of {@link #sign_data_hiding_enabled_flag(boolean) sign_data_hiding_enabled_flag}. */
    public static void nsign_data_hiding_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 2) & 0x00_00_00_04) | (nbitfield0(struct) & 0xFF_FF_FF_FB)); }
    /** Unsafe version of {@link #cabac_init_present_flag(boolean) cabac_init_present_flag}. */
    public static void ncabac_init_present_flag(long struct, int value) { nbitfield0(struct, ((value << 3) & 0x00_00_00_08) | (nbitfield0(struct) & 0xFF_FF_FF_F7)); }
    /** Unsafe version of {@link #constrained_intra_pred_flag(boolean) constrained_intra_pred_flag}. */
    public static void nconstrained_intra_pred_flag(long struct, int value) { nbitfield0(struct, ((value << 4) & 0x00_00_00_10) | (nbitfield0(struct) & 0xFF_FF_FF_EF)); }
    /** Unsafe version of {@link #transform_skip_enabled_flag(boolean) transform_skip_enabled_flag}. */
    public static void ntransform_skip_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 5) & 0x00_00_00_20) | (nbitfield0(struct) & 0xFF_FF_FF_DF)); }
    /** Unsafe version of {@link #cu_qp_delta_enabled_flag(boolean) cu_qp_delta_enabled_flag}. */
    public static void ncu_qp_delta_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 6) & 0x00_00_00_40) | (nbitfield0(struct) & 0xFF_FF_FF_BF)); }
    /** Unsafe version of {@link #pps_slice_chroma_qp_offsets_present_flag(boolean) pps_slice_chroma_qp_offsets_present_flag}. */
    public static void npps_slice_chroma_qp_offsets_present_flag(long struct, int value) { nbitfield0(struct, ((value << 7) & 0x00_00_00_80) | (nbitfield0(struct) & 0xFF_FF_FF_7F)); }
    /** Unsafe version of {@link #weighted_pred_flag(boolean) weighted_pred_flag}. */
    public static void nweighted_pred_flag(long struct, int value) { nbitfield0(struct, ((value << 8) & 0x00_00_01_00) | (nbitfield0(struct) & 0xFF_FF_FE_FF)); }
    /** Unsafe version of {@link #weighted_bipred_flag(boolean) weighted_bipred_flag}. */
    public static void nweighted_bipred_flag(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_00_02_00) | (nbitfield0(struct) & 0xFF_FF_FD_FF)); }
    /** Unsafe version of {@link #transquant_bypass_enabled_flag(boolean) transquant_bypass_enabled_flag}. */
    public static void ntransquant_bypass_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 10) & 0x00_00_04_00) | (nbitfield0(struct) & 0xFF_FF_FB_FF)); }
    /** Unsafe version of {@link #tiles_enabled_flag(boolean) tiles_enabled_flag}. */
    public static void ntiles_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 11) & 0x00_00_08_00) | (nbitfield0(struct) & 0xFF_FF_F7_FF)); }
    /** Unsafe version of {@link #entropy_coding_sync_enabled_flag(boolean) entropy_coding_sync_enabled_flag}. */
    public static void nentropy_coding_sync_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 12) & 0x00_00_10_00) | (nbitfield0(struct) & 0xFF_FF_EF_FF)); }
    /** Unsafe version of {@link #uniform_spacing_flag(boolean) uniform_spacing_flag}. */
    public static void nuniform_spacing_flag(long struct, int value) { nbitfield0(struct, ((value << 13) & 0x00_00_20_00) | (nbitfield0(struct) & 0xFF_FF_DF_FF)); }
    /** Unsafe version of {@link #loop_filter_across_tiles_enabled_flag(boolean) loop_filter_across_tiles_enabled_flag}. */
    public static void nloop_filter_across_tiles_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 14) & 0x00_00_40_00) | (nbitfield0(struct) & 0xFF_FF_BF_FF)); }
    /** Unsafe version of {@link #pps_loop_filter_across_slices_enabled_flag(boolean) pps_loop_filter_across_slices_enabled_flag}. */
    public static void npps_loop_filter_across_slices_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 15) & 0x00_00_80_00) | (nbitfield0(struct) & 0xFF_FF_7F_FF)); }
    /** Unsafe version of {@link #deblocking_filter_control_present_flag(boolean) deblocking_filter_control_present_flag}. */
    public static void ndeblocking_filter_control_present_flag(long struct, int value) { nbitfield0(struct, ((value << 16) & 0x00_01_00_00) | (nbitfield0(struct) & 0xFF_FE_FF_FF)); }
    /** Unsafe version of {@link #deblocking_filter_override_enabled_flag(boolean) deblocking_filter_override_enabled_flag}. */
    public static void ndeblocking_filter_override_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 17) & 0x00_02_00_00) | (nbitfield0(struct) & 0xFF_FD_FF_FF)); }
    /** Unsafe version of {@link #pps_deblocking_filter_disabled_flag(boolean) pps_deblocking_filter_disabled_flag}. */
    public static void npps_deblocking_filter_disabled_flag(long struct, int value) { nbitfield0(struct, ((value << 18) & 0x00_04_00_00) | (nbitfield0(struct) & 0xFF_FB_FF_FF)); }
    /** Unsafe version of {@link #pps_scaling_list_data_present_flag(boolean) pps_scaling_list_data_present_flag}. */
    public static void npps_scaling_list_data_present_flag(long struct, int value) { nbitfield0(struct, ((value << 19) & 0x00_08_00_00) | (nbitfield0(struct) & 0xFF_F7_FF_FF)); }
    /** Unsafe version of {@link #lists_modification_present_flag(boolean) lists_modification_present_flag}. */
    public static void nlists_modification_present_flag(long struct, int value) { nbitfield0(struct, ((value << 20) & 0x00_10_00_00) | (nbitfield0(struct) & 0xFF_EF_FF_FF)); }
    /** Unsafe version of {@link #slice_segment_header_extension_present_flag(boolean) slice_segment_header_extension_present_flag}. */
    public static void nslice_segment_header_extension_present_flag(long struct, int value) { nbitfield0(struct, ((value << 21) & 0x00_20_00_00) | (nbitfield0(struct) & 0xFF_DF_FF_FF)); }
    /** Unsafe version of {@link #pps_extension_present_flag(boolean) pps_extension_present_flag}. */
    public static void npps_extension_present_flag(long struct, int value) { nbitfield0(struct, ((value << 22) & 0x00_40_00_00) | (nbitfield0(struct) & 0xFF_BF_FF_FF)); }
    /** Unsafe version of {@link #cross_component_prediction_enabled_flag(boolean) cross_component_prediction_enabled_flag}. */
    public static void ncross_component_prediction_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 23) & 0x00_80_00_00) | (nbitfield0(struct) & 0xFF_7F_FF_FF)); }
    /** Unsafe version of {@link #chroma_qp_offset_list_enabled_flag(boolean) chroma_qp_offset_list_enabled_flag}. */
    public static void nchroma_qp_offset_list_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 24) & 0x01_00_00_00) | (nbitfield0(struct) & 0xFE_FF_FF_FF)); }
    /** Unsafe version of {@link #pps_curr_pic_ref_enabled_flag(boolean) pps_curr_pic_ref_enabled_flag}. */
    public static void npps_curr_pic_ref_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 25) & 0x02_00_00_00) | (nbitfield0(struct) & 0xFD_FF_FF_FF)); }
    /** Unsafe version of {@link #residual_adaptive_colour_transform_enabled_flag(boolean) residual_adaptive_colour_transform_enabled_flag}. */
    public static void nresidual_adaptive_colour_transform_enabled_flag(long struct, int value) { nbitfield0(struct, ((value << 26) & 0x04_00_00_00) | (nbitfield0(struct) & 0xFB_FF_FF_FF)); }
    /** Unsafe version of {@link #pps_slice_act_qp_offsets_present_flag(boolean) pps_slice_act_qp_offsets_present_flag}. */
    public static void npps_slice_act_qp_offsets_present_flag(long struct, int value) { nbitfield0(struct, ((value << 27) & 0x08_00_00_00) | (nbitfield0(struct) & 0xF7_FF_FF_FF)); }
    /** Unsafe version of {@link #pps_palette_predictor_initializer_present_flag(boolean) pps_palette_predictor_initializer_present_flag}. */
    public static void npps_palette_predictor_initializer_present_flag(long struct, int value) { nbitfield0(struct, ((value << 28) & 0x10_00_00_00) | (nbitfield0(struct) & 0xEF_FF_FF_FF)); }
    /** Unsafe version of {@link #monochrome_palette_flag(boolean) monochrome_palette_flag}. */
    public static void nmonochrome_palette_flag(long struct, int value) { nbitfield0(struct, ((value << 29) & 0x20_00_00_00) | (nbitfield0(struct) & 0xDF_FF_FF_FF)); }
    /** Unsafe version of {@link #pps_range_extension_flag(boolean) pps_range_extension_flag}. */
    public static void npps_range_extension_flag(long struct, int value) { nbitfield0(struct, ((value << 30) & 0x40_00_00_00) | (nbitfield0(struct) & 0xBF_FF_FF_FF)); }

    // -----------------------------------

    /** An array of {@link StdVideoH265PpsFlags} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265PpsFlags, Buffer> implements NativeResource {

        private static final StdVideoH265PpsFlags ELEMENT_FACTORY = StdVideoH265PpsFlags.create(-1L);

        /**
         * Creates a new {@code StdVideoH265PpsFlags.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265PpsFlags#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265PpsFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code dependent_slice_segments_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean dependent_slice_segments_enabled_flag() { return StdVideoH265PpsFlags.ndependent_slice_segments_enabled_flag(address()) != 0; }
        /** @return the value of the {@code output_flag_present_flag} field. */
        @NativeType("uint32_t")
        public boolean output_flag_present_flag() { return StdVideoH265PpsFlags.noutput_flag_present_flag(address()) != 0; }
        /** @return the value of the {@code sign_data_hiding_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean sign_data_hiding_enabled_flag() { return StdVideoH265PpsFlags.nsign_data_hiding_enabled_flag(address()) != 0; }
        /** @return the value of the {@code cabac_init_present_flag} field. */
        @NativeType("uint32_t")
        public boolean cabac_init_present_flag() { return StdVideoH265PpsFlags.ncabac_init_present_flag(address()) != 0; }
        /** @return the value of the {@code constrained_intra_pred_flag} field. */
        @NativeType("uint32_t")
        public boolean constrained_intra_pred_flag() { return StdVideoH265PpsFlags.nconstrained_intra_pred_flag(address()) != 0; }
        /** @return the value of the {@code transform_skip_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean transform_skip_enabled_flag() { return StdVideoH265PpsFlags.ntransform_skip_enabled_flag(address()) != 0; }
        /** @return the value of the {@code cu_qp_delta_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean cu_qp_delta_enabled_flag() { return StdVideoH265PpsFlags.ncu_qp_delta_enabled_flag(address()) != 0; }
        /** @return the value of the {@code pps_slice_chroma_qp_offsets_present_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_slice_chroma_qp_offsets_present_flag() { return StdVideoH265PpsFlags.npps_slice_chroma_qp_offsets_present_flag(address()) != 0; }
        /** @return the value of the {@code weighted_pred_flag} field. */
        @NativeType("uint32_t")
        public boolean weighted_pred_flag() { return StdVideoH265PpsFlags.nweighted_pred_flag(address()) != 0; }
        /** @return the value of the {@code weighted_bipred_flag} field. */
        @NativeType("uint32_t")
        public boolean weighted_bipred_flag() { return StdVideoH265PpsFlags.nweighted_bipred_flag(address()) != 0; }
        /** @return the value of the {@code transquant_bypass_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean transquant_bypass_enabled_flag() { return StdVideoH265PpsFlags.ntransquant_bypass_enabled_flag(address()) != 0; }
        /** @return the value of the {@code tiles_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean tiles_enabled_flag() { return StdVideoH265PpsFlags.ntiles_enabled_flag(address()) != 0; }
        /** @return the value of the {@code entropy_coding_sync_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean entropy_coding_sync_enabled_flag() { return StdVideoH265PpsFlags.nentropy_coding_sync_enabled_flag(address()) != 0; }
        /** @return the value of the {@code uniform_spacing_flag} field. */
        @NativeType("uint32_t")
        public boolean uniform_spacing_flag() { return StdVideoH265PpsFlags.nuniform_spacing_flag(address()) != 0; }
        /** @return the value of the {@code loop_filter_across_tiles_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean loop_filter_across_tiles_enabled_flag() { return StdVideoH265PpsFlags.nloop_filter_across_tiles_enabled_flag(address()) != 0; }
        /** @return the value of the {@code pps_loop_filter_across_slices_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_loop_filter_across_slices_enabled_flag() { return StdVideoH265PpsFlags.npps_loop_filter_across_slices_enabled_flag(address()) != 0; }
        /** @return the value of the {@code deblocking_filter_control_present_flag} field. */
        @NativeType("uint32_t")
        public boolean deblocking_filter_control_present_flag() { return StdVideoH265PpsFlags.ndeblocking_filter_control_present_flag(address()) != 0; }
        /** @return the value of the {@code deblocking_filter_override_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean deblocking_filter_override_enabled_flag() { return StdVideoH265PpsFlags.ndeblocking_filter_override_enabled_flag(address()) != 0; }
        /** @return the value of the {@code pps_deblocking_filter_disabled_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_deblocking_filter_disabled_flag() { return StdVideoH265PpsFlags.npps_deblocking_filter_disabled_flag(address()) != 0; }
        /** @return the value of the {@code pps_scaling_list_data_present_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_scaling_list_data_present_flag() { return StdVideoH265PpsFlags.npps_scaling_list_data_present_flag(address()) != 0; }
        /** @return the value of the {@code lists_modification_present_flag} field. */
        @NativeType("uint32_t")
        public boolean lists_modification_present_flag() { return StdVideoH265PpsFlags.nlists_modification_present_flag(address()) != 0; }
        /** @return the value of the {@code slice_segment_header_extension_present_flag} field. */
        @NativeType("uint32_t")
        public boolean slice_segment_header_extension_present_flag() { return StdVideoH265PpsFlags.nslice_segment_header_extension_present_flag(address()) != 0; }
        /** @return the value of the {@code pps_extension_present_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_extension_present_flag() { return StdVideoH265PpsFlags.npps_extension_present_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoH265PpsFlags#cross_component_prediction_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean cross_component_prediction_enabled_flag() { return StdVideoH265PpsFlags.ncross_component_prediction_enabled_flag(address()) != 0; }
        /** @return the value of the {@code chroma_qp_offset_list_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean chroma_qp_offset_list_enabled_flag() { return StdVideoH265PpsFlags.nchroma_qp_offset_list_enabled_flag(address()) != 0; }
        /** @return the value of the {@link StdVideoH265PpsFlags#pps_curr_pic_ref_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_curr_pic_ref_enabled_flag() { return StdVideoH265PpsFlags.npps_curr_pic_ref_enabled_flag(address()) != 0; }
        /** @return the value of the {@code residual_adaptive_colour_transform_enabled_flag} field. */
        @NativeType("uint32_t")
        public boolean residual_adaptive_colour_transform_enabled_flag() { return StdVideoH265PpsFlags.nresidual_adaptive_colour_transform_enabled_flag(address()) != 0; }
        /** @return the value of the {@code pps_slice_act_qp_offsets_present_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_slice_act_qp_offsets_present_flag() { return StdVideoH265PpsFlags.npps_slice_act_qp_offsets_present_flag(address()) != 0; }
        /** @return the value of the {@code pps_palette_predictor_initializer_present_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_palette_predictor_initializer_present_flag() { return StdVideoH265PpsFlags.npps_palette_predictor_initializer_present_flag(address()) != 0; }
        /** @return the value of the {@code monochrome_palette_flag} field. */
        @NativeType("uint32_t")
        public boolean monochrome_palette_flag() { return StdVideoH265PpsFlags.nmonochrome_palette_flag(address()) != 0; }
        /** @return the value of the {@code pps_range_extension_flag} field. */
        @NativeType("uint32_t")
        public boolean pps_range_extension_flag() { return StdVideoH265PpsFlags.npps_range_extension_flag(address()) != 0; }

        /** Sets the specified value to the {@code dependent_slice_segments_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer dependent_slice_segments_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ndependent_slice_segments_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code output_flag_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer output_flag_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.noutput_flag_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code sign_data_hiding_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer sign_data_hiding_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nsign_data_hiding_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cabac_init_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer cabac_init_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ncabac_init_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code constrained_intra_pred_flag} field. */
        public StdVideoH265PpsFlags.Buffer constrained_intra_pred_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nconstrained_intra_pred_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code transform_skip_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer transform_skip_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ntransform_skip_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cu_qp_delta_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer cu_qp_delta_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ncu_qp_delta_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pps_slice_chroma_qp_offsets_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_slice_chroma_qp_offsets_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_slice_chroma_qp_offsets_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code weighted_pred_flag} field. */
        public StdVideoH265PpsFlags.Buffer weighted_pred_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nweighted_pred_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code weighted_bipred_flag} field. */
        public StdVideoH265PpsFlags.Buffer weighted_bipred_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nweighted_bipred_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code transquant_bypass_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer transquant_bypass_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ntransquant_bypass_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tiles_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer tiles_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ntiles_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code entropy_coding_sync_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer entropy_coding_sync_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nentropy_coding_sync_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code uniform_spacing_flag} field. */
        public StdVideoH265PpsFlags.Buffer uniform_spacing_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nuniform_spacing_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code loop_filter_across_tiles_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer loop_filter_across_tiles_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nloop_filter_across_tiles_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pps_loop_filter_across_slices_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_loop_filter_across_slices_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_loop_filter_across_slices_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code deblocking_filter_control_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer deblocking_filter_control_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ndeblocking_filter_control_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code deblocking_filter_override_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer deblocking_filter_override_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ndeblocking_filter_override_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pps_deblocking_filter_disabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_deblocking_filter_disabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_deblocking_filter_disabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pps_scaling_list_data_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_scaling_list_data_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_scaling_list_data_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code lists_modification_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer lists_modification_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nlists_modification_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code slice_segment_header_extension_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer slice_segment_header_extension_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nslice_segment_header_extension_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pps_extension_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_extension_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_extension_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoH265PpsFlags#cross_component_prediction_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer cross_component_prediction_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.ncross_component_prediction_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code chroma_qp_offset_list_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer chroma_qp_offset_list_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nchroma_qp_offset_list_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link StdVideoH265PpsFlags#pps_curr_pic_ref_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_curr_pic_ref_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_curr_pic_ref_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code residual_adaptive_colour_transform_enabled_flag} field. */
        public StdVideoH265PpsFlags.Buffer residual_adaptive_colour_transform_enabled_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nresidual_adaptive_colour_transform_enabled_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pps_slice_act_qp_offsets_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_slice_act_qp_offsets_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_slice_act_qp_offsets_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pps_palette_predictor_initializer_present_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_palette_predictor_initializer_present_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_palette_predictor_initializer_present_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code monochrome_palette_flag} field. */
        public StdVideoH265PpsFlags.Buffer monochrome_palette_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.nmonochrome_palette_flag(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code pps_range_extension_flag} field. */
        public StdVideoH265PpsFlags.Buffer pps_range_extension_flag(@NativeType("uint32_t") boolean value) { StdVideoH265PpsFlags.npps_range_extension_flag(address(), value ? 1 : 0); return this; }

    }

}
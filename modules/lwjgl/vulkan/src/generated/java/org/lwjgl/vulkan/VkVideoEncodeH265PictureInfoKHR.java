/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.video.*;

/**
 * Structure specifies H.265 encode frame parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is specified in the {@code pNext} chain of the {@link VkVideoEncodeInfoKHR} structure passed to {@link KHRVideoEncodeQueue#vkCmdEncodeVideoKHR CmdEncodeVideoKHR} to specify the codec-specific picture information for an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265">H.265 encode operation</a>.</p>
 * 
 * <dl>
 * <dt>Encode Input Picture Information</dt>
 * <dd><ul>
 * <li>The image subregion used is determined according to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-picture-data-access">H.265 Encode Picture Data Access</a> section.</li>
 * <li>The encode input picture is associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-picture-info">H.265 picture information</a> provided in {@code pStdPictureInfo}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <dl>
 * <dt>Std Picture Information</dt>
 * <dd><ul>
 * <li>{@code flags.reserved} and {@code reserved1} are used only for padding purposes and are otherwise ignored;</li>
 * <li>{@code flags.is_reference} as defined in section 3.132 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code flags.IrapPicFlag} as defined in section 3.73 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code flags.used_for_long_term_reference} is used to indicate whether the picture is marked as “used for long-term reference” as defined in section 8.3.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code flags.discardable_flag} and {@code cross_layer_bla_flag} as defined in section F.7.4.7.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code pic_type} as defined in section 7.4.3.5 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code sps_video_parameter_set_id}, {@code pps_seq_parameter_set_id}, and {@code pps_pic_parameter_set_id} are used to identify the active parameter sets, as described below;</li>
 * <li>{@code PicOrderCntVal} as defined in section 8.3.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code TemporalId} as defined in section 7.4.2.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>if {@code pRefLists} is not {@code NULL}, then it is a pointer to a {@code StdVideoEncodeH265ReferenceListsInfo} structure that is interpreted as follows:
 * 
 * <ul>
 * <li>{@code flags.reserved} is used only for padding purposes and is otherwise ignored;</li>
 * <li>{@code ref_pic_list_modification_flag_l0} and {@code ref_pic_list_modification_flag_l1} as defined in section 7.4.7.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code num_ref_idx_l0_active_minus1} and {@code num_ref_idx_l1_active_minus1} as defined in section 7.4.7.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>{@code RefPicList0} and {@code RefPicList1} as defined in section 8.3.4 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a> where each element of these arrays either identifies an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-active-reference-picture-info">active reference picture</a> using its <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> index or contains the value {@code STD_VIDEO_H265_NO_REFERENCE_PICTURE} to indicate “no reference picture”;</li>
 * <li>{@code list_entry_l0} and {@code list_entry_l1} as defined in section 7.4.7.2 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>if {@code flags.short_term_ref_pic_set_sps_flag} is set, then the {@code StdVideoH265ShortTermRefPicSet} structure pointed to by {@code pShortTermRefPicSet} is interpreted as defined for the elements of the {@code pShortTermRefPicSet} array specified in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-sps">H.265 sequence parameter sets</a>.</li>
 * <li>if {@code flags.long_term_ref_pics_present_flag} is set in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-active-sps">active SPS</a>, then the {@code StdVideoEncodeH265LongTermRefPics} structure pointed to by {@code pLongTermRefPics} is interpreted as follows:
 * 
 * <ul>
 * <li>{@code used_by_curr_pic_lt_flag} is a bitmask where bit index <code>i</code> corresponds to {@code used_by_curr_pic_lt_flag[i]} as defined in section 7.4.7.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * <li>all other members of {@code StdVideoEncodeH265LongTermRefPics} are interpreted as defined in section 7.4.7.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>;</li>
 * </ul>
 * </li>
 * <li>all other members are interpreted as defined in section 7.4.7.1 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>.</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>Reference picture setup is controlled by the value of {@code StdVideoEncodeH265PictureInfo}{@code ::flags.is_reference}. If it is set and a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-reconstructed-picture-info">reconstructed picture</a> is specified, then the latter is used as the target of picture reconstruction to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">activate</a> the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> specified in {@code pEncodeInfo→pSetupReferenceSlot→slotIndex}. If {@code StdVideoEncodeH265PictureInfo}{@code ::flags.is_reference} is not set, but a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-reconstructed-picture-info">reconstructed picture</a> is specified, then the corresponding picture reference associated with the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot">DPB slot</a> is invalidated, as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#dpb-slot-states">DPB Slot States</a> section.</p>
 * 
 * <dl>
 * <dt>Active Parameter Sets</dt>
 * <dd><ul>
 * <li>The <em>active VPS</em> is the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-vps">VPS</a> identified by the key specified in {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id}.</li>
 * <li>The <em>active SPS</em> is the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-sps">SPS</a> identified by the key specified by the pair constructed from {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id} and {@code StdVideoEncodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}.</li>
 * <li>The <em>active PPS</em> is the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-pps">PPS</a> identified by the key specified by the triplet constructed from {@code StdVideoEncodeH265PictureInfo}{@code ::sps_video_parameter_set_id}, {@code StdVideoEncodeH265PictureInfo}{@code ::pps_seq_parameter_set_id}, and {@code StdVideoEncodeH265PictureInfo}{@code ::pps_pic_parameter_set_id}.</li>
 * </ul></dd>
 * </dl>
 * 
 * <p>H.265 encoding uses <em>explicit weighted sample prediction</em> for a slice segment, as defined in section 8.5.3.3.4 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>, if any of the following conditions are true for the active <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-pps">PPS</a> and the {@code pStdSliceSegmentHeader} member of the corresponding element of {@code pNaluSliceSegmentEntries}:</p>
 * 
 * <ul>
 * <li>{@code pStdSliceSegmentHeader→slice_type} is {@code STD_VIDEO_H265_SLICE_TYPE_P} and {@code weighted_pred_flag} is enabled in the active PPS.</li>
 * <li>{@code pStdSliceSegmentHeader→slice_type} is {@code STD_VIDEO_H265_SLICE_TYPE_B} and {@code weighted_bipred_flag} is enabled in the active PPS.</li>
 * </ul>
 * 
 * <p>The number of H.265 tiles, as defined in section 3.174 of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>, is derived from the {@code num_tile_columns_minus1} and {@code num_tile_rows_minus1} members of the active <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-pps">PPS</a> as follows:</p>
 * 
 * <dl>
 * <dd><code>(num_tile_columns_minus1 + 1) × (num_tile_rows_minus1 + 1)</code></dd>
 * </dl>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code naluSliceSegmentEntryCount} <b>must</b> be between 1 and {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::maxSliceSegmentCount}, inclusive, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile</li>
 * <li>If {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILES_PER_SLICE_SEGMENT_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILES_PER_SLICE_SEGMENT_BIT_KHR}, then {@code naluSliceSegmentEntryCount} <b>must</b> be greater than or equal to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-tile-count">number of H.265 tiles in the picture</a></li>
 * <li>If {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_SEGMENTS_PER_TILE_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_SEGMENTS_PER_TILE_BIT_KHR}, then {@code naluSliceSegmentEntryCount} <b>must</b> be less than or equal to the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-tile-count">number of H.265 tiles in the picture</a></li>
 * <li>If {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR} and the slice segment corresponding to any element of {@code pNaluSliceSegmentEntries} uses <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-weighted-pred">explicit weighted sample prediction</a>, then {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR}{@code ::pStdSliceSegmentHeader→pWeightTable} <b>must</b> not be {@code NULL} for that element of {@code pNaluSliceSegmentEntries}</li>
 * <li>If {@link VkVideoEncodeH265CapabilitiesKHR}{@code ::flags}, as returned by {@link KHRVideoQueue#vkGetPhysicalDeviceVideoCapabilitiesKHR GetPhysicalDeviceVideoCapabilitiesKHR} for the used video profile, does not include {@link KHRVideoEncodeH265#VK_VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_SEGMENT_TYPE_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_SEGMENT_TYPE_BIT_KHR}, then {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR}{@code ::pStdSliceSegmentHeader→slice_type} <b>must</b> be identical for all elements of {@code pNaluSliceSegmentEntries}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR}</li>
 * <li>{@code pNaluSliceSegmentEntries} <b>must</b> be a valid pointer to an array of {@code naluSliceSegmentEntryCount} valid {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR} structures</li>
 * <li>{@code pStdPictureInfo} <b>must</b> be a valid pointer to a valid {@code StdVideoEncodeH265PictureInfo} value</li>
 * <li>{@code naluSliceSegmentEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVideoEncodeH265NaluSliceSegmentInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265PictureInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #naluSliceSegmentEntryCount};
 *     {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR VkVideoEncodeH265NaluSliceSegmentInfoKHR} const * {@link #pNaluSliceSegmentEntries};
 *     {@link StdVideoEncodeH265PictureInfo StdVideoEncodeH265PictureInfo} const * {@link #pStdPictureInfo};
 * }</code></pre>
 */
public class VkVideoEncodeH265PictureInfoKHR extends Struct<VkVideoEncodeH265PictureInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NALUSLICESEGMENTENTRYCOUNT,
        PNALUSLICESEGMENTENTRIES,
        PSTDPICTUREINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NALUSLICESEGMENTENTRYCOUNT = layout.offsetof(2);
        PNALUSLICESEGMENTENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
    }

    protected VkVideoEncodeH265PictureInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265PictureInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265PictureInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265PictureInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265PictureInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of elements in {@code pNaluSliceSegmentEntries}. */
    @NativeType("uint32_t")
    public int naluSliceSegmentEntryCount() { return nnaluSliceSegmentEntryCount(address()); }
    /** a pointer to an array of {@code naluSliceSegmentEntryCount} {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR} structures specifying the parameters of the individual H.265 slice segments to encode for the input picture. */
    @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *")
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries() { return npNaluSliceSegmentEntries(address()); }
    /** a pointer to a {@code StdVideoEncodeH265PictureInfo} structure specifying <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#encode-h265-picture-info">H.265 picture information</a>. */
    @NativeType("StdVideoEncodeH265PictureInfo const *")
    public StdVideoEncodeH265PictureInfo pStdPictureInfo() { return npStdPictureInfo(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265PictureInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeH265PictureInfoKHR sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265PictureInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} to the {@link #pNaluSliceSegmentEntries} field. */
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *") VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) { npNaluSliceSegmentEntries(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeH265PictureInfo} to the {@link #pStdPictureInfo} field. */
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) { npStdPictureInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265PictureInfoKHR set(
        int sType,
        long pNext,
        VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries,
        StdVideoEncodeH265PictureInfo pStdPictureInfo
    ) {
        sType(sType);
        pNext(pNext);
        pNaluSliceSegmentEntries(pNaluSliceSegmentEntries);
        pStdPictureInfo(pStdPictureInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265PictureInfoKHR set(VkVideoEncodeH265PictureInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265PictureInfoKHR malloc() {
        return new VkVideoEncodeH265PictureInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265PictureInfoKHR calloc() {
        return new VkVideoEncodeH265PictureInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265PictureInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeH265PictureInfoKHR create(long address) {
        return new VkVideoEncodeH265PictureInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeH265PictureInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265PictureInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeH265PictureInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265PictureInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265PictureInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265PictureInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeH265PictureInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNEXT); }
    /** Unsafe version of {@link #naluSliceSegmentEntryCount}. */
    public static int nnaluSliceSegmentEntryCount(long struct) { return memGetInt(struct + VkVideoEncodeH265PictureInfoKHR.NALUSLICESEGMENTENTRYCOUNT); }
    /** Unsafe version of {@link #pNaluSliceSegmentEntries}. */
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer npNaluSliceSegmentEntries(long struct) { return VkVideoEncodeH265NaluSliceSegmentInfoKHR.create(memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNALUSLICESEGMENTENTRIES), nnaluSliceSegmentEntryCount(struct)); }
    /** Unsafe version of {@link #pStdPictureInfo}. */
    public static StdVideoEncodeH265PictureInfo npStdPictureInfo(long struct) { return StdVideoEncodeH265PictureInfo.create(memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PSTDPICTUREINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeH265PictureInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code naluSliceSegmentEntryCount} field of the specified {@code struct}. */
    public static void nnaluSliceSegmentEntryCount(long struct, int value) { memPutInt(struct + VkVideoEncodeH265PictureInfoKHR.NALUSLICESEGMENTENTRYCOUNT, value); }
    /** Unsafe version of {@link #pNaluSliceSegmentEntries(VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer) pNaluSliceSegmentEntries}. */
    public static void npNaluSliceSegmentEntries(long struct, VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNALUSLICESEGMENTENTRIES, value.address()); nnaluSliceSegmentEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #pStdPictureInfo(StdVideoEncodeH265PictureInfo) pStdPictureInfo}. */
    public static void npStdPictureInfo(long struct, StdVideoEncodeH265PictureInfo value) { memPutAddress(struct + VkVideoEncodeH265PictureInfoKHR.PSTDPICTUREINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int naluSliceSegmentEntryCount = nnaluSliceSegmentEntryCount(struct);
        long pNaluSliceSegmentEntries = memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PNALUSLICESEGMENTENTRIES);
        check(pNaluSliceSegmentEntries);
        validate(pNaluSliceSegmentEntries, naluSliceSegmentEntryCount, VkVideoEncodeH265NaluSliceSegmentInfoKHR.SIZEOF, VkVideoEncodeH265NaluSliceSegmentInfoKHR::validate);
        long pStdPictureInfo = memGetAddress(struct + VkVideoEncodeH265PictureInfoKHR.PSTDPICTUREINFO);
        check(pStdPictureInfo);
        StdVideoEncodeH265PictureInfo.validate(pStdPictureInfo);
    }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265PictureInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265PictureInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265PictureInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265PictureInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265PictureInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeH265PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265PictureInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265PictureInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265PictureInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265PictureInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265PictureInfoKHR#naluSliceSegmentEntryCount} field. */
        @NativeType("uint32_t")
        public int naluSliceSegmentEntryCount() { return VkVideoEncodeH265PictureInfoKHR.nnaluSliceSegmentEntryCount(address()); }
        /** @return a {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} view of the struct array pointed to by the {@link VkVideoEncodeH265PictureInfoKHR#pNaluSliceSegmentEntries} field. */
        @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *")
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer pNaluSliceSegmentEntries() { return VkVideoEncodeH265PictureInfoKHR.npNaluSliceSegmentEntries(address()); }
        /** @return a {@link StdVideoEncodeH265PictureInfo} view of the struct pointed to by the {@link VkVideoEncodeH265PictureInfoKHR#pStdPictureInfo} field. */
        @NativeType("StdVideoEncodeH265PictureInfo const *")
        public StdVideoEncodeH265PictureInfo pStdPictureInfo() { return VkVideoEncodeH265PictureInfoKHR.npStdPictureInfo(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265PictureInfoKHR#sType} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265PictureInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR} value to the {@link VkVideoEncodeH265PictureInfoKHR#sType} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeH265PictureInfoKHR#pNext} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265PictureInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer} to the {@link VkVideoEncodeH265PictureInfoKHR#pNaluSliceSegmentEntries} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoKHR const *") VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer value) { VkVideoEncodeH265PictureInfoKHR.npNaluSliceSegmentEntries(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeH265PictureInfo} to the {@link VkVideoEncodeH265PictureInfoKHR#pStdPictureInfo} field. */
        public VkVideoEncodeH265PictureInfoKHR.Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) { VkVideoEncodeH265PictureInfoKHR.npStdPictureInfo(address(), value); return this; }

    }

}